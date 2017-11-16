<%@page language="java" contentType="text/html; charset=utf-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>::: e-Commerce ::: - Editar Editora</title>
	<%@include file="../public/head.html"%>
</head>
<body style="padding-top: 50px;background-color: #455058;padding-bottom: 80px;">
	<jsp:include page="../public/navbar.jsp"/>
	<jsp:include page="../public/bodybar.jspf"/>
	<br/>
	
	<jsp:include page="../public/messages.jsp"/>

  	<form action="AlterarEditora" method="post"  <%="data-confirm"%>="Realmente deseja alterar o Editora ?">
		<div class="card text-white bg-dark" >
            <div class="text-center">
				<jsp:include page="Fieldset.jsp"></jsp:include>
                <input id="operacao" name="operacao" value=" Alterar " class="btn btn-light btn-md" type="submit">
            </div>
            <br/>
        </div>
	</form>
	<jsp:include page="../public/util.jsp"/>
	<jsp:include page="../AjaxHelpers/categoria.jsp"/>
	<jsp:include page="../AjaxHelpers/subcategoria.jsp"/>
  </body>
</html>