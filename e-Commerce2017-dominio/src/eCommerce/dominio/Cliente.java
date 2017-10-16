package eCommerce.dominio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cliente extends EntidadeDominio{
	/**
	 * TODO Preparar classe para definir endereço preferencial do cliente.
	 */
	private boolean admin=false;
	private Boolean ativo;
	private String email;
	private String senha;
	private ESexo sexo;
	private String nome;
	private Double ranking;
	private Date dataNasc;
	private String cpf;
	private Telefone telefone;
	private List<Endereco> enderecos;
	
	public void addEndereco( Endereco endereco ) {
		if( enderecos == null )
			enderecos = new ArrayList<Endereco>();
		enderecos.add(endereco);
	}
	public List<Endereco> getEnderecos() {
		return enderecos;
	}
	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}
	public Double getRanking() {
		return ranking;
	}
	public void setRanking(Double ranking) {
		this.ranking = ranking;
	}
	public Boolean getAtivo() {
		return ativo;
	}
	public String getEmail() {
		return email;
	}
	public String getSenha() {
		return senha;
	}
	public ESexo getSexo() {
		return sexo;
	}
	public String getNome() {
		return nome;
	}
	public Date getDataNasc() {
		return dataNasc;
	}
	public String getCpf() {
		return cpf;
	}
	public Telefone getTelefone() {
		return telefone;
	}
	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public void setSexo(ESexo sexo) {
		this.sexo = sexo;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}
	public boolean isAdmin() {
		return admin;
	}
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
}
