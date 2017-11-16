<%@page import="eCommerce.dominio.Cliente"%>
<%@page import="eCommerce.dominio.Categoria"%>
<%@page import="eCommerce.dominio.EntidadeDominio"%>
<%@page import="eCommerce.core.aplicacao.Resultado"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>::: e-Commerce ::: - Lista de Categorias</title>
	<%@include file="../public/head.html"%>
</head>
<%
	Cliente cli;
	if( request.getAttribute( "current_cliente" ) == null ){
		cli = new Cliente();
	}else{
		cli = (Cliente)request.getAttribute( "current_cliente" );
	}
%>
<body style="padding-top: 50px;background-color: #455058;padding-bottom: 60px;">
	<jsp:include page="../public/navbar.jsp"/>
	<jsp:include page="../public/bodybar.jspf"/>
	<br/>
	<jsp:include page="BuscarCategoria.jsp"/>
	<br/>
	
	<jsp:include page="../public/messages.jsp"/>

	<div style="overflow-x:auto;">
		<table class="table table-sm table-bordered table-hover table-inverse">
			<thead>
				<tr class="well">
					<th>Código</th>
					<th>Nome</th>
					<th>Dt. Cadastro</th>
				</tr>
			</thead>
			<tbody>
		        <% 
		        	if( request.getAttribute( "resultadoConsultar" ) !=  null ){
						Resultado resultado = (Resultado)request.getAttribute( "resultadoConsultar" );
		        	
						for( EntidadeDominio ent : resultado.getEntidades() ){
							Categoria categoria= (Categoria)ent;
				%>
					<tr>
						<th><%= categoria.getId().toString() %></th>
						<th><%= categoria.getDescricao() %></th>
						<th><%= categoria.getDtCadastroFormatada("dd/MM/yyyy") %></th>
						<% if( cli.isAdmin() ){ %>
							<th><a href="<%=request.getContextPath()%>/Categoria/EditarCategoria?categoria_id=<%= categoria.getId().toString() %>">Editar</a></th>
							<th><a href="<%=request.getContextPath()%>/Categoria/ExcluirCategoria?categoria_id=<%= categoria.getId().toString() %>" onclick="return confirm('Realmente deseja excluir a Categoria ?')">Excluir</a></th>
						<% } %>
					</tr>
				<%
						}
		            }
				%>
			</tbody>
		</table>
	</div>
	<jsp:include page="../public/util.jsp"/>
	<jsp:include page="../AjaxHelpers/categoria.jsp"/>
	<jsp:include page="../AjaxHelpers/subcategoria.jsp"/>
  </body>
</html>