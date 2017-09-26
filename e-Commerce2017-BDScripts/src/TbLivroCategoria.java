
public class TbLivroCategoria implements IScript{

	@Override
	public String getScript() {
		String str = "CREATE TABLE tb_livro_categoria\n"
				+ "(\n"
				+ "id serial not null primary key,\n"
				+ "livro_id integer,\n"
				+ "categoria_id integer,\n"
				+ "dtcadastro date\n"
				+ ")";
		System.out.println(str);
		return str;
	}

}
