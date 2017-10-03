package eCommerce.core.impl.controle;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import eCommerce.core.IDAO;
import eCommerce.core.IFachada;
import eCommerce.core.IStrategy;
import eCommerce.core.aplicacao.Resultado;
import eCommerce.core.impl.dao.AutorDAO;
import eCommerce.core.impl.dao.CategoriaDAO;
import eCommerce.core.impl.dao.EditoraDAO;
import eCommerce.core.impl.dao.GrupoPrecificacaoDAO;
import eCommerce.core.impl.dao.LivroDAO;
import eCommerce.core.impl.dao.SubCategoriaDAO;
import eCommerce.core.impl.negocio.ComplementarDtCadastro;
import eCommerce.core.impl.negocio.ValidadorDadosObrigatoriosLivro;
import eCommerce.dominio.Autor;
import eCommerce.dominio.Categoria;
import eCommerce.dominio.Editora;
import eCommerce.dominio.EntidadeDominio;
import eCommerce.dominio.GrupoPrecificacao;
import eCommerce.dominio.Livro;
import eCommerce.dominio.SubCategoria;

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
	private Map<String, Map<String, List<IStrategy>>> rns;
	
	private Resultado resultado;
	
	
	public Fachada(){
		/* Intânciando o Map de DAOS */
		daos = new HashMap<String, IDAO>();
		/* Intânciando o Map de Regras de Negócio */
		rns = new HashMap<String, Map<String, List<IStrategy>>>();
		daos.put( Autor.class.getName(), new AutorDAO() );
		daos.put( Categoria.class.getName(), new CategoriaDAO() );
		daos.put( Editora.class.getName(), new EditoraDAO());
		daos.put( GrupoPrecificacao.class.getName(), new GrupoPrecificacaoDAO());
		daos.put( Livro.class.getName() , new LivroDAO() );
		daos.put( SubCategoria.class.getName(), new SubCategoriaDAO());
		/* Criando instâncias dos DAOs a serem utilizados*/

		RegrarAutor();
		RegrarCategoria();
		RegrarEditora();
		RegrarGrupoPrecificacao();
		RegrarLivro();
		RegrarSubCategoria();

	}
	private void RegrarAutor() {
		/* Criando instâncias de regras de negócio a serem utilizados*/
		ComplementarDtCadastro cDtCadastro = new ComplementarDtCadastro();

		/* Criando uma lista para conter as regras de negócio de Categorias
	
		 * quando a operação for salvar
		 */
		List<IStrategy> rnsSalvarAtor = new ArrayList<IStrategy>();
		/* Adicionando as regras a serem utilizadas na operação salvar do fornecedor
		 */
		rnsSalvarAtor.add(cDtCadastro);

		/* Cria o mapa que poderá conter todas as listas de regras de negócio específica 
		 * por operação  do fornecedor
		 */
		Map<String, List<IStrategy>> rnsAutor = new HashMap<String, List<IStrategy>>();
		/*
		 * Adiciona a listra de regras na operação salvar no mapa do fornecedor (lista criada na linha 70)
		 */

		rnsAutor.put("SALVAR", rnsSalvarAtor);	
		/* Adiciona o mapa(criado na linha 79) com as regras indexadas pelas operações no mapa geral indexado 
		 * pelo nome da entidade
		 */
		rns.put(Categoria.class.getName(), rnsAutor);
	}
	private void RegrarCategoria() {
		/* Criando instâncias de regras de negócio a serem utilizados*/
		ComplementarDtCadastro cDtCadastro = new ComplementarDtCadastro();

		/* Criando uma lista para conter as regras de negócio de Categorias
	
		 * quando a operação for salvar
		 */
		List<IStrategy> rnsSalvarCategoria = new ArrayList<IStrategy>();
		/* Adicionando as regras a serem utilizadas na operação salvar do fornecedor
		 */
		rnsSalvarCategoria.add(cDtCadastro);

		/* Cria o mapa que poderá conter todas as listas de regras de negócio específica 
		 * por operação  do fornecedor
		 */
		Map<String, List<IStrategy>> rnsCategoria = new HashMap<String, List<IStrategy>>();
		/*
		 * Adiciona a listra de regras na operação salvar no mapa do fornecedor (lista criada na linha 70)
		 */

		rnsCategoria.put("SALVAR", rnsSalvarCategoria);	
		/* Adiciona o mapa(criado na linha 79) com as regras indexadas pelas operações no mapa geral indexado 
		 * pelo nome da entidade
		 */
		rns.put(Categoria.class.getName(), rnsCategoria);
	}
	private void RegrarEditora() {
		/* Criando instâncias de regras de negócio a serem utilizados*/
		ComplementarDtCadastro cDtCadastro = new ComplementarDtCadastro();

		/* Criando uma lista para conter as regras de negócio de Categorias
	
		 * quando a operação for salvar
		 */
		List<IStrategy> rnsSalvarEditora = new ArrayList<IStrategy>();
		/* Adicionando as regras a serem utilizadas na operação salvar do fornecedor
		 */
		rnsSalvarEditora.add(cDtCadastro);

		/* Cria o mapa que poderá conter todas as listas de regras de negócio específica 
		 * por operação  do fornecedor
		 */
		Map<String, List<IStrategy>> rnsEditora = new HashMap<String, List<IStrategy>>();
		/*
		 * Adiciona a listra de regras na operação salvar no mapa do fornecedor (lista criada na linha 70)
		 */

		rnsEditora.put("SALVAR", rnsSalvarEditora);	
		/* Adiciona o mapa(criado na linha 79) com as regras indexadas pelas operações no mapa geral indexado 
		 * pelo nome da entidade
		 */
		rns.put(Categoria.class.getName(), rnsEditora);
	}
	private void RegrarGrupoPrecificacao() {
		/* Criando instâncias de regras de negócio a serem utilizados*/
		ComplementarDtCadastro cDtCadastro = new ComplementarDtCadastro();

		/* Criando uma lista para conter as regras de negócio de Categorias
	
		 * quando a operação for salvar
		 */
		List<IStrategy> rnsSalvarGrupoPrecificacao = new ArrayList<IStrategy>();
		/* Adicionando as regras a serem utilizadas na operação salvar do fornecedor
		 */
		rnsSalvarGrupoPrecificacao.add(cDtCadastro);

		/* Cria o mapa que poderá conter todas as listas de regras de negócio específica 
		 * por operação  do fornecedor
		 */
		Map<String, List<IStrategy>> rnsGrupoPrecificacao = new HashMap<String, List<IStrategy>>();
		/*
		 * Adiciona a listra de regras na operação salvar no mapa do fornecedor (lista criada na linha 70)
		 */

		rnsGrupoPrecificacao.put("SALVAR", rnsSalvarGrupoPrecificacao);	
		/* Adiciona o mapa(criado na linha 79) com as regras indexadas pelas operações no mapa geral indexado 
		 * pelo nome da entidade
		 */
		rns.put(Categoria.class.getName(), rnsGrupoPrecificacao);
	}
	private void RegrarLivro() {
		/* Criando instâncias de regras de negócio a serem utilizados*/
		ComplementarDtCadastro cDtCadastro = new ComplementarDtCadastro();
		ValidadorDadosObrigatoriosLivro vrDadosObrigatoriosLivro = new ValidadorDadosObrigatoriosLivro();
		/* Criando uma lista para conter as regras de negócio de Categorias
	
		 * quando a operação for salvar
		 */
		List<IStrategy> rnsSalvarLivro = new ArrayList<IStrategy>();
		/* Adicionando as regras a serem utilizadas na operação salvar do fornecedor
		 */
		rnsSalvarLivro.add(cDtCadastro);
		rnsSalvarLivro.add(vrDadosObrigatoriosLivro);

		/* Cria o mapa que poderá conter todas as listas de regras de negócio específica 
		 * por operação  do fornecedor
		 */
		Map<String, List<IStrategy>> rnsLivro = new HashMap<String, List<IStrategy>>();
		/*
		 * Adiciona a listra de regras na operação salvar no mapa do fornecedor (lista criada na linha 70)
		 */

		rnsLivro.put("SALVAR", rnsSalvarLivro);	
		rnsLivro.put("ALTERAR" , rnsSalvarLivro);
		/* Adiciona o mapa(criado na linha 79) com as regras indexadas pelas operações no mapa geral indexado 
		 * pelo nome da entidade
		 */
		rns.put(Livro.class.getName(), rnsLivro);
	}	
	private void RegrarSubCategoria() {
		/* Criando instâncias de regras de negócio a serem utilizados*/
		ComplementarDtCadastro cDtCadastro = new ComplementarDtCadastro();

		/* Criando uma lista para conter as regras de negócio de Categorias
	
		 * quando a operação for salvar
		 */
		List<IStrategy> rnsSalvarSubCategoria = new ArrayList<IStrategy>();
		/* Adicionando as regras a serem utilizadas na operação salvar do fornecedor
		 */
		rnsSalvarSubCategoria.add(cDtCadastro);

		/* Cria o mapa que poderá conter todas as listas de regras de negócio específica 
		 * por operação  do fornecedor
		 */
		Map<String, List<IStrategy>> rnsSubCategoria = new HashMap<String, List<IStrategy>>();
		/*
		 * Adiciona a listra de regras na operação salvar no mapa do fornecedor (lista criada na linha 70)
		 */

		rnsSubCategoria.put("SALVAR", rnsSalvarSubCategoria);	
		/* Adiciona o mapa(criado na linha 79) com as regras indexadas pelas operações no mapa geral indexado 
		 * pelo nome da entidade
		 */
		rns.put(Categoria.class.getName(), rnsSubCategoria);
	}
	@Override
	public Resultado salvar(EntidadeDominio entidade) {
		resultado = new Resultado();
		String nmClasse = entidade.getClass().getName();	
		
		String msg = executarRegras(entidade, "SALVAR");
		
		
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
					
			
		}
		
		return resultado;
	}

	@Override
	public Resultado alterar(EntidadeDominio entidade) {
		resultado = new Resultado();
		String nmClasse = entidade.getClass().getName();	
		
		String msg = executarRegras(entidade, "ALTERAR");
	
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
		String nmClasse = entidade.getClass().getName();	
		
		String msg = executarRegras(entidade, "EXCLUIR");
		
		
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
				
			}
		}else{
			resultado.setMsg(msg);
					
			
		}
		
		return resultado;

	}

	@Override
	public Resultado consultar(EntidadeDominio entidade) {
		resultado = new Resultado();
		String nmClasse = entidade.getClass().getName();	
		
		String msg = executarRegras(entidade, "CONSULTAR");
		
		
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
			
		}
		
		return resultado;

	}
	@Override
	public Resultado consultar_id(EntidadeDominio entidade) {
		resultado = new Resultado();
		String nmClasse = entidade.getClass().getName();	
		
		String msg = executarRegras(entidade, "CONSULTAR_ID");
		
		
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
			
		}
		
		return resultado;

	}
	/*
	@Override
	public Resultado visualizar(EntidadeDominio entidade) {
		resultado = new Resultado();
		resultado.setEntidades(new ArrayList<EntidadeDominio>(1));
		resultado.getEntidades().add(entidade);		
		return resultado;

	}
   */
	
	private String executarRegras(EntidadeDominio entidade, String operacao){
		String nmClasse = entidade.getClass().getName();		
		StringBuilder msg = new StringBuilder();
		
		Map<String, List<IStrategy>> regrasOperacao = rns.get(nmClasse);
		
		
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
