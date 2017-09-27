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
		
		System.out.println("Gerando grupo de precifica��o");
		// Grupo de Precifica��o
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
		livro.setEdicao("EDI��O 1");
		livro.setEditora(editora);
		livro.setIsbn("123564987A645");
		livro.setNumeroPaginas(177);
		livro.setSinopse( "SINOPSE BASE PARA GRAVA��O DO CRUD DO LIVRO" );
		livro.setTitulo( "PRIMEIRO T�TULO" );
		
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
		
		System.out.println("Gerando Dimens�o e vinculando ao livro");
		// Gerar dimens�o
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
