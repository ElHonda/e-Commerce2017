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
import eCommerce.dominio.EntidadeDominio;
import eCommerce.dominio.SubCategoria;

public class SubCategoriaDAO extends AbstractJdbcDAO{

	
	public SubCategoriaDAO(){
		super("tb_subcategoria");
	}

	public SubCategoriaDAO(Connection conexao ){
		super(conexao, "tb_subcategoria");
	}
	
	@Override
	public void initColumns() {
		addColunas( 0 , "descricao" );
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
		
		SubCategoria subcategoria = (SubCategoria)entidade;
		SqlBuilder sb = new SqlBuilder(this.table, colunas);
	    Map<Integer,Object> hsWhere = new HashMap<Integer,Object>();
		Integer lni = 1;

		try {
			openConnection();
			
		    if ( subcategoria != null ){
		    	if ( subcategoria.getId() != null && subcategoria.getId() > 0 ) {
		    		sb.addWhere("id = ?" );
		    		hsWhere.put(lni, subcategoria.getId());
		    		lni++;
		    	}
		    	
		    	if ( subcategoria.getDescricao() != null && subcategoria.getDescricao().length() > 0 ) {
		    		sb.addWhere("descricao = ?");
		    		hsWhere.put(lni, "%" + subcategoria.getDescricao() + "%");
		    		lni++;
		    	}
			}
	    
			pst = connection.prepareStatement(sb.getQuery(null));
		
		    for (Map.Entry<Integer, Object> entry : hsWhere.entrySet())
		    {
		    	pst.setObject(entry.getKey(), entry.getValue());
		    }
			
			ResultSet rs = pst.executeQuery();
			List<EntidadeDominio> subcategorias = new ArrayList<EntidadeDominio>();
			while (rs.next()) {
				SubCategoria sc = new SubCategoria();
				sc.setId(rs.getInt("id"));
				sc.setDescricao(rs.getString("descricao"));
				
				java.sql.Date dtCadastroEmLong = rs.getDate("dtcadastro");
				if( dtCadastroEmLong != null ) {
					Date dtCadastro = new Date(dtCadastroEmLong.getTime());				
					sc.setDtCadastro(dtCadastro);
				}
				subcategorias.add(sc);
			}
			return subcategorias;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Integer setPreparedStatement(EntidadeDominio entidade, PreparedStatement pst, Integer nPst) {
		SubCategoria c = (SubCategoria)entidade;
		try {
			pst.setString(nPst, c.getDescricao() );
			nPst++;
		}catch( SQLException e ) {
			e.printStackTrace();
		}
		return nPst;
	}

	@Override
	public Integer setPreparedStatementOnlyUpdate(EntidadeDominio entidade, PreparedStatement pst, Integer nPst) {
		return nPst;
	}

	@Override
	public EntidadeDominio consulta_id(EntidadeDominio entidade) throws SQLException {
		PreparedStatement pst = null;
		
		SubCategoria subcategoria = (SubCategoria)entidade;
		SqlBuilder sb = new SqlBuilder(this.table, colunas);
	    Map<Integer,Object> hsWhere = new HashMap<Integer,Object>();
		Integer lni = 1;

		try {
			openConnection();
			
    		sb.addWhere("id = ?" );
    		hsWhere.put(lni, subcategoria.getId());
    		lni++;

			pst = connection.prepareStatement(sb.getQuery(null));
		
		    for (Map.Entry<Integer, Object> entry : hsWhere.entrySet())
		    {
		    	pst.setObject(entry.getKey(), entry.getValue());
		    }
			
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				SubCategoria sc = new SubCategoria();
				sc.setId(rs.getInt("id"));
				sc.setDescricao(rs.getString("descricao"));
				
				java.sql.Date dtCadastroEmLong = rs.getDate("dtcadastro");
				if( dtCadastroEmLong != null ) {
					Date dtCadastro = new Date(dtCadastroEmLong.getTime());				
					sc.setDtCadastro(dtCadastro);
				}
				return sc;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
