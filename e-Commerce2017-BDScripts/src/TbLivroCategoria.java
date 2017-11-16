
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
				+ "INSERT INTO tb_livro_categoria ( livro_id, categoria_id, dtcadastro ) VALUES ( 2, 1, now() );\r\n"
				+ "INSERT INTO tb_livro_categoria ( livro_id, categoria_id, dtcadastro ) VALUES ( 1, 1, now() );\r\n"
				+ "INSERT INTO tb_livro_categoria ( livro_id, categoria_id, dtcadastro ) VALUES ( 4, 3, now() );\r\n"
				+ "INSERT INTO tb_livro_categoria ( livro_id, categoria_id, dtcadastro ) VALUES ( 3, 2, now() );\r\n"
				+ "INSERT INTO tb_livro_categoria ( livro_id, categoria_id, dtcadastro ) VALUES ( 5, 3, now() );";
		System.out.println(str);
		return str;
	}

}
