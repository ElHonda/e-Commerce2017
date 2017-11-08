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
		<jsp:include page="Fieldset.jsp"></jsp:include>
        <input value="Salvar" class="btn btn-light btn-md" type="submit">
        <br/>
	</form>
    <%
		}
    %>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>
	<jsp:include page="../public/util.jsp"/>
  </body>
</html>