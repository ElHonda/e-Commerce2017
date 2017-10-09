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
import eCommerce.dominio.Endereco;
import eCommerce.dominio.EntidadeDominio;

public class EnderecoDAO extends AbstractJdbcDAO{
	private List<String> colunas;

	
	public EnderecoDAO() {
		super( "tb_endereco" );
	}

	public EnderecoDAO(Connection conexao) {
		super( conexao , "tb_endereco" );
	}


	@Override
	public List<EntidadeDominio> consultar(EntidadeDominio entidade) throws SQLException {
		PreparedStatement pst = null;
		
		Endereco endereco= (Endereco)entidade;
		SqlBuilder sb = new SqlBuilder(this.table, colunas);
	    Map<Integer,Object> hsWhere = new HashMap<Integer,Object>();
		Integer lni = 1;

		try {
			openConnection();
			
		    if ( endereco != null ){
		    	if ( endereco.getId() != null && endereco.getId() > 0 ) {
		    		sb.addWhere("id = ?" );
		    		hsWhere.put(lni, endereco.getId());
		    		lni++;
		    	}
		    	
		    	if ( endereco.getLogradouro() != null && endereco.getLogradouro().length() > 0 ) {
		    		sb.addWhere("logradouro = ?");
		    		hsWhere.put(lni, "%" + endereco.getLogradouro() + "%");
		    		lni++;
		    	}
		    	
		    	if ( endereco.getCidade() != null && endereco.getCidade().getId() > 0 ) {
		    		sb.addWhere("cidade_id = ?");
		    		hsWhere.put(lni, endereco.getCidade().getId() );
		    		lni++;
		    	}
		    	
		    	if ( endereco.getCep() != null && endereco.getCep().length() > 0 ) {
		    		sb.addWhere("cep = ?" );
		    		hsWhere.put( lni, endereco.getCep() );
		    		lni++;
		    	}
		    	
		    	if ( endereco.getEnderecavel() != null && endereco.getEnderecavel().getId() > 0  
		    			&& endereco.getEnderecavel().getClass().getName().length() > 0) {
		    		sb.addWhere("enderecavel_id = ?" );
		    		sb.addWhere("enderecavel_class = ?" );
		    		hsWhere.put( lni , endereco.getEnderecavel().getId() );
		    		lni++;
		    		hsWhere.put( lni , endereco.getEnderecavel().getClass().getName() );
		    		lni++;
		    	}

			}
	    
			pst = connection.prepareStatement(sb.getQuery(null));
		
		    for (Map.Entry<Integer, Object> entry : hsWhere.entrySet())
		    {
		    	pst.setObject(entry.getKey(), entry.getValue());
		    }
			
			ResultSet rs = pst.executeQuery();
			List<EntidadeDominio> enderecos = new ArrayList<EntidadeDominio>();
			while (rs.next()) {
				Endereco e = new Endereco();
				e.setId(rs.getInt("id"));
				e.setTipoResidencia(rs.getString("tiporesidencia"));
				e.setTipoLogradouro(rs.getString("tipologradouro"));
				e.setLogradouro(rs.getString( "logradouro" ));
				e.setNumero(rs.getString( "numero" ));
				e.setBairro(rs.getString("bairro"));
				e.setCep(rs.getString("cep"));
				e.setObservacoes(rs.getString("observacoes"));
				
				CidadeDAO cDao = new CidadeDAO(connection);
				Cidade c = new Cidade();
				
				c.setId(rs.getInt("cidade_id"));
				List<EntidadeDominio> cidade = cDao.consultar(c);
				e.setCidade( (Cidade)cidade.get(0) );

				// Se busca foi feita pelo vinculo do objeto,
				// subentende-se que não é necessária a busca do objeto.
				// Basta repassar o objeto para os registros recuperados
				if ( endereco.getEnderecavel() != null )
					e.setEnderecavel(endereco.getEnderecavel());
				else {
					EntidadeDominio enderecavel = (EntidadeDominio)Class.forName(rs.getString("enderecavel_class")).newInstance();
					enderecavel.setId(rs.getInt("enderecavel_id"));
					e.setEnderecavel(enderecavel);
				}
				
				java.sql.Date dtCadastroEmLong = rs.getDate("dtcadastro");
				Date dtCadastro = new Date(dtCadastroEmLong.getTime());				
				e.setDtCadastro(dtCadastro);
				enderecos.add(e);
			}
			return enderecos;
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
		Endereco endereco= (Endereco)entidade;
		try {
			pst.setString(nPst, endereco.getTipoResidencia());
			nPst++;
			pst.setString(nPst, endereco.getTipoLogradouro());
			nPst++;
			pst.setString(nPst, endereco.getLogradouro() );
			nPst++;
			pst.setString(nPst, endereco.getNumero() );
			nPst++;
			pst.setString(nPst, endereco.getBairro() );
			nPst++;
			pst.setString(nPst, endereco.getCep() );
			nPst++;
			pst.setInt(nPst , endereco.getCidade().getId());
			nPst++;
			pst.setString(nPst , endereco.getObservacoes() );
			nPst++;
			pst.setInt(nPst , endereco.getEnderecavel().getId() );
			nPst++;
			pst.setString(nPst , endereco.getEnderecavel().getClass().getName() );
			nPst++;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return nPst;
	}
	
	@Override
	public void initColumns() {
		addColunas( 0 , "tiporesidencia"    );
		addColunas( 1 , "tipologradouro"    );
		addColunas( 2 , "logradouro"  	    );
		addColunas( 3 , "numero"            );
		addColunas( 4 , "bairro"            );
		addColunas( 5 , "cep"               );
		addColunas( 6 , "cidade_id"         );
		addColunas( 7 , "observacoes"       );
		addColunas( 8 , "enderecavel_id"    );
		addColunas( 9 , "enderecavel_class" );
	}

	@Override
	public EntidadeDominio consultar_id(EntidadeDominio entidade) throws SQLException {
		PreparedStatement pst = null;
		
		Endereco endereco= (Endereco)entidade;
		SqlBuilder sb = new SqlBuilder(this.table, colunas);
	    Map<Integer,Object> hsWhere = new HashMap<Integer,Object>();
		Integer lni = 1;

		try {
			openConnection();
			
    		sb.addWhere("id = ?" );
    		hsWhere.put(lni, endereco.getId());
    		lni++;

			pst = connection.prepareStatement(sb.getQuery(null));
		
		    for (Map.Entry<Integer, Object> entry : hsWhere.entrySet())
		    {
		    	pst.setObject(entry.getKey(), entry.getValue());
		    }
			
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				Endereco e = new Endereco();
				e.setId(rs.getInt("id"));
				e.setTipoResidencia(rs.getString("tiporesidencia"));
				e.setTipoLogradouro(rs.getString("tipologradouro"));
				e.setLogradouro(rs.getString( "logradouro" ));
				e.setNumero(rs.getString( "numero" ));
				e.setBairro(rs.getString("bairro"));
				e.setCep(rs.getString("cep"));
				e.setObservacoes(rs.getString("observacoes"));
				
				CidadeDAO cDao = new CidadeDAO(connection);
				Cidade c = new Cidade();
				
				c.setId(rs.getInt("cidade_id"));
				List<EntidadeDominio> cidade = cDao.consultar(c);
				e.setCidade( (Cidade)cidade.get(0) );

				// Se busca foi feita pelo vinculo do objeto,
				// subentende-se que não é necessária a busca do objeto.
				// Basta repassar o objeto para os registros recuperados
				if ( endereco.getEnderecavel() != null )
					e.setEnderecavel(endereco.getEnderecavel());
				else {
					EntidadeDominio enderecavel = (EntidadeDominio)Class.forName(rs.getString("enderecavel_class")).newInstance();
					enderecavel.setId(rs.getInt("enderecavel_id"));
					e.setEnderecavel(enderecavel);
				}
				
				java.sql.Date dtCadastroEmLong = rs.getDate("dtcadastro");
				Date dtCadastro = new Date(dtCadastroEmLong.getTime());				
				e.setDtCadastro(dtCadastro);
				return e;
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
