
public class TbAutor implements IScript {

	public String getScript() {
		String str = "CREATE TABLE public.tb_autor\n"
				+ "(\n"
				+ "id serial not null primary key,\n"
				+ "dtcadastro date,\n"
				+ "nome character varying(100),\n"
				+ "sobrenome character varying(100)\n"
				+ ");"
				+ "INSERT INTO tb_autor ( dtcadastro , nome, sobrenome ) VALUES ( now(), 'Autor', 'de Primeiro');\r\n"
				+ "INSERT INTO tb_autor ( dtcadastro , nome, sobrenome ) VALUES ( now(), 'William', 'Stallings');\r\n"
				+ "INSERT INTO tb_autor ( dtcadastro , nome, sobrenome ) VALUES ( now(), 'Matthew', 'Reinhart');\r\n"
				+ "INSERT INTO tb_autor ( dtcadastro , nome, sobrenome ) VALUES ( now(), 'Kathy', 'Sierra');\r\n"
				+ "INSERT INTO tb_autor ( dtcadastro , nome, sobrenome ) VALUES ( now(), 'Thomas', 'H. Cormen');\r\n"
				+ "INSERT INTO tb_autor ( dtcadastro , nome, sobrenome ) VALUES ( now(), 'David', 'Flanagan');";
		return str;
	}
}