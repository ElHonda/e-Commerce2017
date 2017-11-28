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
import eCommerce.dominio.ETipoTelefone;
import eCommerce.dominio.EntidadeDominio;
import eCommerce.dominio.Telefone;

public class TelefoneDAO extends AbstractJdbcDAO{
	private List<String> colunas;

	
	public TelefoneDAO() {
		super( "tb_telefone" );
	}

	public TelefoneDAO(Connection conexao) {
		super( conexao , "tb_telefone" );
	}


	@Override
	public List<EntidadeDominio> consultar(EntidadeDominio entidade) throws SQLException {
		PreparedStatement pst = null;
		
		Telefone telefone = (Telefone)entidade;
		SqlBuilder sb = new SqlBuilder(this.table, colunas);
	    Map<Integer,Object> hsWhere = new HashMap<Integer,Object>();
		Integer lni = 1;

		try {
			openConnection();
			
		    if ( telefone != null ){
		    	if ( telefone.getId() != null && telefone.getId() > 0 ) {
		    		sb.addWhere("id = ?" );
		    		hsWhere.put(lni, telefone.getId());
		    		lni++;
		    	}
		    	
		    	
		    	if ( telefone.getTelefonavel() != null && telefone.getTelefonavel().getId() > 0  
		    			&& telefone.getTelefonavel().getClass().getName().length() > 0) {
		    		sb.addWhere("telefonavel_id = ?" );
		    		sb.addWhere("telefonavel_class = ?" );
		    		hsWhere.put( lni , telefone.getTelefonavel().getId() );
		    		lni++;
		    		hsWhere.put( lni , telefone.getTelefonavel().getClass().getName() );
		    		lni++;
		    	}

			}
	    
			pst = connection.prepareStatement(sb.getQuery(null));
		
		    for (Map.Entry<Integer, Object> entry : hsWhere.entrySet())
		    {
		    	pst.setObject(entry.getKey(), entry.getValue());
		    }
			
			ResultSet rs = pst.executeQuery();
			List<EntidadeDominio> telefones = new ArrayList<EntidadeDominio>();
			while (rs.next()) {
				Telefone t = new Telefone();
				t.setId(rs.getInt("id"));
				t.setNumero(rs.getString("numero"));
				t.setDdd(rs.getString("ddd"));
				t.setTipo(ETipoTelefone.valueOf(rs.getString("tipo")));
				
				// Se busca foi feita pelo vinculo do objeto,
				// subentende-se que não é necessária a busca do objeto.
				// Basta repassar o objeto para os registros recuperados
				if ( telefone.getTelefonavel() != null )
					t.setTelefonavel(telefone.getTelefonavel());
				else {
					EntidadeDominio telefonavel = (EntidadeDominio)Class.forName(rs.getString("telefonavel_class")).newInstance();
					telefonavel.setId(rs.getInt("telefonavel_id"));
					t.setTelefonavel(telefonavel);
				}
				
				java.sql.Date dtCadastroEmLong = rs.getDate("dtcadastro");
				Date dtCadastro = new Date(dtCadastroEmLong.getTime());				
				t.setDtCadastro(dtCadastro);
				telefones.add(t);
			}
			return telefones;
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (InstantiationException e1) {
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			e1.printStackTrace();
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		return null;
	}
	public Integer setPreparedStatement(EntidadeDominio entidade, PreparedStatement pst, Integer nPst) {
		Telefone telefone = (Telefone)entidade;
		try {
			pst.setString(nPst, telefone.getTipo().toString());
			nPst++;
			pst.setString(nPst, telefone.getDdd());
			nPst++;
			pst.setString(nPst, telefone.getNumero() );
			nPst++;
			pst.setInt(nPst , telefone.getTelefonavel().getId() );
			nPst++;
			pst.setString(nPst , telefone.getTelefonavel().getClass().getName() );
			nPst++;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return nPst;
	}
	
	@Override
	public void initColumns() {
		addColunas( "tipo"   			);
		addColunas( "ddd"    			);
		addColunas( "numero" 			);
		addColunas( "telefonavel_id"    );
		addColunas( "telefonavel_class" );
	}

	@Override
	public EntidadeDominio consultar_id(EntidadeDominio entidade) throws SQLException {
		PreparedStatement pst = null;
		
		Telefone telefone = (Telefone)entidade;
		SqlBuilder sb = new SqlBuilder(this.table, colunas);
	    Map<Integer,Object> hsWhere = new HashMap<Integer,Object>();
		Integer lni = 1;

		try {
			openConnection();
			
			sb.addWhere("id = ?" );
			hsWhere.put(lni, telefone.getId());
			lni++;

	    
			pst = connection.prepareStatement(sb.getQuery(null));
		
		    for (Map.Entry<Integer, Object> entry : hsWhere.entrySet())
		    {
		    	pst.setObject(entry.getKey(), entry.getValue());
		    }
			
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				Telefone t = new Telefone();
				t.setId(rs.getInt("id"));
				t.setNumero(rs.getString("numero"));
				t.setDdd(rs.getString("ddd"));
				t.setTipo(ETipoTelefone.valueOf(rs.getString("tipo")));
				
				// Se busca foi feita pelo vinculo do objeto,
				// subentende-se que não é necessária a busca do objeto.
				// Basta repassar o objeto para os registros recuperados
				if ( telefone.getTelefonavel() != null )
					t.setTelefonavel(telefone.getTelefonavel());
				else {
					EntidadeDominio telefonavel = (EntidadeDominio)Class.forName(rs.getString("telefonavel_class")).newInstance();
					telefonavel.setId(rs.getInt("telefonavel_id"));
					t.setTelefonavel(telefonavel);
				}
				
				java.sql.Date dtCadastroEmLong = rs.getDate("dtcadastro");
				Date dtCadastro = new Date(dtCadastroEmLong.getTime());				
				t.setDtCadastro(dtCadastro);
				return t;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (InstantiationException e1) {
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			e1.printStackTrace();
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		return null;
	}


}
