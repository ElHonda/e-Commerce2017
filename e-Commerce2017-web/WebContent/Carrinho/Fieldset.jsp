<%@page import="eCommerce.dominio.Livro"%>
<%@page import="eCommerce.dominio.Carrinho"%>
<%@page import="java.util.List"%>
<%
	Carrinho car;
	car = (Carrinho)request.getSession().getAttribute("carrinho");	
%>
<%
	if( car.getLivros().size() > 0 ){
		for( Livro livro : car.getLivros() ){
%>
		<div class="col-md-12 column productbox text-white">
			<div class="row">
				<div class="form-group col-md-2">
					<img src="<%=request.getContextPath()%>/resources/images/livro.png" class="img-thumbnail">
		    		<a href="#" id="remover_livro" value="<%= car.getLivros().indexOf(livro) %>" class="btn btn-danger btn-sm btn-block" >Remover</a>
				</div>
				<div class="col-md-3">
					<input type="hidden" name="livro_id" id="livro_id" value="<%= livro.getId() %>">
					<div>Título: <%= livro.getTitulo() %></div>
			    	<div>Autor:<%= livro.getAutor().getNome() + " " + livro.getAutor().getSobrenome() %></div>
			    	<div>Edição: <%= livro.getEdicao() %></div>
			    	<div>Páginas: <%= livro.getNumeroPaginas() %></div>
			    	<div>PREÇO: R$ 8.95</div>
				</div>
				<div class="col-md-3">
					<div>ISBN: <%= livro.getIsbn() %></div>
					<div>Dimensões: <%= livro.getDimensao().getProfundidade() %>x<%= livro.getDimensao().getLargura() %>x<%= livro.getDimensao().getAltura() %>cm</div>
					<div>Ano: <%= livro.getAno() %></div>
					<div>Editora: <%= livro.getEditora().getNome() %></div>
		    		<div class="row">
		    			<div class="col-sm-6">
					    		Quantidade
		    			</div>
		    			<div class="input-group number-spinner col-sm-6 ">
							<span class="input-group-btn">
								<button class="btn btn-danger btn-sm" <%= "data-dir=\"dwn\"" %> type="button">-</button>
							</span>
							<input type="text" class="form-control form-control-sm text-center" value="<%= livro.getQuantidade() %>" id="livro_<%= livro.getId() %>_quantidade" >
							<span class="input-group-btn">
								<button class="btn btn-success btn-sm" <%= "data-dir=\"up\"" %> type="button">+</button>
							</span>
						</div>
		    		</div>
				</div>
				<div class="col-md-4">
	    			<div><%= livro.getSinopse() %></div>
				</div>
			</div>
		</div>
<%
		}
	}
%>