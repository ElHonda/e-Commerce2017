<%@page import="eCommerce.dominio.GrupoPrecificacao"%>
<%@page import="eCommerce.dominio.EntidadeDominio"%>
<%@page import="eCommerce.core.aplicacao.Resultado"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>::: e-Commerce ::: - Lista de Grupos de Preço</title>
	<%@include file="../public/head.html"%>
</head>
<body style="padding-top: 50px;background-color: #455058;padding-bottom: 50px;">
	<jsp:include page="../public/navbar.jsp"/>
	<jsp:include page="../public/bodybar.jspf"/>
	<br/>
	<jsp:include page="BuscarGrupo.jsp"/>
	<br/>
	
	<jsp:include page="../public/messages.jsp"/>

	<table class="table table-sm table-bordered table-hover table-inverse">
		<thead>
			<tr class="well">
				<th>Código</th>
				<th>Descrição</th>
				<th>Margem</th>
				<th>Dt. Cadastro</th>
			</tr>
		</thead>
		<tbody>
	        <% 
	        	if( request.getAttribute( "resultadoConsultar" ) !=  null ){
					Resultado resultado = (Resultado)request.getAttribute( "resultadoConsultar" );
	        	
					for( EntidadeDominio ent : resultado.getEntidades() ){
						GrupoPrecificacao grupo = (GrupoPrecificacao)ent;
			%>
				<tr>
					<th><%= grupo.getId().toString() %></th>
					<th><%= grupo.getDescricao() %></th>
					<th><%= grupo.getMargemLucro() %></th>
					<th><%= grupo.getDtCadastroFormatada("dd/MM/yyyy") %></th>
					<th><a href="<%=request.getContextPath()%>/GrupoPreco/EditarGrupo?grupo_id=<%= grupo.getId().toString() %>">Editar</a></th>
					<th><a href="<%=request.getContextPath()%>/GrupoPreco/ExcluirGrupo?grupo_id=<%= grupo.getId().toString() %>" onclick="return confirm('Realmente deseja excluir o Grupo de Preço ?')">Excluir</a></th>
				</tr>
			<%
					}
	            }
			%>
		</tbody>
	</table>
	<jsp:include page="../public/util.jsp"/>
	<jsp:include page="../AjaxHelpers/categoria.jsp"/>
	<jsp:include page="../AjaxHelpers/subcategoria.jsp"/>
  </body>
</html>