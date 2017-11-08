
public class TbEstado implements IScript{

	@Override
	public String getScript() {
		return "CREATE TABLE tb_estado (\r\n" + 
				"    id integer NOT NULL PRIMARY KEY,\r\n" + 
				"    nome character varying(40) NOT NULL,\r\n" + 
				"    dtcadastro date NOT NULL,\r\n" + 
				"    pais_id integer NOT NULL REFERENCES tb_pais ON UPDATE CASCADE ON DELETE RESTRICT,\r\n" + 
				"    ativo boolean NOT NULL DEFAULT true" +
				");\r\n" + 
				"\r\n" + 
				"INSERT INTO tb_estado (id, nome, dtcadastro, pais_id) VALUES (31, 'Minas Gerais', '2017-09-10', 76);\r\n" + 
				"INSERT INTO tb_estado (id, nome, dtcadastro, pais_id) VALUES (26, 'Pernambuco', '2017-09-10', 76);\r\n" + 
				"INSERT INTO tb_estado (id, nome, dtcadastro, pais_id) VALUES (12, 'Acre', '2017-09-10', 76);\r\n" + 
				"INSERT INTO tb_estado (id, nome, dtcadastro, pais_id) VALUES (27, 'Alagoas', '2017-09-10', 76);\r\n" + 
				"INSERT INTO tb_estado (id, nome, dtcadastro, pais_id) VALUES (11, 'Rond�nia', '2017-09-10', 76);\r\n" + 
				"INSERT INTO tb_estado (id, nome, dtcadastro, pais_id) VALUES (25, 'Para�ba', '2017-09-10', 76);\r\n" + 
				"INSERT INTO tb_estado (id, nome, dtcadastro, pais_id) VALUES (42, 'Santa Catarina', '2017-09-10', 76);\r\n" + 
				"INSERT INTO tb_estado (id, nome, dtcadastro, pais_id) VALUES (13, 'Amazonas', '2017-09-10', 76);\r\n" + 
				"INSERT INTO tb_estado (id, nome, dtcadastro, pais_id) VALUES (17, 'Tocantins', '2017-09-10', 76);\r\n" + 
				"INSERT INTO tb_estado (id, nome, dtcadastro, pais_id) VALUES (52, 'Goi�s', '2017-09-10', 76);\r\n" + 
				"INSERT INTO tb_estado (id, nome, dtcadastro, pais_id) VALUES (43, 'Rio Grande do Sul', '2017-09-10', 76);\r\n" + 
				"INSERT INTO tb_estado (id, nome, dtcadastro, pais_id) VALUES (32, 'Espirito Santo', '2017-09-10', 76);\r\n" + 
				"INSERT INTO tb_estado (id, nome, dtcadastro, pais_id) VALUES (24, 'Rio Grande do Norte', '2017-09-10', 76);\r\n" + 
				"INSERT INTO tb_estado (id, nome, dtcadastro, pais_id) VALUES (21, 'Maranh�o', '2017-09-10', 76);\r\n" + 
				"INSERT INTO tb_estado (id, nome, dtcadastro, pais_id) VALUES (23, 'Cear�', '2017-09-10', 76);\r\n" + 
				"INSERT INTO tb_estado (id, nome, dtcadastro, pais_id) VALUES (41, 'Paran�', '2017-09-10', 76);\r\n" + 
				"INSERT INTO tb_estado (id, nome, dtcadastro, pais_id) VALUES (35, 'S�o Paulo', '2017-09-10', 76);\r\n" + 
				"INSERT INTO tb_estado (id, nome, dtcadastro, pais_id) VALUES (28, 'Sergipe', '2017-09-10', 76);\r\n" + 
				"INSERT INTO tb_estado (id, nome, dtcadastro, pais_id) VALUES (50, 'Mato Grosso do Sul', '2017-09-10', 76);\r\n" + 
				"INSERT INTO tb_estado (id, nome, dtcadastro, pais_id) VALUES (51, 'Mato Grosso', '2017-09-10', 76);\r\n" + 
				"INSERT INTO tb_estado (id, nome, dtcadastro, pais_id) VALUES (14, 'Roraima', '2017-09-10', 76);\r\n" + 
				"INSERT INTO tb_estado (id, nome, dtcadastro, pais_id) VALUES (15, 'Par�', '2017-09-10', 76);\r\n" + 
				"INSERT INTO tb_estado (id, nome, dtcadastro, pais_id) VALUES (33, 'Rio de Janeiro', '2017-09-10', 76);\r\n" + 
				"INSERT INTO tb_estado (id, nome, dtcadastro, pais_id) VALUES (53, 'Distrito Federal', '2017-09-10', 76);\r\n" + 
				"INSERT INTO tb_estado (id, nome, dtcadastro, pais_id) VALUES (16, 'Amap�', '2017-09-10', 76);\r\n" + 
				"INSERT INTO tb_estado (id, nome, dtcadastro, pais_id) VALUES (22, 'Piau�', '2017-09-10', 76);\r\n" + 
				"INSERT INTO tb_estado (id, nome, dtcadastro, pais_id) VALUES (29, 'Bahia', '2017-09-10', 76);";
	}

}
