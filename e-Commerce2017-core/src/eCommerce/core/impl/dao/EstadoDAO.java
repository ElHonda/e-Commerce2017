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
import eCommerce.dominio.Estado;
import eCommerce.dominio.Pais;

public class EstadoDAO extends AbstractJdbcDAO {
	public EstadoDAO(Connection conexao) {
		super( conexao, "tb_estado" );
	}
	
	public EstadoDAO() {
		super( "tb_estado" );
	}

	@Override
	public List<EntidadeDominio> consultar(EntidadeDominio entidade) throws SQLException {
		PreparedStatement pst = null;
		
		Estado estado = (Estado)entidade;
		SqlBuilder sb = new SqlBuilder(this.table, colunas);
	    Map<Integer,Object> hsWhere = new HashMap<Integer,Object>();
		Integer lni = 1;

		try {
			openConnection();
			
		    if ( estado != null ){
		    	if ( estado.getId() != null && estado.getId() > 0 ) {
		    		sb.addWhere("id = ?" );
		    		hsWhere.put(lni, estado.getId());
		    		lni++;
		    	}
		    	
		    	if ( estado.getNome() != null && estado.getNome().length() > 0 ) {
		    		sb.addWhere("nome = ?");
		    		hsWhere.put(lni, "%" + estado.getNome() + "%");
		    		lni++;
		    	}
		    	
		    	if ( estado.getPais() != null && estado.getPais().getId() > 0 ) {
		    		sb.addWhere("pais_id = ?" );
		    		hsWhere.put(lni, estado.getPais().getId() );
		    		lni++;
		    	}
		    	
		    	if( estado.getAtivo() != null ) {
		    		if( estado.getAtivo() ) {
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
			List<EntidadeDominio> estados = new ArrayList<EntidadeDominio>();
			while (rs.next()) {
				Estado e = new Estado();
				e.setId(rs.getInt("id"));
				e.setNome(rs.getString("nome"));
				
				PaisDAO eDao = new PaisDAO(connection);
				Pais p = new Pais();
				p.setId(rs.getInt("pais_id"));
				List<EntidadeDominio> paises = eDao.consultar(p);
				e.setPais( (Pais)paises.get(0) );
		
				java.sql.Date dtCadastroEmLong = rs.getDate("dtcadastro");
				Date dtCadastro = new Date(dtCadastroEmLong.getTime());				
				e.setDtCadastro(dtCadastro);
				estados.add(e);
			}
			return estados;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Integer setPreparedStatement(EntidadeDominio entidade, PreparedStatement pst, Integer nPst) {
		Estado estado = (Estado)entidade;
		try {
			pst.setInt( nPst , estado.getId() );
			nPst++;
			pst.setString( nPst , estado.getNome() );
			nPst++;
			pst.setInt( nPst , estado.getPais().getId() );
			nPst++;
			pst.setBoolean(nPst, estado.getAtivo());
			nPst++;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return nPst;
	}

	@Override
	public void initColumns() {
		addColunas( 0 , "id"      );
		addColunas( 1 , "nome"    );
		addColunas( 2 , "pais_id" );
		addColunas( 3 , "ativo" );
	}

	@Override
	public EntidadeDominio consultar_id(EntidadeDominio entidade) throws SQLException {
		return null;
	}

}
