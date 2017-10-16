
public class TbCliente implements IScript{

	@Override
	public String getScript() {
		// TODO Auto-generated method stub
		return "CREATE TABLE tb_cliente(\r\n" + 
				"	id SERIAL PRIMARY KEY,\r\n" + 
				"	email VARCHAR(100) NOT NULL,\r\n" + 
				"	senha VARCHAR(60) NOT NULL,\r\n" + 
				"	nome VARCHAR(100) NOT NULL,\r\n" + 
				"	sexo VARCHAR(20) NOT NULL,\r\n" +
				"   dtnascimento DATE NOT NULL,\r\n" + 
				"   cpf CHARACTER(14) NOT NULL," + 
				"	ranking numeric(12,4),\r\n" + 
				"	ativo BOOLEAN NOT NULL DEFAULT TRUE,\r\n" +
				"   admin BOOLEAN NOT NULL DEFAULT FALSE," +
				"   dtcadastro DATE" +
				");";

	}

}
