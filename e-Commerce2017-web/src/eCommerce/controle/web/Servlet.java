package eCommerce.controle.web;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
import eCommerce.controle.web.vh.impl.ClienteViewHelper;
import eCommerce.controle.web.vh.impl.LivroViewHelper;
import eCommerce.core.aplicacao.EOperacao;
import eCommerce.core.aplicacao.Resultado;
import eCommerce.core.utils.JsonBuilder;
import eCommerce.dominio.EntidadeDominio;

/**
 * Servlet implementation class Servlet
 */
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static Map<EOperacao, ICommand> commands;
	private static Map<String, IViewHelper> vhs;

    /**
     * Default constructor. 
     */
    public Servlet() {
    	/* Utilizando o command para chamar a fachada e indexando cada command 
    	 * pela opera��o garantimos que esta servelt atender� qualquer opera��o */
    	commands = new HashMap<EOperacao, ICommand>();
    	
    	commands.put( EOperacao.SALVAR     , new SalvarCommand()	 );
    	commands.put( EOperacao.EXCLUIR    , new ExcluirCommand()	 );
    	commands.put( EOperacao.CONSULTAR  , new ConsultarCommand()	 );
    	commands.put( EOperacao.VISUALIZAR , new VisualizarCommand() );
    	commands.put( EOperacao.ALTERAR    , new AlterarCommand()	 );
    	
    	
    	/* Utilizando o ViewHelper para tratar especifica��es de qualquer tela e indexando 
    	 * cada viewhelper pela url em que esta servlet � chamada no form
    	 * garantimos que esta servelt atender� qualquer entidade */
    	
    	vhs = new HashMap<String, IViewHelper>();
    	/*A chave do mapa � o mapeamento da servlet para cada form que 
    	 * est� configurado no web.xml e sendo utilizada no action do html
    	 */
      	vhs.put("/e-Commerce2017-web/Livro/CriarLivro"  , new LivroViewHelper() );
    	vhs.put("/e-Commerce2017-web/Livro/FormLivro"   , new LivroViewHelper() );
    	vhs.put("/e-Commerce2017-web/Livro/EditarLivro" , new LivroViewHelper() );
    	vhs.put("/e-Commerce2017-web/Livro/ListaLivro"  , new LivroViewHelper() );
    	
    	vhs.put("/e-Commerce2017-web/Cliente/CriarCliente", new ClienteViewHelper() );
    	vhs.put("/e-Commerce2017-web/Cliente/FormCliente", new ClienteViewHelper() );
    	vhs.put("/e-Commerce2017-web/Cliente/EditarCliente", new ClienteViewHelper() );
    	vhs.put("/e-Commerce2017-web/Cliente/ListaCliente", new ClienteViewHelper() );
    }
    
    /** 
     * Descri��o do M�todo
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

		Boolean ajaxResponse = false;
		// Zera as strings de exibi��o de mensagem
		request.getSession().setAttribute("errorMsg"   , "" );
		request.getSession().setAttribute("alertMsg"   , "" );
		request.getSession().setAttribute("infoMsg"    , "" );
		request.getSession().setAttribute("sucessoMsg" , "" );
		request.getSession().setAttribute("configMsg"  , "" );
		String uri = null;
		JsonBuilder json = new JsonBuilder();
		EntidadeDominio entidade;
		//Obt�m a opera��o executada
		String operacao = request.getParameter("operacao").trim().toUpperCase();
		
		
		if ( operacao == null || operacao.equals("")) {
			// Tenta recuperar o objeto JSON
			BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream()));
			StringBuilder sb = new StringBuilder();
			String line;
			
			while( (line=br.readLine()) != null ) {
				sb.append(line);
			}
			json.StringToJson(sb.toString());
			
			operacao = json.getValue( "operacao" );
			
			ajaxResponse = operacao != null && operacao.length() > 0;
		}else {
			//Obt�m a uri que invocou esta servlet (O que foi definido no metodo do form html)
			uri = request.getRequestURI();
		}
		
		//Obt�m um viewhelper indexado pela uri que invocou esta servlet
		IViewHelper vh = vhs.get(uri);
		
		if( ajaxResponse ) {
			entidade = vh.getEntidadeJSON(json);
		}else {
			//O viewhelper retorna a entidade especifica para a tela que chamou esta servlet
			entidade =  vh.getEntidade(request);
		}
		//Obt�m o command para executar a respectiva opera��o
		ICommand command = commands.get(EOperacao.valueOf(operacao));

		/*Executa o command que chamar� a fachada para executar a opera��o requisitada
		 * o retorno � uma inst�ncia da classe resultado que pode conter mensagens derro 
		 * ou entidades de retorno
		 */
		Resultado resultado = command.execute(entidade);
		
		/*
		 * Executa o m�todo setView do view helper espec�fico para definir como dever� ser apresentado 
		 * o resultado para o usu�rio
		 */
		vh.setView(resultado, request, response, operacao, ajaxResponse);
	
	}
}
