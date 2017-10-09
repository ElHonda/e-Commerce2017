import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VsScript {
	public static void main(String[] args) throws SQLException {
		List<IScript> lista = new ArrayList<>();
		PreparedStatement pst;
		Integer indexList = 0;

		// Sempre adicionar script abaixo do último para não dar problema na execução
		// O índice da lista será tratado como versão do banco.
		lista.add( new TbAutor()	 		 );
		lista.add( new TbCategoria() 		 );
		lista.add( new TbDimensao() 		 );
		lista.add( new TbEditora()   	 	 );
		lista.add( new TbGrupoPrecificacao() );
		lista.add( new TbSubCategoria()      );
		lista.add( new TbLivro() 			 );
		lista.add( new TbLivroCategoria()    );
		lista.add( new TbLivroSubCategoria() );
		lista.add( new TbPais()              );
		lista.add( new TbEstado()            );
		lista.add( new TbCidade()            );
		lista.add( new TbEndereco()          );
		lista.add( new TbCliente()           );
		lista.add( new TbTelefone()          );
		
		Connection conn= null ;
		try {
			conn = Conexao.getConnection();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		
		if( conn == null ) {
			System.out.println( "Erro de conexão" );
		}else {
			System.out.println("Conectado a Base de Dados");

			String script[];
			VsProject vp = new VsProject(conn);
			indexList = vp.getIndex();

			for( ; indexList < lista.size(); indexList++  ){
				System.out.println( "Executando script: " + lista.get(indexList).getClass().getName() );
				script = lista.get(indexList).getScript().split(";");
				
				for( String str : script ) {
					pst = conn.prepareStatement(str);
					pst.executeUpdate();
				}

				vp.UpVersion(indexList+1);
			}

			
		}
		System.out.println("PROCESSAMENTO CONCLUÍDO!");
	}
}
