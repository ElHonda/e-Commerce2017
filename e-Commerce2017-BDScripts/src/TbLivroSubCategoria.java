
public class TbLivroSubCategoria implements IScript{

	@Override
	public String getScript() {
		String str = "CREATE TABLE tb_livro_subcategoria\n"
				+ "(\n"
				+ "id serial not null primary key,\n"
				+ "livro_id integer references tb_livro on update cascade on delete cascade,\n"
				+ "subcategoria_id integer references tb_subcategoria on update cascade on delete restrict,\n"
				+ "dtcadastro date\n"
				+ ")";
		System.out.println(str);
		return str;
	}

}
