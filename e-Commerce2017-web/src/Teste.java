import java.sql.SQLException;

import eCommerce.core.impl.dao.EstadoDAO;
import eCommerce.core.utils.JsonBuilder;
import eCommerce.dominio.EntidadeDominio;
import eCommerce.dominio.Estado;

public class Teste {

	public static void main(String[] args) {
		EstadoDAO eDAO = new EstadoDAO();
		JsonBuilder jb, ob;
		Estado estado = new Estado();
		StringBuilder sb = new StringBuilder();
		ob = new JsonBuilder();
		try {
			for( EntidadeDominio e : eDAO.consultar(estado) ) {
				estado = (Estado)e;
				jb = new JsonBuilder();
				jb.addKey( "id"   , estado.getId().toString());
				jb.addKey( "nome" , estado.getNome() );
				ob.addListKey("estados", jb.JsonToString());
				if( sb.length() > 0 ) {
					sb.append(",");
				}
				sb.append(JsonBuilder.JsonToString(jb));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("\"estados\":[ " + sb.toString() + " ]");
		System.out.println(ob.JsonToString());

	}

}
