
public class TbAutor implements IScript {

	public String getScript() {
		String str = "CREATE TABLE public.tb_autor\n"
				+ "(\n"
				+ "id serial not null primary key,\n"
				+ "dtcadastro date,\n"
				+ "nome character varying(100),\n"
				+ "sobrenome character varying(100)\n"
				+ ");"
				+ "INSERT INTO tb_autor VALUES (1, NULL, 'Autor', 'de Primeiro');\r\n"
				+ "INSERT INTO tb_autor VALUES (2, NULL, 'William', 'Stallings');\r\n"
				+ "INSERT INTO tb_autor VALUES (3, NULL, 'Matthew', 'Reinhart');\r\n"
				+ "INSERT INTO tb_autor VALUES (4, NULL, 'Kathy', 'Sierra');\r\n"
				+ "INSERT INTO tb_autor VALUES (5, NULL, 'Thomas', 'H. Cormen');\r\n"
				+ "INSERT INTO tb_autor VALUES (6, NULL, 'David', 'Flanagan');";
		return str;
	}
}