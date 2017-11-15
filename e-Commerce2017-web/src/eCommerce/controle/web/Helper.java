package eCommerce.controle.web;

import eCommerce.controle.web.vh.IViewHelper;
import eCommerce.core.aplicacao.EOperacao;

public class Helper {
	private EOperacao operacao;
	private IViewHelper vh;
	private Boolean json;
	private Boolean useCommand=true;

	public Helper( IViewHelper vh , EOperacao operacao ) {
		this.operacao = operacao;
		this.vh = vh;
		this.json = false;
	}
	
	public Helper( IViewHelper vh , EOperacao operacao , Boolean isJson) {
		this.operacao = operacao;
		this.vh = vh;
		this.json = isJson;
	}
	
	public Helper( IViewHelper vh , EOperacao operacao, Boolean isJson, Boolean useCommand ) {
		this.operacao = operacao;
		this.vh = vh;
		this.json = isJson;
		this.useCommand = useCommand;
		
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

	public Boolean getUseCommand() {
		return useCommand;
	}

	public void setUseCommand(Boolean useCommand) {
		this.useCommand = useCommand;
	}
}
