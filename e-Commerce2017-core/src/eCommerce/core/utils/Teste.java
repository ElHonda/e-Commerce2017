package eCommerce.core.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import eCommerce.core.IFachada;
import eCommerce.core.aplicacao.Resultado;
import eCommerce.core.impl.controle.Fachada;
import eCommerce.dominio.Autor;
import eCommerce.dominio.Categoria;
import eCommerce.dominio.Dimensao;
import eCommerce.dominio.Editora;
import eCommerce.dominio.GrupoPrecificacao;
import eCommerce.dominio.Livro;
import eCommerce.dominio.LivroCategoria;
import eCommerce.dominio.LivroSubCategoria;
import eCommerce.dominio.SubCategoria;

public class Teste {
	public static void main(String[] args) throws SQLException {
		System.out.println( 0 % 4);
		HardResetDatabase();
		TesteInclusao();
		TesteConsulta();
		TesteUpdate();
	}

	private static void TesteUpdate() throws SQLException{
		IFachada fachada = new Fachada();
		// Livro
		Livro livro = new Livro();
		livro.setId(1);
		livro = (Livro)fachada.consultar_id(livro).getEntidades().get(0);
		System.out.println("Categorias vinculadas: ");
		for( LivroCategoria cat : livro.getCategorias() ) {
			System.out.print( cat.getCategoria().getDescricao() + "," );
		}
		
		LivroCategoria livroCategoria = livro.getCategorias().get(2);
		System.out.println("\nQuero remover essa aqui: " + livroCategoria.getCategoria().getDescricao() );
		livro.removeCategoria(livroCategoria);
		
		
		System.out.println("\nDepois da remoção : ");
		for( LivroCategoria cat : livro.getCategorias() ) {
			System.out.print( cat.getCategoria().getDescricao() + "," );
		}
		
		fachada.alterar(livro);
	
	}
	private static void TesteConsulta() throws SQLException {
		IFachada fachada = new Fachada();

		// Autor
		System.out.println(":::Consultando Autor:::");
		Autor autor = new Autor();
		System.out.println("Autor consulta Rapida...");
		autor.setId(1);
		autor = (Autor)fachada.consultar_id(autor).getEntidades().get(0);
		System.out.println(autor.getNome());
		System.out.println("Autor consulta avançada..");
		autor = new Autor();
		autor.setNome("utor");
		autor = (Autor)fachada.consultar(autor).getEntidades().get(0);
		System.out.println(autor.getSobrenome());
		
		// Categoria
		System.out.println(":::Consultando Categoria:::");
		Categoria categoria = new Categoria();
		System.out.println("Categoria consulta Rapida...");
		categoria.setId(1);
		categoria = (Categoria)fachada.consultar_id(categoria).getEntidades().get(0);
		System.out.println(categoria.getDescricao());
		System.out.println("Categoria consulta avançada..");
		categoria = new Categoria();
		categoria.setDescricao("imeira");
		categoria = (Categoria)fachada.consultar(categoria).getEntidades().get(0);
		System.out.println(categoria.getDescricao());

		// SubCategoria
		System.out.println(":::Consultando Subcategoria:::");
		SubCategoria subcategoria = new SubCategoria();
		System.out.println("Subcategoria consulta Rapida...");
		subcategoria.setId(1);
		subcategoria = (SubCategoria)fachada.consultar_id(subcategoria).getEntidades().get(0);
		System.out.println(subcategoria.getDescricao());
		System.out.println("Subcategoria consulta avançada..");
		subcategoria = new SubCategoria();
		subcategoria.setDescricao("imeira");
		subcategoria = (SubCategoria)fachada.consultar(subcategoria).getEntidades().get(0);
		System.out.println(subcategoria.getDescricao());
		
		// Editora
		System.out.println(":::Consultando Editora:::");
		Editora editora = new Editora();
		System.out.println("Editora consulta Rapida...");
		editora.setId(1);
		editora = (Editora)fachada.consultar_id(editora).getEntidades().get(0);
		System.out.println(editora.getNome());
		System.out.println("Editora consulta avançada..");
		editora = new Editora();
		editora.setNome("imeira");
		editora = (Editora)fachada.consultar(editora).getEntidades().get(0);
		System.out.println(editora.getNome());
		
		// Grupo de Precificação
		System.out.println(":::Consultando Grupo de Precificação:::");
		GrupoPrecificacao grupo = new GrupoPrecificacao();
		System.out.println("Grupo consulta Rapida...");
		grupo.setId(1);
		grupo = (GrupoPrecificacao)fachada.consultar_id(grupo).getEntidades().get(0);
		System.out.println(grupo.getDescricao());
		System.out.println("Grupo consulta avançada..");
		grupo = new GrupoPrecificacao();
		grupo.setDescricao("imeiro");
		grupo = (GrupoPrecificacao)fachada.consultar(grupo).getEntidades().get(0);
		System.out.println(grupo.getDescricao());
		
		// Livro
		System.out.println(":::Consultando Livros:::");
		Livro livro = new Livro();
		System.out.println("Livro consulta Rápida...");
		livro.setId(1);
		livro = (Livro)fachada.consultar_id(livro).getEntidades().get(0);
		System.out.println("Título: " + livro.getTitulo());
		System.out.println("Edição: " + livro.getEdicao());
		System.out.println("ISBN: " + livro.getIsbn());
		System.out.println("Sinopse: " + livro.getSinopse());
		System.out.println("Ano: " + livro.getAno().toString());
		System.out.println("Páginas: " + livro.getNumeroPaginas());
		System.out.println("Categorias vinculadas: ");
		for( LivroCategoria cat : livro.getCategorias() ) {
			System.out.print( cat.getCategoria().getDescricao() + "," );
		}
		System.out.println("\nSubcategorias vinculadas: ");
		for( LivroSubCategoria subcat : livro.getSubcategorias() ) {
			System.out.print( subcat.getSubcategoria().getDescricao() + "," );
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
		Resultado resultado;
		
		IFachada fachada = new Fachada();
		System.out.println("Gerando primeiro autor");
		// Primeiro Autor
		Autor autor = new Autor();
		autor.setNome("Autor");
		autor.setSobrenome("de Primeiro");
		resultado = fachada.salvar(autor);
		if( resultado.getEntidades() == null || resultado.getEntidades().size() == 0 ) {
			System.out.println("Problema na inclusão: " + resultado.getMsg() );
		}

		
		System.out.println("Gerando primeira categoria");
		// Primeira Categoria
		Categoria categoria = new Categoria();
		categoria.setDescricao("Primeira Categoria");

		resultado = fachada.salvar(categoria);
		if( resultado.getEntidades() == null || resultado.getEntidades().size() == 0 ) {
			System.out.println("Problema na inclusão: " + resultado.getMsg() );
		}

		System.out.println("Gerando primeira subcategoria");
		// Primeira SubCategoria
		SubCategoria subcategoria = new SubCategoria();
		subcategoria.setDescricao("Primeira Subcategoria");
		resultado = fachada.salvar(subcategoria);
		if( resultado.getEntidades() == null || resultado.getEntidades().size() == 0 ) {
			System.out.println("Problema na inclusão: " + resultado.getMsg() );
		}

		System.out.println("Gerando primeira Editora");
		// Primeria Editora
		Editora editora = new Editora();
		editora.setNome("Editora Primeira");
		resultado = fachada.salvar(editora);
		if( resultado.getEntidades() == null || resultado.getEntidades().size() == 0 ) {
			System.out.println("Problema na inclusão: " + resultado.getMsg() );
		}
		
		System.out.println("Gerando grupo de precificação");
		// Grupo de Precificação
		GrupoPrecificacao grupo = new GrupoPrecificacao();
		grupo.setDescricao("Primeiro grupo");
		grupo.setMargemLucro(15d);
		resultado = fachada.salvar(grupo);
		if( resultado.getEntidades() == null || resultado.getEntidades().size() == 0 ) {
			System.out.println("Problema na inclusão: " + resultado.getMsg() );
		}
		
		System.out.println("Gerando primeiro livro");
		// Cadastro do Livro
		Livro livro = new Livro();
		livro.setAno(2016);
		livro.setAutor(autor);
		livro.setEdicao("EDIÇÃO 1");
		livro.setEditora(editora);
		livro.setIsbn("123564987A645");
		livro.setNumeroPaginas(177);
		livro.setGrupo(grupo);
		livro.setSinopse( "SINOPSE BASE PARA GRAVAÇÃO DO CRUD DO LIVRO" );
		livro.setTitulo( "PRIMEIRO TÍTULO" );
		
		System.out.println("Vinculando primeira categoria ao livro");
		LivroCategoria lc = new LivroCategoria();
		lc.setCategoria(categoria);
		livro.addCategoria(lc);
		for( Integer i = 0 ; i < 3 ; i++ ) {
			System.out.println("Criando categorias e associando ao livro: " + i.toString() );

			Categoria cat = new Categoria();
			cat.setDescricao("Categoria " + i.toString() );
			resultado = fachada.salvar(cat);
			if( resultado.getEntidades() == null || resultado.getEntidades().size() == 0 ) {
				System.out.println("Problema na inclusão: " + resultado.getMsg() );
			}
			lc = new LivroCategoria();
			lc.setCategoria(cat);
		    livro.addCategoria(lc);
		}
		
		System.out.println("Vinculando primeira subcategoria ao livro");
		LivroSubCategoria lcs = new LivroSubCategoria();
		lcs.setSubcategoria(subcategoria);
		livro.addSubCategoria(lcs);
		for( Integer i = 0 ; i < 3 ; i++ ) {
			System.out.println("Criando subcategorias e associando ao livro: " + i.toString() );

			SubCategoria subcat = new SubCategoria();
			subcat.setDescricao("Subcategoria " + i.toString() );
			resultado = fachada.salvar(subcat);
			if( resultado.getEntidades() == null || resultado.getEntidades().size() == 0 ) {
				System.out.println("Problema na inclusão: " + resultado.getMsg() );
			}
			lcs = new LivroSubCategoria();
			lcs.setSubcategoria(subcat);
		    livro.addSubCategoria(lcs);
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
		resultado = fachada.salvar(livro);
		if( resultado.getEntidades() == null || resultado.getEntidades().size() == 0 ) {
			System.out.println("Problema na inclusão: " + resultado.getMsg() );
		}
	}
	
	
	private static void HardResetDatabase() {
		List<String> tables = new ArrayList<>();
		tables.add( "tb_livro_subcategoria" );
		tables.add( "tb_livro_categoria"    );
		tables.add( "tb_livro"              );
		tables.add( "tb_subcategoria"       );
		tables.add( "tb_grupopreco"         );
		tables.add( "tb_editora"            );
		tables.add( "tb_dimensao"           );
		tables.add( "tb_categoria"          );
		tables.add( "tb_autor"			    );

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
