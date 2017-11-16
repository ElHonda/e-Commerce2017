package eCommerce.controle.web.vh.impl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import eCommerce.controle.web.vh.IViewHelper;
import eCommerce.core.aplicacao.EOperacao;
import eCommerce.core.aplicacao.Resultado;
import eCommerce.dominio.Editora;
import eCommerce.dominio.EntidadeDominio;

public class EditoraViewHelper implements IViewHelper{
	@Override
	public EntidadeDominio getEntidade(HttpServletRequest request) {
		String id 	= request.getParameter( "editora_id"   );
		String nome = request.getParameter( "editora_nome" );

		return buildEntidade( id , nome );
	}
	@Override
	public void setView(Resultado resultado, HttpServletRequest request, HttpServletResponse response, EOperacao operacao , Boolean ajaxResponse)
			throws IOException, ServletException {
		StringBuilder sb = new StringBuilder();
		String redirectPage=null;
		Editora editora;
		Boolean useDispatch=true;

		switch (operacao) {
		case SALVAR:
			if( resultado.getMsg() == null || resultado.getMsg().length() == 0 ) {
				redirectPage = "ListaEditora";
				editora = (Editora)resultado.getEntidades().get(0);
				sb.append( "Editora \"" );
				sb.append( editora.getId().toString().trim() );
				sb.append( " - " );
				sb.append( editora.getNome().trim() );
				sb.append( "\" registrado com sucesso !" );
				request.getSession().setAttribute("sucessoMsg", sb.toString() );
				useDispatch = false;
			}else{
				redirectPage = "FormEditora.jsp";
				request.setAttribute( "header" , "NOVA EDITORA" );
				request.getSession().setAttribute( "errorMsg" , resultado.getMsg()      );
				request.setAttribute( "entidadeEnviada"       , resultado.getEntidade() );
			}

			break;
		case ALTERAR:
			if( resultado.getMsg() == null || resultado.getMsg().length() == 0 ) {
				redirectPage = "ListaEditora";

				editora = (Editora)resultado.getEntidades().get(0);
				sb.append( "Editora \"" );
				sb.append( editora.getId().toString().trim() );
				sb.append( " - " );
				sb.append( editora.getNome().trim() );
				sb.append( "\" alterado com sucesso !" );
				useDispatch = false;
				request.getSession().setAttribute("sucessoMsg", sb.toString() );
			}else {
				redirectPage = "EditarEditora.jsp";
				request.setAttribute( "header"               , "EDITAR"                );
				request.setAttribute( "entidadeEnviada"      , resultado.getEntidade() );
				request.getSession().setAttribute("errorMsg" , resultado.getMsg()      );
			}
			break;
		case VISUALIZAR:
			redirectPage = "EditarEditora.jsp";
			request.setAttribute( "header"          , "EDITAR"                );
			request.setAttribute( "entidadeEnviada" , resultado.getEntidades().get(0) );
			break;
		case EXCLUIR:
			redirectPage = "ListaEditora";
			

			if( resultado.getMsg() == null || resultado.getMsg().length() == 0 ) {
				editora = (Editora)resultado.getEntidades().get(0);
				sb.append("Editora \"");
				sb.append( editora.getId().toString().trim() );
				sb.append( "\" excluído com sucesso !" );
				request.getSession().setAttribute( "alertMsg" , sb.toString() );
				useDispatch = false;
			}else {
				useDispatch = false;
				request.getSession().setAttribute( "errorMsg", resultado.getMsg() );
			}
			break;
		case CONSULTAR:
			redirectPage = "ListaEditora.jsp";
			request.setAttribute( "header"             , "PESQUISA"              );
			request.setAttribute( "entidadeEnviada"    , resultado.getEntidade() );
			request.setAttribute( "resultadoConsultar" , resultado               );
			break;
		case NOVO:
			request.setAttribute( "header" , "NOVA EDITORA" );
			redirectPage = "FormEditora.jsp";
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
	public Editora buildEntidade( String id , String nome ) {
		Editora editora = new Editora();
		if( id != null && id.length() > 0) {
			editora.setId(Integer.parseInt(id));
		}
		if( nome != null && nome.length() > 0 ) {
			editora.setNome(nome);
		}

		return editora;
	}

}
