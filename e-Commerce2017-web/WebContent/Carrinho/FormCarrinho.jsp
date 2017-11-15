<%@page import="eCommerce.dominio.Carrinho"%>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>::: e-Commerce ::: - Cadastro de Livros</title>
	<%@include file="../public/head.html"%>
	<link rel="stylesheet" href="itemCarrinhoShow.css">
</head>
<%
	Carrinho car;
	if( request.getSession().getAttribute( "carrinho" ) == null ){
		car = new Carrinho();
	}else{
		car = (Carrinho)request.getSession().getAttribute("carrinho");
	}
%>
<body style="padding-top: 50px;background-color: #455058;padding-bottom: 50px;">
	<jsp:include page="../public/navbar.jsp"/>
	<jsp:include page="../public/bodybar.jspf"/>
	<br/>
	
	<jsp:include page="../public/messages.jsp"/>

   	<%
   		if( car.getLivros().size() > 0 ){
   	%>
  	<form action="CriarLivro" method="post"  <%="data-confirm"%>="Deseja continuar com a compra ?">
  		<div class="row row-product">
			<jsp:include page="Fieldset.jsp"></jsp:include>
		</div>>
        <br/>
	</form>
    <%
		}
    %>
    <jsp:include page="../public/modalUtils.jsp"/>
	<jsp:include page="../public/util.jsp"/>
  </body>
</html>