
public class TbGrupoPrecificacao implements IScript{

	public String getScript() {
		String str = "CREATE TABLE tb_grupopreco\n"
				+ "(\n"
				+ " id serial not null primary key,\n"
				+ " descricao varchar(40) not null,\n"
				+ " margemlucro numeric(7,2),\n"
				+ " dtcadastro date\n"
				+ ");"
				+ "INSERT INTO tb_grupopreco ( descricao , margemlucro , dtcadastro ) VALUES ( 'Nacional' ,'15.00' , now() );"
	            + "INSERT INTO tb_grupopreco ( descricao , margemlucro , dtcadastro ) VALUES ( 'Nacional' ,'30.00' , now() );" ;
		System.out.println(str);
		return str;
	}

}
