package eCommerce.dominio;

public class LivroSubCategoria extends EntidadeDominio{
	private SubCategoria subcategoria;
	private Livro livro;
	
	public SubCategoria getSubcategoria() {
		return subcategoria;
	}
	public void setSubcategoria(SubCategoria subcategoria) {
		this.subcategoria = subcategoria;
	}
	public Livro getLivro() {
		return livro;
	}
	public void setLivro(Livro livro) {
		this.livro = livro;
	}
}
