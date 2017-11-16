<%@page import="eCommerce.dominio.Editora"%>
<%
	Editora editora;
	if( request.getAttribute("entidadeEnviada") == null ){
		editora = new Editora();
	}else{
		editora = (Editora)request.getAttribute("entidadeEnviada");
	}	
%>
<input type="hidden" name="editora_id" id="editora_id" value="<%= editora.getId() == null ? "" : editora.getId() %>">
<div class="card-header text-center"><%= request.getAttribute("header") %></div>
<div class="card-block" style="padding-left: 10px; padding-right: 10px;">
    <div class="row">
        <div class="form-group col-sm-12">
            <label for="editora_nome">Nome</label>
            <input class="form-control form-control-sm" type="text" id="editora_nome" name="editora_nome" value="<%= editora.getNome() == null ? "" : editora.getNome() %>"/>
        </div>
    </div>
</div>