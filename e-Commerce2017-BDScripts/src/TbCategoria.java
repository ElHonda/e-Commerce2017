
public class TbCategoria implements IScript{

	@Override
	public String getScript() {
		String str = "CREATE TABLE public.tb_categoria\n"
				+ "(\n"
				+ "id serial not null primary key,\n"
				+ "descricao character varying(30),\n"
				+ "dtcadastro date\n"
				+ ");"
				+ "INSERT INTO tb_categoria ( descricao , dtcadastro ) VALUES ( 'Romance', '2017-10-11');\r\n"
				+ "INSERT INTO tb_categoria ( descricao , dtcadastro ) VALUES ( 'Ficção', '2017-10-11');\r\n"
				+ "INSERT INTO tb_categoria ( descricao , dtcadastro ) VALUES ( 'Comédia', '2017-10-11');\r\n"
				+ "INSERT INTO tb_categoria ( descricao , dtcadastro ) VALUES ( 'Academicos', '2017-10-11');";
		System.out.println(str);
		return str;
	}

}
