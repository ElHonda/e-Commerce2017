package eCommerce.controle.web.vh.impl;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import eCommerce.controle.web.vh.IViewHelper;
import eCommerce.core.IFachada;
import eCommerce.core.aplicacao.EOperacao;
import eCommerce.core.aplicacao.Resultado;
import eCommerce.core.impl.controle.Fachada;
import eCommerce.dominio.Cidade;
import eCommerce.dominio.Cliente;
import eCommerce.dominio.ESexo;
import eCommerce.dominio.ETipoLogradouro;
import eCommerce.dominio.ETipoResidencia;
import eCommerce.dominio.ETipoTelefone;
import eCommerce.dominio.Endereco;
import eCommerce.dominio.EntidadeDominio;
import eCommerce.dominio.Pais;
import eCommerce.dominio.Telefone;

public class ClienteViewHelper implements IViewHelper{
	@Override
	public EntidadeDominio getEntidade(HttpServletRequest request) {
		
		String email           = request.getParameter( "cliente_email"           );
		String senha           = request.getParameter( "cliente_senha"           );
		String senha_confirmar = request.getParameter( "cliente_senha_confirmar" );
		String nome            = request.getParameter( "cliente_nome"            );
		String sexo            = request.getParameter( "cliente_sexo"            );
		String datanasc        = request.getParameter( "cliente_datanasc"        );
		String cpf             = request.getParameter( "cliente_cpf"             );

		List<Telefone> telefones = new ArrayList<Telefone>();
		Telefone telefone;
		String telefone_index  = null;
		String telefone_id     = null;
		String telefone_tipo   = null;
		String telefone_ddd    = null;
		String telefone_numero = null;

		for( Integer index = 0 ; ; index++ ) {
			telefone_index = request.getParameter("cliente_telefone_" + index.toString() );
			if( telefone_index == null || telefone_index.length() <= 0 ) {
				break;
			}else{
				telefone = new Telefone();
				telefone_id     = request.getParameter("cliente_telefone_id_"     + index.toString() );
				telefone_tipo   = request.getParameter("cliente_telefone_tipo_"   + index.toString() );
				telefone_ddd    = request.getParameter("cliente_telefone_ddd_"    + index.toString() );
				telefone_numero = request.getParameter("cliente_telefone_numero_" + index.toString() );
				
				if( telefone_id != null && telefone_id.length() > 0 ) {
					telefone.setId(Integer.parseInt(telefone_id));
				}
				if( telefone_tipo != null && telefone_tipo.length() > 0 ) {
					telefone.setTipo(ETipoTelefone.valueOf(telefone_tipo));
				}
				if( telefone_ddd != null && telefone_ddd.length() > 0 ) {
					telefone.setDdd(telefone_ddd);
				}
				if( telefone_numero != null && telefone_numero.length() > 0 ) {
					telefone.setNumero(telefone_numero);
				}
				telefones.add(telefone);
			}
		}
		
		List<Endereco> enderecos = new ArrayList<Endereco>();
		Endereco endereco;
		Cidade cidade;
		String endereco_index  = null;
		String endereco_id     = null;
		String cidade_id       = null;
		String tiporesidencia  = null;
		String tipologradouro  = null;
		String bairro          = null;
		String cep			   = null;
		String logradouro      = null;
		String numero          = null;
		String observacao      = null;
		
		for( Integer index = 0 ; ; index++ ) {
			endereco_index = request.getParameter("cliente_endereco_" + index.toString() );
			if( endereco_index == null || endereco_index.length() <= 0 ) {
				break;
			}else{
				endereco = new Endereco();
				endereco_id    = request.getParameter("cliente_endereco_id_" + index.toString() );
				cidade_id      = request.getParameter("cliente_endereco_cidade_id_" + index.toString() );
				tiporesidencia = request.getParameter("cliente_endereco_tiporesidencia_" + index.toString() );
				tipologradouro = request.getParameter("cliente_endereco_tipologradouro_" + index.toString() );
				bairro         = request.getParameter("cliente_endereco_bairro_" + index.toString() );
				cep			   = request.getParameter("cliente_endereco_cep_" + index.toString() );
				logradouro     = request.getParameter("cliente_endereco_logradouro_" + index.toString() );
				numero         = request.getParameter("cliente_endereco_numero_" + index.toString() );
				observacao     = request.getParameter("cliente_endereco_observacao_" + index.toString() );
				if( endereco_id != null && endereco_id.length() > 0 ) {
					endereco.setId(Integer.parseInt(endereco_id));
				}
				if( cidade_id != null && cidade_id.length() > 0 ) {
					cidade = new Cidade();
					cidade.setId(Integer.parseInt(cidade_id));
					endereco.setCidade(cidade);
				}
				if( tiporesidencia != null && tiporesidencia.length() > 0 ) {
					endereco.setTipoResidencia(ETipoResidencia.valueOf(tiporesidencia));
				}
				if( tipologradouro != null && tipologradouro.length() > 0 ) {
					endereco.setTipoLogradouro(ETipoLogradouro.valueOf(tipologradouro));
				}
				if( bairro != null && bairro.length() > 0 ) {
					endereco.setBairro(bairro);
				}
				if( cep != null && cep.length() > 0 ) {
					endereco.setCep(cep);
				}
				if( logradouro != null && logradouro.length() > 0 ) {
					endereco.setLogradouro(logradouro);
				}
				if( numero != null & numero.length() > 0 ) {
					endereco.setNumero(numero);
				}
				if( observacao != null && observacao.length() > 0 ) {
					endereco.setObservacoes(observacao);
				}
				enderecos.add(endereco);
			}
		}
		
		return buildEntidade(email, senha, senha_confirmar, nome, sexo, datanasc, cpf, enderecos, telefones);
	}

