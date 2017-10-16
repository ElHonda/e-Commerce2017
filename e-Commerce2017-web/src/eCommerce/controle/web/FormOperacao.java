package eCommerce.controle.web;

import eCommerce.controle.web.vh.IViewHelper;
import eCommerce.core.aplicacao.EOperacao;

public class FormOperacao {
	private EOperacao operacao;
	private IViewHelper vh;
	private Boolean json;

	public FormOperacao( IViewHelper vh , EOperacao operacao ) {
		this.operacao = operacao;
		this.vh = vh;
		this.json = false;
	}
	
	public FormOperacao( IViewHelper vh , EOperacao operacao , Boolean isJson) {
		this.operacao = operacao;
		this.vh = vh;
		this.json = isJson;
	}
	
	public Boolean isJson(){
		return json;
	}
	
	public EOperacao getOperacao() {
		return operacao;
	}
	public IViewHelper getVh() {
		return vh;
	}
}
