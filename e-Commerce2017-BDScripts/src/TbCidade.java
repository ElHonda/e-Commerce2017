
public class TbCidade implements IScript{

	@Override
	public String getScript() {
		// TODO Auto-generated method stub
		return "DROP TABLE IF EXISTS tb_cidade;" + 
				"CREATE TABLE tb_cidade (\r\n" + 
				"    id integer NOT NULL PRIMARY KEY,\r\n" + 
				"    nome character varying(40) NOT NULL,\r\n" + 
				"    dtcadastro date NOT NULL,\r\n" + 
				"    estado_id integer NOT NULL REFERENCES tb_estado(id) ON UPDATE CASCADE ON DELETE RESTRICT,\r\n" + 
				"    ativo BOOLEAN NOT NULL DEFAULT true\r\n" + 
				");\r\n" + 
				"\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (120010, 'Brasiléia', '2017-09-10', 12, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (120017, 'Capixaba', '2017-09-10', 12, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (120025, 'Epitaciolândia', '2017-09-10', 12, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (120030, 'Feijó', '2017-09-10', 12, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (120033, 'Mâncio Lima', '2017-09-10', 12, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (120035, 'Marechal Thaumaturgo', '2017-09-10', 12, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (120080, 'Porto Acre', '2017-09-10', 12, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (120039, 'Porto Walter', '2017-09-10', 12, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (120042, 'Rodrigues Alves', '2017-09-10', 12, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (120050, 'Sena Madureira', '2017-09-10', 12, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (120060, 'Tarauacá', '2017-09-10', 12, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (120070, 'Xapuri', '2017-09-10', 12, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270020, 'Anadia', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270040, 'Atalaia', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270060, 'Barra De São Miguel', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270070, 'Batalha', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270090, 'Belo Monte', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270110, 'Branquinha', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270120, 'Cacimbinhas', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270135, 'Campestre', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270150, 'Campo Grande', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270170, 'Capela', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270180, 'Carneiros', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270200, 'Coité Do Nóia', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270220, 'Coqueiro Seco', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270235, 'Craíbas', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270250, 'Dois Riachos', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270255, 'Estrela De Alagoas', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270270, 'Feliz Deserto', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270290, 'Girau Do Ponciano', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270300, 'Ibateguara', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270320, 'Igreja Nova', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270340, 'Jacaré Dos Homens', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270360, 'Japaratinga', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270375, 'Jequiá Da Praia', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270380, 'Joaquim Gomes', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270400, 'Junqueiro', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270420, 'Limoeiro De Anadia', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270440, 'Major Isidoro', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270490, 'Mar Vermelho', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270460, 'Maravilha', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270480, 'Maribondo', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270510, 'Matriz De Camaragibe', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270520, 'Messias', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270540, 'Monteirópolis', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270560, 'Novo Lino', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270580, 'Olho D`Água Do Casado', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270590, 'Olho D`Água Grande', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270610, 'Ouro Branco', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270630, 'Palmeira Dos Índios', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270642, 'Pariconha', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270644, 'Paripueira', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270660, 'Paulo Jacinto', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270680, 'Piaçabuçu', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270690, 'Pilar', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270710, 'Piranhas', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270730, 'Porto Calvo', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270750, 'Porto Real Do Colégio', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270760, 'Quebrangulo', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270780, 'Roteiro', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270800, 'Santana Do Ipanema', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270810, 'Santana Do Mundaú', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270830, 'São José Da Laje', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270850, 'São Luís Do Quitunde', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270860, 'São Miguel Dos Campos', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270880, 'São Sebastião', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270890, 'Satuba', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270900, 'Tanque D`Arca', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270915, 'Teotônio Vilela', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270920, 'Traipu', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270940, 'Viçosa', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130006, 'Amaturá', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251230, 'Princesa Isabel', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130014, 'Apuí', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130030, 'Autazes', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130040, 'Barcelos', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130060, 'Benjamin Constant', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130068, 'Boa Vista Do Ramos', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130080, 'Borba', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130090, 'Canutama', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130100, 'Carauari', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130115, 'Careiro Da Várzea', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130130, 'Codajás', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130150, 'Envira', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130165, 'Guajará', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130170, 'Humaitá', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130185, 'Iranduba', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130195, 'Itamarati', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130210, 'Japurá', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130230, 'Jutaí', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130240, 'Lábrea', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130255, 'Manaquiri', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130270, 'Manicoré', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130290, 'Maués', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130300, 'Nhamundá', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130320, 'Novo Airão', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130340, 'Parintins', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130350, 'Pauini', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130356, 'Rio Preto Da Eva', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130370, 'Santo Antônio Do Içá', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130390, 'São Paulo De Olivença', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130395, 'São Sebastião Do Uatumã', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130400, 'Silves', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130410, 'Tapauá', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130423, 'Tonantins', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130430, 'Urucará', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (160010, 'Amapá', '2017-09-10', 16, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (160020, 'Calçoene', '2017-09-10', 16, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (160023, 'Ferreira Gomes', '2017-09-10', 16, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (160027, 'Laranjal Do Jari', '2017-09-10', 16, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (160040, 'Mazagão', '2017-09-10', 16, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (160015, 'Pedra Branca Do Amaparí', '2017-09-10', 16, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (160055, 'Pracuúba', '2017-09-10', 16, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (160060, 'Santana', '2017-09-10', 16, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (160070, 'Tartarugalzinho', '2017-09-10', 16, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290010, 'Abaíra', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290020, 'Abaré', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290035, 'Adustina', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290060, 'Aiquara', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290080, 'Alcobaça', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290090, 'Almadina', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290110, 'Amélia Rodrigues', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290120, 'Anagé', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290135, 'Andorinha', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290140, 'Angical', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290160, 'Antas', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290180, 'Antônio Gonçalves', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290195, 'Apuarema', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290205, 'Araças', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290210, 'Araci', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290225, 'Arataca', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290240, 'Aurelino Leal', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290260, 'Baixa Grande', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290265, 'Banzaê', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290280, 'Barra Da Estiva', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290300, 'Barra Do Mendes', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290310, 'Barra Do Rocha', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290323, 'Barro Alto', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290330, 'Barro Preto', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290350, 'Belo Campo', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290360, 'Biritinga', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290380, 'Boa Vista Do Tupim', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290395, 'Bom Jesus Da Serra', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290405, 'Bonito', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290410, 'Boquira', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290430, 'Brejões', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251260, 'Quixabá', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290460, 'Brumado', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290475, 'Buritirama', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290485, 'Cabaceiras Do Paraguaçu', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290500, 'Caculé', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290510, 'Caém', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290520, 'Caetité', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290540, 'Cairu', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290560, 'Camacan', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290570, 'Camaçari', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290600, 'Campo Formoso', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290610, 'Canápolis', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290630, 'Canavieiras', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290640, 'Candeal', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290660, 'Candiba', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290680, 'Cansanção', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290685, 'Capela Do Alto Alegre', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290689, 'Caraíbas', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290690, 'Caravelas', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290710, 'Carinhanha', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290730, 'Castro Alves', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290740, 'Catolândia', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290755, 'Caturama', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290770, 'Chorrochó', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290790, 'Cipó', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290800, 'Coaraci', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290820, 'Conceição Da Feira', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290840, 'Conceição Do Coité', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290860, 'Conde', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290870, 'Condeúba', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290890, 'Coração De Maria', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290900, 'Cordeiros', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290920, 'Coronel João Sá', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290940, 'Cotegipe', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290960, 'Crisópolis', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290970, 'Cristópolis', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290990, 'Curaçá', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291005, 'Dias D`Ávila', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291010, 'Dom Basílio', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291030, 'Elísio Medrado', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291050, 'Entre Rios', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291060, 'Esplanada', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291070, 'Euclides Da Cunha', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291075, 'Fátima', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291080, 'Feira De Santana', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291085, 'Filadélfia', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291100, 'Floresta Azul', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291120, 'Gandu', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291125, 'Gavião', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291140, 'Glória', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291160, 'Governador Mangabeira', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291165, 'Guajeru', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291180, 'Guaratinga', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291190, 'Iaçu', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291210, 'Ibicaraí', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291230, 'Ibicuí', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291240, 'Ibipeba', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291260, 'Ibiquera', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291280, 'Ibirapuã', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291300, 'Ibitiara', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291310, 'Ibititá', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291330, 'Ichu', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291345, 'Igrapiúna', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291360, 'Ilhéus', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291380, 'Ipecaetá', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291390, 'Ipiaú', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291410, 'Ipupiara', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291430, 'Iramaia', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291450, 'Irará', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291460, 'Irecê', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291470, 'Itaberaba', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291490, 'Itacaré', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291510, 'Itagi', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291530, 'Itagimirim', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291550, 'Itajuípe', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291570, 'Itamari', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291590, 'Itanagra', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291600, 'Itanhém', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291620, 'Itapé', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291640, 'Itapetinga', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291660, 'Itapitanga', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291680, 'Itarantim', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291685, 'Itatim', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291700, 'Itiúba', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291720, 'Ituaçu', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291733, 'Iuiú', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291740, 'Jacaraci', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291750, 'Jacobina', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291770, 'Jaguarari', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291790, 'Jandaíra', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291810, 'Jeremoabo', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291820, 'Jiquiriçá', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291840, 'Juazeiro', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291845, 'Jucuruçu', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291855, 'Jussari', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291860, 'Jussiape', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291875, 'Lagoa Real', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291890, 'Lajedão', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291905, 'Lajedo Do Tabocal', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291910, 'Lamarão', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291920, 'Lauro De Freitas', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291940, 'Licínio De Almeida', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291955, 'Luís Eduardo Magalhães', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291960, 'Macajuba', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291980, 'Macaúbas', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291992, 'Madre De Deus', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292000, 'Maiquinique', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292020, 'Malhada', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292040, 'Manoel Vitorino', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292045, 'Mansidão', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292060, 'Maragogipe', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292080, 'Marcionílio Souza', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292100, 'Mata De São João', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292105, 'Matina', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292120, 'Miguel Calmon', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292140, 'Mirangaba', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292145, 'Mirante', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292160, 'Morpará', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292180, 'Mortugaba', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292200, 'Mucuri', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292210, 'Mundo Novo', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292220, 'Muniz Ferreira', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292230, 'Muritiba', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292240, 'Mutuípe', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292260, 'Nilo Peçanha', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292270, 'Nova Canaã', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292275, 'Nova Ibiá', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292285, 'Nova Redenção', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292290, 'Nova Soure', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292303, 'Novo Horizonte', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292310, 'Olindina', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292330, 'Ouriçangas', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292335, 'Ourolândia', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292350, 'Palmeiras', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292360, 'Paramirim', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292380, 'Paripiranga', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292400, 'Paulo Afonso', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292410, 'Pedrão', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292430, 'Piatã', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292440, 'Pilão Arcado', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292460, 'Pindobaçu', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292467, 'Piraí Do Norte', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292470, 'Piripá', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292490, 'Planaltino', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292510, 'Poções', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292525, 'Ponto Novo', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292540, 'Potiraguá', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292550, 'Prado', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292575, 'Presidente Tancredo Neves', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292580, 'Queimadas', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292593, 'Quixabeira', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292600, 'Remanso', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292620, 'Riachão Das Neves', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292640, 'Riacho De Santana', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292650, 'Ribeira Do Amparo', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292665, 'Ribeirão Do Largo', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292670, 'Rio De Contas', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292690, 'Rio Do Pires', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292710, 'Rodelas', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292720, 'Ruy Barbosa', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292740, 'Salvador', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292760, 'Santa Brígida', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292780, 'Santa Cruz Da Vitória', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292790, 'Santa Inês', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292810, 'Santa Maria Da Vitória', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292850, 'Santa Teresinha', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292800, 'Santaluz', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292830, 'Santanópolis', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292870, 'Santo Antônio De Jesus', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292890, 'São Desidério', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292910, 'São Felipe', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292900, 'São Félix', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292920, 'São Francisco Do Conde', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292930, 'São Gonçalo Dos Campos', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292937, 'São José Do Jacuípe', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292940, 'São Miguel Das Matas', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292960, 'Sapeaçu', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292970, 'Sátiro Dias', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292980, 'Saúde', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293000, 'Sebastião Laranjeiras', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293020, 'Sento Sé', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293015, 'Serra Do Ramalho', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293040, 'Serra Preta', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293050, 'Serrinha', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293070, 'Simões Filho', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293076, 'Sítio Do Quinto', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293080, 'Souto Soares', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293100, 'Tanhaçu', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293105, 'Tanque Novo', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293120, 'Taperoá', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293135, 'Teixeira De Freitas', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293150, 'Teofilândia', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293160, 'Teolândia', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293180, 'Tremedal', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293200, 'Uauá', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293210, 'Ubaíra', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293230, 'Ubatã', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293245, 'Umburanas', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293260, 'Urandi', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293280, 'Utinga', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293300, 'Valente', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293305, 'Várzea Da Roça', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293315, 'Várzea Nova', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293320, 'Vera Cruz', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293330, 'Vitória Da Conquista', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293340, 'Wagner', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293360, 'Xique Xique', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230010, 'Abaiara', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230015, 'Acarape', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230030, 'Acopiara', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230050, 'Alcântaras', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230070, 'Alto Santo', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230080, 'Antonina Do Norte', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230090, 'Apuiarés', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230110, 'Aracati', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230125, 'Ararendá', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230140, 'Aratuba', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230150, 'Arneiroz', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230170, 'Aurora', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230185, 'Banabuiú', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251274, 'Riachão', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230195, 'Barreira', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230205, 'Barroquinha', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230220, 'Beberibe', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230240, 'Boa Viagem', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230250, 'Brejo Santo', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230270, 'Campos Sales', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230290, 'Capistrano', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230310, 'Cariré', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230330, 'Cariús', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230340, 'Carnaubal', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230360, 'Catarina', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230370, 'Caucaia', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230390, 'Chaval', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230393, 'Choró', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230400, 'Coreaú', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230420, 'Crato', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230425, 'Cruz', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230427, 'Ererê', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230428, 'Eusébio', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230435, 'Forquilha', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230445, 'Fortim', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230450, 'Frecheirinha', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230465, 'Graça', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230480, 'Granjeiro', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230495, 'Guaiúba', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230500, 'Guaraciaba Do Norte', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230520, 'Hidrolândia', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230526, 'Ibaretama', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230533, 'Ibicuitinga', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230535, 'Icapuí', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230550, 'Iguatu', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230565, 'Ipaporanga', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230580, 'Ipu', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230590, 'Ipueiras', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230610, 'Irauçuba', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230625, 'Itaitinga', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230640, 'Itapipoca', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230650, 'Itapiúna', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230660, 'Itatira', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230680, 'Jaguaribara', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230700, 'Jaguaruana', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230710, 'Jardim', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230730, 'Juazeiro Do Norte', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230740, 'Jucás', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230760, 'Limoeiro Do Norte', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230763, 'Madalena', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230770, 'Maranguape', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230790, 'Martinópole', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230810, 'Mauriti', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230820, 'Meruoca', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230835, 'Milhã', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230840, 'Missão Velha', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230860, 'Monsenhor Tabosa', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230870, 'Morada Nova', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230890, 'Morrinhos', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230910, 'Mulungu', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230930, 'Nova Russas', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230945, 'Ocara', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230950, 'Orós', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230970, 'Pacatuba', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230990, 'Pacujá', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231000, 'Palhano', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231020, 'Paracuru', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231030, 'Parambu', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231050, 'Pedra Branca', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231070, 'Pentecoste', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231085, 'Pindoretama', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231095, 'Pires Ferreira', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231100, 'Poranga', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231120, 'Potengi', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231126, 'Quiterianópolis', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231135, 'Quixelô', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231150, 'Quixeré', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231160, 'Redenção', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251278, 'Riacho De Santo Antônio', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231195, 'Salitre', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231200, 'Santana Do Acaraú', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231230, 'São Benedito', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231240, 'São Gonçalo Do Amarante', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231260, 'São Luís Do Curu', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231270, 'Senador Pompeu', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231290, 'Sobral', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231310, 'Tabuleiro Do Norte', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231325, 'Tarrafas', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231330, 'Tauá', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231340, 'Tianguá', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231355, 'Tururu', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231370, 'Umari', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231375, 'Umirim', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231390, 'Uruoca', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231400, 'Várzea Alegre', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (530010, 'Brasília', '2017-09-10', 53, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320016, 'Água Doce Do Norte', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320013, 'Águia Branca', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320030, 'Alfredo Chaves', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320040, 'Anchieta', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320050, 'Apiacá', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320080, 'Baixo Guandu', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320090, 'Barra De São Francisco', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320110, 'Bom Jesus Do Norte', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320115, 'Brejetuba', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320130, 'Cariacica', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320150, 'Colatina', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320170, 'Conceição Do Castelo', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320180, 'Divino De São Lourenço', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320200, 'Dores Do Rio Preto', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320210, 'Ecoporanga', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320230, 'Guaçuí', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320240, 'Guarapari', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320250, 'Ibiraçu', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320255, 'Ibitirama', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320265, 'Irupi', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320280, 'Itapemirim', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320300, 'Iúna', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320305, 'Jaguaré', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320313, 'João Neiva', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320320, 'Linhares', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320332, 'Marataízes', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320334, 'Marechal Floriano', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320340, 'Mimoso Do Sul', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320360, 'Mucurici', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320380, 'Muqui', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320390, 'Nova Venécia', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320405, 'Pedro Canário', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320420, 'Piúma', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320425, 'Ponto Belo', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320435, 'Rio Bananal', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320450, 'Santa Leopoldina', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320460, 'Santa Teresa', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320465, 'São Domingos Do Norte', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320480, 'São José Do Calçado', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320490, 'São Mateus', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320500, 'Serra', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320501, 'Sooretama', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320506, 'Venda Nova Do Imigrante', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320515, 'Vila Pavão', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320520, 'Vila Velha', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320530, 'Vitória', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520010, 'Abadiânia', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520015, 'Adelândia', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520020, 'Água Limpa', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520025, 'Águas Lindas De Goiás', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520050, 'Aloândia', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520060, 'Alto Paraíso De Goiás', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520080, 'Alvorada Do Norte', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520085, 'Americano Do Brasil', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520110, 'Anápolis', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251300, 'Salgadinho', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520145, 'Aparecida Do Rio Doce', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520150, 'Aporé', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520170, 'Aragarças', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520215, 'Araguapaz', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520250, 'Aruanã', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520260, 'Aurilândia', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520310, 'Baliza', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520330, 'Bela Vista De Goiás', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520350, 'Bom Jesus De Goiás', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520355, 'Bonfinópolis', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520360, 'Brazabrantes', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520390, 'Buriti Alegre', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520396, 'Buritinópolis', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520400, 'Cabeceiras', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520420, 'Cachoeira De Goiás', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520430, 'Caçu', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520440, 'Caiapônia', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520455, 'Caldazinha', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520465, 'Campinaçu', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520470, 'Campinorte', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520485, 'Campo Limpo De Goiás', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520495, 'Campos Verdes', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520505, 'Castelândia', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520510, 'Catalão', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520530, 'Cavalcante', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520540, 'Ceres', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520547, 'Chapadão Do Céu', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520551, 'Cocalzinho De Goiás', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520570, 'Córrego Do Ouro', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520580, 'Corumbá De Goiás', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520620, 'Cristalina', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520640, 'Crixás', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520660, 'Cumari', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520670, 'Damianópolis', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520690, 'Davinópolis', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520830, 'Divinópolis De Goiás', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520735, 'Edealina', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520740, 'Edéia', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520753, 'Faina', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520780, 'Firminópolis', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520800, 'Formosa', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520810, 'Formoso', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520840, 'Goianápolis', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520850, 'Goiandira', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520870, 'Goiânia', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520890, 'Goiás', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520915, 'Gouvelândia', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520920, 'Guapó', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520940, 'Guarani De Goiás', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520960, 'Heitoraí', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520980, 'Hidrolina', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520990, 'Iaciara', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520995, 'Indiara', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521010, 'Ipameri', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521020, 'Iporá', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521030, 'Israelândia', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521056, 'Itaguari', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521080, 'Itajá', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521100, 'Itapirapuã', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521120, 'Itapuranga', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521140, 'Itauçu', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521160, 'Ivolândia', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521180, 'Jaraguá', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521200, 'Jaupaci', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521205, 'Jesúpolis', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521220, 'Jussara', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521230, 'Leopoldo De Bulhões', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521260, 'Mairipotaba', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521280, 'Mara Rosa', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521290, 'Marzagão', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521300, 'Maurilândia', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521308, 'Minaçu', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521340, 'Moiporá', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260720, 'Ipojuca', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521370, 'Montes Claros De Goiás', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521377, 'Montividiu Do Norte', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521385, 'Morro Agudo De Goiás', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521390, 'Mossâmedes', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521405, 'Mundo Novo', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521440, 'Nazário', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521450, 'Nerópolis', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521470, 'Nova América', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521483, 'Nova Crixás', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521487, 'Nova Iguaçu De Goiás', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521490, 'Nova Roma', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521520, 'Novo Brasil', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521525, 'Novo Planalto', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521540, 'Ouro Verde De Goiás', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521560, 'Padre Bernardo', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521570, 'Palmeiras De Goiás', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521580, 'Palmelo', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521600, 'Panamá', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521640, 'Paraúna', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521645, 'Perolândia', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521690, 'Pilar De Goiás', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521720, 'Piranhas', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521740, 'Pires Do Rio', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521760, 'Planaltina', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521800, 'Porangatu', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521810, 'Portelândia', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521830, 'Posse', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521850, 'Quirinópolis', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521870, 'Rianápolis', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521880, 'Rio Verde', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521890, 'Rubiataba', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521910, 'Santa Bárbara De Goiás', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521925, 'Santa Fé De Goiás', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521935, 'Santa Isabel', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521940, 'Santa Rita Do Araguaia', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521950, 'Santa Rosa De Goiás', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521970, 'Santa Terezinha De Goiás', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521971, 'Santo Antônio Da Barra', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521975, 'Santo Antônio Do Descoberto', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521980, 'São Domingos', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (522000, 'São João D`Aliança', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (522010, 'São Luís De Montes Belos', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (522015, 'São Luíz Do Norte', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (522026, 'São Miguel Do Passa Quatro', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (522028, 'São Patrício', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (522045, 'Senador Canedo', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (522060, 'Silvânia', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (522068, 'Simolândia', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (522100, 'Taquaral De Goiás', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (522119, 'Terezópolis De Goiás', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (522140, 'Trindade', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (522145, 'Trombas', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (522155, 'Turvelândia', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (522160, 'Uruaçu', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (522180, 'Urutaí', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (522190, 'Varjão', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (522200, 'Vianópolis', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (522220, 'Vila Boa', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (522230, 'Vila Propício', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210010, 'Afonso Cunha', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210020, 'Alcântara', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210030, 'Aldeias Altas', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210043, 'Alto Alegre Do Maranhão', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210050, 'Alto Parnaíba', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210055, 'Amapá Do Maranhão', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210070, 'Anajatuba', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210080, 'Anapurus', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210087, 'Araguanã', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210095, 'Arame', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210110, 'Axixá', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210120, 'Bacabal', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210140, 'Balsas', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210160, 'Barra Do Corda', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210177, 'Bela Vista Do Maranhão', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210173, 'Belágua', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210190, 'Bequimão', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210197, 'Boa Vista Do Gurupi', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210200, 'Bom Jardim', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210207, 'Bom Lugar', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210215, 'Brejo De Areia', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210220, 'Buriti', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210232, 'Buriticupu', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210237, 'Cachoeira Grande', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210250, 'Cajari', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210260, 'Cândido Mendes', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210270, 'Cantanhede', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210280, 'Carolina', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210290, 'Carutapera', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210310, 'Cedral', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210315, 'Centro Do Guilherme', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210320, 'Chapadinha', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210325, 'Cidelândia', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210340, 'Coelho Neto', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210355, 'Conceição Do Lago Açu', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210360, 'Coroatá', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210375, 'Davinópolis', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210390, 'Duque Bacelar', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210405, 'Estreito', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210408, 'Fernando Falcão', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210409, 'Formosa Da Serra Negra', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210420, 'Fortuna', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210430, 'Godofredo Viana', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210450, 'Governador Archer', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210460, 'Governador Eugênio Barros', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210465, 'Governador Newton Bello', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210467, 'Governador Nunes Freire', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210480, 'Grajaú', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210490, 'Guimarães', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210510, 'Icatu', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210520, 'Igarapé Grande', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210530, 'Imperatriz', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210540, 'Itapecuru Mirim', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210545, 'Jatobá', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210550, 'João Lisboa', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210560, 'Joselândia', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210570, 'Lago Da Pedra', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210594, 'Lago Dos Rodrigues', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210590, 'Lago Verde', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210596, 'Lagoa Grande Do Maranhão', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210600, 'Lima Campos', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210610, 'Loreto', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210630, 'Magalhães De Almeida', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210635, 'Marajá Do Sena', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210640, 'Mata Roma', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210650, 'Matinha', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210663, 'Matões Do Norte', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210670, 'Mirador', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210675, 'Miranda Do Norte', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210690, 'Monção', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210710, 'Morros', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210720, 'Nina Rodrigues', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210730, 'Nova Iorque', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210740, 'Olho D`Água Das Cunhãs', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210750, 'Paço Do Lumiar', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210760, 'Palmeirândia', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210780, 'Parnarama', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210790, 'Passagem Franca', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210805, 'Paulino Neves', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210820, 'Pedreiras', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210830, 'Penalva', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210840, 'Peri Mirim', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210850, 'Pindaré Mirim', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210870, 'Pio Xii', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210900, 'Porto Franco', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210905, 'Porto Rico Do Maranhão', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210920, 'Presidente Juscelino', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210927, 'Presidente Sarney', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210930, 'Presidente Vargas', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210945, 'Raposa', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210955, 'Ribamar Fiquene', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210960, 'Rosário', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210980, 'Santa Helena', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210990, 'Santa Inês', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211003, 'Santa Luzia Do Paruá', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211020, 'Santa Rita', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211023, 'Santana Do Maranhão', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211030, 'Santo Antônio Dos Lopes', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211050, 'São Bento', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211060, 'São Bernardo', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211070, 'São Domingos Do Maranhão', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211080, 'São Félix De Balsas', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211090, 'São Francisco Do Maranhão', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211102, 'São João Do Carú', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211107, 'São João Do Soter', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211110, 'São João Dos Patos', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211125, 'São José Dos Basílios', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211130, 'São Luís', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211150, 'São Mateus Do Maranhão', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211153, 'São Pedro Da Água Branca', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211160, 'São Raimundo Das Mangabeiras', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211167, 'São Roberto', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211170, 'São Vicente Ferrer', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211174, 'Senador Alexandre Costa', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211178, 'Serrano Do Maranhão', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211180, 'Sítio Novo', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211195, 'Sucupira Do Riachão', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211210, 'Timbiras', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211220, 'Timon', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211227, 'Tufilândia', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211240, 'Turiaçu', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211245, 'Turilândia', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211260, 'Urbano Santos', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211280, 'Viana', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211290, 'Vitória Do Mearim', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211300, 'Vitorino Freire', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310010, 'Abadia Dos Dourados', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310030, 'Abre Campo', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310050, 'Açucena', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310060, 'Água Boa', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310080, 'Aguanil', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310100, 'Águas Vermelhas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310120, 'Aiuruoca', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310130, 'Alagoa', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310150, 'Além Paraíba', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310163, 'Alfredo Vasconcelos', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310180, 'Alpercata', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310200, 'Alterosa', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310205, 'Alto Caparaó', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310210, 'Alto Rio Doce', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310230, 'Alvinópolis', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310250, 'Amparo Do Serra', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310260, 'Andradas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310285, 'Angelândia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310300, 'Antônio Dias', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310320, 'Araçaí', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310330, 'Aracitaba', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310350, 'Araguari', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310360, 'Arantina', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310375, 'Araporã', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310390, 'Araújos', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310410, 'Arceburgo', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310430, 'Areado', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310440, 'Argirita', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310450, 'Arinos', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251315, 'Santa Cecília', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310480, 'Augusto De Lima', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310490, 'Baependi', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310510, 'Bambuí', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310530, 'Bandeira Do Sul', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310550, 'Barão De Monte Alto', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310560, 'Barbacena', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310590, 'Barroso', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310610, 'Belmiro Braga', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310630, 'Belo Oriente', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310640, 'Belo Vale', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310665, 'Berizal', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310670, 'Betim', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310690, 'Bicas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310700, 'Biquinhas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310720, 'Bocaina De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310740, 'Bom Despacho', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310760, 'Bom Jesus Da Penha', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310770, 'Bom Jesus Do Amparo', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310790, 'Bom Repouso', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310810, 'Bonfim', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310825, 'Bonito De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310830, 'Borda Da Mata', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310850, 'Botumirim', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310855, 'Brasilândia De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310890, 'Brasópolis', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310880, 'Braúnas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310910, 'Bueno Brandão', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310925, 'Bugre', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310930, 'Buritis', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310945, 'Cabeceira Grande', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310960, 'Cachoeira Da Prata', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310270, 'Cachoeira De Pajeú', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310990, 'Caetanópolis', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311000, 'Caeté', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311020, 'Cajuri', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311040, 'Camacho', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311050, 'Camanducaia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311070, 'Cambuquira', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311090, 'Campanha', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311110, 'Campina Verde', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311120, 'Campo Belo', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311140, 'Campo Florido', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311150, 'Campos Altos', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311190, 'Cana Verde', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311180, 'CanÁpolis', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311200, 'Candeias', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311210, 'Caparaó', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311230, 'Capelinha', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311250, 'Capim Branco', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311265, 'Capitão Andrade', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311280, 'Capitólio', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311290, 'Caputira', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311310, 'Caranaíba', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311330, 'Carangola', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311350, 'Carbonita', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311360, 'Careaçu', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311380, 'Carmésia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311400, 'Carmo Da Mata', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311420, 'Carmo Do Cajuru', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311430, 'Carmo Do Paranaíba', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311450, 'Carmópolis De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311455, 'Carneirinho', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311470, 'Carvalhópolis', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311490, 'Casa Grande', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311510, 'CÁssia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311530, 'Cataguases', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311545, 'Catuji', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311547, 'Catuti', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311560, 'Cedro Do Abaeté', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311570, 'Central De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311590, 'ChÁcara', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311610, 'Chapada Do Norte', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260740, 'Itacuruba', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311630, 'Cipotânea', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311650, 'Claro Dos Poções', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311670, 'Coimbra', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311690, 'Comendador Gomes', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311710, 'Conceição Da Aparecida', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311730, 'Conceição Das Alagoas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311720, 'Conceição Das Pedras', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311750, 'Conceição Do Mato Dentro', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311760, 'Conceição Do ParÁ', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311780, 'Conceição Dos Ouros', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311787, 'Confins', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311790, 'Congonhal', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311810, 'Congonhas Do Norte', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311830, 'Conselheiro Lafaiete', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311850, 'Consolação', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311860, 'Contagem', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311880, 'Coração De Jesus', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311900, 'Cordislândia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311910, 'Corinto', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311930, 'Coromandel', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311950, 'Coronel Murta', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311970, 'Coronel Xavier Chaves', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311980, 'Córrego Danta', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311995, 'Córrego Fundo', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312010, 'Couto De Magalhães De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312015, 'Crisólita', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312030, 'CristÁlia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312050, 'Cristina', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312070, 'Cruzeiro Da Fortaleza', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312080, 'Cruzília', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312087, 'Curral De Dentro', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312100, 'Datas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312120, 'Delfinópolis', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312125, 'Delta', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312140, 'Desterro De Entre Rios', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312160, 'Diamantina', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312180, 'Dionísio', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312190, 'Divinésia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312210, 'Divino Das Laranjeiras', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312230, 'Divinópolis', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312235, 'Divisa Alegre', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312245, 'Divisópolis', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312247, 'Dom Bosco', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312260, 'Dom Joaquim', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312280, 'Dom Viçoso', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312300, 'Dores De Campos', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312310, 'Dores De Guanhães', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312330, 'Dores Do Turvo', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312340, 'Doresópolis', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312352, 'Durandé', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312370, 'Engenheiro Caldas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312385, 'Entre Folhas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312390, 'Entre Rios De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312410, 'Esmeraldas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312430, 'Espinosa', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312450, 'Estiva', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312460, 'Estrela Dalva', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312480, 'Estrela Do Sul', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312500, 'Ewbank Da Câmara', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312510, 'Extrema', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312530, 'Faria Lemos', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312560, 'Felisburgo', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312570, 'Felixlândia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312590, 'Ferros', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312600, 'Florestal', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312620, 'Formoso', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312630, 'Fortaleza De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312650, 'Francisco Badaró', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312670, 'Francisco SÁ', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312680, 'Frei Gaspar', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312690, 'Frei Inocêncio', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260765, 'Itambé', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312707, 'Fruta De Leite', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312710, 'Frutal', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312730, 'Galiléia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312735, 'Glaucilândia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312737, 'Goiabeira', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312740, 'Gonçalves', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312760, 'Gouveia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312780, 'Grão Mogol', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312790, 'Grupiara', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312810, 'Guapé', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312825, 'Guaraciama', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312840, 'Guarani', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312850, 'GuararÁ', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312870, 'Guaxupé', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312890, 'Guimarânia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312910, 'Gurinhatã', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312930, 'Iapu', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312940, 'Ibertioga', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312960, 'Ibiaí', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312970, 'Ibiraci', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312990, 'Ibitiúra De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313005, 'Icaraí De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313010, 'Igarapé', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313030, 'Iguatama', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313050, 'Ilicínea', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313060, 'Inconfidentes', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313065, 'Indaiabira', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313080, 'Ingaí', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313100, 'Inhaúma', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313115, 'Ipaba', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313120, 'Ipanema', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313140, 'Ipiaçu', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313160, 'Iraí De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313180, 'Itabirinha', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313190, 'Itabirito', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313210, 'Itacarambi', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313230, 'Itaipé', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313250, 'Itamarandiba', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313270, 'Itambacuri', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313290, 'Itamogi', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313300, 'Itamonte', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313320, 'Itanhomi', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313330, 'Itaobim', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313350, 'Itapecerica', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313370, 'Itatiaiuçu', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313380, 'Itaúna', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313390, 'Itaverava', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313410, 'Itueta', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313430, 'Itumirim', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313450, 'Itutinga', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313470, 'Jacinto', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313480, 'Jacuí', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313500, 'Jaguaraçu', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313507, 'Jampruca', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313510, 'Janaúba', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313530, 'Japaraíba', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313540, 'Jeceaba', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313550, 'Jequeri', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313560, 'Jequitaí', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313590, 'Jesuânia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313600, 'Joaíma', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313620, 'João Monlevade', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313640, 'Joaquim Felício', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313650, 'Jordânia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313655, 'José Raydan', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313665, 'Juatuba', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313670, 'Juiz De Fora', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313690, 'Juruaia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313700, 'Ladainha', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313720, 'Lagoa Da Prata', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313730, 'Lagoa Dos Patos', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313750, 'Lagoa Formosa', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313760, 'Lagoa Santa', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313770, 'Lajinha', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260780, 'Itaquitinga', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313800, 'Laranjal', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313820, 'Lavras', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313835, 'Leme Do Prado', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313850, 'Liberdade', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313860, 'Lima Duarte', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313865, 'Lontra', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313868, 'Luislândia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313880, 'Luz', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313890, 'Machacalis', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313910, 'Madre De Deus De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313925, 'Mamonas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313940, 'Manhuaçu', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313950, 'Manhumirim', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313980, 'Mar De Espanha', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313990, 'Maria Da Fé', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314010, 'Marilac', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314020, 'MaripÁ De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314030, 'Marliéria', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314050, 'Martinho Campos', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314055, 'Mata Verde', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314070, 'Mateus Leme', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (317150, 'Mathias Lobato', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314085, 'Matias Cardoso', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314100, 'Mato Verde', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314110, 'Matozinhos', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314130, 'Medeiros', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314150, 'Mendes Pimentel', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314170, 'Mesquita', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314180, 'Minas Novas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314200, 'Mirabela', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314220, 'Miraí', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314230, 'Moeda', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314250, 'Monjolos', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314270, 'Montalvânia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314280, 'Monte Alegre De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314300, 'Monte Belo', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314315, 'Monte Formoso', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314340, 'Monte Sião', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314330, 'Montes Claros', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314350, 'Morada Nova De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314370, 'Morro Do Pilar', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314380, 'Munhoz', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314400, 'Mutum', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314420, 'Nacip Raydan', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314430, 'Nanuque', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314437, 'Natalândia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314450, 'Nazareno', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314465, 'Ninheira', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314470, 'Nova Era', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314480, 'Nova Lima', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314500, 'Nova Ponte', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314510, 'Nova Resende', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313660, 'Nova União', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314530, 'Novo Cruzeiro', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314537, 'Novorizonte', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314545, 'Olhos D`Água', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314560, 'Oliveira', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314570, 'Oliveira Fortes', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314585, 'Oratórios', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314590, 'Ouro Branco', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314600, 'Ouro Fino', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314620, 'Ouro Verde De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314630, 'Padre Paraíso', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314640, 'Paineiras', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314650, 'Pains', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314670, 'Palma', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314690, 'Papagaios', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314700, 'Paracatu', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314720, 'Paraguaçu', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314740, 'Paraopeba', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314770, 'Passa Tempo', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314750, 'Passabém', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314790, 'Passos', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251330, 'Santa Helena', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314810, 'Patrocínio', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314830, 'Paula Cândido', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314850, 'Pavão', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314860, 'Peçanha', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314875, 'Pedra Bonita', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314890, 'Pedra Do IndaiÁ', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314910, 'Pedralva', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314915, 'Pedras De Maria Da Cruz', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314930, 'Pedro Leopoldo', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314950, 'Pequeri', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314960, 'Pequi', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314980, 'Perdizes', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314995, 'Periquito', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315010, 'Piau', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315020, 'Piedade De Ponte Nova', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315030, 'Piedade Do Rio Grande', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315050, 'Pimenta', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315057, 'Pintópolis', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315060, 'Piracema', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315080, 'Piranga', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315100, 'Piranguinho', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315110, 'Pirapetinga', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315130, 'Piraúba', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315150, 'Piumhi', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315170, 'Poço Fundo', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315190, 'Pocrane', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315200, 'Pompéu', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315213, 'Ponto Chique', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315220, 'Porteirinha', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315230, 'Porto Firme', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315250, 'Pouso Alegre', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315270, 'Prados', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315290, 'PratÁpolis', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315310, 'Presidente Bernardes', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315330, 'Presidente Kubitschek', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315340, 'Presidente OlegÁrio', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315370, 'Quartel Geral', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315380, 'Queluzito', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315400, 'Raul Soares', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315415, 'Reduto', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315430, 'Resplendor', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315440, 'Ressaquinha', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315450, 'Riacho Dos Machados', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315470, 'Ribeirão Vermelho', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315490, 'Rio Casca', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315510, 'Rio Do Prado', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315520, 'Rio Espera', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315540, 'Rio Novo', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315560, 'Rio Pardo De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315570, 'Rio Piracicaba', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315590, 'Rio Preto', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315610, 'RitÁpolis', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315630, 'Rodeiro', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315640, 'Romaria', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315650, 'Rubelita', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315670, 'SabarÁ', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315690, 'Sacramento', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315700, 'Salinas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315720, 'Santa BÁrbara', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315727, 'Santa BÁrbara Do Monte Verde', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315730, 'Santa BÁrbara Do Tugúrio', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315737, 'Santa Cruz De Salinas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315750, 'Santa Efigênia De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315760, 'Santa Fé De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315770, 'Santa Juliana', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315780, 'Santa Luzia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315800, 'Santa Maria De Itabira', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315820, 'Santa Maria Do Suaçuí', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315940, 'Santa Rita De Ibitipoca', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315930, 'Santa Rita De Jacutinga', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315950, 'Santa Rita Do Itueto', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315830, 'Santana Da Vargem', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315850, 'Santana De Pirapama', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315860, 'Santana Do Deserto', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315880, 'Santana Do Jacaré', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315895, 'Santana Do Paraíso', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315900, 'Santana Do Riacho', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315990, 'Santo Antônio Do Amparo', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316010, 'Santo Antônio Do Grama', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316020, 'Santo Antônio Do Itambé', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316040, 'Santo Antônio Do Monte', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316050, 'Santo Antônio Do Rio Abaixo', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316060, 'Santo Hipólito', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316080, 'São Bento Abade', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316095, 'São Domingos Das Dores', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316100, 'São Domingos Do Prata', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316110, 'São Francisco', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316130, 'São Francisco De Sales', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316150, 'São Geraldo', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316160, 'São Geraldo Da Piedade', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316170, 'São Gonçalo Do Abaeté', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316180, 'São Gonçalo Do ParÁ', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312550, 'São Gonçalo Do Rio Preto', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316210, 'São Gotardo', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316220, 'São João Batista Do Glória', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316230, 'São João Da Mata', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316245, 'São João Das Missões', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316250, 'São João Del Rei', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316257, 'São João Do Manteninha', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316265, 'São João Do Pacuí', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316270, 'São João Do Paraíso', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316290, 'São João Nepomuceno', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316294, 'São José Da Barra', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316295, 'São José Da Lapa', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316310, 'São José Da Varginha', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316330, 'São José Do Divino', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316340, 'São José Do Goiabal', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316360, 'São José Do Mantimento', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316380, 'São Miguel Do Anta', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316390, 'São Pedro Da União', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316400, 'São Pedro Dos Ferros', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316420, 'São Romão', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316440, 'São Sebastião Da Bela Vista', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316447, 'São Sebastião Do Anta', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316450, 'São Sebastião Do Maranhão', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316470, 'São Sebastião Do Paraíso', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316490, 'São Sebastião Do Rio Verde', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316520, 'São Thomé Das Letras', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316500, 'São Tiago', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316530, 'São Vicente De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316550, 'SardoÁ', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316553, 'Sarzedo', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316557, 'Senador Amaral', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316570, 'Senador Firmino', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316590, 'Senador Modestino Gonçalves', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316600, 'Senhora De Oliveira', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316620, 'Senhora Dos Remédios', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316640, 'Seritinga', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316650, 'Serra Azul De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316680, 'Serra Do Salitre', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316690, 'Serrania', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316700, 'Serranos', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316710, 'Serro', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316555, 'Setubinha', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316730, 'Silveirânia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316750, 'Simão Pereira', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316770, 'SobrÁlia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316790, 'Tabuleiro', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316800, 'Taiobeiras', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251370, 'Santa Rita', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316820, 'Tapiraí', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316840, 'Tarumirim', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316850, 'Teixeiras', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316870, 'Timóteo', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316890, 'Tiros', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316900, 'Tocantins', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316910, 'Toledo', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316930, 'Três Corações', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316940, 'Três Pontas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316950, 'Tumiritinga', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316970, 'Turmalina', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316990, 'UbÁ', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (317000, 'Ubaí', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (317010, 'Uberaba', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (317030, 'Umburatiba', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (317043, 'União De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (317047, 'Uruana De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (317052, 'Urucuia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (317060, 'Vargem Bonita', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (317070, 'Varginha', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (317075, 'Varjão De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (317090, 'Varzelândia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (317100, 'Vazante', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (317107, 'Veredinha', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (317115, 'Vermelho Novo', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (317130, 'Viçosa', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (317140, 'Vieiras', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (317170, 'Virgínia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (317190, 'Virgolândia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (317210, 'Volta Grande', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (317220, 'Wenceslau Braz', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500025, 'Alcinópolis', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500070, 'Anastácio', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500080, 'Anaurilândia', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500090, 'Antônio João', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500110, 'Aquidauana', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500150, 'Bandeirantes', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500190, 'Bataguassu', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500210, 'Bela Vista', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500220, 'Bonito', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500240, 'Caarapó', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500260, 'Camapuã', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500280, 'Caracol', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500295, 'Chapadão Do Sul', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500310, 'Corguinho', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500320, 'Corumbá', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500330, 'Coxim', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500345, 'Deodápolis', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500350, 'Douradina', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500375, 'Eldorado', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500390, 'Figueirão', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500400, 'Glória De Dourados', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500430, 'Iguatemi', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500440, 'Inocência', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500460, 'Itaquiraí', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500480, 'Japorã', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500500, 'Jardim', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500515, 'Juti', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500520, 'Ladário', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500540, 'Maracaju', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500568, 'Mundo Novo', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500580, 'Nioaque', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500620, 'Nova Andradina', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500625, 'Novo Horizonte Do Sul', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500635, 'Paranhos', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500660, 'Ponta Porã', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500710, 'Ribas Do Rio Pardo', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500720, 'Rio Brilhante', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500740, 'Rio Verde De Mato Grosso', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500755, 'Santa Rita Do Pardo', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500780, 'Selvíria', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500770, 'Sete Quedas', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500793, 'Sonora', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251350, 'Santana De Mangueira', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500800, 'Terenos', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500840, 'Vicentina', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510020, 'Água Boa', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510030, 'Alto Araguaia', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510035, 'Alto Boa Vista', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510050, 'Alto Paraguai', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510080, 'Apiacás', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510100, 'Araguaiana', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510125, 'Araputanga', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510140, 'Aripuanã', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510170, 'Barra Do Bugres', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510185, 'Bom Jesus Do Araguaia', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510190, 'Brasnorte', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510260, 'Campinápolis', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510267, 'Campo Verde', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510268, 'Campos De Júlio', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510270, 'Canarana', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510285, 'Castanheira', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510305, 'Cláudia', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510310, 'Cocalinho', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510325, 'Colniza', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510330, 'Comodoro', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510337, 'Cotriguaçu', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510340, 'Cuiabá', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510345, 'Denise', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510360, 'Dom Aquino', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510380, 'Figueirópolis D`Oeste', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510385, 'Gaúcha Do Norte', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510395, 'Glória D`Oeste', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510420, 'Guiratinga', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510452, 'Ipiranga Do Norte', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510454, 'Itanhangá', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510460, 'Itiquira', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510490, 'Jangada', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510510, 'Juara', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510515, 'Juína', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510520, 'Juscimeira', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510525, 'Lucas Do Rio Verde', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510558, 'Marcelândia', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510560, 'Matupá', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510590, 'Nobres', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510610, 'Nossa Senhora Do Livramento', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510620, 'Nova Brasilândia', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510621, 'Nova Canaã Do Norte', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510618, 'Nova Lacerda', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510890, 'Nova Maringá', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510622, 'Nova Mutum', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510617, 'Nova Nazaré', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510619, 'Nova Santa Helena', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510625, 'Nova Xavantina', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510626, 'Novo Mundo', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510631, 'Novo Santo Antônio', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510629, 'Paranaíta', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510637, 'Pedra Preta', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510645, 'Planalto Da Serra', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510650, 'Poconé', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510670, 'Ponte Branca', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510677, 'Porto Alegre Do Norte', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510682, 'Porto Esperidião', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510685, 'Porto Estrela', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510704, 'Primavera Do Leste', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510715, 'Reserva Do Cabaçal', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510719, 'Ribeirãozinho', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510720, 'Rio Branco', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510760, 'Rondonópolis', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510775, 'Salto Do Céu', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510724, 'Santa Carmem', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510776, 'Santa Rita Do Trivelato', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510726, 'Santo Afonso', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510780, 'Santo Antônio Do Leverger', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251392, 'São Bentinho', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510735, 'São José Do Xingu', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510740, 'São Pedro Da Cipa', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510787, 'Sapezal', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510788, 'Serra Nova Dourada', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510792, 'Sorriso', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510795, 'Tangará Da Serra', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510805, 'Terra Nova Do Norte', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510810, 'Tesouro', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510830, 'União Do Sul', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510840, 'Várzea Grande', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510850, 'Vera', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510860, 'Vila Rica', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150013, 'Abel Figueiredo', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150030, 'Afuá', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150034, 'Água Azul Do Norte', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150050, 'Almeirim', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150070, 'Anajás', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150085, 'Anapu', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150095, 'Aurora Do Pará', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150100, 'Aveiro', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150120, 'Baião', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150130, 'Barcarena', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150140, 'Belém', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150150, 'Benevides', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150160, 'Bonito', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150172, 'Brasil Novo', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150178, 'Breu Branco', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150180, 'Breves', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150200, 'Cachoeira Do Arari', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150210, 'Cametá', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150215, 'Canaã Dos Carajás', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150230, 'Capitão Poço', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150250, 'Chaves', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150270, 'Conceição Do Araguaia', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150275, 'Concórdia Do Pará', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150277, 'Curionópolis', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150285, 'Curuá', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150293, 'Dom Eliseu', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150300, 'Faro', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150304, 'Floresta Do Araguaia', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150309, 'Goianésia Do Pará', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150310, 'Gurupá', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150330, 'Igarapé Miri', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150345, 'Ipixuna Do Pará', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150360, 'Itaituba', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150370, 'Itupiranga', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150380, 'Jacundá', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150400, 'Limoeiro Do Ajuru', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150410, 'Magalhães Barata', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150430, 'Maracanã', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150440, 'Marapanim', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150445, 'Medicilândia', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150460, 'Mocajuba', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150480, 'Monte Alegre', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150490, 'Muaná', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150497, 'Nova Ipixuna', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150503, 'Novo Progresso', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150510, 'Óbidos', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150520, 'Oeiras Do Pará', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150540, 'Ourém', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150548, 'Pacajá', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150549, 'Palestina Do Pará', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150553, 'Parauapebas', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150560, 'Peixe Boi', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150563, 'Piçarra', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150570, 'Ponta De Pedras', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150590, 'Porto De Moz', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150610, 'Primavera', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150613, 'Redenção', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150616, 'Rio Maria', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150619, 'Rurópolis', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150630, 'Salvaterra', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260795, 'Jaqueira', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150655, 'Santa Luzia Do Pará', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150658, 'Santa Maria Das Barreiras', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150670, 'Santana Do Araguaia', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150680, 'Santarém', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150700, 'Santo Antônio Do Tauá', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150715, 'São Domingos Do Araguaia', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150730, 'São Félix Do Xingu', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150740, 'São Francisco Do Pará', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150746, 'São João Da Ponta', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150750, 'São João Do Araguaia', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150760, 'São Miguel Do Guamá', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150775, 'Sapucaia', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150780, 'Senador José Porfírio', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150795, 'Tailândia', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150797, 'Terra Santa', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150800, 'Tomé Açu', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150805, 'Trairão', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150810, 'Tucuruí', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150815, 'Uruará', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150820, 'Vigia', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150835, 'Vitória Do Xingu', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250010, 'Água Branca', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250030, 'Alagoa Grande', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250050, 'Alagoinha', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250057, 'Algodão De Jandaíra', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250060, 'Alhandra', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250077, 'Aparecida', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250090, 'Arara', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250110, 'Areia', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250120, 'Areial', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250130, 'Aroeiras', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250140, 'Baía Da Traição', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250153, 'Baraúna', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250157, 'Barra De Santana', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250170, 'Barra De São Miguel', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250190, 'Belém', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250205, 'Bernardino Batista', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250210, 'Boa Ventura', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250220, 'Bom Jesus', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250240, 'Bonito De Santa Fé', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250270, 'Borborema', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250280, 'Brejo Do Cruz', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250300, 'Caaporã', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250320, 'Cabedelo', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250340, 'Cacimba De Areia', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250350, 'Cacimba De Dentro', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250360, 'Caiçara', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250375, 'Cajazeirinhas', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250390, 'Camalaú', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250400, 'Campina Grande', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250407, 'Caraúbas', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250415, 'Casserengue', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250430, 'Catolé Do Rocha', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250435, 'Caturité', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250450, 'Condado', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250470, 'Congo', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250485, 'Coxixola', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250500, 'Cubati', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250510, 'Cuité', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250520, 'Cuitegi', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250530, 'Curral Velho', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250535, 'Damião', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250560, 'Diamante', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250570, 'Dona Inês', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250590, 'Emas', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250610, 'Fagundes', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250625, 'Gado Bravo', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250630, 'Guarabira', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250650, 'Gurjão', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250260, 'Igaracy', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250680, 'Ingá', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250690, 'Itabaiana', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251240, 'Puxinanã', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251250, 'Queimadas', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251270, 'Remígio', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251275, 'Riachão Do Bacamarte', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251276, 'Riachão Do Poço', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251280, 'Riacho Dos Cavalos', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251290, 'Rio Tinto', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251310, 'Salgado De São Félix', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251320, 'Santa Cruz', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251335, 'Santa Inês', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251340, 'Santa Luzia', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251380, 'Santa Teresinha', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251360, 'Santana Dos Garrotes', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251385, 'Santo André', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251390, 'São Bento', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251394, 'São Domingos Do Cariri', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251398, 'São Francisco', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250070, 'São João Do Rio Do Peixe', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251410, 'São João Do Tigre', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251430, 'São José De Caiana', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251450, 'São José De Piranhas', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251455, 'São José De Princesa', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251465, 'São José Do Brejo Do Cruz', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251470, 'São José Do Sabugi', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251445, 'São José Dos Ramos', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251490, 'São Mamede', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251510, 'São Sebastião De Lagoa De Roça', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251530, 'Sapé', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250730, 'Jacaraú', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250750, 'João Pessoa', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250760, 'Juarez Távora', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250770, 'Juazeirinho', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250790, 'Juripiranga', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250800, 'Juru', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250820, 'Lagoa De Dentro', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250840, 'Lastro', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250855, 'Logradouro', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250870, 'Mãe D`Água', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250880, 'Malta', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250900, 'Manaíra', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250910, 'Mari', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250920, 'Massaranduba', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250930, 'Mataraca', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250937, 'Mato Grosso', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250940, 'Mogeiro', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250960, 'Monte Horebe', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250970, 'Monteiro', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250990, 'Natuba', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251010, 'Nova Floresta', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251030, 'Nova Palmeira', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251050, 'Olivedos', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251065, 'Parari', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251070, 'Passagem', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251090, 'Paulista', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251110, 'Pedra Lavrada', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251272, 'Pedro Régis', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251130, 'Piancó', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251150, 'Pilar', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251170, 'Pilõezinhos', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251190, 'Pitimbu', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251200, 'Pocinhos', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251207, 'Poço De José De Moura', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251220, 'Prata', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251540, 'Seridó', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251560, 'Serra Da Raiz', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251570, 'Serra Grande', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251590, 'Serraria', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251597, 'Sobrado', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251600, 'Solânea', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251615, 'Sossêgo', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251630, 'Sumé', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251650, 'Taperoá', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251660, 'Tavares', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251680, 'Triunfo', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251700, 'Umbuzeiro', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251710, 'Várzea', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250550, 'Vista Serrana', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260005, 'Abreu E Lima', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260020, 'Afrânio', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260030, 'Agrestina', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260050, 'Águas Belas', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260070, 'Aliança', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260090, 'Amaraji', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260100, 'Angelim', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260110, 'Araripina', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260130, 'Barra De Guabiraba', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260150, 'Belém De Maria', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260170, 'Belo Jardim', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260180, 'Betânia', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260200, 'Bodocó', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260220, 'Bom Jardim', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260230, 'Bonito', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260250, 'Brejinho', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260270, 'Buenos Aires', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260280, 'Buíque', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260300, 'Cabrobó', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260320, 'Caetés', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260330, 'Calçado', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260345, 'Camaragibe', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260360, 'Camutanga', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260370, 'Canhotinho', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260390, 'Carnaíba', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260400, 'Carpina', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260410, 'Caruaru', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260420, 'Catende', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260440, 'Chã De Alegria', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260460, 'Condado', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260480, 'Cortês', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260490, 'Cumaru', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260510, 'Custódia', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260520, 'Escada', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260540, 'Feira Nova', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260550, 'Ferreiros', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260560, 'Flores', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260580, 'Frei Miguelinho', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260600, 'Garanhuns', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260620, 'Goiana', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260630, 'Granito', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260650, 'Iati', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260670, 'Ibirajuba', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260690, 'Iguaraci', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260700, 'Inajá', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260710, 'Ingazeira', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260730, 'Ipubi', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260750, 'Itaíba', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260770, 'Itapetim', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260775, 'Itapissuma', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260790, 'Jaboatão Dos Guararapes', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260800, 'Jataúba', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260810, 'João Alfredo', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260825, 'Jucati', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260830, 'Jupi', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260845, 'Lagoa Do Carro', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260860, 'Lagoa Do Ouro', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260875, 'Lagoa Grande', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260880, 'Lajedo', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260900, 'Macaparana', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260915, 'Manari', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260930, 'Mirandiba', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260940, 'Moreno', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260950, 'Nazaré Da Mata', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260970, 'Orobó', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260990, 'Ouricuri', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261000, 'Palmares', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261020, 'Panelas', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261040, 'Parnamirim', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261060, 'Paudalho', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355630, 'Valparaíso', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261090, 'Pesqueira', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261100, 'Petrolândia', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261120, 'Poção', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261140, 'Primavera', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261153, 'Quixaba', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261160, 'Recife', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261180, 'Ribeirão', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261200, 'Sairé', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261220, 'Salgueiro', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261230, 'Saloá', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261245, 'Santa Cruz', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261250, 'Santa Cruz Do Capibaribe', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261260, 'Santa Maria Da Boa Vista', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261270, 'Santa Maria Do Cambucá', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261290, 'São Benedito Do Sul', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261310, 'São Caitano', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261320, 'São João', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261340, 'São José Da Coroa Grande', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261360, 'São José Do Egito', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261380, 'São Vicente Ferrer', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261390, 'Serra Talhada', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261410, 'Sertânia', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261440, 'Solidão', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261450, 'Surubim', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261470, 'Tacaimbó', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261485, 'Tamandaré', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261510, 'Terezinha', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261520, 'Terra Nova', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261540, 'Toritama', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261560, 'Trindade', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261580, 'Tupanatinga', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261590, 'Tuparetama', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261610, 'Verdejante', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261620, 'Vertentes', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261640, 'Vitória De Santo Antão', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261650, 'Xexéu', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220010, 'Agricolândia', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220025, 'Alagoinha Do Piauí', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220030, 'Alto Longá', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220040, 'Altos', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220050, 'Amarante', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220070, 'Anísio De Abreu', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220090, 'Aroazes', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220095, 'Aroeiras Do Itaim', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220105, 'Assunção Do Piauí', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220110, 'Avelino Lopes', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220117, 'Barra D`Alcântara', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220130, 'Barreiras Do Piauí', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220150, 'Batalha', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220157, 'Belém Do Piauí', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220160, 'Beneditinos', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220173, 'Betânia Do Piauí', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220177, 'Boa Hora', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220190, 'Bom Jesus', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220192, 'Bonfim Do Piauí', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220196, 'Brasileira', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220198, 'Brejo Do Piauí', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220202, 'Buriti Dos Montes', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220207, 'Cajazeiras Do Piauí', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220208, 'Cajueiro Da Praia', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220210, 'Campinas Do Piauí', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220211, 'Campo Alegre Do Fidalgo', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220217, 'Campo Largo Do Piauí', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220220, 'Campo Maior', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220240, 'Capitão De Campos', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220245, 'Capitão Gervásio Oliveira', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220253, 'Caraúbas Do Piauí', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220260, 'Castelo Do Piauí', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220265, 'Caxingó', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220271, 'Cocal De Telha', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220273, 'Coivaras', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355640, 'Vargem Grande Do Sul', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220285, 'Coronel José Dias', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220290, 'Corrente', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220310, 'Cristino Castro', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220323, 'Currais', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220325, 'Curralinhos', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220330, 'Demerval Lobão', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220340, 'Dom Expedito Lopes', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220342, 'Domingos Mourão', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220360, 'Eliseu Martins', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220370, 'Esperantina', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220380, 'Flores Do Piauí', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220390, 'Floriano', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220410, 'Francisco Ayres', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220415, 'Francisco Macedo', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220430, 'Fronteiras', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220440, 'Gilbués', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220450, 'Guadalupe', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220460, 'Hugo Napoleão', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220470, 'Inhuma', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220490, 'Isaías Coelho', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220510, 'Itaueira', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220515, 'Jacobina Do Piauí', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220525, 'Jardim Do Mulato', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220530, 'Jerumenha', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220535, 'João Costa', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220545, 'Joca Marques', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220551, 'Juazeiro Do Piauí', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220553, 'Jurema', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220555, 'Lagoa Alegre', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220556, 'Lagoa Do Barro Do Piauí', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220559, 'Lagoa Do Sítio', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220554, 'Lagoinha Do Piauí', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220570, 'Luís Correia', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220585, 'Madeiro', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220595, 'Marcolândia', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220600, 'Marcos Parente', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220610, 'Matias Olímpio', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220630, 'Miguel Leão', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220640, 'Monsenhor Gil', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220650, 'Monsenhor Hipólito', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220665, 'Morro Cabeça No Tempo', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220669, 'Murici Dos Portelas', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220670, 'Nazaré Do Piauí', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220675, 'Nossa Senhora De Nazaré', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220795, 'Nova Santa Rita', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220690, 'Novo Oriente Do Piauí', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220700, 'Oeiras', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220720, 'Padre Marcos', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220730, 'Paes Landim', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220740, 'Palmeira Do Piauí', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220750, 'Palmeirais', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220760, 'Parnaguá', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220775, 'Passagem Franca Do Piauí', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220779, 'Pau D`Arco Do Piauí', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220785, 'Pavussu', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220790, 'Pedro Ii', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220800, 'Picos', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220820, 'Pio Ix', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220840, 'Piripiri', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220850, 'Porto', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220860, 'Prata Do Piauí', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220870, 'Redenção Do Gurguéia', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220885, 'Riacho Frio', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220887, 'Ribeira Do Piauí', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220900, 'Rio Grande Do Piauí', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220915, 'Santa Cruz Dos Milagres', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220920, 'Santa Filomena', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220937, 'Santa Rosa Do Piauí', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220940, 'Santo Antônio De Lisboa', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410590, 'Colorado', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220955, 'São Braz Do Piauí', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220965, 'São Francisco De Assis Do Piauí', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220975, 'São Gonçalo Do Gurguéia', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220985, 'São João Da Canabrava', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220987, 'São João Da Fronteira', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220995, 'São João Da Varjota', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (221000, 'São João Do Piauí', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (221005, 'São José Do Divino', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (221020, 'São José Do Piauí', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (221030, 'São Julião', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (221037, 'São Luis Do Piauí', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (221039, 'São Miguel Do Fidalgo', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (221040, 'São Miguel Do Tapuio', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (221060, 'São Raimundo Nonato', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (221063, 'Sebastião Leal', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (221065, 'Sigefredo Pacheco', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (221080, 'Simplício Mendes', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (221093, 'Sussuapara', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (221097, 'Tanque Do Piauí', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (221100, 'Teresina', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (221120, 'Uruçuí', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (221135, 'Várzea Branca', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (221150, 'Vera Mendes', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (221160, 'Vila Nova Do Piauí', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410010, 'Abatiá', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410030, 'Agudos Do Sul', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410045, 'Altamira Do Paraná', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412862, 'Alto Paraíso', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410070, 'Alto Piquiri', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410050, 'Altônia', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410090, 'Amaporã', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410105, 'Anahy', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410115, 'Ângulo', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410120, 'Antonina', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410140, 'Apucarana', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410160, 'Arapoti', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410170, 'Araruna', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410180, 'Araucária', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410190, 'Assaí', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410210, 'Astorga', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410230, 'Balsa Nova', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410240, 'Bandeirantes', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410270, 'Barra Do Jacaré', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410275, 'Bela Vista Da Caroba', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410290, 'Bituruna', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410300, 'Boa Esperança', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410304, 'Boa Ventura De São Roque', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410310, 'Bocaiúva Do Sul', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410315, 'Bom Jesus Do Sul', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410322, 'Bom Sucesso Do Sul', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410335, 'Braganey', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410337, 'Brasilândia Do Sul', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410345, 'Cafelândia', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410350, 'Califórnia', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410370, 'Cambé', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410380, 'Cambira', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410395, 'Campina Do Simão', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410405, 'Campo Bonito', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410420, 'Campo Largo', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410425, 'Campo Magro', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410440, 'Cândido De Abreu', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410445, 'Cantagalo', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410450, 'Capanema', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410465, 'Carambeí', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410480, 'Cascavel', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410490, 'Castro', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410510, 'Centenário Do Sul', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410530, 'Céu Azul', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410550, 'Cianorte', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410570, 'Clevelândia', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410580, 'Colombo', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355660, 'Vera Cruz', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410620, 'Contenda', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410640, 'Cornélio Procópio', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410650, 'Coronel Vivida', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410655, 'Corumbataí Do Sul', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410657, 'Cruzeiro Do Iguaçu', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410670, 'Cruzeiro Do Sul', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410685, 'Cruzmaltina', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410700, 'Curiúva', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410710, 'Diamante Do Norte', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410720, 'Dois Vizinhos', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410725, 'Douradina', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412863, 'Doutor Ulysses', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410750, 'Engenheiro Beltrão', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410753, 'Entre Rios Do Oeste', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410754, 'Espigão Alto Do Iguaçu', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410760, 'Faxinal', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410770, 'Fênix', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410773, 'Fernandes Pinheiro', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410785, 'Flor Da Serra Do Sul', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410790, 'Floresta', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410810, 'Flórida', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410830, 'Foz Do Iguaçu', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410845, 'Foz Do Jordão', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410840, 'Francisco Beltrão', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410855, 'Godoy Moreira', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410860, 'Goioerê', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410870, 'Grandes Rios', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410890, 'Guairaçá', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410900, 'Guapirama', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410910, 'Guaporema', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410930, 'Guaraniaçu', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410950, 'Guaraqueçaba', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410965, 'Honório Serpa', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410975, 'Ibema', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410980, 'Ibiporã', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411000, 'Iguaraçu', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411007, 'Imbaú', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411020, 'Inácio Martins', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411040, 'Indianópolis', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411050, 'Ipiranga', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411065, 'Iracema Do Oeste', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411080, 'Iretama', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411095, 'Itaipulândia', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411110, 'Itambé', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411125, 'Itaperuçu', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411130, 'Itaúna Do Sul', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411150, 'Ivaiporã', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411160, 'Ivatuba', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411170, 'Jaboti', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411190, 'Jaguapitã', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411210, 'Jandaia Do Sul', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411230, 'Japira', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411250, 'Jardim Alegre', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411270, 'Jataizinho', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411275, 'Jesuítas', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411290, 'Jundiaí Do Sul', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411300, 'Jussara', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411310, 'Kaloré', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411325, 'Laranjal', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411340, 'Leópolis', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411345, 'Lindoeste', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411350, 'Loanda', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411370, 'Londrina', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411375, 'Lunardelli', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411390, 'Mallet', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411400, 'Mamborê', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411420, 'Mandaguari', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411435, 'Manfrinópolis', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411450, 'Manoel Ribas', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411470, 'Maria Helena', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411480, 'Marialva', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411500, 'Marilena', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (172085, 'Sucupira', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411530, 'Mariópolis', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411540, 'Marmeleiro', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411550, 'Marumbi', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411560, 'Matelândia', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411573, 'Mato Rico', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411580, 'Medianeira', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411590, 'Mirador', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411600, 'Miraselva', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411610, 'Moreira Sales', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411630, 'Munhoz De Melo', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411650, 'Nova Aliança Do Ivaí', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411670, 'Nova Aurora', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411680, 'Nova Cantu', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411695, 'Nova Esperança Do Sudoeste', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411705, 'Nova Laranjeiras', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411720, 'Nova Olímpia', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411725, 'Nova Prata Do Iguaçu', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411722, 'Nova Santa Rosa', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411727, 'Nova Tebas', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411730, 'Ortigueira', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411745, 'Ouro Verde Do Oeste', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411760, 'Palmas', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411770, 'Palmeira', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411790, 'Palotina', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411810, 'Paranacity', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411830, 'Paranapoema', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411840, 'Paranavaí', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411850, 'Pato Branco', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411870, 'Paulo Frontin', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411885, 'Perobal', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411890, 'Pérola', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411910, 'Piên', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411925, 'Pinhal De São Bento', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411930, 'Pinhão', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411940, 'Piraí Do Sul', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411960, 'Pitanga', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411970, 'Planaltina Do Paraná', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411990, 'Ponta Grossa', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411995, 'Pontal Do Paraná', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412010, 'Porto Amazonas', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412020, 'Porto Rico', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412033, 'Prado Ferreira', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412035, 'Pranchita', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412050, 'Primeiro De Maio', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412065, 'Quarto Centenário', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412080, 'Quatro Barras', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412090, 'Quedas Do Iguaçu', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412100, 'Querência Do Norte', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412120, 'Quitandinha', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412130, 'Rancho Alegre', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412140, 'Realeza', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412150, 'Rebouças', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412170, 'Reserva', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412180, 'Ribeirão Claro', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412200, 'Rio Azul', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412210, 'Rio Bom', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412217, 'Rio Branco Do Ivaí', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412220, 'Rio Branco Do Sul', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412240, 'Rolândia', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412260, 'Rondon', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412270, 'Sabáudia', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412280, 'Salgado Filho', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412300, 'Salto Do Lontra', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412320, 'Santa Cecília Do Pavão', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412340, 'Santa Fé', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412350, 'Santa Helena', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412370, 'Santa Isabel Do Ivaí', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412382, 'Santa Lúcia', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412385, 'Santa Maria Do Oeste', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412395, 'Santa Mônica', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412405, 'Santa Terezinha De Itaipu', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412420, 'Santo Antônio Do Caiuá', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412430, 'Santo Antônio Do Paraíso', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412450, 'Santo Inácio', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412470, 'São Jerônimo Da Serra', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412480, 'São João', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412500, 'São João Do Ivaí', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412510, 'São João Do Triunfo', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412530, 'São Jorge Do Ivaí', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412540, 'São José Da Boa Vista', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412545, 'São José Das Palmeiras', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412555, 'São Manoel Do Paraná', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412560, 'São Mateus Do Sul', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412575, 'São Pedro Do Iguaçu', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412590, 'São Pedro Do Paraná', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412610, 'São Tomé', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412620, 'Sapopema', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412627, 'Saudade Do Iguaçu', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412630, 'Sengés', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412640, 'Sertaneja', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412660, 'Siqueira Campos', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412665, 'Sulina', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412670, 'Tamboara', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412690, 'Tapira', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412710, 'Telêmaco Borba', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412720, 'Terra Boa', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412740, 'Terra Roxa', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412760, 'Tijucas Do Sul', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412780, 'Tomazina', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412788, 'Tunas Do Paraná', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412790, 'Tuneiras Do Oeste', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412796, 'Turvo', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412810, 'Umuarama', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412830, 'Uniflor', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412840, 'Uraí', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412855, 'Vera Cruz Do Oeste', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412865, 'Virmond', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412870, 'Vitorino', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412880, 'Xambrê', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330015, 'Aperibé', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330020, 'Araruama', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330023, 'Armação Dos Búzios', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330030, 'Barra Do Piraí', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330045, 'Belford Roxo', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330050, 'Bom Jardim', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330070, 'Cabo Frio', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330090, 'Cambuci', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330100, 'Campos Dos Goytacazes', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330093, 'Carapebus', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330120, 'Carmo', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330130, 'Casimiro De Abreu', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330140, 'Conceição De Macabu', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330160, 'Duas Barras', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330180, 'Engenheiro Paulo De Frontin', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330185, 'Guapimirim', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330190, 'Itaboraí', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330200, 'Itaguaí', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330210, 'Itaocara', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330225, 'Itatiaia', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330230, 'Laje Do Muriaé', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330240, 'Macaé', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330250, 'Magé', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330270, 'Maricá', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330285, 'Mesquita', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330300, 'Miracema', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330310, 'Natividade', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330330, 'Niterói', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330350, 'Nova Iguaçu', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330360, 'Paracambi', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330380, 'Parati', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330390, 'Petrópolis', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330400, 'Piraí', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330410, 'Porciúncula', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330415, 'Quissamã', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330430, 'Rio Bonito', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330450, 'Rio Das Flores', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330455, 'Rio De Janeiro', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330460, 'Santa Maria Madalena', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330480, 'São Fidélis', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330490, 'São Gonçalo', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330500, 'São João Da Barra', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330513, 'São José De Ubá', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330515, 'São José Do Vale Do Rio Preto', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330530, 'São Sebastião Do Alto', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330540, 'Sapucaia', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330555, 'Seropédica', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330570, 'Sumidouro', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330575, 'Tanguá', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330590, 'Trajano De Moraes', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330610, 'Valença', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330615, 'Varre Sai', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240010, 'Acari', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240020, 'Açu', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240040, 'Água Nova', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240050, 'Alexandria', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240070, 'Alto Do Rodrigues', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240090, 'Antônio Martins', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240110, 'Areia Branca', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240130, 'Augusto Severo', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240145, 'Baraúna', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240150, 'Barcelona', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240165, 'Bodó', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240180, 'Brejinho', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240190, 'Caiçara Do Rio Do Vento', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240200, 'Caicó', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240220, 'Canguaretama', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240240, 'Carnaúba Dos Dantas', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240260, 'Ceará Mirim', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240270, 'Cerro Corá', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240290, 'Coronel João Pessoa', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240310, 'Currais Novos', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240330, 'Encanto', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240340, 'Equador', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240360, 'Extremoz', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240375, 'Fernando Pedroza', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240390, 'Francisco Dantas', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240410, 'Galinhos', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240420, 'Goianinha', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240440, 'Grossos', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240450, 'Guamaré', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240470, 'Ipanguaçu', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240485, 'Itajá', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240500, 'Jaçanã', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240510, 'Jandaíra', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240530, 'Januário Cicco', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240550, 'Jardim De Angicos', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240570, 'Jardim Do Seridó', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240590, 'João Dias', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240600, 'José Da Penha', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240615, 'Jundiá', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240630, 'Lagoa De Pedras', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240640, 'Lagoa De Velhos', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240660, 'Lagoa Salgada', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240680, 'Lajes Pintadas', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240700, 'Luís Gomes', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240720, 'Macau', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240725, 'Major Sales', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240740, 'Martins', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240760, 'Messias Targino', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240780, 'Monte Alegre', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240800, 'Mossoró', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240810, 'Natal', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240830, 'Nova Cruz', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240850, 'Ouro Branco', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240860, 'Paraná', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240890, 'Parelhas', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240910, 'Passa E Fica', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240930, 'Patu', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240950, 'Pedra Grande', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240960, 'Pedra Preta', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240980, 'Pedro Velho', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240990, 'Pendências', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241020, 'Portalegre', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241025, 'Porto Do Mangue', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241040, 'Pureza', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241050, 'Rafael Fernandes', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241070, 'Riacho Da Cruz', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241090, 'Riachuelo', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240895, 'Rio Do Fogo', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241110, 'Ruy Barbosa', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240933, 'Santa Maria', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241142, 'Santana Do Seridó', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241160, 'São Bento Do Norte', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241170, 'São Bento Do Trairí', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241190, 'São Francisco Do Oeste', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241210, 'São João Do Sabugi', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241220, 'São José De Mipibu', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241240, 'São José Do Seridó', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241255, 'São Miguel Do  Gostoso', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241270, 'São Pedro', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241280, 'São Rafael', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241300, 'São Vicente', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241320, 'Senador Georgino Avelino', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241330, 'Serra De São Bento', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241340, 'Serra Negra Do Norte', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241355, 'Serrinha Dos Pintos', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241370, 'Sítio Novo', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241380, 'Taboleiro Grande', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241400, 'Tangará', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241415, 'Tenente Laurentino Cruz', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241420, 'Tibau Do Sul', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241440, 'Touros', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241445, 'Triunfo Potiguar', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241460, 'Upanema', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241475, 'Venha Ver', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241480, 'Vera Cruz', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241500, 'Vila Flor', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110037, 'Alto Alegre Dos Parecis', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110034, 'Alvorada D`Oeste', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110002, 'Ariquemes', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110003, 'Cabixi', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110004, 'Cacoal', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110080, 'Candeias Do Jamari', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110090, 'Castanheiras', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110092, 'Chupinguaia', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110007, 'Corumbiara', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110008, 'Costa Marques', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110009, 'Espigão D`Oeste', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110010, 'Guajará Mirim', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110110, 'Itapuã Do Oeste', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110012, 'Ji Paraná', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110120, 'Ministro Andreazza', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110140, 'Monte Negro', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110014, 'Nova Brasilândia D`Oeste', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110143, 'Nova União', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110015, 'Ouro Preto Do Oeste', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110145, 'Parecis', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110146, 'Pimenteiras Do Oeste', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110025, 'Presidente Médici', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110026, 'Rio Crespo', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110028, 'Rolim De Moura', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110148, 'São Felipe D`Oeste', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110032, 'São Miguel Do Guaporé', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110150, 'Seringueiras', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110160, 'Theobroma', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110170, 'Urupá', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355690, 'Vista Alegre Do Alto', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110030, 'Vilhena', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (140005, 'Alto Alegre', '2017-09-10', 14, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (140010, 'Boa Vista', '2017-09-10', 14, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (140017, 'Cantá', '2017-09-10', 14, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (140023, 'Caroebe', '2017-09-10', 14, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (140030, 'Mucajaí', '2017-09-10', 14, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (140040, 'Normandia', '2017-09-10', 14, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (140047, 'Rorainópolis', '2017-09-10', 14, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (140060, 'São Luiz', '2017-09-10', 14, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (140070, 'Uiramutã', '2017-09-10', 14, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430005, 'Água Santa', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430020, 'Ajuricaba', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430040, 'Alegrete', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430047, 'Almirante Tamandaré Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430055, 'Alto Alegre', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430060, 'Alvorada', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430063, 'Amaral Ferrador', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430066, 'André Da Rocha', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430080, 'Antônio Prado', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430087, 'Araricá', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430090, 'Aratiba', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430107, 'Arroio Do Padre', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430120, 'Arroio Do Tigre', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430110, 'Arroio Dos Ratos', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430140, 'Arvorezinha', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430155, 'Áurea', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430160, 'Bagé', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430165, 'Barão', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430175, 'Barão Do Triunfo', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430187, 'Barra Do Quaraí', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430190, 'Barra Do Ribeiro', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430195, 'Barra Funda', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430180, 'Barracão', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430205, 'Benjamin Constant Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430215, 'Boa Vista Das Missões', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430222, 'Boa Vista Do Cadeado', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430223, 'Boa Vista Do Incra', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430230, 'Bom Jesus', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430237, 'Bom Progresso', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430240, 'Bom Retiro Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430250, 'Bossoroca', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430260, 'Braga', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430265, 'Brochier', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430280, 'Caçapava Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430300, 'Cachoeira Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430320, 'Cacique Doble', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430330, 'Caibaté', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430350, 'Camaquã', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430360, 'Cambará Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430370, 'Campina Das Missões', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430390, 'Campo Bom', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430400, 'Campo Novo', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430420, 'Candelária', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430435, 'Candiota', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430440, 'Canela', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430460, 'Canoas', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430462, 'Capão Bonito Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430465, 'Capão Do Cipó', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430466, 'Capão Do Leão', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430469, 'Capitão', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430471, 'Caraá', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430470, 'Carazinho', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430485, 'Carlos Gomes', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430495, 'Caseiros', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430500, 'Catuípe', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430511, 'Centenário', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430513, 'Cerro Branco', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430517, 'Cerro Grande Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430530, 'Chapada', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430535, 'Charqueadas', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430540, 'Chiapetta', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430544, 'Chuvisca', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430558, 'Colinas', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430570, 'Condor', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430583, 'Coqueiro Baixo', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430587, 'Coronel Barros', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430593, 'Coronel Pilar', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430595, 'Cotiporã', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430600, 'Crissiumal', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430607, 'Cristal Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430613, 'Cruzaltense', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430630, 'David Canabarro', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430632, 'Derrubadas', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430637, 'Dilermando De Aguiar', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430642, 'Dois Irmãos Das Missões', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430645, 'Dois Lajeados', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430660, 'Dom Pedrito', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430670, 'Dona Francisca', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430673, 'Doutor Maurício Cardoso', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430676, 'Eldorado Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430680, 'Encantado', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430692, 'Engenho Velho', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430693, 'Entre Ijuís', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430700, 'Erechim', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430705, 'Ernestina', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430730, 'Erval Seco', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430745, 'Esperança Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430755, 'Estação', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430770, 'Esteio', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430780, 'Estrela', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430783, 'Eugênio De Castro', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430790, 'Farroupilha', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430800, 'Faxinal Do Soturno', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430807, 'Fazenda Vilanova', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430820, 'Flores Da Cunha', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430830, 'Fontoura Xavier', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430840, 'Formigueiro', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430845, 'Fortaleza Dos Valos', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430860, 'Garibaldi', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430865, 'Garruchos', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430880, 'General Câmara', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430890, 'Getúlio Vargas', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430905, 'Glorinha', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430910, 'Gramado', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430915, 'Gramado Xavier', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430925, 'Guabiju', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430940, 'Guaporé', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430955, 'Harmonia', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430710, 'Herval', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430960, 'Horizontina', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430965, 'Hulha Negra', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430975, 'Ibarama', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430990, 'Ibiraiaras', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431000, 'Ibirubá', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431020, 'Ijuí', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431030, 'Ilópolis', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431036, 'Imigrante', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431041, 'Inhacorá', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431043, 'Ipê', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431050, 'Iraí', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431055, 'Itacurubi', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431060, 'Itaqui', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431065, 'Itati', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431075, 'Ivorá', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431085, 'Jaboticaba', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431090, 'Jacutinga', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431100, 'Jaguarão', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431112, 'Jaquirana', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431115, 'Jóia', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431123, 'Lagoa Bonita Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431130, 'Lagoa Vermelha', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431125, 'Lagoão', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431142, 'Lajeado Do Bugre', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431160, 'Liberato Salzano', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431162, 'Lindolfo Collor', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355700, 'Votorantim', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431170, 'Machadinho', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431175, 'Manoel Viana', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431179, 'Maratá', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431180, 'Marau', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431198, 'Mariana Pimentel', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431205, 'Marques De Souza', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431210, 'Mata', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431215, 'Mato Leitão', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431220, 'Maximiliano De Almeida', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431225, 'Minas Do Leão', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431235, 'Montauri', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431238, 'Monte Belo Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431240, 'Montenegro', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431244, 'Morrinhos Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431247, 'Morro Reuter', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431260, 'Muçum', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431262, 'Muliterno', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431265, 'Não Me Toque', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431270, 'Nonoai', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431280, 'Nova Araçá', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431290, 'Nova Bassano', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431300, 'Nova Bréscia', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431303, 'Nova Esperança Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431306, 'Nova Hartz', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431310, 'Nova Palma', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431330, 'Nova Prata', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431335, 'Nova Roma Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431349, 'Novo Barreiro', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431339, 'Novo Cabrais', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431342, 'Novo Machado', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431346, 'Novo Xingu', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431350, 'Osório', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431365, 'Palmares Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431380, 'Palmitinho', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431390, 'Panambi', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431400, 'Paraí', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431403, 'Pareci Novo', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431405, 'Parobé', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431410, 'Passo Fundo', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431413, 'Paulo Bento', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431417, 'Pedras Altas', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431430, 'Pejuçara', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431440, 'Pelotas', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431445, 'Pinhal', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431447, 'Pinhal Grande', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431449, 'Pinheirinho Do Vale', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431455, 'Pirapó', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431470, 'Planalto', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431477, 'Pontão', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431478, 'Ponte Preta', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431490, 'Porto Alegre', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431505, 'Porto Mauá', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431510, 'Porto Xavier', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431513, 'Pouso Novo', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431515, 'Progresso', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431520, 'Putinga', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431530, 'Quaraí', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431532, 'Quevedos', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431540, 'Redentora', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431545, 'Relvado', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431555, 'Rio Dos Índios', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431570, 'Rio Pardo', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431580, 'Roca Sales', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431590, 'Rodeio Bonito', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431600, 'Rolante', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431620, 'Rondinha', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431640, 'Rosário Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431642, 'Sagrada Família', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431645, 'Salto Do Jacuí', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431650, 'Salvador Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431660, 'Sananduva', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431673, 'Santa Cecília Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431690, 'Santa Maria', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431720, 'Santa Rosa', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431725, 'Santa Tereza', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431700, 'Santana Da Boa Vista', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431740, 'Santiago', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431750, 'Santo Ângelo', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431770, 'Santo Antônio Das Missões', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431775, 'Santo Antônio Do Planalto', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431790, 'Santo Cristo', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431795, 'Santo Expedito Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431805, 'São Domingos Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431820, 'São Francisco De Paula', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431830, 'São Gabriel', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431842, 'São João Da Urtiga', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431844, 'São Jorge', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431845, 'São José Das Missões', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431848, 'São José Do Hortêncio', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431850, 'São José Do Norte', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431860, 'São José Do Ouro', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431862, 'São José Dos Ausentes', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431870, 'São Leopoldo', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431890, 'São Luiz Gonzaga', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431900, 'São Marcos', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431912, 'São Martinho Da Serra', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431920, 'São Nicolau', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431935, 'São Pedro Da Serra', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431936, 'São Pedro Das Missões', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431940, 'São Pedro Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431950, 'São Sebastião Do Caí', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431970, 'São Valentim', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431973, 'São Valério Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431975, 'São Vendelino', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431990, 'Sapiranga', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432010, 'Sarandi', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432020, 'Seberi', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432026, 'Segredo', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432032, 'Senador Salgado Filho', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432040, 'Serafina Corrêa', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432045, 'Sério', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432055, 'Sertão Santana', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432060, 'Severiano De Almeida', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432067, 'Sinimbu', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432070, 'Sobradinho', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432085, 'Tabaí', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432100, 'Tapera', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432110, 'Tapes', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432130, 'Taquari', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432135, 'Tavares', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432143, 'Terra De Areia', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432145, 'Teutônia', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432147, 'Tiradentes Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432150, 'Torres', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432162, 'Travesseiro', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432166, 'Três Cachoeiras', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432170, 'Três Coroas', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432183, 'Três Forquilhas', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432190, 'Três Passos', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432195, 'Trindade Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432210, 'Tucunduva', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432218, 'Tupanci Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432225, 'Tupandi', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432230, 'Tuparendi', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432234, 'Ubiretama', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432237, 'Unistalda', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432250, 'Vacaria', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432253, 'Vale Do Sol', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432252, 'Vale Verde', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432260, 'Venâncio Aires', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432280, 'Veranópolis', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432290, 'Viadutos', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432300, 'Viamão', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432330, 'Vila Flores', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432340, 'Vila Maria', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432350, 'Vista Alegre', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432360, 'Vista Alegre Do Prata', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432375, 'Vitória Das Missões', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432377, 'Westfália', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420005, 'Abdon Batista', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420020, 'Agrolândia', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420040, 'Água Doce', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420055, 'Águas Frias', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420060, 'Águas Mornas', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420075, 'Alto Bela Vista', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420090, 'Angelina', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420110, 'Anitápolis', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420120, 'Antônio Carlos', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420127, 'Arabutã', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420140, 'Araranguá', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420150, 'Armazém', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420165, 'Arvoredo', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420180, 'Atalanta', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420195, 'Balneário Arroio Do Silva', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420200, 'Balneário Camboriú', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420207, 'Balneário Gaivota', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420208, 'Bandeirante', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420209, 'Barra Bonita', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420213, 'Bela Vista Do Toldo', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420220, 'Benedito Novo', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420240, 'Blumenau', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420250, 'Bom Jardim Da Serra', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420253, 'Bom Jesus', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420260, 'Bom Retiro', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420245, 'Bombinhas', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420280, 'Braço Do Norte', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420287, 'Brunópolis', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420300, 'Caçador', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420310, 'Caibi', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420320, 'Camboriú', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420340, 'Campo Belo Do Sul', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420360, 'Campos Novos', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420370, 'Canelinha', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420325, 'Capão Alto', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420395, 'Capivari De Baixo', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420410, 'Caxambu Do Sul', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420417, 'Cerro Negro', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420420, 'Chapecó', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420425, 'Cocal Do Sul', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420435, 'Cordilheira Alta', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420445, 'Coronel Martins', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420450, 'Corupá', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420460, 'Criciúma', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420475, 'Cunhataí', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420490, 'Descanso', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420510, 'Dona Emma', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420515, 'Doutor Pedrinho', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420519, 'Ermo', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420520, 'Erval Velho', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420535, 'Flor Do Sertão', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420543, 'Formosa Do Sul', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420550, 'Fraiburgo', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420555, 'Frei Rogério', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420570, 'Garopaba', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420590, 'Gaspar', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420610, 'Grão Pará', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420620, 'Gravatal', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420640, 'Guaraciaba', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420660, 'Guarujá Do Sul', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420670, 'Herval D`Oeste', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420675, 'Ibiam', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420690, 'Ibirama', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420710, 'Ilhota', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420730, 'Imbituba', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420740, 'Imbuia', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420757, 'Iomerê', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355715, 'Zacarias', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420768, 'Ipuaçu', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420770, 'Ipumirim', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420780, 'Irani', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420790, 'Irineópolis', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420800, 'Itá', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420820, 'Itajaí', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420840, 'Itapiranga', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420850, 'Ituporanga', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420860, 'Jaborá', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420880, 'Jaguaruna', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420895, 'Jardinópolis', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420910, 'Joinville', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420915, 'José Boiteux', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420920, 'Lacerdópolis', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420940, 'Laguna', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420950, 'Laurentino', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420960, 'Lauro Muller', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420980, 'Leoberto Leal', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420990, 'Lontras', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421000, 'Luiz Alves', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421005, 'Macieira', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421020, 'Major Gercino', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421040, 'Maracajá', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421050, 'Maravilha', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421060, 'Massaranduba', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421080, 'Meleiro', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421090, 'Modelo', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421105, 'Monte Carlo', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421120, 'Morro Da Fumaça', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421125, 'Morro Grande', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421140, 'Nova Erechim', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421150, 'Nova Trento', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421160, 'Nova Veneza', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421170, 'Orleans', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421180, 'Ouro', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421185, 'Ouro Verde', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421189, 'Painel', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421200, 'Palma Sola', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421210, 'Palmitos', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421220, 'Papanduva', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421225, 'Passo De Torres', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421230, 'Paulo Lopes', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421250, 'Penha', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421260, 'Peritiba', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421290, 'Pinhalzinho', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421310, 'Piratuba', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421320, 'Pomerode', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421330, 'Ponte Alta', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421340, 'Ponte Serrada', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421360, 'Porto União', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421380, 'Praia Grande', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421390, 'Presidente Castello Branco', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421410, 'Presidente Nereu', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421420, 'Quilombo', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421440, 'Rio Das Antas', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421450, 'Rio Do Campo', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421480, 'Rio Do Sul', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421490, 'Rio Fortuna', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421500, 'Rio Negrinho', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421507, 'Riqueza', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421520, 'Romelândia', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421530, 'Salete', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421540, 'Salto Veloso', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421550, 'Santa Cecília', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421560, 'Santa Rosa De Lima', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421567, 'Santa Terezinha', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421568, 'Santa Terezinha Do Progresso', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421570, 'Santo Amaro Da Imperatriz', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421575, 'São Bernardino', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421590, 'São Bonifácio', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421605, 'São Cristovão Do Sul', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421620, 'São Francisco Do Sul', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421625, 'São João Do Oeste', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421650, 'São Joaquim', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421660, 'São José', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421680, 'São José Do Cerrito', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421700, 'São Ludgero', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421715, 'São Miguel Da Boa Vista', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421720, 'São Miguel Do Oeste', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421730, 'Saudades', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421740, 'Schroeder', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421755, 'Serra Alta', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421770, 'Sombrio', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421780, 'Taió', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421790, 'Tangará', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421800, 'Tijucas', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421820, 'Timbó', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421830, 'Três Barras', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421835, 'Treviso', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421850, 'Treze Tílias', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421870, 'Tubarão', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421875, 'Tunápolis', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421885, 'União Do Oeste', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421895, 'Urupema', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421910, 'Vargeão', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421915, 'Vargem', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421920, 'Vidal Ramos', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421935, 'Vitor Meireles', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421950, 'Xanxerê', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421970, 'Xaxim', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421985, 'Zortéa', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280020, 'Aquidabã', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280040, 'Arauá', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280060, 'Barra Dos Coqueiros', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280067, 'Boquim', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280100, 'Campo Do Brito', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280120, 'Canindé De São Francisco', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280130, 'Capela', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280150, 'Carmópolis', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280170, 'Cristinápolis', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280200, 'Divina Pastora', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280220, 'Feira Nova', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280230, 'Frei Paulo', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280250, 'General Maynard', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280270, 'Ilha Das Flores', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280290, 'Itabaiana', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280300, 'Itabaianinha', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280320, 'Itaporanga D`Ajuda', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280340, 'Japoatã', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280360, 'Laranjeiras', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280370, 'Macambira', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280390, 'Malhador', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280410, 'Moita Bonita', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280430, 'Muribeca', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280440, 'Neópolis', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280450, 'Nossa Senhora Da Glória', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280470, 'Nossa Senhora De Lourdes', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280480, 'Nossa Senhora Do Socorro', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280500, 'Pedra Mole', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280520, 'Pinhão', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280530, 'Pirambu', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280550, 'Poço Verde', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280570, 'Propriá', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280590, 'Riachuelo', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280600, 'Ribeirópolis', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280620, 'Salgado', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280650, 'Santa Rosa De Lima', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280640, 'Santana Do São Francisco', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280670, 'São Cristóvão', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280690, 'São Francisco', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280700, 'São Miguel Do Aleixo', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280720, 'Siriri', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280740, 'Tobias Barreto', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280760, 'Umbaúba', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350030, 'Aguaí', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350050, 'Águas De Lindóia', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350060, 'Águas De São Pedro', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350070, 'Agudos', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350080, 'Alfredo Marcondes', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350100, 'Altinópolis', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350110, 'Alto Alegre', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350130, 'Álvares Machado', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350140, 'Álvaro De Carvalho', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350160, 'Americana', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350180, 'Américo De Campos', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350190, 'Amparo', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350210, 'Andradina', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350230, 'Anhembi', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350240, 'Anhumas', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350260, 'Aparecida D`Oeste', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350275, 'Araçariguama', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350290, 'Araçoiaba Da Serra', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350310, 'Arandu', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350315, 'Arapeí', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350330, 'Araras', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350340, 'Arealva', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350360, 'Areiópolis', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350380, 'Artur Nogueira', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350390, 'Arujá', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350400, 'Assis', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350420, 'Auriflama', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350440, 'Avanhandava', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350450, 'Avaré', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350470, 'Balbinos', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350490, 'Bananal', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350510, 'Barbosa', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350520, 'Bariri', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350535, 'Barra Do Chapéu', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350550, 'Barretos', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350560, 'Barrinha', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350580, 'Bastos', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350600, 'Bauru', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350620, 'Bento De Abreu', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350635, 'Bertioga', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350640, 'Bilac', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350660, 'Biritiba Mirim', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350680, 'Bocaina', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350690, 'Bofete', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350710, 'Bom Jesus Dos Perdões', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350720, 'Borá', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350730, 'Boracéia', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350745, 'Borebi', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350760, 'Bragança Paulista', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350775, 'Brejo Alegre', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350780, 'Brodowski', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350800, 'Buri', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350820, 'Buritizal', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350840, 'Cabreúva', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350850, 'Caçapava', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350870, 'Caconde', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350890, 'Caiabu', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350910, 'Caiuá', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350920, 'Cajamar', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350930, 'Cajobi', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350945, 'Campina Do Monte Alegre', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350960, 'Campo Limpo Paulista', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350980, 'Campos Novos Paulista', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350990, 'Cananéia', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351000, 'Cândido Mota', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351015, 'Canitar', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351030, 'Capela Do Alto', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351040, 'Capivari', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351060, 'Carapicuíba', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351080, 'Casa Branca', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351100, 'Castilho', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351110, 'Catanduva', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351130, 'Cedral', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351160, 'Cesário Lange', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355720, 'Chavantes', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351190, 'Clementina', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351210, 'Colômbia', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351230, 'Conchas', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351250, 'Coroados', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351270, 'Corumbataí', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351280, 'Cosmópolis', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351300, 'Cotia', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351310, 'Cravinhos', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351330, 'Cruzália', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351350, 'Cubatão', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351370, 'Descalvado', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351380, 'Diadema', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351390, 'Divinolândia', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351410, 'Dois Córregos', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351430, 'Dourado', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351450, 'Duartina', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351460, 'Dumont', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351480, 'Eldorado', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351492, 'Elisiário', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351500, 'Embu Das Artes', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351510, 'Embu Guaçu', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351515, 'Engenheiro Coelho', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351519, 'Espírito Santo Do Turvo', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351520, 'Estrela D`Oeste', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351530, 'Estrela Do Norte', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351540, 'Fartura', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351550, 'Fernandópolis', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351565, 'Fernão', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351580, 'Flora Rica', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351590, 'Floreal', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351600, 'Flórida Paulista', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351630, 'Francisco Morato', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351650, 'Gabriel Monteiro', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351660, 'Gália', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351680, 'Gastão Vidigal', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351690, 'General Salgado', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351710, 'Glicério', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351720, 'Guaiçara', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351740, 'Guaíra', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351760, 'Guapiara', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351780, 'Guaraçaí', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351800, 'Guarani D`Oeste', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351810, 'Guarantã', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351830, 'Guararema', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351850, 'Guareí', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351870, 'Guarujá', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351880, 'Guarulhos', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351890, 'Guzolândia', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351905, 'Holambra', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351910, 'Iacanga', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351920, 'Iacri', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351930, 'Ibaté', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351950, 'Ibirarema', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351970, 'Ibiúna', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351980, 'Icém', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352000, 'Igaraçu Do Tietê', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352020, 'Igaratá', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352042, 'Ilha Comprida', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352040, 'Ilhabela', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352050, 'Indaiatuba', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352070, 'Indiaporã', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352090, 'Ipaussu', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352100, 'Iperó', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352115, 'Ipiguá', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352130, 'Ipuã', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352150, 'Irapuã', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352160, 'Irapuru', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352180, 'Itaí', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352200, 'Itaju', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352215, 'Itaóca', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352230, 'Itapetininga', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352240, 'Itapeva', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352265, 'Itapirapuã Paulista', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352270, 'Itápolis', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352290, 'Itapuí', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352310, 'Itaquaquecetuba', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352330, 'Itariri', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352350, 'Itatinga', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352370, 'Itirapuã', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352380, 'Itobi', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352400, 'Itupeva', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352420, 'Jaborandi', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352440, 'Jacareí', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352460, 'Jacupiranga', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352470, 'Jaguariúna', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352490, 'Jambeiro', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352510, 'Jardinópolis', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352530, 'Jaú', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352540, 'Jeriquara', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352560, 'João Ramalho', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352580, 'Júlio Mesquita', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352590, 'Jundiaí', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352610, 'Juquiá', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352620, 'Juquitiba', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352640, 'Laranjal Paulista', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352660, 'Lavrinhas', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352670, 'Leme', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352690, 'Limeira', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352710, 'Lins', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352720, 'Lorena', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352730, 'Louveira', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352750, 'Lucianópolis', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352770, 'Luiziânia', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352780, 'Lupércio', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352800, 'Macatuba', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352820, 'Macedônia', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352840, 'Mairinque', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352860, 'Manduri', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352880, 'Maracaí', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352885, 'Marapoama', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352900, 'Marília', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352920, 'Martinópolis', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352930, 'Matão', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352950, 'Mendonça', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352965, 'Mesópolis', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352980, 'Mineiros Do Tietê', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353000, 'Mira Estrela', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353010, 'Mirandópolis', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353030, 'Mirassol', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353040, 'Mirassolândia', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353060, 'Mogi Das Cruzes', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353080, 'Moji Mirim', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353100, 'Monções', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353110, 'Mongaguá', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353130, 'Monte Alto', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353150, 'Monte Azul Paulista', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353180, 'Monte Mor', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353170, 'Monteiro Lobato', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353200, 'Morungaba', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353210, 'Murutinga Do Sul', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353215, 'Nantes', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353230, 'Natividade Da Serra', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353250, 'Neves Paulista', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353260, 'Nhandeara', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353280, 'Nova Aliança', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353284, 'Nova Canaã Paulista', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353290, 'Nova Europa', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353300, 'Nova Granada', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353320, 'Nova Independência', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353340, 'Nova Odessa', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353325, 'Novais', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353360, 'Nuporanga', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353380, 'Óleo', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353390, 'Olímpia', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353410, 'Oriente', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353430, 'Orlândia', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170030, 'Aguiarnópolis', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353460, 'Osvaldo Cruz', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353470, 'Ourinhos', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353475, 'Ouroeste', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353500, 'Palestina', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353520, 'Palmeira D`Oeste', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353530, 'Palmital', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353550, 'Paraguaçu Paulista', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353570, 'Paraíso', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353590, 'Paranapuã', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353600, 'Parapuã', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353620, 'Pariquera Açu', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353630, 'Patrocínio Paulista', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353650, 'Paulínia', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353657, 'Paulistânia', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353670, 'Pederneiras', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353690, 'Pedranópolis', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353710, 'Pedreira', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353715, 'Pedrinhas Paulista', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353730, 'Penápolis', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353750, 'Pereiras', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353760, 'Peruíbe', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353780, 'Piedade', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353800, 'Pindamonhangaba', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353820, 'Pinhalzinho', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353850, 'Piquete', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353860, 'Piracaia', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353880, 'Piraju', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353900, 'Pirangi', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353920, 'Pirapozinho', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353930, 'Pirassununga', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353950, 'Pitangueiras', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353970, 'Platina', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353990, 'Poloni', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354000, 'Pompéia', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354020, 'Pontal', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354030, 'Pontes Gestal', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354050, 'Porangaba', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354070, 'Porto Ferreira', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354080, 'Potirendaba', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354085, 'Pracinha', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354100, 'Praia Grande', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354110, 'Presidente Alves', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354130, 'Presidente Epitácio', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354140, 'Presidente Prudente', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354160, 'Promissão', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354165, 'Quadra', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354180, 'Queiroz', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354200, 'Quintana', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354220, 'Rancharia', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354240, 'Regente Feijó', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354250, 'Reginópolis', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354270, 'Restinga', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354290, 'Ribeirão Bonito', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354310, 'Ribeirão Corrente', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354323, 'Ribeirão Dos Índios', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354325, 'Ribeirão Grande', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354340, 'Ribeirão Preto', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354370, 'Rincão', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354390, 'Rio Claro', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354400, 'Rio Das Pedras', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354420, 'Riolândia', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354425, 'Rosana', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354440, 'Rubiácea', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354450, 'Rubinéia', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354470, 'Sagres', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354490, 'Sales Oliveira', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354510, 'Salmourão', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354515, 'Saltinho', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354530, 'Salto De Pirapora', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354550, 'Sandovalina', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354570, 'Santa Albertina', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354580, 'Santa Bárbara D`Oeste', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355620, 'Valinhos', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355635, 'Vargem', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355645, 'Vargem Grande Paulista', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355650, 'Várzea Paulista', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355670, 'Vinhedo', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355680, 'Viradouro', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354625, 'Santa Cruz Da Esperança', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354640, 'Santa Cruz Do Rio Pardo', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354650, 'Santa Ernestina', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354670, 'Santa Gertrudes', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354690, 'Santa Lúcia', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354700, 'Santa Maria Da Serra', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354740, 'Santa Rita D`Oeste', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354760, 'Santa Rosa De Viterbo', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354765, 'Santa Salete', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354730, 'Santana De Parnaíba', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354770, 'Santo Anastácio', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354790, 'Santo Antônio Da Alegria', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354805, 'Santo Antônio Do Aracanguá', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354820, 'Santo Antônio Do Pinhal', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354830, 'Santo Expedito', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354850, 'Santos', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354860, 'São Bento Do Sapucaí', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354880, 'São Caetano Do Sul', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354890, 'São Carlos', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354910, 'São João Da Boa Vista', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354925, 'São João De Iracema', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354940, 'São Joaquim Da Barra', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354950, 'São José Da Bela Vista', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354970, 'São José Do Rio Pardo', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354980, 'São José Do Rio Preto', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354995, 'São Lourenço Da Serra', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355010, 'São Manuel', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355020, 'São Miguel Arcanjo', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355040, 'São Pedro', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355060, 'São Roque', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355070, 'São Sebastião', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355090, 'São Simão', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355100, 'São Vicente', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355120, 'Sarutaiá', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355140, 'Serra Azul', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355160, 'Serra Negra', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355170, 'Sertãozinho', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355190, 'Severínia', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355210, 'Socorro', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355220, 'Sorocaba', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355240, 'Sumaré', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355250, 'Suzano', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355260, 'Tabapuã', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355280, 'Taboão Da Serra', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355300, 'Taguaí', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355320, 'Taiúva', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355340, 'Tanabi', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355350, 'Tapiraí', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355365, 'Taquaral', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355380, 'Taquarituba', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355390, 'Tarabai', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355395, 'Tarumã', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355410, 'Taubaté', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355430, 'Teodoro Sampaio', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355450, 'Tietê', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355465, 'Torre De Pedra', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355470, 'Torrinha', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355480, 'Tremembé', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355495, 'Tuiuti', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355510, 'Tupi Paulista', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355520, 'Turiúba', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355535, 'Ubarana', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355550, 'Ubirajara', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355570, 'União Paulista', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355590, 'Uru', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355600, 'Urupês', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355695, 'Vitória Brasil', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355710, 'Votuporanga', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170025, 'Abreulândia', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170035, 'Aliança Do Tocantins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170040, 'Almas', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170100, 'Ananás', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170110, 'Aparecida Do Rio Negro', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170190, 'Araguacema', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170200, 'Araguaçu', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170215, 'Araguanã', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170230, 'Arapoema', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170255, 'Augustinópolis', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170290, 'Axixá Do Tocantins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170300, 'Babaçulândia', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170307, 'Barra Do Ouro', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170320, 'Bernardo Sayão', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170330, 'Bom Jesus Do Tocantins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170370, 'Brejinho De Nazaré', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170380, 'Buriti Do Tocantins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170384, 'Campos Lindos', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170388, 'Carmolândia', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170390, 'Caseara', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170410, 'Centenário', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170460, 'Chapada De Areia', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171670, 'Colméia', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170555, 'Combinado', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170600, 'Couto Magalhães', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170610, 'Cristalândia', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170650, 'Darcinópolis', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170700, 'Dianópolis', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170720, 'Dois Irmãos Do Tocantins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170740, 'Esperantina', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170755, 'Fátima', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170770, 'Filadélfia', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170825, 'Fortaleza Do Tabocão', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170900, 'Goiatins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170930, 'Guaraí', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170980, 'Ipueiras', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171070, 'Itaguatins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171110, 'Itaporã Do Tocantins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171150, 'Jaú Do Tocantins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171190, 'Lagoa Da Confusão', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171200, 'Lajeado', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171240, 'Lizarda', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171245, 'Luzinópolis', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171270, 'Mateiros', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171320, 'Miracema Do Tocantins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171330, 'Miranorte', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171370, 'Monte Santo Do Tocantins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171420, 'Natividade', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171430, 'Nazaré', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171500, 'Nova Rosalândia', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171515, 'Novo Alegre', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171550, 'Oliveira De Fátima', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (172100, 'Palmas', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171380, 'Palmeiras Do Tocantins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171610, 'Paraíso Do Tocantins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171620, 'Paranã', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171650, 'Pedro Afonso', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171665, 'Pequizeiro', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171720, 'Piraquê', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171750, 'Pium', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171790, 'Ponte Alta Do Tocantins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171820, 'Porto Nacional', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171830, 'Praia Norte', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171845, 'Pugmil', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171855, 'Riachinho', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171865, 'Rio Da Conceição', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171875, 'Rio Sono', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171884, 'Sandolândia', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171888, 'Santa Maria Do Tocantins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171889, 'Santa Rita Do Tocantins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (120001, 'Acrelândia', '2017-09-10', 12, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (120005, 'Assis Brasil', '2017-09-10', 12, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (120013, 'Bujari', '2017-09-10', 12, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (120020, 'Cruzeiro Do Sul', '2017-09-10', 12, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (120032, 'Jordão', '2017-09-10', 12, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (120034, 'Manoel Urbano', '2017-09-10', 12, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (120038, 'Plácido De Castro', '2017-09-10', 12, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (120040, 'Rio Branco', '2017-09-10', 12, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (120043, 'Santa Rosa Do Purus', '2017-09-10', 12, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (120045, 'Senador Guiomard', '2017-09-10', 12, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270010, 'Água Branca', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270030, 'Arapiraca', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270050, 'Barra De Santo Antônio', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270080, 'Belém', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270100, 'Boca Da Mata', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270130, 'Cajueiro', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270140, 'Campo Alegre', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270160, 'Canapi', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270190, 'Chã Preta', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270210, 'Colônia Leopoldina', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270230, 'Coruripe', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270240, 'Delmiro Gouveia', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270260, 'Feira Grande', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270280, 'Flexeiras', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270310, 'Igaci', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270330, 'Inhapi', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270350, 'Jacuípe', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270370, 'Jaramataia', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270390, 'Jundiá', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270410, 'Lagoa Da Canoa', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270430, 'Maceió', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270450, 'Maragogi', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270470, 'Marechal Deodoro', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270500, 'Mata Grande', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270530, 'Minador Do Negrão', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270550, 'Murici', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270570, 'Olho D`Água Das Flores', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270600, 'Olivença', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270620, 'Palestina', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270640, 'Pão De Açúcar', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270650, 'Passo De Camaragibe', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270670, 'Penedo', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270700, 'Pindoba', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270720, 'Poço Das Trincheiras', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270740, 'Porto De Pedras', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270770, 'Rio Largo', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270790, 'Santa Luzia Do Norte', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270820, 'São Brás', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270840, 'São José Da Tapera', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270870, 'São Miguel Dos Milagres', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270895, 'Senador Rui Palmeira', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270910, 'Taquarana', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270930, 'União Dos Palmares', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130002, 'Alvarães', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130008, 'Anamã', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130010, 'Anori', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130020, 'Atalaia Do Norte', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130050, 'Barreirinha', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130063, 'Beruri', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130070, 'Boca Do Acre', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130083, 'Caapiranga', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130110, 'Careiro', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130120, 'Coari', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130140, 'Eirunepé', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (172000, 'Santa Terezinha Do Tocantins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (172015, 'São Félix Do Tocantins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (172020, 'São Miguel Do Tocantins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (172030, 'São Sebastião Do Tocantins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (172065, 'Silvanópolis', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (172080, 'Sítio Novo Do Tocantins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (172090, 'Taguatinga', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (172097, 'Talismã', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (172110, 'Tocantínia', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (172125, 'Tupirama', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (172208, 'Wanderlândia', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130160, 'Fonte Boa', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130180, 'Ipixuna', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130190, 'Itacoatiara', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130200, 'Itapiranga', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130220, 'Juruá', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130250, 'Manacapuru', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130260, 'Manaus', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130280, 'Maraã', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130310, 'Nova Olinda Do Norte', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130330, 'Novo Aripuanã', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130353, 'Presidente Figueiredo', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130360, 'Santa Isabel Do Rio Negro', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130380, 'São Gabriel Da Cachoeira', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130406, 'Tabatinga', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130420, 'Tefé', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130426, 'Uarini', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130440, 'Urucurituba', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (160021, 'Cutias', '2017-09-10', 16, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (160025, 'Itaubal', '2017-09-10', 16, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (160030, 'Macapá', '2017-09-10', 16, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (160050, 'Oiapoque', '2017-09-10', 16, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (160053, 'Porto Grande', '2017-09-10', 16, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (160005, 'Serra Do Navio', '2017-09-10', 16, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (160080, 'Vitória Do Jari', '2017-09-10', 16, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290030, 'Acajutiba', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290040, 'Água Fria', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290070, 'Alagoinhas', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290100, 'Amargosa', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290115, 'América Dourada', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290130, 'Andaraí', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290150, 'Anguera', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290170, 'Antônio Cardoso', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290190, 'Aporá', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290200, 'Aracatu', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290220, 'Aramari', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290230, 'Aratuípe', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290250, 'Baianópolis', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290270, 'Barra', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290290, 'Barra Do Choça', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290320, 'Barreiras', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290327, 'Barrocas', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290340, 'Belmonte', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290370, 'Boa Nova', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290390, 'Bom Jesus Da Lapa', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290400, 'Boninal', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290420, 'Botuporã', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290440, 'Brejolândia', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290450, 'Brotas De Macaúbas', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290470, 'Buerarema', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290480, 'Caatiba', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290490, 'Cachoeira', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290515, 'Caetanos', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290530, 'Cafarnaum', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290550, 'Caldeirão Grande', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290580, 'Camamu', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290590, 'Campo Alegre De Lourdes', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290620, 'Canarana', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290650, 'Candeias', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290670, 'Cândido Sales', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290682, 'Canudos', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290687, 'Capim Grosso', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290700, 'Cardeal Da Silva', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290720, 'Casa Nova', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290750, 'Catu', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290760, 'Central', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290780, 'Cícero Dantas', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290810, 'Cocos', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290830, 'Conceição Do Almeida', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290850, 'Conceição Do Jacuípe', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290880, 'Contendas Do Sincorá', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290910, 'Coribe', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290930, 'Correntina', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290950, 'Cravolândia', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290980, 'Cruz Das Almas', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291000, 'Dário Meira', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291020, 'Dom Macedo Costa', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291040, 'Encruzilhada', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290050, 'Érico Cardoso', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291072, 'Eunápolis', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291077, 'Feira Da Mata', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291090, 'Firmino Alves', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291110, 'Formosa Do Rio Preto', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291130, 'Gentio Do Ouro', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291150, 'Gongogi', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291170, 'Guanambi', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291185, 'Heliópolis', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291200, 'Ibiassucê', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291220, 'Ibicoara', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291250, 'Ibipitanga', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291270, 'Ibirapitanga', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291290, 'Ibirataia', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291320, 'Ibotirama', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291340, 'Igaporã', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291350, 'Iguaí', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291370, 'Inhambupe', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291400, 'Ipirá', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291420, 'Irajuba', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291440, 'Iraquara', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291465, 'Itabela', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291480, 'Itabuna', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291500, 'Itaeté', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291520, 'Itagibá', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291535, 'Itaguaçu Da Bahia', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291540, 'Itaju Do Colônia', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291560, 'Itamaraju', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291580, 'Itambé', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291610, 'Itaparica', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291630, 'Itapebi', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291650, 'Itapicuru', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291670, 'Itaquara', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291690, 'Itiruçu', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291710, 'Itororó', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291730, 'Ituberá', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291735, 'Jaborandi', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291760, 'Jaguaquara', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291780, 'Jaguaripe', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291800, 'Jequié', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291830, 'Jitaúna', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291835, 'João Dourado', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291850, 'Jussara', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291870, 'Lafaiete Coutinho', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291880, 'Laje', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291900, 'Lajedinho', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291915, 'Lapão', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291930, 'Lençóis', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291950, 'Livramento De Nossa Senhora', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291970, 'Macarani', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291990, 'Macururé', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291995, 'Maetinga', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292010, 'Mairi', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292030, 'Malhada De Pedras', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292050, 'Maracás', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292070, 'Maraú', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292090, 'Mascote', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292110, 'Medeiros Neto', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292130, 'Milagres', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292150, 'Monte Santo', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292170, 'Morro Do Chapéu', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292190, 'Mucugê', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292205, 'Mulungu Do Morro', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292225, 'Muquém De São Francisco', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292250, 'Nazaré', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292265, 'Nordestina', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292273, 'Nova Fátima', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292280, 'Nova Itarana', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292300, 'Nova Viçosa', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292305, 'Novo Triunfo', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292320, 'Oliveira Dos Brejinhos', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292340, 'Palmas De Monte Alto', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292370, 'Paratinga', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292390, 'Pau Brasil', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292405, 'Pé De Serra', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292420, 'Pedro Alexandre', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292450, 'Pindaí', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292465, 'Pintadas', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292480, 'Piritiba', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292500, 'Planalto', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292520, 'Pojuca', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292530, 'Porto Seguro', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292560, 'Presidente Dutra', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292570, 'Presidente Jânio Quadros', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292590, 'Quijingue', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292595, 'Rafael Jambeiro', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292610, 'Retirolândia', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292630, 'Riachão Do Jacuípe', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292660, 'Ribeira Do Pombal', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292680, 'Rio Do Antônio', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292700, 'Rio Real', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292730, 'Salinas Da Margarida', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292750, 'Santa Bárbara', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292770, 'Santa Cruz Cabrália', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292805, 'Santa Luzia', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292840, 'Santa Rita De Cássia', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292820, 'Santana', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292860, 'Santo Amaro', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292880, 'Santo Estêvão', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292895, 'São Domingos', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292905, 'São Félix Do Coribe', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292925, 'São Gabriel', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292935, 'São José Da Vitória', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292950, 'São Sebastião Do Passé', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292975, 'Saubara', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292990, 'Seabra', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293010, 'Senhor Do Bonfim', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293030, 'Serra Dourada', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293060, 'Serrolândia', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293075, 'Sítio Do Mato', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293077, 'Sobradinho', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293090, 'Tabocas Do Brejo Velho', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293110, 'Tanquinho', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293130, 'Tapiramutá', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293140, 'Teodoro Sampaio', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293170, 'Terra Nova', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293190, 'Tucano', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293220, 'Ubaitaba', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293240, 'Uibaí', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293250, 'Una', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293270, 'Uruçuca', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293290, 'Valença', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293310, 'Várzea Do Poço', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293317, 'Varzedo', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293325, 'Vereda', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293345, 'Wanderley', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293350, 'Wenceslau Guimarães', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230020, 'Acaraú', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230040, 'Aiuaba', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230060, 'Altaneira', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230075, 'Amontada', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230100, 'Aquiraz', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230120, 'Aracoiaba', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230130, 'Araripe', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230160, 'Assaré', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230180, 'Baixio', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230190, 'Barbalha', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230200, 'Barro', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230210, 'Baturité', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230230, 'Bela Cruz', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230260, 'Camocim', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230280, 'Canindé', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230300, 'Caridade', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230320, 'Caririaçu', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230350, 'Cascavel', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230365, 'Catunda', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230380, 'Cedro', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230395, 'Chorozinho', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230410, 'Crateús', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230423, 'Croatá', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230426, 'Deputado Irapuan Pinheiro', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230430, 'Farias Brito', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230440, 'Fortaleza', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230460, 'General Sampaio', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230470, 'Granja', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230490, 'Groaíras', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230510, 'Guaramiranga', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230523, 'Horizonte', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230530, 'Ibiapina', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230540, 'Icó', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230560, 'Independência', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230570, 'Ipaumirim', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230600, 'Iracema', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230620, 'Itaiçaba', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230630, 'Itapagé', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230655, 'Itarema', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230670, 'Jaguaretama', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230690, 'Jaguaribe', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230720, 'Jati', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230725, 'Jijoca De Jericoacoara', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230750, 'Lavras Da Mangabeira', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230765, 'Maracanaú', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230780, 'Marco', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230800, 'Massapê', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230830, 'Milagres', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230837, 'Miraíma', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230850, 'Mombaça', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230880, 'Moraújo', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230900, 'Mucambo', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230920, 'Nova Olinda', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230940, 'Novo Oriente', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230960, 'Pacajus', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230980, 'Pacoti', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231010, 'Palmácia', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231025, 'Paraipaba', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231040, 'Paramoti', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231060, 'Penaforte', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231080, 'Pereiro', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231090, 'Piquet Carneiro', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231110, 'Porteiras', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231123, 'Potiretama', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231130, 'Quixadá', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231140, 'Quixeramobim', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231170, 'Reriutaba', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231180, 'Russas', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231190, 'Saboeiro', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231220, 'Santa Quitéria', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231210, 'Santana Do Cariri', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231250, 'São João Do Jaguaribe', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231280, 'Senador Sá', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231300, 'Solonópole', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231320, 'Tamboril', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231335, 'Tejuçuoca', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231350, 'Trairi', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231360, 'Ubajara', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231380, 'Uruburetama', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231395, 'Varjota', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231410, 'Viçosa Do Ceará', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320010, 'Afonso Cláudio', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320020, 'Alegre', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320035, 'Alto Rio Novo', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320060, 'Aracruz', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320070, 'Atilio Vivacqua', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320100, 'Boa Esperança', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320120, 'Cachoeiro De Itapemirim', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320140, 'Castelo', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320160, 'Conceição Da Barra', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320190, 'Domingos Martins', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320220, 'Fundão', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320225, 'Governador Lindenberg', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320245, 'Ibatiba', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320260, 'Iconha', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320270, 'Itaguaçu', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320290, 'Itarana', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320310, 'Jerônimo Monteiro', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320316, 'Laranja Da Terra', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320330, 'Mantenópolis', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320335, 'Marilândia', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320350, 'Montanha', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320370, 'Muniz Freire', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320400, 'Pancas', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320410, 'Pinheiros', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320430, 'Presidente Kennedy', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320440, 'Rio Novo Do Sul', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320455, 'Santa Maria De Jetibá', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320470, 'São Gabriel Da Palha', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320495, 'São Roque Do Canaã', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320503, 'Vargem Alta', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320510, 'Viana', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320517, 'Vila Valério', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520005, 'Abadia De Goiás', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520013, 'Acreúna', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520017, 'Água Fria De Goiás', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520030, 'Alexânia', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520055, 'Alto Horizonte', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520082, 'Amaralina', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520090, 'Amorinópolis', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520120, 'Anhanguera', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520130, 'Anicuns', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520140, 'Aparecida De Goiânia', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520160, 'Araçu', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520180, 'Aragoiânia', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520235, 'Arenópolis', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520280, 'Avelinópolis', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520320, 'Barro Alto', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520340, 'Bom Jardim De Goiás', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520357, 'Bonópolis', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520380, 'Britânia', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520393, 'Buriti De Goiás', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520410, 'Cachoeira Alta', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520425, 'Cachoeira Dourada', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520450, 'Caldas Novas', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520460, 'Campestre De Goiás', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520480, 'Campo Alegre De Goiás', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520490, 'Campos Belos', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520500, 'Carmo Do Rio Verde', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520520, 'Caturaí', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520545, 'Cezarina', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520549, 'Cidade Ocidental', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520552, 'Colinas Do Sul', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520590, 'Corumbaíba', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520630, 'Cristianópolis', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520650, 'Cromínia', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520680, 'Damolândia', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520710, 'Diorama', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520725, 'Doverlândia', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520750, 'Estrela Do Norte', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520760, 'Fazenda Nova', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520790, 'Flores De Goiás', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520815, 'Gameleira De Goiás', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520860, 'Goianésia', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520880, 'Goianira', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520910, 'Goiatuba', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520929, 'Guaraíta', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520945, 'Guarinos', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520970, 'Hidrolândia', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520993, 'Inaciolândia', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521000, 'Inhumas', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521015, 'Ipiranga De Goiás', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521040, 'Itaberaí', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521060, 'Itaguaru', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521090, 'Itapaci', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521130, 'Itarumã', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521150, 'Itumbiara', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521170, 'Jandaia', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521190, 'Jataí', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521210, 'Joviânia', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521225, 'Lagoa Santa', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521250, 'Luziânia', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521270, 'Mambaí', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521295, 'Matrinchã', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521305, 'Mimoso De Goiás', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521310, 'Mineiros', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521350, 'Monte Alegre De Goiás', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521375, 'Montividiu', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521380, 'Morrinhos', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521400, 'Mozarlândia', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521410, 'Mutunópolis', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521460, 'Niquelândia', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521480, 'Nova Aurora', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521486, 'Nova Glória', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521500, 'Nova Veneza', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521523, 'Novo Gama', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521530, 'Orizona', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521550, 'Ouvidor', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521565, 'Palestina De Goiás', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521590, 'Palminópolis', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521630, 'Paranaiguara', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521680, 'Petrolina De Goiás', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521710, 'Piracanjuba', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521730, 'Pirenópolis', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521770, 'Pontalina', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521805, 'Porteirão', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521839, 'Professor Jamil', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521860, 'Rialma', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521878, 'Rio Quente', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521900, 'Sanclerlândia', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521920, 'Santa Cruz De Goiás', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521930, 'Santa Helena De Goiás', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521945, 'Santa Rita Do Novo Destino', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521960, 'Santa Tereza De Goiás', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521973, 'Santo Antônio De Goiás', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521990, 'São Francisco De Goiás', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (522005, 'São João Da Paraúna', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (522020, 'São Miguel Do Araguaia', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (522040, 'São Simão', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (522050, 'Serranópolis', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (522070, 'Sítio D`Abadia', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (522108, 'Teresina De Goiás', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (522130, 'Três Ranchos', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (522150, 'Turvânia', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (522157, 'Uirapuru', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (522170, 'Uruana', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (522185, 'Valparaíso De Goiás', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (522205, 'Vicentinópolis', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210005, 'Açailândia', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210015, 'Água Doce Do Maranhão', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210040, 'Altamira Do Maranhão', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210047, 'Alto Alegre Do Pindaré', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210060, 'Amarante Do Maranhão', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210083, 'Apicum Açu', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210090, 'Araioses', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210100, 'Arari', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210125, 'Bacabeira', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210130, 'Bacuri', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210135, 'Bacurituba', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210150, 'Barão De Grajaú', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210170, 'Barreirinhas', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210180, 'Benedito Leite', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210193, 'Bernardo Do Mearim', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210203, 'Bom Jesus Das Selvas', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210210, 'Brejo', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210230, 'Buriti Bravo', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210235, 'Buritirana', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210240, 'Cajapió', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210255, 'Campestre Do Maranhão', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210275, 'Capinzal Do Norte', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210300, 'Caxias', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210312, 'Central Do Maranhão', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210317, 'Centro Novo Do Maranhão', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210330, 'Codó', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210350, 'Colinas', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210370, 'Cururupu', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210380, 'Dom Pedro', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210400, 'Esperantinópolis', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210407, 'Feira Nova Do Maranhão', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210410, 'Fortaleza Dos Nogueiras', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210440, 'Gonçalves Dias', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210455, 'Governador Edison Lobão', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210462, 'Governador Luiz Rocha', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210470, 'Graça Aranha', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210500, 'Humberto De Campos', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210515, 'Igarapé Do Meio', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210535, 'Itaipava Do Grajaú', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210542, 'Itinga Do Maranhão', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210547, 'Jenipapo Dos Vieiras', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210565, 'Junco Do Maranhão', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210580, 'Lago Do Junco', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210592, 'Lagoa Do Mato', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210598, 'Lajeado Novo', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210620, 'Luís Domingues', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210632, 'Maracaçumé', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210637, 'Maranhãozinho', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210660, 'Matões', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210667, 'Milagres Do Maranhão', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210680, 'Mirinzal', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210700, 'Montes Altos', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210725, 'Nova Colinas', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210735, 'Nova Olinda Do Maranhão', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210745, 'Olinda Nova Do Maranhão', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210770, 'Paraibano', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210800, 'Pastos Bons', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210810, 'Paulo Ramos', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210825, 'Pedro Do Rosário', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210845, 'Peritoró', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210860, 'Pinheiro', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210880, 'Pirapemas', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210890, 'Poção De Pedras', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210910, 'Presidente Dutra', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210923, 'Presidente Médici', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210940, 'Primeira Cruz', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210950, 'Riachão', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210970, 'Sambaíba', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210975, 'Santa Filomena Do Maranhão', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211000, 'Santa Luzia', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211010, 'Santa Quitéria Do Maranhão', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211027, 'Santo Amaro Do Maranhão', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211040, 'São Benedito Do Rio Preto', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211065, 'São Domingos Do Azeitão', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211085, 'São Francisco Do Brejão', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211100, 'São João Batista', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211105, 'São João Do Paraíso', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211120, 'São José De Ribamar', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211140, 'São Luís Gonzaga Do Maranhão', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211157, 'São Pedro Dos Crentes', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211163, 'São Raimundo Do Doca Bezerra', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211172, 'Satubinha', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211176, 'Senador La Rocque', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211190, 'Sucupira Do Norte', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211200, 'Tasso Fragoso', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211223, 'Trizidela Do Vale', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211230, 'Tuntum', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211250, 'Tutóia', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211270, 'Vargem Grande', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211285, 'Vila Nova Dos Martírios', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211400, 'Zé Doca', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310020, 'Abaeté', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310040, 'Acaiaca', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310070, 'Água Comprida', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310090, 'Águas Formosas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310110, 'Aimorés', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310140, 'Albertina', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310160, 'Alfenas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310170, 'Almenara', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310190, 'Alpinópolis', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315350, 'Alto JequitibÁ', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310220, 'Alvarenga', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310240, 'Alvorada De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310280, 'Andrelândia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310290, 'Antônio Carlos', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310310, 'Antônio Prado De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310340, 'Araçuaí', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310370, 'Araponga', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310380, 'ArapuÁ', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310400, 'AraxÁ', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310420, 'Arcos', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310445, 'Aricanduva', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310460, 'Astolfo Dutra', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310470, 'Ataléia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310500, 'Baldim', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310520, 'Bandeira', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310540, 'Barão De Cocais', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310570, 'Barra Longa', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310600, 'Bela Vista De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310620, 'Belo Horizonte', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310650, 'Berilo', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310660, 'Bertópolis', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310680, 'Bias Fortes', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310710, 'Boa Esperança', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310730, 'Bocaiúva', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310750, 'Bom Jardim De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310780, 'Bom Jesus Do Galho', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310800, 'Bom Sucesso', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310820, 'Bonfinópolis De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310840, 'Botelhos', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310870, 'BrÁs Pires', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310860, 'Brasília De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310900, 'Brumadinho', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310920, 'Buenópolis', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310940, 'Buritizeiro', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310950, 'Cabo Verde', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310970, 'Cachoeira De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310980, 'Cachoeira Dourada', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311010, 'Caiana', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311030, 'Caldas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311060, 'Cambuí', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311080, 'CampanÁrio', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311100, 'Campestre', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311115, 'Campo Azul', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311130, 'Campo Do Meio', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311160, 'Campos Gerais', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311170, 'Canaã', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311205, 'Cantagalo', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311220, 'Capela Nova', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311240, 'Capetinga', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311260, 'Capinópolis', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311270, 'Capitão Enéas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311300, 'Caraí', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311320, 'Carandaí', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311340, 'Caratinga', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311370, 'Carlos Chagas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311390, 'Carmo Da Cachoeira', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311410, 'Carmo De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311440, 'Carmo Do Rio Claro', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311460, 'Carrancas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311480, 'Carvalhos', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311500, 'Cascalho Rico', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311535, 'Catas Altas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311540, 'Catas Altas Da Noruega', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311550, 'Caxambu', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311580, 'Centralina', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311600, 'Chalé', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311615, 'Chapada Gaúcha', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311620, 'Chiador', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311640, 'Claraval', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311660, 'ClÁudio', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311680, 'Coluna', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311700, 'Comercinho', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311520, 'Conceição Da Barra De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311740, 'Conceição De Ipanema', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311770, 'Conceição Do Rio Verde', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311783, 'Cônego Marinho', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311800, 'Congonhas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311820, 'Conquista', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311840, 'Conselheiro Pena', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311870, 'Coqueiral', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311890, 'Cordisburgo', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311920, 'Coroaci', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311940, 'Coronel Fabriciano', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311960, 'Coronel Pacheco', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311990, 'Córrego Do Bom Jesus', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312000, 'Córrego Novo', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312020, 'Cristais', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312040, 'Cristiano Otoni', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312060, 'Crucilândia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312083, 'Cuparaque', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312090, 'Curvelo', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312110, 'Delfim Moreira', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312130, 'Descoberto', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312150, 'Desterro Do Melo', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312170, 'Diogo De Vasconcelos', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312200, 'Divino', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312220, 'Divinolândia De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312240, 'Divisa Nova', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312250, 'Dom Cavati', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312270, 'Dom Silvério', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312290, 'Dona Eusébia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312320, 'Dores Do IndaiÁ', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312350, 'Douradoquara', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312360, 'Elói Mendes', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312380, 'Engenheiro Navarro', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312400, 'ErvÁlia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312420, 'Espera Feliz', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312440, 'Espírito Santo Do Dourado', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312470, 'Estrela Do IndaiÁ', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312490, 'Eugenópolis', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312520, 'Fama', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312540, 'Felício Dos Santos', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312580, 'Fernandes Tourinho', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312595, 'Fervedouro', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312610, 'Formiga', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312640, 'Fortuna De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312660, 'Francisco Dumont', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312675, 'Franciscópolis', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312695, 'Frei Lagonegro', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312700, 'Fronteira', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312705, 'Fronteira Dos Vales', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312720, 'Funilândia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312733, 'Gameleiras', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312738, 'GoianÁ', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312750, 'Gonzaga', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312770, 'Governador Valadares', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312800, 'Guanhães', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312820, 'Guaraciaba', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312830, 'Guaranésia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312860, 'Guarda Mor', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312880, 'Guidoval', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312900, 'Guiricema', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312920, 'Heliodora', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312950, 'IbiÁ', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312965, 'Ibiracatu', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312980, 'Ibirité', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313000, 'Ibituruna', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313020, 'Igaratinga', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313040, 'Ijaci', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313055, 'Imbé De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313070, 'Indianópolis', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313090, 'Inhapim', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313110, 'Inimutaba', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313130, 'Ipatinga', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313150, 'Ipuiúna', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313170, 'Itabira', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313200, 'Itacambira', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313220, 'Itaguara', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313240, 'ItajubÁ', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313260, 'Itamarati De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313280, 'Itambé Do Mato Dentro', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313310, 'Itanhandu', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313340, 'Itapagipe', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313360, 'Itapeva', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313375, 'Itaú De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313400, 'Itinga', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313420, 'Ituiutaba', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313440, 'Iturama', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313460, 'Jaboticatubas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313490, 'Jacutinga', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313505, 'Jaíba', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313520, 'JanuÁria', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313535, 'Japonvar', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313545, 'Jenipapo De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313570, 'JequitibÁ', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313580, 'Jequitinhonha', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313610, 'Joanésia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313630, 'João Pinheiro', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313652, 'José Gonçalves De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313657, 'Josenópolis', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313680, 'Juramento', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313695, 'Juvenília', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313710, 'Lagamar', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313740, 'Lagoa Dourada', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313753, 'Lagoa Grande', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313780, 'Lambari', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313790, 'Lamim', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313810, 'Lassance', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313830, 'Leandro Ferreira', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313840, 'Leopoldina', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313862, 'Limeira Do Oeste', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313867, 'Luisburgo', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313870, 'LuminÁrias', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313900, 'Machado', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313920, 'Malacacheta', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313930, 'Manga', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313960, 'Mantena', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313970, 'Maravilhas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314000, 'Mariana', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314015, 'MÁrio Campos', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314040, 'Marmelópolis', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314053, 'Martins Soares', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314060, 'Materlândia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314080, 'Matias Barbosa', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314090, 'Matipó', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314120, 'Matutina', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314140, 'Medina', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314160, 'Mercês', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314190, 'Minduri', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314210, 'Miradouro', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314225, 'Miravânia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314240, 'Moema', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314260, 'Monsenhor Paulo', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314290, 'Monte Azul', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314310, 'Monte Carmelo', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314320, 'Monte Santo De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314345, 'Montezuma', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314360, 'Morro Da Garça', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314390, 'Muriaé', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314410, 'Muzambinho', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314435, 'Naque', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314440, 'Natércia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314460, 'Nepomuceno', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314467, 'Nova Belém', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314490, 'Nova Módica', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314505, 'Nova Porteirinha', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314520, 'Nova Serrana', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314535, 'Novo Oriente De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314540, 'Olaria', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314550, 'Olímpio Noronha', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314580, 'Onça De Pitangui', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314587, 'Orizânia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314610, 'Ouro Preto', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314625, 'Padre Carvalho', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314655, 'Pai Pedro', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314660, 'Paiva', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314675, 'Palmópolis', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314710, 'ParÁ De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314730, 'Paraisópolis', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314760, 'Passa Quatro', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314780, 'Passa Vinte', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314795, 'Patis', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314800, 'Patos De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314820, 'Patrocínio Do Muriaé', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314840, 'Paulistas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314870, 'Pedra Azul', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314880, 'Pedra Do Anta', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314900, 'Pedra Dourada', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314920, 'Pedrinópolis', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314940, 'Pedro Teixeira', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314970, 'Perdigão', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314990, 'Perdões', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315000, 'Pescador', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315015, 'Piedade De Caratinga', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315040, 'Piedade Dos Gerais', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315053, 'Pingo D`Água', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315070, 'Pirajuba', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315090, 'Piranguçu', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315120, 'Pirapora', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315140, 'Pitangui', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315160, 'Planura', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315180, 'Poços De Caldas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315210, 'Ponte Nova', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315217, 'Ponto Dos Volantes', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315240, 'Poté', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315260, 'Pouso Alto', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315280, 'Prata', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315300, 'Pratinha', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315320, 'Presidente Juscelino', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315360, 'Prudente De Morais', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315390, 'Raposos', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315410, 'Recreio', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315420, 'Resende Costa', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315445, 'Riachinho', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315460, 'Ribeirão Das Neves', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315480, 'Rio Acima', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315500, 'Rio Doce', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315530, 'Rio Manso', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315550, 'Rio Paranaíba', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315580, 'Rio Pomba', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315600, 'Rio Vermelho', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315620, 'Rochedo De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315645, 'RosÁrio Da Limeira', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315660, 'Rubim', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315680, 'Sabinópolis', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315710, 'Salto Da Divisa', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315725, 'Santa BÁrbara Do Leste', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315733, 'Santa Cruz De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315740, 'Santa Cruz Do Escalvado', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315765, 'Santa Helena De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315790, 'Santa Margarida', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315810, 'Santa Maria Do Salto', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315920, 'Santa Rita De Caldas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315935, 'Santa Rita De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315960, 'Santa Rita Do Sapucaí', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315970, 'Santa Rosa Da Serra', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315980, 'Santa Vitória', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315840, 'Santana De Cataguases', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315870, 'Santana Do Garambéu', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315890, 'Santana Do Manhuaçu', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315910, 'Santana Dos Montes', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316000, 'Santo Antônio Do Aventureiro', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316030, 'Santo Antônio Do Jacinto', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316045, 'Santo Antônio Do Retiro', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316070, 'Santos Dumont', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316090, 'São BrÁs Do Suaçuí', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316105, 'São Félix De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316120, 'São Francisco De Paula', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316140, 'São Francisco Do Glória', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316165, 'São Geraldo Do Baixio', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316190, 'São Gonçalo Do Rio Abaixo', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316200, 'São Gonçalo Do Sapucaí', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316225, 'São João Da Lagoa', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316240, 'São João Da Ponte', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316255, 'São João Do Manhuaçu', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316260, 'São João Do Oriente', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316280, 'São João Evangelista', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316292, 'São Joaquim De Bicas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316300, 'São José Da Safira', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316320, 'São José Do Alegre', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316350, 'São José Do Jacuri', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316370, 'São Lourenço', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316410, 'São Pedro Do Suaçuí', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316430, 'São Roque De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316443, 'São Sebastião Da Vargem Alegre', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316460, 'São Sebastião Do Oeste', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316480, 'São Sebastião Do Rio Preto', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316510, 'São TomÁs De Aquino', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316540, 'Sapucaí Mirim', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316556, 'Sem Peixe', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316560, 'Senador Cortes', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316580, 'Senador José Bento', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316610, 'Senhora Do Porto', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316630, 'Sericita', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316660, 'Serra Da Saudade', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316670, 'Serra Dos Aimorés', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316695, 'Serranópolis De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316720, 'Sete Lagoas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316740, 'Silvianópolis', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316760, 'Simonésia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316780, 'Soledade De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316805, 'Taparuba', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316810, 'Tapira', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316830, 'Taquaraçu De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316860, 'Teófilo Otoni', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316880, 'Tiradentes', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316905, 'Tocos Do Moji', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316920, 'Tombos', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316935, 'Três Marias', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316960, 'Tupaciguara', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316980, 'Turvolândia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (317005, 'Ubaporanga', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (317020, 'Uberlândia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (317040, 'Unaí', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (317050, 'Urucânia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (317057, 'Vargem Alegre', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (317065, 'Vargem Grande Do Rio Pardo', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (317080, 'VÁrzea Da Palma', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (317103, 'Verdelândia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (317110, 'Veríssimo', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (317120, 'Vespasiano', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (317160, 'Virgem Da Lapa', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (317180, 'Virginópolis', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (317200, 'Visconde Do Rio Branco', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500020, 'Água Clara', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500060, 'Amambai', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500085, 'Angélica', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500100, 'Aparecida Do Taboado', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500124, 'Aral Moreira', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500200, 'Batayporã', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500215, 'Bodoquena', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500230, 'Brasilândia', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500270, 'Campo Grande', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500290, 'Cassilândia', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500315, 'Coronel Sapucaia', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500325, 'Costa Rica', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500348, 'Dois Irmãos Do Buriti', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500370, 'Dourados', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500380, 'Fátima Do Sul', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500410, 'Guia Lopes Da Laguna', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500450, 'Itaporã', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500470, 'Ivinhema', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500490, 'Jaraguari', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500510, 'Jateí', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500525, 'Laguna Carapã', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500560, 'Miranda', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500570, 'Naviraí', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500600, 'Nova Alvorada Do Sul', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500630, 'Paranaíba', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500640, 'Pedro Gomes', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500690, 'Porto Murtinho', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500730, 'Rio Negro', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500750, 'Rochedo', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500769, 'São Gabriel Do Oeste', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500790, 'Sidrolândia', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500795, 'Tacuru', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500797, 'Taquarussu', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500830, 'Três Lagoas', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510010, 'Acorizal', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510025, 'Alta Floresta', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510040, 'Alto Garças', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510060, 'Alto Taquari', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510120, 'Araguainha', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510130, 'Arenápolis', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510160, 'Barão De Melgaço', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510180, 'Barra Do Garças', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510250, 'Cáceres', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510263, 'Campo Novo Do Parecis', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510269, 'Canabrava Do Norte', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510279, 'Carlinda', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510300, 'Chapada Dos Guimarães', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510320, 'Colíder', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510335, 'Confresa', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510336, 'Conquista D`Oeste', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510343, 'Curvelândia', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510350, 'Diamantino', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510370, 'Feliz Natal', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510390, 'General Carneiro', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510410, 'Guarantã Do Norte', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510450, 'Indiavaí', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510455, 'Itaúba', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510480, 'Jaciara', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510500, 'Jauru', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510517, 'Juruena', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510523, 'Lambari D`Oeste', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510530, 'Luciára', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510562, 'Mirassol D`Oeste', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510600, 'Nortelândia', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510615, 'Nova Bandeirantes', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510880, 'Nova Guarita', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510885, 'Nova Marilândia', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510895, 'Nova Monte Verde', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510623, 'Nova Olímpia', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510624, 'Nova Ubiratã', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510627, 'Novo Horizonte Do Norte', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510628, 'Novo São Joaquim', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510630, 'Paranatinga', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510642, 'Peixoto De Azevedo', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510665, 'Pontal Do Araguaia', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510675, 'Pontes E Lacerda', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510680, 'Porto Dos Gaúchos', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510700, 'Poxoréo', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510706, 'Querência', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510718, 'Ribeirão Cascalheira', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510757, 'Rondolândia', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510770, 'Rosário Oeste', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510774, 'Santa Cruz Do Xingu', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510777, 'Santa Terezinha', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510779, 'Santo Antônio Do Leste', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510785, 'São Félix Do Araguaia', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510729, 'São José Do Povo', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510730, 'São José Do Rio Claro', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510710, 'São José Dos Quatro Marcos', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510790, 'Sinop', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510794, 'Tabaporã', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510800, 'Tapurah', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510820, 'Torixoréu', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510835, 'Vale De São Domingos', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510550, 'Vila Bela Da Santíssima Trindade', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150010, 'Abaetetuba', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150020, 'Acará', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150040, 'Alenquer', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150060, 'Altamira', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150080, 'Ananindeua', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150090, 'Augusto Corrêa', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150110, 'Bagre', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150125, 'Bannach', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150145, 'Belterra', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150157, 'Bom Jesus Do Tocantins', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150170, 'Bragança', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150175, 'Brejo Grande Do Araguaia', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150190, 'Bujaru', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150195, 'Cachoeira Do Piriá', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150220, 'Capanema', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150240, 'Castanhal', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150260, 'Colares', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150276, 'Cumaru Do Norte', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150280, 'Curralinho', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150290, 'Curuçá', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150295, 'Eldorado Dos Carajás', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150307, 'Garrafão Do Norte', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150320, 'Igarapé Açu', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150340, 'Inhangapi', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150350, 'Irituia', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150375, 'Jacareacanga', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150390, 'Juruti', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150405, 'Mãe Do Rio', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150420, 'Marabá', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150442, 'Marituba', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150450, 'Melgaço', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150470, 'Moju', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150495, 'Nova Esperança Do Piriá', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150500, 'Nova Timboteua', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150506, 'Novo Repartimento', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150530, 'Oriximiná', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150543, 'Ourilândia Do Norte', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150550, 'Paragominas', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150555, 'Pau D`Arco', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150565, 'Placas', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150580, 'Portel', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150600, 'Prainha', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150611, 'Quatipuru', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150618, 'Rondon Do Pará', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150620, 'Salinópolis', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150635, 'Santa Bárbara Do Pará', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150640, 'Santa Cruz Do Arari', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150650, 'Santa Isabel Do Pará', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150660, 'Santa Maria Do Pará', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150690, 'Santarém Novo', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150710, 'São Caetano De Odivelas', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150720, 'São Domingos Do Capim', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150745, 'São Geraldo Do Araguaia', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150747, 'São João De Pirabas', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150770, 'São Sebastião Da Boa Vista', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150790, 'Soure', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150796, 'Terra Alta', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150803, 'Tracuateua', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150808, 'Tucumã', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150812, 'Ulianópolis', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150830, 'Viseu', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150840, 'Xinguara', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250020, 'Aguiar', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250040, 'Alagoa Nova', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250053, 'Alcantil', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250073, 'Amparo', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250080, 'Araçagi', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250100, 'Araruna', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250115, 'Areia De Baraúnas', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250135, 'Assunção', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250150, 'Bananeiras', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250160, 'Barra De Santa Rosa', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250180, 'Bayeux', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250200, 'Belém Do Brejo Do Cruz', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250215, 'Boa Vista', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250230, 'Bom Sucesso', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250250, 'Boqueirão', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250290, 'Brejo Dos Santos', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250310, 'Cabaceiras', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250330, 'Cachoeira Dos Índios', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250355, 'Cacimbas', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250370, 'Cajazeiras', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250380, 'Caldas Brandão', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250403, 'Capim', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250410, 'Carrapateira', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250420, 'Catingueira', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250440, 'Conceição', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250460, 'Conde', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250480, 'Coremas', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250490, 'Cruz Do Espírito Santo', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250523, 'Cuité De Mamanguape', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250527, 'Curral De Cima', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250540, 'Desterro', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250580, 'Duas Estradas', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250600, 'Esperança', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250620, 'Frei Martinho', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250640, 'Gurinhém', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250660, 'Ibiara', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250670, 'Imaculada', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250700, 'Itaporanga', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250710, 'Itapororoca', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250720, 'Itatuba', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250740, 'Jericó', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251365, 'Joca Claudino', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250780, 'Junco Do Seridó', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250810, 'Lagoa', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250830, 'Lagoa Seca', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250850, 'Livramento', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250860, 'Lucena', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250890, 'Mamanguape', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250905, 'Marcação', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250915, 'Marizópolis', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250933, 'Matinhas', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250939, 'Maturéia', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250950, 'Montadas', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250980, 'Mulungu', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251000, 'Nazarezinho', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251020, 'Nova Olinda', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251040, 'Olho D`Água', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251060, 'Ouro Velho', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251080, 'Patos', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251100, 'Pedra Branca', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251120, 'Pedras De Fogo', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251140, 'Picuí', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251160, 'Pilões', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251180, 'Pirpirituba', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251203, 'Poço Dantas', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251210, 'Pombal', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251396, 'São Domingos', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251400, 'São João Do Cariri', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251420, 'São José Da Lagoa Tapada', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251440, 'São José De Espinharas', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251460, 'São José Do Bonfim', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251480, 'São José Dos Cordeiros', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251500, 'São Miguel De Taipu', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251520, 'São Sebastião Do Umbuzeiro', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251550, 'Serra Branca', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251580, 'Serra Redonda', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251593, 'Sertãozinho', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251610, 'Soledade', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251620, 'Sousa', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251640, 'Tacima', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251670, 'Teixeira', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251675, 'Tenório', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251690, 'Uiraúna', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251720, 'Vieirópolis', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251740, 'Zabelê', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260010, 'Afogados Da Ingazeira', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260040, 'Água Preta', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260060, 'Alagoinha', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260080, 'Altinho', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260105, 'Araçoiaba', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260120, 'Arcoverde', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260140, 'Barreiros', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260160, 'Belém De São Francisco', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260190, 'Bezerros', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260210, 'Bom Conselho', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260240, 'Brejão', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260260, 'Brejo Da Madre De Deus', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260290, 'Cabo De Santo Agostinho', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260310, 'Cachoeirinha', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260340, 'Calumbi', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260350, 'Camocim De São Félix', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260380, 'Capoeiras', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260392, 'Carnaubeira Da Penha', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260415, 'Casinhas', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260430, 'Cedro', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260450, 'Chã Grande', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260470, 'Correntes', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260500, 'Cupira', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260515, 'Dormentes', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260530, 'Exu', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260545, 'Fernando De Noronha', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260570, 'Floresta', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260590, 'Gameleira', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260610, 'Glória Do Goitá', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260640, 'Gravatá', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260660, 'Ibimirim', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260680, 'Igarassu', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260760, 'Ilha De Itamaracá', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260805, 'Jatobá', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260820, 'Joaquim Nabuco', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260840, 'Jurema', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260850, 'Lagoa Do Itaenga', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260870, 'Lagoa Dos Gatos', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260890, 'Limoeiro', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260910, 'Machados', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260920, 'Maraial', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261430, 'Moreilândia', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260960, 'Olinda', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260980, 'Orocó', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261010, 'Palmeirina', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261030, 'Paranatama', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261050, 'Passira', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261070, 'Paulista', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261080, 'Pedra', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261110, 'Petrolina', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261130, 'Pombos', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261150, 'Quipapá', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261170, 'Riacho Das Almas', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261190, 'Rio Formoso', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261210, 'Salgadinho', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261240, 'Sanharó', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261247, 'Santa Cruz Da Baixa Verde', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261255, 'Santa Filomena', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261280, 'Santa Terezinha', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261300, 'São Bento Do Una', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261330, 'São Joaquim Do Monte', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261350, 'São José Do Belmonte', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261370, 'São Lourenço Da Mata', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261400, 'Serrita', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261420, 'Sirinhaém', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261460, 'Tabira', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261480, 'Tacaratu', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261500, 'Taquaritinga Do Norte', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261530, 'Timbaúba', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261550, 'Tracunhaém', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261570, 'Triunfo', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261600, 'Venturosa', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261618, 'Vertente Do Lério', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261630, 'Vicência', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220005, 'Acauã', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220020, 'Água Branca', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220027, 'Alegrete Do Piauí', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220045, 'Alvorada Do Gurguéia', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220060, 'Angical Do Piauí', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220080, 'Antônio Almeida', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220100, 'Arraial', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220115, 'Baixa Grande Do Ribeiro', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220120, 'Barras', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220140, 'Barro Duro', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220155, 'Bela Vista Do Piauí', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220170, 'Bertolínia', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220180, 'Bocaina', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220191, 'Bom Princípio Do Piauí', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220194, 'Boqueirão Do Piauí', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220200, 'Buriti Dos Lopes', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220205, 'Cabeceiras Do Piauí', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220209, 'Caldeirão Grande Do Piauí', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220213, 'Campo Grande Do Piauí', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220225, 'Canavieira', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220230, 'Canto Do Buriti', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220250, 'Caracol', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220255, 'Caridade Do Piauí', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220270, 'Cocal', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220272, 'Cocal Dos Alves', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220275, 'Colônia Do Gurguéia', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220277, 'Colônia Do Piauí', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220280, 'Conceição Do Canindé', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220300, 'Cristalândia Do Piauí', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220320, 'Curimatá', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220327, 'Curral Novo Do Piauí', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220335, 'Dirceu Arcoverde', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220345, 'Dom Inocêncio', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220350, 'Elesbão Veloso', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220375, 'Fartura Do Piauí', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220385, 'Floresta Do Piauí', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220400, 'Francinópolis', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220420, 'Francisco Santos', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220435, 'Geminiano', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220455, 'Guaribas', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220465, 'Ilha Grande', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220480, 'Ipiranga Do Piauí', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220500, 'Itainópolis', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220520, 'Jaicós', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220527, 'Jatobá Do Piauí', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220540, 'Joaquim Pires', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220550, 'José De Freitas', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220552, 'Júlio Borges', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220557, 'Lagoa De São Francisco', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220558, 'Lagoa Do Piauí', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220560, 'Landri Sales', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220580, 'Luzilândia', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220590, 'Manoel Emídio', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220605, 'Massapê Do Piauí', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220620, 'Miguel Alves', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220635, 'Milton Brandão', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220660, 'Monte Alegre Do Piauí', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220667, 'Morro Do Chapéu Do Piauí', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220672, 'Nazária', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220680, 'Nossa Senhora Dos Remédios', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220695, 'Novo Santo Antônio', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220710, 'Olho D`Água Do Piauí', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220735, 'Pajeú Do Piauí', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220755, 'Paquetá', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220770, 'Parnaíba', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220777, 'Patos Do Piauí', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220780, 'Paulistana', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220793, 'Pedro Laurentino', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220810, 'Pimenteiras', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220830, 'Piracuruca', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220855, 'Porto Alegre Do Piauí', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220865, 'Queimada Nova', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220880, 'Regeneração', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220890, 'Ribeiro Gonçalves', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220910, 'Santa Cruz Do Piauí', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220930, 'Santa Luz', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220935, 'Santana Do Piauí', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220945, 'Santo Antônio Dos Milagres', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220950, 'Santo Inácio Do Piauí', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220960, 'São Félix Do Piauí', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220970, 'São Francisco Do Piauí', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220980, 'São Gonçalo Do Piauí', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220990, 'São João Da Serra', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220997, 'São João Do Arraial', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (221010, 'São José Do Peixe', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (221035, 'São Lourenço Do Piauí', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (221038, 'São Miguel Da Baixa Grande', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (221050, 'São Pedro Do Piauí', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (221062, 'Sebastião Barros', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (221070, 'Simões', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (221090, 'Socorro Do Piauí', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (221095, 'Tamboril Do Piauí', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (221110, 'União', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (221130, 'Valença Do Piauí', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (221140, 'Várzea Grande', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (221170, 'Wall Ferraz', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410020, 'Adrianópolis', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410040, 'Almirante Tamandaré', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410060, 'Alto Paraná', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410080, 'Alvorada Do Sul', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410100, 'Ampére', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410110, 'Andirá', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410130, 'Antônio Olinto', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410150, 'Arapongas', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410165, 'Arapuã', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410185, 'Ariranha Do Ivaí', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410200, 'Assis Chateaubriand', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410220, 'Atalaia', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410250, 'Barbosa Ferraz', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410260, 'Barracão', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410280, 'Bela Vista Do Paraíso', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410302, 'Boa Esperança Do Iguaçu', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410305, 'Boa Vista Da Aparecida', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410320, 'Bom Sucesso', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410330, 'Borrazópolis', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410340, 'Cafeara', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410347, 'Cafezal Do Sul', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410360, 'Cambará', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410390, 'Campina Da Lagoa', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410400, 'Campina Grande Do Sul', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410410, 'Campo Do Tenente', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410430, 'Campo Mourão', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410442, 'Candói', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410460, 'Capitão Leônidas Marques', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410470, 'Carlópolis', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410500, 'Catanduvas', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410520, 'Cerro Azul', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410540, 'Chopinzinho', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410560, 'Cidade Gaúcha', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410600, 'Congonhinhas', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410610, 'Conselheiro Mairinck', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410630, 'Corbélia', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410645, 'Coronel Domingos Soares', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410680, 'Cruz Machado', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410660, 'Cruzeiro Do Oeste', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410690, 'Curitiba', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410715, 'Diamante D`Oeste', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410712, 'Diamante Do Sul', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410730, 'Doutor Camargo', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410740, 'Enéas Marques', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410752, 'Esperança Nova', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410755, 'Farol', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410765, 'Fazenda Rio Grande', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410775, 'Figueira', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410780, 'Floraí', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410800, 'Florestópolis', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410820, 'Formosa Do Oeste', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410832, 'Francisco Alves', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410850, 'General Carneiro', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410865, 'Goioxim', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410880, 'Guaíra', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410895, 'Guamiranga', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410920, 'Guaraci', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410940, 'Guarapuava', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410960, 'Guaratuba', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410970, 'Ibaiti', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410990, 'Icaraíma', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411005, 'Iguatu', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411010, 'Imbituva', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411030, 'Inajá', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411060, 'Iporã', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411070, 'Irati', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411090, 'Itaguajé', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411100, 'Itambaracá', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411120, 'Itapejara D`Oeste', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411140, 'Ivaí', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411155, 'Ivaté', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411180, 'Jacarezinho', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411200, 'Jaguariaíva', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411220, 'Janiópolis', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411240, 'Japurá', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411260, 'Jardim Olinda', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411280, 'Joaquim Távora', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411295, 'Juranda', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411320, 'Lapa', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411330, 'Laranjeiras Do Sul', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411342, 'Lidianópolis', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411360, 'Lobato', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411373, 'Luiziana', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411380, 'Lupionópolis', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411410, 'Mandaguaçu', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411430, 'Mandirituba', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411440, 'Mangueirinha', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411460, 'Marechal Cândido Rondon', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411490, 'Marilândia Do Sul', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411510, 'Mariluz', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411520, 'Maringá', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411535, 'Maripá', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411545, 'Marquinho', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411570, 'Matinhos', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411575, 'Mauá Da Serra', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411585, 'Mercedes', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411605, 'Missal', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411620, 'Morretes', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411640, 'Nossa Senhora Das Graças', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411660, 'Nova América Da Colina', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411690, 'Nova Esperança', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411700, 'Nova Fátima', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411710, 'Nova Londrina', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411721, 'Nova Santa Bárbara', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411729, 'Novo Itacolomi', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411740, 'Ourizona', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411750, 'Paiçandu', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411780, 'Palmital', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411800, 'Paraíso Do Norte', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411820, 'Paranaguá', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411845, 'Pato Bragado', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411860, 'Paula Freitas', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411880, 'Peabiru', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411900, 'Pérola D`Oeste', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411915, 'Pinhais', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411920, 'Pinhalão', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411950, 'Piraquara', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411965, 'Pitangueiras', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411980, 'Planalto', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412000, 'Porecatu', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412015, 'Porto Barreiro', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412030, 'Porto Vitória', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412040, 'Presidente Castelo Branco', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412060, 'Prudentópolis', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412070, 'Quatiguá', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412085, 'Quatro Pontes', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412110, 'Quinta Do Sol', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412125, 'Ramilândia', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412135, 'Rancho Alegre D`Oeste', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412160, 'Renascença', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412175, 'Reserva Do Iguaçu', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412190, 'Ribeirão Do Pinhal', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412215, 'Rio Bonito Do Iguaçu', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412230, 'Rio Negro', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412250, 'Roncador', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412265, 'Rosário Do Ivaí', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412290, 'Salto Do Itararé', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412310, 'Santa Amélia', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412330, 'Santa Cruz De Monte Castelo', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412360, 'Santa Inês', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412380, 'Santa Izabel Do Oeste', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412390, 'Santa Mariana', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412402, 'Santa Tereza Do Oeste', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412400, 'Santana Do Itararé', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412410, 'Santo Antônio Da Platina', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412440, 'Santo Antônio Do Sudoeste', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412460, 'São Carlos Do Ivaí', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412490, 'São João Do Caiuá', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412520, 'São Jorge D`Oeste', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412535, 'São Jorge Do Patrocínio', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412550, 'São José Dos Pinhais', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412570, 'São Miguel Do Iguaçu', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412580, 'São Pedro Do Ivaí', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412600, 'São Sebastião Da Amoreira', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412625, 'Sarandi', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412635, 'Serranópolis Do Iguaçu', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412650, 'Sertanópolis', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412667, 'Tamarana', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412680, 'Tapejara', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412700, 'Teixeira Soares', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412730, 'Terra Rica', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412750, 'Tibagi', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412770, 'Toledo', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412785, 'Três Barras Do Paraná', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412795, 'Tupãssi', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412800, 'Ubiratã', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412820, 'União Da Vitória', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412853, 'Ventania', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412860, 'Verê', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412850, 'Wenceslau Braz', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330010, 'Angra Dos Reis', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330022, 'Areal', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330025, 'Arraial Do Cabo', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330040, 'Barra Mansa', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330060, 'Bom Jesus Do Itabapoana', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330080, 'Cachoeiras De Macacu', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330110, 'Cantagalo', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330115, 'Cardoso Moreira', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330095, 'Comendador Levy Gasparian', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330150, 'Cordeiro', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330170, 'Duque De Caxias', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330187, 'Iguaba Grande', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330205, 'Italva', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330220, 'Itaperuna', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330227, 'Japeri', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330245, 'Macuco', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330260, 'Mangaratiba', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330280, 'Mendes', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330290, 'Miguel Pereira', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330320, 'Nilópolis', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330340, 'Nova Friburgo', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330370, 'Paraíba Do Sul', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330385, 'Paty Do Alferes', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330395, 'Pinheiral', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330411, 'Porto Real', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330412, 'Quatis', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330414, 'Queimados', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330420, 'Resende', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330440, 'Rio Claro', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330452, 'Rio Das Ostras', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330470, 'Santo Antônio De Pádua', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330475, 'São Francisco De Itabapoana', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330510, 'São João De Meriti', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330520, 'São Pedro Da Aldeia', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330550, 'Saquarema', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330560, 'Silva Jardim', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330580, 'Teresópolis', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330600, 'Três Rios', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330620, 'Vassouras', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330630, 'Volta Redonda', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240030, 'Afonso Bezerra', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240060, 'Almino Afonso', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240080, 'Angicos', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240100, 'Apodi', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240120, 'Arês', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240140, 'Baía Formosa', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240160, 'Bento Fernandes', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240170, 'Bom Jesus', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240185, 'Caiçara Do Norte', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240210, 'Campo Redondo', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240230, 'Caraúbas', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240250, 'Carnaubais', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240280, 'Coronel Ezequiel', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240300, 'Cruzeta', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240320, 'Doutor Severiano', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240350, 'Espírito Santo', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240370, 'Felipe Guerra', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240380, 'Florânia', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240400, 'Frutuoso Gomes', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240430, 'Governador Dix Sept Rosado', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240460, 'Ielmo Marinho', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240480, 'Ipueira', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240490, 'Itaú', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240520, 'Janduís', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240540, 'Japi', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240560, 'Jardim De Piranhas', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240580, 'João Câmara', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240610, 'Jucurutu', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240620, 'Lagoa D`Anta', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240650, 'Lagoa Nova', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240670, 'Lajes', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240690, 'Lucrécia', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240710, 'Macaíba', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240730, 'Marcelino Vieira', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240750, 'Maxaranguape', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240770, 'Montanhas', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240790, 'Monte Das Gameleiras', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240820, 'Nísia Floresta', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240840, 'Olho D`Água Do Borges', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240870, 'Paraú', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240880, 'Parazinho', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240325, 'Parnamirim', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240920, 'Passagem', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240940, 'Pau Dos Ferros', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240970, 'Pedro Avelino', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241000, 'Pilões', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241010, 'Poço Branco', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241030, 'Presidente Juscelino', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241060, 'Rafael Godeiro', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241080, 'Riacho De Santana', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241100, 'Rodolfo Fernandes', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241120, 'Santa Cruz', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241140, 'Santana Do Matos', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241150, 'Santo Antônio', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241180, 'São Fernando', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241200, 'São Gonçalo Do Amarante', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241230, 'São José Do Campestre', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241250, 'São Miguel', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241260, 'São Paulo Do Potengi', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241290, 'São Tomé', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241310, 'Senador Elói De Souza', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241335, 'Serra Do Mel', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241350, 'Serrinha', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241360, 'Severiano Melo', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241390, 'Taipu', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241410, 'Tenente Ananias', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241105, 'Tibau', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241430, 'Timbaúba Dos Batistas', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241450, 'Umarizal', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241470, 'Várzea', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241490, 'Viçosa', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110001, 'Alta Floresta D`Oeste', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110040, 'Alto Paraíso', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110045, 'Buritis', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110060, 'Cacaulândia', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110070, 'Campo Novo De Rondônia', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110005, 'Cerejeiras', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110006, 'Colorado Do Oeste', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110094, 'Cujubim', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110100, 'Governador Jorge Teixeira', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110011, 'Jaru', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110013, 'Machadinho D`Oeste', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110130, 'Mirante Da Serra', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110033, 'Nova Mamoré', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110050, 'Novo Horizonte Do Oeste', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110018, 'Pimenta Bueno', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110020, 'Porto Velho', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110147, 'Primavera De Rondônia', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110029, 'Santa Luzia D`Oeste', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110149, 'São Francisco Do Guaporé', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110155, 'Teixeirópolis', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110175, 'Vale Do Anari', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110180, 'Vale Do Paraíso', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (140002, 'Amajari', '2017-09-10', 14, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (140015, 'Bonfim', '2017-09-10', 14, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (140020, 'Caracaraí', '2017-09-10', 14, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (140028, 'Iracema', '2017-09-10', 14, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (140045, 'Pacaraima', '2017-09-10', 14, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (140050, 'São João Da Baliza', '2017-09-10', 14, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430003, 'Aceguá', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430010, 'Agudo', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430030, 'Alecrim', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430045, 'Alegria', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430050, 'Alpestre', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430057, 'Alto Feliz', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430957, 'Herveiras', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430064, 'Ametista Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430070, 'Anta Gorda', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430085, 'Arambaré', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430100, 'Arroio Do Meio', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430105, 'Arroio Do Sal', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430130, 'Arroio Grande', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430150, 'Augusto Pestana', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430163, 'Balneário Pinhal', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430170, 'Barão De Cotegipe', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430185, 'Barra Do Guarita', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430192, 'Barra Do Rio Azul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430200, 'Barros Cassal', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430210, 'Bento Gonçalves', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430220, 'Boa Vista Do Buricá', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430225, 'Boa Vista Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430235, 'Bom Princípio', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430245, 'Boqueirão Do Leão', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430258, 'Bozano', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430270, 'Butiá', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430290, 'Cacequi', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430310, 'Cachoeirinha', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430340, 'Caiçara', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430355, 'Camargo', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430367, 'Campestre Da Serra', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430380, 'Campinas Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430410, 'Campos Borges', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430430, 'Cândido Godói', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430450, 'Canguçu', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430461, 'Canudos Do Vale', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430463, 'Capão Da Canoa', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430468, 'Capela De Santana', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430467, 'Capivari Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430480, 'Carlos Barbosa', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430490, 'Casca', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430510, 'Caxias Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430512, 'Cerrito', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430515, 'Cerro Grande', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430520, 'Cerro Largo', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430537, 'Charrua', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430543, 'Chuí', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430545, 'Cidreira', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430550, 'Ciríaco', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430560, 'Colorado', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430580, 'Constantina', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430585, 'Coqueiros Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430590, 'Coronel Bicaco', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430597, 'Coxilha', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430605, 'Cristal', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430610, 'Cruz Alta', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430620, 'Cruzeiro Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430635, 'Dezesseis De Novembro', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430640, 'Dois Irmãos', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430650, 'Dom Feliciano', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430655, 'Dom Pedro De Alcântara', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430675, 'Doutor Ricardo', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430690, 'Encruzilhada Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430695, 'Entre Rios Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430697, 'Erebango', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430720, 'Erval Grande', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430740, 'Esmeralda', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430750, 'Espumoso', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430760, 'Estância Velha', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430781, 'Estrela Velha', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430786, 'Fagundes Varela', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430805, 'Faxinalzinho', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430810, 'Feliz', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430825, 'Floriano Peixoto', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430843, 'Forquetinha', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430850, 'Frederico Westphalen', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430870, 'Gaurama', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430885, 'Gentil', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430900, 'Giruá', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430912, 'Gramado Dos Loureiros', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430920, 'Gravataí', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430930, 'Guaíba', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430950, 'Guarani Das Missões', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430970, 'Humaitá', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430980, 'Ibiaçá', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430995, 'Ibirapuitã', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431010, 'Igrejinha', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431033, 'Imbé', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431040, 'Independência', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431046, 'Ipiranga Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431053, 'Itaara', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431057, 'Itapuca', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431070, 'Itatiba Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431080, 'Ivoti', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431087, 'Jacuizinho', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431110, 'Jaguari', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431113, 'Jari', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431120, 'Júlio De Castilhos', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431127, 'Lagoa Dos Três Cantos', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431140, 'Lajeado', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431150, 'Lavras Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431164, 'Linha Nova', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431171, 'Maçambara', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431173, 'Mampituba', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431177, 'Maquiné', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431190, 'Marcelino Ramos', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431200, 'Mariano Moro', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431213, 'Mato Castelhano', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431217, 'Mato Queimado', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431230, 'Miraguaí', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431237, 'Monte Alegre Dos Campos', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431242, 'Mormaço', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431245, 'Morro Redondo', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431250, 'Mostardas', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431261, 'Muitos Capões', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431267, 'Nicolau Vergueiro', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431275, 'Nova Alvorada', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431295, 'Nova Boa Vista', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431301, 'Nova Candelária', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431308, 'Nova Pádua', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431320, 'Nova Petrópolis', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431333, 'Nova Ramada', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431337, 'Nova Santa Rita', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431340, 'Novo Hamburgo', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431344, 'Novo Tiradentes', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431360, 'Paim Filho', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431370, 'Palmeira Das Missões', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431395, 'Pantano Grande', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431402, 'Paraíso Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431406, 'Passa Sete', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431407, 'Passo Do Sobrado', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431415, 'Paverama', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431420, 'Pedro Osório', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431442, 'Picada Café', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431446, 'Pinhal Da Serra', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431450, 'Pinheiro Machado', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431460, 'Piratini', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431475, 'Poço Das Antas', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431480, 'Portão', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431500, 'Porto Lucena', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431507, 'Porto Vera Cruz', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431514, 'Presidente Lucena', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431517, 'Protásio Alves', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431531, 'Quatro Irmãos', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431535, 'Quinze De Novembro', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431550, 'Restinga Seca', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431560, 'Rio Grande', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431575, 'Riozinho', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431595, 'Rolador', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431610, 'Ronda Alta', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431630, 'Roque Gonzales', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431643, 'Saldanha Marinho', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431647, 'Salvador Das Missões', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431670, 'Santa Bárbara Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431675, 'Santa Clara Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431680, 'Santa Cruz Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431697, 'Santa Margarida Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431695, 'Santa Maria Do Herval', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431730, 'Santa Vitória Do Palmar', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431710, 'Santana Do Livramento', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431760, 'Santo Antônio Da Patrulha', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431755, 'Santo Antônio Do Palma', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431780, 'Santo Augusto', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431800, 'São Borja', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431810, 'São Francisco De Assis', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431840, 'São Jerônimo', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431843, 'São João Do Polêsine', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431846, 'São José Do Herval', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431849, 'São José Do Inhacorá', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431861, 'São José Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431880, 'São Lourenço Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431910, 'São Martinho', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431915, 'São Miguel Das Missões', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420750, 'Indaial', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431930, 'São Paulo Das Missões', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431937, 'São Pedro Do Butiá', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431960, 'São Sepé', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431971, 'São Valentim Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431980, 'São Vicente Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432000, 'Sapucaia Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432023, 'Sede Nova', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432030, 'Selbach', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432035, 'Sentinela Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432050, 'Sertão', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432057, 'Sete De Setembro', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432065, 'Silveira Martins', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432080, 'Soledade', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432090, 'Tapejara', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432120, 'Taquara', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432132, 'Taquaruçu Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432140, 'Tenente Portela', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432146, 'Tio Hugo', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432149, 'Toropi', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432160, 'Tramandaí', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432163, 'Três Arroios', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432180, 'Três De Maio', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432185, 'Três Palmeiras', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432200, 'Triunfo', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432215, 'Tunas', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432220, 'Tupanciretã', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432232, 'Turuçu', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432235, 'União Da Serra', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432240, 'Uruguaiana', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432254, 'Vale Real', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432255, 'Vanini', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432270, 'Vera Cruz', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432285, 'Vespasiano Correa', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432310, 'Vicente Dutra', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432320, 'Victor Graeff', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432335, 'Vila Lângaro', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432345, 'Vila Nova Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432370, 'Vista Gaúcha', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432380, 'Xangri Lá', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420010, 'Abelardo Luz', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420030, 'Agronômica', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420050, 'Águas De Chapecó', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420070, 'Alfredo Wagner', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420080, 'Anchieta', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420100, 'Anita Garibaldi', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420125, 'Apiúna', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420130, 'Araquari', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420160, 'Arroio Trinta', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420170, 'Ascurra', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420190, 'Aurora', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420205, 'Balneário Barra Do Sul', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421280, 'Balneáreo Piçarras', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420210, 'Barra Velha', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420215, 'Belmonte', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420230, 'Biguaçu', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420243, 'Bocaina Do Sul', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420257, 'Bom Jesus Do Oeste', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420270, 'Botuverá', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420285, 'Braço Do Trombudo', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420290, 'Brusque', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420315, 'Calmon', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420330, 'Campo Alegre', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420350, 'Campo Erê', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420380, 'Canoinhas', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420390, 'Capinzal', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420400, 'Catanduvas', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420415, 'Celso Ramos', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420419, 'Chapadão Do Lageado', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420430, 'Concórdia', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420440, 'Coronel Freitas', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420455, 'Correia Pinto', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420470, 'Cunha Porã', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420480, 'Curitibanos', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420500, 'Dionísio Cerqueira', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420517, 'Entre Rios', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420530, 'Faxinal Dos Guedes', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420540, 'Florianópolis', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420545, 'Forquilhinha', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420560, 'Galvão', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420580, 'Garuva', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420600, 'Governador Celso Ramos', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420630, 'Guabiruba', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420650, 'Guaramirim', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420665, 'Guatambú', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420680, 'Ibicaré', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420700, 'Içara', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420720, 'Imaruí', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420760, 'Ipira', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420765, 'Iporã Do Oeste', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420775, 'Iraceminha', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420785, 'Irati', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420810, 'Itaiópolis', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420830, 'Itapema', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420845, 'Itapoá', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420870, 'Jacinto Machado', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420890, 'Jaraguá Do Sul', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420900, 'Joaçaba', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420917, 'Jupiá', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420930, 'Lages', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420945, 'Lajeado Grande', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420970, 'Lebon Régis', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420985, 'Lindóia Do Sul', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421003, 'Luzerna', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421010, 'Mafra', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421030, 'Major Vieira', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421055, 'Marema', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421070, 'Matos Costa', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421085, 'Mirim Doce', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421100, 'Mondaí', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421110, 'Monte Castelo', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421130, 'Navegantes', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421145, 'Nova Itaberaba', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421165, 'Novo Horizonte', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421175, 'Otacílio Costa', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421187, 'Paial', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421190, 'Palhoça', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421205, 'Palmeira', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421223, 'Paraíso', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421227, 'Passos Maia', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421240, 'Pedras Grandes', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421270, 'Petrolândia', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421300, 'Pinheiro Preto', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421315, 'Planalto Alegre', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421335, 'Ponte Alta Do Norte', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421350, 'Porto Belo', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421370, 'Pouso Redondo', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421400, 'Presidente Getúlio', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421415, 'Princesa', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421430, 'Rancho Queimado', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421460, 'Rio Do Oeste', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421470, 'Rio Dos Cedros', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421505, 'Rio Rufino', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421510, 'Rodeio', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421535, 'Saltinho', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421545, 'Sangão', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421555, 'Santa Helena', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421565, 'Santa Rosa Do Sul', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421569, 'Santiago Do Sul', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350395, 'Aspásia', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421580, 'São Bento Do Sul', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421600, 'São Carlos', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421610, 'São Domingos', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421630, 'São João Batista', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421635, 'São João Do Itaperiú', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421640, 'São João Do Sul', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421670, 'São José Do Cedro', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421690, 'São Lourenço Do Oeste', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421710, 'São Martinho', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421725, 'São Pedro De Alcântara', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421750, 'Seara', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421760, 'Siderópolis', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421775, 'Sul Brasil', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421795, 'Tigrinhos', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421810, 'Timbé Do Sul', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421825, 'Timbó Grande', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421840, 'Treze De Maio', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421860, 'Trombudo Central', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421880, 'Turvo', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421890, 'Urubici', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421900, 'Urussanga', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421917, 'Vargem Bonita', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421930, 'Videira', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421940, 'Witmarsum', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421960, 'Xavantina', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280010, 'Amparo De São Francisco', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280030, 'Aracaju', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280050, 'Areia Branca', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280070, 'Brejo Grande', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280110, 'Canhoba', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280140, 'Carira', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280160, 'Cedro De São João', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280190, 'Cumbe', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280210, 'Estância', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280240, 'Gararu', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280260, 'Gracho Cardoso', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280280, 'Indiaroba', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280310, 'Itabi', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280330, 'Japaratuba', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280350, 'Lagarto', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280380, 'Malhada Dos Bois', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280400, 'Maruim', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280420, 'Monte Alegre De Sergipe', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280445, 'Nossa Senhora Aparecida', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280460, 'Nossa Senhora Das Dores', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280490, 'Pacatuba', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280510, 'Pedrinhas', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280540, 'Poço Redondo', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280560, 'Porto Da Folha', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280580, 'Riachão Do Dantas', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280610, 'Rosário Do Catete', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280630, 'Santa Luzia Do Itanhy', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280660, 'Santo Amaro Das Brotas', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280680, 'São Domingos', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280710, 'Simão Dias', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280730, 'Telha', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280750, 'Tomar Do Geru', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350010, 'Adamantina', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350020, 'Adolfo', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350040, 'Águas Da Prata', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350055, 'Águas De Santa Bárbara', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350075, 'Alambari', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350090, 'Altair', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350115, 'Alumínio', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350120, 'Álvares Florence', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350150, 'Alvinlândia', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350170, 'Américo Brasiliense', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350200, 'Analândia', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350220, 'Angatuba', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350250, 'Aparecida', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350270, 'Apiaí', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350280, 'Araçatuba', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350300, 'Aramina', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350320, 'Araraquara', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350335, 'Arco Íris', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350350, 'Areias', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350370, 'Ariranha', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350410, 'Atibaia', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350430, 'Avaí', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350460, 'Bady Bassitt', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350480, 'Bálsamo', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350500, 'Barão De Antonina', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350530, 'Barra Bonita', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350540, 'Barra Do Turvo', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350570, 'Barueri', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350590, 'Batatais', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350610, 'Bebedouro', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350630, 'Bernardino De Campos', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350650, 'Birigui', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350670, 'Boa Esperança Do Sul', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350700, 'Boituva', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350715, 'Bom Sucesso De Itararé', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350740, 'Borborema', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350750, 'Botucatu', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350770, 'Braúna', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350790, 'Brotas', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350810, 'Buritama', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350830, 'Cabrália Paulista', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350860, 'Cachoeira Paulista', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350880, 'Cafelândia', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350900, 'Caieiras', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350925, 'Cajati', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350940, 'Cajuru', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350950, 'Campinas', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350970, 'Campos Do Jordão', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350995, 'Canas', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351010, 'Cândido Rodrigues', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351020, 'Capão Bonito', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351050, 'Caraguatatuba', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351070, 'Cardoso', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351090, 'Cássia Dos Coqueiros', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351120, 'Catiguá', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351140, 'Cerqueira César', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351150, 'Cerquilho', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351170, 'Charqueada', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351200, 'Colina', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351220, 'Conchal', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351240, 'Cordeirópolis', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351260, 'Coronel Macedo', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351290, 'Cosmorama', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351320, 'Cristais Paulista', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351340, 'Cruzeiro', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351360, 'Cunha', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351385, 'Dirce Reis', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351400, 'Dobrada', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351420, 'Dolcinópolis', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351440, 'Dracena', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351470, 'Echaporã', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351490, 'Elias Fausto', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351495, 'Embaúba', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351512, 'Emilianópolis', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351518, 'Espírito Santo Do Pinhal', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355730, 'Estiva Gerbi', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351535, 'Euclides Da Cunha Paulista', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351560, 'Fernando Prestes', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351570, 'Ferraz De Vasconcelos', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351610, 'Florínia', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351620, 'Franca', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351640, 'Franco Da Rocha', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351670, 'Garça', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351685, 'Gavião Peixoto', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351700, 'Getulina', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351730, 'Guaimbê', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351750, 'Guapiaçu', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351770, 'Guará', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351790, 'Guaraci', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351820, 'Guararapes', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351840, 'Guaratinguetá', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351860, 'Guariba', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351885, 'Guatapará', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351900, 'Herculândia', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351907, 'Hortolândia', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351925, 'Iaras', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351940, 'Ibirá', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351960, 'Ibitinga', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351990, 'Iepê', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352010, 'Igarapava', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352030, 'Iguape', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352044, 'Ilha Solteira', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352060, 'Indiana', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352080, 'Inúbia Paulista', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352110, 'Ipeúna', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352120, 'Iporanga', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352140, 'Iracemápolis', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352170, 'Itaberá', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352190, 'Itajobi', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352210, 'Itanhaém', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352220, 'Itapecerica Da Serra', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352250, 'Itapevi', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352260, 'Itapira', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352280, 'Itaporanga', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352300, 'Itapura', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352320, 'Itararé', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352340, 'Itatiba', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352360, 'Itirapina', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352390, 'Itu', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352410, 'Ituverava', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352430, 'Jaboticabal', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352450, 'Jaci', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352480, 'Jales', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352500, 'Jandira', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352520, 'Jarinu', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352550, 'Joanópolis', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352570, 'José Bonifácio', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352585, 'Jumirim', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352600, 'Junqueirópolis', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352630, 'Lagoinha', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352650, 'Lavínia', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352680, 'Lençóis Paulista', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352700, 'Lindóia', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352725, 'Lourdes', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352740, 'Lucélia', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352760, 'Luís Antônio', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352790, 'Lutécia', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352810, 'Macaubal', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352830, 'Magda', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352850, 'Mairiporã', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352870, 'Marabá Paulista', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352890, 'Mariápolis', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352910, 'Marinópolis', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352940, 'Mauá', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352960, 'Meridiano', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352970, 'Miguelópolis', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352990, 'Miracatu', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353020, 'Mirante Do Paranapanema', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353050, 'Mococa', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353070, 'Mogi Guaçu', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353090, 'Mombuca', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353120, 'Monte Alegre Do Sul', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353140, 'Monte Aprazível', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353160, 'Monte Castelo', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353190, 'Morro Agudo', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353205, 'Motuca', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353220, 'Narandiba', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353240, 'Nazaré Paulista', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353270, 'Nipoã', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353282, 'Nova Campina', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353286, 'Nova Castilho', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353310, 'Nova Guataporanga', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353330, 'Nova Luzitânia', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353350, 'Novo Horizonte', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353370, 'Ocauçu', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353400, 'Onda Verde', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353420, 'Orindiúva', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353440, 'Osasco', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353450, 'Oscar Bressane', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353480, 'Ouro Verde', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353490, 'Pacaembu', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353510, 'Palmares Paulista', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353540, 'Panorama', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353560, 'Paraibuna', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353580, 'Paranapanema', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353610, 'Pardinho', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353625, 'Parisi', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353640, 'Paulicéia', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353660, 'Paulo De Faria', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353680, 'Pedra Bela', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353700, 'Pedregulho', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353720, 'Pedro De Toledo', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353740, 'Pereira Barreto', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353770, 'Piacatu', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353790, 'Pilar Do Sul', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353810, 'Pindorama', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353830, 'Piquerobi', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353870, 'Piracicaba', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353890, 'Pirajuí', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353910, 'Pirapora Do Bom Jesus', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353940, 'Piratininga', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353960, 'Planalto', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353980, 'Poá', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354010, 'Pongaí', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354025, 'Pontalinda', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354040, 'Populina', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354060, 'Porto Feliz', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354075, 'Potim', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354090, 'Pradópolis', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354105, 'Pratânia', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354120, 'Presidente Bernardes', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354150, 'Presidente Venceslau', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354170, 'Quatá', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354190, 'Queluz', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354210, 'Rafard', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354230, 'Redenção Da Serra', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354260, 'Registro', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354280, 'Ribeira', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354300, 'Ribeirão Branco', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354320, 'Ribeirão Do Sul', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354330, 'Ribeirão Pires', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354360, 'Rifaina', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354380, 'Rinópolis', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354410, 'Rio Grande Da Serra', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354350, 'Riversul', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354430, 'Roseira', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354460, 'Sabino', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354480, 'Sales', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354500, 'Salesópolis', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354520, 'Salto', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354540, 'Salto Grande', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354560, 'Santa Adélia', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354600, 'Santa Branca', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354610, 'Santa Clara D`Oeste', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354620, 'Santa Cruz Da Conceição', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354630, 'Santa Cruz Das Palmeiras', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354660, 'Santa Fé Do Sul', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354680, 'Santa Isabel', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354710, 'Santa Mercedes', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354750, 'Santa Rita Do Passa Quatro', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354720, 'Santana Da Ponte Pensa', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354780, 'Santo André', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354800, 'Santo Antônio De Posse', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354810, 'Santo Antônio Do Jardim', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354840, 'Santópolis Do Aguapeí', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354870, 'São Bernardo Do Campo', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354900, 'São Francisco', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354920, 'São João Das Duas Pontes', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354930, 'São João Do Pau D`Alho', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354960, 'São José Do Barreiro', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354990, 'São José Dos Campos', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355000, 'São Luís Do Paraitinga', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355030, 'São Paulo', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355050, 'São Pedro Do Turvo', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355080, 'São Sebastião Da Grama', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355110, 'Sarapuí', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355130, 'Sebastianópolis Do Sul', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355150, 'Serrana', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355180, 'Sete Barras', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355200, 'Silveiras', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355230, 'Sud Mennucci', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355255, 'Suzanápolis', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355270, 'Tabatinga', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355290, 'Taciba', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355310, 'Taiaçu', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355330, 'Tambaú', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355360, 'Tapiratiba', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355370, 'Taquaritinga', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355385, 'Taquarivaí', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355400, 'Tatuí', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355420, 'Tejupá', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355440, 'Terra Roxa', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355460, 'Timburi', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355475, 'Trabiju', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355490, 'Três Fronteiras', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355500, 'Tupã', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355530, 'Turmalina', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355540, 'Ubatuba', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355560, 'Uchoa', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355580, 'Urânia', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355610, 'Valentim Gentil', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170070, 'Alvorada', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170105, 'Angico', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170130, 'Aragominas', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170210, 'Araguaína', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170220, 'Araguatins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170240, 'Arraias', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170270, 'Aurora Do Tocantins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170305, 'Bandeirantes Do Tocantins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170310, 'Barrolândia', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170360, 'Brasilândia Do Tocantins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170382, 'Cachoeirinha', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170386, 'Cariri Do Tocantins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170389, 'Carrasco Bonito', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170510, 'Chapada Da Natividade', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170550, 'Colinas Do Tocantins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170560, 'Conceição Do Tocantins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170625, 'Crixás Do Tocantins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170710, 'Divinópolis Do Tocantins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170730, 'Dueré', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170765, 'Figueirópolis', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170820, 'Formoso Do Araguaia', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170830, 'Goianorte', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170950, 'Gurupi', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171050, 'Itacajá', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171090, 'Itapiratins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171180, 'Juarina', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171195, 'Lagoa Do Tocantins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171215, 'Lavandeira', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171250, 'Marianópolis Do Tocantins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171280, 'Maurilândia Do Tocantins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171360, 'Monte Do Carmo', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171395, 'Muricilândia', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171488, 'Nova Olinda', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171510, 'Novo Acordo', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171525, 'Novo Jardim', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171570, 'Palmeirante', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171575, 'Palmeirópolis', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171630, 'Pau D`Arco', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171660, 'Peixe', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171700, 'Pindorama Do Tocantins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171780, 'Ponte Alta Do Bom Jesus', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171800, 'Porto Alegre Do Tocantins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171840, 'Presidente Kennedy', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171850, 'Recursolândia', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171870, 'Rio Dos Bois', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171880, 'Sampaio', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171886, 'Santa Fé Do Araguaia', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171890, 'Santa Rosa Do Tocantins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171900, 'Santa Tereza Do Tocantins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (172010, 'São Bento Do Tocantins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (172025, 'São Salvador Do Tocantins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (172049, 'São Valério', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (172093, 'Taipas Do Tocantins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (172120, 'Tocantinópolis', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (172130, 'Tupiratins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (172210, 'Xambioá', '2017-09-10', 17, true);";
	}
	

}
