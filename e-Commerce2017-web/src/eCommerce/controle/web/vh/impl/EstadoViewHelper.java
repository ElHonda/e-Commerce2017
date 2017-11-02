package eCommerce.controle.web.vh.impl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import eCommerce.controle.web.vh.IViewHelper;
import eCommerce.core.aplicacao.EOperacao;
import eCommerce.core.aplicacao.Resultado;
import eCommerce.core.utils.JsonBuilder;
import eCommerce.dominio.EntidadeDominio;
import eCommerce.dominio.Estado;
import eCommerce.dominio.Pais;

public class EstadoViewHelper implements IViewHelper{
	@Override
	public EntidadeDominio getEntidade(HttpServletRequest request) {
		String id      = request.getParameter( "estado_id"      );
		String nome    = request.getParameter( "estado_nome"    );
		String pais_id = request.getParameter( "estado_pais_id" );
		String ativo   = request.getParameter( "estado_ativo"   );

		Pais pais=null;
		if( pais_id != null ){
			pais = new Pais();
			pais.setId(Integer.parseInt(pais_id));
		}
		
		return buildEntidade(id, nome, pais, ativo);
	}
	@Override
	public void setView(Resultado resultado, HttpServletRequest request, 
			HttpServletResponse response, EOperacao operacao , Boolean ajaxResponse)
			throws IOException, ServletException {

		switch (operacao) {
		case SALVAR:
			break;
		case ALTERAR:
			break;
		case VISUALIZAR:
			break;
		case EXCLUIR:
			break;
		case CONSULTAR:
			if( ajaxResponse ) {
				JsonBuilder jb;
				JsonBuilder json = new JsonBuilder();
				Estado estado;
	
	   			List<EntidadeDominio> estados = resultado.getEntidades();
				Collections.sort( estados , new Comparator<Object>(){
					public int compare( Object o1, Object o2 ){
						Estado e1 = (Estado)o1;
						Estado e2 = (Estado)o2;
						return (e1.getNome()).compareTo(e2.getNome() );
					}
				});
				
				for( EntidadeDominio e : estados ) {
					estado = (Estado)e;
					jb = new JsonBuilder();
					jb.addKey( "id"   , estado.getId().toString());
					jb.addKey( "nome" , estado.getNome() );
					json.addListKey( "estados" , jb.JsonToString() );
				}
		        response.setContentType("application/json");
		        response.setCharacterEncoding("UTF-8");
		        PrintWriter writer = response.getWriter();
		        writer.print( json.JsonToString() );
			}
			break;
		case NOVO:
			break;
		default:
			break;
		}
		
	}
	public EntidadeDominio buildEntidade(String id, String nome, Pais pais, String ativo) {
		Estado estado = new Estado();
		if( id != null && id.length() > 0) {
			estado.setId(Integer.parseInt(id));
		}
		if( nome != null && nome.length() > 0 ) {
			estado.setNome(nome);
		}
		if( pais != null && pais.getId() > 0 ) {
			estado.setPais(pais);
		}
		if( ativo != null && ativo.length() > 0 ) {
			estado.setAtivo(Boolean.parseBoolean(ativo));
		}
		return estado;
	}

}
