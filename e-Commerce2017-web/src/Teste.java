import eCommerce.dominio.EntidadeDominio;
import eCommerce.dominio.Livro;

public class Teste {

	public static void main(String[] args) {
		Livro l = new Livro();
		
		if( l instanceof EntidadeDominio ) {
			System.out.println("Exibe essa bagaça");
		}
	}

}
