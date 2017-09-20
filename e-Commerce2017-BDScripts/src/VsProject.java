import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class VsProject {
	Connection conn;
	Integer index = 0;

	public VsProject( Connection conn ) {
		this.conn = conn;
		PreparedStatement pst;
		System.out.println("Buscando versão do sistema...");
		String str = "SELECT max(version) AS version FROM version_project";
		try {
			pst = conn.prepareStatement(str);
			ResultSet rs = pst.executeQuery();
			if( rs.next() ){
				index =  rs.getInt("version");
			}
		}catch( SQLException e ) {
			// Tabela não existe, vamos criá-la
			System.out.println("Criando estrutura de versionamento...");
			str = "CREATE TABLE version_project ( version integer primary key )";
			try {
				pst = conn.prepareStatement(str);
				pst.executeUpdate();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

	public Integer getIndex() {
		return index;
	}
	
	public Integer UpVersion( Integer version ){
		PreparedStatement pst;
		Integer retorno = null;
		System.out.println("Atualizando versão...");
		String str = "INSERT INTO version_project ( version ) VALUES (?)";
		// Tabela não existe, vamos criá-la
		try {
			pst = conn.prepareStatement(str);
			pst.setInt(1, version);
			pst.executeUpdate();
			retorno = version;
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return retorno;
	}
}
