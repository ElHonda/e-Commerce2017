package eCommerce.dominio;

public class GrupoPrecificacao extends EntidadeDominio {
	private String descricao;
	private Double margemLucro;
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getMargemLucro() {
		return margemLucro;
	}
	public void setMargemLucro(Double margemLucro) {
		this.margemLucro = margemLucro;
	}
	
}
