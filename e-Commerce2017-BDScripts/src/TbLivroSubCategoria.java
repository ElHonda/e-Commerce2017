
public class TbLivroSubCategoria implements IScript{

	@Override
	public String getScript() {
		String str = "CREATE TABLE tb_livro_subcategoria\n"
				+ "(\n"
				+ "id serial not null primary key,\n"
				+ "livro_id integer references tb_livro on update cascade on delete cascade,\n"
				+ "subcategoria_id integer references tb_subcategoria on update cascade on delete restrict,\n"
				+ "dtcadastro date\n"
				+ ");"
				+ "INSERT INTO tb_livro_subcategoria VALUES (5, 2, 2, NULL);\r\n"
				+ "INSERT INTO tb_livro_subcategoria VALUES (1, 1, 1, NULL);\r\n"
				+ "INSERT INTO tb_livro_subcategoria VALUES (11, 4, 1, NULL);\r\n"
				+ "INSERT INTO tb_livro_subcategoria VALUES (6, 3, 1, NULL);\r\n"
				+ "INSERT INTO tb_livro_subcategoria VALUES (12, 5, 4, NULL);\r\n";
		System.out.println(str);
		return str;
	}

}
