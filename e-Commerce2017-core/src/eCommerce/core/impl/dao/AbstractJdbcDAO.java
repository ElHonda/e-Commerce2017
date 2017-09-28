
package eCommerce.core.impl.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import eCommerce.core.IDAO;
import eCommerce.core.utils.Conexao;
import eCommerce.core.utils.SqlBuilder;
import eCommerce.dominio.EntidadeDominio;

/*
 * TODO ainda não preparada para classes com chave composta
 * */
public abstract class AbstractJdbcDAO implements IDAO{
	protected List<String> colunas;
	protected List<String> pks;
	protected Connection connection;
	protected String table;
	protected boolean ctrlTransaction=true;
	protected boolean registraDtCadastro=true;
	protected boolean autogeneratekey=true;
	/**
	 * Construção do objeto com id da tabela padrão: "ID" com envio de conexão
	 * @param connection Conexão a ser adotada
	 * @param table Nome da tabela
	 */
	public AbstractJdbcDAO( Connection connection, String table ){
		this.ctrlTransaction = false;
		this.table = table;
		this.connection = connection;
		this.pks = new ArrayList<String>();
		this.pks.add( "id" );
		initColumns();
	}
	/**
	 * Construção do objeto com id da tabela padrão: "ID" sem envio de conexão
	 * @param table Nome da tabela
	 */
	protected AbstractJdbcDAO(String table){
		this.table = table;
		this.pks = new ArrayList<String>();
		this.pks.add("id" );
		initColumns();
	}
	/**
	 * @param connection Conexão a ser adotada
	 * @param table Nome da tabela
	 * @param pk Lista de chaves para quando chave composta
	 */
	public AbstractJdbcDAO( Connection connection, String table , List<String> pk ){
		this.ctrlTransaction = false;
		this.table = table;
		this.connection = connection;
		this.pks = pk;
		initColumns();
	}
	/**
	 * @param table Nome da tabela
	 * @param pk Lista de chaves para quando chave composta
	 */
	protected AbstractJdbcDAO(String table, List<String> pk){
		this.table = table;
		this.pks = pk;
		initColumns();
	}
	protected Connection openConnection(){
		Connection conn = null;
		try {
			if(connection == null || connection.isClosed())
				connection = Conexao.getConnection();
			else
				conn = connection;
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	@Override
	public void excluir(EntidadeDominio entidade){
	    openConnection();
		PreparedStatement pst=null;
		Integer nPst = 1 ;
		SqlBuilder sb = new SqlBuilder( this.table, this.colunas, this.pks );

		try {
			connection.setAutoCommit(false);
			pst = connection.prepareStatement(sb.getSqlDelete());
			pst.setObject(nPst, entidade.getId() );
			pst.executeUpdate();
			connection.commit();
		} catch (SQLException e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();			
		}finally{
			
			try {
				pst.close();
				if(ctrlTransaction)
					connection.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public void salvar(EntidadeDominio entidade) {
		openConnection();
		PreparedStatement pst=null;
		Integer nPst = 1;
		List<String> colunasInsert = new ArrayList<String>();
		colunasInsert.addAll(getColunas());
		if ( isRegistraDtCadastro() )
			colunasInsert.add( "dtcadastro" );

		try {
			salvar_pre(entidade);
			connection.setAutoCommit(false);	
			SqlBuilder sql = new SqlBuilder(this.table, colunasInsert);
			
			if( isAutogeneratekey() )
				pst = connection.prepareStatement(sql.getSqlInsert(), Statement.RETURN_GENERATED_KEYS );
			else
				pst = connection.prepareStatement(sql.getSqlInsert());

			nPst = setPreparedStatement( entidade , pst , nPst);
			nPst = setPreparedStatementOnlyInsert(entidade, pst , nPst);
			pst.executeUpdate();
			
			if( isAutogeneratekey() ) {
				ResultSet rs = pst.getGeneratedKeys();
				int id=0;
			
				if( rs.next() )
					id = rs.getInt(1);
				entidade.setId(id);
			}
			salvar_pos(entidade);
			connection.commit();
		} catch (SQLException e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();			
		}finally{
			try {
				pst.close();
				if( ctrlTransaction )
					connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public void alterar(EntidadeDominio entidade) {
		openConnection();
		PreparedStatement pst=null;
		Integer nPst = 1;
		try {
			connection.setAutoCommit(false);	
			SqlBuilder sql = new SqlBuilder(this.table, this.colunas);
			pst = connection.prepareStatement(sql.getSqlUpdate());

			nPst = setPreparedStatement( entidade , pst, nPst);
			nPst = setPreparedStatementOnlyUpdate(entidade, pst , nPst);
			pst.executeUpdate();
			connection.commit();
		} catch (SQLException e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();			
		}finally{
			try {
				pst.close();
				if( ctrlTransaction )
					connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public boolean isRegistraDtCadastro() {
		return registraDtCadastro;
	}
	public void setRegistraDtCadastro(boolean RegistraDtCadastro) {
		this.registraDtCadastro = RegistraDtCadastro;
	}
	public boolean isAutogeneratekey() {
		return autogeneratekey;
	}
	public void setAutogeneratekey(boolean autogeneratekey) {
		this.autogeneratekey = autogeneratekey;
	}
	public List<String> getColunas() {
		return colunas;
	}
	public void addColunas( String coluna ) {
		if( colunas == null ) {
			colunas = new ArrayList<String>();
		}
		colunas.add( coluna );
	}
	public void addColunas( Integer index , String coluna) {
		if( colunas == null ) {
			colunas = new ArrayList<String>();
		}
		colunas.add( index , coluna );
	}

	public Integer setPreparedStatementOnlyInsert(EntidadeDominio entidade, PreparedStatement pst, Integer nPst) {
		if ( isRegistraDtCadastro() ) {
			try {
				Timestamp time = null;
				if( entidade.getDtCadastro() != null )
					time =  new Timestamp(entidade.getDtCadastro().getTime());
	
				pst.setTimestamp(nPst, time);
				nPst++;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return nPst;
	}

}
