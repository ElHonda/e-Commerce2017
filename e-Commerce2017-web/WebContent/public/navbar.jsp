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
					}
      		
				%>
      		">
        		<a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          			Cadastros
        		</a>
				<div class="dropdown-menu bg-dark" aria-labelledby="navbarDropdownMenuLink">
          			<a class="dropdown-item bg-dark text-white" href="<%=request.getContextPath()%>/Livro/ListaLivro">Livros</a>
				</div>
			</li>
		</ul>
		<ul class="navbar-nav ml-auto">
	        <li class="nav-item">
	          <a class="nav-link" id="carrinho_qtde_livros" href="<%=request.getContextPath()%>/Carrinho/FormCarrinho">Carrinho( <%= car.getLivros().size() %> )</a>
	        </li>
		    <li class="nav-item dropdown">
		        <a href="#" class="nav-link dropdown-toggle" data-toggle="dropdown">Cadastre-se<span class="caret"></span></a>
		        <ul class="dropdown-menu dropdown-menu-right dropdown-lr animated flipInX" role="menu">
		            <div class="col-lg-12">
		                <div class="text-center"><h3><b>Cadastre-se</b></h3></div>
		                <form id="ajax-register-form" action="" method="post" role="form" autocomplete="off">
		                    <div class="form-group">
		                        <input type="text" name="username" id="username" tabindex="1" class="form-control" placeholder="Usuário" value="">
		                    </div>
		                    <div class="form-group">
		                        <input type="email" name="email" id="email" tabindex="1" class="form-control" placeholder="E-mail" value="">
		                    </div>
		                    <div class="form-group">
		                        <input type="password" name="password" id="password" tabindex="2" class="form-control" placeholder="Senha">
		                    </div>
		                    <div class="form-group">
		                        <input type="password" name="confirm-password" id="confirm-password" tabindex="2" class="form-control" placeholder="Confirmação da Senha">
		                    </div>

		                    <div class="form-group">
					    		<div class="col-sm-12">
					    			<a href="#" class="btn btn-success btn-sm btn-block" >Registre-se</a>
		                        </div>
		                    </div>
		                </form>
		            </div>
		        </ul>
		    </li>
		    <li class="nav-item dropdown">
		        <a href="" class="nav-link dropdown-toggle" data-toggle="dropdown">Entre<span class="caret"></span></a>
		        <ul class="dropdown-menu dropdown-menu-right dropdown-lr animated slideInRight" role="menu">
		            <div class="col-lg-12">
		                <div class="text-center"><h3><b>Entrar</b></h3></div>
		                <form id="ajax-login-form" action="http://phpoll.com/login/process" method="post" role="form" autocomplete="off">
		                    <div class="form-group">
		                        <label for="username">Usuário</label>
		                        <input type="text" name="username" id="username" tabindex="1" class="form-control" placeholder="Usuário" value="" autocomplete="off">
		                    </div>
		
		                    <div class="form-group">
		                        <label for="password">Senha</label>
		                        <input type="password" name="password" id="password" tabindex="2" class="form-control" placeholder="Senha" autocomplete="off">
		                    </div>
		
		                    <div class="form-group">
					    		<div class="col-sm-12">
					    			<a href="#" class="btn btn-primary btn-sm btn-block" >Entrar</a>
		                        </div>
		                    </div>
		                </form>
		            </div>
		        </ul>
		    </li>
		</ul>
	</div>
</nav>
