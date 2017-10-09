package eCommerce.dominio;

public class Telefone extends EntidadeDominio{
	private String tipo;
	private String ddd;
	private String numero;
	private EntidadeDominio telefonavel;
	
	public EntidadeDominio getTelefonavel() {
		return telefonavel;
	}
	public void setTelefonavel(EntidadeDominio telefonavel) {
		this.telefonavel = telefonavel;
	}
	public String getTipo() {
		return tipo;
	}
	public String getDdd() {
		return ddd;
	}
	public String getNumero() {
		return numero;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
}
