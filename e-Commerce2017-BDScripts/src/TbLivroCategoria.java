
public class TbLivroCategoria implements IScript{

	@Override
	public String getScript() {
		String str = "CREATE TABLE tb_livro_categoria\n"
				+ "(\n"
				+ "id serial not null primary key,\n"
				+ "livro_id integer references tb_livro on update cascade on delete cascade,\n"
				+ "categoria_id integer references tb_categoria on update cascade on delete restrict,\n"
				+ "dtcadastro date"
				+ ")";
		System.out.println(str);
		return str;
	}

}
