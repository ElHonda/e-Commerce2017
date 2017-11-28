package eCommerce.controle.web;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import eCommerce.controle.web.command.ICommand;
import eCommerce.controle.web.command.impl.AlterarCommand;
import eCommerce.controle.web.command.impl.ConsultarCommand;
import eCommerce.controle.web.command.impl.ExcluirCommand;
import eCommerce.controle.web.command.impl.SalvarCommand;
import eCommerce.controle.web.command.impl.VisualizarCommand;
import eCommerce.controle.web.vh.IViewHelper;
import eCommerce.controle.web.vh.impl.AutorViewHelper;
import eCommerce.controle.web.vh.impl.CarrinhoViewHelper;
import eCommerce.controle.web.vh.impl.CategoriaViewHelper;
import eCommerce.controle.web.vh.impl.CidadeViewHelper;
import eCommerce.controle.web.vh.impl.ClienteViewHelper;
import eCommerce.controle.web.vh.impl.EditoraViewHelper;
import eCommerce.controle.web.vh.impl.EstadoViewHelper;
import eCommerce.controle.web.vh.impl.GrupoPrecoViewHelper;
import eCommerce.controle.web.vh.impl.LivroViewHelper;
import eCommerce.controle.web.vh.impl.SubcategoriaViewHelper;
import eCommerce.core.aplicacao.EOperacao;
import eCommerce.core.aplicacao.Resultado;
import eCommerce.dominio.Cidade;
import eCommerce.dominio.Cliente;
import eCommerce.dominio.Endereco;
import eCommerce.dominio.EntidadeDominio;
import eCommerce.dominio.Estado;

