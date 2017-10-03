
package eCommerce.controle.web.command.impl;

import eCommerce.core.aplicacao.Resultado;
import eCommerce.dominio.EntidadeDominio;


public class VisualizarCommand extends AbstractCommand{

	
	public Resultado execute(EntidadeDominio entidade) {
		
		return fachada.consultar_id(entidade);
	}

}
