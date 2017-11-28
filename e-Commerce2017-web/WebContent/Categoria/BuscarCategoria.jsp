<%@page import="eCommerce.dominio.Cliente"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<div class="navbar navbar-expand-md navbar-dark bg-dark">
    <div class="collapse navbar-collapse" id="inner-nav1">
        <ul class="nav navbar-nav">
        	<%
        		Cliente cliente;
        		if( request.getSession().getAttribute( "current_cliente" ) == null ){
        			cliente = new Cliente();
        		}else{
        			cliente = (Cliente)request.getSession().getAttribute( "current_cliente" );
        		}
        	%>
        	<% if( cliente.isAdmin() ){ %>
            	<li>
	                <a style="padding-top: 9px; padding-bottom: 9px;" href="<%=request.getContextPath()%>/Categoria/FormCategoria">
	   					<img src="<%=request.getContextPath()%>/resources/images/img-cad-new.png" width="30" height="30" alt="">
                	</a>
            	</li>
            <% } %>
        </ul>
    </div>
    <div class="my-2">
        <ul class="nav">
            <li class="text-white">
                <a data-target="#form-consulta-avancada" data-toggle="collapse" class="collapsed" aria-expanded="false">
                    <button class="btn btn-secondary">Pesquisar</button>
                </a>
            </li>
        </ul>
    </div>
</div>
<div class="out container collapse" id="form-consulta-avancada" style="">
    <br>
    <form role="form" action="ListaCategoria" method="get">
        <div class="card text-white bg-dark">
	        <jsp:include page="Fieldset.jsp"></jsp:include>
	        <div class="text-center">
	            <input name="operacao" value="Consultar" class="btn btn-secondary btn-sm" data-disable-with="Buscar" type="submit">
	        </div>
	        <br>
        </div>
    </form>
    <br>
</div>