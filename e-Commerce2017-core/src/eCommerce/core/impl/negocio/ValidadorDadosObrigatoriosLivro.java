package eCommerce.core.impl.negocio;

import eCommerce.core.IStrategy;
import eCommerce.dominio.EntidadeDominio;
import eCommerce.dominio.Livro;

public class ValidadorDadosObrigatoriosLivro implements IStrategy {

	/*
	 * Para todo livro cadastrado é obrigatório o cadastro dos 
	 * seguintes dados: autor, categoria, subcategoria, ano, 
	 * título, editora, edição, ISBN, número de páginas, sinopse, 
	 * dimensões (Altura, largura, peso e profundidade), grupo de
	 * precificação *e código de barras.
     * código de barras e ISBN são a mesma coisa.
	*/
	@Override
	public String processar(EntidadeDominio entidade) {		
		String retorno = null;
		
		if( entidade instanceof Livro ) {
			Livro l = (Livro)entidade;
			StringBuilder sb = new StringBuilder();
			
			if( l.getAutor() == null || l.getAutor().getId() <= 0 ) {
				sb.append("Autor não preenchido !" ).append("<br/>");
			}
			if( l.getCategorias() == null || l.getCategorias().size() <= 0 ) {
				sb.append("Deve haver ao menos uma categoria para o livro !" ).append("<br/>");
			}
			if( l.getSubcategorias() == null || l.getSubcategorias().size() <= 0 ) {
				sb.append("Deve haver ao menos uma sub-categoria para o livro !" ).append("<br/>");
			}
			if( l.getAno() == null || l.getAno() <= 0 ) {
				sb.append("Ano não preenchido !" ).append("<br/>");
			}
			if( l.getTitulo() == null || l.getTitulo().length() <= 0 ) {
				sb.append("Título não preenchido !" ).append("<br/>");
			}
			if( l.getEditora() == null || l.getEditora().getId() <= 0 ) {
				sb.append( "Editora não preenchido !" ).append("<br/>");
			}
			if( l.getEdicao() == null || l.getEdicao().length() <= 0 ) {
				sb.append( "Edição não preenchida !" ).append("<br/>");
			}
			if( l.getIsbn() == null || l.getIsbn().length() <= 0 ) {
				sb.append( "ISBN não preenchido !" ).append("<br/>");
			}
			if( l.getNumeroPaginas() == null || l.getNumeroPaginas() <= 0 ) {
				sb.append( "Número de páginas não preenchido !" ).append("<br/>");
			}
			if( l.getSinopse() == null || l.getSinopse().length() <= 0 ) {
				sb.append("Sinopse não informada !" ).append("<br/>");
			}
			if( l.getGrupo() == null || l.getGrupo().getId() <= 0 ) {
				sb.append("Grupo de Preço não informado !").append("<br/>");
			}
			if( l.getDimensao() == null ) {
				sb.append("Dimensões não informadas !").append("<br/>");
			}else {
				if ( l.getDimensao().getAltura() == null || l.getDimensao().getAltura() <= 0 ) {
					sb.append("Altura não informada !" ).append("<br/>");
				}
				if( l.getDimensao().getLargura() == null || l.getDimensao().getLargura() <= 0 ) {
					sb.append("Largura não informada !" ).append("<br/>");
				}
				if( l.getDimensao().getPeso() == null || l.getDimensao().getPeso() <= 0 ) {
					sb.append( "Peso não informado !" ).append("<br/>");
				}
				if( l.getDimensao().getProfundidade() == null || l.getDimensao().getProfundidade() <= 0 ) {
					sb.append( "Profundidade não informada !").append("<br/>");
				}
			}
			if( sb.toString() != null && sb.length() > 0 )
				retorno = sb.toString();
		}
		
		
		
		
		return retorno;
	}
}
