package eCommerce.dominio;

public class Endereco extends EntidadeDominio {
	private String tipoResidencia;
	private String tipoLogradouro;
	private String logradouro;
	private String numero;
	private String bairro;
	private String cep;
	private Cidade cidade;
	private String observacoes;
	private EntidadeDominio enderecavel;
	
	public EntidadeDominio getEnderecavel() {
		return enderecavel;
	}
	public void setEnderecavel(EntidadeDominio enderecavel) {
		this.enderecavel = enderecavel;
	}
	public String getTipoResidencia() {
		return tipoResidencia;
	}
	public String getTipoLogradouro() {
		return tipoLogradouro;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public String getNumero() {
		return numero;
	}
	public String getBairro() {
		return bairro;
	}
	public String getCep() {
		return cep;
	}
	public Cidade getCidade() {
		return cidade;
	}
	public String getObservacoes() {
		return observacoes;
	}
	public void setTipoResidencia(String tipoResidencia) {
		this.tipoResidencia = tipoResidencia;
	}
	public void setTipoLogradouro(String tipoLogradouro) {
		this.tipoLogradouro = tipoLogradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	
	
}
