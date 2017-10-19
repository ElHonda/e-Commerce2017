<%@page import="eCommerce.dominio.Pais"%>
<%@page import="eCommerce.core.aplicacao.Resultado"%>
<%@page import="eCommerce.dominio.ETipoResidencia"%>
<%@page import="eCommerce.dominio.ETipoLogradouro"%>
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
		<div class="card text-white bg-dark mx-auto" >
            <div class="text-center">
                <div class="card-header">Registrar-se</div>
                <div class="card-block" style="padding-left: 10px; padding-right: 10px">
                    <div class="row">
                        <div class="form-group col-sm-4">
							<label for="cliente_email">E-mail</label>
							<input class="form-control form-control-sm" type="text" id="cliente_email" name="cliente_email"/>
                        </div>
                        <div class="form-group col-sm-4">
							<label for="cliente_senha">Senha</label>
							<input class="form-control form-control-sm" type="password" id="cliente_senha" name="cliente_senha"/>
                        </div>
                        <div class="form-group col-sm-4">
							<label for="cliente_senha_confirmar">Confirmar Senha</label>
							<input class="form-control form-control-sm" type="password" id="cliente_senha_confirmar" name="cliente_senha_confirmar"/>
                        </div>
                    </div>
                    <div class="row">
                        <div class="form-group col-sm-8">
							<label for="cliente_nome">Nome</label>
							<input class="form-control form-control-sm" type="text" id="cliente_nome" name="cliente_nome"/>
                        </div>
                        <div class="form-group col-sm-4">
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
							<label for="cliente_datanasc">Dt. Nascimento</label>
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
                    <div class="row">
                    	<div class="form-group col-sm-4">
                    		<label for="cliente_pais">País</label>
                    		<select class="form-control form-control-sm" name="cliente_pais" id="cliente_pais">
								<option value="">Selecione</option>
                          		<% 
                    	        	if( request.getAttribute( "listaPais" ) !=  null ){
                    					Resultado resultado = (Resultado)request.getAttribute( "listaPais" );
                            			List<EntidadeDominio> paises = resultado.getEntidades();
										Collections.sort( paises , new Comparator<Object>(){
											public int compare( Object o1, Object o2 ){
												Pais p1 = (Pais)o1;
												Pais p2 = (Pais)o2;
												return (p1.getNome()).compareTo(p2.getNome() );
											}
										});
			
										for( EntidadeDominio ent : paises ){
											Pais pais = (Pais)ent;
								%>
									<option value="<%= pais.getId().toString() %>"><%= pais.getNome() %> </option>
								<%
										}
                    	        	}
								%>
                    		</select>
                    	</div>
                   		<div class="form-group col-sm-4">
                    		<label for="cliente_estado">Estado</label>
                    		<select class="form-control form-control-sm" name="cliente_estado" id="cliente_estado">
								<option value="">Selecione o País</option>
                    		</select>
                    	</div>
                   		<div class="form-group col-sm-4">
                    		<label for="cliente_cidade">Cidade</label>
                    		<select class="form-control form-control-sm" name="cliente_cidade" id="cliente_cidade">
								<option value="">Selecione o Estado</option>
                    		</select>
                    	</div>
                    </div>
	                <div class="row">
	                    <div class="form-group col-sm-2">
	                   		<label for="cliente_tiporesidencia">Tipo Residência</label>
	                       	<select class="form-control form-control-sm" name="cliente_tiporesidencia" id="cliente_tiporesidencia">
	                         		<% 
									for( ETipoResidencia eResidencia: ETipoResidencia.values() ){
								%>
										<option value="<%= eResidencia %>"><%= eResidencia %> </option>
								<%
									}
								%>
	                   		</select>
	                   	</div>
	                    <div class="form-group col-sm-2">
	                   		<label for="cliente_tipologradouro">Tipo Logradouro</label>
	                       	<select class="form-control form-control-sm" name="cliente_tipologradouro" id="cliente_tipologradouro">
	                         		<% 
									for( ETipoLogradouro eTipo: ETipoLogradouro.values() ){
								%>
										<option value="<%= eTipo %>"><%= eTipo %> </option>
								<%
									}
								%>
	                   		</select>
	                   	</div>
	                	<div class="form-group col-sm-6">
							<label for="cliente_logradouro">Logradouro</label>
							<input class="form-control form-control-sm" type="text" id="cliente_logradouro" name="cliente_logradouro"/>
	                    </div>
	                	<div class="form-group col-sm-2">
							<label for="cliente_numero">Número</label>
							<input class="form-control form-control-sm" type="text" id="cliente_numero" name="cliente_numero"/>
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
	<jsp:include page="../AjaxHelpers/searchEstado.jsp"/>
	<jsp:include page="../AjaxHelpers/searchCidade.jsp"/>
	
  </body>
</html>