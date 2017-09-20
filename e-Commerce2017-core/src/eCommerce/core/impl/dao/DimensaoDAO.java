package eCommerce.core.impl.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import eCommerce.dominio.Dimensao;
import eCommerce.dominio.EntidadeDominio;

public class DimensaoDAO extends AbstractJdbcDAO{

	
	public DimensaoDAO(){
		super("tb_dimensao");
	}

	public DimensaoDAO(Connection conexao ){
		super(conexao, "tb_dimensao");
	}
	
	
	@Override
	public void initColumns() {
		// TODO Auto-generated method stub
		addColunas("altura"				 );
		addColunas("largura"			 );
		addColunas("peso"				 );
		addColunas("profundidade"		 );
		addColunas("dimensionavel_id"	 );
		addColunas("dimensionavel_class" );
	}

	@Override
	public void salvar_pre(EntidadeDominio entidade) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void salvar_pos(EntidadeDominio entidade) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<EntidadeDominio> consultar(EntidadeDominio entidade) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer setPreparedStatement(EntidadeDominio entidade, PreparedStatement pst, Integer nPst) {
		Dimensao dimensao = (Dimensao)entidade;
		try {
			pst.setDouble(nPst, dimensao.getAltura() );
			nPst++;
			pst.setDouble(nPst, dimensao.getLargura());
			nPst++;
			pst.setDouble(nPst, dimensao.getPeso());
			nPst++;
			pst.setDouble(nPst, dimensao.getProfundidade());
			nPst++;
			pst.setInt(nPst, dimensao.getDimensionavel().getId());
			nPst++;
			pst.setString(nPst, dimensao.getDimensionavel().getClass().getName() );
			nPst++;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		return nPst;
	}

	@Override
	public Integer setPreparedStatementOnlyUpdate(EntidadeDominio entidade, PreparedStatement pst, Integer nPst) {
		// TODO Auto-generated method stub
		return nPst;
	}

}
