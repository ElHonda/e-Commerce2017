package eCommerce.core;

import eCommerce.dominio.EntidadeDominio;

public interface IStrategy 
{

	public String processar(EntidadeDominio entidade);
	
}
