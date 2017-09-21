package eCommerce.core.utils;

import java.sql.SQLException;

import eCommerce.core.impl.dao.DimensaoDAO;
import eCommerce.dominio.Autor;
import eCommerce.dominio.Dimensao;

public class Teste {
	public static void main(String[] args) throws SQLException {
		Dimensao d = new Dimensao();
		DimensaoDAO dDAO = new DimensaoDAO();
		
		Autor a = new Autor();
		a.setId(15);
		
		d.setAltura(1.75);
		d.setLargura(2.21);
		d.setPeso(2.50);
		d.setProfundidade(0.50);
		d.setDimensionavel(a);
		try {
			dDAO.salvar(d);
			
			System.out.println("CERTO");
		} catch (Exception c) {
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
