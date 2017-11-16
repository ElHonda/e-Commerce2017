
public class TbEditora implements IScript{

	@Override
	public String getScript() {
		String str = "CREATE TABLE tb_editora"
				+ "(\n"
				+ " id serial not null primary key,\n"
				+ " nome varchar(40),\n"
				+ " dtcadastro date\n"
				+ " );"
				+ "INSERT INTO tb_editora ( nome, dtcadastro ) VALUES ( 'Abril', now());\r\n"
				+ "INSERT INTO tb_editora ( nome, dtcadastro ) VALUES ( 'Globo', now());";
		System.out.println(str);
		return str;
	}

}
