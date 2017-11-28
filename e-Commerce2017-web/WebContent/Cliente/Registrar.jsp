<%@page import="eCommerce.dominio.Cidade"%>
<%@page import="eCommerce.dominio.Estado"%>
<%@page import="eCommerce.dominio.Endereco"%>
<%@page import="eCommerce.dominio.Telefone"%>
<%@page import="eCommerce.dominio.Cliente"%>
<%@page import="eCommerce.dominio.ETipoTelefone"%>
<%@page import="eCommerce.dominio.Pais"%>
<%@page import="java.util.Comparator"%>
<%@page import="java.util.Collections"%>
<%@page import="eCommerce.dominio.EntidadeDominio"%>
<%@page import="java.util.List"%>
<%@page import="eCommerce.core.aplicacao.Resultado"%>
<%@page import="eCommerce.dominio.ETipoLogradouro"%>
<%@page import="eCommerce.dominio.ETipoResidencia"%>
<%@page import="eCommerce.dominio.ESexo"%>
<%
	Cliente cliente;
	if( request.getSession().getAttribute( "current_cliente" ) == null ){
		cliente = new Cliente();
	}else{
		cliente = (Cliente)request.getSession().getAttribute( "current_cliente" );
	}
%>
<li class="nav-item dropdown">
    <a href="#" class="nav-link dropdown-toggle" data-toggle="dropdown" aria-expanded="false">Cadastre-se<span class="caret"></span></a>
    <ul class="dropdown-menu dropdown-menu-right dropdown-lr register animated flipInX" role="menu">
        <div class="col-lg-12">
            <div class="text-center"><h3><b>Cadastre-se</b></h3></div>
            <form id="ajax-register-form" action="<%=request.getContextPath()%>/Cliente/RegistrarCliente" method="post" role="form" autocomplete="off">
                <div class="row">
                    <div class="form-group col-md-4 nopadding">
                        <input type="email" name="cliente_email" id="cliente_email" class="form-control form-control-sm" placeholder="E-mail" value="<%= cliente.getEmail() == null ? "" : cliente.getEmail() %>">
                    </div>
                    <div class="form-group col-md-4 nopadding">
                        <input type="password" name="cliente_senha" id="cliente_senha"  class="form-control form-control-sm" placeholder="Senha">
                    </div>
                    <div class="form-group col-md-4 nopadding">
                        <input type="password" name="cliente_senha_confirmar" id="cliente_senha_confirmar" class="form-control form-control-sm" placeholder="Confirmação da Senha">
                    </div>
                </div>
                <div class="row">
                    <div class="form-group col-md-4 nopadding">
                        <input type="text" name="cliente_nome" id="cliente_nome" class="form-control form-control-sm" placeholder="Nome Completo" value="<%= cliente.getNome() == null ? "" : cliente.getNome() %>">
                    </div>
                    <div class="form-group col-md-4 nopadding">
                        <select class="form-control form-control-sm" name="cliente_sexo" id="cliente_sexo" >
                            <% 
                                for( ESexo sex: ESexo.values() ){
                            %>
                                    <option value="<%= sex %>" <%= cliente.getSexo() != null && cliente.getSexo().equals(sex) ? "selected=\"selected\"" : "" %>><%= sex %> </option>
                            <%
                                }
                            %>
                        </select>
                    </div>
                    <div class="form-group col-md-4 nopadding">
                        <input type="date" name="cliente_datanasc" id="cliente_datanasc" class="form-control form-control-sm" placeholder="Data Nascimento" value="<%= cliente.getDataNasc() == null ? "" : cliente.getDataNascFormatada("yyyy-MM-dd") %>">
                    </div>
                </div>
                <div class="row">
                    <div class="form-group col-md-4 nopadding">
                        <input type="text" name="cliente_cpf" id="cliente_cpf" class="form-control form-control-sm" placeholder="C.P.F."  value="<%= cliente.getCpf() == null ? "" : cliente.getCpf() %>">
                    </div>
                    <%
                    	Telefone tel;
                    	if( cliente.getTelefones().size() > 0 ){
                    		tel = cliente.getTelefones().get(0);
                    	}else{
                    		tel = new Telefone();
                    	}
                    %>
					<input type="hidden" name="cliente_telefone_0" id="cliente_telefone_0" value="0">
                    <input type="hidden" name="cliente_telefone_id_0" id="cliente_telefone_id_0" value="<%= tel.getId() == null ? "" : tel.getId() %>">
                    <div class="form-group col-md-4 nopadding">
                        <select class="form-control form-control-sm" name="cliente_telefone_tipo_0" id="cliente_telefone_tipo_0" >
                            <option value="">Tipo de Telfone</option>
                            <% 
                                for( ETipoTelefone tipo: ETipoTelefone.values() ){
                            %>
                                    <option value="<%= tipo %>" <%= tel.getTipo() != null && tel.getTipo().equals(tipo) ? "selected=\"selected\"" : "" %>><%= tipo %> </option>
                            <%
                                }
                            %>
                        </select>
                    </div>
                    <div class="form-group col-md-1 nopadding">
                        <input type="text" name="cliente_telefone_ddd_0" id="cliente_telefone_ddd_0" class="form-control form-control-sm" placeholder="DDD" value="<%= tel.getDdd() == null ? "" : tel.getDdd() %>">
                    </div>
                    <div class="form-group col-md-3 nopadding">
                        <input type="text" name="cliente_telefone_numero_0" id="cliente_telefone_numero_0" class="form-control form-control-sm" placeholder="Número" value="<%= tel.getNumero() == null ? "" : tel.getNumero() %>">
                    </div>
                </div>
                <div class="text-center">
                	<h6>
                		<b>Endereço</b>
                	</h6>
                </div>
                
                <div class="row">
                    <%
                    	Endereco end;
                    	if( cliente.getEnderecos().size() > 0 ){
                    		end = cliente.getEnderecos().get(0);
                    	}else{
                    		end = new Endereco();
                    	}
                    %>
                    <input type="hidden" name="cliente_endereco_0" id="cliente_endereco_0" value="0">
                    <input type="hidden" name="cliente_endereco_id_0" id="cliente_endereco_id_0" value="<%= end.getId() == null ? "" : end.getId() %>">
                    <div class="form-group col-md-4 nopadding">
						<select class="form-control form-control-sm" name="cliente_endereco_pais_id_0" id="cliente_endereco_pais_id_0">
							<option value="">País</option>
						<% 
							if( request.getAttribute( "listaPais" ) !=  null ){
                  				Resultado resultado = (Resultado)request.getAttribute( "listaPais" );
                          		List<EntidadeDominio> paises = resultado.getEntidades();
								Collections.sort( paises , new Comparator<Object>(){
									public int compare( Object o1, Object o2 ){
										Pais p1 = (Pais)o1;
										Pais p2 = (Pais)o2;
										return (p1.getNome()).compareTo(p2.getNome() );
									}
								});
	
								for( EntidadeDominio ent : paises ){
									Pais pais = (Pais)ent;
						%>
							<option value="<%= pais.getId() %>" 
							 <%=    end.getCidade() != null                       && end.getCidade().getId() > 0
							     && end.getCidade().getEstado() != null           && end.getCidade().getEstado().getId() > 0 
							     && end.getCidade().getEstado().getPais() != null && end.getCidade().getEstado().getPais().getId() > 0
							     && end.getCidade().getEstado().getPais().equals( pais )
									 ? "selected=\"selected\"" : "" %>
							><%= pais.getNome() %> </option>
						<%
								}
                  	        }
						%>
                    	</select>
                    </div>
                    <div class="form-group col-md-4 nopadding">
						<select class="form-control form-control-sm" name="cliente_endereco_estado_id_0" id="cliente_endereco_estado_id_0">
							<% 
								if( request.getAttribute( "listaEstado" ) !=  null ){
	                  				Resultado resultado = (Resultado)request.getAttribute( "listaEstado" );
	                          		List<EntidadeDominio> estados = resultado.getEntidades();
									Collections.sort( estados , new Comparator<Object>(){
										public int compare( Object o1, Object o2 ){
											Estado e1 = (Estado)o1;
											Estado e2 = (Estado)o2;
											return (e1.getNome()).compareTo(e2.getNome() );
										}
									});
		
									for( EntidadeDominio ent : estados ){
										Estado estado= (Estado)ent;
							%>
								<option value="<%= estado.getId() %>" 
								 <%=    end.getCidade() != null                       && end.getCidade().getId() > 0
								     && end.getCidade().getEstado() != null           && end.getCidade().getEstado().getId() > 0 
								     && end.getCidade().getEstado().equals( estado )
										 ? "selected=\"selected\"" : "" %>
								><%= estado.getNome() %> </option>
							<%
									}
	                  	        }else{
	                  	    %>
  	    							<option value="">Selecione o País</option>
	                  	    <%
	                  	        }
							%>
                    	</select>
                    </div>
                    <div class="form-group col-md-4 nopadding">
						<select class="form-control form-control-sm" name="cliente_endereco_cidade_id_0" id="cliente_endereco_cidade_id_0">
							<% 
								if( request.getAttribute( "listaCidade" ) !=  null ){
	                  				Resultado resultado = (Resultado)request.getAttribute( "listaCidade" );
	                          		List<EntidadeDominio> cidades = resultado.getEntidades();
									Collections.sort( cidades , new Comparator<Object>(){
										public int compare( Object o1, Object o2 ){
											Cidade c1 = (Cidade)o1;
											Cidade c2 = (Cidade)o2;
											return (c1.getNome()).compareTo(c2.getNome() );
										}
									});
		
									for( EntidadeDominio ent : cidades ){
										Cidade cidade= (Cidade)ent;
							%>
								<option value="<%= cidade.getId() %>" 
								<%= end.getCidade().equals(cidade) ? "selected=\"selected\"" : "" %>
								><%= cidade.getNome() %></option>
							<%
									}
	                  	        }else{
              	        	%>
								<option value="">Selecione o Estado</option>
              	        	<%
	                  	        }
							%>
                    	</select>
                    </div>
                </div>
                <div class="row">
                    <div class="form-group col-md-4 nopadding">
                         <input type="text" name="cliente_endereco_cep_0" id="cliente_endereco_cep_0" class="form-control form-control-sm" placeholder="C.E.P." value="<%= end.getCep() == null ? "" : end.getCep() %>">
                    </div>
                    <div class="form-group col-md-4 nopadding">
                        <select class="form-control form-control-sm" name="cliente_endereco_tiporesidencia_0" id="cliente_endereco_tiporesidencia_0" >
                        	<option value="">Tipo de Residência</option>
                        <% 
                            for( ETipoResidencia eResidencia: ETipoResidencia.values() ){
                        %>
                                <option value="<%= eResidencia %>" <%= end.getTipoResidencia() != null && end.getTipoResidencia().equals(eResidencia) ? "selected=\"selected\"" : "" %>><%= eResidencia %> </option>
                        <%
                            }
                        %>
                        </select>
                    </div>
                    <div class="form-group col-md-4 nopadding">
                        <select class="form-control form-control-sm" name="cliente_endereco_tipologradouro_0" id="cliente_endereco_tipologradouro_0" >
                        <% 
                            for( ETipoLogradouro eTipo: ETipoLogradouro.values() ){
                        %>
                                <option value="<%= eTipo %>" <%= end.getTipoLogradouro() != null && end.getTipoLogradouro().equals(eTipo) ? "selected=\"selected\"" : "" %>><%= eTipo %> </option>
                        <%
                            }
                        %>
                        </select>
                    </div>
                </div>
                <div class="row">
                    <div class="form-group col-md-4 nopadding">
                        <input type="text" name="cliente_endereco_logradouro_0" id="cliente_endereco_logradouro_0" class="form-control form-control-sm" placeholder="Logradouro" value="<%= end.getLogradouro() == null ? "" : end.getLogradouro() %>">
                    </div>
                    <div class="form-group col-md-4 nopadding">
                        <input type="text" name="cliente_endereco_numero_0" id="cliente_endereco_numero_0" class="form-control form-control-sm" placeholder="Número" value="<%= end.getNumero() == null ? "" : end.getNumero() %>">
                    </div>
                    <div class="form-group col-md-4 nopadding">
                        <input type="text" name="cliente_endereco_bairro_0" id="cliente_endereco_bairro_0" class="form-control form-control-sm" placeholder="Bairro" value="<%= end.getBairro() == null ? "" : end.getBairro() %>">
                    </div>
				</div>
                <div class="row">
                    <div class="form-group col-md-12 nopadding">
                        <input type="text" name="cliente_endereco_observacao_0" id="cliente_endereco_observacao_0" class="form-control form-control-sm" placeholder="Observação do Endereço" value="<%= end.getObservacoes() == null ? "" : end.getObservacoes() %>">
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-12 nopadding">
                        <button  class="btn btn-success btn-sm btn-block" type="submit">Registre-se</button>
                    </div>
                </div>
            </form>
        </div>
    </ul>
</li>