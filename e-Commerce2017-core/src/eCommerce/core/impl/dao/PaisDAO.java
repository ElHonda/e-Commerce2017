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
import eCommerce.dominio.Pais;

public class PaisDAO extends AbstractJdbcDAO{

	public PaisDAO(){
		super( "tb_pais" );
	}

	public PaisDAO( Connection conexao ){
		super( conexao, "tb_pais" );
	}
	
	@Override
	public List<EntidadeDominio> consultar(EntidadeDominio entidade) throws SQLException {
		PreparedStatement pst = null;
		
		Pais pais = (Pais)entidade;
		SqlBuilder sb = new SqlBuilder(this.table, colunas);
	    Map<Integer,Object> hsWhere = new HashMap<Integer,Object>();
		Integer lni = 1;

		try {
			openConnection();
			
		    if ( pais != null ){
		    	if ( pais.getId() != null && pais.getId() > 0 ) {
		    		sb.addWhere("id = ?" );
		    		hsWhere.put(lni, pais.getId());
		    		lni++;
		    	}
		    	
		    	if ( pais.getNome() != null && pais.getNome().length() > 0 ) {
		    		sb.addWhere("nome = ?");
		    		hsWhere.put(lni, "%" + pais.getNome() + "%");
		    		lni++;
		    	}
		    	
		    	if ( pais.getAlphacode() != null && pais.getAlphacode().length() > 0 ) {
		    		sb.addWhere("alphacode = ?" );
		    		hsWhere.put(lni, pais.getAlphacode() );
		    		lni++;
		    	}
		    	
		    	if( pais.getAtivo() != null ) {
		    		if( pais.getAtivo() ) {
		    			sb.addWhere("ativo");
		    		}else {
		    			sb.addWhere("not ativo");
		    		}
		    	}
			}
	    
			pst = connection.prepareStatement(sb.getQuery(null));
		
		    for (Map.Entry<Integer, Object> entry : hsWhere.entrySet())
		    {
		    	pst.setObject(entry.getKey(), entry.getValue());
		    }
			
			ResultSet rs = pst.executeQuery();
			List<EntidadeDominio> paises = new ArrayList<EntidadeDominio>();
			while (rs.next()) {
				Pais p = new Pais();
				p.setId(rs.getInt("id"));
				p.setNome(rs.getString("nome"));
				p.setAlphacode(rs.getString("alphacode"));
				p.setAtivo(rs.getBoolean("ativo"));				
				
				java.sql.Date dtCadastroEmLong = rs.getDate("dtcadastro");
				Date dtCadastro = new Date(dtCadastroEmLong.getTime());				
				p.setDtCadastro(dtCadastro);
				paises.add(p);
			}
			return paises;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public Integer setPreparedStatement(EntidadeDominio entidade, PreparedStatement pst, Integer nPst) {
		Pais pais = (Pais)entidade;
		try {
			pst.setInt( nPst , pais.getId() );
			nPst++;
			pst.setString( nPst , pais.getNome() );
			nPst++;
			pst.setString( nPst , pais.getAlphacode() );
			nPst++;
			pst.setBoolean( nPst, pais.getAtivo() );
			nPst++;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return nPst;
	}

	@Override
	public void initColumns() {
		addColunas( 0 , "id"        );
		addColunas( 1 , "nome" 	    );
		addColunas( 2 , "alphacode" );
		addColunas( 4 , "ativo"     );
	}

	@Override
	public EntidadeDominio consultar_id(EntidadeDominio entidade) throws SQLException {
	PreparedStatement pst = null;
		
		Pais pais = (Pais)entidade;
		SqlBuilder sb = new SqlBuilder(this.table, colunas);
	    Map<Integer,Object> hsWhere = new HashMap<Integer,Object>();
		Integer lni = 1;

		try {
			openConnection();
			
    		sb.addWhere("id = ?" );
    		hsWhere.put(lni, pais.getId());
    		lni++;

			pst = connection.prepareStatement(sb.getQuery(null));
		
		    for (Map.Entry<Integer, Object> entry : hsWhere.entrySet())
		    {
		    	pst.setObject(entry.getKey(), entry.getValue());
		    }
			
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				Pais p = new Pais();
				p.setId(rs.getInt("id"));
				p.setNome(rs.getString("nome"));
				p.setAlphacode(rs.getString("alphacode"));
				p.setAtivo(rs.getBoolean("ativo"));				
				
				java.sql.Date dtCadastroEmLong = rs.getDate("dtcadastro");
				Date dtCadastro = new Date(dtCadastroEmLong.getTime());				
				p.setDtCadastro(dtCadastro);
				return p;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}


}
