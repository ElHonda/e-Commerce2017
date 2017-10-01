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
import eCommerce.dominio.Categoria;
import eCommerce.dominio.EntidadeDominio;

public class CategoriaDAO extends AbstractJdbcDAO{

	
	public CategoriaDAO(){
		super("tb_categoria");
	}

	public CategoriaDAO(Connection conexao ){
		super(conexao, "tb_categoria");
	}
	
	@Override
	public void initColumns() {
		addColunas( 0 , "descricao" );
	}

	@Override
	public List<EntidadeDominio> consultar(EntidadeDominio entidade) throws SQLException {
		PreparedStatement pst = null;
		
		Categoria categoria = (Categoria)entidade;
		SqlBuilder sb = new SqlBuilder(this.table, colunas);
	    Map<Integer,Object> hsWhere = new HashMap<Integer,Object>();
		Integer lni = 1;

		try {
			openConnection();
			
		    if ( categoria != null ){
		    	if ( categoria.getId() != null && categoria.getId() > 0 ) {
		    		sb.addWhere("id = ?" );
		    		hsWhere.put(lni, categoria.getId());
		    		lni++;
		    	}
		    	
		    	if ( categoria.getDescricao() != null && categoria.getDescricao().length() > 0 ) {
		    		sb.addWhere("descricao like ?");
		    		hsWhere.put(lni, "%" + categoria.getDescricao() + "%");
		    		lni++;
		    	}
			}
	    
			pst = connection.prepareStatement(sb.getQuery(null));
		
		    for (Map.Entry<Integer, Object> entry : hsWhere.entrySet())
		    {
		    	pst.setObject(entry.getKey(), entry.getValue());
		    }
			
			ResultSet rs = pst.executeQuery();
			List<EntidadeDominio> categorias = new ArrayList<EntidadeDominio>();
			while (rs.next()) {
				Categoria c = new Categoria();
				c.setId(rs.getInt("id"));
				c.setDescricao(rs.getString("descricao"));
				
				java.sql.Date dtCadastroEmLong = rs.getDate("dtcadastro");
				if( dtCadastroEmLong != null ) {
					Date dtCadastro = new Date(dtCadastroEmLong.getTime());				
					c.setDtCadastro(dtCadastro);
				}
				categorias.add(c);
			}
			return categorias;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Integer setPreparedStatement(EntidadeDominio entidade, PreparedStatement pst, Integer nPst) {
		Categoria c = (Categoria)entidade;
		try {
			pst.setString(nPst, c.getDescricao() );
			nPst++;
		}catch( SQLException e ) {
			e.printStackTrace();
		}
		return nPst;
	}
	@Override
	public EntidadeDominio consultar_id(EntidadeDominio entidade) throws SQLException {
		PreparedStatement pst = null;
		
		Categoria categoria = (Categoria)entidade;
		SqlBuilder sb = new SqlBuilder(this.table, colunas);
	    Map<Integer,Object> hsWhere = new HashMap<Integer,Object>();
		Integer lni = 1;

		try {
			openConnection();

    		sb.addWhere("id = ?" );
    		hsWhere.put(lni, categoria.getId());
    		lni++;

			pst = connection.prepareStatement(sb.getQuery(null));
		
		    for (Map.Entry<Integer, Object> entry : hsWhere.entrySet())
		    {
		    	pst.setObject(entry.getKey(), entry.getValue());
		    }
			
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				Categoria c = new Categoria();
				c.setId(rs.getInt("id"));
				c.setDescricao(rs.getString("descricao"));
				
				java.sql.Date dtCadastroEmLong = rs.getDate("dtcadastro");
				if( dtCadastroEmLong != null ) {
					Date dtCadastro = new Date(dtCadastroEmLong.getTime());				
					c.setDtCadastro(dtCadastro);
				}
				return c;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
