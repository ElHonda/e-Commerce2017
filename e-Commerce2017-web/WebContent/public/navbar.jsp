<%@page import="eCommerce.dominio.Carrinho"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>

<%
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
					}
      		
				%>
      		">
        		<a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          			Cadastros
        		</a>
				<div class="dropdown-menu bg-dark" aria-labelledby="navbarDropdownMenuLink">
          			<a class="dropdown-item bg-dark text-white" href="<%=request.getContextPath()%>/Livro/ListaLivro">Livros</a>
          			<a class="dropdown-item bg-dark text-white" href="<%=request.getContextPath()%>/GrupoPreco/ListaGrupo">Grupo de Preço</a>
				</div>
			</li>
		</ul>
		<ul class="navbar-nav ml-auto">
			<li class="nav-item">
				<a class="navbar-brand" href="<%=request.getContextPath()%>/Carrinho/FormCarrinho">
				  <img src="<%=request.getContextPath()%>/resources/images/carrinho.png" width="30" height="30" alt=""><span class="carItens" id="carrinho_qtde_livros"><%= car.getLivros().size() %></span>
				</a>
	        </li>
		    <jsp:include page="../Cliente/Registrar.jsp"/>
		    <jsp:include page="../Cliente/Login.jsp"/>
		</ul>
	</div>
</nav>
