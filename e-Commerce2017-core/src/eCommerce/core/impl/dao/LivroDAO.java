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
import eCommerce.dominio.Dimensao;
import eCommerce.dominio.Editora;
import eCommerce.dominio.EntidadeDominio;
import eCommerce.dominio.GrupoPrecificacao;
import eCommerce.dominio.Livro;
import eCommerce.dominio.LivroCategoria;
import eCommerce.dominio.LivroSubCategoria;

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
		addColunas( "grupopreco_id" );
		addColunas( "ativo"         );
	    addColunas( "qtde_estoque"  );
	    addColunas( "preco_compra"  );
	    addColunas( "preco_venda"   );
	}
	public void salvar_pos(EntidadeDominio entidade) throws SQLException {
		Livro livro = (Livro)entidade;

		// Faz a gravação das Dimensões
		livro.getDimensao().setDimensionavel(livro);
		DimensaoDAO dDAO = new DimensaoDAO(this.connection);
		dDAO.salvar(livro.getDimensao());
		
		salvarCategorias(livro);
		salvarSubCategoria(livro);

	}
	@Override
	protected void alterar_pre(EntidadeDominio entidade) throws SQLException{
		Livro livro = (Livro)entidade;
		Livro livroOld = (Livro)consultar_id(livro);
		
		LivroCategoriaDAO lcDAO = new LivroCategoriaDAO(this.connection);
		LivroSubCategoriaDAO lscDAO = new LivroSubCategoriaDAO(this.connection);
		
		for( LivroCategoria lc : livroOld.getCategorias() ) {
			// Se não encontrou no atual, significa que precisa excluir
			if( !livro.getCategorias().contains(lc) ) {
				lcDAO.excluir(lc);
			}
		}
		
		for( LivroSubCategoria lsc : livroOld.getSubcategorias() ) {
			if( !livro.getSubcategorias().contains(lsc) ) {
				lscDAO.excluir(lsc);
			}
		}
	}
	protected void alterar_pos(EntidadeDominio entidade) throws SQLException{
		Livro livro = (Livro)entidade;

		// Atualiza as dimensões
		livro.getDimensao().setDimensionavel(livro);
		DimensaoDAO dDAO = new DimensaoDAO(this.connection);
		dDAO.alterar(livro.getDimensao());
		
		salvarCategorias(livro);
		salvarSubCategoria(livro);
	}
	private void salvarCategorias(Livro livro) {
		// Faz a gravação das Categorias para o livro
		LivroCategoriaDAO lcDAO = new LivroCategoriaDAO(this.connection);
		for( LivroCategoria livroCat : livro.getCategorias() ) {
			if( livroCat.getId() != null && livroCat.getId() > 0 ) {
				lcDAO.alterar(livroCat);
			}else {
				lcDAO.salvar(livroCat);
			}
			
		}
	}
	private void salvarSubCategoria(Livro livro) {
		// Faz a gravação das SubCategorias para o livro
		LivroSubCategoriaDAO lcsDAO = new LivroSubCategoriaDAO(this.connection);
		for( LivroSubCategoria livroSubCat : livro.getSubcategorias() ) {
			if( livroSubCat.getId() != null && livroSubCat.getId() > 0 ) {
				lcsDAO.alterar(livroSubCat);
			}else {
				lcsDAO.salvar(livroSubCat);
			}
		}
	}
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
		    		sb.addWhere("titulo like ?");
		    		hsWhere.put(lni, "%" + livro.getTitulo() + "%");
		    		lni++;
		    	}
		    	if( livro.getAutor() != null && livro.getAutor().getId() > 0 ) {
		    		sb.addWhere("autor_id = ? ");
		    		hsWhere.put(lni, livro.getAutor().getId() );
		    		lni++;
		    	}
				if( livro.getAno() != null && livro.getAno() > 0 ) {
					sb.addWhere("ano = ?" );
					hsWhere.put(lni, livro.getAno() );
					lni++;
				}
				if( livro.getEdicao() != null && livro.getEdicao().length() > 0 ) {
					sb.addWhere("edicao = ? ");
					hsWhere.put(lni, "%" + livro.getEdicao() + "%" );
					lni++;
				}
		    	if( livro.getEditora() != null && livro.getEditora().getId() > 0 ) {
		    		sb.addWhere("editora_id = ? ");
		    		hsWhere.put(lni, livro.getEditora().getId() );
		    		lni++;
		    	}
				if( livro.getIsbn() != null && livro.getIsbn().length() > 0 ) {
					sb.addWhere("isbn = ? ");
					hsWhere.put(lni, "%" + livro.getIsbn() + "%" );
					lni++;
				}
				if( livro.getNumeroPaginas() != null && livro.getNumeroPaginas() > 0 ) {
					sb.addWhere("numeropaginas = ?" );
					hsWhere.put(lni, livro.getNumeroPaginas() );
					lni++;
				}
				if( livro.getSinopse() != null && livro.getSinopse().length() > 0 ) {
					sb.addWhere("sinopse = ? ");
					hsWhere.put(lni, "%" + livro.getSinopse() + "%" );
					lni++;
				}
				if( livro.getGrupo() != null && livro.getGrupo().getId() > 0 ) {
					sb.addWhere("grupopreco_id = ? ");
					hsWhere.put( lni , livro.getGrupo().getId() );
					lni++;
				}
				if( livro.getAtivo() != null ) {
					if( livro.getAtivo() ) {
						sb.addWhere("ativo");
					}else {
						sb.addWhere("not ativo");
					}
				}
				if( livro.getDimensao() != null ) {
					Boolean joinDimensao=false;
					if( livro.getDimensao().getAltura() != null && livro.getDimensao().getAltura() > 0 ) {
						joinDimensao = true;
						sb.addWhere("tb_dimensao.altura = ?");
						hsWhere.put( lni , livro.getDimensao().getAltura() );
						lni++;
					}
					if( livro.getDimensao().getLargura() != null && livro.getDimensao().getLargura() > 0 ) {
						joinDimensao = true;
						sb.addWhere("tb_dimensao.largura = ?");
						hsWhere.put( lni , livro.getDimensao().getLargura() );
						lni++;
					}
					if( livro.getDimensao().getPeso() != null && livro.getDimensao().getPeso() > 0 ) {
						joinDimensao = true;
						sb.addWhere("tb_dimensao.peso = ?");
						hsWhere.put( lni , livro.getDimensao().getPeso() );
						lni++;
					}
					if( livro.getDimensao().getProfundidade() != null && livro.getDimensao().getProfundidade() > 0 ) {
						joinDimensao = true;
						sb.addWhere( "tb_dimensao.profundidade = ?" );
						hsWhere.put( lni , livro.getDimensao().getProfundidade() );
						lni++;
					}
					if( joinDimensao ) {
						sb.addJoin("JOIN tb_dimensao ON tb_dimensao.dimensionavel_id = tb_livro.id "
								                 + "AND dimensionavel_class = '" + livro.getClass().getName() + "'");
					}
				}
				if( livro != null && livro.getCategorias() != null && livro.getCategorias().size() > 0 ) {
					StringBuilder sqlIn = new StringBuilder();
					for( LivroCategoria lc : livro.getCategorias() ) {
						if( sqlIn.length() > 0 ) {
							sqlIn.append(",");
						}
						sqlIn.append("?");
						hsWhere.put( lni, lc.getCategoria().getId() );
						lni++;
					}
					sb.addWhere( "tb_livro.id IN ( SELECT livro_id FROM tb_livro_categoria lc WHERE lc.categoria_id IN ("+ sqlIn.toString() + ") )" );
				}
				if( livro != null && livro.getSubcategorias() != null && livro.getSubcategorias().size() > 0 ) {
					StringBuilder sqlIn = new StringBuilder();
					for( LivroSubCategoria lsc : livro.getSubcategorias() ) {
						if( sqlIn.length() > 0 ) {
							sqlIn.append(",");
						}
						sqlIn.append("?");
						hsWhere.put( lni, lsc.getSubcategoria().getId() );
						lni++;
					}
					sb.addWhere("tb_livro.id IN ( SELECT livro_id FROM tb_livro_subcategoria lsc WHERE lsc.subcategoria_id IN ("+ sqlIn.toString() + ") )" );
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
				l.setAtivo(rs.getBoolean("ativo"));
				l.setQtdeEstoque(rs.getInt("qtde_estoque" ));
				l.setPrecoCompra(rs.getDouble("preco_compra"));
				l.setPrecoVenda(rs.getDouble("preco_venda"));
				// Faz a Busca do Autor
				Autor autor = new Autor();
				AutorDAO aDAO = new AutorDAO(this.connection);
				autor.setId(rs.getInt("autor_id"));
				l.setAutor((Autor)aDAO.consultar_id(autor));

				// Faz a busca da Editora
				Editora editora = new Editora();
				EditoraDAO eDAO = new EditoraDAO(this.connection);
				editora.setId(rs.getInt("editora_id"));
				l.setEditora((Editora)eDAO.consultar_id(editora));

				// Faz a busca do Grupo de Precificação
				GrupoPrecificacao grupo = new GrupoPrecificacao();
				GrupoPrecificacaoDAO gDAO = new GrupoPrecificacaoDAO(this.connection);
				grupo.setId(rs.getInt("grupopreco_id"));
				l.setGrupo((GrupoPrecificacao)gDAO.consultar_id(grupo));
				
				// Faz a busca das Dimensões
				Dimensao dimensao = new Dimensao();
				DimensaoDAO dDAO = new DimensaoDAO(this.connection);
				dimensao.setDimensionavel(l);
				l.setDimensao((Dimensao)dDAO.consultar_id(dimensao));

				// Recupera as categorias
			    LivroCategoria lc = new LivroCategoria();
			    LivroCategoriaDAO lcDAO = new LivroCategoriaDAO(this.connection);
			    lc.setLivro(l);
			    for( EntidadeDominio livroCategoria : lcDAO.consultar(lc) ) {
			    	l.addCategoria((LivroCategoria)livroCategoria);
			    }
			    
				// Recupera as sub categorias
			    LivroSubCategoria lsc = new LivroSubCategoria();
			    LivroSubCategoriaDAO lcsDAO = new LivroSubCategoriaDAO(this.connection);
			    lsc.setLivro(l);
			    for( EntidadeDominio livroSubCategoria : lcsDAO.consultar(lsc) ) {
			    	l.addSubCategoria((LivroSubCategoria)livroSubCategoria);
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
	public EntidadeDominio consultar_id(EntidadeDominio entidade) throws SQLException {
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
				l.setAtivo(rs.getBoolean("ativo"));
				l.setQtdeEstoque(rs.getInt("qtde_estoque" ));
				l.setPrecoCompra(rs.getDouble("preco_compra"));
				l.setPrecoVenda(rs.getDouble("preco_venda"));
				
				// Faz a Busca do Autor
				Autor autor = new Autor();
				AutorDAO aDAO = new AutorDAO(this.connection);
				autor.setId(rs.getInt("autor_id"));
				l.setAutor((Autor)aDAO.consultar_id(autor));

				// Faz a busca da Editora
				Editora editora = new Editora();
				EditoraDAO eDAO = new EditoraDAO(this.connection);
				editora.setId(rs.getInt("editora_id"));
				l.setEditora((Editora)eDAO.consultar_id(editora));

				// Faz a busca do Grupo de Precificação
				GrupoPrecificacao grupo = new GrupoPrecificacao();
				GrupoPrecificacaoDAO gDAO = new GrupoPrecificacaoDAO(this.connection);
				grupo.setId(rs.getInt("grupopreco_id"));
				l.setGrupo((GrupoPrecificacao)gDAO.consultar_id(grupo));
				
				// Faz a busca das Dimensões
				Dimensao dimensao = new Dimensao();
				DimensaoDAO dDAO = new DimensaoDAO(this.connection);
				dimensao.setDimensionavel(l);
				l.setDimensao((Dimensao)dDAO.consultar(dimensao).get(0));

				// Recupera as categorias
			    LivroCategoria lc = new LivroCategoria();
			    LivroCategoriaDAO lcDAO = new LivroCategoriaDAO(this.connection);
			    lc.setLivro(l);
			    for( EntidadeDominio livroCategoria : lcDAO.consultar(lc) ) {
			    	l.addCategoria((LivroCategoria)livroCategoria);
			    }
			    
				// Recupera as sub categorias
			    LivroSubCategoria lsc = new LivroSubCategoria();
			    LivroSubCategoriaDAO lcsDAO = new LivroSubCategoriaDAO(this.connection);
			    lsc.setLivro(l);
			    for( EntidadeDominio livroSubCategoria : lcsDAO.consultar(lsc) ) {
			    	l.addSubCategoria((LivroSubCategoria)livroSubCategoria);
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
			pst.setInt( nPst , l.getGrupo().getId() );
			nPst++;
			pst.setBoolean(nPst, (l.getAtivo()==null)?true:l.getAtivo() );
			nPst++;
			pst.setInt(nPst ,  l.getQtdeEstoque() );
			nPst++;
			pst.setDouble(nPst ,  l.getPrecoCompra() );
			nPst++;
			pst.setDouble(nPst ,  l.getPrecoVenda() );
			nPst++;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return nPst;
	}

}
