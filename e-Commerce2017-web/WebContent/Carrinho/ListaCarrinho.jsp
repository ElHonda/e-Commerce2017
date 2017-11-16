<%@page import="eCommerce.dominio.Carrinho"%>
<%@page import="eCommerce.dominio.Livro"%>
<%@page import="eCommerce.dominio.EntidadeDominio"%>
<%@page import="eCommerce.core.aplicacao.Resultado"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>e-Commerce Livros</title>
	<%@include file="../public/head.html"%>
	<link rel="stylesheet" href="itemCarrinho.css">
</head>
<body style="padding-top: 50px;background-color: #455058;padding-bottom: 60px;">
	<jsp:include page="../public/navbar.jsp"/>
	<jsp:include page="../public/bodybar.jspf"/>
	<jsp:include page="../public/messages.jsp"/>
	
	<br/>
		<jsp:include page="BuscarCarrinho.jsp"/>
	<br/>
 	<div class="row">
		<% 
        	if( request.getAttribute( "resultadoConsultar" ) !=  null ){
				Resultado resultado = (Resultado)request.getAttribute( "resultadoConsultar" );
        	
				for( EntidadeDominio ent : resultado.getEntidades() ){
					Livro livro = (Livro)ent;
		%>
			<div class="col-md-2 column productbox text-white" <%= "data-toggle=\"tooltip\" data-placement=\"bottom\""  %> title="<%= livro.getSinopse() %>">
				<input type="hidden" name="livro_id" id="livro_id" value="<%= livro.getId() %>">
			    <img src="<%=request.getContextPath()%>/resources/images/livro.png"class="img-thumbnail">
			    <div class="producttitle"><%= livro.getTitulo() %></div>
			    <div class="producttitle"><%= livro.getAutor().getNome() + " " + livro.getAutor().getSobrenome() %></div>
			    <div class="productprice">
			    	<div class="row">
			    		<div class="pricetext col-sm-6">R$ 8.95</div>
						<div class="input-group number-spinner col-sm-6">
							<span class="input-group-btn">
								<button class="btn btn-danger btn-sm" <%= "data-dir=\"dwn\"" %>>-</button>
							</span>
							<input type="text" class="form-control form-control-sm text-center" value="1" id="livro_<%= livro.getId() %>_quantidade" >
							<span class="input-group-btn">
								<button class="btn btn-success btn-sm" <%= "data-dir=\"up\"" %>>+</button>
							</span>
						</div>
			    	</div>
			    	<div class="row">
			    		<div class="col-sm-12">
		    				<a id="comprar" name="comprar" href="#" class="btn btn-light btn-sm btn-block" >
			    				<img src="/e-Commerce2017-web/resources/images/cesta.png" width="40" height="30" alt="" style=""/>
			    				Comprar
			    			</a>
			    		</div>
			    	</div>
			    </div>
			</div>
		<%
				}
            }
		%>
 	</div>
 	<jsp:include page="../public/modalUtils.jsp"/>
	<jsp:include page="../public/util.jsp"/>
</body>
</html>