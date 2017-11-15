<%@page import="eCommerce.dominio.Livro"%>
<%@page import="eCommerce.dominio.Carrinho"%>
<%@page import="java.util.List"%>
<%
	Carrinho car;
	car = (Carrinho)request.getSession().getAttribute("carrinho");	
%>
<div class="row div-product col-md-12">
<%
	if( car.getLivros().size() > 0 ){
		for( Livro livro : car.getLivros() ){
%>
		<div class="col-md-6 product-view">
			<div class="row div-row-info">
				<div class="form-group col-md-3">
					<img src="<%=request.getContextPath()%>/resources/images/livro.png" class="img-thumbnail">
				</div>
				<div class="col-md-5">
					<input type="hidden" name="livro_id" id="livro_id" value="<%= livro.getId() %>">
					<div>Título: <%= livro.getTitulo() %></div>
					<div>Dimensões: <%= livro.getDimensao().getProfundidade() %>x<%= livro.getDimensao().getLargura() %>x<%= livro.getDimensao().getAltura() %>cm</div>
					<div>Editora: <%= livro.getEditora().getNome() %></div>
			    	<div>Autor:<%= livro.getAutor().getNome() + " " + livro.getAutor().getSobrenome() %></div>
				</div>
				<div class="col-md-4">
					<div>Edição: <%= livro.getEdicao() %></div>
			    	<div>Páginas: <%= livro.getNumeroPaginas() %></div>
					<div>ISBN: <%= livro.getIsbn() %></div>
					<div>Ano: <%= livro.getAno() %></div>
				</div>
			</div>
			<div class="row">
				<div class= "form-group col-md-3">
		    		<a href="#" id="remover_livro" <%= "value=\"" + livro.getId() + "\"" %> class="btn btn-danger btn-sm btn-block" >Remover</a>
				</div>
				<div class="col-md-5">
					<div class="row">
		    			<div class="col-sm-5" style="padding-top: 3px;">
					    		Quantidade
		    			</div>
		    			<div class="input-group number-spinner col-sm-7">
							<span class="input-group-btn">
								<button class="btn btn-danger btn-sm" <%= "data-dir=\"dwn\" data-op=\"update\"" %> type="button">-</button>
							</span>
							<input type="text" class="form-control form-control-sm text-center" value="<%= livro.getQuantidade() %>" id="livro_quantidade" disabled>
							<span class="input-group-btn">
								<button class="btn btn-success btn-sm" <%= "data-dir=\"up\" data-op=\"update\"" %> type="button">+</button>
							</span>
						</div>
		    		</div>
				</div>
				<div class="col-md-4">
			    	<div>PREÇO: R$ 8.95</div>
				</div>
			</div>
		</div>
<%
		}
	}
%>
	<div class="col-md-12" style="padding-top: 30px;">
        <input value="Salvar" class="btn btn-light btn-md" type="submit">
	</div>
</div>