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
import eCommerce.dominio.Categoria;
import eCommerce.dominio.Dimensao;
import eCommerce.dominio.Editora;
import eCommerce.dominio.EntidadeDominio;
import eCommerce.dominio.Livro;
import eCommerce.dominio.LivroCategoria;
import eCommerce.dominio.LivroSubCategoria;
import eCommerce.dominio.SubCategoria;

public class LivroDAO extends AbstractJdbcDAO {

	public LivroDAO(){
		super("tb_livro");
	}

	public LivroDAO(Connection conexao ){
		super(conexao, "tb_livro");
	}
	
	
	@Override
	public void initColumns() {
		addColunas( "autor_id"      );
		addColunas( "ano" 		    );
		addColunas( "titulo"        );
		addColunas( "edicao"        );
		addColunas( "editora_id"    );
		addColunas( "isbn"          );
		addColunas( "numeroPaginas" );
		addColunas( "sinopse"	    );
	}

	@Override
	public void salvar_pre(EntidadeDominio entidade) throws SQLException {
	}

	@Override
	public void salvar_pos(EntidadeDominio entidade) throws SQLException {
		Livro livro = (Livro)entidade;

		// Faz a gravação das Dimensões
		livro.getDimensao().setDimensionavel(livro);
		DimensaoDAO dDAO = new DimensaoDAO(this.connection);
		dDAO.salvar(livro.getDimensao());
		
		// Faz a gravação das Categorias para o livro
		LivroCategoriaDAO lcDAO = new LivroCategoriaDAO(this.connection);
		for( Categoria c : livro.getCategorias() ) {
			LivroCategoria lc = new LivroCategoria();
			lc.setLivro(livro);
			lc.setCategoria(c);
			lcDAO.salvar(lc);
		}
		
		// Faz a gravação das SubCategorias para o livro
		LivroSubCategoriaDAO lcsDAO = new LivroSubCategoriaDAO(this.connection);
		for( SubCategoria s : livro.getSubcategorias() ) {
			LivroSubCategoria lcs = new LivroSubCategoria();
			lcs.setLivro(livro);
			lcs.setSubcategoria(s);
			lcsDAO.salvar(lcs);
		}
	}

