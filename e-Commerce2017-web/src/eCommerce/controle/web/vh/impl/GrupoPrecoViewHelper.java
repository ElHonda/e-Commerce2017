package eCommerce.controle.web.vh.impl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import eCommerce.controle.web.vh.IViewHelper;
import eCommerce.core.aplicacao.EOperacao;
import eCommerce.core.aplicacao.Resultado;
import eCommerce.dominio.EntidadeDominio;
import eCommerce.dominio.GrupoPrecificacao;


public class GrupoPrecoViewHelper implements IViewHelper{
	@Override
	public EntidadeDominio getEntidade(HttpServletRequest request) {
		String id 		   = request.getParameter( "grupo_id"		   );
		String descricao   = request.getParameter( "grupo_descricao"   );
		String margemlucro = request.getParameter( "grupo_margemlucro" );

		return buildEntidade(id, descricao, margemlucro);
	}
	@Override
	public void setView(Resultado resultado, HttpServletRequest request, HttpServletResponse response, EOperacao operacao , Boolean ajaxResponse)
			throws IOException, ServletException {
		StringBuilder sb = new StringBuilder();
		String redirectPage=null;
		GrupoPrecificacao grupoPreco;
		Boolean useDispatch=true;

		switch (operacao) {
		case SALVAR:
			if( resultado.getMsg() == null || resultado.getMsg().length() == 0 ) {
				redirectPage = "ListaGrupo";
				grupoPreco = (GrupoPrecificacao)resultado.getEntidades().get(0);
				sb.append( "Grupo de Preço \"" );
				sb.append( grupoPreco.getId().toString().trim() );
				sb.append( " - " );
				sb.append( grupoPreco.getDescricao().trim() );
				sb.append( "\" registrado com sucesso !" );
				request.getSession().setAttribute("sucessoMsg", sb.toString() );
				useDispatch = false;
			}else{
				redirectPage = "FormGrupo.jsp";
				request.setAttribute( "header" , "NOVO GRUPO DE PREÇO" );
				request.getSession().setAttribute( "errorMsg" , resultado.getMsg()      );
				request.setAttribute( "entidadeEnviada"       , resultado.getEntidade() );
			}

			break;
		case ALTERAR:
			if( resultado.getMsg() == null || resultado.getMsg().length() == 0 ) {
				redirectPage = "ListaGrupo";

				grupoPreco = (GrupoPrecificacao)resultado.getEntidades().get(0);
				sb.append( "Grupo de Preço \"" );
				sb.append( grupoPreco.getId().toString().trim() );
				sb.append( " - " );
				sb.append( grupoPreco.getDescricao().trim() );
				sb.append( "\" alterado com sucesso !" );
				useDispatch = false;
				request.getSession().setAttribute("sucessoMsg", sb.toString() );
			}else {
				redirectPage = "EditarGrupo.jsp";
				request.setAttribute( "header"               , "EDITAR"                );
				request.setAttribute( "entidadeEnviada"      , resultado.getEntidade() );
				request.getSession().setAttribute("errorMsg" , resultado.getMsg()      );
			}
			break;
		case VISUALIZAR:
			redirectPage = "EditarGrupo.jsp";
			request.setAttribute( "header"          , "EDITAR"                );
			request.setAttribute( "entidadeEnviada" , resultado.getEntidades().get(0) );
			break;
		case EXCLUIR:
			redirectPage = "ListaGrupo";

			if( resultado.getMsg() == null || resultado.getMsg().length() == 0 ) {
				grupoPreco = (GrupoPrecificacao)resultado.getEntidades().get(0);
				sb.append("Grupo de Preço \"");
				sb.append( grupoPreco.getId().toString().trim() );
				sb.append( " - " );
				sb.append( grupoPreco.getDescricao().trim() );
				sb.append( "\" excluído com sucesso !" );
				request.getSession().setAttribute( "alertMsg" , sb.toString() );
				useDispatch = false;
			}else {
				useDispatch = false;
				request.getSession().setAttribute( "errorMsg", resultado.getMsg() );
			}
			break;
		case CONSULTAR:
			redirectPage = "ListaGrupo.jsp";
			request.setAttribute( "header"             , "PESQUISA"              );
			request.setAttribute( "entidadeEnviada"    , resultado.getEntidade() );
			request.setAttribute( "resultadoConsultar" , resultado               );
			break;
		case NOVO:
			request.setAttribute( "header" , "NOVO GRUPO DE PREÇO" );
			redirectPage = "FormGrupo.jsp";
			break;
		default:
			break;
		}

		
		if( useDispatch ) {
			RequestDispatcher dispatch = request.getRequestDispatcher(redirectPage);
			dispatch.forward(request, response);
		}else {
			response.sendRedirect(redirectPage);
		}
		
	}
	public GrupoPrecificacao buildEntidade( String id , String descricao, String margemLucro) {
		GrupoPrecificacao grupo = new GrupoPrecificacao();
		if( id != null && id.length() > 0) {
			grupo.setId(Integer.parseInt(id));
		}
		if( descricao != null && descricao.length() > 0 ) {
			grupo.setDescricao(descricao);
		}
		if( margemLucro != null && margemLucro.length() > 0 ) {
			grupo.setMargemLucro(Double.parseDouble(margemLucro));
		}
		
		return grupo;
	}

}
