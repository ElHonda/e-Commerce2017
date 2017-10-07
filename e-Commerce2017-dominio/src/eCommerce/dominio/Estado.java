package eCommerce.dominio;

public class Estado extends EntidadeDominio{

	private String nome;
	private Pais pais;
	
	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
}
