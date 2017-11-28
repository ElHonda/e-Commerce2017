<% 
	if (request.getSession().getAttribute("errorMsg") != null && !request.getSession().getAttribute("errorMsg").equals("") ){
%>
	<div class="alert alert-danger alert-dismissible fade show" role="alert">
		<h4 class="alert-heading">Erro(s):</h4>
		<button type="button" class="close" data-dismiss="alert" aria-label="Close">
			<span aria-hidden="true">&times;</span>
		</button>
		<p>
			<%
	  			String mensagem = request.getSession().getAttribute("errorMsg").toString();
     		    request.getSession().setAttribute("errorMsg", "");
	     		out.print(mensagem);
	 		 %>
		</p>
	</div>
<%
	}
%>
<%
	if (request.getSession().getAttribute("alertMsg") != null && !request.getSession().getAttribute("alertMsg").equals("") ){
%>
	<div class="alert alert-warning alert-dismissible fade show" role="alert">
		<h4 class="alert-heading">Alerta:</h4>
		<button type="button" class="close" data-dismiss="alert" aria-label="Close">
			<span aria-hidden="true">&times;</span>
		</button>
		<p>
			<%
	  			String mensagem = request.getSession().getAttribute("alertMsg").toString();
     		    request.getSession().setAttribute("alertMsg", "");
	     		out.print(mensagem);
	 		 %>
		</p>
	</div>
<%
	}
	if (request.getSession().getAttribute("infoMsg") != null && !request.getSession().getAttribute("infoMsg").equals("") ){
%>
	<div class="alert alert-primary alert-dismissible fade show" role="alert">
		<h4 class="alert-heading">Informação:</h4>
		<button type="button" class="close" data-dismiss="alert" aria-label="Close">
			<span aria-hidden="true">&times;</span>
		</button>
		<p>
			<%
	  			String mensagem = request.getSession().getAttribute("infoMsg").toString();
     			request.getSession().setAttribute("infoMsg", "");
	     		out.print(mensagem);
	 		 %>
		</p>
	</div>
<%
	}
	if (request.getSession().getAttribute("sucessoMsg") != null && !request.getSession().getAttribute("sucessoMsg").equals("") ){
%>
	<div class="alert alert-success alert-dismissible fade show" role="alert">
		<h4 class="alert-heading">Sucesso!</h4>
		<button type="button" class="close" data-dismiss="alert" aria-label="Close">
			<span aria-hidden="true">&times;</span>
		</button>
		<p>
			<%
	  			String mensagem = request.getSession().getAttribute("sucessoMsg").toString();
 				request.getSession().setAttribute("sucessoMsg", "");
	     		out.print(mensagem);
	 		 %>
		</p>
	</div>
<%
	}
	if (request.getSession().getAttribute("configMsg") != null && !request.getSession().getAttribute("configMsg").equals("") ){
%>
	<div class="alert alert-success alert-dismissible fade show" role="alert">
		<h4 class="alert-heading">Configuração:</h4>
		<button type="button" class="close" data-dismiss="alert" aria-label="Close">
			<span aria-hidden="true">&times;</span>
		</button>
		<p>
			<%
	  			String mensagem = request.getSession().getAttribute("configMsg").toString();
				request.getSession().setAttribute("configMsg", "");
	     		out.print(mensagem);
	 		 %>
		</p>
	</div>
<%
	}
%>