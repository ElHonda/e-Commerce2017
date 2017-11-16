package eCommerce.controle.web.vh.impl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import eCommerce.controle.web.vh.IViewHelper;
import eCommerce.core.aplicacao.EOperacao;
import eCommerce.core.aplicacao.Resultado;
import eCommerce.dominio.Autor;
import eCommerce.dominio.EntidadeDominio;

public class AutorViewHelper implements IViewHelper{
	@Override
	public EntidadeDominio getEntidade(HttpServletRequest request) {
		String id 		 = request.getParameter( "autor_id"		 );
		String nome      = request.getParameter( "autor_nome"      );
		String sobrenome = request.getParameter( "autor_sobrenome" );

		return buildEntidade(id, nome, sobrenome);
	}
	@Override
	public void setView(Resultado resultado, HttpServletRequest request, HttpServletResponse response, EOperacao operacao , Boolean ajaxResponse)
			throws IOException, ServletException {
		StringBuilder sb = new StringBuilder();
		String redirectPage=null;
		Autor autor;
		Boolean useDispatch=true;

		switch (operacao) {
		case SALVAR:
			if( resultado.getMsg() == null || resultado.getMsg().length() == 0 ) {
				redirectPage = "ListaAutor";
				autor = (Autor)resultado.getEntidades().get(0);
				sb.append( "Autor \"" );
				sb.append( autor.getId().toString().trim() );
				sb.append( " - " );
				sb.append( autor.getNome().trim() ).append( " " );
				sb.append( autor.getSobrenome().trim() );
				sb.append( "\" registrado com sucesso !" );
				request.getSession().setAttribute("sucessoMsg", sb.toString() );
				useDispatch = false;
			}else{
				redirectPage = "FormAutor.jsp";
				request.setAttribute( "header" , "NOVO AUTOR" );
				request.getSession().setAttribute( "errorMsg" , resultado.getMsg()      );
				request.setAttribute( "entidadeEnviada"       , resultado.getEntidade() );
			}

			break;
		case ALTERAR:
			if( resultado.getMsg() == null || resultado.getMsg().length() == 0 ) {
				redirectPage = "ListaAutor";

				autor = (Autor)resultado.getEntidades().get(0);
				sb.append( "Autor \"" );
				sb.append( autor.getId().toString().trim() );
				sb.append( " - " );
				sb.append( autor.getNome().trim() ).append( " " );
				sb.append( autor.getSobrenome().trim() );
				sb.append( "\" alterado com sucesso !" );
				useDispatch = false;
				request.getSession().setAttribute("sucessoMsg", sb.toString() );
			}else {
				redirectPage = "EditarAutor.jsp";
				request.setAttribute( "header"               , "EDITAR"                );
				request.setAttribute( "entidadeEnviada"      , resultado.getEntidade() );
				request.getSession().setAttribute("errorMsg" , resultado.getMsg()      );
			}
			break;
		case VISUALIZAR:
			redirectPage = "EditarAutor.jsp";
			request.setAttribute( "header"          , "EDITAR"                );
			request.setAttribute( "entidadeEnviada" , resultado.getEntidades().get(0) );
			break;
		case EXCLUIR:
			redirectPage = "ListaAutor";
			

			if( resultado.getMsg() == null || resultado.getMsg().length() == 0 ) {
				autor = (Autor)resultado.getEntidades().get(0);
				sb.append("Autor \"");
				sb.append( autor.getId().toString().trim() );
				sb.append( "\" excluído com sucesso !" );
				request.getSession().setAttribute( "alertMsg" , sb.toString() );
				useDispatch = false;
			}else {
				useDispatch = false;
				request.getSession().setAttribute( "errorMsg", resultado.getMsg() );
			}
			break;
		case CONSULTAR:
			redirectPage = "ListaAutor.jsp";
			request.setAttribute( "header"             , "PESQUISA"              );
			request.setAttribute( "entidadeEnviada"    , resultado.getEntidade() );
			request.setAttribute( "resultadoConsultar" , resultado               );
			break;
		case NOVO:
			request.setAttribute( "header" , "NOVO AUTOR" );
			redirectPage = "FormAutor.jsp";
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
	public Autor buildEntidade( String id , String nome, String sobrenome) {
		Autor autor = new Autor();
		if( id != null && id.length() > 0) {
			autor.setId(Integer.parseInt(id));
		}
		if( nome != null && nome.length() > 0 ) {
			autor.setNome(nome);
		}
		if( sobrenome != null && sobrenome.length() > 0 ) {
			autor.setSobrenome(sobrenome);
		}
		
		return autor;
	}

}
