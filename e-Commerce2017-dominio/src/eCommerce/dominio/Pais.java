package eCommerce.dominio;

public class Pais  extends EntidadeDominio{
	public String nome;
	public String alphacode;
	public Boolean ativo=true;
	
	public Boolean getAtivo() {
		return ativo;
	}
	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAlphacode() {
		return alphacode;
	}
	public void setAlphacode(String alphacode) {
		this.alphacode = alphacode;
	}

	
}
