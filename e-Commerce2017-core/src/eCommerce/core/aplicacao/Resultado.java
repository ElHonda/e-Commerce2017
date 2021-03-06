
package eCommerce.core.aplicacao;

import java.util.ArrayList;
import java.util.List;

import eCommerce.dominio.EntidadeDominio;


public class Resultado extends EntidadeAplicacao {

	private String msg;
	private List<EntidadeDominio> entidades;
	private EntidadeDominio entidade;
	
	/**
	 * M�todo para recupera��o do valor enviado
	 */
	public EntidadeDominio getEntidade() {
		return entidade;
	}
	/**
	 * M�todo para salvar entidade enviada
	 * @param entidade enviada para opera��o
	 */
	public void setEntidade(EntidadeDominio entidade) {
		this.entidade = entidade;
	}
	/**
	 * M�todo de recupera��o do campo msg
	 *
	 * @return valor do campo msg
	 */
	public String getMsg() {
		return msg;
	}
	/**
	 * Valor de msg atribu�do a msg
	 *
	 * @param msg Atributo da Classe
	 */
	public void setMsg(String msg) {
		this.msg = msg;
	}
	/**
	 * M�todo de recupera��o do campo entidades
	 *
	 * @return valor do campo entidades
	 */
	public List<EntidadeDominio> getEntidades() {
		return entidades;
	}
	/**
	 * Valor de entidades atribu�do a entidades
	 *
	 * @param entidades Atributo da Classe
	 */
	public void setEntidades(List<EntidadeDominio> entidades) {
		this.entidades = entidades;
	}
	
	public void addEntidade(EntidadeDominio entidade) {
		if ( this.entidades == null ) {
			this.entidades = new ArrayList<EntidadeDominio>();
		}
		this.entidades.add(entidade);
	}
	
	
}
