package eCommerce.dominio;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
	private List<Livro> livros;

	public Carrinho() {
		livros = new ArrayList<Livro>();
	}

	public void addLivro(Livro livro){
		livros.add(livro);
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

}