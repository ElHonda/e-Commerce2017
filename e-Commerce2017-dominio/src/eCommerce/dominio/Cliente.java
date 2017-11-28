package eCommerce.dominio;

import java.text.SimpleDateFormat;
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
	private String senha_confirmar;
	private ESexo sexo;
	private String nome;
	private Double ranking;
	private Date dataNasc;
	private String cpf;
	private List<Telefone> telefones;
	private List<Endereco> enderecos;
	
	public Cliente(){
		this.ranking = 0d;
		this.ativo = true;
		this.telefones = new ArrayList<Telefone>();
		this.enderecos = new ArrayList<Endereco>();
	}
	
	public void addTelefone( Telefone telefone ) {
		if( telefones == null ){
			telefones = new ArrayList<Telefone>();
		}
		telefones.add(telefone);
	}
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
	public List<Telefone> getTelefones() {
		return telefones;
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
	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}
	public boolean isAdmin() {
		return admin;
	}
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	public String getSenha_confirmar() {
		return senha_confirmar;
	}
	public void setSenha_confirmar(String senha_confirmar) {
		this.senha_confirmar = senha_confirmar;
	}
	public String getDataNascFormatada(String format) {
		String retorno = "";
		SimpleDateFormat formatter = new SimpleDateFormat( format );
		
		if( this.dataNasc != null ) {
			retorno = formatter.format( this.dataNasc );
		}

	    return retorno;
	}
}
