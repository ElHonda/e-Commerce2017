package eCommerce.core.impl.controle;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import eCommerce.core.IDAO;
import eCommerce.core.IFachada;
import eCommerce.core.IStrategy;
import eCommerce.core.aplicacao.EOperacao;
import eCommerce.core.aplicacao.Resultado;
import eCommerce.core.impl.dao.AutorDAO;
import eCommerce.core.impl.dao.CarrinhoDAO;
import eCommerce.core.impl.dao.CategoriaDAO;
import eCommerce.core.impl.dao.CidadeDAO;
import eCommerce.core.impl.dao.ClienteDAO;
import eCommerce.core.impl.dao.EditoraDAO;
import eCommerce.core.impl.dao.EnderecoDAO;
import eCommerce.core.impl.dao.EstadoDAO;
import eCommerce.core.impl.dao.GrupoPrecificacaoDAO;
import eCommerce.core.impl.dao.LivroDAO;
import eCommerce.core.impl.dao.PaisDAO;
import eCommerce.core.impl.dao.SubCategoriaDAO;
import eCommerce.core.impl.dao.TelefoneDAO;
import eCommerce.core.impl.negocio.ComplementarDtCadastro;
import eCommerce.core.impl.negocio.ValidadorDadosObrigatoriosCliente;
import eCommerce.core.impl.negocio.ValidadorDadosObrigatoriosEndereco;
import eCommerce.core.impl.negocio.ValidadorDadosObrigatoriosLivro;
import eCommerce.core.impl.negocio.ValidadorDadosObrigatoriosTelefone;
import eCommerce.dominio.Autor;
import eCommerce.dominio.Carrinho;
import eCommerce.dominio.Categoria;
import eCommerce.dominio.Cidade;
import eCommerce.dominio.Cliente;
import eCommerce.dominio.Editora;
import eCommerce.dominio.Endereco;
import eCommerce.dominio.EntidadeDominio;
import eCommerce.dominio.Estado;
import eCommerce.dominio.GrupoPrecificacao;
import eCommerce.dominio.Livro;
import eCommerce.dominio.Pais;
import eCommerce.dominio.SubCategoria;
import eCommerce.dominio.Telefone;

public class Fachada implements IFachada {

	/** 
	 * Mapa de DAOS, será indexado pelo nome da entidade 
	 * O valor é uma instância do DAO para uma dada entidade; 
	 */
	private Map<String, IDAO> daos;
	
	/**
	 * Mapa para conter as regras de negócio de todas operações por entidade;
	 * O valor é um mapa que de regras de negócio indexado pela operação
	 */
	private Map<String, Map<EOperacao, List<IStrategy>>> rns;
	
