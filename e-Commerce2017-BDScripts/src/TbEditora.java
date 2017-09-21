
public class TbEditora implements IScript{

	@Override
	public String getScript() {
		String str = "CREATE TABLE tb_editora"
				+ "(\n"
				+ " id serial not null primary key,\n"
				+ " nome varchar(40),\n"
				+ " dtcadastro date\n"
				+ " )";
		System.out.println(str);
		return str;
	}

}
