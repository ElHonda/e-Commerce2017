<%@page import="eCommerce.dominio.ESexo"%>
<%@page import="eCommerce.dominio.Categoria"%>
<%@page import="eCommerce.dominio.SubCategoria"%>
<%@page import="eCommerce.dominio.GrupoPrecificacao"%>
<%@page import="eCommerce.dominio.Editora"%>
<%@page import="eCommerce.dominio.Autor"%>
<%@page import="eCommerce.dominio.EntidadeDominio"%>
<%@page import="java.util.Comparator"%>
<%@page import="java.util.Collections"%>
<%@page import="eCommerce.core.impl.controle.Fachada"%>
<%@page import="eCommerce.core.IFachada"%>
<%@page import="java.util.List" %>
<%@page import="java.sql.Connection"%>
<%@page import="eCommerce.core.utils.*"%>

<%@ page language="java" contentType="text/html; charset=utf-8"
pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>::: e-Commerce ::: - Cadastro de Livros</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
</head>
<body style="padding-top: 50px;background-color: #455058;padding-bottom: 50px;">
	<jsp:include page="../public/navbar.jsp"/>
	<jsp:include page="../public/bodybar.jspf"/>
	<br/>
	
	<jsp:include page="../public/messages.jsp"/>

  	<form action="CriarLivro" method="post"  <%="data-confirm"%>="Realmente deseja criar o Livro ?">
		<div class="card text-white bg-dark w-50 mx-auto" >
            <div class="text-center">
                <div class="card-header">Registrar-se</div>
                <div class="card-block">
                    <div class="row">
                        <div class="form-group col-sm-12">
							<label for="cliente_email">E-mail</label>
							<input class="form-control form-control-sm" type="text" id="cliente_email" name="cliente_email"/>
                        </div>
                    </div>
                    <div class="row">
                        <div class="form-group col-sm-12">
							<label for="cliente_senha">Senha</label>
							<input class="form-control form-control-sm" type="password" id="cliente_senha" name="cliente_senha"/>
                        </div>
                    </div>
                    <div class="row">
                        <div class="form-group col-sm-12">
							<label for="cliente_senha_confirmar">Confirmar Senha</label>
							<input class="form-control form-control-sm" type="password" id="cliente_senha_confirmar" name="cliente_senha_confirmar"/>
                        </div>
                    </div>
                    <div class="row">
                        <div class="form-group col-sm-12">
							<label for="cliente_nome">Nome</label>
							<input class="form-control form-control-sm" type="text" id="cliente_nome" name="cliente_nome"/>
                        </div>
                    </div>
                    <div class="row">
                        <div class="form-group col-sm-12">
                    		<label for="cliente_sexo">Gênero</label>
                        	<select class="form-control form-control-sm" name="cliente_sexo" id="cliente_sexo">
                          		<% 
									for( ESexo sex: ESexo.values() ){
								%>
										<option value="<%= sex %>"><%= sex %> </option>
								<%
									}
								%>
                    		</select>
                    	</div>
                    </div>
                    <div class="row">
                        <div class="form-group col-sm-4">
							<label for="cliente_datanasc">Data de Nascimento</label>
							<input class="form-control form-control-sm" type="text" id="cliente_datanasc" name="cliente_datanasc"/>
                        </div>
                        <div class="form-group col-sm-4">
							<label for="cliente_cpf">CPF</label>
							<input class="form-control form-control-sm" type="text" id="cliente_cpf" name="cliente_cpf"/>
                        </div>
                        <div class="form-group col-sm-4">
							<label for="cliente_telefone">Telefone</label>
							<input class="form-control form-control-sm" type="text" id="cliente_telefone" name="cliente_telefone"/>
                        </div>
                    </div>
                </div>
                <input id="operacao" name="operacao" value=" Salvar " class="btn btn-light btn-md" type="submit">
            </div>
            <br/>
        </div>
	</form>

	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>
	<jsp:include page="../public/util.jsp"/>
  </body>
</html>