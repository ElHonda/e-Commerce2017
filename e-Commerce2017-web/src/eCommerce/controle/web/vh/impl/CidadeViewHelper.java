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
import eCommerce.dominio.Cidade;
import eCommerce.dominio.EntidadeDominio;
import eCommerce.dominio.Estado;

public class CidadeViewHelper implements IViewHelper{
	@Override
	public EntidadeDominio getEntidade(HttpServletRequest request) {
		String id        = request.getParameter( "cidade_id"        );
		String nome      = request.getParameter( "cidade_nome"      );
		String estado_id = request.getParameter( "cidade_estado_id" );
		String ativo     = request.getParameter( "cidade_ativo"     );
		
		Estado estado=null;
		if( estado_id != null ){
			estado = new Estado();
			estado.setId(Integer.parseInt(estado_id));
		}
		
		return buildEntidade(id, nome, estado, ativo);
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
				Cidade cidade;
	
	   			List<EntidadeDominio> cidades = resultado.getEntidades();
				Collections.sort( cidades , new Comparator<Object>(){
					public int compare( Object o1, Object o2 ){
						Cidade c1 = (Cidade)o1;
						Cidade c2 = (Cidade)o2;
						return (c1.getNome()).compareTo(c2.getNome() );
					}
				});
				
				for( EntidadeDominio c : cidades ) {
					cidade = (Cidade)c;
					jb = new JsonBuilder();
					jb.addKey( "id"   , cidade.getId().toString());
					jb.addKey( "nome" , cidade.getNome() );
					json.addListKey( "cidades" , jb.JsonToString() );
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
	public EntidadeDominio buildEntidade(String id, String nome, Estado estado, String ativo) {
		Cidade cidade = new Cidade();
		
		if( id != null && id.length() > 0) {
			cidade.setId(Integer.parseInt(id));
		}
		if( nome != null && nome.length() > 0 ) {
			cidade.setNome(nome);
		}
		if( estado != null && estado.getId() > 0 ) {
			cidade.setEstado(estado);
		}
		if( ativo != null && ativo.length() > 0 ) {
			cidade.setAtivo(Boolean.parseBoolean(ativo));
		}
		return cidade;
	}

}
