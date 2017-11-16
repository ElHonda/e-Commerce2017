
public class TbDimensao implements IScript{

	@Override
	public String getScript() {
		String str = "CREATE TABLE tb_dimensao\n"
				+ "(\n"
				+ " id serial not null primary key,\n"
				+ " altura numeric(12,4),\n"
				+ " largura numeric(12,4),\n"
				+ " peso numeric(12,4),\n"
				+ " profundidade numeric(12,4),\n"
				+ " dimensionavel_id integer,\n"
				+ " dimensionavel_class varchar(50),\n"
				+ " dtcadastro date\n"
				+ ");"
				+ "INSERT INTO tb_dimensao ( altura, largura, peso, profundidade, dimensionavel_id , dimensionavel_class , dtcadastro ) VALUES (  20.0000,  12.0000,   0.5000,   3.5000, 2, 'eCommerce.dominio.Livro', now() );\r\n"
				+ "INSERT INTO tb_dimensao ( altura, largura, peso, profundidade, dimensionavel_id , dimensionavel_class , dtcadastro ) VALUES (  12.0000,   5.0000,   1.5000,   0.7500, 1, 'eCommerce.dominio.Livro', now() );\r\n"
				+ "INSERT INTO tb_dimensao ( altura, largura, peso, profundidade, dimensionavel_id , dimensionavel_class , dtcadastro ) VALUES (  12.0000,  16.0000,   1.1000,   3.5000, 4, 'eCommerce.dominio.Livro', now() );\r\n"
				+ "INSERT INTO tb_dimensao ( altura, largura, peso, profundidade, dimensionavel_id , dimensionavel_class , dtcadastro ) VALUES ( 321.0000, 321.0000, 321.0000, 321.0000, 3, 'eCommerce.dominio.Livro', now() );\r\n"
				+ "INSERT INTO tb_dimensao ( altura, largura, peso, profundidade, dimensionavel_id , dimensionavel_class , dtcadastro ) VALUES (  20.0000,  10.0000,   1.5000,   3.0000, 5, 'eCommerce.dominio.Livro', now() );";

		System.out.println(str);
		return str;
	}

}
