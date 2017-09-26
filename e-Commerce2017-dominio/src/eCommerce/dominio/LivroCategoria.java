package eCommerce.dominio;

public class LivroCategoria extends EntidadeDominio {
	private Categoria categoria;
	private Livro livro;

	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public Livro getLivro() {
		return livro;
	}
	public void setLivro(Livro livro) {
		this.livro = livro;
	}
}
