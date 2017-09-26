
public class TbLivroSubCategoria implements IScript{

	@Override
	public String getScript() {
		String str = "CREATE TABLE tb_livro_subcategoria\n"
				+ "(\n"
				+ "id serial not null primary key,\n"
				+ "livro_id integer,\n"
				+ "subcategoria_id integer,\n"
				+ "dtcadastro date\n"
				+ ")";
		System.out.println(str);
		return str;
	}

}
