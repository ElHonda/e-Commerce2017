<%@page import="eCommerce.dominio.Cliente"%>
<%@page import="eCommerce.dominio.Carrinho"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>

<%

	Cliente cliente;
	if( request.getSession().getAttribute( "current_cliente" ) == null ){
		cliente = new Cliente();
	}else{
		cliente = (Cliente)request.getSession().getAttribute( "current_cliente" );
	}

	request.getSession().setAttribute( "pageRedirect" , request.getContextPath() + request.getServletPath() );

	Carrinho car;
	if( request.getSession().getAttribute( "carrinho" ) == null ){
		car = new Carrinho();
	}else{
		car = (Carrinho)request.getSession().getAttribute( "carrinho" );
	}
%>
<nav class="navbar fixed-top navbar-expand-sm navbar-dark bg-dark">
	<a class="navbar-brand" href="<%=request.getContextPath()%>/Carrinho/ListaCarrinho">Proj. Ernane</a>
	<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>
	<div class="collapse navbar-collapse" id="navbarNavDropdown">
		<ul class="navbar-nav">
			<li class="nav-item
			<%
				if( request.getRequestURI().contains(request.getContextPath()+"/Carrinho/ListaCarrinho")){
					out.print(" active ");
				}
			%>
			">
        		<a class="nav-link" href="<%=request.getContextPath()%>/Carrinho/ListaCarrinho">Início<span class="sr-only">(current)</span></a>
      		</li>

      		<li class="nav-item dropdown
      			<%      				
					if( request.getRequestURI().contains(request.getContextPath()+"/Livros/") ){
						out.print(" active ");
					}else if( request.getRequestURI().contains(request.getContextPath()+"/GrupoPreco/") ){
						out.print( " active " );
					}else if( request.getRequestURI().contains(request.getContextPath()+"/Autor/") ){
						out.print( " active " );
					}else if( request.getRequestURI().contains(request.getContextPath()+"/Editora/") ){
						out.print( " active " );
					}else if( request.getRequestURI().contains(request.getContextPath()+"/Categoria/") ){
						out.print( " active " );
					}else if( request.getRequestURI().contains(request.getContextPath()+"/Subcategoria/") ){
						out.print( " active " );
					}
      		
      		
				%>
      		">
        		<a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          			Cadastros
        		</a>
				<div class="dropdown-menu bg-dark" aria-labelledby="navbarDropdownMenuLink">
          			<a class="dropdown-item bg-dark text-white" href="<%=request.getContextPath()%>/Livro/ListaLivro">Livros</a>
          			<a class="dropdown-item bg-dark text-white" href="<%=request.getContextPath()%>/Autor/ListaAutor">Autores</a>
          			<a class="dropdown-item bg-dark text-white" href="<%=request.getContextPath()%>/Editora/ListaEditora">Editoras</a>
          			<a class="dropdown-item bg-dark text-white" href="<%=request.getContextPath()%>/Categoria/ListaCategoria">Categorias</a>
          			<a class="dropdown-item bg-dark text-white" href="<%=request.getContextPath()%>/Subcategoria/ListaSubcategoria">Subcategorias</a>
          			<a class="dropdown-item bg-dark text-white" href="<%=request.getContextPath()%>/GrupoPreco/ListaGrupo">Grupos de Preço</a>
				</div>
			</li>
		</ul>
		<ul class="navbar-nav ml-auto">
			<li class="nav-item">
				<a class="navbar-brand" href="<%=request.getContextPath()%>/Carrinho/FormCarrinho">
				  <img src="<%=request.getContextPath()%>/resources/images/carrinho.png" width="30" height="30" alt=""><span class="carItens" id="carrinho_qtde_livros"><%= car.getLivros().size() %></span>
				</a>
	        </li>
	        <%
	        	if( cliente.getId() == null || cliente.getId() <= 0 ){
	        %>
		    	<jsp:include page="../Cliente/Registrar.jsp"/>
		    	<jsp:include page="../Cliente/Login.jsp"/>
		    <%
		        }else{
		    %>
		    	<li class="nav-item navbar-text"><%= cliente.getNome() %></li>
		    	<li class="nav-item">
        			<a class="nav-link" href="<%=request.getContextPath()%>/Cliente/ListaCarrinho">Sair</a>
		    	</li>
		    <%
		    	}
		    %>
		</ul>
	</div>
</nav>
