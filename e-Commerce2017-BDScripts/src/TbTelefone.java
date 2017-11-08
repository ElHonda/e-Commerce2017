
public class TbTelefone implements IScript{

	@Override
	public String getScript() {
		return  "CREATE TABLE tb_telefone (\r\n" + 
				"		id serial primary key,\r\n" + 
				"		tipo varchar(15),\r\n" + 
				"		ddd varchar(2),\r\n" + 
				"		numero varchar(9),\r\n" + 
				"		telefonavel_id INTEGER NOT NULL,\r\n" + 
				"		telefonavel_class VARCHAR(150)\r\n" +  
		        ");";
		
	}

}
