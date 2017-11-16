<%@page import="eCommerce.dominio.SubCategoria"%>
<%
	SubCategoria subcategoria;
	if( request.getAttribute("entidadeEnviada") == null ){
		subcategoria = new SubCategoria();
	}else{
		subcategoria = (SubCategoria)request.getAttribute("entidadeEnviada");
	}	
%>
<input type="hidden" name="subcategoria_id" id="subcategoria_id" value="<%= subcategoria.getId() == null ? "" : subcategoria.getId() %>">
<div class="card-header text-center"><%= request.getAttribute("header") %></div>
<div class="card-block" style="padding-left: 10px; padding-right: 10px;">
    <div class="row">
        <div class="form-group col-sm-12">
            <label for="subcategoria_descricao">Descrição</label>
            <input class="form-control form-control-sm" type="text" id="subcategoria_descricao" name="subcategoria_descricao" value="<%= subcategoria.getDescricao() == null ? "" : subcategoria.getDescricao() %>"/>
        </div>
    </div>
</div>