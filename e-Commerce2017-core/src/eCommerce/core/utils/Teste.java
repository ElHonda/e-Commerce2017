package eCommerce.core.utils;

import java.sql.SQLException;

import eCommerce.core.impl.dao.GrupoPrecificacaoDAO;
import eCommerce.dominio.GrupoPrecificacao;

public class Teste {
	public static void main(String[] args) throws SQLException {
		GrupoPrecificacao gp = new GrupoPrecificacao();
		GrupoPrecificacaoDAO dDAO = new GrupoPrecificacaoDAO();
		
		gp.setDescricao("TESTE");
		gp.setMargemLucro(15.20);
		

		try {
			dDAO.salvar(gp);
			
			System.out.println("CERTO");
		} catch (Exception c) {
			System.out.println("DEU ERRO");
		}
		
		/*
		a.setNome("Senhor");
		
		EntidadeDominio ed = a;
		
		try {
			Class<?> classe = Class.forName( ed.getClass().getName() );
            Class<?>[] paramTypes = null;

			Method metodo = classe.getDeclaredMethod("getNome", paramTypes);
            Object[] varargs = null;

			Object retorno = metodo.invoke( ed , varargs);
			
			System.out.println(retorno.toString());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}*/
		
	}

}
