
public class TbEndereco implements IScript{

	@Override
	public String getScript() {
		// TODO Auto-generated method stub
		return  "CREATE TABLE tb_endereco (\r\n" + 
				"		id serial primary key,\r\n" + 
				"		tiporesidencia varchar(15),\r\n" + 
				"		tipologradouro varchar(15),\r\n" + 
				"		logradouro varchar(150),\r\n" + 
				"		numero varchar(15),\r\n" + 
				"		bairro varchar(30),\r\n" + 
				"		cep char(8),\r\n" + 
				"		cidade_id integer NOT NULL REFERENCES tb_cidade ON UPDATE CASCADE ON DELETE RESTRICT,\r\n" + 
				"		observacoes TEXT,\r\n" + 
				"		enderecavel_id INTEGER NOT NULL,\r\n" + 
				"		enderecavel_class VARCHAR(150),\r\n" + 
				"		dtcadastro DATE NOT NULL" + 
		        ");";
		
	}

}
