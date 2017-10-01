package eCommerce.core.impl.negocio;

import eCommerce.core.IStrategy;
import eCommerce.dominio.EntidadeDominio;
import eCommerce.dominio.Livro;

public class ValidadorDadosObrigatoriosLivro implements IStrategy {

	/*
	 * Para todo livro cadastrado � obrigat�rio o cadastro dos 
	 * seguintes dados: autor, categoria, subcategoria, ano, 
	 * t�tulo, editora, edi��o, ISBN, n�mero de p�ginas, sinopse, 
	 * dimens�es (Altura, largura, peso e profundidade), grupo de
	 * precifica��o *e c�digo de barras.
     * c�digo de barras e ISBN s�o a mesma coisa.
	*/
	@Override
	public String processar(EntidadeDominio entidade) {		
		String retorno = null;
		
		if( entidade instanceof Livro ) {
			Livro l = (Livro)entidade;
			StringBuilder sb = new StringBuilder();
			
			if( l.getAutor() == null || l.getAutor().getId() <= 0 ) {
				sb.append("Autor n�o preenchido !" ).append("<br/>");
			}
			if( l.getCategorias() == null || l.getCategorias().size() <= 0 ) {
				sb.append("Deve haver ao menos uma categoria para o livro !" ).append("<br/>");
			}
			if( l.getSubcategorias() == null || l.getSubcategorias().size() <= 0 ) {
				sb.append("Deve haver ao menos uma sub-categoria para o livro !" ).append("<br/>");
			}
			if( l.getAno() == null || l.getAno() <= 0 ) {
				sb.append("Ano n�o preenchido !" ).append("<br/>");
			}
			if( l.getTitulo() == null || l.getTitulo().length() <= 0 ) {
				sb.append("T�tulo n�o preenchido !" ).append("<br/>");
			}
			if( l.getEditora() == null || l.getEditora().getId() <= 0 ) {
				sb.append( "Editora n�o preenchido !" ).append("<br/>");
			}
			if( l.getEdicao() == null || l.getEdicao().length() <= 0 ) {
				sb.append( "Edi��o n�o preenchida !" ).append("<br/>");
			}
			if( l.getIsbn() == null || l.getIsbn().length() <= 0 ) {
				sb.append( "ISBN n�o preenchido !" ).append("<br/>");
			}
			if( l.getNumeroPaginas() == null || l.getNumeroPaginas() <= 0 ) {
				sb.append( "N�mero de p�ginas n�o preenchido !" ).append("<br/>");
			}
			if( l.getSinopse() == null || l.getSinopse().length() <= 0 ) {
				sb.append("Sinopse n�o informada !" ).append("<br/>");
			}
			if( l.getGrupo() == null || l.getGrupo().getId() <= 0 ) {
				sb.append("Grupo de Pre�o n�o informado !").append("<br/>");
			}
			if( l.getDimensao() == null ) {
				sb.append("Dimens�es n�o informadas !").append("<br/>");
			}else {
				if ( l.getDimensao().getAltura() == null || l.getDimensao().getAltura() <= 0 ) {
					sb.append("Altura n�o informada !" ).append("<br/>");
				}
				if( l.getDimensao().getLargura() == null || l.getDimensao().getLargura() <= 0 ) {
					sb.append("Largura n�o informada !" ).append("<br/>");
				}
				if( l.getDimensao().getPeso() == null || l.getDimensao().getPeso() <= 0 ) {
					sb.append( "Peso n�o informado !" ).append("<br/>");
				}
				if( l.getDimensao().getProfundidade() == null || l.getDimensao().getProfundidade() <= 0 ) {
					sb.append( "Profundidade n�o informada !").append("<br/>");
				}
			}
			if( sb.toString() != null && sb.length() > 0 )
				retorno = sb.toString();
		}
		
		
		
		
		return retorno;
	}
}
