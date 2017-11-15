
public class TbCategoria implements IScript{

	@Override
	public String getScript() {
		String str = "CREATE TABLE public.tb_categoria\n"
				+ "(\n"
				+ "id serial not null primary key,\n"
				+ "descricao character varying(30),\n"
				+ "dtcadastro date\n"
				+ ");"
				+ "INSERT INTO tb_categoria VALUES (1, 'Romance', '2017-10-11');\r\n"
				+ "INSERT INTO tb_categoria VALUES (2, 'Ficção', '2017-10-11');\r\n"
				+ "INSERT INTO tb_categoria VALUES (3, 'Comédia', '2017-10-11');\r\n"
				+ "INSERT INTO tb_categoria VALUES (4, 'Academicos', '2017-10-11');";
		System.out.println(str);
		return str;
	}

}
