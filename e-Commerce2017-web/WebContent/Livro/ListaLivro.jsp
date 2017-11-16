<%@page import="eCommerce.dominio.Cliente"%>
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
	<jsp:include page="BuscarLivro.jsp"/>
	<br/>
	
	<jsp:include page="../public/messages.jsp"/>

	<div style="overflow-x:auto;">
		<table class="table table-sm table-bordered table-hover table-inverse">
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
						<th>
							<%
								if( livro.getSinopse().length() > 30 ){
									out.print(livro.getSinopse().substring(0, 27)+"...");	
								}else{
									out.print( livro.getSinopse() );
								}
									
							%>
						</th>
						<th><%= livro.getAtivo() ? "SIM" : "NÃO" %></th>
						<% if( cli.isAdmin() || true ) {
								if( livro.getAtivo() ){
						%>
							
								<th><a href="<%=request.getContextPath()%>/Livro/InativarLivro?livro_id=<%= livro.getId().toString() %>&operacao=INATIVAR">Inativar</a></th>
					   		 <%
								}else{
					   		 %>
								<th><a href="<%=request.getContextPath()%>/Livro/AtivarLivro?livro_id=<%= livro.getId().toString() %>&operacao=ATIVAR">Ativar</a></th>
					   		 <% } %>
							<th><a href="<%=request.getContextPath()%>/Livro/EditarLivro?livro_id=<%= livro.getId().toString() %>">Editar</a></th>
							<th><a href="<%=request.getContextPath()%>/Livro/ExcluirLivro?livro_id=<%= livro.getId().toString() %>" onclick="return confirm('Realmente deseja excluir o Livro ?')">Excluir</a></th>
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