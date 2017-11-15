
public class TbEditora implements IScript{

	@Override
	public String getScript() {
		String str = "CREATE TABLE tb_editora"
				+ "(\n"
				+ " id serial not null primary key,\n"
				+ " nome varchar(40),\n"
				+ " dtcadastro date\n"
				+ " );"
				+ "INSERT INTO tb_editora VALUES (1, 'Abril', now());\r\n"
				+ "INSERT INTO tb_editora VALUES (2, 'Globo', now());";
		System.out.println(str);
		return str;
	}

}
