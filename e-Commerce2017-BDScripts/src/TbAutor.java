
public class TbAutor implements IScript {

	public String getScript() {
		String str = "CREATE TABLE public.tb_autor\n"
				+ "(\n"
				+ "id serial not null primary key,\n"
				+ "dtcadastro date,\n"
				+ "nome character varying(100),\n"
				+ "sobrenome character varying(100)\n"
				+ ")";
		return str;
	}
}