package eCommerce.core.utils;

import java.sql.SQLException;

import eCommerce.core.impl.dao.SubCategoriaDAO;
import eCommerce.dominio.EntidadeDominio;
import eCommerce.dominio.SubCategoria;

public class Teste {
	public static void main(String[] args) throws SQLException {
		SubCategoria sc = new SubCategoria();
		SubCategoriaDAO dDAO = new SubCategoriaDAO();
		
		sc.setId(2);
		

		try {
			for( EntidadeDominio ed : dDAO.consultar(sc) ) {
				SubCategoria sub = (SubCategoria)ed;
				System.out.println(	sub.getDescricao());
			}
			
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
