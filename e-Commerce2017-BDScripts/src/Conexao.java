import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	public static Connection getConnection() 
			throws ClassNotFoundException, 
		SQLException{
		//DriverManager.registerDriver(new org.postgresql.Driver());
		String driver = "org.postgresql.Driver";
		String url = "jdbc:postgresql://localhost:5432/eCommerce2017";
		String user = "admin";
		String password = "admin";
		try {
			Class.forName( driver ).newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		Connection conn = DriverManager.getConnection( url, user, password);

		return conn;
	}

}
