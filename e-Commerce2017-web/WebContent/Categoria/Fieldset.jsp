<%@page import="eCommerce.dominio.Categoria"%>
<%
	Categoria categoria;
	if( request.getAttribute("entidadeEnviada") == null ){
		categoria = new Categoria();
	}else{
		categoria = (Categoria)request.getAttribute("entidadeEnviada");
	}	
%>
<input type="hidden" name="categoria_id" id="categoria_id" value="<%= categoria.getId() == null ? "" : categoria.getId() %>">
<div class="card-header text-center"><%= request.getAttribute("header") %></div>
<div class="card-block" style="padding-left: 10px; padding-right: 10px;">
    <div class="row">
        <div class="form-group col-sm-12">
            <label for="categoria_descricao">Descrição</label>
            <input class="form-control form-control-sm" type="text" id="categoria_descricao" name="categoria_descricao" value="<%= categoria.getDescricao() == null ? "" : categoria.getDescricao() %>"/>
        </div>
    </div>
</div>