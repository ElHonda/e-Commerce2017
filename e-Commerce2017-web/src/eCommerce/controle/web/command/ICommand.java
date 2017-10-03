
package eCommerce.controle.web.command;

import eCommerce.core.aplicacao.Resultado;
import eCommerce.dominio.EntidadeDominio;


public interface ICommand {

	public Resultado execute(EntidadeDominio entidade);
	
}