	@Override
	public List<EntidadeDominio> consultar(EntidadeDominio entidade) throws SQLException {
		PreparedStatement pst = null;
		
		Livro livro = (Livro)entidade;
		SqlBuilder sb = new SqlBuilder(this.table, colunas);
	    Map<Integer,Object> hsWhere = new HashMap<Integer,Object>();
		Integer lni = 1;

		try {
			openConnection();
			
		    if ( livro != null ){
		    	if ( livro.getId() != null && livro.getId() > 0 ) {
		    		sb.addWhere("id = ?" );
		    		hsWhere.put(lni, livro.getId());
		    		lni++;
		    	}
		    	
		    	if ( livro.getTitulo() != null && livro.getTitulo().length() > 0 ) {
		    		sb.addWhere("titulo = ?");
		    		hsWhere.put(lni, "%" + livro.getTitulo() + "%");
		    		lni++;
		    	}
			}
	    
			pst = connection.prepareStatement(sb.getQuery(null));
		
		    for (Map.Entry<Integer, Object> entry : hsWhere.entrySet())
		    {
		    	pst.setObject(entry.getKey(), entry.getValue());
		    }
			
			ResultSet rs = pst.executeQuery();
			List<EntidadeDominio> livros = new ArrayList<EntidadeDominio>();
			while (rs.next()) {
				Livro l = new Livro();
				l.setId(rs.getInt("id"));
				l.setAno(rs.getInt("ano"));
				l.setTitulo(rs.getString("titulo"));
				l.setEdicao(rs.getString("edicao"));
				l.setIsbn(rs.getString("isbn"));
				l.setSinopse(rs.getString("sinopse"));
				l.setNumeroPaginas(rs.getInt("numeropaginas"));
				
				// Faz a Busca do Autor
				Autor autor = new Autor();
				AutorDAO aDAO = new AutorDAO(this.connection);
				autor.setId(rs.getInt("autor_id"));
				l.setAutor((Autor)aDAO.consulta_id(autor));

				// Faz a busca da Editora
				Editora editora = new Editora();
				EditoraDAO eDAO = new EditoraDAO(this.connection);
				editora.setId(rs.getInt("editora_id"));
				l.setEditora((Editora)eDAO.consulta_id(editora));

				// Faz a busca das Dimensões
				Dimensao dimensao = new Dimensao();
				DimensaoDAO dDAO = new DimensaoDAO(this.connection);
				dimensao.setDimensionavel(l);
				l.setDimensao((Dimensao)dDAO.consulta_id(dimensao));

				// Recupera as categorias
			    LivroCategoria lc = new LivroCategoria();
			    LivroCategoriaDAO lcDAO = new LivroCategoriaDAO(this.connection);
			    lc.setLivro(l);
			    for( EntidadeDominio ed : lcDAO.consultar(lc) ) {
			    	Categoria cat = ((LivroCategoria)ed).getCategoria();
			    	l.addCategoria(cat);
			    }
			    
				// Recupera as sub categorias
			    LivroSubCategoria lsc = new LivroSubCategoria();
			    LivroSubCategoriaDAO lcsDAO = new LivroSubCategoriaDAO(this.connection);
			    lsc.setLivro(l);
			    for( EntidadeDominio ed : lcsDAO.consultar(lsc) ) {
			    	SubCategoria subCat = ((LivroSubCategoria)ed).getSubcategoria();
			    	l.addSubCategoria(subCat);
			    }
			    
			    
				java.sql.Date dtCadastroEmLong = rs.getDate("dtcadastro");
				if( dtCadastroEmLong != null ) {
					Date dtCadastro = new Date(dtCadastroEmLong.getTime());				
					l.setDtCadastro(dtCadastro);
				}
				livros.add(l);
			}
			return livros;
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return null;
	}

	@Override
	public EntidadeDominio consulta_id(EntidadeDominio entidade) throws SQLException {
		PreparedStatement pst = null;
		
		Livro livro = (Livro)entidade;
		SqlBuilder sb = new SqlBuilder(this.table, colunas);
	    Map<Integer,Object> hsWhere = new HashMap<Integer,Object>();
		Integer lni = 1;

		try {
			openConnection();
			

	    	if ( livro.getId() != null && livro.getId() > 0 ) {
	    		sb.addWhere("id = ?" );
	    		hsWhere.put(lni, livro.getId());
	    		lni++;
	    	}

			pst = connection.prepareStatement(sb.getQuery(null));
		
		    for (Map.Entry<Integer, Object> entry : hsWhere.entrySet())
		    {
		    	pst.setObject(entry.getKey(), entry.getValue());
		    }
			
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				Livro l = new Livro();
				l.setId(rs.getInt("id"));
				l.setAno(rs.getInt("ano"));
				l.setTitulo(rs.getString("titulo"));
				l.setEdicao(rs.getString("edicao"));
				l.setIsbn(rs.getString("isbn"));
				l.setSinopse(rs.getString("sinopse"));
				l.setNumeroPaginas(rs.getInt("numeropaginas"));
				
				// Faz a Busca do Autor
				Autor autor = new Autor();
				AutorDAO aDAO = new AutorDAO(this.connection);
				autor.setId(rs.getInt("autor_id"));
				l.setAutor((Autor)aDAO.consulta_id(autor));

				// Faz a busca da Editora
				Editora editora = new Editora();
				EditoraDAO eDAO = new EditoraDAO(this.connection);
				editora.setId(rs.getInt("editora_id"));
				l.setEditora((Editora)eDAO.consulta_id(editora));

				// Faz a busca das Dimensões
				Dimensao dimensao = new Dimensao();
				DimensaoDAO dDAO = new DimensaoDAO(this.connection);
				dimensao.setId(rs.getInt("dimensao_id"));
				l.setDimensao((Dimensao)dDAO.consulta_id(dimensao));

				// Recupera as categorias
			    LivroCategoria lc = new LivroCategoria();
			    LivroCategoriaDAO lcDAO = new LivroCategoriaDAO(this.connection);
			    lc.setLivro(l);
			    for( EntidadeDominio ed : lcDAO.consultar(lc) ) {
			    	Categoria cat = ((LivroCategoria)ed).getCategoria();
			    	l.addCategoria(cat);
			    }
			    
				// Recupera as sub categorias
			    LivroSubCategoria lsc = new LivroSubCategoria();
			    LivroSubCategoriaDAO lcsDAO = new LivroSubCategoriaDAO(this.connection);
			    lsc.setLivro(l);
			    for( EntidadeDominio ed : lcsDAO.consultar(lsc) ) {
			    	SubCategoria subCat = ((LivroSubCategoria)ed).getSubcategoria();
			    	l.addSubCategoria(subCat);
			    }
			    
			    
				java.sql.Date dtCadastroEmLong = rs.getDate("dtcadastro");
				if( dtCadastroEmLong != null ) {
					Date dtCadastro = new Date(dtCadastroEmLong.getTime());				
					l.setDtCadastro(dtCadastro);
				}
				return l;
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return null;
	}

	@Override
	public Integer setPreparedStatement(EntidadeDominio entidade, PreparedStatement pst, Integer nPst) {
		Livro l = (Livro)entidade;
		try {
			pst.setInt(nPst, l.getAutor().getId());
			nPst++;
			pst.setInt(nPst, l.getAno());
			nPst++;
			pst.setString(nPst, l.getTitulo());
			nPst++;
			pst.setString(nPst, l.getEdicao());
			nPst++;
			pst.setInt(nPst, l.getEditora().getId());
			nPst++;
			pst.setString(nPst, l.getIsbn());
			nPst++;
			pst.setInt(nPst, l.getNumeroPaginas() );
			nPst++;
			pst.setString(nPst, l.getSinopse() );
			nPst++;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return nPst;
	}

	@Override
	public Integer setPreparedStatementOnlyUpdate(EntidadeDominio entidade, PreparedStatement pst, Integer nPst) {
		// TODO Auto-generated method stub
		return null;
	}

}
