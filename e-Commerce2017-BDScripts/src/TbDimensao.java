
public class TbDimensao implements IScript{

	@Override
	public String getScript() {
		// TODO Auto-generated method stub
		String str = "CREATE TABLE tb_dimensao\n"
				+ "(\n"
				+ " id serial not null primary key,\n"
				+ " altura numeric(12,4),\n"
				+ " largura numeric(12,4),\n"
				+ " peso numeric(12,4),\n"
				+ " profundidade numeric(12,4),\n"
				+ " dtcadastro date\n"
				+ ")";

		System.out.println(str);
		return str;
	}

}
