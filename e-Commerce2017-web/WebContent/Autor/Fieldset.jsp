<%@page import="eCommerce.dominio.Autor"%>
<%
	Autor autor;
	if( request.getAttribute("entidadeEnviada") == null ){
		autor = new Autor();
	}else{
		autor = (Autor)request.getAttribute("entidadeEnviada");
	}	
%>
<input type="hidden" name="autor_id" id="autor_id" value="<%= autor.getId() == null ? "" : autor.getId() %>">
<div class="card-header text-center"><%= request.getAttribute("header") %></div>
<div class="card-block" style="padding-left: 10px; padding-right: 10px;">
    <div class="row">
        <div class="form-group col-sm-6">
            <label for="autor_nome">Nome</label>
            <input class="form-control form-control-sm" type="text" id="autor_nome" name="autor_nome" value="<%= autor.getNome() == null ? "" : autor.getNome() %>"/>
        </div>
        <div class="form-group col-sm-6">
            <label for="autor_sobrenome">Sobrenome</label>
            <input class="form-control form-control-sm" type="text" id="autor_sobrenome" name="autor_sobrenome" value="<%= autor.getSobrenome() == null ? "" : autor.getSobrenome() %>"/>
        </div>
    </div>
</div>