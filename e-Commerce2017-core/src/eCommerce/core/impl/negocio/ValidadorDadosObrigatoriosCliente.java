package eCommerce.core.impl.negocio;

import eCommerce.core.IStrategy;
import eCommerce.dominio.Cliente;
import eCommerce.dominio.EntidadeDominio;

public class ValidadorDadosObrigatoriosCliente implements IStrategy{

	@Override
	public String processar(EntidadeDominio entidade) {
		String retorno = null;
		
		if( entidade instanceof Cliente ) {
			Cliente c = (Cliente)entidade;
			StringBuilder sb = new StringBuilder();
			
			if( c.getEmail() == null || c.getEmail().length() <= 0 ) {
				sb.append("Email n�o informado !").append("</br>");
			}
			if( c.getSenha() == null || c.getSenha().length() <= 0 ) {
				sb.append("Senha n�o informada !").append("</br>");
			}else{
				if( c.getSenha_confirmar() == null || !c.getSenha_confirmar().equals( c.getSenha() ) ){
					sb.append("Senha n�o confere !" ).append("</br>");
				}
			}
			if( c.getNome() == null || c.getNome().length() <= 0 ) {
				sb.append("Nome n�o informado !").append("</br>");
			}
			if( c.getSexo() == null || c.getSexo().toString().length() <= 0 ) {
				sb.append( "G�nero n�o informado !").append("</br>");
			}
			if( c.getDataNasc() == null || c.getDataNasc().toString().length() <= 0 ) {
				sb.append("Data de nascimento n�o informada !").append("</br>");
			}
			if( c.getCpf() == null || c.getCpf().length() <= 0 ) {
				sb.append("CPF n�o informado !").append("</br>");
			}
			if( c.getTelefones() == null || c.getTelefones().size() <= 0 ) {
				sb.append("Cliente deve ter ao menos 1 telefone !" ).append("</br>");
			}
			if( c.getEnderecos() == null || c.getEnderecos().size() <= 0 ) {
				sb.append("Cliente deve ter ao menos 1 endere�o !" ).append("</br>");
			}
			if( sb.toString() != null && sb.length() > 0 ) {
				retorno = sb.toString();
			}
		}
		return retorno;
	}

}
