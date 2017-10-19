package eCommerce.controle.web.vh.impl;

import java.io.IOException;

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
import eCommerce.dominio.Cliente;
import eCommerce.dominio.EntidadeDominio;
import eCommerce.dominio.Pais;

public class ClienteViewHelper implements IViewHelper{
	@Override
	public EntidadeDominio getEntidade(HttpServletRequest request) {
		return buildEntidade();
	}
	@Override
	public EntidadeDominio getEntidadeJSON(JsonBuilder jb){
		return buildEntidade();
	}
	@Override
	public void setView(Resultado resultado, HttpServletRequest request, 
			HttpServletResponse response, EOperacao operacao , Boolean ajaxResponse)
			throws IOException, ServletException {

		IFachada fachada = new Fachada();
		//StringBuilder sb = new StringBuilder();
		String redirectPage=null;
		Boolean useDispatch=true;

		switch (operacao) {
		case SALVAR:
			break;
		case ALTERAR:
			break;
		case VISUALIZAR:
			break;
		case EXCLUIR:
			break;
		case CONSULTAR:
			break;
		case NOVO:
			redirectPage = "FormCliente.jsp";
			Pais pais = new Pais();
			pais.setAtivo( true );
			request.setAttribute( "listaPais" , fachada.consultar( pais ) );
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
	public Cliente buildEntidade() {
		Cliente cliente = new Cliente();
		
		return cliente;
	}

}
