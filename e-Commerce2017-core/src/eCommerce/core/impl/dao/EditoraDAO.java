package eCommerce.core.impl.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import eCommerce.core.utils.SqlBuilder;
import eCommerce.dominio.Editora;
import eCommerce.dominio.EntidadeDominio;

public class EditoraDAO extends AbstractJdbcDAO {
	
	public EditoraDAO(){
		super("tb_editora");
	}

	public EditoraDAO(Connection conexao ){
		super(conexao, "tb_editora");
	}
	
	@Override
	public void salvar_pre(EntidadeDominio entidade) throws SQLException {
	}

	@Override
	public void salvar_pos(EntidadeDominio entidade) throws SQLException {
	}

	@Override
	public List<EntidadeDominio> consultar(EntidadeDominio entidade) throws SQLException {
		PreparedStatement pst = null;
		
		Editora editora = (Editora)entidade;
		SqlBuilder sb = new SqlBuilder(this.table, colunas);
	    Map<Integer,Object> hsWhere = new HashMap<Integer,Object>();
		Integer lni = 1;

		try {
			openConnection();
			
		    if ( editora != null ){
		    	if ( editora.getId() != null && editora.getId() > 0 ) {
		    		sb.addWhere("id = ?" );
		    		hsWhere.put(lni, editora.getId());
		    		lni++;
		    	}
		    	
		    	if ( editora.getNome() != null && editora.getNome().length() > 0 ) {
		    		sb.addWhere("nome = ?");
		    		hsWhere.put(lni, "%" + editora.getNome() + "%");
		    		lni++;
		    	}
			}
	    
			pst = connection.prepareStatement(sb.getQuery(null));
		
		    for (Map.Entry<Integer, Object> entry : hsWhere.entrySet())
		    {
		    	pst.setObject(entry.getKey(), entry.getValue());
		    }
			
			ResultSet rs = pst.executeQuery();
			List<EntidadeDominio> editoras = new ArrayList<EntidadeDominio>();
			while (rs.next()) {
				Editora e = new Editora();
				e.setId(rs.getInt("id"));
				e.setNome(rs.getString("nome"));
				
				java.sql.Date dtCadastroEmLong = rs.getDate("dtcadastro");
				if( dtCadastroEmLong != null ) {
					Date dtCadastro = new Date(dtCadastroEmLong.getTime());				
					e.setDtCadastro(dtCadastro);
				}
				editoras.add(e);
			}
			return editoras;
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return null;
	}

	@Override
	public Integer setPreparedStatement(EntidadeDominio entidade, PreparedStatement pst, Integer nPst) {
		Editora e = (Editora)entidade;
		try {
			pst.setString(nPst, e.getNome());
			nPst++;
		} catch (SQLException x) {
			x.printStackTrace();
		}
		return nPst;
	}


	@Override
	public Integer setPreparedStatementOnlyUpdate(EntidadeDominio entidade, PreparedStatement pst, Integer nPst) {
		return nPst;
	}

	@Override
	public void initColumns() {
		addColunas( 0 , "nome" );
	}

	@Override
	public EntidadeDominio consulta_id(EntidadeDominio entidade) throws SQLException {
		PreparedStatement pst = null;
		
		Editora editora = (Editora)entidade;
		SqlBuilder sb = new SqlBuilder(this.table, colunas);
	    Map<Integer,Object> hsWhere = new HashMap<Integer,Object>();
		Integer lni = 1;

		try {
			openConnection();
			
    		sb.addWhere("id = ?" );
    		hsWhere.put(lni, editora.getId());
    		lni++;
	    
			pst = connection.prepareStatement(sb.getQuery(null));
		
		    for (Map.Entry<Integer, Object> entry : hsWhere.entrySet())
		    {
		    	pst.setObject(entry.getKey(), entry.getValue());
		    }
			
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				Editora e = new Editora();
				e.setId(rs.getInt("id"));
				e.setNome(rs.getString("nome"));
				
				java.sql.Date dtCadastroEmLong = rs.getDate("dtcadastro");
				if( dtCadastroEmLong != null ) {
					Date dtCadastro = new Date(dtCadastroEmLong.getTime());				
					e.setDtCadastro(dtCadastro);
				}
				return e;
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return null;
	}

}
