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
import eCommerce.dominio.Autor;
import eCommerce.dominio.EntidadeDominio;

public class AutorDAO extends AbstractJdbcDAO {
	
	public AutorDAO(){
		super("tb_autor");
	}

	public AutorDAO(Connection conexao ){
		super(conexao, "tb_autor");
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
		
		Autor autor = (Autor)entidade;
		SqlBuilder sb = new SqlBuilder(this.table, colunas);
	    Map<Integer,Object> hsWhere = new HashMap<Integer,Object>();
		Integer lni = 1;

		try {
			openConnection();
			
		    if ( autor != null ){
		    	if ( autor.getId() != null && autor.getId() > 0 ) {
		    		sb.addWhere("id = ?" );
		    		hsWhere.put(lni, autor.getId());
		    		lni++;
		    	}
		    	
		    	if ( autor.getNome() != null && autor.getNome().length() > 0 ) {
		    		sb.addWhere("nome = ?");
		    		hsWhere.put(lni, "%" + autor.getNome() + "%");
		    		lni++;
		    	}
		    	
		    	if ( autor.getSobrenome() != null && autor.getSobrenome().length() > 0 ) {
		    		sb.addWhere("sobrenome = ?" );
		    		hsWhere.put(lni, autor.getSobrenome() );
		    		lni++;
		    	}
			}
	    
			pst = connection.prepareStatement(sb.getQuery(null));
		
		    for (Map.Entry<Integer, Object> entry : hsWhere.entrySet())
		    {
		    	pst.setObject(entry.getKey(), entry.getValue());
		    }
			
			ResultSet rs = pst.executeQuery();
			List<EntidadeDominio> autores = new ArrayList<EntidadeDominio>();
			while (rs.next()) {
				Autor a = new Autor();
				a.setId(rs.getInt("id"));
				a.setNome(rs.getString("nome"));
				a.setSobrenome(rs.getString("sobrenome"));
				
				java.sql.Date dtCadastroEmLong = rs.getDate("dtcadastro");
				if( dtCadastroEmLong != null ) {
					Date dtCadastro = new Date(dtCadastroEmLong.getTime());				
					a.setDtCadastro(dtCadastro);
				}
				autores.add(a);
			}
			return autores;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Integer setPreparedStatement(EntidadeDominio entidade, PreparedStatement pst, Integer nPst) {
		Autor a = (Autor)entidade;
		try {
			pst.setString(nPst, a.getNome());
			nPst++;
			pst.setString(nPst, a.getSobrenome());
			nPst++;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return nPst;
	}


	@Override
	public Integer setPreparedStatementOnlyUpdate(EntidadeDominio entidade, PreparedStatement pst, Integer nPst) {
		return nPst;
	}

	@Override
	public void initColumns() {
		addColunas( 0 , "nome"      );
		addColunas( 1 , "sobrenome" );
	}

}
