package eCommerce.core.impl.negocio;

import eCommerce.core.IStrategy;
import eCommerce.dominio.EntidadeDominio;
import eCommerce.dominio.Telefone;

public class ValidadorDadosObrigatoriosTelefone implements IStrategy{

	
	public String processar(EntidadeDominio entidade) {		
		String retorno = null;
		
		if( entidade instanceof Telefone ) {
			Telefone t = (Telefone)entidade;
			StringBuilder sb = new StringBuilder();
			
			if( t.getTipo() == null || t.getTipo().length() <= 0 ) {
				sb.append("Tipo de Telefone não preenchido !" ).append("<br/>");
			}
			if( t.getDdd() == null || t.getDdd().length() <= 0 ) {
				sb.append("DDD não preenchido !" ).append("<br/>");
			}
			if( t.getNumero() == null || t.getNumero().length() <= 0 ) {
				sb.append("Número do telefone não preenchido !" ).append("<br/>");
			}
			
			if( sb.toString() != null && sb.length() > 0 )
				retorno = sb.toString();
		}
		
		return retorno;
	}

}
