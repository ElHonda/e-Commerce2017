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

	private Autor autor;
	private Editora editora;
	private Dimensao dimensao;
	private List<Categoria> categorias;
	private List<SubCategoria> subcategorias;

	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	public void addSubCategoria( SubCategoria subcategoria ) {
		if( subcategorias == null )
			subcategorias = new ArrayList<SubCategoria>();
		subcategorias.add(subcategoria);
	}
	public void addCategoria( Categoria categoria ) {
		if( categorias == null )
			categorias = new ArrayList<Categoria>();
		categorias.add(categoria);
	}
	public List<Categoria> getCategorias() {
		return categorias;
	}
	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}
	public List<SubCategoria> getSubcategorias() {
		return subcategorias;
	}
	
	public void setSubcategorias(List<SubCategoria> subcategorias) {
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
}
