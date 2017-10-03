package eCommerce.controle.web.vh.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import eCommerce.controle.web.vh.IViewHelper;
import eCommerce.core.aplicacao.Resultado;
import eCommerce.core.utils.JsonBuilder;
import eCommerce.dominio.Autor;
import eCommerce.dominio.Categoria;
import eCommerce.dominio.Dimensao;
import eCommerce.dominio.Editora;
import eCommerce.dominio.EntidadeDominio;
import eCommerce.dominio.GrupoPrecificacao;
import eCommerce.dominio.Livro;
import eCommerce.dominio.LivroCategoria;
import eCommerce.dominio.LivroSubCategoria;
import eCommerce.dominio.SubCategoria;

public class LivroViewHelper implements IViewHelper{

	@Override
	public EntidadeDominio getEntidade(HttpServletRequest request) {
		String id 		       = request.getParameter("livro_id");
		String autor_id 	   = request.getParameter("livro_autor_id");
		String ano 			   = request.getParameter("livro_ano");
		String titulo 		   = request.getParameter("livro_titulo" );
		String edicao	       = request.getParameter("livro_edicao" );
		String editora_id      = request.getParameter("livro_editora_id" );
		String isbn 	       = request.getParameter("livro_isbn" );
		String numeroPaginas   = request.getParameter("livro_numeropaginas" );
		String sinopse		   = request.getParameter("livro_sinopse");
		String grupopreco_id   = request.getParameter("livro_grupopreco_id");
		String ativo 	       = request.getParameter("livro_ativo");
		String altura          = request.getParameter("livro_dimensao_altura" );
		String largura         = request.getParameter("livro_dimensao_largura" );
		String peso            = request.getParameter("livro_dimensao_peso" );
		String profundidade    = request.getParameter("livro_dimensao_profundidade" );
		String categoria_id    = null;
		String subcategoria_id = null;
		
		List<LivroCategoria> categorias = new ArrayList<LivroCategoria>();
		Categoria categoria;
		LivroCategoria livroCat;
		for( Integer index = 0 ; ; index++ ) {
			categoria_id = request.getParameter("livro_categoria_" + index.toString() );
			if( categoria_id == null || categoria_id.length() <= 0 ) {
				break;
			}else{
				categoria = new Categoria();
				categoria.setId(Integer.parseInt(categoria_id));
				livroCat = new LivroCategoria();
				livroCat.setCategoria(categoria);
				categorias.add(livroCat);
			}
		}

		List<LivroSubCategoria> subcategorias = new ArrayList<LivroSubCategoria>();
		SubCategoria subcategoria;
		LivroSubCategoria livroSubCat;
		for( Integer index = 0 ; ; index++ ) {
			subcategoria_id = request.getParameter("livro_subcategoria_" + index.toString() );
			if( subcategoria_id == null || subcategoria_id.length() <= 0 ) {
				break;
			}else{
				subcategoria = new SubCategoria();
				subcategoria.setId(Integer.parseInt(subcategoria_id));
				livroSubCat = new LivroSubCategoria();
				livroSubCat.setSubcategoria(subcategoria);
				subcategorias.add(livroSubCat);
			}
		}
		
		return buildEntidade(id, autor_id, ano, titulo, edicao, editora_id, isbn, numeroPaginas, sinopse, grupopreco_id, ativo , altura, largura, peso, profundidade , categorias , subcategorias );
	}
	@Override
	public void setView(Resultado resultado, HttpServletRequest request, 
			HttpServletResponse response, String operacao , Boolean ajaxResponse)
			throws IOException, ServletException {
		String redirectPage=null;

		if( operacao.equals("SALVAR") && !ajaxResponse) {

			if( resultado.getMsg() == null || resultado.getMsg().length() == 0 ) {
				// SE trata de gravar nova categoria, portanto, só receberá 1 objeto de retorno
				StringBuilder sb = new StringBuilder();
				Livro livro = (Livro)resultado.getEntidades().get(0);
				sb.append( "Livro \"" );
				sb.append( livro.getId().toString().trim() );
				sb.append( " - " );
				sb.append( livro.getTitulo().trim() );
				sb.append( "\" registrado com sucesso !" );
				redirectPage = "ListaLivros.jsp";
				request.getSession().setAttribute("sucessoMsg", sb.toString() );
				RequestDispatcher dispatch = request.getRequestDispatcher( redirectPage );
				dispatch.forward(request, response);
			}else{
				request.getSession().setAttribute("errorMsg", resultado.getMsg());
				redirectPage = "FormLivro.jsp";
				response.sendRedirect(redirectPage);
			}
		}else if( operacao.equals( "ALTERAR" ) && !ajaxResponse ){
			if( resultado.getMsg() == null || resultado.getMsg().length() == 0 ) {
				StringBuilder sb = new StringBuilder();
				Livro livro = (Livro)resultado.getEntidades().get(0);
				sb.append( "Livro \"" );
				sb.append( livro.getId().toString().trim() );
				sb.append( " - " );
				sb.append( livro.getTitulo().trim() );
				sb.append( "\" alterado com sucesso !" );
				redirectPage = "ListaLivros.jsp";
				request.getSession().setAttribute("sucessoMsg", sb.toString() );
				RequestDispatcher dispatch = request.getRequestDispatcher( redirectPage );
				dispatch.forward(request, response);
			}else {
				request.getSession().setAttribute("errorMsg", resultado.getMsg());
				redirectPage = "EditarLivro.jsp";
				request.setAttribute("resultadoEditar", resultado.getEntidades().get(0));
				RequestDispatcher dispatch = request.getRequestDispatcher(redirectPage);
				dispatch.forward(request, response);
			}
		}else if( operacao.equals("VISUALIZAR")  && !ajaxResponse ) {
			redirectPage = "EditarLivro.jsp";
			// Na visualização se espera apenas 1 livro.
			request.setAttribute("resultadoEditar", resultado.getEntidades().get(0));
			RequestDispatcher dispatch = request.getRequestDispatcher(redirectPage);
			dispatch.forward(request, response);
		}
	}
	@Override
	public EntidadeDominio getEntidadeJSON(JsonBuilder jb){
		String id 		       = jb.getValue( "livro_id" );
		String autor_id 	   = jb.getValue( "livro_autor_id" );
		String ano 			   = jb.getValue( "livro_ano" );
		String titulo 		   = jb.getValue( "livro_titulo" );
		String edicao	       = jb.getValue( "livro_edicao" );
		String editora_id      = jb.getValue( "livro_editora_id" );
		String isbn 	       = jb.getValue( "livro_isbn" );
		String numeroPaginas   = jb.getValue( "livro_numeroPaginas" );
		String sinopse		   = jb.getValue( "livro_sinopse" );
		String grupopreco_id   = jb.getValue( "livro_grupopreco_id" );
		String ativo 	       = jb.getValue( "livro_ativo" );
		String altura          = jb.getValue("livro_dimensao_altura" );
		String largura         = jb.getValue("livro_dimensao_largura" );
		String peso            = jb.getValue("livro_dimensao_peso" );
		String profundidade    = jb.getValue("livro_dimensao_profundidade" );
		String categoria_id    = null;
		String subcategoria_id = null;
		
		List<LivroCategoria> categorias = new ArrayList<LivroCategoria>();
		Categoria categoria;
		LivroCategoria livroCat;
		for( Integer index = 0 ; ; index++ ) {
			categoria_id = jb.getValue("livro_categoria_" + index.toString() );
			if( categoria_id == null || categoria_id.length() <= 0 ) {
				break;
			}else{
				categoria = new Categoria();
				categoria.setId(Integer.parseInt(categoria_id));
				livroCat = new LivroCategoria();
				livroCat.setCategoria(categoria);
				categorias.add(livroCat);
			}
		}

		List<LivroSubCategoria> subcategorias = new ArrayList<LivroSubCategoria>();
		SubCategoria subcategoria;
		LivroSubCategoria livroSubCat;
		for( Integer index = 0 ; ; index++ ) {
			subcategoria_id = jb.getValue("livro_subcategoria_" + index.toString() );
			if( subcategoria_id == null || subcategoria_id.length() <= 0 ) {
				break;
			}else{
				subcategoria = new SubCategoria();
				subcategoria.setId(Integer.parseInt(subcategoria_id));
				livroSubCat = new LivroSubCategoria();
				livroSubCat.setSubcategoria(subcategoria);
				subcategorias.add(livroSubCat);
			}
		}
		
		return buildEntidade(id, autor_id, ano, titulo, edicao, editora_id, isbn, numeroPaginas, sinopse, grupopreco_id, ativo, altura, largura, peso , profundidade  , categorias, subcategorias);
	}

