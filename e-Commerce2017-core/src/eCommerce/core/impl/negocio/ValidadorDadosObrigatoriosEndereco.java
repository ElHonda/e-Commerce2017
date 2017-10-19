package eCommerce.core.impl.negocio;

import eCommerce.core.IStrategy;
import eCommerce.dominio.Endereco;
import eCommerce.dominio.EntidadeDominio;

public class ValidadorDadosObrigatoriosEndereco implements IStrategy{

	@Override
	public String processar(EntidadeDominio entidade) {		
		String retorno = null;
		
		if( entidade instanceof Endereco ) {
			Endereco e = (Endereco)entidade;
			StringBuilder sb = new StringBuilder();
			
			if( e.getTipoResidencia() == null || e.getTipoResidencia().toString().length() <= 0 ) {
				sb.append("Tipo de Resid�ncia n�o informado !").append("<br/>");
			}
			
			if( e.getTipoLogradouro() == null || e.getTipoLogradouro().toString().length() <= 0 ) {
				sb.append("Tipo de Logradouro n�o informado !" ).append("<br/>");
			}
			
			if( e.getLogradouro() == null || e.getLogradouro().length() <= 0 ) {
				sb.append( "Logradouro n�o informado !").append("<br/>");
			}
			
			if( e.getNumero() == null || e.getNumero().length() <= 0 ) {
				sb.append( "N�mero do endere�o n�o informado !" ).append("<br/>");
			}
			
			if( e.getBairro() == null || e.getBairro().length() <= 0 ) {
				sb.append( "Bairro n�o informado !" );
			}
			
			if( e.getCep() == null || e.getCep().length() <= 0 ) {
				sb.append( "CEP n�o informado !" ).append("<br/>");
			}
			
			if( e.getCidade() == null || e.getCidade().getId() <= 0 ) {
				sb.append( "Cidade n�o informada !" ).append("<br/>");
			}
			
			if( sb.toString() != null && sb.length() > 0 )
				retorno = sb.toString();
		}

		return retorno;
	}

}
