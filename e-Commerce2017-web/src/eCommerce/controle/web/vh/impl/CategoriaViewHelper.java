package eCommerce.controle.web.vh.impl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import eCommerce.controle.web.vh.IViewHelper;
import eCommerce.core.aplicacao.EOperacao;
import eCommerce.core.aplicacao.Resultado;
import eCommerce.dominio.Categoria;
import eCommerce.dominio.EntidadeDominio;

public class CategoriaViewHelper implements IViewHelper{
	@Override
	public EntidadeDominio getEntidade(HttpServletRequest request) {
		String id        = request.getParameter( "categoria_id"        );
		String descricao = request.getParameter( "categoria_descricao" );

		return buildEntidade( id , descricao );
	}
	@Override
	public void setView(Resultado resultado, HttpServletRequest request, HttpServletResponse response, EOperacao operacao , Boolean ajaxResponse)
			throws IOException, ServletException {
		StringBuilder sb = new StringBuilder();
		String redirectPage=null;
		Categoria categoria;
		Boolean useDispatch=true;

		switch (operacao) {
		case SALVAR:
			if( resultado.getMsg() == null || resultado.getMsg().length() == 0 ) {
				redirectPage = "ListaCategoria";
				categoria = (Categoria)resultado.getEntidades().get(0);
				sb.append( "Categoria \"" );
				sb.append( categoria.getId().toString().trim() );
				sb.append( " - " );
				sb.append( categoria.getDescricao().trim() );
				sb.append( "\" registrado com sucesso !" );
				request.getSession().setAttribute("sucessoMsg", sb.toString() );
				useDispatch = false;
			}else{
				redirectPage = "FormCategoria.jsp";
				request.setAttribute( "header" , "NOVA EDITORA" );
				request.getSession().setAttribute( "errorMsg" , resultado.getMsg()      );
				request.setAttribute( "entidadeEnviada"       , resultado.getEntidade() );
			}

			break;
		case ALTERAR:
			if( resultado.getMsg() == null || resultado.getMsg().length() == 0 ) {
				redirectPage = "ListaCategoria";

				categoria = (Categoria)resultado.getEntidades().get(0);
				sb.append( "Categoria \"" );
				sb.append( categoria.getId().toString().trim() );
				sb.append( " - " );
				sb.append( categoria.getDescricao().trim() );
				sb.append( "\" alterado com sucesso !" );
				useDispatch = false;
				request.getSession().setAttribute("sucessoMsg", sb.toString() );
			}else {
				redirectPage = "EditarCategoria.jsp";
				request.setAttribute( "header"               , "EDITAR"                );
				request.setAttribute( "entidadeEnviada"      , resultado.getEntidade() );
				request.getSession().setAttribute("errorMsg" , resultado.getMsg()      );
			}
			break;
		case VISUALIZAR:
			redirectPage = "EditarCategoria.jsp";
			request.setAttribute( "header"          , "EDITAR"                );
			request.setAttribute( "entidadeEnviada" , resultado.getEntidades().get(0) );
			break;
		case EXCLUIR:
			redirectPage = "ListaCategoria";
			

			if( resultado.getMsg() == null || resultado.getMsg().length() == 0 ) {
				categoria = (Categoria)resultado.getEntidades().get(0);
				sb.append("Categoria \"");
				sb.append( categoria.getId().toString().trim() );
				sb.append( "\" excluído com sucesso !" );
				request.getSession().setAttribute( "alertMsg" , sb.toString() );
				useDispatch = false;
			}else {
				useDispatch = false;
				request.getSession().setAttribute( "errorMsg", resultado.getMsg() );
			}
			break;
		case CONSULTAR:
			redirectPage = "ListaCategoria.jsp";
			request.setAttribute( "header"             , "PESQUISA"              );
			request.setAttribute( "entidadeEnviada"    , resultado.getEntidade() );
			request.setAttribute( "resultadoConsultar" , resultado               );
			break;
		case NOVO:
			request.setAttribute( "header" , "NOVA EDITORA" );
			redirectPage = "FormCategoria.jsp";
			break;
		default:
			break;
		}

		
		if( useDispatch ) {
			RequestDispatcher dispatch = request.getRequestDispatcher(redirectPage);
			dispatch.forward(request, response);
		}else {
			response.sendRedirect(redirectPage);
		}
		
	}
	public Categoria buildEntidade( String id , String descricao ) {
		Categoria categoria = new Categoria();
		if( id != null && id.length() > 0) {
			categoria.setId(Integer.parseInt(id));
		}
		if( descricao != null && descricao.length() > 0 ) {
			categoria.setDescricao(descricao);
		}

		return categoria;
	}

}
