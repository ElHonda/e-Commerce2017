
public class TbSubCategoria implements IScript{

	@Override
	public String getScript() {
		String str = "CREATE TABLE public.tb_subcategoria\n"
				+ "(\n"
				+ "id serial not null primary key,\n"
				+ "descricao character varying(30),\n"
				+ "dtcadastro date\n"
				+ ");"
				+ "INSERT INTO tb_subcategoria ( descricao , dtcadastro ) VALUES ( 'Épicos'      , now() );\r\n"
				+ "INSERT INTO tb_subcategoria ( descricao , dtcadastro ) VALUES ( 'Científicos' , now() );\r\n"
				+ "INSERT INTO tb_subcategoria ( descricao , dtcadastro ) VALUES ( 'Didáticos'   , now() );\r\n"
				+ "INSERT INTO tb_subcategoria ( descricao , dtcadastro ) VALUES ( 'Fantasia'    , now() );";
		System.out.println(str);
		return str;
	}

}
