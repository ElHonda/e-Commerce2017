<%@page import="com.sun.corba.se.impl.javax.rmi.CORBA.Util"%>
<%@page import="eCommerce.core.impl.controle.Fachada"%>
<%@page import="eCommerce.core.IFachada"%>
<%@page import="eCommerce.dominio.Autor"%>
<%@page import="eCommerce.dominio.Editora"%>
<%@page import="eCommerce.dominio.GrupoPrecificacao"%>
<%@page import="java.util.Collections"%>
<%@page import="eCommerce.dominio.Categoria"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Comparator"%>
<%@page import="eCommerce.dominio.SubCategoria"%>
<%@page import="eCommerce.dominio.EntidadeDominio"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<div class="navbar navbar-expand-md navbar-dark bg-dark">
    <div class="collapse navbar-collapse" id="inner-nav1">
        <ul class="nav navbar-nav">
            <li>
                <a style="padding-top: 9px; padding-bottom: 9px;" href="<%=request.getContextPath()%>/Livro/FormLivro.jsp">
	   				<img src="<%=request.getContextPath()%>/resources/images/img-cad-new.png" width="30" height="30" alt="">
                </a>
            </li>
        </ul>
    </div>
    <div class="my-2">
        <ul class="nav">
            <li class="text-white">
                <a data-target="#form-consulta-avancada" data-toggle="collapse" class="collapsed" aria-expanded="false">
                    <button class="btn btn-secondary">Pesquisar</button>
                </a>
            </li>
        </ul>
    </div>
