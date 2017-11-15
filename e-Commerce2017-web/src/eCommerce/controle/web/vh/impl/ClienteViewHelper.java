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
import eCommerce.dominio.Cliente;
import eCommerce.dominio.EntidadeDominio;
import eCommerce.dominio.Pais;

public class ClienteViewHelper implements IViewHelper{
	@Override
	public EntidadeDominio getEntidade(HttpServletRequest request) {
		
		String email           = request.getParameter( "cliente_email" );
		String senha           = request.getParameter( "cliente_senha" );
		String senha_confirmar = request.getParameter( "cliente_senha_confirmar" );
		String nome            = request.getParameter( "cliente_nome" );
		String sexo            = request.getParameter( "cliente_sexo" );
		String datanasc        = request.getParameter( "cliente_datanasc" );
		String cpf             = request.getParameter( "cliente_cpf" );
		String telefone        = request.getParameter( "cliente_telefone" );
		
		String cidade          = request.getParameter( "cliente_cidade_id" );
		String tiporesidencia  = request.getParameter( "cliente_tiporesidencia" );
		String tipologradouro  = request.getParameter( "cliente_tipologradouro" );
		String bairro          = request.getParameter( "cliente_bairro" );
		String cep			   = request.getParameter( "cliente_cep" );
		String logradouro      = request.getParameter( "" );
		String numero          = request.getParameter( "" );
		
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
