package eCommerce.core.impl.negocio;

import eCommerce.core.IStrategy;
import eCommerce.dominio.EntidadeDominio;

public class ValidadorDadosObrigatoriosCliente implements IStrategy{

	@Override
	public String processar(EntidadeDominio entidade) {
		// TODO Auto-generated method stub
		return null;
		// Gênero
		// Nome
		// Data de Nascimento
		// CPF, Telefone (deve ser composto pelo tipo, DDD e número), e-mail, senha, endereço residencial.
	}

}
