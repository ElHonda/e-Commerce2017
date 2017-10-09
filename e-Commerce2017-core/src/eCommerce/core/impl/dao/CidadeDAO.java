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
import eCommerce.dominio.Cidade;
import eCommerce.dominio.EntidadeDominio;
import eCommerce.dominio.Estado;

public class CidadeDAO extends AbstractJdbcDAO {

	public CidadeDAO() {
		super("tb_cidade");
	}

	public CidadeDAO(Connection conexao ){
		super(conexao, "tb_cidade");
	}
	
	@Override
	public List<EntidadeDominio> consultar(EntidadeDominio entidade) throws SQLException {
		PreparedStatement pst = null;
		
		Cidade cidade = (Cidade)entidade;
		SqlBuilder sb = new SqlBuilder(this.table, colunas);
	    Map<Integer,Object> hsWhere = new HashMap<Integer,Object>();
		Integer lni = 1;

		try {
			openConnection();
			
		    if ( cidade != null ){
		    	if ( cidade.getId() != null && cidade.getId() > 0 ) {
		    		sb.addWhere("id = ?" );
		    		hsWhere.put(lni, cidade.getId());
		    		lni++;
		    	}
		    	
		    	if ( cidade.getNome() != null && cidade.getNome().length() > 0 ) {
		    		sb.addWhere("nome like ?");
		    		hsWhere.put(lni, "%" + cidade.getNome() + "%");
		    		lni++;
		    	}
		    	
		    	if ( cidade.getEstado() != null && cidade.getEstado().getId() > 0 ) {
		    		sb.addWhere("estado_id = ?" );
		    		hsWhere.put(lni, cidade.getEstado().getId() );
		    		lni++;
		    	}
		    	if( cidade.getAtivo() != null ) {
		    		if( cidade.getAtivo() ) {
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
			List<EntidadeDominio> cidades = new ArrayList<EntidadeDominio>();
			while (rs.next()) {
				Cidade c = new Cidade();
				c.setId(rs.getInt("id"));
				c.setNome(rs.getString("nome"));
				c.setAtivo(rs.getBoolean("ativo"));				

				EstadoDAO eDao = new EstadoDAO(connection);
				Estado estado = new Estado();
				estado.setId(rs.getInt("estado_id"));
				List<EntidadeDominio> estados = eDao.consultar(estado);
				c.setEstado( (Estado)estados.get(0) );
		
				java.sql.Date dtCadastroEmLong = rs.getDate("dtcadastro");
				Date dtCadastro = new Date(dtCadastroEmLong.getTime());				
				c.setDtCadastro(dtCadastro);
				cidades.add(c);
			}
			return cidades;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Integer setPreparedStatement(EntidadeDominio entidade, PreparedStatement pst, Integer nPst) {
		Cidade cidade = (Cidade)entidade;
		try {
			pst.setInt( nPst , cidade.getId() );
			nPst++;
			pst.setString( nPst , cidade.getNome() );
			nPst++;
			pst.setInt( nPst , cidade.getEstado().getId() );
			nPst++;
			pst.setBoolean( nPst, cidade.getAtivo() );
			nPst++;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return nPst;
	}

	@Override
	public void initColumns() {
		addColunas( 0 , "id"        );
		addColunas( 1 , "nome"      );
		addColunas( 2 , "estado_id" );		
	}

	@Override
	public EntidadeDominio consultar_id(EntidadeDominio entidade) throws SQLException {
		PreparedStatement pst = null;
		
		Cidade cidade = (Cidade)entidade;
		SqlBuilder sb = new SqlBuilder(this.table, colunas);
	    Map<Integer,Object> hsWhere = new HashMap<Integer,Object>();
		Integer lni = 1;

		try {
			openConnection();
			
    		sb.addWhere("id = ?" );
    		hsWhere.put(lni, cidade.getId());
    		lni++;

	    
			pst = connection.prepareStatement(sb.getQuery(null));
		
		    for (Map.Entry<Integer, Object> entry : hsWhere.entrySet())
		    {
		    	pst.setObject(entry.getKey(), entry.getValue());
		    }
			
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				Cidade c = new Cidade();
				c.setId(rs.getInt("id"));
				c.setNome(rs.getString("nome"));
				c.setAtivo(rs.getBoolean("ativo"));				

				EstadoDAO eDao = new EstadoDAO(connection);
				Estado estado = new Estado();
				estado.setId(rs.getInt("estado_id"));
				List<EntidadeDominio> estados = eDao.consultar(estado);
				c.setEstado( (Estado)estados.get(0) );
		
				java.sql.Date dtCadastroEmLong = rs.getDate("dtcadastro");
				Date dtCadastro = new Date(dtCadastroEmLong.getTime());				
				c.setDtCadastro(dtCadastro);
				return c;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
