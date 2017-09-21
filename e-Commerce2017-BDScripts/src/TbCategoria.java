
public class TbCategoria implements IScript{

	@Override
	public String getScript() {
		String str = "CREATE TABLE public.tb_categoria\n"
				+ "(\n"
				+ "id serial not null primary key,\n"
				+ "descricao character varying(30),\n"
				+ "dtcadastro date\n"
				+ ")";
		System.out.println(str);
		return str;
	}

}
