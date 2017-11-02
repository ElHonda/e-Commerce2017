<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<nav class="navbar fixed-top navbar-expand-sm navbar-dark bg-dark">
	<a class="navbar-brand" href="<%=request.getContextPath()%>/public/index.jsp">Proj. Ernane</a>
	<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>
	<div class="collapse navbar-collapse" id="navbarNavDropdown">
		<ul class="navbar-nav">
			<li class="nav-item
			<%
				if( request.getRequestURI().equals(request.getContextPath()+"/public/index.jsp")){
					out.print(" active ");
				}
			%>
			">
        		<a class="nav-link" href="<%=request.getContextPath()%>/public/index.jsp">In�cio<span class="sr-only">(current)</span></a>
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
		<ul class="navbar-nav">
		    <li class="nav-item dropdown">
		        <a href="#" class="nav-link dropdown-toggle" data-toggle="dropdown">Cadastre-se<span class="caret"></span></a>
		        <ul class="dropdown-menu dropdown-lr animated flipInX" role="menu">
		            <div class="col-lg-12">
		                <div class="text-center"><h3><b>Cadastre-se</b></h3></div>
		                <form id="ajax-register-form" action="" method="post" role="form" autocomplete="off">
		                    <div class="form-group">
		                        <input type="text" name="username" id="username" tabindex="1" class="form-control" placeholder="Username" value="">
		                    </div>
		                    <div class="form-group">
		                        <input type="email" name="email" id="email" tabindex="1" class="form-control" placeholder="Email Address" value="">
		                    </div>
		                    <div class="form-group">
		                        <input type="password" name="password" id="password" tabindex="2" class="form-control" placeholder="Password">
		                    </div>
		                    <div class="form-group">
		                        <input type="password" name="confirm-password" id="confirm-password" tabindex="2" class="form-control" placeholder="Confirm Password">
		                    </div>
		                    <div class="form-group">
		                        <div class="row">
		                            <div class="col-xs-6 col-xs-offset-3">
		                                <input type="submit" name="register-submit" id="register-submit" tabindex="4" class="form-control btn btn-info" value="Register Now">
		                            </div>
		                        </div>
		                    </div>
		                    <input type="hidden" class="hide" name="token" id="token" value="7c6f19960d63f53fcd05c3e0cbc434c0">
		                </form>
		            </div>
		        </ul>
		    </li>
		    <li class="nav-item dropdown">
		        <a href="" class="nav-link dropdown-toggle" data-toggle="dropdown">Entre<span class="caret"></span></a>
		        <ul class="dropdown-menu dropdown-lr animated slideInRight" role="menu">
		            <div class="col-lg-12">
		                <div class="text-center"><h3><b>Log In</b></h3></div>
		                <form id="ajax-login-form" action="http://phpoll.com/login/process" method="post" role="form" autocomplete="off">
		                    <div class="form-group">
		                        <label for="username">Username</label>
		                        <input type="text" name="username" id="username" tabindex="1" class="form-control" placeholder="Username" value="" autocomplete="off">
		                    </div>
		
		                    <div class="form-group">
		                        <label for="password">Password</label>
		                        <input type="password" name="password" id="password" tabindex="2" class="form-control" placeholder="Password" autocomplete="off">
		                    </div>
		
		                    <div class="form-group">
		                        <div class="row">
		                            <div class="col-xs-7">
		                                <input type="checkbox" tabindex="3" name="remember" id="remember">
		                                <label for="remember"> Remember Me</label>
		                            </div>
		                            <div class="col-xs-5 pull-right">
		                                <input type="submit" name="login-submit" id="login-submit" tabindex="4" class="form-control btn btn-success" value="Log In">
		                            </div>
		                        </div>
		                    </div>
		
		                    <div class="form-group">
		                        <div class="row">
		                            <div class="col-lg-12">
		                                <div class="text-center">
		                                    <a href="http://phpoll.com/recover" tabindex="5" class="forgot-password">Forgot Password?</a>
		                                </div>
		                            </div>
		                        </div>
		                    </div>
		                    <input type="hidden" class="hide" name="token" id="token" value="a465a2791ae0bae853cf4bf485dbe1b6">
		                </form>
		            </div>
		        </ul>
		    </li>
		</ul>
	</div>
</nav>
