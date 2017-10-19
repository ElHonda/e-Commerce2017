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
import eCommerce.controle.web.vh.impl.CidadeViewHelper;
import eCommerce.controle.web.vh.impl.ClienteViewHelper;
import eCommerce.controle.web.vh.impl.EstadoViewHelper;
import eCommerce.controle.web.vh.impl.LivroViewHelper;
import eCommerce.core.aplicacao.EOperacao;
import eCommerce.core.aplicacao.Resultado;
import eCommerce.dominio.EntidadeDominio;

/**
 * Servlet implementation class Servlet
 */
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static Map<EOperacao, ICommand> commands;
	private static Map<String, FormOperacao> vhs;

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
    	
    	vhs = new HashMap<String, FormOperacao>();
    	/*A chave do mapa � o mapeamento da servlet para cada form que 
    	 * est� configurado no web.xml e sendo utilizada no action do html
    	 */
    	
      	vhs.put("/e-Commerce2017-web/Livro/CriarLivro"   , new FormOperacao(new LivroViewHelper() , EOperacao.SALVAR     ) );
    	vhs.put("/e-Commerce2017-web/Livro/FormLivro"    , new FormOperacao(new LivroViewHelper() , EOperacao.NOVO       ) );
    	vhs.put("/e-Commerce2017-web/Livro/ListaLivro"   , new FormOperacao(new LivroViewHelper() , EOperacao.CONSULTAR  ) );
    	vhs.put("/e-Commerce2017-web/Livro/EditarLivro"  , new FormOperacao(new LivroViewHelper() , EOperacao.VISUALIZAR ) );
    	vhs.put("/e-Commerce2017-web/Livro/AlterarLivro" , new FormOperacao(new LivroViewHelper() , EOperacao.ALTERAR    ) );
    	vhs.put("/e-Commerce2017-web/Livro/ExcluirLivro" , new FormOperacao(new LivroViewHelper() , EOperacao.EXCLUIR    ) );
    	
    	vhs.put("/e-Commerce2017-web/Cliente/FormCliente" , new FormOperacao( new ClienteViewHelper() , EOperacao.NOVO ) );

    	vhs.put("/e-Commerce2017-web/Estado/ConsultaEstado" , new FormOperacao( new EstadoViewHelper() , EOperacao.CONSULTAR , true ) );
    	vhs.put("/e-Commerce2017-web/Cidade/ConsultaCidade" , new FormOperacao( new CidadeViewHelper() , EOperacao.CONSULTAR , true ) );

    	/*
    	vhs.put("/e-Commerce2017-web/Cliente/CriarCliente"  , new ClienteViewHelper() );
    	vhs.put("/e-Commerce2017-web/Cliente/EditarCliente" , new ClienteViewHelper() );
    	vhs.put("/e-Commerce2017-web/Cliente/ListaCliente"  , new ClienteViewHelper() );
    	*/
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
		
		System.out.println("Servlet.doProcessRequest()");
		System.out.println("Entrou na servlet..." 	   );
		
		// Zera as strings de exibi��o de mensagem
		request.getSession().setAttribute("errorMsg"   , "" );
		request.getSession().setAttribute("alertMsg"   , "" );
		request.getSession().setAttribute("infoMsg"    , "" );
		request.getSession().setAttribute("sucessoMsg" , "" );
		request.getSession().setAttribute("configMsg"  , "" );
		String uri = null;
		//JsonBuilder json = new JsonBuilder();
		EntidadeDominio entidade;
		//Obt�m a opera��o executada

		uri = request.getRequestURI();
		
		FormOperacao fo = vhs.get(uri);
		System.out.println("URI: " + uri );
		/*
		if( fo.isJson() ) {
			// Verifica se foi feita uma requisi��o JSON
			BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream()));
			StringBuilder sb = new StringBuilder();
			String line;
			
			while( (line=br.readLine()) != null ) {
				sb.append(line);
		
			}
			System.out.println(sb.toString());
			json.StringToJson(sb.toString());
		}*/
		
		
		System.out.println("Opera��o..." + ( fo.getOperacao() == null ? "NULA" : fo.getOperacao().toString() ) );
		System.out.println("URI: " + uri );
		System.out.println("Tipo de Requisi��o JSON: " + ( fo.isJson() ? "SIM" : "N�O" ) );
		
		//Obt�m um viewhelper indexado pela uri que invocou esta servlet
		IViewHelper vh = fo.getVh();

		System.out.println( "View Helper: " + vh.getClass().getName() );
		
		
		entidade =  vh.getEntidade(request);

		/*
		if( fo.isJson() ) {
			entidade = vh.getEntidadeJSON(json);
		}else {
			//O viewhelper retorna a entidade especifica para a tela que chamou esta servlet
			entidade =  vh.getEntidade(request);
		}
		*/
		//Obt�m o command para executar a respectiva opera��o
		ICommand command = commands.get(fo.getOperacao());
		Resultado resultado = null;
		/*Executa o command que chamar� a fachada para executar a opera��o requisitada
		 * o retorno � uma inst�ncia da classe resultado que pode conter mensagens derro 
		 * ou entidades de retorno
		 */
		if( command != null ) {
			resultado = command.execute(entidade);
		}
		
		/*
		 * Executa o m�todo setView do view helper espec�fico para definir como dever� ser apresentado 
		 * o resultado para o usu�rio
		 */
		vh.setView(resultado, request, response, fo.getOperacao(), fo.isJson() );
	
	}
	public static void toTestando() {
		
	}
}
