<%@page import="eCommerce.core.aplicacao.Resultado"%>
<%@page import="com.sun.corba.se.impl.javax.rmi.CORBA.Util"%>
<%@page import="eCommerce.core.impl.controle.Fachada"%>
<%@page import="eCommerce.core.IFachada"%>
<%@page import="eCommerce.dominio.Autor"%>
<%@page import="eCommerce.dominio.Editora"%>
<%@page import="eCommerce.dominio.GrupoPrecificacao"%>
<%@page import="java.util.Collections"%>
<%@page import="eCommerce.dominio.Categoria"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Comparator"%>
<%@page import="eCommerce.dominio.SubCategoria"%>
<%@page import="eCommerce.dominio.EntidadeDominio"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<div class="navbar navbar-expand-md navbar-dark bg-dark">
    <div class="collapse navbar-collapse" id="inner-nav1">
        <ul class="nav navbar-nav">
            <li>
                <a style="padding-top: 9px; padding-bottom: 9px;" href="<%=request.getContextPath()%>/Livro/FormLivro">
	   				<img src="<%=request.getContextPath()%>/resources/images/img-cad-new.png" width="30" height="30" alt="">
                </a>
            </li>
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
    <form role="form" action="ListaLivro" method="get">
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