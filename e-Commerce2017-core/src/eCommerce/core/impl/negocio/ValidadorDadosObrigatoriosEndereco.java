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
			
			if( e.getTipoResidencia() == null || e.getTipoResidencia().length() <= 0 ) {
				sb.append("Tipo de Residência não informado !").append("<br/>");
			}
			
			if( e.getTipoLogradouro() == null || e.getTipoLogradouro().length() <= 0 ) {
				sb.append("Tipo de Logradouro não informado !" ).append("<br/>");
			}
			
			if( e.getLogradouro() == null || e.getLogradouro().length() <= 0 ) {
				sb.append( "Logradouro não informado !").append("<br/>");
			}
			
			if( e.getNumero() == null || e.getNumero().length() <= 0 ) {
				sb.append( "Número do endereço não informado !" ).append("<br/>");
			}
			
			if( e.getBairro() == null || e.getBairro().length() <= 0 ) {
				sb.append( "Bairro não informado !" );
			}
			
			if( e.getCep() == null || e.getCep().length() <= 0 ) {
				sb.append( "CEP não informado !" ).append("<br/>");
			}
			
			if( e.getCidade() == null || e.getCidade().getId() <= 0 ) {
				sb.append( "Cidade não informada !" ).append("<br/>");
			}
			
			if( sb.toString() != null && sb.length() > 0 )
				retorno = sb.toString();
		}

		return retorno;
	}

}
