
public class TbSubCategoria implements IScript{

	@Override
	public String getScript() {
		String str = "CREATE TABLE public.tb_subcategoria\n"
				+ "(\n"
				+ "id serial not null primary key,\n"
				+ "descricao character varying(30),\n"
				+ "dtcadastro date\n"
				+ ");"
				+ "INSERT INTO tb_subcategoria VALUES (1, 'Épicos'      , NULL);\r\n"
				+ "INSERT INTO tb_subcategoria VALUES (2, 'Científicos' , NULL);\r\n"
				+ "INSERT INTO tb_subcategoria VALUES (3, 'Didáticos'   , NULL);\r\n"
				+ "INSERT INTO tb_subcategoria VALUES (4, 'Fantasia'    , NULL);";
		System.out.println(str);
		return str;
	}

}
