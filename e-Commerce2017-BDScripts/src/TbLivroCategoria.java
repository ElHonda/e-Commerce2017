
public class TbLivroCategoria implements IScript{

	@Override
	public String getScript() {
		String str = "CREATE TABLE tb_livro_categoria\n"
				+ "(\n"
				+ "id serial not null primary key,\n"
				+ "livro_id integer references tb_livro on update cascade on delete cascade,\n"
				+ "categoria_id integer references tb_categoria on update cascade on delete restrict,\n"
				+ "dtcadastro date"
				+ ");"
				+ "INSERT INTO tb_livro_categoria VALUES (11, 2, 1, NULL);\r\n"
				+ "INSERT INTO tb_livro_categoria VALUES (8, 1, 1, NULL);\r\n"
				+ "INSERT INTO tb_livro_categoria VALUES (16, 4, 3, NULL);\r\n"
				+ "INSERT INTO tb_livro_categoria VALUES (12, 3, 2, NULL);\r\n"
				+ "INSERT INTO tb_livro_categoria VALUES (17, 5, 3, NULL);";
		System.out.println(str);
		return str;
	}

}
