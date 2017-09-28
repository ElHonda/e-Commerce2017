package eCommerce.core.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import eCommerce.core.impl.dao.AutorDAO;
import eCommerce.core.impl.dao.CategoriaDAO;
import eCommerce.core.impl.dao.EditoraDAO;
import eCommerce.core.impl.dao.GrupoPrecificacaoDAO;
import eCommerce.core.impl.dao.LivroDAO;
import eCommerce.core.impl.dao.SubCategoriaDAO;
import eCommerce.dominio.Autor;
import eCommerce.dominio.Categoria;
import eCommerce.dominio.Dimensao;
import eCommerce.dominio.Editora;
import eCommerce.dominio.GrupoPrecificacao;
import eCommerce.dominio.Livro;
import eCommerce.dominio.SubCategoria;

public class Teste {
	public static void main(String[] args) throws SQLException {
		HardResetDatabase();
		TesteInclusao();
		TesteConsulta();
	}

	private static void TesteConsulta() throws SQLException {
		// Autor
		System.out.println(":::Consultando Autor:::");
		AutorDAO autoDAO = new AutorDAO();
		Autor autor = new Autor();
		System.out.println("Autor consulta Rapida...");
		autor.setId(1);
		autor = (Autor)autoDAO.consulta_id(autor);
		System.out.println(autor.getNome());
		System.out.println("Autor consulta avançada..");
		autor = new Autor();
		autor.setNome("utor");
		autor = (Autor)autoDAO.consultar(autor).get(0);
		System.out.println(autor.getSobrenome());
		
		// Categoria
		System.out.println(":::Consultando Categoria:::");
		CategoriaDAO CategoriaDAO = new CategoriaDAO();
		Categoria categoria = new Categoria();
		System.out.println("Categoria consulta Rapida...");
		categoria.setId(1);
		categoria = (Categoria)CategoriaDAO.consulta_id(categoria);
		System.out.println(categoria.getDescricao());
		System.out.println("Categoria consulta avançada..");
		categoria = new Categoria();
		categoria.setDescricao("imeira");
		categoria = (Categoria)CategoriaDAO.consultar(categoria).get(0);
		System.out.println(categoria.getDescricao());

		// SubCategoria
		System.out.println(":::Consultando Subcategoria:::");
		SubCategoriaDAO subcategoriaDAO = new SubCategoriaDAO();
		SubCategoria subcategoria = new SubCategoria();
		System.out.println("Subcategoria consulta Rapida...");
		subcategoria.setId(1);
		subcategoria = (SubCategoria)subcategoriaDAO.consulta_id(subcategoria);
		System.out.println(subcategoria.getDescricao());
		System.out.println("Subcategoria consulta avançada..");
		subcategoria = new SubCategoria();
		subcategoria.setDescricao("imeira");
		subcategoria = (SubCategoria)subcategoriaDAO.consultar(subcategoria).get(0);
		System.out.println(subcategoria.getDescricao());
		
		// Editora
		System.out.println(":::Consultando Editora:::");
		EditoraDAO editoraDAO = new EditoraDAO();
		Editora editora = new Editora();
		System.out.println("Editora consulta Rapida...");
		editora.setId(1);
		editora = (Editora)editoraDAO.consulta_id(editora);
		System.out.println(editora.getNome());
		System.out.println("Editora consulta avançada..");
		editora = new Editora();
		editora.setNome("imeira");
		editora = (Editora)editoraDAO.consultar(editora).get(0);
		System.out.println(editora.getNome());
		
		// Editora
		System.out.println(":::Consultando Grupo de Precificação:::");
		GrupoPrecificacaoDAO grupoDAO = new GrupoPrecificacaoDAO();
		GrupoPrecificacao grupo = new GrupoPrecificacao();
		System.out.println("Grupo consulta Rapida...");
		grupo.setId(1);
		grupo = (GrupoPrecificacao)grupoDAO.consulta_id(grupo);
		System.out.println(grupo.getDescricao());
		System.out.println("Grupo consulta avançada..");
		grupo = new GrupoPrecificacao();
		grupo.setDescricao("imeiro");
		grupo = (GrupoPrecificacao)grupoDAO.consultar(grupo).get(0);
		System.out.println(grupo.getDescricao());
		
		
		// Livro
		System.out.println(":::Consultando Livros:::");
		LivroDAO livroDAO = new LivroDAO();
		Livro livro = new Livro();
		System.out.println("Livro consulta Rápida...");
		livro.setId(1);
		livro = (Livro)livroDAO.consulta_id(livro);
		System.out.println("Título: " + livro.getTitulo());
		System.out.println("Edição: " + livro.getEdicao());
		System.out.println("ISBN: " + livro.getIsbn());
		System.out.println("Sinopse: " + livro.getSinopse());
		System.out.println("Ano: " + livro.getAno().toString());
		System.out.println("Páginas: " + livro.getNumeroPaginas());
		System.out.println("Categorias vinculadas: ");
		for( Categoria cat : livro.getCategorias() ) {
			System.out.print( cat.getDescricao() + "," );
		}
		System.out.println("\nSubcategorias vinculadas: ");
		for( SubCategoria subcat : livro.getSubcategorias() ) {
			System.out.print( subcat.getDescricao() + "," );
		}
		System.out.println("\nEditora: " + livro.getEditora().getNome() );
		System.out.println("Autor: " + livro.getAutor().getNome() );
		System.out.println("Dimensao: ");
		System.out.println( "- Altura:       " + livro.getDimensao().getAltura().toString()       );
		System.out.println( "- Largura:      " + livro.getDimensao().getLargura().toString()      );
		System.out.println( "- Peso:         " + livro.getDimensao().getPeso().toString()         );
		System.out.println( "- Profundidade: " + livro.getDimensao().getProfundidade().toString() );
	}
	private static void TesteInclusao() {

		System.out.println("Gerando primeiro autor");
		// Primeiro Autor
		AutorDAO autoDAO = new AutorDAO();
		Autor autor = new Autor();
		autor.setNome("Autor");
		autor.setSobrenome("de Primeiro");
		autoDAO.salvar(autor);
		
		System.out.println("Gerando primeira categoria");
		// Primeira Categoria
		CategoriaDAO categoriaDAO = new CategoriaDAO();
		Categoria categoria = new Categoria();
		categoria.setDescricao("Primeira Categoria");
		categoriaDAO.salvar(categoria);

		System.out.println("Gerando primeira subcategoria");
		// Primeira SubCategoria
		SubCategoriaDAO subcategoriaDAO = new SubCategoriaDAO();
		SubCategoria subcategoria = new SubCategoria();
		subcategoria.setDescricao("Primeira Subcategoria");
		subcategoriaDAO.salvar(subcategoria);

		System.out.println("Gerando primeira Editora");
		// Primeria Editora
		EditoraDAO editoraDAO = new EditoraDAO();
		Editora editora = new Editora();
		editora.setNome("Editora Primeira");
		editoraDAO.salvar(editora);
		
		System.out.println("Gerando grupo de precificação");
		// Grupo de Precificação
		GrupoPrecificacaoDAO grupoDAO = new GrupoPrecificacaoDAO();
		GrupoPrecificacao grupo = new GrupoPrecificacao();
		grupo.setDescricao("Primeiro grupo");
		grupo.setMargemLucro(15d);
		grupoDAO.salvar(grupo);

		System.out.println("Gerando primeiro livro");
		// Cadastro do Livro
		LivroDAO livroDAO = new LivroDAO();
		Livro livro = new Livro();
		livro.setAno(2016);
		livro.setAutor(autor);
		livro.setEdicao("EDIÇÃO 1");
		livro.setEditora(editora);
		livro.setIsbn("123564987A645");
		livro.setNumeroPaginas(177);
		livro.setSinopse( "SINOPSE BASE PARA GRAVAÇÃO DO CRUD DO LIVRO" );
		livro.setTitulo( "PRIMEIRO TÍTULO" );
		
		System.out.println("Vinculando primeira categoria ao livro");
		livro.addCategoria(categoria);
		for( Integer i = 0 ; i < 3 ; i++ ) {
			System.out.println("Criando categorias e associando ao livro: " + i.toString() );

			Categoria cat = new Categoria();
			cat.setDescricao("Categoria " + i.toString() );
		    categoriaDAO.salvar(cat);
		    livro.addCategoria(cat);
		}
		
		System.out.println("Vinculando primeira subcategoria ao livro");
		livro.addSubCategoria(subcategoria);
		for( Integer i = 0 ; i < 3 ; i++ ) {
			System.out.println("Criando subcategorias e associando ao livro: " + i.toString() );

			SubCategoria subcat = new SubCategoria();
			subcat.setDescricao("Subcategoria " + i.toString() );
		    subcategoriaDAO.salvar(subcat);
		    livro.addSubCategoria(subcat);
		}
		
		System.out.println("Gerando Dimensão e vinculando ao livro");
		// Gerar dimensão
		Dimensao dimensao = new Dimensao();
		dimensao.setAltura(12d);
		dimensao.setLargura(5d);
		dimensao.setPeso(1.5);
		dimensao.setProfundidade(0.75);
		dimensao.setDimensionavel(livro);
		livro.setDimensao(dimensao);
		
		livroDAO.salvar(livro);
	}
	
	
	private static void HardResetDatabase() {
		List<String> tables = new ArrayList<>();
		tables.add( "tb_autor"			    );
		tables.add( "tb_autor"              );
		tables.add( "tb_categoria"          );
		tables.add( "tb_dimensao"           );
		tables.add( "tb_editora"            );
		tables.add( "tb_grupopreco"         );
		tables.add( "tb_livro"              );
		tables.add( "tb_livro_categoria"    );
		tables.add( "tb_livro_subcategoria" );
		tables.add( "tb_subcategoria"       );

		List<String> sequences = new ArrayList<>();
		sequences.add("tb_autor_id_seq"              );
		sequences.add("tb_categoria_id_seq"          );
		sequences.add("tb_dimensao_id_seq"           );
		sequences.add("tb_editora_id_seq"            );
		sequences.add("tb_grupopreco_id_seq"         );
		sequences.add("tb_livro_categoria_id_seq"    );
		sequences.add("tb_livro_id_seq"              );
		sequences.add("tb_livro_subcategoria_id_seq" );
		sequences.add("tb_subcategoria_id_seq"       );
		
		PreparedStatement pst;
		try {
			Connection conn = Conexao.getConnection();
			
			if( conn != null ) {
				for( String table : tables) {
					System.out.println("Apagando dados da tabela " + table );
					pst = conn.prepareStatement("DELETE FROM " + table + ";");
					pst.executeUpdate();
				}
				
				for( String sequence : sequences ) {
					System.out.println("Restaurando sequencia " + sequence );
					pst = conn.prepareStatement("ALTER SEQUENCE " + sequence + " RESTART WITH 1;");
					pst.executeUpdate();
				}
				
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
