package eCommerce.core.impl.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import eCommerce.core.IFachada;
import eCommerce.core.impl.controle.Fachada;
import eCommerce.core.utils.SqlBuilder;
import eCommerce.dominio.Cliente;
import eCommerce.dominio.ESexo;
import eCommerce.dominio.Endereco;
import eCommerce.dominio.EntidadeDominio;

public class ClienteDAO extends AbstractJdbcDAO {
	private List<String> colunas;
	 
	public ClienteDAO(Connection conexao) {
		super( conexao, "tb_fornecedor" );
	}
	
	public ClienteDAO() {
		super( "tb_fornecedor" );
	}

	@Override
	public List<EntidadeDominio> consultar(EntidadeDominio entidade) {
		PreparedStatement pst = null;
		
		Cliente cliente = (Cliente)entidade;
		SqlBuilder sb = new SqlBuilder(this.table, colunas);
	    Map<Integer,Object> hsWhere = new HashMap<Integer,Object>();
		Integer lni = 1;

		try {
			openConnection();
			
		    if ( cliente != null ){
		    	if ( cliente.getId() != null && cliente.getId() > 0 ) {
		    		sb.addWhere("id = ?" );
		    		hsWhere.put(lni, cliente.getId());
		    		lni++;
		    	}
		    	
		    	if ( cliente.getNome() != null && cliente.getNome().length() > 0 ) {
		    		sb.addWhere("nome = ?");
		    		hsWhere.put(lni, "%" + cliente.getNome() + "%");
		    		lni++;
		    	}
		    	
		    	if ( cliente.getEmail() != null && cliente.getEmail().length() > 0 ) {
		    		sb.addWhere("email = ?");
		    		hsWhere.put(lni, cliente.getEmail() );
		    		lni++;
		    	}
		    	
		    	if ( cliente.getSexo() != null ) {
		    		sb.addWhere("sexo = ?" );
		    		hsWhere.put( lni, cliente.getSexo().toString() );
		    		lni++;
		    	}
		    	
		    	if ( cliente.getRanking() != null ) {
		    		sb.addWhere("ranking = ?" );
		    		hsWhere.put( lni, cliente.getRanking() );
		    		lni++;
		    	}
		    	if( cliente.getDataNasc() != null) {
		    		sb.addWhere("dtnascimento = ?" );
		    		hsWhere.put( lni, cliente.getDataNasc().getTime() );
		    		lni++;
		    	}
		    	if( cliente.getCpf() != null && cliente.getCpf().length() > 0 ) {
		    		sb.addWhere( "cpf = ?" );
		    		hsWhere.put( lni , cliente.getCpf() );
		    		lni++;
		    	}
		    	if( cliente.getAtivo() != null ) {
		    		if( cliente.getAtivo() ) {
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
			List<EntidadeDominio> clientes = new ArrayList<EntidadeDominio>();
			while (rs.next()) {				
				Cliente c = new Cliente();
				c.setId(rs.getInt("id"));
				c.setNome(rs.getString("nome"));
				c.setCpf(rs.getString("cpf"));
				c.setEmail(rs.getString("email"));
				c.setSexo(ESexo.valueOf(rs.getString("sexo")));
				c.setRanking(rs.getDouble("ranking"));
				c.setAtivo(rs.getBoolean("ativo"));
				c.setSenha(rs.getString("senha"));
				
				// Faz a busca de endereços
				Endereco endereco = new Endereco();
			    EnderecoDAO endDao = new EnderecoDAO(connection);
			    endereco.setEnderecavel( c );
			    List<Endereco> enderecos = new ArrayList<>();
			    List<EntidadeDominio> entidades = endDao.consultar(endereco);
			    for ( EntidadeDominio end : entidades ){
			    	enderecos.add((Endereco) end);
			    }
			    c.setEnderecos(enderecos);
			    
				java.sql.Date dtCadastroEmLong = rs.getDate("dtcadastro");
				Date dtCadastro = new Date(dtCadastroEmLong.getTime());				
				c.setDtCadastro(dtCadastro);
				
				java.sql.Date dtNascimentoEmLong = rs.getDate("dtnascimento");
				Date dtNascimento = new Date(dtNascimentoEmLong.getTime());
				c.setDataNasc(dtNascimento);

				clientes.add(c);
			}
			return clientes;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public Integer setPreparedStatement(EntidadeDominio entidade, PreparedStatement pst, Integer nPst) {
		Cliente cliente = (Cliente)entidade;
		Timestamp time;
		try {
			pst.setString(nPst, cliente.getEmail() );
			nPst++;
			pst.setString(nPst, cliente.getSenha() );
			nPst++;
			pst.setString(nPst, cliente.getNome() );
			nPst++;
			pst.setString(nPst, cliente.getSexo().toString() );
			nPst++;
			pst.setString(nPst, cliente.getEmail() );
			nPst++;
			time = new Timestamp(cliente.getDataNasc().getTime());
			pst.setTimestamp(nPst, time);
			nPst++;
			pst.setString(nPst, cliente.getCpf() );
			nPst++;
			pst.setDouble(nPst, cliente.getRanking() );
			nPst++;
			pst.setBoolean(nPst, cliente.getAtivo() );
			nPst++;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return nPst;
	}

	@Override
	public void salvar_pos(EntidadeDominio entidade) throws SQLException {
		IFachada fachada = new Fachada();
		Cliente cliente = (Cliente)entidade;
		for( Endereco ent : cliente.getEnderecos() ) {
			fachada.salvar(ent);
		}
		
		fachada.salvar(cliente.getTelefone());
	}

	@Override
	public void initColumns() {
		addColunas( 0 , "email"        );
		addColunas( 1 , "senha"        );
		addColunas( 2 , "nome"         );
		addColunas( 3 , "sexo"         );
		addColunas( 4 , "dtnascimento" );
		addColunas( 5 , "cpf"          );
		addColunas( 6 , "ranking"      );
		addColunas( 7 , "ativo"        );
	}

	@Override
	public EntidadeDominio consultar_id(EntidadeDominio entidade) throws SQLException {
		PreparedStatement pst = null;
		
		Cliente cliente = (Cliente)entidade;
		SqlBuilder sb = new SqlBuilder(this.table, colunas);
	    Map<Integer,Object> hsWhere = new HashMap<Integer,Object>();
		Integer lni = 1;

		try {
			openConnection();
	
    		sb.addWhere("id = ?" );
    		hsWhere.put(lni, cliente.getId());
    		lni++;
    	
	    
			pst = connection.prepareStatement(sb.getQuery(null));
		
		    for (Map.Entry<Integer, Object> entry : hsWhere.entrySet())
		    {
		    	pst.setObject(entry.getKey(), entry.getValue());
		    }
			
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {				
				Cliente c = new Cliente();
				c.setId(rs.getInt("id"));
				c.setNome(rs.getString("nome"));
				c.setCpf(rs.getString("cpf"));
				c.setEmail(rs.getString("email"));
				c.setSexo(ESexo.valueOf(rs.getString("sexo")));
				c.setRanking(rs.getDouble("ranking"));
				c.setAtivo(rs.getBoolean("ativo"));
				c.setSenha(rs.getString("senha"));
				
				// Faz a busca de endereços
				Endereco endereco = new Endereco();
			    EnderecoDAO endDao = new EnderecoDAO(connection);
			    endereco.setEnderecavel( c );
			    List<Endereco> enderecos = new ArrayList<>();
			    List<EntidadeDominio> entidades = endDao.consultar(endereco);
			    for ( EntidadeDominio end : entidades ){
			    	enderecos.add((Endereco) end);
			    }
			    c.setEnderecos(enderecos);
			    
				java.sql.Date dtCadastroEmLong = rs.getDate("dtcadastro");
				Date dtCadastro = new Date(dtCadastroEmLong.getTime());				
				c.setDtCadastro(dtCadastro);
				
				java.sql.Date dtNascimentoEmLong = rs.getDate("dtnascimento");
				Date dtNascimento = new Date(dtNascimentoEmLong.getTime());
				c.setDataNasc(dtNascimento);

				return c;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}



}