/**
 * Servlet implementation class Servlet
 */
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static Map<EOperacao, ICommand> commands;
	private static Map<String, Helper> vhs;

    /**
     * Default constructor. 
     */
    public Servlet() {
    	/* Utilizando o command para chamar a fachada e indexando cada command 
    	 * pela operação garantimos que esta servelt atenderá qualquer operação */
    	commands = new HashMap<EOperacao, ICommand>();
    	
    	commands.put( EOperacao.SALVAR     , new SalvarCommand()	 );
    	commands.put( EOperacao.EXCLUIR    , new ExcluirCommand()	 );
    	commands.put( EOperacao.CONSULTAR  , new ConsultarCommand()	 );
    	commands.put( EOperacao.VISUALIZAR , new VisualizarCommand() );
    	commands.put( EOperacao.ALTERAR    , new AlterarCommand()	 );
    	
    	
    	/* Utilizando o ViewHelper para tratar especificações de qualquer tela e indexando 
    	 * cada viewhelper pela url em que esta servlet é chamada no form
    	 * garantimos que esta servelt atenderá qualquer entidade */
    	
    	vhs = new HashMap<String, Helper>();
    	/*A chave do mapa é o mapeamento da servlet para cada form que 
    	 * está configurado no web.xml e sendo utilizada no action do html
    	 */
    	
    	// Define acesso as operações
    	// LIVROS
      	vhs.put("/e-Commerce2017-web/Livro/CriarLivro"    , new Helper(new LivroViewHelper() , EOperacao.SALVAR     ) );
    	vhs.put("/e-Commerce2017-web/Livro/FormLivro"     , new Helper(new LivroViewHelper() , EOperacao.NOVO       , false , false ) );
    	vhs.put("/e-Commerce2017-web/Livro/ListaLivro"    , new Helper(new LivroViewHelper() , EOperacao.CONSULTAR  ) );
    	vhs.put("/e-Commerce2017-web/Livro/EditarLivro"   , new Helper(new LivroViewHelper() , EOperacao.VISUALIZAR ) );
    	vhs.put("/e-Commerce2017-web/Livro/AlterarLivro"  , new Helper(new LivroViewHelper() , EOperacao.ALTERAR    ) );
    	vhs.put("/e-Commerce2017-web/Livro/InativarLivro" , new Helper(new LivroViewHelper() , EOperacao.ALTERAR    ) );
    	vhs.put("/e-Commerce2017-web/Livro/AtivarLivro"   , new Helper(new LivroViewHelper() , EOperacao.ALTERAR    ) );
    	vhs.put("/e-Commerce2017-web/Livro/ExcluirLivro"  , new Helper(new LivroViewHelper() , EOperacao.EXCLUIR    ) );
    	// AUTOR
      	vhs.put("/e-Commerce2017-web/Autor/CriarAutor"   , new Helper(new AutorViewHelper() , EOperacao.SALVAR     ) );
    	vhs.put("/e-Commerce2017-web/Autor/FormAutor"    , new Helper(new AutorViewHelper() , EOperacao.NOVO       , false , false ) );
    	vhs.put("/e-Commerce2017-web/Autor/ListaAutor"   , new Helper(new AutorViewHelper() , EOperacao.CONSULTAR  ) );
    	vhs.put("/e-Commerce2017-web/Autor/EditarAutor"  , new Helper(new AutorViewHelper() , EOperacao.VISUALIZAR ) );
    	vhs.put("/e-Commerce2017-web/Autor/AlterarAutor" , new Helper(new AutorViewHelper() , EOperacao.ALTERAR    ) );
    	vhs.put("/e-Commerce2017-web/Autor/ExcluirAutor" , new Helper(new AutorViewHelper() , EOperacao.EXCLUIR    ) );
    	// GRUPO DE PREÇO
      	vhs.put("/e-Commerce2017-web/GrupoPreco/CriarGrupo"   , new Helper(new GrupoPrecoViewHelper() , EOperacao.SALVAR     ) );
    	vhs.put("/e-Commerce2017-web/GrupoPreco/FormGrupo"    , new Helper(new GrupoPrecoViewHelper() , EOperacao.NOVO       , false , false ) );
    	vhs.put("/e-Commerce2017-web/GrupoPreco/ListaGrupo"   , new Helper(new GrupoPrecoViewHelper() , EOperacao.CONSULTAR  ) );
    	vhs.put("/e-Commerce2017-web/GrupoPreco/EditarGrupo"  , new Helper(new GrupoPrecoViewHelper() , EOperacao.VISUALIZAR ) );
    	vhs.put("/e-Commerce2017-web/GrupoPreco/AlterarGrupo" , new Helper(new GrupoPrecoViewHelper() , EOperacao.ALTERAR    ) );
    	vhs.put("/e-Commerce2017-web/GrupoPreco/ExcluirGrupo" , new Helper(new GrupoPrecoViewHelper() , EOperacao.EXCLUIR    ) );
    	// Editora
      	vhs.put("/e-Commerce2017-web/Editora/CriarEditora"   , new Helper(new EditoraViewHelper() , EOperacao.SALVAR     ) );
    	vhs.put("/e-Commerce2017-web/Editora/FormEditora"    , new Helper(new EditoraViewHelper() , EOperacao.NOVO       , false , false ) );
    	vhs.put("/e-Commerce2017-web/Editora/ListaEditora"   , new Helper(new EditoraViewHelper() , EOperacao.CONSULTAR  ) );
    	vhs.put("/e-Commerce2017-web/Editora/EditarEditora"  , new Helper(new EditoraViewHelper() , EOperacao.VISUALIZAR ) );
    	vhs.put("/e-Commerce2017-web/Editora/AlterarEditora" , new Helper(new EditoraViewHelper() , EOperacao.ALTERAR    ) );
    	vhs.put("/e-Commerce2017-web/Editora/ExcluirEditora" , new Helper(new EditoraViewHelper() , EOperacao.EXCLUIR    ) );
    	// Categoria
      	vhs.put("/e-Commerce2017-web/Categoria/CriarCategoria"   , new Helper(new CategoriaViewHelper() , EOperacao.SALVAR     ) );
    	vhs.put("/e-Commerce2017-web/Categoria/FormCategoria"    , new Helper(new CategoriaViewHelper() , EOperacao.NOVO       , false , false ) );
    	vhs.put("/e-Commerce2017-web/Categoria/ListaCategoria"   , new Helper(new CategoriaViewHelper() , EOperacao.CONSULTAR  ) );
    	vhs.put("/e-Commerce2017-web/Categoria/EditarCategoria"  , new Helper(new CategoriaViewHelper() , EOperacao.VISUALIZAR ) );
    	vhs.put("/e-Commerce2017-web/Categoria/AlterarCategoria" , new Helper(new CategoriaViewHelper() , EOperacao.ALTERAR    ) );
    	vhs.put("/e-Commerce2017-web/Categoria/ExcluirCategoria" , new Helper(new CategoriaViewHelper() , EOperacao.EXCLUIR    ) );
    	// Subcategoria
      	vhs.put("/e-Commerce2017-web/Subcategoria/CriarSubcategoria"   , new Helper(new SubcategoriaViewHelper() , EOperacao.SALVAR     ) );
    	vhs.put("/e-Commerce2017-web/Subcategoria/FormSubcategoria"    , new Helper(new SubcategoriaViewHelper() , EOperacao.NOVO       , false , false ) );
    	vhs.put("/e-Commerce2017-web/Subcategoria/ListaSubcategoria"   , new Helper(new SubcategoriaViewHelper() , EOperacao.CONSULTAR  ) );
    	vhs.put("/e-Commerce2017-web/Subcategoria/EditarSubcategoria"  , new Helper(new SubcategoriaViewHelper() , EOperacao.VISUALIZAR ) );
    	vhs.put("/e-Commerce2017-web/Subcategoria/AlterarSubcategoria" , new Helper(new SubcategoriaViewHelper() , EOperacao.ALTERAR    ) );
    	vhs.put("/e-Commerce2017-web/Subcategoria/ExcluirSubcategoria" , new Helper(new SubcategoriaViewHelper() , EOperacao.EXCLUIR    ) );
    	// Específico para compras
    	vhs.put("/e-Commerce2017-web/Carrinho/ListaCarrinho" , new Helper( new CarrinhoViewHelper() , EOperacao.CONSULTAR  ) );
    	vhs.put("/e-Commerce2017-web/Carrinho/FormCarrinho"  , new Helper( new CarrinhoViewHelper() , EOperacao.VISUALIZAR ) );
    	vhs.put("/e-Commerce2017-web/Carrinho/AddLivro"      , new Helper( new CarrinhoViewHelper() , EOperacao.NOVO       , true , false ) );
    	vhs.put("/e-Commerce2017-web/Carrinho/AlterarLivro"  , new Helper( new CarrinhoViewHelper() , EOperacao.ALTERAR    , true , false ) );
    	vhs.put("/e-Commerce2017-web/Carrinho/RemoverLivro"  , new Helper( new CarrinhoViewHelper() , EOperacao.EXCLUIR    , true , false ) );
    	
    	vhs.put("/e-Commerce2017-web/Cliente/FormCliente"   , new Helper( new ClienteViewHelper() , EOperacao.NOVO      , false , false ) );
    	vhs.put("/e-Commerce2017-web/Estado/ConsultaEstado" , new Helper( new EstadoViewHelper()  , EOperacao.CONSULTAR , true  , true  ) );
    	vhs.put("/e-Commerce2017-web/Cidade/ConsultaCidade" , new Helper( new CidadeViewHelper()  , EOperacao.CONSULTAR , true  , true  ) );


    	vhs.put("/e-Commerce2017-web/Cliente/RegistrarCliente" , new Helper( new ClienteViewHelper() , EOperacao.SALVAR ));
    	/*
    	vhs.put("/e-Commerce2017-web/Cliente/CriarCliente"  , new ClienteViewHelper() );
    	vhs.put("/e-Commerce2017-web/Cliente/EditarCliente" , new ClienteViewHelper() );
    	vhs.put("/e-Commerce2017-web/Cliente/ListaCliente"  , new ClienteViewHelper() );
    	*/
    }

    /** 
     * Descrição do Método
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,
    		IOException {
    	doProcessRequest(request, response);
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcessRequest(request, response);
	}
	
	
	protected void doProcessRequest(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		ICommand command = null;
		Resultado resultado = null;
		
		Cliente cli = new Cliente();
		if( request.getSession().getAttribute("current_cliente") != null ) {
			cli = (Cliente)request.getSession().getAttribute("current_cliente");
		}
		
		if( ( cli.getId() == null || cli.getId() <= 0 ) && cli.getEnderecos().size() > 0 ) {
			Endereco end = cli.getEnderecos().get(0);
			// Se cidade tem ID, é certeza que é valido, pois é carregado através de uma combo
			if( end.getCidade() != null && end.getCidade().getId() > 0 ) {
				command = commands.get(EOperacao.CONSULTAR);
				end.setCidade( (Cidade)command.execute(end.getCidade()).getEntidades().get(0) );
				Cidade cid = new Cidade();
				cid.setEstado(end.getCidade().getEstado());
				Estado est = new Estado();
				est.setPais(cid.getEstado().getPais());
				request.setAttribute( "listaCidade", command.execute(cid) );
				request.setAttribute( "listaEstado", command.execute(est) );
			}
		}
		
		System.out.println("======================================================================");
		System.out.println("Servlet.doProcessRequest()");
		System.out.println("Entrou na servlet......."  );
		
		String uri = null;
		//JsonBuilder json = new JsonBuilder();
		EntidadeDominio entidade;
		//Obtêm a operação executada

		uri = request.getRequestURI();
		
		Helper fo = vhs.get(uri);
		System.out.println("Operação...............: " + ( fo.getOperacao() == null ? "NULA" : fo.getOperacao().toString() ) );
		System.out.println("URI....................: " + uri );
		System.out.println("Tipo de Requisição JSON: " + ( fo.isJson() ? "SIM" : "NÃO" ) );
		
		//Obtêm um viewhelper indexado pela uri que invocou esta servlet
		IViewHelper vh = fo.getVh();

		System.out.println("View Helper............: " + vh.getClass().getName() );
	    System.out.println("----------------------------------------------------------------------");
		
		
		entidade =  vh.getEntidade(request);

		//Obtêm o command para executar a respectiva operação
		command = commands.get(fo.getOperacao());
		resultado = null;
		/*Executa o command que chamará a fachada para executar a operação requisitada
		 * o retorno é uma instância da classe resultado que pode conter mensagens derro 
		 * ou entidades de retorno
		 */
		if( fo.getUseCommand() ) {
			resultado = command.execute(entidade);
		}else{
			resultado = new Resultado();
			resultado.setEntidade(entidade);
		}
		
		/*
		 * Executa o método setView do view helper específico para definir como deverá ser apresentado 
		 * o resultado para o usuário
		 */
		vh.setView(resultado, request, response, fo.getOperacao(), fo.isJson() );
	
	}
}
