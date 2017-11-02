
package eCommerce.controle.web.vh;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import eCommerce.core.aplicacao.EOperacao;
import eCommerce.core.aplicacao.Resultado;
import eCommerce.dominio.EntidadeDominio;


public interface IViewHelper {

	public EntidadeDominio getEntidade(HttpServletRequest request);
	public void setView(Resultado resultado, 
			HttpServletRequest request, HttpServletResponse response, EOperacao operacao, Boolean ajaxResponse )throws IOException, ServletException;
	
}
