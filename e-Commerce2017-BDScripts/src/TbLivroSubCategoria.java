
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
				+ "INSERT INTO tb_livro_subcategoria ( livro_id, subcategoria_id, dtcadastro ) VALUES ( 2, 2, now());\r\n"
				+ "INSERT INTO tb_livro_subcategoria ( livro_id, subcategoria_id, dtcadastro ) VALUES ( 1, 1, now());\r\n"
				+ "INSERT INTO tb_livro_subcategoria ( livro_id, subcategoria_id, dtcadastro ) VALUES ( 4, 1, now());\r\n"
				+ "INSERT INTO tb_livro_subcategoria ( livro_id, subcategoria_id, dtcadastro ) VALUES ( 3, 1, now());\r\n"
				+ "INSERT INTO tb_livro_subcategoria ( livro_id, subcategoria_id, dtcadastro ) VALUES ( 5, 4, now());\r\n";
		System.out.println(str);
		return str;
	}

}