</div>
<div class="out container collapse" id="form-consulta-avancada" style="">
    <br>
    <form role="form" action="ListaLivro" method="get">
        <div class="card text-white bg-dark">
            <div class="card-header card-inverse text-white">Parâmetros da busca</div>
            <div class="card-block">
                    <div class="row">
                        <div class="form-group col-sm-3">
							<label for="livro_titulo">Título</label>
							<input class="form-control form-control-sm" type="text" id="livro_titulo" name="livro_titulo"/>
                        </div>
                        <div class="form-group col-sm-3">
							<label for="livro_edicao">Edição</label>
							<input class="form-control form-control-sm" type="text" id="livro_edicao" name="livro_edicao"/>
                        </div>
                        <div class="form-group col-sm-3">
							<label for="livro_ano">Ano</label>
							<input class="form-control form-control-sm" type="text" id="livro_ano" name="livro_ano"/>
                        </div>
                        <div class="form-group col-sm-3">
                            <label for="livro_autor_id">Autor</label>
                            <select class="form-control form-control-sm" name="livro_autor_id" id="livro_autor_id">
                                <option value="">Selecione</option>
                          		<% 
									IFachada fachada = new Fachada();
                            		List<EntidadeDominio> autores = fachada.consultar(new Autor()).getEntidades();
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
									<option value="<%= autor.getId().toString() %>"><%= autor.getSobrenome() + ", " + autor.getNome() %> </option>
								<%
									}
								%>
                            </select>
                        </div>
                    </div>
                    <div class="row">
                        <div class="form-group col-sm-2">
                            <label for="livro_editora_id"> Editora </label>
                            <select class="form-control form-control-sm"  name="livro_editora_id" id="livro_editora_id">
                                <option value="">Selecione</option>
                          		<% 
                            		List<EntidadeDominio> editoras = fachada.consultar(new Editora()).getEntidades();
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
									<option value="<%= editora.getId().toString() %>"><%= editora.getNome() %> </option>
								<%
									}
								%>
                            </select>
                        </div>
                        <div class="form-group col-sm-2">
							<label for="livro_grupopreco_id">Grupo de Precificação</label>
                            <select class="form-control form-control-sm"  name="livro_grupopreco_id" id="livro_grupopreco_id">
                                <option value="">Selecione</option>
                          		<% 
                            		List<EntidadeDominio> grupos = fachada.consultar(new GrupoPrecificacao()).getEntidades();
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
									<option value="<%= grupo.getId().toString() %>"><%= grupo.getDescricao() %> </option>
								<%
									}
								%>
                            </select>
                        </div>
                        <div class="form-group col-sm-2">
							<label for="livro_isbn">ISBN</label>
							<input class="form-control form-control-sm" type="text" id="livro_isbn" name="livro_isbn"/>
                        </div>
                        <div class="form-group col-sm-2">
							<label for="livro_numeropaginas">Número de Páginas</label>
							<input class="form-control form-control-sm" type="text" id="livro_numeropaginas" name="livro_numeropaginas"/>
                        </div>
                        <div class="form-group col-sm-2">
							<label for="livro_sinopse">Sinopse</label>
							<input class="form-control form-control-sm" type="text" id="livro_sinopse" name="livro_sinopse"/>
                        </div>
                        <div class="form-group col-sm-2">
                            <label for="livro_ativo">Ativo</label>
                   		    <select class="form-control form-control-sm"  name="livro_ativo" id="livro_ativo">
                   		    	<option value="">Todos</option>
                            	<option value="true">Sim</option>
	                            <option value="false">Não</option>
							</select>
                        </div>
                   	</div>
					<div class="row">
                        <div class="form-group col-sm-3">
							<label for="livro_dimensao_altura">Altura</label>
							<input class="form-control form-control-sm" type="text" id="livro_dimensao_altura" name="livro_dimensao_altura"/>
                        </div>
                        <div class="form-group col-sm-3">
							<label for="livro_dimensao_largura">Largura</label>
							<input class="form-control form-control-sm" type="text" id="livro_dimensao_largura" name="livro_dimensao_largura"/>
                        </div>
                        <div class="form-group col-sm-3">
							<label for="livro_dimensao_peso">Peso</label>
							<input class="form-control form-control-sm" type="text" id="livro_dimensao_peso" name="livro_dimensao_peso"/>
                        </div>
                        <div class="form-group col-sm-3">
							<label for="livro_dimensao_profundidade">Profundidade</label>
							<input class="form-control form-control-sm" type="text" id="livro_dimensao_profundidade" name="livro_dimensao_profundidade"/>
                        </div>
                   	</div>
					<div class="row">
                   	<%
                   		List<EntidadeDominio> categorias = fachada.consultar( new Categoria()).getEntidades();
                   		Collections.sort( categorias , new Comparator<Object>(){
                   			public int compare( Object o1 , Object o2 ){
                   				Categoria c1 = (Categoria)o1;
                   				Categoria c2 = (Categoria)o2;
                   				return c1.getDescricao().compareTo(c2.getDescricao());
                   			}
                   		});
                   	%>
                   		<div class="form-group col-sm-3">
                   		    <label for="livro_categoria_0">Categoria</label>
                   		    <select class="form-control form-control-sm"  name="livro_categoria_0" id="livro_categoria_0">
                            	<option value="">Selecione</option>
                            	<% 
                            		for( EntidadeDominio ent : categorias ){
										Categoria categoria = (Categoria)ent;
								%>
								<option value="<%= categoria.getId() %>"><%= categoria.getDescricao() %> </option>
								<%
									}
								%>
							</select>
                        </div>
                   	<%
                   		List<EntidadeDominio> subcategorias = fachada.consultar( new SubCategoria()).getEntidades();
                   		Collections.sort( subcategorias , new Comparator<Object>(){
                   			public int compare( Object o1 , Object o2 ){
                   				SubCategoria c1 = (SubCategoria)o1;
                   				SubCategoria c2 = (SubCategoria)o2;
                   				return c1.getDescricao().compareTo(c2.getDescricao());
                   			}
                   		});
                   	%>
                   		<div class="form-group col-sm-3">
                   		    <label for="livro_subcategoria_0">Sub-Categoria</label>
                   		    <select class="form-control form-control-sm"  name="livro_subcategoria_0" id="livro_subcategoria_0">
                            	<option value="">Selecione</option>
                            	<% 
                            		for( EntidadeDominio ent : subcategorias ){
										SubCategoria subcategoria = (SubCategoria)ent;
								%>
								<option value="<%= subcategoria.getId() %>"><%= subcategoria.getDescricao() %> </option>
								<%
									}
								%>
							</select>
                        </div>

                   	</div>
                <br>
                <div class="text-center">
                    <input name="operacao" value="Consultar" class="btn btn-secondary btn-sm" data-disable-with="Buscar" type="submit">
                </div>
                <br>
            </div>
        </div>
    </form>
    <br>
</div>