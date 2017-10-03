<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<nav class="navbar fixed-top navbar-expand-sm navbar-dark bg-dark">
	<a class="navbar-brand" href="<%=request.getContextPath()%>/public/index.jsp">Proj. Ernane</a>
	<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>
	<div class="collapse navbar-collapse" id="navbarNavDropdown">
		<ul class="navbar-nav">
			<li class="nav=item
			<%
				if( request.getRequestURI().equals(request.getContextPath()+"/public/index.jsp")){
					out.print(" active ");
				}
			%>
			">
        		<a class="nav-link" href="<%=request.getContextPath()%>/public/index.jsp">Início<span class="sr-only">(current)</span></a>
      		</li>

      		<li class="nav-item dropdown
      			<%      				
					if( request.getRequestURI().contains(request.getContextPath()+"/Livros/") ){
						out.print(" active ");
					}
      		
				%>
      		">
        		<a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          			Cadastros
        		</a>
				<div class="dropdown-menu bg-dark" aria-labelledby="navbarDropdownMenuLink">
          			<a class="dropdown-item bg-dark text-white" href="<%=request.getContextPath()%>/Livro/ListaLivro.jsp"   >Livros</a>
				</div>
			</li>
		</ul>
	</div>
</nav>
