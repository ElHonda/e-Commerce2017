package eCommerce.core.utils;

import java.sql.SQLException;

import eCommerce.core.impl.dao.CategoriaDAO;
import eCommerce.dominio.Categoria;

public class Teste {
	public static void main(String[] args) throws SQLException {
		Categoria c = new Categoria();
		CategoriaDAO cDAO = new CategoriaDAO();
		
		c.setDescricao("TESTE DE CATEGORIA");
		try {
			cDAO.salvar(c);
			
			System.out.println("CERTO");
		} catch (Exception e) {
			// TODO: handle exception
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
	}

}
