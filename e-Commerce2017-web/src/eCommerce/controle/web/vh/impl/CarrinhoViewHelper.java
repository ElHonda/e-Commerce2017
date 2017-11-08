package eCommerce.controle.web.vh.impl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import eCommerce.controle.web.vh.IViewHelper;
import eCommerce.core.IFachada;
import eCommerce.core.aplicacao.EOperacao;
import eCommerce.core.aplicacao.Resultado;
import eCommerce.core.impl.controle.Fachada;
import eCommerce.core.utils.JsonBuilder;
import eCommerce.dominio.Autor;
import eCommerce.dominio.Carrinho;
import eCommerce.dominio.Categoria;
import eCommerce.dominio.Dimensao;
import eCommerce.dominio.Editora;
import eCommerce.dominio.EntidadeDominio;
import eCommerce.dominio.GrupoPrecificacao;
import eCommerce.dominio.Livro;
import eCommerce.dominio.LivroCategoria;
import eCommerce.dominio.LivroSubCategoria;
import eCommerce.dominio.SubCategoria;

public class CarrinhoViewHelper implements IViewHelper{
	@Override
	public EntidadeDominio getEntidade(HttpServletRequest request) {
		String id 		 			= request.getParameter( "livro_id"         );
		String quantidade 			= request.getParameter( "livro_quantidade" );
		String autor_id 	   		= request.getParameter( "livro_autor_id"				);
		String ano 			   		= request.getParameter( "livro_ano"						);
		String titulo 		   		= request.getParameter( "livro_titulo" 					);
		String edicao	      		= request.getParameter( "livro_edicao" 					);
		String editora_id     	 	= request.getParameter( "livro_editora_id" 				);
		String isbn 	       		= request.getParameter( "livro_isbn" 					);
		String numeroPaginas   		= request.getParameter( "livro_numeropaginas" 			);
		String sinopse		   		= request.getParameter( "livro_sinopse"					);
		String grupopreco_id   		= request.getParameter( "livro_grupopreco_id"			);
		String ativo 	       		= request.getParameter( "livro_ativo"					);
		String dimensao_id      	= request.getParameter( "livro_dimensao_id"				);
		String altura          		= request.getParameter( "livro_dimensao_altura" 		);
		String largura         		= request.getParameter( "livro_dimensao_largura" 		);
		String peso            		= request.getParameter( "livro_dimensao_peso"			);
		String profundidade    		= request.getParameter( "livro_dimensao_profundidade"	);
		String categoria_id    		= null;
		String subcategoria_id 		= null;
		String livrocategoria_id    = null;
		String livrosubcategoria_id = null;

		List<LivroCategoria> categorias = new ArrayList<LivroCategoria>();
		Categoria categoria;
		LivroCategoria livroCat;
		for( Integer index = 0 ; ; index++ ) {
			categoria_id = request.getParameter("livro_categoria_" + index.toString() );
			if( categoria_id == null || categoria_id.length() <= 0 ) {
				break;
			}else{
				livrocategoria_id = request.getParameter( "livro_categoria_id_" + index.toString() );
				
				categoria = new Categoria();
				categoria.setId(Integer.parseInt(categoria_id));
				livroCat = new LivroCategoria();
				livroCat.setCategoria(categoria);
				if( livrocategoria_id != null && livrocategoria_id.length() > 0 )
					livroCat.setId(Integer.parseInt(livrocategoria_id));
				categorias.add(livroCat);
			}
		}

		List<LivroSubCategoria> subcategorias = new ArrayList<LivroSubCategoria>();
		SubCategoria subcategoria;
		LivroSubCategoria livroSubCat;
		for( Integer index = 0 ; ; index++ ) {
			subcategoria_id = request.getParameter( "livro_subcategoria_" + index.toString() );
			if( subcategoria_id == null || subcategoria_id.length() <= 0 ) {
				break;
			}else{
				livrosubcategoria_id = request.getParameter( "livro_subcategoria_id_" + index.toString() );
				
				subcategoria = new SubCategoria();
				subcategoria.setId(Integer.parseInt(subcategoria_id));
				livroSubCat = new LivroSubCategoria();
				livroSubCat.setSubcategoria(subcategoria);
				if( livrosubcategoria_id != null && livrosubcategoria_id.length() > 0)
					livroSubCat.setId(Integer.parseInt(livrosubcategoria_id));
				subcategorias.add(livroSubCat);
			}
		}
		
		return buildEntidade(id, quantidade, autor_id, ano, titulo, edicao, editora_id, isbn, numeroPaginas, sinopse, grupopreco_id, ativo , dimensao_id , altura, largura, peso, profundidade , categorias , subcategorias );
	}
	@Override
	public void setView(Resultado resultado, HttpServletRequest request, 
			HttpServletResponse response, EOperacao operacao , Boolean ajaxResponse)
			throws IOException, ServletException {
		Carrinho carrinho;
		IFachada fachada = new Fachada();
		String redirectPage=null;
		Boolean useDispatch=true;
		Boolean carregarCombos=false;

		if( request.getSession().getAttribute( "carrinho" ) == null ) {
			carrinho = new Carrinho();
		}else {
			carrinho = (Carrinho)request.getSession().getAttribute( "carrinho" );

		}
		
		switch (operacao) {
		case SALVAR:
			break;
		case ALTERAR:
			break;
		case VISUALIZAR:
			redirectPage = "FormCarrinho.jsp";
			if ( carrinho.getLivros().size() <= 0 ) {
				request.getSession().setAttribute("alertMsg", "Nenhum item inserido até o momento");
			}
			break;
		case EXCLUIR:
			break;
		case CONSULTAR:
			redirectPage = "ListaCarrinho.jsp";
			request.setAttribute( "header"             , "PESQUISA"              );
			request.setAttribute( "entidadeEnviada"    , resultado.getEntidade() );
			request.setAttribute( "resultadoConsultar" , resultado               );

			carregarCombos = true;
			break;
		case NOVO:
			
			Livro livro = (Livro)resultado.getEntidade();
			Integer quantidade = livro.getQuantidade();

			livro = (Livro)fachada.consultar_id(livro).getEntidades().get(0);
			livro.setQuantidade(quantidade);
			carrinho.addLivro(livro);

			request.getSession().setAttribute( "carrinho" , carrinho );

			if( ajaxResponse ) {
				JsonBuilder json = new JsonBuilder();
				Integer qtde = carrinho.getLivros().size();
				json.addKey( "quantidade" , qtde.toString() );
		        response.setContentType("application/json");
		        response.setCharacterEncoding("UTF-8");
		        PrintWriter writer = response.getWriter();
		        writer.print( json.JsonToString() );
			}
			break;
		default:
			break;
		}
		
		
		if( carregarCombos ) {
			request.setAttribute( "listaAutor"         , fachada.consultar( new Autor()             ) );
			request.setAttribute( "listaEditora"       , fachada.consultar( new Editora()           ) );
			request.setAttribute( "listaGrupo"         , fachada.consultar( new GrupoPrecificacao() ) );
			request.setAttribute( "listaCategoria"     , fachada.consultar( new Categoria()         ) );
			request.setAttribute( "listaSubCategoria"  , fachada.consultar( new SubCategoria()      ) );
		}
		
		
		if( !ajaxResponse ) {
			if( useDispatch ) {
				RequestDispatcher dispatch = request.getRequestDispatcher(redirectPage);
				dispatch.forward(request, response);
			}else {
				response.sendRedirect(redirectPage);
			}
		}
		
		
	}
	public Livro buildEntidade(String id, String quantidade, String autor_id, String ano, String titulo, String edicao, String editora_id, String isbn, String numeroPaginas, String sinopse, String grupopreco_id, String ativo, String dimensao_id, String altura, String largura, String peso, String profundidade, List<LivroCategoria> categorias, List<LivroSubCategoria> subcategorias ) {
		Livro livro = new Livro();

		if( id != null && id.length() > 0) {
			livro.setId(Integer.parseInt(id));
		}
		
		if( quantidade != null && quantidade.length() > 0 ) {
			livro.setQuantidade(Integer.parseInt(quantidade));
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
		if( ativo != null && ativo.length() > 0 ) {
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
		if( dimensao_id != null && dimensao_id.length() > 0 ) {
			livro.getDimensao().setId(Integer.parseInt(dimensao_id));
		}
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