	public Livro buildEntidade(String id, String autor_id, String ano, String titulo, String edicao, String editora_id, String isbn, String numeroPaginas, String sinopse, String grupopreco_id, String ativo, String altura, String largura, String peso, String profundidade, List<LivroCategoria> categorias, List<LivroSubCategoria> subcategorias) {
		Livro livro = new Livro();
		if( id != null && id.length() > 0) {
			livro.setId(Integer.parseInt(id));
		}
		if( autor_id != null && autor_id.length() > 0 ) {
			Autor autor = new Autor();
			autor.setId(Integer.parseInt(autor_id));
			livro.setAutor(autor);
		}
		if( ano != null && ano.length() > 0 ) {
			livro.setAno(Integer.parseInt(ano));
		}
		if( titulo != null ) {
			livro.setTitulo(titulo);
		}
		if( edicao != null ) {
			livro.setEdicao(edicao);
		}
		if( editora_id != null && editora_id.length() > 0 ) {
			Editora editora = new Editora();
			editora.setId(Integer.parseInt(editora_id));
			livro.setEditora(editora);
		}
		if( isbn != null ) {
			livro.setIsbn(isbn);
		}
		if( numeroPaginas != null && numeroPaginas.length() > 0 ) {
			livro.setNumeroPaginas(Integer.parseInt(numeroPaginas));
		}
		if( sinopse != null ) {
			livro.setSinopse(sinopse);
		}
		if( grupopreco_id != null && grupopreco_id.length() > 0 ) {
			GrupoPrecificacao grupopreco = new GrupoPrecificacao();
			grupopreco.setId(Integer.parseInt(grupopreco_id));
			livro.setGrupo(grupopreco);
		}
		if( ativo != null ) {
			livro.setAtivo(Boolean.parseBoolean(ativo));
		}
		
		// Faz looping nas categorias e subcategorias para atribuir o livro
		for( LivroCategoria lc : categorias ) {
			lc.setLivro(livro);
		}
		for( LivroSubCategoria lsc : subcategorias ) {
			lsc.setLivro(livro);
		}
		
		livro.setDimensao(new Dimensao());
		if( altura != null && altura.length() > 0 ) {
			livro.getDimensao().setAltura(Double.parseDouble(altura));
		}
		if( largura != null && largura.length() > 0 ) {
			livro.getDimensao().setLargura(Double.parseDouble(largura));
		}
	    if( peso != null && peso.length() > 0 ) {
	    	livro.getDimensao().setPeso(Double.parseDouble(peso));
	    }
		if( profundidade != null && profundidade.length() > 0 ) {
			livro.getDimensao().setProfundidade(Double.parseDouble(profundidade));
		}
		//if( livro.getDimensao() != null )
		//	livro.getDimensao().setDimensionavel(livro);
		livro.setCategorias(categorias);
		livro.setSubcategorias(subcategorias);
		
		return livro;
	}

}
