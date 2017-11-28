package eCommerce.dominio;

public class Telefone extends EntidadeDominio{
	private ETipoTelefone tipo;
	private String ddd;
	private String numero;
	private EntidadeDominio telefonavel;
	
	public EntidadeDominio getTelefonavel() {
		return telefonavel;
	}
	public void setTelefonavel(EntidadeDominio telefonavel) {
		this.telefonavel = telefonavel;
	}
	public ETipoTelefone getTipo() {
		return tipo;
	}
	public String getDdd() {
		return ddd;
	}
	public String getNumero() {
		return numero;
	}
	public void setTipo(ETipoTelefone tipo) {
		this.tipo = tipo;
	}
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
}
