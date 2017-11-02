<%@page import="eCommerce.dominio.SubCategoria"%>
<%@page import="eCommerce.dominio.Categoria"%>
<%@page import="eCommerce.dominio.GrupoPrecificacao"%>
<%@page import="eCommerce.dominio.Editora"%>
<%@page import="eCommerce.dominio.Livro"%>
<%@page import="eCommerce.dominio.Autor"%>
<%@page import="java.util.Comparator"%>
<%@page import="java.util.Collections"%>
<%@page import="eCommerce.dominio.EntidadeDominio"%>
<%@page import="java.util.List"%>
<%@page import="eCommerce.core.aplicacao.Resultado"%>
<%
	Livro livro;
	if( request.getAttribute("entidadeEnviada") == null ){
		livro = new Livro();
	}else{
		livro = (Livro)request.getAttribute("entidadeEnviada");
	}	
%>
<input type="hidden" name="livro_id" id="livro_id" value="<%= livro.getId() == null ? "" : livro.getId() %>">
<input type="hidden" name="livro_ativo" id="livro_ativo" value="<%= livro.getAtivo() == null ? "true" : livro.getAtivo() %>">
<div class="card-header text-center"><%= request.getAttribute("header") %></div>
<div class="card-block" style="padding-left: 10px; padding-right: 10px;">
    <div class="row">
        <div class="form-group col-sm-3">
            <label for="livro_titulo">Título</label>
            <input class="form-control form-control-sm" type="text" id="livro_titulo" name="livro_titulo" value="<%= livro.getTitulo() == null ? "" : livro.getTitulo() %>"/>
        </div>
        <div class="form-group col-sm-3">
            <label for="livro_edicao">Edição</label>
            <input class="form-control form-control-sm" type="text" id="livro_edicao" name="livro_edicao" value="<%= livro.getEdicao() == null ? "" : livro.getEdicao() %>"/>
        </div>
        <div class="form-group col-sm-3">
            <label for="livro_ano">Ano</label>
            <input class="form-control form-control-sm" type="text" id="livro_ano" name="livro_ano" value="<%= livro.getAno() == null ? "" : livro.getAno() %>"/>
        </div>
        <div class="form-group col-sm-3">
            <label for="livro_autor_id">Autor</label>
            <select class="form-control form-control-sm" name="livro_autor_id" id="livro_autor_id">
                <option value="">Selecione</option>
                <% 
                    if( request.getAttribute( "listaAutor" ) !=  null ){
                        Resultado resultado = (Resultado)request.getAttribute( "listaAutor" );
                        List<EntidadeDominio> autores = resultado.getEntidades();
                        Collections.sort( autores , new Comparator<Object>(){
                            public int compare( Object o1, Object o2 ){
                                Autor a1 = (Autor)o1;
                                Autor a2 = (Autor)o2;
                                return (a1.getSobrenome()+a1.getNome()).compareTo(a2.getSobrenome()+ a2.getNome() );
                            }
                        });

                        for( EntidadeDominio ent : autores ){
                            Autor autor = (Autor)ent;
                %>
                    <option value="<%= autor.getId() %>" <%= livro.getAutor() != null && livro.getAutor().getId() == autor.getId() ? "selected=\"selected\"" : "" %>><%= autor.getSobrenome() + ", " + autor.getNome() %> </option>
                <%
                        }
                    }
                %>
            </select>
        </div>
    </div>
    <div class="row">
        <div class="form-group col-sm-3">
            <label for="livro_editora_id"> Editora </label>
            <select class="form-control form-control-sm"  name="livro_editora_id" id="livro_editora_id">
                <option value="">Selecione</option>
                <% 
                    if( request.getAttribute( "listaEditora" ) !=  null ){
                        Resultado resultado = (Resultado)request.getAttribute( "listaEditora" );
                        List<EntidadeDominio> editoras = resultado.getEntidades();
                        Collections.sort( editoras , new Comparator<Object>(){
                            public int compare( Object o1, Object o2 ){
                                Editora e1 = (Editora)o1;
                                Editora e2 = (Editora)o2;
                                return e1.getNome().compareTo(e2.getNome());
                            }
                        });

                        for( EntidadeDominio ent : editoras ){
                            Editora editora = (Editora)ent;
                %>
                    <option value="<%= editora.getId() %>" <%= livro.getEditora() != null && livro.getEditora().getId() == editora.getId() ? "selected=\"selected\"" : "" %>><%= editora.getNome() %> </option>
                <%
                        }
                    }
                %>
            </select>
        </div>
        <div class="form-group col-sm-3">
            <label for="livro_grupopreco_id">Grupo de Precificação</label>
            <select class="form-control form-control-sm"  name="livro_grupopreco_id" id="livro_grupopreco_id">
                <option value="">Selecione</option>
                <% 
                    if( request.getAttribute( "listaGrupo" ) !=  null ){
                        Resultado resultado = (Resultado)request.getAttribute( "listaGrupo" );
                        List<EntidadeDominio> grupos = resultado.getEntidades();
                        Collections.sort( grupos , new Comparator<Object>(){
                            public int compare( Object o1, Object o2 ){
                                GrupoPrecificacao g1 = (GrupoPrecificacao)o1;
                                GrupoPrecificacao g2 = (GrupoPrecificacao)o2;
                                return g1.getDescricao().compareTo(g2.getDescricao());
                            }
                        });

                        for( EntidadeDominio ent : grupos ){
                            GrupoPrecificacao grupo = (GrupoPrecificacao)ent;
                %>
                    <option value="<%= grupo.getId() %>" <%= livro.getGrupo() != null && livro.getGrupo().getId() == grupo.getId() ? "selected=\"selected\"" : "" %>><%= grupo.getDescricao() %> </option>
                <%
                        }
                    }
                %>
            </select>
        </div>
        <div class="form-group col-sm-2">
            <label for="livro_isbn">ISBN</label>
            <input class="form-control form-control-sm" type="text" id="livro_isbn" name="livro_isbn" value="<%= livro.getIsbn() == null ? "" : livro.getIsbn() %>"/>
        </div>
        <div class="form-group col-sm-2">
            <label for="livro_numeropaginas">Número de Páginas</label>
            <input class="form-control form-control-sm" type="text" id="livro_numeropaginas" name="livro_numeropaginas" value="<%= livro.getNumeroPaginas() == null ? "" : livro.getNumeroPaginas() %>"/>
        </div>
        <div class="form-group col-sm-2">
            <label for="livro_sinopse">Sinopse</label>
            <input class="form-control form-control-sm" type="text" id="livro_sinopse" name="livro_sinopse" value="<%= livro.getSinopse() == null ? "" : livro.getSinopse() %>"/>
        </div>
	</div>
    <div class="row">
        <input type="hidden" name="livro_dimensao_id" id="livro_dimensao_id" value="<%= livro.getDimensao().getId() == null ? "" : livro.getDimensao().getId() %>">
        <div class="form-group col-sm-3">
            <label for="livro_dimensao_altura">Altura</label>
            <input class="form-control form-control-sm" type="text" id="livro_dimensao_altura" name="livro_dimensao_altura" value="<%= livro.getDimensao().getAltura() == null ? "" : livro.getDimensao().getAltura() %>"/>
        </div>
        <div class="form-group col-sm-3">
            <label for="livro_dimensao_largura">Largura</label>
            <input class="form-control form-control-sm" type="text" id="livro_dimensao_largura" name="livro_dimensao_largura" value="<%= livro.getDimensao().getLargura() == null ? "" : livro.getDimensao().getLargura() %>"/>
        </div>
        <div class="form-group col-sm-3">
            <label for="livro_dimensao_peso">Peso</label>
            <input class="form-control form-control-sm" type="text" id="livro_dimensao_peso" name="livro_dimensao_peso" value="<%= livro.getDimensao().getPeso() == null ? "" : livro.getDimensao().getPeso() %>"/>
        </div>
        <div class="form-group col-sm-3">
            <label for="livro_dimensao_profundidade">Profundidade</label>
            <input class="form-control form-control-sm" type="text" id="livro_dimensao_profundidade" name="livro_dimensao_profundidade" value="<%= livro.getDimensao().getProfundidade() == null ? "" : livro.getDimensao().getProfundidade() %>"/>
        </div>
    </div>
    <div class="row" id="row_categoria">
    <%
        for( Integer j = 0 ; j == 0 || ( livro.getCategorias() != null && j < livro.getCategorias().size() ) ; j++ ){
    %>
        <div class="form-group col-sm-3" id="div_livro_categoria_<%= j %>">
            <label for="livro_categoria">Categoria <%= j+1 %></label>
	   		<div class="input-group" >
	        	<input type="hidden" name="livro_categoria_id_<%= j %>" id="livro_categoria_id_<%= j %>" value="<%=
	        		   livro.getCategorias() == null 
	        		|| livro.getCategorias().size() <= 0
	        		|| livro.getCategorias().get(j).getId() == null ? "" : livro.getCategorias().get(j).getId()
	        	%>">

	            <select class="form-control form-control-sm"  name="livro_categoria_<%= j %>" id="livro_categoria_<%= j %>">
	                <option value="">Selecione</option>
	    <% 
	            if( request.getAttribute( "listaCategoria" ) !=  null ){
	                Resultado resultado = (Resultado)request.getAttribute( "listaCategoria" );
	                List<EntidadeDominio> categorias = resultado.getEntidades();
	                Collections.sort( categorias , new Comparator<Object>(){
	                    public int compare( Object o1 , Object o2 ){
	                        Categoria c1 = (Categoria)o1;
	                        Categoria c2 = (Categoria)o2;
	                        return c1.getDescricao().compareTo(c2.getDescricao());
	                    }
	                });
	                for( EntidadeDominio ent : categorias ){
	                    Categoria categoria = (Categoria)ent;
	    %>
	                <option value="<%= categoria.getId() %>" <%=
	            	   livro.getCategorias() != null 
	            	&& j < livro.getCategorias().size()
	            	&& livro.getCategorias().get(j) != null
	            	&& livro.getCategorias().get(j).getCategoria() != null
	            	&& livro.getCategorias().get(j).getCategoria().getId() != null
	            	&& livro.getCategorias().get(j).getCategoria().getId() == categoria.getId()
	            	? "selected=\"selected\"" : ""  %>><%= categoria.getDescricao() %> </option>
	    <%
	                }
	            }
	    %>
	            </select>
		      	<span class="input-group-btn" id="spn_nova_categoria">
		        	<button id="nova_categoria" class="btn btn-secondary btn-sm btn btn-success" type="button">+</button>
		    	</span>
		      	<span class="input-group-btn">
		        	<button id="remover_categoria" class="btn btn-secondary btn-sm btn btn-danger" type="button">-</button>
		    	</span>
	    	</div>
        </div>

    <%
        }
    %>
    </div>
    <div class="row" id="row_subcategoria" >
    <%
    	for( Integer j = 0 ; j == 0 || ( livro.getSubcategorias() != null && j < livro.getSubcategorias().size() ) ; j++ ){
	%>
    	<div class="form-group col-sm-3" id="div_livro_subcategoria_<%= j %>">
       		<label for="livro_subcategoria">Sub-categoria <%= j+1 %></label>
	   		<div class="input-group" >
	        	<input type="hidden" name="livro_subcategoria_id_<%= j %>" id="livro_subcategoria_id_<%= j %>" value="<%=
	        		   livro.getSubcategorias() == null 
	        		|| livro.getSubcategorias().size() <= 0
	        		|| livro.getSubcategorias().get(j).getId() == null ? "" : livro.getSubcategorias().get(j).getId()
	        	%>">
	        	<select class="form-control form-control-sm"  name="livro_subcategoria_<%= j %>" id="livro_subcategoria_<%= j %>">
	            	<option value="">Selecione</option>
		<% 
	        	if( request.getAttribute( "listaSubCategoria" ) !=  null ){
	            	Resultado resultado = (Resultado)request.getAttribute( "listaSubCategoria" );
	            	List<EntidadeDominio> subcategorias = resultado.getEntidades();
	            	Collections.sort( subcategorias , new Comparator<Object>(){
	                	public int compare( Object o1 , Object o2 ){
	                    	SubCategoria c1 = (SubCategoria)o1;
	                    	SubCategoria c2 = (SubCategoria)o2;
	                    	return c1.getDescricao().compareTo(c2.getDescricao());
	                	}
	            	});
	            	for( EntidadeDominio ent : subcategorias ){
	                	SubCategoria subcategoria = (SubCategoria)ent;
		%>
	            	<option value="<%= subcategoria.getId() %>" <%=
	            	   livro.getSubcategorias() != null 
	            	&& j < livro.getSubcategorias().size()
	            	&& livro.getSubcategorias().get(j) != null
	            	&& livro.getSubcategorias().get(j).getSubcategoria() != null
	            	&& livro.getSubcategorias().get(j).getSubcategoria().getId() != null
	            	&& livro.getSubcategorias().get(j).getSubcategoria().getId() == subcategoria.getId()
	            	? "selected=\"selected\"" : ""   %>><%= subcategoria.getDescricao() %> </option>
		<%
	            	}
	        	}
		%>
	        	</select>
		      	<span class="input-group-btn" id="spn_nova_subcategoria">
		        	<button id="nova_subcategoria" class="btn btn-secondary btn-sm btn btn-success" type="button">+</button>
		    	</span>
		      	<span class="input-group-btn">
		        	<button id="remover_subcategoria" class="btn btn-secondary btn-sm btn btn-danger" type="button">-</button>
		    	</span>
	    	</div>
		</div>

	<%
    	}
	%>
    </div>
</div>