	private Resultado resultado;
	
	
	public Fachada(){
		/* Intânciando o Map de DAOS */
		daos = new HashMap<String, IDAO>();
		/* Intânciando o Map de Regras de Negócio */
		rns = new HashMap<String, Map<EOperacao, List<IStrategy>>>();
		daos.put( Autor.class.getName()             , new AutorDAO()             );
		daos.put( Categoria.class.getName()         , new CategoriaDAO()         );
		daos.put( Editora.class.getName()           , new EditoraDAO()           );
		daos.put( GrupoPrecificacao.class.getName() , new GrupoPrecificacaoDAO() );
		daos.put( Livro.class.getName()             , new LivroDAO()             );
		daos.put( SubCategoria.class.getName()      , new SubCategoriaDAO()      );
		daos.put( Pais.class.getName()              , new PaisDAO()              );
		daos.put( Estado.class.getName()            , new EstadoDAO()            );
		daos.put( Cidade.class.getName()            , new CidadeDAO()            );
		daos.put( Endereco.class.getName()          , new EnderecoDAO()          );
		daos.put( Telefone.class.getName()		    , new TelefoneDAO()          );
		daos.put( Cliente.class.getName()           , new ClienteDAO()           );
		daos.put( Carrinho.class.getName()          , new CarrinhoDAO()		     );
		/* Criando instâncias dos DAOs a serem utilizados*/

		RegrarAutor();
		RegrarCategoria();
		RegrarEditora();
		RegrarGrupoPrecificacao();
		RegrarLivro();
		RegrarSubCategoria();
		//RegrarPais(); // Não é necessário por enquanto
		//RegrarEstado();
		//RegrarCidade();
		RegrarEndereco();
		RegrarTelefone();
		RegrarCliente();
	}
	private void RegrarAutor() {
		ComplementarDtCadastro cDtCadastro = new ComplementarDtCadastro();
		List<IStrategy> rnsSalvarAtor = new ArrayList<IStrategy>();
		rnsSalvarAtor.add(cDtCadastro);
		Map<EOperacao, List<IStrategy>> rnsAutor = new HashMap<EOperacao, List<IStrategy>>();
		rnsAutor.put(EOperacao.SALVAR, rnsSalvarAtor);	
		rns.put(Categoria.class.getName(), rnsAutor);
	}
	private void RegrarCategoria() {
		ComplementarDtCadastro cDtCadastro = new ComplementarDtCadastro();
		List<IStrategy> rnsSalvarCategoria = new ArrayList<IStrategy>();
		rnsSalvarCategoria.add(cDtCadastro);
		Map<EOperacao, List<IStrategy>> rnsCategoria = new HashMap<EOperacao, List<IStrategy>>();
		rnsCategoria.put(EOperacao.SALVAR, rnsSalvarCategoria);	
		rns.put(Categoria.class.getName(), rnsCategoria);
	}
	private void RegrarEditora() {
		ComplementarDtCadastro cDtCadastro = new ComplementarDtCadastro();
		List<IStrategy> rnsSalvarEditora = new ArrayList<IStrategy>();
		rnsSalvarEditora.add(cDtCadastro);
		Map<EOperacao, List<IStrategy>> rnsEditora = new HashMap<EOperacao, List<IStrategy>>();
		rnsEditora.put(EOperacao.SALVAR, rnsSalvarEditora);	
		rns.put(Categoria.class.getName(), rnsEditora);
	}
	private void RegrarGrupoPrecificacao() {
		ComplementarDtCadastro cDtCadastro = new ComplementarDtCadastro();
		List<IStrategy> rnsSalvarGrupoPrecificacao = new ArrayList<IStrategy>();
		rnsSalvarGrupoPrecificacao.add(cDtCadastro);
		Map<EOperacao, List<IStrategy>> rnsGrupoPrecificacao = new HashMap<EOperacao, List<IStrategy>>();
		rnsGrupoPrecificacao.put(EOperacao.SALVAR, rnsSalvarGrupoPrecificacao);	
		rns.put(GrupoPrecificacao.class.getName(), rnsGrupoPrecificacao);
	}
	private void RegrarLivro() {
		ComplementarDtCadastro cDtCadastro = new ComplementarDtCadastro();
		ValidadorDadosObrigatoriosLivro vrDadosObrigatoriosLivro = new ValidadorDadosObrigatoriosLivro();
		List<IStrategy> rnsSalvarLivro = new ArrayList<IStrategy>();
		List<IStrategy> rnsAlterarLivro = new ArrayList<IStrategy>();
		rnsSalvarLivro.add(cDtCadastro);
		rnsSalvarLivro.add(vrDadosObrigatoriosLivro);
		rnsAlterarLivro.add(vrDadosObrigatoriosLivro);
		Map<EOperacao, List<IStrategy>> rnsLivro = new HashMap<EOperacao, List<IStrategy>>();
		rnsLivro.put(EOperacao.SALVAR, rnsSalvarLivro);	
		rnsLivro.put(EOperacao.ALTERAR, rnsAlterarLivro);
		rns.put(Livro.class.getName(), rnsLivro);
	}	
	private void RegrarSubCategoria() {
		ComplementarDtCadastro cDtCadastro = new ComplementarDtCadastro();
		List<IStrategy> rnsSalvarSubCategoria = new ArrayList<IStrategy>();
		rnsSalvarSubCategoria.add(cDtCadastro);
		Map<EOperacao, List<IStrategy>> rnsSubCategoria = new HashMap<EOperacao, List<IStrategy>>();
		rnsSubCategoria.put(EOperacao.SALVAR, rnsSalvarSubCategoria);	
		rns.put(Categoria.class.getName(), rnsSubCategoria);
	}
	private void RegrarEndereco() {
		ComplementarDtCadastro cDtCadastro = new ComplementarDtCadastro();
		ValidadorDadosObrigatoriosEndereco vrDadosObrigatoriosEndereco = new ValidadorDadosObrigatoriosEndereco();
		List<IStrategy> rnsSalvarEndereco = new ArrayList<IStrategy>();
		List<IStrategy> rnsAlterarEndereco = new ArrayList<IStrategy>();
		rnsSalvarEndereco.add(cDtCadastro);
		rnsSalvarEndereco.add(vrDadosObrigatoriosEndereco);
		rnsAlterarEndereco.add(vrDadosObrigatoriosEndereco);
		Map<EOperacao, List<IStrategy>> rnsEndereco = new HashMap<EOperacao, List<IStrategy>>();
		rnsEndereco.put( EOperacao.SALVAR  , rnsSalvarEndereco  );
		rnsEndereco.put( EOperacao.ALTERAR , rnsAlterarEndereco );
		rns.put(Endereco.class.getName(), rnsEndereco);
	}
	private void RegrarTelefone() {
		ComplementarDtCadastro cDtCadastro = new ComplementarDtCadastro();
		ValidadorDadosObrigatoriosTelefone vrDadosObrigatoriosTelefone = new ValidadorDadosObrigatoriosTelefone();
		List<IStrategy> rnsSalvarTelefone = new ArrayList<IStrategy>();
		List<IStrategy> rnsAlterarTelefone = new ArrayList<IStrategy>();
		rnsSalvarTelefone.add(cDtCadastro);
		rnsSalvarTelefone.add(vrDadosObrigatoriosTelefone);
		rnsAlterarTelefone.add(vrDadosObrigatoriosTelefone);
		Map<EOperacao, List<IStrategy>> rnsTelefone = new HashMap<EOperacao, List<IStrategy>>();
		rnsTelefone.put(EOperacao.SALVAR  , rnsSalvarTelefone );	
		rnsTelefone.put(EOperacao.ALTERAR , rnsAlterarTelefone );
		rns.put(Telefone.class.getName(), rnsTelefone);
	}
	private void RegrarCliente() {
		ComplementarDtCadastro cDtCadastro = new ComplementarDtCadastro();
		ValidadorDadosObrigatoriosCliente vrDadosObrigatoriosCliente = new ValidadorDadosObrigatoriosCliente();
		List<IStrategy> rnsSalvarCliente = new ArrayList<IStrategy>();
		List<IStrategy> rnsAlterarCliente = new ArrayList<IStrategy>();
		rnsSalvarCliente.add(cDtCadastro);
		rnsSalvarCliente.add(vrDadosObrigatoriosCliente);
		rnsAlterarCliente.add(vrDadosObrigatoriosCliente);
		Map<EOperacao, List<IStrategy>> rnsCliente = new HashMap<EOperacao, List<IStrategy>>();
		rnsCliente.put( EOperacao.SALVAR  , rnsSalvarCliente );	
		rnsCliente.put( EOperacao.ALTERAR , rnsAlterarCliente );
		rns.put(Cliente.class.getName(), rnsCliente);
	}
	@Override
	public Resultado salvar(EntidadeDominio entidade) {
		resultado = new Resultado();
		// Salva entidade enviada
		resultado.setEntidade(entidade);
		
		String nmClasse = entidade.getClass().getName();	
		
		String msg = executarRegras(entidade, EOperacao.SALVAR );
		
		
		if(msg == null){
			IDAO dao = daos.get(nmClasse);
			try {
				dao.salvar(entidade);
				List<EntidadeDominio> entidades = new ArrayList<EntidadeDominio>();
				entidades.add(entidade);
				resultado.setEntidades(entidades);
			} catch (SQLException e) {
				e.printStackTrace();
				resultado.setMsg("Não foi possível realizar o registro!");
				
			}
		}else{
			resultado.setMsg(msg);
			resultado.addEntidade(entidade);
		}
		
		return resultado;
	}

