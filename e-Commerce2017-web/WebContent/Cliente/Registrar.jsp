<%@page import="eCommerce.dominio.Pais"%>
<%@page import="java.util.Comparator"%>
<%@page import="java.util.Collections"%>
<%@page import="eCommerce.dominio.EntidadeDominio"%>
<%@page import="java.util.List"%>
<%@page import="eCommerce.core.aplicacao.Resultado"%>
<%@page import="eCommerce.dominio.ETipoLogradouro"%>
<%@page import="eCommerce.dominio.ETipoResidencia"%>
<%@page import="eCommerce.dominio.ESexo"%>

<li class="nav-item dropdown">
    <a href="#" class="nav-link dropdown-toggle" data-toggle="dropdown" aria-expanded="false">Cadastre-se<span class="caret"></span></a>
    <ul class="dropdown-menu dropdown-menu-right dropdown-lr register animated flipInX" role="menu">
        <div class="col-lg-12">
            <div class="text-center"><h3><b>Cadastre-se</b></h3></div>
            <form id="ajax-register-form" action="" method="post" role="form" autocomplete="off">
                <div class="row">
                    <div class="form-group col-md-6">
                        <input type="text" name="cliente_nome" id="cliente_nome" class="form-control form-control-sm" placeholder="Nome Completo" value="">
                    </div>
                    <div class="form-group col-md-6">
                        <input type="email" name="cliente_email" id="cliente_email" class="form-control form-control-sm" placeholder="E-mail" value="">
                    </div>
                </div>
                <div class="row">
                    <div class="form-group col-md-6">
                        <input type="password" name="cliente_senha" id="cliente_senha"  class="form-control form-control-sm" placeholder="Senha">
                    </div>
                    <div class="form-group col-md-6">
                        <input type="password" name="cliente_senha_confirmar" id="cliente_senha_confirmar" class="form-control form-control-sm" placeholder="Confirmação da Senha">
                    </div>
                </div>
                <div class="row">
                    <div class="form-group col-md-6">
                        <select class="form-control form-control-sm" name="cliente_sexo" id="cliente_sexo" >
                            <% 
                                for( ESexo sex: ESexo.values() ){
                            %>
                                    <option value="<%= sex %>"><%= sex %> </option>
                            <%
                                }
                            %>
                        </select>
                    </div>
                    <div class="form-group col-md-6">
                        <input type="date" name="cliente_datanasc" id="cliente_datanasc" class="form-control form-control-sm" placeholder="Data Nascimento">
                    </div>
                </div>
                <div class="row">
                    <div class="form-group col-md-6">
                        <input type="text" name="cliente_cpf" id="cliente_cpf" class="form-control form-control-sm" placeholder="C.P.F.">
                    </div>
                    <div class="form-group col-md-6">
                        <input type="text" name="cliente_telefone" id="cliente_telefone" class="form-control form-control-sm" placeholder="Telefone">
                    </div>
                </div>
                <div class="text-center">
                	<h5>
                		<b>Endereço</b>
                	</h5>
                </div>
                <div class="row">
                    <div class="form-group col-md-6">
						<select class="form-control form-control-sm" name="cliente_pais" id="cliente_pais">
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
							<option value="<%= pais.getId().toString() %>"><%= pais.getNome() %> </option>
						<%
								}
                  	        }
						%>
                    	</select>
                    </div>
                    <div class="form-group col-md-6">
						<select class="form-control form-control-sm" name="cliente_estado" id="cliente_estado">
							<option value="">Estado</option>
                    	</select>
                    </div>
                </div>
                <div class="row">
                    <div class="form-group col-md-6">
						<select class="form-control form-control-sm" name="cliente_cidade" id="cliente_cidade">
							<option value="">Cidade</option>
                    	</select>
                    </div>
                    <div class="form-group col-md-6">
                         <input type="text" name="cliente_cep" id="cliente_cep" class="form-control form-control-sm" placeholder="C.E.P.">
                    </div>
                </div>
                <div class="row">
                    <div class="form-group col-md-6">
                        <select class="form-control form-control-sm" name="cliente_tiporesidencia" id="cliente_tiporesidencia" >
                        	<option value="">Tipo de Residência</option>
                        <% 
                            for( ETipoResidencia eResidencia: ETipoResidencia.values() ){
                        %>
                                <option value="<%= eResidencia %>"><%= eResidencia %> </option>
                        <%
                            }
                        %>
                        </select>
                    </div>
                    <div class="form-group col-md-6">
                        <select class="form-control form-control-sm" name="cliente_tipologradouro" id="cliente_tipologradouro" >
                        <% 
                            for( ETipoLogradouro eTipo: ETipoLogradouro.values() ){
                        %>
                                <option value="<%= eTipo %>"><%= eTipo %> </option>
                        <%
                            }
                        %>
                        </select>
                    </div>
                </div>
                <div class="row">
                    <div class="form-group col-md-6">
                        <input type="text" name="cliente_logradouro" id="cliente_logradouro" class="form-control form-control-sm" placeholder="Logradouro">
                    </div>
                    <div class="form-group col-md-6">
                        <input type="text" name="cliente_numero" id="cliente_numero" class="form-control form-control-sm" placeholder="Número">
                    </div>
				</div>
                <div class="row">
                    <div class="form-group col-md-6">
                        <input type="text" name="cliente_bairro" id="cliente_bairro" class="form-control form-control-sm" placeholder="Bairro">
                    </div>
                    <div class="form-group col-md-6">
                        <input type="text" name="cliente_observacao" id="cliente_observacao" class="form-control form-control-sm" placeholder="OBS.">
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-12">
                        <a href="#" class="btn btn-success btn-sm btn-block">Registre-se</a>
                    </div>
                </div>
            </form>
        </div>
    </ul>
</li>