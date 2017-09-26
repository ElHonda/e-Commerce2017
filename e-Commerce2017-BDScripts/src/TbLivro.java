
public class TbLivro implements IScript{

	@Override
	public String getScript() {
		String str = "CREATE TABLE tb_livro\n"
				+ "(\n"
				+ "id serial not null primary key,\n"
				+ "ano integer,\n"
				+ "titulo varchar(100),\n"
				+ "edicao varchar(10),\n"
				+ "isbn varchar(20),\n"
				+ "sinopse text,\n"
				+ "numeropaginas integer,\n"
				+ "autor_id integer,\n"
				+ "editora_id integer,\n"
				+ "dtcadastro date\n"
				+ ")";
		System.out.println(str);
		return str;
	}

}
