package eCommerce.dominio;

import java.util.ArrayList;
import java.util.List;

public class Livro extends EntidadeDominio {
	private Integer ano;
	private String titulo;
	private String edicao;
	private String isbn;
	private String sinopse;
	private Integer numeroPaginas;
	private Boolean ativo;
	private Integer quantidade;

	private GrupoPrecificacao grupo;
	private Autor autor;
	private Editora editora;
	private Dimensao dimensao;
	private List<LivroCategoria> categorias;
	private List<LivroSubCategoria> subcategorias;


	public Livro() {
		this.dimensao = new Dimensao();
	}
	
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	public void addSubCategoria( LivroSubCategoria subcategoria ) {
		if( subcategorias == null )
			subcategorias = new ArrayList<LivroSubCategoria>();
		subcategoria.setLivro(this);
		subcategorias.add(subcategoria);
	}
	public void addCategoria( LivroCategoria categoria ) {
		if( categorias == null )
			categorias = new ArrayList<LivroCategoria>();
		categoria.setLivro(this);
		categorias.add(categoria);
	}
	public void removeCategoria( LivroCategoria categoria ) {
		if( categorias != null ) {
			for( int i = 0 ; i < categorias.size(); i++ ) {
				if( categorias.get(i).equals(categoria) ) {
					categorias.remove(i);
				}
			}
		}
	}
	public void removeSubCategoria( LivroSubCategoria subcategoria ) {
		if( subcategorias != null ) {
			for( int i = 0 ; i < subcategorias.size(); i++ ) {
				if( subcategorias.get(i).equals(subcategoria) ) {
					subcategorias.remove(i);
				}
			}
		}
	}
	public List<LivroCategoria> getCategorias() {
		return categorias;
	}
	public void setCategorias(List<LivroCategoria> categorias) {
		this.categorias = categorias;
	}
	public List<LivroSubCategoria> getSubcategorias() {
		return subcategorias;
	}
	
	public void setSubcategorias(List<LivroSubCategoria> subcategorias) {
		this.subcategorias = subcategorias;
	}
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getEdicao() {
		return edicao;
	}
	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}
	public Editora getEditora() {
		return editora;
	}
	public void setEditora(Editora editora) {
		this.editora = editora;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public Integer getNumeroPaginas() {
		return numeroPaginas;
	}
	public void setNumeroPaginas(Integer numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	public String getSinopse() {
		return sinopse;
	}
	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}
	public Dimensao getDimensao() {
		return dimensao;
	}
	public void setDimensao(Dimensao dimensao) {
		this.dimensao = dimensao;
	}
	public Boolean getAtivo() {
		return ativo;
	}
	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
	public GrupoPrecificacao getGrupo() {
		return grupo;
	}
	public void setGrupo(GrupoPrecificacao grupo) {
		this.grupo = grupo;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
}