	@Override
	public void setView(Resultado resultado, HttpServletRequest request, 
			HttpServletResponse response, EOperacao operacao , Boolean ajaxResponse)
			throws IOException, ServletException {

		IFachada fachada = new Fachada();
		StringBuilder sb = new StringBuilder();
		String redirectPage=null;
		Boolean useDispatch=true;
		Cliente cliente = null;
		System.out.println("----------------------------------------------------------------------");
		System.out.println("setView::ClienteViewHelper");

		switch (operacao) {
		case SALVAR:
			if( resultado.getMsg() == null || resultado.getMsg().length() == 0 ) {
				System.out.println("Operação foi um sucesso!");

				useDispatch = false;
				// Neste momento, a página se encontra com a URI: /e-Commerce2017-web/Cliente/RegistrarCliente,
				// portanto, será necessário voltar uma pasta para conseguir acesar a Lista de Compras.
				redirectPage = "../Carrinho/ListaCarrinho";
				cliente = (Cliente)resultado.getEntidades().get(0);
				sb.append( "Bem Vindo " );
				sb.append( cliente.getNome() );
				request.getSession().setAttribute("current_cliente", cliente);
				request.getSession().setAttribute("sucessoMsg", sb.toString() );
			}else{
				System.out.println("Operação com problemas!");
				System.out.println("Mensagem de Retorno: " + resultado.getMsg());
				redirectPage = (String)request.getSession().getAttribute( "pageRedirect" );
				if( redirectPage == null || redirectPage.equals("") ) {
					redirectPage = "ListaCarrinho";
				}else{
					useDispatch = false;
					redirectPage = redirectPage.substring(0, redirectPage.lastIndexOf(".") );
				}
				request.getSession().setAttribute( "errorMsg" , resultado.getMsg()      );
				request.getSession().setAttribute( "current_cliente" , resultado.getEntidade() );
			}
			break;
		case ALTERAR:
			break;
		case VISUALIZAR:
			break;
		case EXCLUIR:
			break;
		case CONSULTAR:
			break;
		case NOVO:
			redirectPage = "FormCliente.jsp";
			Pais pais = new Pais();
			pais.setAtivo( true );
			request.setAttribute( "listaPais" , fachada.consultar( pais ) );
			break;
		default:
			break;
		}
		
		if( useDispatch ) {
			RequestDispatcher dispatch = request.getRequestDispatcher(redirectPage);
			dispatch.forward(request, response);
		}else {
			response.sendRedirect(redirectPage);
		}
		
	}
	public Cliente buildEntidade( String email
			                    , String senha
			                    , String senha_confirmar
			                    , String nome
			                    , String sexo
			                    , String datanasc
			                    , String cpf
			                    , List<Endereco> enderecos
			                    , List<Telefone> telefones ) {
		Cliente cliente = new Cliente();
		
		if( email != null && email.length() > 0 ) {
			cliente.setEmail(email);
		}
		if( senha != null && senha.length() > 0 ) {
			cliente.setSenha(senha);
		}
		if( senha_confirmar != null && senha_confirmar.length() > 0 ) {
			cliente.setSenha_confirmar(senha_confirmar);
		}
		if( nome != null && nome.length() > 0 ) {
			cliente.setNome(nome);
		}
		if( sexo != null && sexo.length() > 0 ) {
			cliente.setSexo(ESexo.valueOf(sexo));
		}
		if( datanasc != null && datanasc.length() > 0 ) {
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			java.sql.Date data = null;
			try {
				data = new java.sql.Date(format.parse(datanasc).getTime());
			} catch (ParseException e) {
				e.printStackTrace();
			}
			cliente.setDataNasc(data);
		}
		if( cpf != null && cpf.length() > 0 ) {
			cliente.setCpf(cpf);
		}
		if( enderecos != null && enderecos.size() > 0 ) {
			cliente.setEnderecos(enderecos);
		}
		if( telefones != null && telefones.size() > 0 ) {
			cliente.setTelefones(telefones);
		}
		return cliente;
	}

}