	@Override
	public Resultado alterar(EntidadeDominio entidade) {
		resultado = new Resultado();
		// Salva entidade enviada
		resultado.setEntidade(entidade);
		String nmClasse = entidade.getClass().getName();	
		
		String msg = executarRegras(entidade, EOperacao.ALTERAR );
	
		if(msg == null){
			IDAO dao = daos.get(nmClasse);
			try {
				dao.alterar(entidade);
				List<EntidadeDominio> entidades = new ArrayList<EntidadeDominio>();
				entidades.add(entidade);
				resultado.setEntidades(entidades);
			} catch (SQLException e) {
				e.printStackTrace();
				resultado.setMsg("Não foi possível realizar o registro!");
				resultado.addEntidade(entidade);

			}
		}else{
			resultado.setMsg(msg);
			resultado.addEntidade(entidade);		
		}
		
		return resultado;

	}

	@Override
	public Resultado excluir(EntidadeDominio entidade) {
		resultado = new Resultado();
		// Salva entidade enviada
		resultado.setEntidade(entidade);
		String nmClasse = entidade.getClass().getName();	
		
		String msg = executarRegras(entidade, EOperacao.EXCLUIR );
		
		
		if(msg == null){
			IDAO dao = daos.get(nmClasse);
			try {
				dao.excluir(entidade);
				List<EntidadeDominio> entidades = new ArrayList<EntidadeDominio>();
				entidades.add(entidade);
				resultado.setEntidades(entidades);
			} catch (SQLException e) {
				e.printStackTrace();
				resultado.setMsg("Não foi possível realizar o registro!");
				resultado.addEntidade(entidade);		

			}
		}else{
			resultado.setMsg(msg);
			resultado.addEntidade(entidade);
		}
		
		return resultado;

	}

