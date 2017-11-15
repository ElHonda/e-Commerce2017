<%@page import="eCommerce.dominio.GrupoPrecificacao"%>
<%
	GrupoPrecificacao grupo;
	if( request.getAttribute("entidadeEnviada") == null ){
		grupo = new GrupoPrecificacao();
	}else{
		grupo = (GrupoPrecificacao)request.getAttribute("entidadeEnviada");
	}	
%>
<input type="hidden" name="grupo_id" id="grupo_id" value="<%= grupo.getId() == null ? "" : grupo.getId() %>">
<div class="card-header text-center"><%= request.getAttribute("header") %></div>
<div class="card-block" style="padding-left: 10px; padding-right: 10px;">
    <div class="row">
        <div class="form-group col-sm-8">
            <label for="grupo_descricao">Desrição</label>
            <input class="form-control form-control-sm" type="text" id="grupo_descricao" name="grupo_descricao" value="<%= grupo.getDescricao() == null ? "" : grupo.getDescricao() %>"/>
        </div>
        <div class="form-group col-sm-4">
            <label for="livro_edicao">Margem Lucro</label>
            <input class="form-control form-control-sm" type="number" min="0" max="100" step="0.01" id="grupo_margemlucro" name="grupo_margemlucro" value="<%= grupo.getMargemLucro() == null ? "0" : grupo.getMargemLucro() %>"/>
        </div>
    </div>
</div>