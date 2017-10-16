<%@page import="eCommerce.core.aplicacao.Resultado"%>
<%@page import="eCommerce.dominio.Livro"%>
<%@page import="eCommerce.dominio.EntidadeDominio"%>
<%@page import="eCommerce.core.impl.controle.Fachada"%>
<%@page import="eCommerce.core.IFachada"%>
<%@page import="java.util.List"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>::: e-Commerce ::: - Lista de Livros</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
</head>
<body style="padding-top: 50px;background-color: #455058;padding-bottom: 50px;">
	<jsp:include page="../public/navbar.jsp"/>
	<jsp:include page="../public/bodybar.jspf"/>
	<br/>
	<jsp:include page="BuscarLivro.jsp"/>
	<br/>
	
	<jsp:include page="../public/messages.jsp"/>

	<table class="table table-bordered table-hover table-inverse">
		<thead>
			<tr class="well">
				<th>Código</th>
				<th>Título</th>
				<th>Edição</th>
				<th>Ano</th>
				<th>Autor</th>
				<th>Editora</th>
				<th>Grupo de Preço</th>
				<th>ISBN</th>
				<th>Páginas</th>
				<th>Sinopse</th>
				<th>Ativo</th>
				<th/>
				<th/>
			</tr>
		</thead>
		<tbody>
	        <% 
	        	if( request.getAttribute( "resultadoConsultar" ) !=  null ){
					Resultado resultado = (Resultado)request.getAttribute( "resultadoConsultar" );
	        	
					for( EntidadeDominio ent : resultado.getEntidades() ){
						Livro livro = (Livro)ent;
			%>
				<tr>
					<th><%= livro.getId().toString() %></th>
					<th><%= livro.getTitulo() %></th>
					<th><%= livro.getEdicao() %></th>
					<th><%= livro.getAno().toString() %>
					<th><%= livro.getAutor().getSobrenome() + ", " + livro.getAutor().getNome() %></th>
					<th><%= livro.getEditora().getNome()  %></th>
					<th><%= livro.getGrupo().getDescricao() %></th>
					<th><%= livro.getIsbn() %></th>
					<th><%= livro.getNumeroPaginas().toString() %></th>
					<th><%= livro.getSinopse() %></th>
					<th><%= livro.getAtivo() ? "SIM" : "NÃO" %></th>
					<th><a href="<%=request.getContextPath()%>/Livro/EditarLivro?livro_id=<%= livro.getId().toString() %>">Editar</a></th>
					<th><a href="<%=request.getContextPath()%>/Livro/ExcluirLivro?livro_id=<%= livro.getId().toString() %>" onclick="return confirm('Realmente deseja excluir o Livro ?')">Excluir</a></th>
				</tr>
			<%
					}
	            }
			%>
		</tbody>
	</table>
	
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>
	<jsp:include page="../public/util.jsp"/>
  </body>
</html>