
public class TbCategoria implements IScript{

	@Override
	public String getScript() {
		return "CREATE TABLE public.tb_categoria\n"
				+ "(\n"
				+ "id serial not null primary key,\n"
				+ "descricao character varying(30),\n"
				+ "dtcadastro date\n"
				+ ")";
	}

}
