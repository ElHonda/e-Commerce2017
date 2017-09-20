package eCommerce.dominio;

public class Dimensao extends EntidadeDominio{
	private Double altura;
	private Double largura;
	private Double peso;
	private Double profundidade;
	private EntidadeDominio dimensionavel;

	public Double getAltura() {
		return altura;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	public Double getLargura() {
		return largura;
	}
	public void setLargura(Double largura) {
		this.largura = largura;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public Double getProfundidade() {
		return profundidade;
	}
	public void setProfundidade(Double profundidade) {
		this.profundidade = profundidade;
	}
	public EntidadeDominio getDimensionavel() {
		return dimensionavel;
	}
	public void setDimensionavel(EntidadeDominio dimensionavel) {
		this.dimensionavel = dimensionavel;
	}

}
