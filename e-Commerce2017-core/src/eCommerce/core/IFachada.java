package eCommerce.core;

import eCommerce.core.aplicacao.Resultado;
import eCommerce.dominio.EntidadeDominio;

public interface IFachada {

	public Resultado salvar(EntidadeDominio entidade);
	public Resultado alterar(EntidadeDominio entidade);
	public Resultado excluir(EntidadeDominio entidade);
	public Resultado consultar(EntidadeDominio entidade);
	public Resultado consultar_id( EntidadeDominio entidade);
	//public Resultado visualizar(EntidadeDominio entidade);
	
	
}
