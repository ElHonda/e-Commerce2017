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
import eCommerce.dominio.Livro;
import eCommerce.dominio.LivroCategoria;

public class LivroCategoriaDAO extends AbstractJdbcDAO{

	public LivroCategoriaDAO(){
		super("tb_livro_categoria");
	}

	public LivroCategoriaDAO(Connection conexao ){
		super(conexao, "tb_livro_categoria");
	}
	
	@Override
	public void initColumns() {
		addColunas( "livro_id"     );
		addColunas( "categoria_id" );
	}
	@Override
	public List<EntidadeDominio> consultar(EntidadeDominio entidade) throws SQLException {
		PreparedStatement pst = null;
		
		LivroCategoria livroCat = (LivroCategoria)entidade;
		SqlBuilder sb = new SqlBuilder(this.table, colunas);
	    Map<Integer,Object> hsWhere = new HashMap<Integer,Object>();
		Integer lni = 1;

		try {
			openConnection();
			// Por nenhum motivo, deve ser feita uma consulta a tabela de livros
			// categorias sem o envio de um objeto deste tipo
	    	if ( livroCat.getLivro() != null && livroCat.getLivro().getId() > 0 ) {
	    		sb.addWhere("livro_id = ?" );
	    		hsWhere.put(lni, livroCat.getLivro().getId());
	    		lni++;
	    	}
	    	
	    	if ( livroCat.getCategoria() != null && livroCat.getCategoria().getId() > 0 ) {
	    		sb.addWhere("categoria_id = ?");
	    		hsWhere.put(lni, livroCat.getCategoria().getId() );
	    		lni++;
	    	}
	    
			pst = connection.prepareStatement(sb.getQuery(null));
		
		    for (Map.Entry<Integer, Object> entry : hsWhere.entrySet())
		    {
		    	pst.setObject(entry.getKey(), entry.getValue());
		    }
			
			ResultSet rs = pst.executeQuery();
			List<EntidadeDominio> livroscategorias = new ArrayList<EntidadeDominio>();
			while (rs.next()) {
				LivroCategoria lc = new LivroCategoria();
				lc.setId(rs.getInt("id"));

				if( livroCat.getLivro() == null ) {
					// Faz a Busca do Livro
					Livro livro = new Livro();
					LivroDAO aDAO = new LivroDAO(this.connection);
					livro.setId(rs.getInt("livro_id"));
					lc.setLivro((Livro)aDAO.consultar_id(livro));
				}else
					lc.setLivro(livroCat.getLivro());

				if( livroCat.getCategoria() == null) {
					// Faz a busca da Categoria
					Categoria categoria = new Categoria();
					CategoriaDAO eDAO = new CategoriaDAO(this.connection);
					categoria.setId(rs.getInt("categoria_id"));
					lc.setCategoria((Categoria)eDAO.consultar_id(categoria));
				}else {
					lc.setCategoria(livroCat.getCategoria());
				}

				java.sql.Date dtCadastroEmLong = rs.getDate("dtcadastro");
				if( dtCadastroEmLong != null ) {
					Date dtCadastro = new Date(dtCadastroEmLong.getTime());				
					lc.setDtCadastro(dtCadastro);
				}
				livroscategorias.add(lc);
			}
			return livroscategorias;
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return null;
	}

	@Override
	public EntidadeDominio consultar_id(EntidadeDominio entidade) throws SQLException {
		PreparedStatement pst = null;
		
		LivroCategoria lc = (LivroCategoria)entidade;
		SqlBuilder sb = new SqlBuilder(this.table, colunas);
	    Map<Integer,Object> hsWhere = new HashMap<Integer,Object>();
		Integer lni = 1;

		try {
			openConnection();
			
    		sb.addWhere("id = ?" );
    		hsWhere.put(lni, lc.getId());
    		lni++;
	    
			pst = connection.prepareStatement(sb.getQuery(null));
		
		    for (Map.Entry<Integer, Object> entry : hsWhere.entrySet())
		    {
		    	pst.setObject(entry.getKey(), entry.getValue());
		    }
			
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				lc.setId(rs.getInt("id"));

				// Faz a Busca do Livro
				Livro livro = new Livro();
				LivroDAO aDAO = new LivroDAO(this.connection);
				livro.setId(rs.getInt("livro_id"));
				lc.setLivro((Livro)aDAO.consultar_id(livro));


				// Faz a busca da Categoria
				Categoria categoria = new Categoria();
				CategoriaDAO eDAO = new CategoriaDAO(this.connection);
				categoria.setId(rs.getInt("editora_id"));
				lc.setCategoria((Categoria)eDAO.consultar_id(categoria));
		
				
				java.sql.Date dtCadastroEmLong = rs.getDate("dtcadastro");
				if( dtCadastroEmLong != null ) {
					Date dtCadastro = new Date(dtCadastroEmLong.getTime());				
					lc.setDtCadastro(dtCadastro);
				}
				return lc;
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return null;
	}

	@Override
	public Integer setPreparedStatement(EntidadeDominio entidade, PreparedStatement pst, Integer nPst) {
		LivroCategoria lc = (LivroCategoria)entidade;
		try {
			pst.setInt(nPst, lc.getLivro().getId() );
			nPst++;
			pst.setInt(nPst, lc.getCategoria().getId());
			nPst++;
		}catch( SQLException x ) {
			x.printStackTrace();
		}
		
		return nPst;
	}
}