	@Override
	public Resultado consultar(EntidadeDominio entidade) {
		resultado = new Resultado();
		// Salva entidade enviada
		resultado.setEntidade(entidade);
		String nmClasse = entidade.getClass().getName();	
		
		String msg = executarRegras(entidade, EOperacao.CONSULTAR);
		
		
		if(msg == null){
			IDAO dao = daos.get(nmClasse);
			try {
				
				resultado.setEntidades(dao.consultar(entidade));
			} catch (SQLException e) {
				e.printStackTrace();
				resultado.setMsg("Não foi possível realizar a consulta!");
				
			}
		}else{
			resultado.setMsg(msg);
			resultado.addEntidade(entidade);
		}
		
		return resultado;

	}
	@Override
	public Resultado consultar_id(EntidadeDominio entidade) {
		resultado = new Resultado();
		// Salva entidade enviada
		resultado.setEntidade(entidade);
		String nmClasse = entidade.getClass().getName();	
		
		String msg = executarRegras(entidade, EOperacao.CONSULTAR);
		
		
		if(msg == null){
			IDAO dao = daos.get(nmClasse);
			try {
				
				resultado.addEntidade(dao.consultar_id(entidade));
			} catch (SQLException e) {
				e.printStackTrace();
				resultado.setMsg("Não foi possível realizar a consulta!");
				
			}
		}else{
			resultado.setMsg(msg);
			resultado.addEntidade(entidade);
		}
		
		return resultado;

	}
	
	private String executarRegras(EntidadeDominio entidade, EOperacao operacao){
		String nmClasse = entidade.getClass().getName();		
		StringBuilder msg = new StringBuilder();
		
		Map<EOperacao, List<IStrategy>> regrasOperacao = rns.get(nmClasse);
		
		
		if(regrasOperacao != null){
			List<IStrategy> regras = regrasOperacao.get(operacao);
			
			if(regras != null){
				for(IStrategy s: regras){			
					String m = s.processar(entidade);			
					
					if(m != null){
						msg.append(m);
						msg.append("\n");
					}			
				}	
			}			
			
		}
		
		if(msg.length()>0)
			return msg.toString();
		else
			return null;
	}
}
