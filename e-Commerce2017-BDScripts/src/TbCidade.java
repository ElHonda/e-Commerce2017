
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
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (120010, 'Brasil�ia', '2017-09-10', 12, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (120017, 'Capixaba', '2017-09-10', 12, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (120025, 'Epitaciol�ndia', '2017-09-10', 12, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (120030, 'Feij�', '2017-09-10', 12, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (120033, 'M�ncio Lima', '2017-09-10', 12, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (120035, 'Marechal Thaumaturgo', '2017-09-10', 12, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (120080, 'Porto Acre', '2017-09-10', 12, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (120039, 'Porto Walter', '2017-09-10', 12, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (120042, 'Rodrigues Alves', '2017-09-10', 12, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (120050, 'Sena Madureira', '2017-09-10', 12, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (120060, 'Tarauac�', '2017-09-10', 12, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (120070, 'Xapuri', '2017-09-10', 12, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270020, 'Anadia', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270040, 'Atalaia', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270060, 'Barra De S�o Miguel', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270070, 'Batalha', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270090, 'Belo Monte', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270110, 'Branquinha', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270120, 'Cacimbinhas', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270135, 'Campestre', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270150, 'Campo Grande', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270170, 'Capela', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270180, 'Carneiros', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270200, 'Coit� Do N�ia', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270220, 'Coqueiro Seco', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270235, 'Cra�bas', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270250, 'Dois Riachos', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270255, 'Estrela De Alagoas', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270270, 'Feliz Deserto', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270290, 'Girau Do Ponciano', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270300, 'Ibateguara', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270320, 'Igreja Nova', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270340, 'Jacar� Dos Homens', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270360, 'Japaratinga', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270375, 'Jequi� Da Praia', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270380, 'Joaquim Gomes', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270400, 'Junqueiro', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270420, 'Limoeiro De Anadia', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270440, 'Major Isidoro', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270490, 'Mar Vermelho', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270460, 'Maravilha', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270480, 'Maribondo', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270510, 'Matriz De Camaragibe', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270520, 'Messias', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270540, 'Monteir�polis', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270560, 'Novo Lino', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270580, 'Olho D`�gua Do Casado', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270590, 'Olho D`�gua Grande', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270610, 'Ouro Branco', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270630, 'Palmeira Dos �ndios', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270642, 'Pariconha', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270644, 'Paripueira', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270660, 'Paulo Jacinto', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270680, 'Pia�abu�u', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270690, 'Pilar', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270710, 'Piranhas', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270730, 'Porto Calvo', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270750, 'Porto Real Do Col�gio', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270760, 'Quebrangulo', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270780, 'Roteiro', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270800, 'Santana Do Ipanema', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270810, 'Santana Do Munda�', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270830, 'S�o Jos� Da Laje', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270850, 'S�o Lu�s Do Quitunde', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270860, 'S�o Miguel Dos Campos', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270880, 'S�o Sebasti�o', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270890, 'Satuba', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270900, 'Tanque D`Arca', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270915, 'Teot�nio Vilela', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270920, 'Traipu', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270940, 'Vi�osa', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130006, 'Amatur�', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251230, 'Princesa Isabel', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130014, 'Apu�', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130030, 'Autazes', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130040, 'Barcelos', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130060, 'Benjamin Constant', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130068, 'Boa Vista Do Ramos', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130080, 'Borba', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130090, 'Canutama', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130100, 'Carauari', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130115, 'Careiro Da V�rzea', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130130, 'Codaj�s', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130150, 'Envira', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130165, 'Guajar�', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130170, 'Humait�', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130185, 'Iranduba', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130195, 'Itamarati', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130210, 'Japur�', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130230, 'Juta�', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130240, 'L�brea', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130255, 'Manaquiri', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130270, 'Manicor�', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130290, 'Mau�s', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130300, 'Nhamund�', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130320, 'Novo Air�o', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130340, 'Parintins', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130350, 'Pauini', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130356, 'Rio Preto Da Eva', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130370, 'Santo Ant�nio Do I��', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130390, 'S�o Paulo De Oliven�a', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130395, 'S�o Sebasti�o Do Uatum�', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130400, 'Silves', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130410, 'Tapau�', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130423, 'Tonantins', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130430, 'Urucar�', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (160010, 'Amap�', '2017-09-10', 16, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (160020, 'Cal�oene', '2017-09-10', 16, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (160023, 'Ferreira Gomes', '2017-09-10', 16, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (160027, 'Laranjal Do Jari', '2017-09-10', 16, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (160040, 'Mazag�o', '2017-09-10', 16, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (160015, 'Pedra Branca Do Amapar�', '2017-09-10', 16, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (160055, 'Pracu�ba', '2017-09-10', 16, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (160060, 'Santana', '2017-09-10', 16, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (160070, 'Tartarugalzinho', '2017-09-10', 16, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290010, 'Aba�ra', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290020, 'Abar�', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290035, 'Adustina', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290060, 'Aiquara', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290080, 'Alcoba�a', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290090, 'Almadina', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290110, 'Am�lia Rodrigues', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290120, 'Anag�', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290135, 'Andorinha', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290140, 'Angical', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290160, 'Antas', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290180, 'Ant�nio Gon�alves', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290195, 'Apuarema', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290205, 'Ara�as', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290210, 'Araci', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290225, 'Arataca', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290240, 'Aurelino Leal', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290260, 'Baixa Grande', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290265, 'Banza�', '2017-09-10', 29, true);\r\n" + 
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
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290430, 'Brej�es', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251260, 'Quixab�', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290460, 'Brumado', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290475, 'Buritirama', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290485, 'Cabaceiras Do Paragua�u', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290500, 'Cacul�', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290510, 'Ca�m', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290520, 'Caetit�', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290540, 'Cairu', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290560, 'Camacan', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290570, 'Cama�ari', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290600, 'Campo Formoso', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290610, 'Can�polis', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290630, 'Canavieiras', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290640, 'Candeal', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290660, 'Candiba', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290680, 'Cansan��o', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290685, 'Capela Do Alto Alegre', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290689, 'Cara�bas', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290690, 'Caravelas', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290710, 'Carinhanha', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290730, 'Castro Alves', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290740, 'Catol�ndia', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290755, 'Caturama', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290770, 'Chorroch�', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290790, 'Cip�', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290800, 'Coaraci', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290820, 'Concei��o Da Feira', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290840, 'Concei��o Do Coit�', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290860, 'Conde', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290870, 'Conde�ba', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290890, 'Cora��o De Maria', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290900, 'Cordeiros', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290920, 'Coronel Jo�o S�', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290940, 'Cotegipe', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290960, 'Cris�polis', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290970, 'Crist�polis', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290990, 'Cura��', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291005, 'Dias D`�vila', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291010, 'Dom Bas�lio', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291030, 'El�sio Medrado', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291050, 'Entre Rios', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291060, 'Esplanada', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291070, 'Euclides Da Cunha', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291075, 'F�tima', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291080, 'Feira De Santana', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291085, 'Filad�lfia', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291100, 'Floresta Azul', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291120, 'Gandu', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291125, 'Gavi�o', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291140, 'Gl�ria', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291160, 'Governador Mangabeira', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291165, 'Guajeru', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291180, 'Guaratinga', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291190, 'Ia�u', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291210, 'Ibicara�', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291230, 'Ibicu�', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291240, 'Ibipeba', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291260, 'Ibiquera', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291280, 'Ibirapu�', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291300, 'Ibitiara', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291310, 'Ibitit�', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291330, 'Ichu', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291345, 'Igrapi�na', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291360, 'Ilh�us', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291380, 'Ipecaet�', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291390, 'Ipia�', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291410, 'Ipupiara', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291430, 'Iramaia', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291450, 'Irar�', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291460, 'Irec�', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291470, 'Itaberaba', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291490, 'Itacar�', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291510, 'Itagi', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291530, 'Itagimirim', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291550, 'Itaju�pe', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291570, 'Itamari', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291590, 'Itanagra', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291600, 'Itanh�m', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291620, 'Itap�', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291640, 'Itapetinga', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291660, 'Itapitanga', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291680, 'Itarantim', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291685, 'Itatim', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291700, 'Iti�ba', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291720, 'Itua�u', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291733, 'Iui�', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291740, 'Jacaraci', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291750, 'Jacobina', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291770, 'Jaguarari', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291790, 'Janda�ra', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291810, 'Jeremoabo', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291820, 'Jiquiri��', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291840, 'Juazeiro', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291845, 'Jucuru�u', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291855, 'Jussari', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291860, 'Jussiape', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291875, 'Lagoa Real', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291890, 'Lajed�o', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291905, 'Lajedo Do Tabocal', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291910, 'Lamar�o', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291920, 'Lauro De Freitas', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291940, 'Lic�nio De Almeida', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291955, 'Lu�s Eduardo Magalh�es', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291960, 'Macajuba', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291980, 'Maca�bas', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291992, 'Madre De Deus', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292000, 'Maiquinique', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292020, 'Malhada', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292040, 'Manoel Vitorino', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292045, 'Mansid�o', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292060, 'Maragogipe', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292080, 'Marcion�lio Souza', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292100, 'Mata De S�o Jo�o', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292105, 'Matina', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292120, 'Miguel Calmon', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292140, 'Mirangaba', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292145, 'Mirante', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292160, 'Morpar�', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292180, 'Mortugaba', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292200, 'Mucuri', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292210, 'Mundo Novo', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292220, 'Muniz Ferreira', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292230, 'Muritiba', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292240, 'Mutu�pe', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292260, 'Nilo Pe�anha', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292270, 'Nova Cana�', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292275, 'Nova Ibi�', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292285, 'Nova Reden��o', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292290, 'Nova Soure', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292303, 'Novo Horizonte', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292310, 'Olindina', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292330, 'Ouri�angas', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292335, 'Ourol�ndia', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292350, 'Palmeiras', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292360, 'Paramirim', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292380, 'Paripiranga', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292400, 'Paulo Afonso', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292410, 'Pedr�o', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292430, 'Piat�', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292440, 'Pil�o Arcado', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292460, 'Pindoba�u', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292467, 'Pira� Do Norte', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292470, 'Pirip�', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292490, 'Planaltino', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292510, 'Po��es', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292525, 'Ponto Novo', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292540, 'Potiragu�', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292550, 'Prado', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292575, 'Presidente Tancredo Neves', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292580, 'Queimadas', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292593, 'Quixabeira', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292600, 'Remanso', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292620, 'Riach�o Das Neves', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292640, 'Riacho De Santana', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292650, 'Ribeira Do Amparo', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292665, 'Ribeir�o Do Largo', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292670, 'Rio De Contas', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292690, 'Rio Do Pires', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292710, 'Rodelas', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292720, 'Ruy Barbosa', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292740, 'Salvador', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292760, 'Santa Br�gida', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292780, 'Santa Cruz Da Vit�ria', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292790, 'Santa In�s', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292810, 'Santa Maria Da Vit�ria', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292850, 'Santa Teresinha', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292800, 'Santaluz', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292830, 'Santan�polis', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292870, 'Santo Ant�nio De Jesus', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292890, 'S�o Desid�rio', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292910, 'S�o Felipe', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292900, 'S�o F�lix', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292920, 'S�o Francisco Do Conde', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292930, 'S�o Gon�alo Dos Campos', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292937, 'S�o Jos� Do Jacu�pe', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292940, 'S�o Miguel Das Matas', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292960, 'Sapea�u', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292970, 'S�tiro Dias', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292980, 'Sa�de', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293000, 'Sebasti�o Laranjeiras', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293020, 'Sento S�', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293015, 'Serra Do Ramalho', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293040, 'Serra Preta', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293050, 'Serrinha', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293070, 'Sim�es Filho', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293076, 'S�tio Do Quinto', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293080, 'Souto Soares', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293100, 'Tanha�u', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293105, 'Tanque Novo', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293120, 'Tapero�', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293135, 'Teixeira De Freitas', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293150, 'Teofil�ndia', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293160, 'Teol�ndia', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293180, 'Tremedal', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293200, 'Uau�', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293210, 'Uba�ra', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293230, 'Ubat�', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293245, 'Umburanas', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293260, 'Urandi', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293280, 'Utinga', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293300, 'Valente', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293305, 'V�rzea Da Ro�a', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293315, 'V�rzea Nova', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293320, 'Vera Cruz', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293330, 'Vit�ria Da Conquista', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293340, 'Wagner', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293360, 'Xique Xique', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230010, 'Abaiara', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230015, 'Acarape', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230030, 'Acopiara', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230050, 'Alc�ntaras', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230070, 'Alto Santo', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230080, 'Antonina Do Norte', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230090, 'Apuiar�s', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230110, 'Aracati', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230125, 'Ararend�', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230140, 'Aratuba', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230150, 'Arneiroz', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230170, 'Aurora', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230185, 'Banabui�', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251274, 'Riach�o', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230195, 'Barreira', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230205, 'Barroquinha', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230220, 'Beberibe', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230240, 'Boa Viagem', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230250, 'Brejo Santo', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230270, 'Campos Sales', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230290, 'Capistrano', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230310, 'Carir�', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230330, 'Cari�s', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230340, 'Carnaubal', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230360, 'Catarina', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230370, 'Caucaia', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230390, 'Chaval', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230393, 'Chor�', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230400, 'Corea�', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230420, 'Crato', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230425, 'Cruz', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230427, 'Erer�', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230428, 'Eus�bio', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230435, 'Forquilha', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230445, 'Fortim', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230450, 'Frecheirinha', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230465, 'Gra�a', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230480, 'Granjeiro', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230495, 'Guai�ba', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230500, 'Guaraciaba Do Norte', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230520, 'Hidrol�ndia', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230526, 'Ibaretama', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230533, 'Ibicuitinga', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230535, 'Icapu�', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230550, 'Iguatu', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230565, 'Ipaporanga', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230580, 'Ipu', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230590, 'Ipueiras', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230610, 'Irau�uba', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230625, 'Itaitinga', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230640, 'Itapipoca', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230650, 'Itapi�na', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230660, 'Itatira', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230680, 'Jaguaribara', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230700, 'Jaguaruana', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230710, 'Jardim', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230730, 'Juazeiro Do Norte', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230740, 'Juc�s', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230760, 'Limoeiro Do Norte', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230763, 'Madalena', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230770, 'Maranguape', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230790, 'Martin�pole', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230810, 'Mauriti', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230820, 'Meruoca', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230835, 'Milh�', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230840, 'Miss�o Velha', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230860, 'Monsenhor Tabosa', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230870, 'Morada Nova', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230890, 'Morrinhos', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230910, 'Mulungu', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230930, 'Nova Russas', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230945, 'Ocara', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230950, 'Or�s', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230970, 'Pacatuba', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230990, 'Pacuj�', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231000, 'Palhano', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231020, 'Paracuru', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231030, 'Parambu', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231050, 'Pedra Branca', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231070, 'Pentecoste', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231085, 'Pindoretama', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231095, 'Pires Ferreira', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231100, 'Poranga', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231120, 'Potengi', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231126, 'Quiterian�polis', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231135, 'Quixel�', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231150, 'Quixer�', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231160, 'Reden��o', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251278, 'Riacho De Santo Ant�nio', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231195, 'Salitre', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231200, 'Santana Do Acara�', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231230, 'S�o Benedito', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231240, 'S�o Gon�alo Do Amarante', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231260, 'S�o Lu�s Do Curu', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231270, 'Senador Pompeu', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231290, 'Sobral', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231310, 'Tabuleiro Do Norte', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231325, 'Tarrafas', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231330, 'Tau�', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231340, 'Tiangu�', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231355, 'Tururu', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231370, 'Umari', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231375, 'Umirim', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231390, 'Uruoca', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231400, 'V�rzea Alegre', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (530010, 'Bras�lia', '2017-09-10', 53, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320016, '�gua Doce Do Norte', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320013, '�guia Branca', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320030, 'Alfredo Chaves', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320040, 'Anchieta', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320050, 'Apiac�', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320080, 'Baixo Guandu', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320090, 'Barra De S�o Francisco', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320110, 'Bom Jesus Do Norte', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320115, 'Brejetuba', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320130, 'Cariacica', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320150, 'Colatina', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320170, 'Concei��o Do Castelo', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320180, 'Divino De S�o Louren�o', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320200, 'Dores Do Rio Preto', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320210, 'Ecoporanga', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320230, 'Gua�u�', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320240, 'Guarapari', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320250, 'Ibira�u', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320255, 'Ibitirama', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320265, 'Irupi', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320280, 'Itapemirim', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320300, 'I�na', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320305, 'Jaguar�', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320313, 'Jo�o Neiva', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320320, 'Linhares', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320332, 'Marata�zes', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320334, 'Marechal Floriano', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320340, 'Mimoso Do Sul', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320360, 'Mucurici', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320380, 'Muqui', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320390, 'Nova Ven�cia', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320405, 'Pedro Can�rio', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320420, 'Pi�ma', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320425, 'Ponto Belo', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320435, 'Rio Bananal', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320450, 'Santa Leopoldina', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320460, 'Santa Teresa', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320465, 'S�o Domingos Do Norte', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320480, 'S�o Jos� Do Cal�ado', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320490, 'S�o Mateus', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320500, 'Serra', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320501, 'Sooretama', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320506, 'Venda Nova Do Imigrante', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320515, 'Vila Pav�o', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320520, 'Vila Velha', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320530, 'Vit�ria', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520010, 'Abadi�nia', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520015, 'Adel�ndia', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520020, '�gua Limpa', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520025, '�guas Lindas De Goi�s', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520050, 'Alo�ndia', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520060, 'Alto Para�so De Goi�s', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520080, 'Alvorada Do Norte', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520085, 'Americano Do Brasil', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520110, 'An�polis', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251300, 'Salgadinho', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520145, 'Aparecida Do Rio Doce', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520150, 'Apor�', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520170, 'Aragar�as', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520215, 'Araguapaz', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520250, 'Aruan�', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520260, 'Auril�ndia', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520310, 'Baliza', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520330, 'Bela Vista De Goi�s', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520350, 'Bom Jesus De Goi�s', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520355, 'Bonfin�polis', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520360, 'Brazabrantes', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520390, 'Buriti Alegre', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520396, 'Buritin�polis', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520400, 'Cabeceiras', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520420, 'Cachoeira De Goi�s', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520430, 'Ca�u', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520440, 'Caiap�nia', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520455, 'Caldazinha', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520465, 'Campina�u', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520470, 'Campinorte', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520485, 'Campo Limpo De Goi�s', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520495, 'Campos Verdes', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520505, 'Castel�ndia', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520510, 'Catal�o', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520530, 'Cavalcante', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520540, 'Ceres', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520547, 'Chapad�o Do C�u', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520551, 'Cocalzinho De Goi�s', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520570, 'C�rrego Do Ouro', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520580, 'Corumb� De Goi�s', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520620, 'Cristalina', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520640, 'Crix�s', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520660, 'Cumari', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520670, 'Damian�polis', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520690, 'Davin�polis', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520830, 'Divin�polis De Goi�s', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520735, 'Edealina', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520740, 'Ed�ia', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520753, 'Faina', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520780, 'Firmin�polis', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520800, 'Formosa', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520810, 'Formoso', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520840, 'Goian�polis', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520850, 'Goiandira', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520870, 'Goi�nia', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520890, 'Goi�s', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520915, 'Gouvel�ndia', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520920, 'Guap�', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520940, 'Guarani De Goi�s', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520960, 'Heitora�', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520980, 'Hidrolina', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520990, 'Iaciara', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520995, 'Indiara', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521010, 'Ipameri', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521020, 'Ipor�', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521030, 'Israel�ndia', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521056, 'Itaguari', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521080, 'Itaj�', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521100, 'Itapirapu�', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521120, 'Itapuranga', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521140, 'Itau�u', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521160, 'Ivol�ndia', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521180, 'Jaragu�', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521200, 'Jaupaci', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521205, 'Jes�polis', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521220, 'Jussara', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521230, 'Leopoldo De Bulh�es', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521260, 'Mairipotaba', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521280, 'Mara Rosa', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521290, 'Marzag�o', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521300, 'Mauril�ndia', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521308, 'Mina�u', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521340, 'Moipor�', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260720, 'Ipojuca', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521370, 'Montes Claros De Goi�s', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521377, 'Montividiu Do Norte', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521385, 'Morro Agudo De Goi�s', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521390, 'Moss�medes', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521405, 'Mundo Novo', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521440, 'Naz�rio', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521450, 'Ner�polis', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521470, 'Nova Am�rica', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521483, 'Nova Crix�s', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521487, 'Nova Igua�u De Goi�s', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521490, 'Nova Roma', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521520, 'Novo Brasil', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521525, 'Novo Planalto', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521540, 'Ouro Verde De Goi�s', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521560, 'Padre Bernardo', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521570, 'Palmeiras De Goi�s', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521580, 'Palmelo', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521600, 'Panam�', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521640, 'Para�na', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521645, 'Perol�ndia', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521690, 'Pilar De Goi�s', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521720, 'Piranhas', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521740, 'Pires Do Rio', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521760, 'Planaltina', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521800, 'Porangatu', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521810, 'Portel�ndia', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521830, 'Posse', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521850, 'Quirin�polis', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521870, 'Rian�polis', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521880, 'Rio Verde', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521890, 'Rubiataba', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521910, 'Santa B�rbara De Goi�s', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521925, 'Santa F� De Goi�s', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521935, 'Santa Isabel', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521940, 'Santa Rita Do Araguaia', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521950, 'Santa Rosa De Goi�s', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521970, 'Santa Terezinha De Goi�s', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521971, 'Santo Ant�nio Da Barra', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521975, 'Santo Ant�nio Do Descoberto', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521980, 'S�o Domingos', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (522000, 'S�o Jo�o D`Alian�a', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (522010, 'S�o Lu�s De Montes Belos', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (522015, 'S�o Lu�z Do Norte', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (522026, 'S�o Miguel Do Passa Quatro', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (522028, 'S�o Patr�cio', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (522045, 'Senador Canedo', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (522060, 'Silv�nia', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (522068, 'Simol�ndia', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (522100, 'Taquaral De Goi�s', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (522119, 'Terez�polis De Goi�s', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (522140, 'Trindade', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (522145, 'Trombas', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (522155, 'Turvel�ndia', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (522160, 'Urua�u', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (522180, 'Uruta�', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (522190, 'Varj�o', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (522200, 'Vian�polis', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (522220, 'Vila Boa', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (522230, 'Vila Prop�cio', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210010, 'Afonso Cunha', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210020, 'Alc�ntara', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210030, 'Aldeias Altas', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210043, 'Alto Alegre Do Maranh�o', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210050, 'Alto Parna�ba', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210055, 'Amap� Do Maranh�o', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210070, 'Anajatuba', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210080, 'Anapurus', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210087, 'Araguan�', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210095, 'Arame', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210110, 'Axix�', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210120, 'Bacabal', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210140, 'Balsas', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210160, 'Barra Do Corda', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210177, 'Bela Vista Do Maranh�o', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210173, 'Bel�gua', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210190, 'Bequim�o', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210197, 'Boa Vista Do Gurupi', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210200, 'Bom Jardim', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210207, 'Bom Lugar', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210215, 'Brejo De Areia', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210220, 'Buriti', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210232, 'Buriticupu', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210237, 'Cachoeira Grande', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210250, 'Cajari', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210260, 'C�ndido Mendes', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210270, 'Cantanhede', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210280, 'Carolina', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210290, 'Carutapera', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210310, 'Cedral', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210315, 'Centro Do Guilherme', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210320, 'Chapadinha', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210325, 'Cidel�ndia', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210340, 'Coelho Neto', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210355, 'Concei��o Do Lago A�u', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210360, 'Coroat�', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210375, 'Davin�polis', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210390, 'Duque Bacelar', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210405, 'Estreito', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210408, 'Fernando Falc�o', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210409, 'Formosa Da Serra Negra', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210420, 'Fortuna', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210430, 'Godofredo Viana', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210450, 'Governador Archer', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210460, 'Governador Eug�nio Barros', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210465, 'Governador Newton Bello', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210467, 'Governador Nunes Freire', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210480, 'Graja�', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210490, 'Guimar�es', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210510, 'Icatu', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210520, 'Igarap� Grande', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210530, 'Imperatriz', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210540, 'Itapecuru Mirim', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210545, 'Jatob�', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210550, 'Jo�o Lisboa', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210560, 'Josel�ndia', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210570, 'Lago Da Pedra', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210594, 'Lago Dos Rodrigues', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210590, 'Lago Verde', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210596, 'Lagoa Grande Do Maranh�o', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210600, 'Lima Campos', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210610, 'Loreto', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210630, 'Magalh�es De Almeida', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210635, 'Maraj� Do Sena', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210640, 'Mata Roma', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210650, 'Matinha', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210663, 'Mat�es Do Norte', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210670, 'Mirador', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210675, 'Miranda Do Norte', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210690, 'Mon��o', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210710, 'Morros', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210720, 'Nina Rodrigues', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210730, 'Nova Iorque', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210740, 'Olho D`�gua Das Cunh�s', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210750, 'Pa�o Do Lumiar', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210760, 'Palmeir�ndia', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210780, 'Parnarama', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210790, 'Passagem Franca', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210805, 'Paulino Neves', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210820, 'Pedreiras', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210830, 'Penalva', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210840, 'Peri Mirim', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210850, 'Pindar� Mirim', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210870, 'Pio Xii', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210900, 'Porto Franco', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210905, 'Porto Rico Do Maranh�o', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210920, 'Presidente Juscelino', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210927, 'Presidente Sarney', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210930, 'Presidente Vargas', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210945, 'Raposa', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210955, 'Ribamar Fiquene', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210960, 'Ros�rio', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210980, 'Santa Helena', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210990, 'Santa In�s', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211003, 'Santa Luzia Do Paru�', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211020, 'Santa Rita', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211023, 'Santana Do Maranh�o', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211030, 'Santo Ant�nio Dos Lopes', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211050, 'S�o Bento', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211060, 'S�o Bernardo', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211070, 'S�o Domingos Do Maranh�o', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211080, 'S�o F�lix De Balsas', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211090, 'S�o Francisco Do Maranh�o', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211102, 'S�o Jo�o Do Car�', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211107, 'S�o Jo�o Do Soter', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211110, 'S�o Jo�o Dos Patos', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211125, 'S�o Jos� Dos Bas�lios', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211130, 'S�o Lu�s', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211150, 'S�o Mateus Do Maranh�o', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211153, 'S�o Pedro Da �gua Branca', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211160, 'S�o Raimundo Das Mangabeiras', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211167, 'S�o Roberto', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211170, 'S�o Vicente Ferrer', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211174, 'Senador Alexandre Costa', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211178, 'Serrano Do Maranh�o', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211180, 'S�tio Novo', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211195, 'Sucupira Do Riach�o', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211210, 'Timbiras', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211220, 'Timon', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211227, 'Tufil�ndia', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211240, 'Turia�u', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211245, 'Turil�ndia', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211260, 'Urbano Santos', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211280, 'Viana', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211290, 'Vit�ria Do Mearim', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211300, 'Vitorino Freire', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310010, 'Abadia Dos Dourados', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310030, 'Abre Campo', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310050, 'A�ucena', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310060, '�gua Boa', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310080, 'Aguanil', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310100, '�guas Vermelhas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310120, 'Aiuruoca', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310130, 'Alagoa', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310150, 'Al�m Para�ba', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310163, 'Alfredo Vasconcelos', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310180, 'Alpercata', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310200, 'Alterosa', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310205, 'Alto Capara�', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310210, 'Alto Rio Doce', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310230, 'Alvin�polis', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310250, 'Amparo Do Serra', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310260, 'Andradas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310285, 'Angel�ndia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310300, 'Ant�nio Dias', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310320, 'Ara�a�', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310330, 'Aracitaba', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310350, 'Araguari', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310360, 'Arantina', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310375, 'Arapor�', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310390, 'Ara�jos', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310410, 'Arceburgo', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310430, 'Areado', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310440, 'Argirita', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310450, 'Arinos', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251315, 'Santa Cec�lia', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310480, 'Augusto De Lima', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310490, 'Baependi', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310510, 'Bambu�', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310530, 'Bandeira Do Sul', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310550, 'Bar�o De Monte Alto', '2017-09-10', 31, true);\r\n" + 
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
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310855, 'Brasil�ndia De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310890, 'Bras�polis', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310880, 'Bra�nas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310910, 'Bueno Brand�o', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310925, 'Bugre', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310930, 'Buritis', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310945, 'Cabeceira Grande', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310960, 'Cachoeira Da Prata', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310270, 'Cachoeira De Paje�', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310990, 'Caetan�polis', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311000, 'Caet�', '2017-09-10', 31, true);\r\n" + 
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
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311180, 'Can�polis', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311200, 'Candeias', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311210, 'Capara�', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311230, 'Capelinha', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311250, 'Capim Branco', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311265, 'Capit�o Andrade', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311280, 'Capit�lio', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311290, 'Caputira', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311310, 'Carana�ba', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311330, 'Carangola', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311350, 'Carbonita', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311360, 'Carea�u', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311380, 'Carm�sia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311400, 'Carmo Da Mata', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311420, 'Carmo Do Cajuru', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311430, 'Carmo Do Parana�ba', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311450, 'Carm�polis De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311455, 'Carneirinho', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311470, 'Carvalh�polis', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311490, 'Casa Grande', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311510, 'C�ssia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311530, 'Cataguases', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311545, 'Catuji', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311547, 'Catuti', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311560, 'Cedro Do Abaet�', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311570, 'Central De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311590, 'Ch�cara', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311610, 'Chapada Do Norte', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260740, 'Itacuruba', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311630, 'Cipot�nea', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311650, 'Claro Dos Po��es', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311670, 'Coimbra', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311690, 'Comendador Gomes', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311710, 'Concei��o Da Aparecida', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311730, 'Concei��o Das Alagoas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311720, 'Concei��o Das Pedras', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311750, 'Concei��o Do Mato Dentro', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311760, 'Concei��o Do Par�', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311780, 'Concei��o Dos Ouros', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311787, 'Confins', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311790, 'Congonhal', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311810, 'Congonhas Do Norte', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311830, 'Conselheiro Lafaiete', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311850, 'Consola��o', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311860, 'Contagem', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311880, 'Cora��o De Jesus', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311900, 'Cordisl�ndia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311910, 'Corinto', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311930, 'Coromandel', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311950, 'Coronel Murta', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311970, 'Coronel Xavier Chaves', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311980, 'C�rrego Danta', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311995, 'C�rrego Fundo', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312010, 'Couto De Magalh�es De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312015, 'Cris�lita', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312030, 'Crist�lia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312050, 'Cristina', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312070, 'Cruzeiro Da Fortaleza', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312080, 'Cruz�lia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312087, 'Curral De Dentro', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312100, 'Datas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312120, 'Delfin�polis', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312125, 'Delta', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312140, 'Desterro De Entre Rios', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312160, 'Diamantina', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312180, 'Dion�sio', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312190, 'Divin�sia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312210, 'Divino Das Laranjeiras', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312230, 'Divin�polis', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312235, 'Divisa Alegre', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312245, 'Divis�polis', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312247, 'Dom Bosco', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312260, 'Dom Joaquim', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312280, 'Dom Vi�oso', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312300, 'Dores De Campos', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312310, 'Dores De Guanh�es', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312330, 'Dores Do Turvo', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312340, 'Dores�polis', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312352, 'Durand�', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312370, 'Engenheiro Caldas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312385, 'Entre Folhas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312390, 'Entre Rios De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312410, 'Esmeraldas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312430, 'Espinosa', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312450, 'Estiva', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312460, 'Estrela Dalva', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312480, 'Estrela Do Sul', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312500, 'Ewbank Da C�mara', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312510, 'Extrema', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312530, 'Faria Lemos', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312560, 'Felisburgo', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312570, 'Felixl�ndia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312590, 'Ferros', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312600, 'Florestal', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312620, 'Formoso', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312630, 'Fortaleza De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312650, 'Francisco Badar�', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312670, 'Francisco S�', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312680, 'Frei Gaspar', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312690, 'Frei Inoc�ncio', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260765, 'Itamb�', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312707, 'Fruta De Leite', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312710, 'Frutal', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312730, 'Galil�ia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312735, 'Glaucil�ndia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312737, 'Goiabeira', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312740, 'Gon�alves', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312760, 'Gouveia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312780, 'Gr�o Mogol', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312790, 'Grupiara', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312810, 'Guap�', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312825, 'Guaraciama', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312840, 'Guarani', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312850, 'Guarar�', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312870, 'Guaxup�', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312890, 'Guimar�nia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312910, 'Gurinhat�', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312930, 'Iapu', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312940, 'Ibertioga', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312960, 'Ibia�', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312970, 'Ibiraci', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312990, 'Ibiti�ra De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313005, 'Icara� De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313010, 'Igarap�', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313030, 'Iguatama', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313050, 'Ilic�nea', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313060, 'Inconfidentes', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313065, 'Indaiabira', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313080, 'Inga�', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313100, 'Inha�ma', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313115, 'Ipaba', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313120, 'Ipanema', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313140, 'Ipia�u', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313160, 'Ira� De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313180, 'Itabirinha', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313190, 'Itabirito', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313210, 'Itacarambi', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313230, 'Itaip�', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313250, 'Itamarandiba', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313270, 'Itambacuri', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313290, 'Itamogi', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313300, 'Itamonte', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313320, 'Itanhomi', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313330, 'Itaobim', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313350, 'Itapecerica', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313370, 'Itatiaiu�u', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313380, 'Ita�na', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313390, 'Itaverava', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313410, 'Itueta', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313430, 'Itumirim', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313450, 'Itutinga', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313470, 'Jacinto', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313480, 'Jacu�', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313500, 'Jaguara�u', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313507, 'Jampruca', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313510, 'Jana�ba', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313530, 'Japara�ba', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313540, 'Jeceaba', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313550, 'Jequeri', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313560, 'Jequita�', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313590, 'Jesu�nia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313600, 'Joa�ma', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313620, 'Jo�o Monlevade', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313640, 'Joaquim Fel�cio', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313650, 'Jord�nia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313655, 'Jos� Raydan', '2017-09-10', 31, true);\r\n" + 
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
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313868, 'Luisl�ndia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313880, 'Luz', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313890, 'Machacalis', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313910, 'Madre De Deus De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313925, 'Mamonas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313940, 'Manhua�u', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313950, 'Manhumirim', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313980, 'Mar De Espanha', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313990, 'Maria Da F�', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314010, 'Marilac', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314020, 'Marip� De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314030, 'Marli�ria', '2017-09-10', 31, true);\r\n" + 
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
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314220, 'Mira�', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314230, 'Moeda', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314250, 'Monjolos', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314270, 'Montalv�nia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314280, 'Monte Alegre De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314300, 'Monte Belo', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314315, 'Monte Formoso', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314340, 'Monte Si�o', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314330, 'Montes Claros', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314350, 'Morada Nova De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314370, 'Morro Do Pilar', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314380, 'Munhoz', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314400, 'Mutum', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314420, 'Nacip Raydan', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314430, 'Nanuque', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314437, 'Natal�ndia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314450, 'Nazareno', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314465, 'Ninheira', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314470, 'Nova Era', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314480, 'Nova Lima', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314500, 'Nova Ponte', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314510, 'Nova Resende', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313660, 'Nova Uni�o', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314530, 'Novo Cruzeiro', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314537, 'Novorizonte', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314545, 'Olhos D`�gua', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314560, 'Oliveira', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314570, 'Oliveira Fortes', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314585, 'Orat�rios', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314590, 'Ouro Branco', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314600, 'Ouro Fino', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314620, 'Ouro Verde De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314630, 'Padre Para�so', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314640, 'Paineiras', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314650, 'Pains', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314670, 'Palma', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314690, 'Papagaios', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314700, 'Paracatu', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314720, 'Paragua�u', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314740, 'Paraopeba', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314770, 'Passa Tempo', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314750, 'Passab�m', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314790, 'Passos', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251330, 'Santa Helena', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314810, 'Patroc�nio', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314830, 'Paula C�ndido', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314850, 'Pav�o', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314860, 'Pe�anha', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314875, 'Pedra Bonita', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314890, 'Pedra Do Indai�', '2017-09-10', 31, true);\r\n" + 
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
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315057, 'Pint�polis', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315060, 'Piracema', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315080, 'Piranga', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315100, 'Piranguinho', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315110, 'Pirapetinga', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315130, 'Pira�ba', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315150, 'Piumhi', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315170, 'Po�o Fundo', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315190, 'Pocrane', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315200, 'Pomp�u', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315213, 'Ponto Chique', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315220, 'Porteirinha', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315230, 'Porto Firme', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315250, 'Pouso Alegre', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315270, 'Prados', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315290, 'Prat�polis', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315310, 'Presidente Bernardes', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315330, 'Presidente Kubitschek', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315340, 'Presidente Oleg�rio', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315370, 'Quartel Geral', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315380, 'Queluzito', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315400, 'Raul Soares', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315415, 'Reduto', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315430, 'Resplendor', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315440, 'Ressaquinha', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315450, 'Riacho Dos Machados', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315470, 'Ribeir�o Vermelho', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315490, 'Rio Casca', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315510, 'Rio Do Prado', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315520, 'Rio Espera', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315540, 'Rio Novo', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315560, 'Rio Pardo De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315570, 'Rio Piracicaba', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315590, 'Rio Preto', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315610, 'Rit�polis', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315630, 'Rodeiro', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315640, 'Romaria', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315650, 'Rubelita', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315670, 'Sabar�', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315690, 'Sacramento', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315700, 'Salinas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315720, 'Santa B�rbara', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315727, 'Santa B�rbara Do Monte Verde', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315730, 'Santa B�rbara Do Tug�rio', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315737, 'Santa Cruz De Salinas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315750, 'Santa Efig�nia De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315760, 'Santa F� De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315770, 'Santa Juliana', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315780, 'Santa Luzia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315800, 'Santa Maria De Itabira', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315820, 'Santa Maria Do Sua�u�', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315940, 'Santa Rita De Ibitipoca', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315930, 'Santa Rita De Jacutinga', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315950, 'Santa Rita Do Itueto', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315830, 'Santana Da Vargem', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315850, 'Santana De Pirapama', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315860, 'Santana Do Deserto', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315880, 'Santana Do Jacar�', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315895, 'Santana Do Para�so', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315900, 'Santana Do Riacho', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315990, 'Santo Ant�nio Do Amparo', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316010, 'Santo Ant�nio Do Grama', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316020, 'Santo Ant�nio Do Itamb�', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316040, 'Santo Ant�nio Do Monte', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316050, 'Santo Ant�nio Do Rio Abaixo', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316060, 'Santo Hip�lito', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316080, 'S�o Bento Abade', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316095, 'S�o Domingos Das Dores', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316100, 'S�o Domingos Do Prata', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316110, 'S�o Francisco', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316130, 'S�o Francisco De Sales', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316150, 'S�o Geraldo', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316160, 'S�o Geraldo Da Piedade', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316170, 'S�o Gon�alo Do Abaet�', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316180, 'S�o Gon�alo Do Par�', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312550, 'S�o Gon�alo Do Rio Preto', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316210, 'S�o Gotardo', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316220, 'S�o Jo�o Batista Do Gl�ria', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316230, 'S�o Jo�o Da Mata', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316245, 'S�o Jo�o Das Miss�es', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316250, 'S�o Jo�o Del Rei', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316257, 'S�o Jo�o Do Manteninha', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316265, 'S�o Jo�o Do Pacu�', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316270, 'S�o Jo�o Do Para�so', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316290, 'S�o Jo�o Nepomuceno', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316294, 'S�o Jos� Da Barra', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316295, 'S�o Jos� Da Lapa', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316310, 'S�o Jos� Da Varginha', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316330, 'S�o Jos� Do Divino', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316340, 'S�o Jos� Do Goiabal', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316360, 'S�o Jos� Do Mantimento', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316380, 'S�o Miguel Do Anta', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316390, 'S�o Pedro Da Uni�o', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316400, 'S�o Pedro Dos Ferros', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316420, 'S�o Rom�o', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316440, 'S�o Sebasti�o Da Bela Vista', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316447, 'S�o Sebasti�o Do Anta', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316450, 'S�o Sebasti�o Do Maranh�o', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316470, 'S�o Sebasti�o Do Para�so', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316490, 'S�o Sebasti�o Do Rio Verde', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316520, 'S�o Thom� Das Letras', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316500, 'S�o Tiago', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316530, 'S�o Vicente De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316550, 'Sardo�', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316553, 'Sarzedo', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316557, 'Senador Amaral', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316570, 'Senador Firmino', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316590, 'Senador Modestino Gon�alves', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316600, 'Senhora De Oliveira', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316620, 'Senhora Dos Rem�dios', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316640, 'Seritinga', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316650, 'Serra Azul De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316680, 'Serra Do Salitre', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316690, 'Serrania', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316700, 'Serranos', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316710, 'Serro', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316555, 'Setubinha', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316730, 'Silveir�nia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316750, 'Sim�o Pereira', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316770, 'Sobr�lia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316790, 'Tabuleiro', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316800, 'Taiobeiras', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251370, 'Santa Rita', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316820, 'Tapira�', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316840, 'Tarumirim', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316850, 'Teixeiras', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316870, 'Tim�teo', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316890, 'Tiros', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316900, 'Tocantins', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316910, 'Toledo', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316930, 'Tr�s Cora��es', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316940, 'Tr�s Pontas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316950, 'Tumiritinga', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316970, 'Turmalina', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316990, 'Ub�', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (317000, 'Uba�', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (317010, 'Uberaba', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (317030, 'Umburatiba', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (317043, 'Uni�o De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (317047, 'Uruana De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (317052, 'Urucuia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (317060, 'Vargem Bonita', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (317070, 'Varginha', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (317075, 'Varj�o De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (317090, 'Varzel�ndia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (317100, 'Vazante', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (317107, 'Veredinha', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (317115, 'Vermelho Novo', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (317130, 'Vi�osa', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (317140, 'Vieiras', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (317170, 'Virg�nia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (317190, 'Virgol�ndia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (317210, 'Volta Grande', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (317220, 'Wenceslau Braz', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500025, 'Alcin�polis', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500070, 'Anast�cio', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500080, 'Anauril�ndia', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500090, 'Ant�nio Jo�o', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500110, 'Aquidauana', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500150, 'Bandeirantes', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500190, 'Bataguassu', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500210, 'Bela Vista', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500220, 'Bonito', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500240, 'Caarap�', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500260, 'Camapu�', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500280, 'Caracol', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500295, 'Chapad�o Do Sul', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500310, 'Corguinho', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500320, 'Corumb�', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500330, 'Coxim', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500345, 'Deod�polis', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500350, 'Douradina', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500375, 'Eldorado', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500390, 'Figueir�o', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500400, 'Gl�ria De Dourados', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500430, 'Iguatemi', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500440, 'Inoc�ncia', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500460, 'Itaquira�', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500480, 'Japor�', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500500, 'Jardim', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500515, 'Juti', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500520, 'Lad�rio', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500540, 'Maracaju', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500568, 'Mundo Novo', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500580, 'Nioaque', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500620, 'Nova Andradina', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500625, 'Novo Horizonte Do Sul', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500635, 'Paranhos', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500660, 'Ponta Por�', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500710, 'Ribas Do Rio Pardo', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500720, 'Rio Brilhante', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500740, 'Rio Verde De Mato Grosso', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500755, 'Santa Rita Do Pardo', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500780, 'Selv�ria', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500770, 'Sete Quedas', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500793, 'Sonora', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251350, 'Santana De Mangueira', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500800, 'Terenos', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500840, 'Vicentina', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510020, '�gua Boa', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510030, 'Alto Araguaia', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510035, 'Alto Boa Vista', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510050, 'Alto Paraguai', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510080, 'Apiac�s', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510100, 'Araguaiana', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510125, 'Araputanga', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510140, 'Aripuan�', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510170, 'Barra Do Bugres', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510185, 'Bom Jesus Do Araguaia', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510190, 'Brasnorte', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510260, 'Campin�polis', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510267, 'Campo Verde', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510268, 'Campos De J�lio', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510270, 'Canarana', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510285, 'Castanheira', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510305, 'Cl�udia', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510310, 'Cocalinho', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510325, 'Colniza', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510330, 'Comodoro', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510337, 'Cotrigua�u', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510340, 'Cuiab�', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510345, 'Denise', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510360, 'Dom Aquino', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510380, 'Figueir�polis D`Oeste', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510385, 'Ga�cha Do Norte', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510395, 'Gl�ria D`Oeste', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510420, 'Guiratinga', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510452, 'Ipiranga Do Norte', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510454, 'Itanhang�', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510460, 'Itiquira', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510490, 'Jangada', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510510, 'Juara', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510515, 'Ju�na', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510520, 'Juscimeira', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510525, 'Lucas Do Rio Verde', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510558, 'Marcel�ndia', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510560, 'Matup�', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510590, 'Nobres', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510610, 'Nossa Senhora Do Livramento', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510620, 'Nova Brasil�ndia', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510621, 'Nova Cana� Do Norte', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510618, 'Nova Lacerda', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510890, 'Nova Maring�', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510622, 'Nova Mutum', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510617, 'Nova Nazar�', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510619, 'Nova Santa Helena', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510625, 'Nova Xavantina', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510626, 'Novo Mundo', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510631, 'Novo Santo Ant�nio', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510629, 'Parana�ta', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510637, 'Pedra Preta', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510645, 'Planalto Da Serra', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510650, 'Pocon�', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510670, 'Ponte Branca', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510677, 'Porto Alegre Do Norte', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510682, 'Porto Esperidi�o', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510685, 'Porto Estrela', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510704, 'Primavera Do Leste', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510715, 'Reserva Do Caba�al', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510719, 'Ribeir�ozinho', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510720, 'Rio Branco', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510760, 'Rondon�polis', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510775, 'Salto Do C�u', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510724, 'Santa Carmem', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510776, 'Santa Rita Do Trivelato', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510726, 'Santo Afonso', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510780, 'Santo Ant�nio Do Leverger', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251392, 'S�o Bentinho', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510735, 'S�o Jos� Do Xingu', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510740, 'S�o Pedro Da Cipa', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510787, 'Sapezal', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510788, 'Serra Nova Dourada', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510792, 'Sorriso', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510795, 'Tangar� Da Serra', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510805, 'Terra Nova Do Norte', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510810, 'Tesouro', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510830, 'Uni�o Do Sul', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510840, 'V�rzea Grande', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510850, 'Vera', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510860, 'Vila Rica', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150013, 'Abel Figueiredo', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150030, 'Afu�', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150034, '�gua Azul Do Norte', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150050, 'Almeirim', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150070, 'Anaj�s', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150085, 'Anapu', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150095, 'Aurora Do Par�', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150100, 'Aveiro', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150120, 'Bai�o', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150130, 'Barcarena', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150140, 'Bel�m', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150150, 'Benevides', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150160, 'Bonito', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150172, 'Brasil Novo', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150178, 'Breu Branco', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150180, 'Breves', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150200, 'Cachoeira Do Arari', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150210, 'Camet�', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150215, 'Cana� Dos Caraj�s', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150230, 'Capit�o Po�o', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150250, 'Chaves', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150270, 'Concei��o Do Araguaia', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150275, 'Conc�rdia Do Par�', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150277, 'Curion�polis', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150285, 'Curu�', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150293, 'Dom Eliseu', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150300, 'Faro', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150304, 'Floresta Do Araguaia', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150309, 'Goian�sia Do Par�', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150310, 'Gurup�', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150330, 'Igarap� Miri', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150345, 'Ipixuna Do Par�', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150360, 'Itaituba', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150370, 'Itupiranga', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150380, 'Jacund�', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150400, 'Limoeiro Do Ajuru', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150410, 'Magalh�es Barata', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150430, 'Maracan�', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150440, 'Marapanim', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150445, 'Medicil�ndia', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150460, 'Mocajuba', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150480, 'Monte Alegre', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150490, 'Muan�', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150497, 'Nova Ipixuna', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150503, 'Novo Progresso', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150510, '�bidos', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150520, 'Oeiras Do Par�', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150540, 'Our�m', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150548, 'Pacaj�', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150549, 'Palestina Do Par�', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150553, 'Parauapebas', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150560, 'Peixe Boi', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150563, 'Pi�arra', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150570, 'Ponta De Pedras', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150590, 'Porto De Moz', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150610, 'Primavera', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150613, 'Reden��o', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150616, 'Rio Maria', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150619, 'Rur�polis', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150630, 'Salvaterra', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260795, 'Jaqueira', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150655, 'Santa Luzia Do Par�', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150658, 'Santa Maria Das Barreiras', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150670, 'Santana Do Araguaia', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150680, 'Santar�m', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150700, 'Santo Ant�nio Do Tau�', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150715, 'S�o Domingos Do Araguaia', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150730, 'S�o F�lix Do Xingu', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150740, 'S�o Francisco Do Par�', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150746, 'S�o Jo�o Da Ponta', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150750, 'S�o Jo�o Do Araguaia', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150760, 'S�o Miguel Do Guam�', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150775, 'Sapucaia', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150780, 'Senador Jos� Porf�rio', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150795, 'Tail�ndia', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150797, 'Terra Santa', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150800, 'Tom� A�u', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150805, 'Trair�o', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150810, 'Tucuru�', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150815, 'Uruar�', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150820, 'Vigia', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150835, 'Vit�ria Do Xingu', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250010, '�gua Branca', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250030, 'Alagoa Grande', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250050, 'Alagoinha', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250057, 'Algod�o De Janda�ra', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250060, 'Alhandra', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250077, 'Aparecida', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250090, 'Arara', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250110, 'Areia', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250120, 'Areial', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250130, 'Aroeiras', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250140, 'Ba�a Da Trai��o', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250153, 'Bara�na', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250157, 'Barra De Santana', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250170, 'Barra De S�o Miguel', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250190, 'Bel�m', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250205, 'Bernardino Batista', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250210, 'Boa Ventura', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250220, 'Bom Jesus', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250240, 'Bonito De Santa F�', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250270, 'Borborema', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250280, 'Brejo Do Cruz', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250300, 'Caapor�', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250320, 'Cabedelo', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250340, 'Cacimba De Areia', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250350, 'Cacimba De Dentro', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250360, 'Cai�ara', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250375, 'Cajazeirinhas', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250390, 'Camala�', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250400, 'Campina Grande', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250407, 'Cara�bas', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250415, 'Casserengue', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250430, 'Catol� Do Rocha', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250435, 'Caturit�', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250450, 'Condado', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250470, 'Congo', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250485, 'Coxixola', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250500, 'Cubati', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250510, 'Cuit�', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250520, 'Cuitegi', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250530, 'Curral Velho', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250535, 'Dami�o', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250560, 'Diamante', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250570, 'Dona In�s', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250590, 'Emas', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250610, 'Fagundes', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250625, 'Gado Bravo', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250630, 'Guarabira', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250650, 'Gurj�o', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250260, 'Igaracy', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250680, 'Ing�', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250690, 'Itabaiana', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251240, 'Puxinan�', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251250, 'Queimadas', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251270, 'Rem�gio', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251275, 'Riach�o Do Bacamarte', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251276, 'Riach�o Do Po�o', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251280, 'Riacho Dos Cavalos', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251290, 'Rio Tinto', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251310, 'Salgado De S�o F�lix', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251320, 'Santa Cruz', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251335, 'Santa In�s', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251340, 'Santa Luzia', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251380, 'Santa Teresinha', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251360, 'Santana Dos Garrotes', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251385, 'Santo Andr�', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251390, 'S�o Bento', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251394, 'S�o Domingos Do Cariri', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251398, 'S�o Francisco', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250070, 'S�o Jo�o Do Rio Do Peixe', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251410, 'S�o Jo�o Do Tigre', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251430, 'S�o Jos� De Caiana', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251450, 'S�o Jos� De Piranhas', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251455, 'S�o Jos� De Princesa', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251465, 'S�o Jos� Do Brejo Do Cruz', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251470, 'S�o Jos� Do Sabugi', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251445, 'S�o Jos� Dos Ramos', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251490, 'S�o Mamede', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251510, 'S�o Sebasti�o De Lagoa De Ro�a', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251530, 'Sap�', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250730, 'Jacara�', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250750, 'Jo�o Pessoa', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250760, 'Juarez T�vora', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250770, 'Juazeirinho', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250790, 'Juripiranga', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250800, 'Juru', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250820, 'Lagoa De Dentro', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250840, 'Lastro', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250855, 'Logradouro', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250870, 'M�e D`�gua', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250880, 'Malta', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250900, 'Mana�ra', '2017-09-10', 25, true);\r\n" + 
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
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251272, 'Pedro R�gis', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251130, 'Pianc�', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251150, 'Pilar', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251170, 'Pil�ezinhos', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251190, 'Pitimbu', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251200, 'Pocinhos', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251207, 'Po�o De Jos� De Moura', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251220, 'Prata', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251540, 'Serid�', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251560, 'Serra Da Raiz', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251570, 'Serra Grande', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251590, 'Serraria', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251597, 'Sobrado', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251600, 'Sol�nea', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251615, 'Soss�go', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251630, 'Sum�', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251650, 'Tapero�', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251660, 'Tavares', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251680, 'Triunfo', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251700, 'Umbuzeiro', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251710, 'V�rzea', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250550, 'Vista Serrana', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260005, 'Abreu E Lima', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260020, 'Afr�nio', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260030, 'Agrestina', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260050, '�guas Belas', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260070, 'Alian�a', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260090, 'Amaraji', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260100, 'Angelim', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260110, 'Araripina', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260130, 'Barra De Guabiraba', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260150, 'Bel�m De Maria', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260170, 'Belo Jardim', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260180, 'Bet�nia', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260200, 'Bodoc�', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260220, 'Bom Jardim', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260230, 'Bonito', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260250, 'Brejinho', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260270, 'Buenos Aires', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260280, 'Bu�que', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260300, 'Cabrob�', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260320, 'Caet�s', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260330, 'Cal�ado', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260345, 'Camaragibe', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260360, 'Camutanga', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260370, 'Canhotinho', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260390, 'Carna�ba', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260400, 'Carpina', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260410, 'Caruaru', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260420, 'Catende', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260440, 'Ch� De Alegria', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260460, 'Condado', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260480, 'Cort�s', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260490, 'Cumaru', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260510, 'Cust�dia', '2017-09-10', 26, true);\r\n" + 
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
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260700, 'Inaj�', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260710, 'Ingazeira', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260730, 'Ipubi', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260750, 'Ita�ba', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260770, 'Itapetim', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260775, 'Itapissuma', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260790, 'Jaboat�o Dos Guararapes', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260800, 'Jata�ba', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260810, 'Jo�o Alfredo', '2017-09-10', 26, true);\r\n" + 
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
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260950, 'Nazar� Da Mata', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260970, 'Orob�', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260990, 'Ouricuri', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261000, 'Palmares', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261020, 'Panelas', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261040, 'Parnamirim', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261060, 'Paudalho', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355630, 'Valpara�so', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261090, 'Pesqueira', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261100, 'Petrol�ndia', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261120, 'Po��o', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261140, 'Primavera', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261153, 'Quixaba', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261160, 'Recife', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261180, 'Ribeir�o', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261200, 'Sair�', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261220, 'Salgueiro', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261230, 'Salo�', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261245, 'Santa Cruz', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261250, 'Santa Cruz Do Capibaribe', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261260, 'Santa Maria Da Boa Vista', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261270, 'Santa Maria Do Cambuc�', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261290, 'S�o Benedito Do Sul', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261310, 'S�o Caitano', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261320, 'S�o Jo�o', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261340, 'S�o Jos� Da Coroa Grande', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261360, 'S�o Jos� Do Egito', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261380, 'S�o Vicente Ferrer', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261390, 'Serra Talhada', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261410, 'Sert�nia', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261440, 'Solid�o', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261450, 'Surubim', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261470, 'Tacaimb�', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261485, 'Tamandar�', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261510, 'Terezinha', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261520, 'Terra Nova', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261540, 'Toritama', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261560, 'Trindade', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261580, 'Tupanatinga', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261590, 'Tuparetama', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261610, 'Verdejante', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261620, 'Vertentes', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261640, 'Vit�ria De Santo Ant�o', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261650, 'Xex�u', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220010, 'Agricol�ndia', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220025, 'Alagoinha Do Piau�', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220030, 'Alto Long�', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220040, 'Altos', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220050, 'Amarante', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220070, 'An�sio De Abreu', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220090, 'Aroazes', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220095, 'Aroeiras Do Itaim', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220105, 'Assun��o Do Piau�', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220110, 'Avelino Lopes', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220117, 'Barra D`Alc�ntara', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220130, 'Barreiras Do Piau�', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220150, 'Batalha', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220157, 'Bel�m Do Piau�', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220160, 'Beneditinos', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220173, 'Bet�nia Do Piau�', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220177, 'Boa Hora', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220190, 'Bom Jesus', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220192, 'Bonfim Do Piau�', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220196, 'Brasileira', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220198, 'Brejo Do Piau�', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220202, 'Buriti Dos Montes', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220207, 'Cajazeiras Do Piau�', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220208, 'Cajueiro Da Praia', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220210, 'Campinas Do Piau�', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220211, 'Campo Alegre Do Fidalgo', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220217, 'Campo Largo Do Piau�', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220220, 'Campo Maior', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220240, 'Capit�o De Campos', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220245, 'Capit�o Gerv�sio Oliveira', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220253, 'Cara�bas Do Piau�', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220260, 'Castelo Do Piau�', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220265, 'Caxing�', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220271, 'Cocal De Telha', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220273, 'Coivaras', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355640, 'Vargem Grande Do Sul', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220285, 'Coronel Jos� Dias', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220290, 'Corrente', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220310, 'Cristino Castro', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220323, 'Currais', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220325, 'Curralinhos', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220330, 'Demerval Lob�o', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220340, 'Dom Expedito Lopes', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220342, 'Domingos Mour�o', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220360, 'Eliseu Martins', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220370, 'Esperantina', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220380, 'Flores Do Piau�', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220390, 'Floriano', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220410, 'Francisco Ayres', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220415, 'Francisco Macedo', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220430, 'Fronteiras', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220440, 'Gilbu�s', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220450, 'Guadalupe', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220460, 'Hugo Napole�o', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220470, 'Inhuma', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220490, 'Isa�as Coelho', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220510, 'Itaueira', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220515, 'Jacobina Do Piau�', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220525, 'Jardim Do Mulato', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220530, 'Jerumenha', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220535, 'Jo�o Costa', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220545, 'Joca Marques', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220551, 'Juazeiro Do Piau�', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220553, 'Jurema', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220555, 'Lagoa Alegre', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220556, 'Lagoa Do Barro Do Piau�', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220559, 'Lagoa Do S�tio', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220554, 'Lagoinha Do Piau�', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220570, 'Lu�s Correia', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220585, 'Madeiro', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220595, 'Marcol�ndia', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220600, 'Marcos Parente', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220610, 'Matias Ol�mpio', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220630, 'Miguel Le�o', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220640, 'Monsenhor Gil', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220650, 'Monsenhor Hip�lito', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220665, 'Morro Cabe�a No Tempo', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220669, 'Murici Dos Portelas', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220670, 'Nazar� Do Piau�', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220675, 'Nossa Senhora De Nazar�', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220795, 'Nova Santa Rita', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220690, 'Novo Oriente Do Piau�', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220700, 'Oeiras', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220720, 'Padre Marcos', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220730, 'Paes Landim', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220740, 'Palmeira Do Piau�', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220750, 'Palmeirais', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220760, 'Parnagu�', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220775, 'Passagem Franca Do Piau�', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220779, 'Pau D`Arco Do Piau�', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220785, 'Pavussu', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220790, 'Pedro Ii', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220800, 'Picos', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220820, 'Pio Ix', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220840, 'Piripiri', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220850, 'Porto', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220860, 'Prata Do Piau�', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220870, 'Reden��o Do Gurgu�ia', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220885, 'Riacho Frio', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220887, 'Ribeira Do Piau�', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220900, 'Rio Grande Do Piau�', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220915, 'Santa Cruz Dos Milagres', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220920, 'Santa Filomena', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220937, 'Santa Rosa Do Piau�', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220940, 'Santo Ant�nio De Lisboa', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410590, 'Colorado', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220955, 'S�o Braz Do Piau�', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220965, 'S�o Francisco De Assis Do Piau�', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220975, 'S�o Gon�alo Do Gurgu�ia', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220985, 'S�o Jo�o Da Canabrava', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220987, 'S�o Jo�o Da Fronteira', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220995, 'S�o Jo�o Da Varjota', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (221000, 'S�o Jo�o Do Piau�', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (221005, 'S�o Jos� Do Divino', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (221020, 'S�o Jos� Do Piau�', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (221030, 'S�o Juli�o', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (221037, 'S�o Luis Do Piau�', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (221039, 'S�o Miguel Do Fidalgo', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (221040, 'S�o Miguel Do Tapuio', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (221060, 'S�o Raimundo Nonato', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (221063, 'Sebasti�o Leal', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (221065, 'Sigefredo Pacheco', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (221080, 'Simpl�cio Mendes', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (221093, 'Sussuapara', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (221097, 'Tanque Do Piau�', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (221100, 'Teresina', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (221120, 'Uru�u�', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (221135, 'V�rzea Branca', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (221150, 'Vera Mendes', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (221160, 'Vila Nova Do Piau�', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410010, 'Abati�', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410030, 'Agudos Do Sul', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410045, 'Altamira Do Paran�', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412862, 'Alto Para�so', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410070, 'Alto Piquiri', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410050, 'Alt�nia', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410090, 'Amapor�', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410105, 'Anahy', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410115, '�ngulo', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410120, 'Antonina', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410140, 'Apucarana', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410160, 'Arapoti', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410170, 'Araruna', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410180, 'Arauc�ria', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410190, 'Assa�', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410210, 'Astorga', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410230, 'Balsa Nova', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410240, 'Bandeirantes', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410270, 'Barra Do Jacar�', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410275, 'Bela Vista Da Caroba', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410290, 'Bituruna', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410300, 'Boa Esperan�a', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410304, 'Boa Ventura De S�o Roque', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410310, 'Bocai�va Do Sul', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410315, 'Bom Jesus Do Sul', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410322, 'Bom Sucesso Do Sul', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410335, 'Braganey', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410337, 'Brasil�ndia Do Sul', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410345, 'Cafel�ndia', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410350, 'Calif�rnia', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410370, 'Camb�', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410380, 'Cambira', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410395, 'Campina Do Sim�o', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410405, 'Campo Bonito', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410420, 'Campo Largo', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410425, 'Campo Magro', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410440, 'C�ndido De Abreu', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410445, 'Cantagalo', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410450, 'Capanema', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410465, 'Carambe�', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410480, 'Cascavel', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410490, 'Castro', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410510, 'Centen�rio Do Sul', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410530, 'C�u Azul', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410550, 'Cianorte', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410570, 'Clevel�ndia', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410580, 'Colombo', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355660, 'Vera Cruz', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410620, 'Contenda', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410640, 'Corn�lio Proc�pio', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410650, 'Coronel Vivida', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410655, 'Corumbata� Do Sul', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410657, 'Cruzeiro Do Igua�u', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410670, 'Cruzeiro Do Sul', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410685, 'Cruzmaltina', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410700, 'Curi�va', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410710, 'Diamante Do Norte', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410720, 'Dois Vizinhos', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410725, 'Douradina', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412863, 'Doutor Ulysses', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410750, 'Engenheiro Beltr�o', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410753, 'Entre Rios Do Oeste', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410754, 'Espig�o Alto Do Igua�u', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410760, 'Faxinal', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410770, 'F�nix', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410773, 'Fernandes Pinheiro', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410785, 'Flor Da Serra Do Sul', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410790, 'Floresta', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410810, 'Fl�rida', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410830, 'Foz Do Igua�u', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410845, 'Foz Do Jord�o', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410840, 'Francisco Beltr�o', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410855, 'Godoy Moreira', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410860, 'Goioer�', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410870, 'Grandes Rios', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410890, 'Guaira��', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410900, 'Guapirama', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410910, 'Guaporema', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410930, 'Guarania�u', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410950, 'Guaraque�aba', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410965, 'Hon�rio Serpa', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410975, 'Ibema', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410980, 'Ibipor�', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411000, 'Iguara�u', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411007, 'Imba�', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411020, 'In�cio Martins', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411040, 'Indian�polis', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411050, 'Ipiranga', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411065, 'Iracema Do Oeste', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411080, 'Iretama', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411095, 'Itaipul�ndia', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411110, 'Itamb�', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411125, 'Itaperu�u', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411130, 'Ita�na Do Sul', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411150, 'Ivaipor�', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411160, 'Ivatuba', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411170, 'Jaboti', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411190, 'Jaguapit�', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411210, 'Jandaia Do Sul', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411230, 'Japira', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411250, 'Jardim Alegre', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411270, 'Jataizinho', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411275, 'Jesu�tas', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411290, 'Jundia� Do Sul', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411300, 'Jussara', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411310, 'Kalor�', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411325, 'Laranjal', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411340, 'Le�polis', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411345, 'Lindoeste', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411350, 'Loanda', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411370, 'Londrina', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411375, 'Lunardelli', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411390, 'Mallet', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411400, 'Mambor�', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411420, 'Mandaguari', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411435, 'Manfrin�polis', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411450, 'Manoel Ribas', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411470, 'Maria Helena', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411480, 'Marialva', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411500, 'Marilena', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (172085, 'Sucupira', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411530, 'Mari�polis', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411540, 'Marmeleiro', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411550, 'Marumbi', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411560, 'Matel�ndia', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411573, 'Mato Rico', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411580, 'Medianeira', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411590, 'Mirador', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411600, 'Miraselva', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411610, 'Moreira Sales', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411630, 'Munhoz De Melo', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411650, 'Nova Alian�a Do Iva�', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411670, 'Nova Aurora', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411680, 'Nova Cantu', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411695, 'Nova Esperan�a Do Sudoeste', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411705, 'Nova Laranjeiras', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411720, 'Nova Ol�mpia', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411725, 'Nova Prata Do Igua�u', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411722, 'Nova Santa Rosa', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411727, 'Nova Tebas', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411730, 'Ortigueira', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411745, 'Ouro Verde Do Oeste', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411760, 'Palmas', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411770, 'Palmeira', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411790, 'Palotina', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411810, 'Paranacity', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411830, 'Paranapoema', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411840, 'Paranava�', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411850, 'Pato Branco', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411870, 'Paulo Frontin', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411885, 'Perobal', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411890, 'P�rola', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411910, 'Pi�n', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411925, 'Pinhal De S�o Bento', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411930, 'Pinh�o', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411940, 'Pira� Do Sul', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411960, 'Pitanga', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411970, 'Planaltina Do Paran�', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411990, 'Ponta Grossa', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411995, 'Pontal Do Paran�', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412010, 'Porto Amazonas', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412020, 'Porto Rico', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412033, 'Prado Ferreira', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412035, 'Pranchita', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412050, 'Primeiro De Maio', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412065, 'Quarto Centen�rio', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412080, 'Quatro Barras', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412090, 'Quedas Do Igua�u', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412100, 'Quer�ncia Do Norte', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412120, 'Quitandinha', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412130, 'Rancho Alegre', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412140, 'Realeza', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412150, 'Rebou�as', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412170, 'Reserva', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412180, 'Ribeir�o Claro', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412200, 'Rio Azul', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412210, 'Rio Bom', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412217, 'Rio Branco Do Iva�', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412220, 'Rio Branco Do Sul', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412240, 'Rol�ndia', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412260, 'Rondon', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412270, 'Sab�udia', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412280, 'Salgado Filho', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412300, 'Salto Do Lontra', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412320, 'Santa Cec�lia Do Pav�o', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412340, 'Santa F�', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412350, 'Santa Helena', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412370, 'Santa Isabel Do Iva�', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412382, 'Santa L�cia', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412385, 'Santa Maria Do Oeste', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412395, 'Santa M�nica', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412405, 'Santa Terezinha De Itaipu', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412420, 'Santo Ant�nio Do Caiu�', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412430, 'Santo Ant�nio Do Para�so', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412450, 'Santo In�cio', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412470, 'S�o Jer�nimo Da Serra', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412480, 'S�o Jo�o', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412500, 'S�o Jo�o Do Iva�', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412510, 'S�o Jo�o Do Triunfo', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412530, 'S�o Jorge Do Iva�', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412540, 'S�o Jos� Da Boa Vista', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412545, 'S�o Jos� Das Palmeiras', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412555, 'S�o Manoel Do Paran�', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412560, 'S�o Mateus Do Sul', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412575, 'S�o Pedro Do Igua�u', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412590, 'S�o Pedro Do Paran�', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412610, 'S�o Tom�', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412620, 'Sapopema', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412627, 'Saudade Do Igua�u', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412630, 'Seng�s', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412640, 'Sertaneja', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412660, 'Siqueira Campos', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412665, 'Sulina', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412670, 'Tamboara', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412690, 'Tapira', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412710, 'Tel�maco Borba', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412720, 'Terra Boa', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412740, 'Terra Roxa', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412760, 'Tijucas Do Sul', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412780, 'Tomazina', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412788, 'Tunas Do Paran�', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412790, 'Tuneiras Do Oeste', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412796, 'Turvo', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412810, 'Umuarama', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412830, 'Uniflor', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412840, 'Ura�', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412855, 'Vera Cruz Do Oeste', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412865, 'Virmond', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412870, 'Vitorino', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412880, 'Xambr�', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330015, 'Aperib�', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330020, 'Araruama', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330023, 'Arma��o Dos B�zios', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330030, 'Barra Do Pira�', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330045, 'Belford Roxo', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330050, 'Bom Jardim', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330070, 'Cabo Frio', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330090, 'Cambuci', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330100, 'Campos Dos Goytacazes', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330093, 'Carapebus', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330120, 'Carmo', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330130, 'Casimiro De Abreu', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330140, 'Concei��o De Macabu', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330160, 'Duas Barras', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330180, 'Engenheiro Paulo De Frontin', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330185, 'Guapimirim', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330190, 'Itabora�', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330200, 'Itagua�', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330210, 'Itaocara', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330225, 'Itatiaia', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330230, 'Laje Do Muria�', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330240, 'Maca�', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330250, 'Mag�', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330270, 'Maric�', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330285, 'Mesquita', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330300, 'Miracema', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330310, 'Natividade', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330330, 'Niter�i', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330350, 'Nova Igua�u', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330360, 'Paracambi', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330380, 'Parati', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330390, 'Petr�polis', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330400, 'Pira�', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330410, 'Porci�ncula', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330415, 'Quissam�', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330430, 'Rio Bonito', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330450, 'Rio Das Flores', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330455, 'Rio De Janeiro', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330460, 'Santa Maria Madalena', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330480, 'S�o Fid�lis', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330490, 'S�o Gon�alo', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330500, 'S�o Jo�o Da Barra', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330513, 'S�o Jos� De Ub�', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330515, 'S�o Jos� Do Vale Do Rio Preto', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330530, 'S�o Sebasti�o Do Alto', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330540, 'Sapucaia', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330555, 'Serop�dica', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330570, 'Sumidouro', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330575, 'Tangu�', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330590, 'Trajano De Moraes', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330610, 'Valen�a', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330615, 'Varre Sai', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240010, 'Acari', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240020, 'A�u', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240040, '�gua Nova', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240050, 'Alexandria', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240070, 'Alto Do Rodrigues', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240090, 'Ant�nio Martins', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240110, 'Areia Branca', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240130, 'Augusto Severo', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240145, 'Bara�na', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240150, 'Barcelona', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240165, 'Bod�', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240180, 'Brejinho', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240190, 'Cai�ara Do Rio Do Vento', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240200, 'Caic�', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240220, 'Canguaretama', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240240, 'Carna�ba Dos Dantas', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240260, 'Cear� Mirim', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240270, 'Cerro Cor�', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240290, 'Coronel Jo�o Pessoa', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240310, 'Currais Novos', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240330, 'Encanto', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240340, 'Equador', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240360, 'Extremoz', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240375, 'Fernando Pedroza', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240390, 'Francisco Dantas', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240410, 'Galinhos', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240420, 'Goianinha', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240440, 'Grossos', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240450, 'Guamar�', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240470, 'Ipangua�u', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240485, 'Itaj�', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240500, 'Ja�an�', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240510, 'Janda�ra', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240530, 'Janu�rio Cicco', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240550, 'Jardim De Angicos', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240570, 'Jardim Do Serid�', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240590, 'Jo�o Dias', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240600, 'Jos� Da Penha', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240615, 'Jundi�', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240630, 'Lagoa De Pedras', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240640, 'Lagoa De Velhos', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240660, 'Lagoa Salgada', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240680, 'Lajes Pintadas', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240700, 'Lu�s Gomes', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240720, 'Macau', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240725, 'Major Sales', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240740, 'Martins', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240760, 'Messias Targino', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240780, 'Monte Alegre', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240800, 'Mossor�', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240810, 'Natal', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240830, 'Nova Cruz', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240850, 'Ouro Branco', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240860, 'Paran�', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240890, 'Parelhas', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240910, 'Passa E Fica', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240930, 'Patu', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240950, 'Pedra Grande', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240960, 'Pedra Preta', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240980, 'Pedro Velho', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240990, 'Pend�ncias', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241020, 'Portalegre', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241025, 'Porto Do Mangue', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241040, 'Pureza', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241050, 'Rafael Fernandes', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241070, 'Riacho Da Cruz', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241090, 'Riachuelo', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240895, 'Rio Do Fogo', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241110, 'Ruy Barbosa', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240933, 'Santa Maria', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241142, 'Santana Do Serid�', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241160, 'S�o Bento Do Norte', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241170, 'S�o Bento Do Trair�', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241190, 'S�o Francisco Do Oeste', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241210, 'S�o Jo�o Do Sabugi', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241220, 'S�o Jos� De Mipibu', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241240, 'S�o Jos� Do Serid�', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241255, 'S�o Miguel Do  Gostoso', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241270, 'S�o Pedro', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241280, 'S�o Rafael', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241300, 'S�o Vicente', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241320, 'Senador Georgino Avelino', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241330, 'Serra De S�o Bento', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241340, 'Serra Negra Do Norte', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241355, 'Serrinha Dos Pintos', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241370, 'S�tio Novo', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241380, 'Taboleiro Grande', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241400, 'Tangar�', '2017-09-10', 24, true);\r\n" + 
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
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110009, 'Espig�o D`Oeste', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110010, 'Guajar� Mirim', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110110, 'Itapu� Do Oeste', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110012, 'Ji Paran�', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110120, 'Ministro Andreazza', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110140, 'Monte Negro', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110014, 'Nova Brasil�ndia D`Oeste', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110143, 'Nova Uni�o', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110015, 'Ouro Preto Do Oeste', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110145, 'Parecis', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110146, 'Pimenteiras Do Oeste', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110025, 'Presidente M�dici', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110026, 'Rio Crespo', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110028, 'Rolim De Moura', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110148, 'S�o Felipe D`Oeste', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110032, 'S�o Miguel Do Guapor�', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110150, 'Seringueiras', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110160, 'Theobroma', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110170, 'Urup�', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355690, 'Vista Alegre Do Alto', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110030, 'Vilhena', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (140005, 'Alto Alegre', '2017-09-10', 14, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (140010, 'Boa Vista', '2017-09-10', 14, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (140017, 'Cant�', '2017-09-10', 14, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (140023, 'Caroebe', '2017-09-10', 14, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (140030, 'Mucaja�', '2017-09-10', 14, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (140040, 'Normandia', '2017-09-10', 14, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (140047, 'Rorain�polis', '2017-09-10', 14, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (140060, 'S�o Luiz', '2017-09-10', 14, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (140070, 'Uiramut�', '2017-09-10', 14, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430005, '�gua Santa', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430020, 'Ajuricaba', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430040, 'Alegrete', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430047, 'Almirante Tamandar� Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430055, 'Alto Alegre', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430060, 'Alvorada', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430063, 'Amaral Ferrador', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430066, 'Andr� Da Rocha', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430080, 'Ant�nio Prado', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430087, 'Araric�', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430090, 'Aratiba', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430107, 'Arroio Do Padre', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430120, 'Arroio Do Tigre', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430110, 'Arroio Dos Ratos', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430140, 'Arvorezinha', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430155, '�urea', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430160, 'Bag�', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430165, 'Bar�o', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430175, 'Bar�o Do Triunfo', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430187, 'Barra Do Quara�', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430190, 'Barra Do Ribeiro', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430195, 'Barra Funda', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430180, 'Barrac�o', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430205, 'Benjamin Constant Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430215, 'Boa Vista Das Miss�es', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430222, 'Boa Vista Do Cadeado', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430223, 'Boa Vista Do Incra', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430230, 'Bom Jesus', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430237, 'Bom Progresso', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430240, 'Bom Retiro Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430250, 'Bossoroca', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430260, 'Braga', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430265, 'Brochier', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430280, 'Ca�apava Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430300, 'Cachoeira Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430320, 'Cacique Doble', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430330, 'Caibat�', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430350, 'Camaqu�', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430360, 'Cambar� Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430370, 'Campina Das Miss�es', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430390, 'Campo Bom', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430400, 'Campo Novo', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430420, 'Candel�ria', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430435, 'Candiota', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430440, 'Canela', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430460, 'Canoas', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430462, 'Cap�o Bonito Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430465, 'Cap�o Do Cip�', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430466, 'Cap�o Do Le�o', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430469, 'Capit�o', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430471, 'Cara�', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430470, 'Carazinho', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430485, 'Carlos Gomes', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430495, 'Caseiros', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430500, 'Catu�pe', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430511, 'Centen�rio', '2017-09-10', 43, true);\r\n" + 
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
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430595, 'Cotipor�', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430600, 'Crissiumal', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430607, 'Cristal Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430613, 'Cruzaltense', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430630, 'David Canabarro', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430632, 'Derrubadas', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430637, 'Dilermando De Aguiar', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430642, 'Dois Irm�os Das Miss�es', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430645, 'Dois Lajeados', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430660, 'Dom Pedrito', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430670, 'Dona Francisca', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430673, 'Doutor Maur�cio Cardoso', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430676, 'Eldorado Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430680, 'Encantado', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430692, 'Engenho Velho', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430693, 'Entre Iju�s', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430700, 'Erechim', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430705, 'Ernestina', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430730, 'Erval Seco', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430745, 'Esperan�a Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430755, 'Esta��o', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430770, 'Esteio', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430780, 'Estrela', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430783, 'Eug�nio De Castro', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430790, 'Farroupilha', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430800, 'Faxinal Do Soturno', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430807, 'Fazenda Vilanova', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430820, 'Flores Da Cunha', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430830, 'Fontoura Xavier', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430840, 'Formigueiro', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430845, 'Fortaleza Dos Valos', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430860, 'Garibaldi', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430865, 'Garruchos', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430880, 'General C�mara', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430890, 'Get�lio Vargas', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430905, 'Glorinha', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430910, 'Gramado', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430915, 'Gramado Xavier', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430925, 'Guabiju', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430940, 'Guapor�', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430955, 'Harmonia', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430710, 'Herval', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430960, 'Horizontina', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430965, 'Hulha Negra', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430975, 'Ibarama', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430990, 'Ibiraiaras', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431000, 'Ibirub�', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431020, 'Iju�', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431030, 'Il�polis', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431036, 'Imigrante', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431041, 'Inhacor�', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431043, 'Ip�', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431050, 'Ira�', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431055, 'Itacurubi', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431060, 'Itaqui', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431065, 'Itati', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431075, 'Ivor�', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431085, 'Jaboticaba', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431090, 'Jacutinga', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431100, 'Jaguar�o', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431112, 'Jaquirana', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431115, 'J�ia', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431123, 'Lagoa Bonita Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431130, 'Lagoa Vermelha', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431125, 'Lago�o', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431142, 'Lajeado Do Bugre', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431160, 'Liberato Salzano', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431162, 'Lindolfo Collor', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355700, 'Votorantim', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431170, 'Machadinho', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431175, 'Manoel Viana', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431179, 'Marat�', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431180, 'Marau', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431198, 'Mariana Pimentel', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431205, 'Marques De Souza', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431210, 'Mata', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431215, 'Mato Leit�o', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431220, 'Maximiliano De Almeida', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431225, 'Minas Do Le�o', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431235, 'Montauri', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431238, 'Monte Belo Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431240, 'Montenegro', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431244, 'Morrinhos Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431247, 'Morro Reuter', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431260, 'Mu�um', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431262, 'Muliterno', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431265, 'N�o Me Toque', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431270, 'Nonoai', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431280, 'Nova Ara��', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431290, 'Nova Bassano', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431300, 'Nova Br�scia', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431303, 'Nova Esperan�a Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431306, 'Nova Hartz', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431310, 'Nova Palma', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431330, 'Nova Prata', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431335, 'Nova Roma Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431349, 'Novo Barreiro', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431339, 'Novo Cabrais', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431342, 'Novo Machado', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431346, 'Novo Xingu', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431350, 'Os�rio', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431365, 'Palmares Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431380, 'Palmitinho', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431390, 'Panambi', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431400, 'Para�', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431403, 'Pareci Novo', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431405, 'Parob�', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431410, 'Passo Fundo', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431413, 'Paulo Bento', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431417, 'Pedras Altas', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431430, 'Peju�ara', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431440, 'Pelotas', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431445, 'Pinhal', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431447, 'Pinhal Grande', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431449, 'Pinheirinho Do Vale', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431455, 'Pirap�', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431470, 'Planalto', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431477, 'Pont�o', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431478, 'Ponte Preta', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431490, 'Porto Alegre', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431505, 'Porto Mau�', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431510, 'Porto Xavier', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431513, 'Pouso Novo', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431515, 'Progresso', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431520, 'Putinga', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431530, 'Quara�', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431532, 'Quevedos', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431540, 'Redentora', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431545, 'Relvado', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431555, 'Rio Dos �ndios', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431570, 'Rio Pardo', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431580, 'Roca Sales', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431590, 'Rodeio Bonito', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431600, 'Rolante', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431620, 'Rondinha', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431640, 'Ros�rio Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431642, 'Sagrada Fam�lia', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431645, 'Salto Do Jacu�', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431650, 'Salvador Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431660, 'Sananduva', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431673, 'Santa Cec�lia Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431690, 'Santa Maria', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431720, 'Santa Rosa', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431725, 'Santa Tereza', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431700, 'Santana Da Boa Vista', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431740, 'Santiago', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431750, 'Santo �ngelo', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431770, 'Santo Ant�nio Das Miss�es', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431775, 'Santo Ant�nio Do Planalto', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431790, 'Santo Cristo', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431795, 'Santo Expedito Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431805, 'S�o Domingos Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431820, 'S�o Francisco De Paula', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431830, 'S�o Gabriel', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431842, 'S�o Jo�o Da Urtiga', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431844, 'S�o Jorge', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431845, 'S�o Jos� Das Miss�es', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431848, 'S�o Jos� Do Hort�ncio', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431850, 'S�o Jos� Do Norte', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431860, 'S�o Jos� Do Ouro', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431862, 'S�o Jos� Dos Ausentes', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431870, 'S�o Leopoldo', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431890, 'S�o Luiz Gonzaga', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431900, 'S�o Marcos', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431912, 'S�o Martinho Da Serra', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431920, 'S�o Nicolau', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431935, 'S�o Pedro Da Serra', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431936, 'S�o Pedro Das Miss�es', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431940, 'S�o Pedro Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431950, 'S�o Sebasti�o Do Ca�', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431970, 'S�o Valentim', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431973, 'S�o Val�rio Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431975, 'S�o Vendelino', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431990, 'Sapiranga', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432010, 'Sarandi', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432020, 'Seberi', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432026, 'Segredo', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432032, 'Senador Salgado Filho', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432040, 'Serafina Corr�a', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432045, 'S�rio', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432055, 'Sert�o Santana', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432060, 'Severiano De Almeida', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432067, 'Sinimbu', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432070, 'Sobradinho', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432085, 'Taba�', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432100, 'Tapera', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432110, 'Tapes', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432130, 'Taquari', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432135, 'Tavares', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432143, 'Terra De Areia', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432145, 'Teut�nia', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432147, 'Tiradentes Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432150, 'Torres', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432162, 'Travesseiro', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432166, 'Tr�s Cachoeiras', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432170, 'Tr�s Coroas', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432183, 'Tr�s Forquilhas', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432190, 'Tr�s Passos', '2017-09-10', 43, true);\r\n" + 
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
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432260, 'Ven�ncio Aires', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432280, 'Veran�polis', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432290, 'Viadutos', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432300, 'Viam�o', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432330, 'Vila Flores', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432340, 'Vila Maria', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432350, 'Vista Alegre', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432360, 'Vista Alegre Do Prata', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432375, 'Vit�ria Das Miss�es', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432377, 'Westf�lia', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420005, 'Abdon Batista', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420020, 'Agrol�ndia', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420040, '�gua Doce', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420055, '�guas Frias', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420060, '�guas Mornas', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420075, 'Alto Bela Vista', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420090, 'Angelina', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420110, 'Anit�polis', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420120, 'Ant�nio Carlos', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420127, 'Arabut�', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420140, 'Ararangu�', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420150, 'Armaz�m', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420165, 'Arvoredo', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420180, 'Atalanta', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420195, 'Balne�rio Arroio Do Silva', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420200, 'Balne�rio Cambori�', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420207, 'Balne�rio Gaivota', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420208, 'Bandeirante', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420209, 'Barra Bonita', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420213, 'Bela Vista Do Toldo', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420220, 'Benedito Novo', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420240, 'Blumenau', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420250, 'Bom Jardim Da Serra', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420253, 'Bom Jesus', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420260, 'Bom Retiro', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420245, 'Bombinhas', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420280, 'Bra�o Do Norte', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420287, 'Brun�polis', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420300, 'Ca�ador', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420310, 'Caibi', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420320, 'Cambori�', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420340, 'Campo Belo Do Sul', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420360, 'Campos Novos', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420370, 'Canelinha', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420325, 'Cap�o Alto', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420395, 'Capivari De Baixo', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420410, 'Caxambu Do Sul', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420417, 'Cerro Negro', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420420, 'Chapec�', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420425, 'Cocal Do Sul', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420435, 'Cordilheira Alta', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420445, 'Coronel Martins', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420450, 'Corup�', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420460, 'Crici�ma', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420475, 'Cunhata�', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420490, 'Descanso', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420510, 'Dona Emma', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420515, 'Doutor Pedrinho', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420519, 'Ermo', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420520, 'Erval Velho', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420535, 'Flor Do Sert�o', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420543, 'Formosa Do Sul', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420550, 'Fraiburgo', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420555, 'Frei Rog�rio', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420570, 'Garopaba', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420590, 'Gaspar', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420610, 'Gr�o Par�', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420620, 'Gravatal', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420640, 'Guaraciaba', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420660, 'Guaruj� Do Sul', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420670, 'Herval D`Oeste', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420675, 'Ibiam', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420690, 'Ibirama', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420710, 'Ilhota', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420730, 'Imbituba', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420740, 'Imbuia', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420757, 'Iomer�', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355715, 'Zacarias', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420768, 'Ipua�u', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420770, 'Ipumirim', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420780, 'Irani', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420790, 'Irine�polis', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420800, 'It�', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420820, 'Itaja�', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420840, 'Itapiranga', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420850, 'Ituporanga', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420860, 'Jabor�', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420880, 'Jaguaruna', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420895, 'Jardin�polis', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420910, 'Joinville', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420915, 'Jos� Boiteux', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420920, 'Lacerd�polis', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420940, 'Laguna', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420950, 'Laurentino', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420960, 'Lauro Muller', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420980, 'Leoberto Leal', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420990, 'Lontras', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421000, 'Luiz Alves', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421005, 'Macieira', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421020, 'Major Gercino', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421040, 'Maracaj�', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421050, 'Maravilha', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421060, 'Massaranduba', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421080, 'Meleiro', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421090, 'Modelo', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421105, 'Monte Carlo', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421120, 'Morro Da Fuma�a', '2017-09-10', 42, true);\r\n" + 
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
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421360, 'Porto Uni�o', '2017-09-10', 42, true);\r\n" + 
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
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421520, 'Romel�ndia', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421530, 'Salete', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421540, 'Salto Veloso', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421550, 'Santa Cec�lia', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421560, 'Santa Rosa De Lima', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421567, 'Santa Terezinha', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421568, 'Santa Terezinha Do Progresso', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421570, 'Santo Amaro Da Imperatriz', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421575, 'S�o Bernardino', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421590, 'S�o Bonif�cio', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421605, 'S�o Cristov�o Do Sul', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421620, 'S�o Francisco Do Sul', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421625, 'S�o Jo�o Do Oeste', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421650, 'S�o Joaquim', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421660, 'S�o Jos�', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421680, 'S�o Jos� Do Cerrito', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421700, 'S�o Ludgero', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421715, 'S�o Miguel Da Boa Vista', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421720, 'S�o Miguel Do Oeste', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421730, 'Saudades', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421740, 'Schroeder', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421755, 'Serra Alta', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421770, 'Sombrio', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421780, 'Tai�', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421790, 'Tangar�', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421800, 'Tijucas', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421820, 'Timb�', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421830, 'Tr�s Barras', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421835, 'Treviso', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421850, 'Treze T�lias', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421870, 'Tubar�o', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421875, 'Tun�polis', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421885, 'Uni�o Do Oeste', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421895, 'Urupema', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421910, 'Varge�o', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421915, 'Vargem', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421920, 'Vidal Ramos', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421935, 'Vitor Meireles', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421950, 'Xanxer�', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421970, 'Xaxim', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421985, 'Zort�a', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280020, 'Aquidab�', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280040, 'Arau�', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280060, 'Barra Dos Coqueiros', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280067, 'Boquim', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280100, 'Campo Do Brito', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280120, 'Canind� De S�o Francisco', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280130, 'Capela', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280150, 'Carm�polis', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280170, 'Cristin�polis', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280200, 'Divina Pastora', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280220, 'Feira Nova', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280230, 'Frei Paulo', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280250, 'General Maynard', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280270, 'Ilha Das Flores', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280290, 'Itabaiana', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280300, 'Itabaianinha', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280320, 'Itaporanga D`Ajuda', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280340, 'Japoat�', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280360, 'Laranjeiras', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280370, 'Macambira', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280390, 'Malhador', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280410, 'Moita Bonita', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280430, 'Muribeca', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280440, 'Ne�polis', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280450, 'Nossa Senhora Da Gl�ria', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280470, 'Nossa Senhora De Lourdes', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280480, 'Nossa Senhora Do Socorro', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280500, 'Pedra Mole', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280520, 'Pinh�o', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280530, 'Pirambu', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280550, 'Po�o Verde', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280570, 'Propri�', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280590, 'Riachuelo', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280600, 'Ribeir�polis', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280620, 'Salgado', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280650, 'Santa Rosa De Lima', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280640, 'Santana Do S�o Francisco', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280670, 'S�o Crist�v�o', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280690, 'S�o Francisco', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280700, 'S�o Miguel Do Aleixo', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280720, 'Siriri', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280740, 'Tobias Barreto', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280760, 'Umba�ba', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350030, 'Agua�', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350050, '�guas De Lind�ia', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350060, '�guas De S�o Pedro', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350070, 'Agudos', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350080, 'Alfredo Marcondes', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350100, 'Altin�polis', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350110, 'Alto Alegre', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350130, '�lvares Machado', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350140, '�lvaro De Carvalho', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350160, 'Americana', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350180, 'Am�rico De Campos', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350190, 'Amparo', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350210, 'Andradina', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350230, 'Anhembi', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350240, 'Anhumas', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350260, 'Aparecida D`Oeste', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350275, 'Ara�ariguama', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350290, 'Ara�oiaba Da Serra', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350310, 'Arandu', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350315, 'Arape�', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350330, 'Araras', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350340, 'Arealva', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350360, 'Arei�polis', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350380, 'Artur Nogueira', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350390, 'Aruj�', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350400, 'Assis', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350420, 'Auriflama', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350440, 'Avanhandava', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350450, 'Avar�', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350470, 'Balbinos', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350490, 'Bananal', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350510, 'Barbosa', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350520, 'Bariri', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350535, 'Barra Do Chap�u', '2017-09-10', 35, true);\r\n" + 
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
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350710, 'Bom Jesus Dos Perd�es', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350720, 'Bor�', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350730, 'Borac�ia', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350745, 'Borebi', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350760, 'Bragan�a Paulista', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350775, 'Brejo Alegre', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350780, 'Brodowski', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350800, 'Buri', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350820, 'Buritizal', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350840, 'Cabre�va', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350850, 'Ca�apava', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350870, 'Caconde', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350890, 'Caiabu', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350910, 'Caiu�', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350920, 'Cajamar', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350930, 'Cajobi', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350945, 'Campina Do Monte Alegre', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350960, 'Campo Limpo Paulista', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350980, 'Campos Novos Paulista', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350990, 'Canan�ia', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351000, 'C�ndido Mota', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351015, 'Canitar', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351030, 'Capela Do Alto', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351040, 'Capivari', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351060, 'Carapicu�ba', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351080, 'Casa Branca', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351100, 'Castilho', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351110, 'Catanduva', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351130, 'Cedral', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351160, 'Ces�rio Lange', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355720, 'Chavantes', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351190, 'Clementina', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351210, 'Col�mbia', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351230, 'Conchas', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351250, 'Coroados', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351270, 'Corumbata�', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351280, 'Cosm�polis', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351300, 'Cotia', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351310, 'Cravinhos', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351330, 'Cruz�lia', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351350, 'Cubat�o', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351370, 'Descalvado', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351380, 'Diadema', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351390, 'Divinol�ndia', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351410, 'Dois C�rregos', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351430, 'Dourado', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351450, 'Duartina', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351460, 'Dumont', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351480, 'Eldorado', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351492, 'Elisi�rio', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351500, 'Embu Das Artes', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351510, 'Embu Gua�u', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351515, 'Engenheiro Coelho', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351519, 'Esp�rito Santo Do Turvo', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351520, 'Estrela D`Oeste', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351530, 'Estrela Do Norte', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351540, 'Fartura', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351550, 'Fernand�polis', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351565, 'Fern�o', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351580, 'Flora Rica', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351590, 'Floreal', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351600, 'Fl�rida Paulista', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351630, 'Francisco Morato', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351650, 'Gabriel Monteiro', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351660, 'G�lia', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351680, 'Gast�o Vidigal', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351690, 'General Salgado', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351710, 'Glic�rio', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351720, 'Guai�ara', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351740, 'Gua�ra', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351760, 'Guapiara', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351780, 'Guara�a�', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351800, 'Guarani D`Oeste', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351810, 'Guarant�', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351830, 'Guararema', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351850, 'Guare�', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351870, 'Guaruj�', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351880, 'Guarulhos', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351890, 'Guzol�ndia', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351905, 'Holambra', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351910, 'Iacanga', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351920, 'Iacri', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351930, 'Ibat�', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351950, 'Ibirarema', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351970, 'Ibi�na', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351980, 'Ic�m', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352000, 'Igara�u Do Tiet�', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352020, 'Igarat�', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352042, 'Ilha Comprida', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352040, 'Ilhabela', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352050, 'Indaiatuba', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352070, 'Indiapor�', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352090, 'Ipaussu', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352100, 'Iper�', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352115, 'Ipigu�', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352130, 'Ipu�', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352150, 'Irapu�', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352160, 'Irapuru', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352180, 'Ita�', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352200, 'Itaju', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352215, 'Ita�ca', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352230, 'Itapetininga', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352240, 'Itapeva', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352265, 'Itapirapu� Paulista', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352270, 'It�polis', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352290, 'Itapu�', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352310, 'Itaquaquecetuba', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352330, 'Itariri', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352350, 'Itatinga', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352370, 'Itirapu�', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352380, 'Itobi', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352400, 'Itupeva', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352420, 'Jaborandi', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352440, 'Jacare�', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352460, 'Jacupiranga', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352470, 'Jaguari�na', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352490, 'Jambeiro', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352510, 'Jardin�polis', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352530, 'Ja�', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352540, 'Jeriquara', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352560, 'Jo�o Ramalho', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352580, 'J�lio Mesquita', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352590, 'Jundia�', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352610, 'Juqui�', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352620, 'Juquitiba', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352640, 'Laranjal Paulista', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352660, 'Lavrinhas', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352670, 'Leme', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352690, 'Limeira', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352710, 'Lins', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352720, 'Lorena', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352730, 'Louveira', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352750, 'Lucian�polis', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352770, 'Luizi�nia', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352780, 'Lup�rcio', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352800, 'Macatuba', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352820, 'Maced�nia', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352840, 'Mairinque', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352860, 'Manduri', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352880, 'Maraca�', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352885, 'Marapoama', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352900, 'Mar�lia', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352920, 'Martin�polis', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352930, 'Mat�o', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352950, 'Mendon�a', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352965, 'Mes�polis', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352980, 'Mineiros Do Tiet�', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353000, 'Mira Estrela', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353010, 'Mirand�polis', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353030, 'Mirassol', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353040, 'Mirassol�ndia', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353060, 'Mogi Das Cruzes', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353080, 'Moji Mirim', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353100, 'Mon��es', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353110, 'Mongagu�', '2017-09-10', 35, true);\r\n" + 
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
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353280, 'Nova Alian�a', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353284, 'Nova Cana� Paulista', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353290, 'Nova Europa', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353300, 'Nova Granada', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353320, 'Nova Independ�ncia', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353340, 'Nova Odessa', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353325, 'Novais', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353360, 'Nuporanga', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353380, '�leo', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353390, 'Ol�mpia', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353410, 'Oriente', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353430, 'Orl�ndia', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170030, 'Aguiarn�polis', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353460, 'Osvaldo Cruz', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353470, 'Ourinhos', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353475, 'Ouroeste', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353500, 'Palestina', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353520, 'Palmeira D`Oeste', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353530, 'Palmital', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353550, 'Paragua�u Paulista', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353570, 'Para�so', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353590, 'Paranapu�', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353600, 'Parapu�', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353620, 'Pariquera A�u', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353630, 'Patroc�nio Paulista', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353650, 'Paul�nia', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353657, 'Paulist�nia', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353670, 'Pederneiras', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353690, 'Pedran�polis', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353710, 'Pedreira', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353715, 'Pedrinhas Paulista', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353730, 'Pen�polis', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353750, 'Pereiras', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353760, 'Peru�be', '2017-09-10', 35, true);\r\n" + 
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
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354000, 'Pomp�ia', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354020, 'Pontal', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354030, 'Pontes Gestal', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354050, 'Porangaba', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354070, 'Porto Ferreira', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354080, 'Potirendaba', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354085, 'Pracinha', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354100, 'Praia Grande', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354110, 'Presidente Alves', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354130, 'Presidente Epit�cio', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354140, 'Presidente Prudente', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354160, 'Promiss�o', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354165, 'Quadra', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354180, 'Queiroz', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354200, 'Quintana', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354220, 'Rancharia', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354240, 'Regente Feij�', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354250, 'Regin�polis', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354270, 'Restinga', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354290, 'Ribeir�o Bonito', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354310, 'Ribeir�o Corrente', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354323, 'Ribeir�o Dos �ndios', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354325, 'Ribeir�o Grande', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354340, 'Ribeir�o Preto', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354370, 'Rinc�o', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354390, 'Rio Claro', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354400, 'Rio Das Pedras', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354420, 'Riol�ndia', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354425, 'Rosana', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354440, 'Rubi�cea', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354450, 'Rubin�ia', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354470, 'Sagres', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354490, 'Sales Oliveira', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354510, 'Salmour�o', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354515, 'Saltinho', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354530, 'Salto De Pirapora', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354550, 'Sandovalina', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354570, 'Santa Albertina', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354580, 'Santa B�rbara D`Oeste', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355620, 'Valinhos', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355635, 'Vargem', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355645, 'Vargem Grande Paulista', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355650, 'V�rzea Paulista', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355670, 'Vinhedo', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355680, 'Viradouro', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354625, 'Santa Cruz Da Esperan�a', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354640, 'Santa Cruz Do Rio Pardo', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354650, 'Santa Ernestina', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354670, 'Santa Gertrudes', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354690, 'Santa L�cia', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354700, 'Santa Maria Da Serra', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354740, 'Santa Rita D`Oeste', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354760, 'Santa Rosa De Viterbo', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354765, 'Santa Salete', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354730, 'Santana De Parna�ba', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354770, 'Santo Anast�cio', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354790, 'Santo Ant�nio Da Alegria', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354805, 'Santo Ant�nio Do Aracangu�', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354820, 'Santo Ant�nio Do Pinhal', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354830, 'Santo Expedito', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354850, 'Santos', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354860, 'S�o Bento Do Sapuca�', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354880, 'S�o Caetano Do Sul', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354890, 'S�o Carlos', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354910, 'S�o Jo�o Da Boa Vista', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354925, 'S�o Jo�o De Iracema', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354940, 'S�o Joaquim Da Barra', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354950, 'S�o Jos� Da Bela Vista', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354970, 'S�o Jos� Do Rio Pardo', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354980, 'S�o Jos� Do Rio Preto', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354995, 'S�o Louren�o Da Serra', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355010, 'S�o Manuel', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355020, 'S�o Miguel Arcanjo', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355040, 'S�o Pedro', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355060, 'S�o Roque', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355070, 'S�o Sebasti�o', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355090, 'S�o Sim�o', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355100, 'S�o Vicente', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355120, 'Sarutai�', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355140, 'Serra Azul', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355160, 'Serra Negra', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355170, 'Sert�ozinho', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355190, 'Sever�nia', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355210, 'Socorro', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355220, 'Sorocaba', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355240, 'Sumar�', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355250, 'Suzano', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355260, 'Tabapu�', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355280, 'Tabo�o Da Serra', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355300, 'Tagua�', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355320, 'Tai�va', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355340, 'Tanabi', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355350, 'Tapira�', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355365, 'Taquaral', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355380, 'Taquarituba', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355390, 'Tarabai', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355395, 'Tarum�', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355410, 'Taubat�', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355430, 'Teodoro Sampaio', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355450, 'Tiet�', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355465, 'Torre De Pedra', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355470, 'Torrinha', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355480, 'Trememb�', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355495, 'Tuiuti', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355510, 'Tupi Paulista', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355520, 'Turi�ba', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355535, 'Ubarana', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355550, 'Ubirajara', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355570, 'Uni�o Paulista', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355590, 'Uru', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355600, 'Urup�s', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355695, 'Vit�ria Brasil', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355710, 'Votuporanga', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170025, 'Abreul�ndia', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170035, 'Alian�a Do Tocantins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170040, 'Almas', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170100, 'Anan�s', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170110, 'Aparecida Do Rio Negro', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170190, 'Araguacema', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170200, 'Aragua�u', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170215, 'Araguan�', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170230, 'Arapoema', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170255, 'Augustin�polis', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170290, 'Axix� Do Tocantins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170300, 'Baba�ul�ndia', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170307, 'Barra Do Ouro', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170320, 'Bernardo Say�o', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170330, 'Bom Jesus Do Tocantins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170370, 'Brejinho De Nazar�', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170380, 'Buriti Do Tocantins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170384, 'Campos Lindos', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170388, 'Carmol�ndia', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170390, 'Caseara', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170410, 'Centen�rio', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170460, 'Chapada De Areia', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171670, 'Colm�ia', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170555, 'Combinado', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170600, 'Couto Magalh�es', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170610, 'Cristal�ndia', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170650, 'Darcin�polis', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170700, 'Dian�polis', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170720, 'Dois Irm�os Do Tocantins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170740, 'Esperantina', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170755, 'F�tima', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170770, 'Filad�lfia', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170825, 'Fortaleza Do Taboc�o', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170900, 'Goiatins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170930, 'Guara�', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170980, 'Ipueiras', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171070, 'Itaguatins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171110, 'Itapor� Do Tocantins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171150, 'Ja� Do Tocantins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171190, 'Lagoa Da Confus�o', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171200, 'Lajeado', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171240, 'Lizarda', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171245, 'Luzin�polis', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171270, 'Mateiros', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171320, 'Miracema Do Tocantins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171330, 'Miranorte', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171370, 'Monte Santo Do Tocantins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171420, 'Natividade', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171430, 'Nazar�', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171500, 'Nova Rosal�ndia', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171515, 'Novo Alegre', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171550, 'Oliveira De F�tima', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (172100, 'Palmas', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171380, 'Palmeiras Do Tocantins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171610, 'Para�so Do Tocantins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171620, 'Paran�', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171650, 'Pedro Afonso', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171665, 'Pequizeiro', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171720, 'Piraqu�', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171750, 'Pium', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171790, 'Ponte Alta Do Tocantins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171820, 'Porto Nacional', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171830, 'Praia Norte', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171845, 'Pugmil', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171855, 'Riachinho', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171865, 'Rio Da Concei��o', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171875, 'Rio Sono', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171884, 'Sandol�ndia', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171888, 'Santa Maria Do Tocantins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171889, 'Santa Rita Do Tocantins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (120001, 'Acrel�ndia', '2017-09-10', 12, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (120005, 'Assis Brasil', '2017-09-10', 12, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (120013, 'Bujari', '2017-09-10', 12, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (120020, 'Cruzeiro Do Sul', '2017-09-10', 12, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (120032, 'Jord�o', '2017-09-10', 12, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (120034, 'Manoel Urbano', '2017-09-10', 12, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (120038, 'Pl�cido De Castro', '2017-09-10', 12, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (120040, 'Rio Branco', '2017-09-10', 12, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (120043, 'Santa Rosa Do Purus', '2017-09-10', 12, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (120045, 'Senador Guiomard', '2017-09-10', 12, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270010, '�gua Branca', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270030, 'Arapiraca', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270050, 'Barra De Santo Ant�nio', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270080, 'Bel�m', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270100, 'Boca Da Mata', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270130, 'Cajueiro', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270140, 'Campo Alegre', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270160, 'Canapi', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270190, 'Ch� Preta', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270210, 'Col�nia Leopoldina', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270230, 'Coruripe', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270240, 'Delmiro Gouveia', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270260, 'Feira Grande', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270280, 'Flexeiras', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270310, 'Igaci', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270330, 'Inhapi', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270350, 'Jacu�pe', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270370, 'Jaramataia', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270390, 'Jundi�', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270410, 'Lagoa Da Canoa', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270430, 'Macei�', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270450, 'Maragogi', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270470, 'Marechal Deodoro', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270500, 'Mata Grande', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270530, 'Minador Do Negr�o', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270550, 'Murici', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270570, 'Olho D`�gua Das Flores', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270600, 'Oliven�a', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270620, 'Palestina', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270640, 'P�o De A��car', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270650, 'Passo De Camaragibe', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270670, 'Penedo', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270700, 'Pindoba', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270720, 'Po�o Das Trincheiras', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270740, 'Porto De Pedras', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270770, 'Rio Largo', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270790, 'Santa Luzia Do Norte', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270820, 'S�o Br�s', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270840, 'S�o Jos� Da Tapera', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270870, 'S�o Miguel Dos Milagres', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270895, 'Senador Rui Palmeira', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270910, 'Taquarana', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (270930, 'Uni�o Dos Palmares', '2017-09-10', 27, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130002, 'Alvar�es', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130008, 'Anam�', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130010, 'Anori', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130020, 'Atalaia Do Norte', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130050, 'Barreirinha', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130063, 'Beruri', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130070, 'Boca Do Acre', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130083, 'Caapiranga', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130110, 'Careiro', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130120, 'Coari', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130140, 'Eirunep�', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (172000, 'Santa Terezinha Do Tocantins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (172015, 'S�o F�lix Do Tocantins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (172020, 'S�o Miguel Do Tocantins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (172030, 'S�o Sebasti�o Do Tocantins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (172065, 'Silvan�polis', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (172080, 'S�tio Novo Do Tocantins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (172090, 'Taguatinga', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (172097, 'Talism�', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (172110, 'Tocant�nia', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (172125, 'Tupirama', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (172208, 'Wanderl�ndia', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130160, 'Fonte Boa', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130180, 'Ipixuna', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130190, 'Itacoatiara', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130200, 'Itapiranga', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130220, 'Juru�', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130250, 'Manacapuru', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130260, 'Manaus', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130280, 'Mara�', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130310, 'Nova Olinda Do Norte', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130330, 'Novo Aripuan�', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130353, 'Presidente Figueiredo', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130360, 'Santa Isabel Do Rio Negro', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130380, 'S�o Gabriel Da Cachoeira', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130406, 'Tabatinga', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130420, 'Tef�', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130426, 'Uarini', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (130440, 'Urucurituba', '2017-09-10', 13, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (160021, 'Cutias', '2017-09-10', 16, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (160025, 'Itaubal', '2017-09-10', 16, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (160030, 'Macap�', '2017-09-10', 16, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (160050, 'Oiapoque', '2017-09-10', 16, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (160053, 'Porto Grande', '2017-09-10', 16, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (160005, 'Serra Do Navio', '2017-09-10', 16, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (160080, 'Vit�ria Do Jari', '2017-09-10', 16, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290030, 'Acajutiba', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290040, '�gua Fria', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290070, 'Alagoinhas', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290100, 'Amargosa', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290115, 'Am�rica Dourada', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290130, 'Andara�', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290150, 'Anguera', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290170, 'Ant�nio Cardoso', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290190, 'Apor�', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290200, 'Aracatu', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290220, 'Aramari', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290230, 'Aratu�pe', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290250, 'Baian�polis', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290270, 'Barra', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290290, 'Barra Do Cho�a', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290320, 'Barreiras', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290327, 'Barrocas', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290340, 'Belmonte', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290370, 'Boa Nova', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290390, 'Bom Jesus Da Lapa', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290400, 'Boninal', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290420, 'Botupor�', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290440, 'Brejol�ndia', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290450, 'Brotas De Maca�bas', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290470, 'Buerarema', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290480, 'Caatiba', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290490, 'Cachoeira', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290515, 'Caetanos', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290530, 'Cafarnaum', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290550, 'Caldeir�o Grande', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290580, 'Camamu', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290590, 'Campo Alegre De Lourdes', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290620, 'Canarana', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290650, 'Candeias', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290670, 'C�ndido Sales', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290682, 'Canudos', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290687, 'Capim Grosso', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290700, 'Cardeal Da Silva', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290720, 'Casa Nova', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290750, 'Catu', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290760, 'Central', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290780, 'C�cero Dantas', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290810, 'Cocos', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290830, 'Concei��o Do Almeida', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290850, 'Concei��o Do Jacu�pe', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290880, 'Contendas Do Sincor�', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290910, 'Coribe', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290930, 'Correntina', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290950, 'Cravol�ndia', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290980, 'Cruz Das Almas', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291000, 'D�rio Meira', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291020, 'Dom Macedo Costa', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291040, 'Encruzilhada', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (290050, '�rico Cardoso', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291072, 'Eun�polis', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291077, 'Feira Da Mata', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291090, 'Firmino Alves', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291110, 'Formosa Do Rio Preto', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291130, 'Gentio Do Ouro', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291150, 'Gongogi', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291170, 'Guanambi', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291185, 'Heli�polis', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291200, 'Ibiassuc�', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291220, 'Ibicoara', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291250, 'Ibipitanga', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291270, 'Ibirapitanga', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291290, 'Ibirataia', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291320, 'Ibotirama', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291340, 'Igapor�', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291350, 'Igua�', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291370, 'Inhambupe', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291400, 'Ipir�', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291420, 'Irajuba', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291440, 'Iraquara', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291465, 'Itabela', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291480, 'Itabuna', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291500, 'Itaet�', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291520, 'Itagib�', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291535, 'Itagua�u Da Bahia', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291540, 'Itaju Do Col�nia', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291560, 'Itamaraju', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291580, 'Itamb�', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291610, 'Itaparica', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291630, 'Itapebi', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291650, 'Itapicuru', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291670, 'Itaquara', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291690, 'Itiru�u', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291710, 'Itoror�', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291730, 'Ituber�', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291735, 'Jaborandi', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291760, 'Jaguaquara', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291780, 'Jaguaripe', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291800, 'Jequi�', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291830, 'Jita�na', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291835, 'Jo�o Dourado', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291850, 'Jussara', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291870, 'Lafaiete Coutinho', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291880, 'Laje', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291900, 'Lajedinho', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291915, 'Lap�o', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291930, 'Len��is', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291950, 'Livramento De Nossa Senhora', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291970, 'Macarani', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291990, 'Macurur�', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (291995, 'Maetinga', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292010, 'Mairi', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292030, 'Malhada De Pedras', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292050, 'Marac�s', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292070, 'Mara�', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292090, 'Mascote', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292110, 'Medeiros Neto', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292130, 'Milagres', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292150, 'Monte Santo', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292170, 'Morro Do Chap�u', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292190, 'Mucug�', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292205, 'Mulungu Do Morro', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292225, 'Muqu�m De S�o Francisco', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292250, 'Nazar�', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292265, 'Nordestina', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292273, 'Nova F�tima', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292280, 'Nova Itarana', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292300, 'Nova Vi�osa', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292305, 'Novo Triunfo', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292320, 'Oliveira Dos Brejinhos', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292340, 'Palmas De Monte Alto', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292370, 'Paratinga', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292390, 'Pau Brasil', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292405, 'P� De Serra', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292420, 'Pedro Alexandre', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292450, 'Pinda�', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292465, 'Pintadas', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292480, 'Piritiba', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292500, 'Planalto', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292520, 'Pojuca', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292530, 'Porto Seguro', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292560, 'Presidente Dutra', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292570, 'Presidente J�nio Quadros', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292590, 'Quijingue', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292595, 'Rafael Jambeiro', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292610, 'Retirol�ndia', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292630, 'Riach�o Do Jacu�pe', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292660, 'Ribeira Do Pombal', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292680, 'Rio Do Ant�nio', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292700, 'Rio Real', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292730, 'Salinas Da Margarida', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292750, 'Santa B�rbara', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292770, 'Santa Cruz Cabr�lia', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292805, 'Santa Luzia', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292840, 'Santa Rita De C�ssia', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292820, 'Santana', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292860, 'Santo Amaro', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292880, 'Santo Est�v�o', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292895, 'S�o Domingos', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292905, 'S�o F�lix Do Coribe', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292925, 'S�o Gabriel', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292935, 'S�o Jos� Da Vit�ria', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292950, 'S�o Sebasti�o Do Pass�', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292975, 'Saubara', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (292990, 'Seabra', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293010, 'Senhor Do Bonfim', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293030, 'Serra Dourada', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293060, 'Serrol�ndia', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293075, 'S�tio Do Mato', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293077, 'Sobradinho', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293090, 'Tabocas Do Brejo Velho', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293110, 'Tanquinho', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293130, 'Tapiramut�', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293140, 'Teodoro Sampaio', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293170, 'Terra Nova', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293190, 'Tucano', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293220, 'Ubaitaba', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293240, 'Uiba�', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293250, 'Una', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293270, 'Uru�uca', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293290, 'Valen�a', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293310, 'V�rzea Do Po�o', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293317, 'Varzedo', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293325, 'Vereda', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293345, 'Wanderley', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (293350, 'Wenceslau Guimar�es', '2017-09-10', 29, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230020, 'Acara�', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230040, 'Aiuaba', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230060, 'Altaneira', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230075, 'Amontada', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230100, 'Aquiraz', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230120, 'Aracoiaba', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230130, 'Araripe', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230160, 'Assar�', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230180, 'Baixio', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230190, 'Barbalha', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230200, 'Barro', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230210, 'Baturit�', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230230, 'Bela Cruz', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230260, 'Camocim', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230280, 'Canind�', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230300, 'Caridade', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230320, 'Cariria�u', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230350, 'Cascavel', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230365, 'Catunda', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230380, 'Cedro', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230395, 'Chorozinho', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230410, 'Crate�s', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230423, 'Croat�', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230426, 'Deputado Irapuan Pinheiro', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230430, 'Farias Brito', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230440, 'Fortaleza', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230460, 'General Sampaio', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230470, 'Granja', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230490, 'Groa�ras', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230510, 'Guaramiranga', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230523, 'Horizonte', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230530, 'Ibiapina', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230540, 'Ic�', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230560, 'Independ�ncia', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230570, 'Ipaumirim', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230600, 'Iracema', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230620, 'Itai�aba', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230630, 'Itapag�', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230655, 'Itarema', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230670, 'Jaguaretama', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230690, 'Jaguaribe', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230720, 'Jati', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230725, 'Jijoca De Jericoacoara', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230750, 'Lavras Da Mangabeira', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230765, 'Maracana�', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230780, 'Marco', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230800, 'Massap�', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230830, 'Milagres', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230837, 'Mira�ma', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230850, 'Momba�a', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230880, 'Mora�jo', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230900, 'Mucambo', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230920, 'Nova Olinda', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230940, 'Novo Oriente', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230960, 'Pacajus', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (230980, 'Pacoti', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231010, 'Palm�cia', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231025, 'Paraipaba', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231040, 'Paramoti', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231060, 'Penaforte', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231080, 'Pereiro', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231090, 'Piquet Carneiro', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231110, 'Porteiras', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231123, 'Potiretama', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231130, 'Quixad�', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231140, 'Quixeramobim', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231170, 'Reriutaba', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231180, 'Russas', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231190, 'Saboeiro', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231220, 'Santa Quit�ria', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231210, 'Santana Do Cariri', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231250, 'S�o Jo�o Do Jaguaribe', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231280, 'Senador S�', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231300, 'Solon�pole', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231320, 'Tamboril', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231335, 'Teju�uoca', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231350, 'Trairi', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231360, 'Ubajara', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231380, 'Uruburetama', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231395, 'Varjota', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (231410, 'Vi�osa Do Cear�', '2017-09-10', 23, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320010, 'Afonso Cl�udio', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320020, 'Alegre', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320035, 'Alto Rio Novo', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320060, 'Aracruz', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320070, 'Atilio Vivacqua', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320100, 'Boa Esperan�a', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320120, 'Cachoeiro De Itapemirim', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320140, 'Castelo', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320160, 'Concei��o Da Barra', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320190, 'Domingos Martins', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320220, 'Fund�o', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320225, 'Governador Lindenberg', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320245, 'Ibatiba', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320260, 'Iconha', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320270, 'Itagua�u', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320290, 'Itarana', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320310, 'Jer�nimo Monteiro', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320316, 'Laranja Da Terra', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320330, 'Manten�polis', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320335, 'Maril�ndia', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320350, 'Montanha', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320370, 'Muniz Freire', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320400, 'Pancas', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320410, 'Pinheiros', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320430, 'Presidente Kennedy', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320440, 'Rio Novo Do Sul', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320455, 'Santa Maria De Jetib�', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320470, 'S�o Gabriel Da Palha', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320495, 'S�o Roque Do Cana�', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320503, 'Vargem Alta', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320510, 'Viana', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (320517, 'Vila Val�rio', '2017-09-10', 32, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520005, 'Abadia De Goi�s', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520013, 'Acre�na', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520017, '�gua Fria De Goi�s', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520030, 'Alex�nia', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520055, 'Alto Horizonte', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520082, 'Amaralina', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520090, 'Amorin�polis', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520120, 'Anhanguera', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520130, 'Anicuns', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520140, 'Aparecida De Goi�nia', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520160, 'Ara�u', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520180, 'Aragoi�nia', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520235, 'Aren�polis', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520280, 'Avelin�polis', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520320, 'Barro Alto', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520340, 'Bom Jardim De Goi�s', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520357, 'Bon�polis', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520380, 'Brit�nia', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520393, 'Buriti De Goi�s', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520410, 'Cachoeira Alta', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520425, 'Cachoeira Dourada', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520450, 'Caldas Novas', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520460, 'Campestre De Goi�s', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520480, 'Campo Alegre De Goi�s', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520490, 'Campos Belos', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520500, 'Carmo Do Rio Verde', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520520, 'Catura�', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520545, 'Cezarina', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520549, 'Cidade Ocidental', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520552, 'Colinas Do Sul', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520590, 'Corumba�ba', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520630, 'Cristian�polis', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520650, 'Crom�nia', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520680, 'Damol�ndia', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520710, 'Diorama', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520725, 'Doverl�ndia', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520750, 'Estrela Do Norte', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520760, 'Fazenda Nova', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520790, 'Flores De Goi�s', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520815, 'Gameleira De Goi�s', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520860, 'Goian�sia', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520880, 'Goianira', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520910, 'Goiatuba', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520929, 'Guara�ta', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520945, 'Guarinos', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520970, 'Hidrol�ndia', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (520993, 'Inaciol�ndia', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521000, 'Inhumas', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521015, 'Ipiranga De Goi�s', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521040, 'Itabera�', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521060, 'Itaguaru', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521090, 'Itapaci', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521130, 'Itarum�', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521150, 'Itumbiara', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521170, 'Jandaia', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521190, 'Jata�', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521210, 'Jovi�nia', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521225, 'Lagoa Santa', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521250, 'Luzi�nia', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521270, 'Mamba�', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521295, 'Matrinch�', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521305, 'Mimoso De Goi�s', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521310, 'Mineiros', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521350, 'Monte Alegre De Goi�s', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521375, 'Montividiu', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521380, 'Morrinhos', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521400, 'Mozarl�ndia', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521410, 'Mutun�polis', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521460, 'Niquel�ndia', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521480, 'Nova Aurora', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521486, 'Nova Gl�ria', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521500, 'Nova Veneza', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521523, 'Novo Gama', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521530, 'Orizona', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521550, 'Ouvidor', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521565, 'Palestina De Goi�s', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521590, 'Palmin�polis', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521630, 'Paranaiguara', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521680, 'Petrolina De Goi�s', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521710, 'Piracanjuba', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521730, 'Piren�polis', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521770, 'Pontalina', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521805, 'Porteir�o', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521839, 'Professor Jamil', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521860, 'Rialma', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521878, 'Rio Quente', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521900, 'Sanclerl�ndia', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521920, 'Santa Cruz De Goi�s', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521930, 'Santa Helena De Goi�s', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521945, 'Santa Rita Do Novo Destino', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521960, 'Santa Tereza De Goi�s', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521973, 'Santo Ant�nio De Goi�s', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (521990, 'S�o Francisco De Goi�s', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (522005, 'S�o Jo�o Da Para�na', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (522020, 'S�o Miguel Do Araguaia', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (522040, 'S�o Sim�o', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (522050, 'Serran�polis', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (522070, 'S�tio D`Abadia', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (522108, 'Teresina De Goi�s', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (522130, 'Tr�s Ranchos', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (522150, 'Turv�nia', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (522157, 'Uirapuru', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (522170, 'Uruana', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (522185, 'Valpara�so De Goi�s', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (522205, 'Vicentin�polis', '2017-09-10', 52, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210005, 'A�ail�ndia', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210015, '�gua Doce Do Maranh�o', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210040, 'Altamira Do Maranh�o', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210047, 'Alto Alegre Do Pindar�', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210060, 'Amarante Do Maranh�o', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210083, 'Apicum A�u', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210090, 'Araioses', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210100, 'Arari', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210125, 'Bacabeira', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210130, 'Bacuri', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210135, 'Bacurituba', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210150, 'Bar�o De Graja�', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210170, 'Barreirinhas', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210180, 'Benedito Leite', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210193, 'Bernardo Do Mearim', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210203, 'Bom Jesus Das Selvas', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210210, 'Brejo', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210230, 'Buriti Bravo', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210235, 'Buritirana', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210240, 'Cajapi�', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210255, 'Campestre Do Maranh�o', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210275, 'Capinzal Do Norte', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210300, 'Caxias', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210312, 'Central Do Maranh�o', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210317, 'Centro Novo Do Maranh�o', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210330, 'Cod�', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210350, 'Colinas', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210370, 'Cururupu', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210380, 'Dom Pedro', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210400, 'Esperantin�polis', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210407, 'Feira Nova Do Maranh�o', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210410, 'Fortaleza Dos Nogueiras', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210440, 'Gon�alves Dias', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210455, 'Governador Edison Lob�o', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210462, 'Governador Luiz Rocha', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210470, 'Gra�a Aranha', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210500, 'Humberto De Campos', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210515, 'Igarap� Do Meio', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210535, 'Itaipava Do Graja�', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210542, 'Itinga Do Maranh�o', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210547, 'Jenipapo Dos Vieiras', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210565, 'Junco Do Maranh�o', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210580, 'Lago Do Junco', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210592, 'Lagoa Do Mato', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210598, 'Lajeado Novo', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210620, 'Lu�s Domingues', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210632, 'Maraca�um�', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210637, 'Maranh�ozinho', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210660, 'Mat�es', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210667, 'Milagres Do Maranh�o', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210680, 'Mirinzal', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210700, 'Montes Altos', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210725, 'Nova Colinas', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210735, 'Nova Olinda Do Maranh�o', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210745, 'Olinda Nova Do Maranh�o', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210770, 'Paraibano', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210800, 'Pastos Bons', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210810, 'Paulo Ramos', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210825, 'Pedro Do Ros�rio', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210845, 'Peritor�', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210860, 'Pinheiro', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210880, 'Pirapemas', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210890, 'Po��o De Pedras', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210910, 'Presidente Dutra', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210923, 'Presidente M�dici', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210940, 'Primeira Cruz', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210950, 'Riach�o', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210970, 'Samba�ba', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (210975, 'Santa Filomena Do Maranh�o', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211000, 'Santa Luzia', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211010, 'Santa Quit�ria Do Maranh�o', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211027, 'Santo Amaro Do Maranh�o', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211040, 'S�o Benedito Do Rio Preto', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211065, 'S�o Domingos Do Azeit�o', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211085, 'S�o Francisco Do Brej�o', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211100, 'S�o Jo�o Batista', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211105, 'S�o Jo�o Do Para�so', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211120, 'S�o Jos� De Ribamar', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211140, 'S�o Lu�s Gonzaga Do Maranh�o', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211157, 'S�o Pedro Dos Crentes', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211163, 'S�o Raimundo Do Doca Bezerra', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211172, 'Satubinha', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211176, 'Senador La Rocque', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211190, 'Sucupira Do Norte', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211200, 'Tasso Fragoso', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211223, 'Trizidela Do Vale', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211230, 'Tuntum', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211250, 'Tut�ia', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211270, 'Vargem Grande', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211285, 'Vila Nova Dos Mart�rios', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (211400, 'Z� Doca', '2017-09-10', 21, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310020, 'Abaet�', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310040, 'Acaiaca', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310070, '�gua Comprida', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310090, '�guas Formosas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310110, 'Aimor�s', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310140, 'Albertina', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310160, 'Alfenas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310170, 'Almenara', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310190, 'Alpin�polis', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315350, 'Alto Jequitib�', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310220, 'Alvarenga', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310240, 'Alvorada De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310280, 'Andrel�ndia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310290, 'Ant�nio Carlos', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310310, 'Ant�nio Prado De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310340, 'Ara�ua�', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310370, 'Araponga', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310380, 'Arapu�', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310400, 'Arax�', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310420, 'Arcos', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310445, 'Aricanduva', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310460, 'Astolfo Dutra', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310470, 'Atal�ia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310500, 'Baldim', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310520, 'Bandeira', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310540, 'Bar�o De Cocais', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310570, 'Barra Longa', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310600, 'Bela Vista De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310620, 'Belo Horizonte', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310650, 'Berilo', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310660, 'Bert�polis', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310680, 'Bias Fortes', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310710, 'Boa Esperan�a', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310730, 'Bocai�va', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310750, 'Bom Jardim De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310780, 'Bom Jesus Do Galho', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310800, 'Bom Sucesso', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310820, 'Bonfin�polis De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310840, 'Botelhos', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310870, 'Br�s Pires', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310860, 'Bras�lia De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310900, 'Brumadinho', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310920, 'Buen�polis', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310940, 'Buritizeiro', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310950, 'Cabo Verde', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310970, 'Cachoeira De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (310980, 'Cachoeira Dourada', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311010, 'Caiana', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311030, 'Caldas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311060, 'Cambu�', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311080, 'Campan�rio', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311100, 'Campestre', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311115, 'Campo Azul', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311130, 'Campo Do Meio', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311160, 'Campos Gerais', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311170, 'Cana�', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311205, 'Cantagalo', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311220, 'Capela Nova', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311240, 'Capetinga', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311260, 'Capin�polis', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311270, 'Capit�o En�as', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311300, 'Cara�', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311320, 'Caranda�', '2017-09-10', 31, true);\r\n" + 
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
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311600, 'Chal�', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311615, 'Chapada Ga�cha', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311620, 'Chiador', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311640, 'Claraval', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311660, 'Cl�udio', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311680, 'Coluna', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311700, 'Comercinho', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311520, 'Concei��o Da Barra De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311740, 'Concei��o De Ipanema', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311770, 'Concei��o Do Rio Verde', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311783, 'C�nego Marinho', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311800, 'Congonhas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311820, 'Conquista', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311840, 'Conselheiro Pena', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311870, 'Coqueiral', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311890, 'Cordisburgo', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311920, 'Coroaci', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311940, 'Coronel Fabriciano', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311960, 'Coronel Pacheco', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (311990, 'C�rrego Do Bom Jesus', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312000, 'C�rrego Novo', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312020, 'Cristais', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312040, 'Cristiano Otoni', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312060, 'Crucil�ndia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312083, 'Cuparaque', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312090, 'Curvelo', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312110, 'Delfim Moreira', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312130, 'Descoberto', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312150, 'Desterro Do Melo', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312170, 'Diogo De Vasconcelos', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312200, 'Divino', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312220, 'Divinol�ndia De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312240, 'Divisa Nova', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312250, 'Dom Cavati', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312270, 'Dom Silv�rio', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312290, 'Dona Eus�bia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312320, 'Dores Do Indai�', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312350, 'Douradoquara', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312360, 'El�i Mendes', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312380, 'Engenheiro Navarro', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312400, 'Erv�lia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312420, 'Espera Feliz', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312440, 'Esp�rito Santo Do Dourado', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312470, 'Estrela Do Indai�', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312490, 'Eugen�polis', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312520, 'Fama', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312540, 'Fel�cio Dos Santos', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312580, 'Fernandes Tourinho', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312595, 'Fervedouro', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312610, 'Formiga', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312640, 'Fortuna De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312660, 'Francisco Dumont', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312675, 'Francisc�polis', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312695, 'Frei Lagonegro', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312700, 'Fronteira', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312705, 'Fronteira Dos Vales', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312720, 'Funil�ndia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312733, 'Gameleiras', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312738, 'Goian�', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312750, 'Gonzaga', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312770, 'Governador Valadares', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312800, 'Guanh�es', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312820, 'Guaraciaba', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312830, 'Guaran�sia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312860, 'Guarda Mor', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312880, 'Guidoval', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312900, 'Guiricema', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312920, 'Heliodora', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312950, 'Ibi�', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312965, 'Ibiracatu', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (312980, 'Ibirit�', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313000, 'Ibituruna', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313020, 'Igaratinga', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313040, 'Ijaci', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313055, 'Imb� De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313070, 'Indian�polis', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313090, 'Inhapim', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313110, 'Inimutaba', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313130, 'Ipatinga', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313150, 'Ipui�na', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313170, 'Itabira', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313200, 'Itacambira', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313220, 'Itaguara', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313240, 'Itajub�', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313260, 'Itamarati De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313280, 'Itamb� Do Mato Dentro', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313310, 'Itanhandu', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313340, 'Itapagipe', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313360, 'Itapeva', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313375, 'Ita� De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313400, 'Itinga', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313420, 'Ituiutaba', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313440, 'Iturama', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313460, 'Jaboticatubas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313490, 'Jacutinga', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313505, 'Ja�ba', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313520, 'Janu�ria', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313535, 'Japonvar', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313545, 'Jenipapo De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313570, 'Jequitib�', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313580, 'Jequitinhonha', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313610, 'Joan�sia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313630, 'Jo�o Pinheiro', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313652, 'Jos� Gon�alves De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313657, 'Josen�polis', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313680, 'Juramento', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313695, 'Juven�lia', '2017-09-10', 31, true);\r\n" + 
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
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313870, 'Lumin�rias', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313900, 'Machado', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313920, 'Malacacheta', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313930, 'Manga', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313960, 'Mantena', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (313970, 'Maravilhas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314000, 'Mariana', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314015, 'M�rio Campos', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314040, 'Marmel�polis', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314053, 'Martins Soares', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314060, 'Materl�ndia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314080, 'Matias Barbosa', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314090, 'Matip�', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314120, 'Matutina', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314140, 'Medina', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314160, 'Merc�s', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314190, 'Minduri', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314210, 'Miradouro', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314225, 'Mirav�nia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314240, 'Moema', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314260, 'Monsenhor Paulo', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314290, 'Monte Azul', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314310, 'Monte Carmelo', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314320, 'Monte Santo De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314345, 'Montezuma', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314360, 'Morro Da Gar�a', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314390, 'Muria�', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314410, 'Muzambinho', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314435, 'Naque', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314440, 'Nat�rcia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314460, 'Nepomuceno', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314467, 'Nova Bel�m', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314490, 'Nova M�dica', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314505, 'Nova Porteirinha', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314520, 'Nova Serrana', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314535, 'Novo Oriente De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314540, 'Olaria', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314550, 'Ol�mpio Noronha', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314580, 'On�a De Pitangui', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314587, 'Oriz�nia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314610, 'Ouro Preto', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314625, 'Padre Carvalho', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314655, 'Pai Pedro', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314660, 'Paiva', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314675, 'Palm�polis', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314710, 'Par� De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314730, 'Parais�polis', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314760, 'Passa Quatro', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314780, 'Passa Vinte', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314795, 'Patis', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314800, 'Patos De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314820, 'Patroc�nio Do Muria�', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314840, 'Paulistas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314870, 'Pedra Azul', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314880, 'Pedra Do Anta', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314900, 'Pedra Dourada', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314920, 'Pedrin�polis', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314940, 'Pedro Teixeira', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314970, 'Perdig�o', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (314990, 'Perd�es', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315000, 'Pescador', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315015, 'Piedade De Caratinga', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315040, 'Piedade Dos Gerais', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315053, 'Pingo D`�gua', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315070, 'Pirajuba', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315090, 'Pirangu�u', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315120, 'Pirapora', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315140, 'Pitangui', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315160, 'Planura', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315180, 'Po�os De Caldas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315210, 'Ponte Nova', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315217, 'Ponto Dos Volantes', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315240, 'Pot�', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315260, 'Pouso Alto', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315280, 'Prata', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315300, 'Pratinha', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315320, 'Presidente Juscelino', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315360, 'Prudente De Morais', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315390, 'Raposos', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315410, 'Recreio', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315420, 'Resende Costa', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315445, 'Riachinho', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315460, 'Ribeir�o Das Neves', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315480, 'Rio Acima', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315500, 'Rio Doce', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315530, 'Rio Manso', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315550, 'Rio Parana�ba', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315580, 'Rio Pomba', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315600, 'Rio Vermelho', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315620, 'Rochedo De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315645, 'Ros�rio Da Limeira', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315660, 'Rubim', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315680, 'Sabin�polis', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315710, 'Salto Da Divisa', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315725, 'Santa B�rbara Do Leste', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315733, 'Santa Cruz De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315740, 'Santa Cruz Do Escalvado', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315765, 'Santa Helena De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315790, 'Santa Margarida', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315810, 'Santa Maria Do Salto', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315920, 'Santa Rita De Caldas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315935, 'Santa Rita De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315960, 'Santa Rita Do Sapuca�', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315970, 'Santa Rosa Da Serra', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315980, 'Santa Vit�ria', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315840, 'Santana De Cataguases', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315870, 'Santana Do Garamb�u', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315890, 'Santana Do Manhua�u', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (315910, 'Santana Dos Montes', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316000, 'Santo Ant�nio Do Aventureiro', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316030, 'Santo Ant�nio Do Jacinto', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316045, 'Santo Ant�nio Do Retiro', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316070, 'Santos Dumont', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316090, 'S�o Br�s Do Sua�u�', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316105, 'S�o F�lix De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316120, 'S�o Francisco De Paula', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316140, 'S�o Francisco Do Gl�ria', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316165, 'S�o Geraldo Do Baixio', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316190, 'S�o Gon�alo Do Rio Abaixo', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316200, 'S�o Gon�alo Do Sapuca�', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316225, 'S�o Jo�o Da Lagoa', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316240, 'S�o Jo�o Da Ponte', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316255, 'S�o Jo�o Do Manhua�u', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316260, 'S�o Jo�o Do Oriente', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316280, 'S�o Jo�o Evangelista', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316292, 'S�o Joaquim De Bicas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316300, 'S�o Jos� Da Safira', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316320, 'S�o Jos� Do Alegre', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316350, 'S�o Jos� Do Jacuri', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316370, 'S�o Louren�o', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316410, 'S�o Pedro Do Sua�u�', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316430, 'S�o Roque De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316443, 'S�o Sebasti�o Da Vargem Alegre', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316460, 'S�o Sebasti�o Do Oeste', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316480, 'S�o Sebasti�o Do Rio Preto', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316510, 'S�o Tom�s De Aquino', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316540, 'Sapuca� Mirim', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316556, 'Sem Peixe', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316560, 'Senador Cortes', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316580, 'Senador Jos� Bento', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316610, 'Senhora Do Porto', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316630, 'Sericita', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316660, 'Serra Da Saudade', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316670, 'Serra Dos Aimor�s', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316695, 'Serran�polis De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316720, 'Sete Lagoas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316740, 'Silvian�polis', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316760, 'Simon�sia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316780, 'Soledade De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316805, 'Taparuba', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316810, 'Tapira', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316830, 'Taquara�u De Minas', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316860, 'Te�filo Otoni', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316880, 'Tiradentes', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316905, 'Tocos Do Moji', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316920, 'Tombos', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316935, 'Tr�s Marias', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316960, 'Tupaciguara', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (316980, 'Turvol�ndia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (317005, 'Ubaporanga', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (317020, 'Uberl�ndia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (317040, 'Una�', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (317050, 'Uruc�nia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (317057, 'Vargem Alegre', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (317065, 'Vargem Grande Do Rio Pardo', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (317080, 'V�rzea Da Palma', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (317103, 'Verdel�ndia', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (317110, 'Ver�ssimo', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (317120, 'Vespasiano', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (317160, 'Virgem Da Lapa', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (317180, 'Virgin�polis', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (317200, 'Visconde Do Rio Branco', '2017-09-10', 31, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500020, '�gua Clara', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500060, 'Amambai', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500085, 'Ang�lica', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500100, 'Aparecida Do Taboado', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500124, 'Aral Moreira', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500200, 'Bataypor�', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500215, 'Bodoquena', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500230, 'Brasil�ndia', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500270, 'Campo Grande', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500290, 'Cassil�ndia', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500315, 'Coronel Sapucaia', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500325, 'Costa Rica', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500348, 'Dois Irm�os Do Buriti', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500370, 'Dourados', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500380, 'F�tima Do Sul', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500410, 'Guia Lopes Da Laguna', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500450, 'Itapor�', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500470, 'Ivinhema', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500490, 'Jaraguari', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500510, 'Jate�', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500525, 'Laguna Carap�', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500560, 'Miranda', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500570, 'Navira�', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500600, 'Nova Alvorada Do Sul', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500630, 'Parana�ba', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500640, 'Pedro Gomes', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500690, 'Porto Murtinho', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500730, 'Rio Negro', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500750, 'Rochedo', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500769, 'S�o Gabriel Do Oeste', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500790, 'Sidrol�ndia', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500795, 'Tacuru', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500797, 'Taquarussu', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (500830, 'Tr�s Lagoas', '2017-09-10', 50, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510010, 'Acorizal', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510025, 'Alta Floresta', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510040, 'Alto Gar�as', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510060, 'Alto Taquari', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510120, 'Araguainha', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510130, 'Aren�polis', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510160, 'Bar�o De Melga�o', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510180, 'Barra Do Gar�as', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510250, 'C�ceres', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510263, 'Campo Novo Do Parecis', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510269, 'Canabrava Do Norte', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510279, 'Carlinda', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510300, 'Chapada Dos Guimar�es', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510320, 'Col�der', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510335, 'Confresa', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510336, 'Conquista D`Oeste', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510343, 'Curvel�ndia', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510350, 'Diamantino', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510370, 'Feliz Natal', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510390, 'General Carneiro', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510410, 'Guarant� Do Norte', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510450, 'Indiava�', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510455, 'Ita�ba', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510480, 'Jaciara', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510500, 'Jauru', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510517, 'Juruena', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510523, 'Lambari D`Oeste', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510530, 'Luci�ra', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510562, 'Mirassol D`Oeste', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510600, 'Nortel�ndia', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510615, 'Nova Bandeirantes', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510880, 'Nova Guarita', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510885, 'Nova Maril�ndia', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510895, 'Nova Monte Verde', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510623, 'Nova Ol�mpia', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510624, 'Nova Ubirat�', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510627, 'Novo Horizonte Do Norte', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510628, 'Novo S�o Joaquim', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510630, 'Paranatinga', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510642, 'Peixoto De Azevedo', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510665, 'Pontal Do Araguaia', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510675, 'Pontes E Lacerda', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510680, 'Porto Dos Ga�chos', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510700, 'Poxor�o', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510706, 'Quer�ncia', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510718, 'Ribeir�o Cascalheira', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510757, 'Rondol�ndia', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510770, 'Ros�rio Oeste', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510774, 'Santa Cruz Do Xingu', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510777, 'Santa Terezinha', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510779, 'Santo Ant�nio Do Leste', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510785, 'S�o F�lix Do Araguaia', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510729, 'S�o Jos� Do Povo', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510730, 'S�o Jos� Do Rio Claro', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510710, 'S�o Jos� Dos Quatro Marcos', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510790, 'Sinop', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510794, 'Tabapor�', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510800, 'Tapurah', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510820, 'Torixor�u', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510835, 'Vale De S�o Domingos', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (510550, 'Vila Bela Da Sant�ssima Trindade', '2017-09-10', 51, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150010, 'Abaetetuba', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150020, 'Acar�', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150040, 'Alenquer', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150060, 'Altamira', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150080, 'Ananindeua', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150090, 'Augusto Corr�a', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150110, 'Bagre', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150125, 'Bannach', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150145, 'Belterra', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150157, 'Bom Jesus Do Tocantins', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150170, 'Bragan�a', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150175, 'Brejo Grande Do Araguaia', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150190, 'Bujaru', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150195, 'Cachoeira Do Piri�', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150220, 'Capanema', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150240, 'Castanhal', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150260, 'Colares', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150276, 'Cumaru Do Norte', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150280, 'Curralinho', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150290, 'Curu��', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150295, 'Eldorado Dos Caraj�s', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150307, 'Garraf�o Do Norte', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150320, 'Igarap� A�u', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150340, 'Inhangapi', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150350, 'Irituia', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150375, 'Jacareacanga', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150390, 'Juruti', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150405, 'M�e Do Rio', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150420, 'Marab�', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150442, 'Marituba', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150450, 'Melga�o', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150470, 'Moju', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150495, 'Nova Esperan�a Do Piri�', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150500, 'Nova Timboteua', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150506, 'Novo Repartimento', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150530, 'Oriximin�', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150543, 'Ouril�ndia Do Norte', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150550, 'Paragominas', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150555, 'Pau D`Arco', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150565, 'Placas', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150580, 'Portel', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150600, 'Prainha', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150611, 'Quatipuru', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150618, 'Rondon Do Par�', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150620, 'Salin�polis', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150635, 'Santa B�rbara Do Par�', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150640, 'Santa Cruz Do Arari', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150650, 'Santa Isabel Do Par�', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150660, 'Santa Maria Do Par�', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150690, 'Santar�m Novo', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150710, 'S�o Caetano De Odivelas', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150720, 'S�o Domingos Do Capim', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150745, 'S�o Geraldo Do Araguaia', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150747, 'S�o Jo�o De Pirabas', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150770, 'S�o Sebasti�o Da Boa Vista', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150790, 'Soure', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150796, 'Terra Alta', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150803, 'Tracuateua', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150808, 'Tucum�', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150812, 'Ulian�polis', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150830, 'Viseu', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (150840, 'Xinguara', '2017-09-10', 15, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250020, 'Aguiar', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250040, 'Alagoa Nova', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250053, 'Alcantil', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250073, 'Amparo', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250080, 'Ara�agi', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250100, 'Araruna', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250115, 'Areia De Bara�nas', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250135, 'Assun��o', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250150, 'Bananeiras', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250160, 'Barra De Santa Rosa', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250180, 'Bayeux', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250200, 'Bel�m Do Brejo Do Cruz', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250215, 'Boa Vista', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250230, 'Bom Sucesso', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250250, 'Boqueir�o', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250290, 'Brejo Dos Santos', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250310, 'Cabaceiras', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250330, 'Cachoeira Dos �ndios', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250355, 'Cacimbas', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250370, 'Cajazeiras', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250380, 'Caldas Brand�o', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250403, 'Capim', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250410, 'Carrapateira', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250420, 'Catingueira', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250440, 'Concei��o', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250460, 'Conde', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250480, 'Coremas', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250490, 'Cruz Do Esp�rito Santo', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250523, 'Cuit� De Mamanguape', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250527, 'Curral De Cima', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250540, 'Desterro', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250580, 'Duas Estradas', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250600, 'Esperan�a', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250620, 'Frei Martinho', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250640, 'Gurinh�m', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250660, 'Ibiara', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250670, 'Imaculada', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250700, 'Itaporanga', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250710, 'Itapororoca', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250720, 'Itatuba', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250740, 'Jeric�', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251365, 'Joca Claudino', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250780, 'Junco Do Serid�', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250810, 'Lagoa', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250830, 'Lagoa Seca', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250850, 'Livramento', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250860, 'Lucena', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250890, 'Mamanguape', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250905, 'Marca��o', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250915, 'Mariz�polis', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250933, 'Matinhas', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250939, 'Matur�ia', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250950, 'Montadas', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (250980, 'Mulungu', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251000, 'Nazarezinho', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251020, 'Nova Olinda', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251040, 'Olho D`�gua', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251060, 'Ouro Velho', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251080, 'Patos', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251100, 'Pedra Branca', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251120, 'Pedras De Fogo', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251140, 'Picu�', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251160, 'Pil�es', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251180, 'Pirpirituba', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251203, 'Po�o Dantas', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251210, 'Pombal', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251396, 'S�o Domingos', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251400, 'S�o Jo�o Do Cariri', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251420, 'S�o Jos� Da Lagoa Tapada', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251440, 'S�o Jos� De Espinharas', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251460, 'S�o Jos� Do Bonfim', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251480, 'S�o Jos� Dos Cordeiros', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251500, 'S�o Miguel De Taipu', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251520, 'S�o Sebasti�o Do Umbuzeiro', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251550, 'Serra Branca', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251580, 'Serra Redonda', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251593, 'Sert�ozinho', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251610, 'Soledade', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251620, 'Sousa', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251640, 'Tacima', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251670, 'Teixeira', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251675, 'Ten�rio', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251690, 'Uira�na', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251720, 'Vieir�polis', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (251740, 'Zabel�', '2017-09-10', 25, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260010, 'Afogados Da Ingazeira', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260040, '�gua Preta', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260060, 'Alagoinha', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260080, 'Altinho', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260105, 'Ara�oiaba', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260120, 'Arcoverde', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260140, 'Barreiros', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260160, 'Bel�m De S�o Francisco', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260190, 'Bezerros', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260210, 'Bom Conselho', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260240, 'Brej�o', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260260, 'Brejo Da Madre De Deus', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260290, 'Cabo De Santo Agostinho', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260310, 'Cachoeirinha', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260340, 'Calumbi', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260350, 'Camocim De S�o F�lix', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260380, 'Capoeiras', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260392, 'Carnaubeira Da Penha', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260415, 'Casinhas', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260430, 'Cedro', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260450, 'Ch� Grande', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260470, 'Correntes', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260500, 'Cupira', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260515, 'Dormentes', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260530, 'Exu', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260545, 'Fernando De Noronha', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260570, 'Floresta', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260590, 'Gameleira', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260610, 'Gl�ria Do Goit�', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260640, 'Gravat�', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260660, 'Ibimirim', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260680, 'Igarassu', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260760, 'Ilha De Itamarac�', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260805, 'Jatob�', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260820, 'Joaquim Nabuco', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260840, 'Jurema', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260850, 'Lagoa Do Itaenga', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260870, 'Lagoa Dos Gatos', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260890, 'Limoeiro', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260910, 'Machados', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260920, 'Maraial', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261430, 'Moreil�ndia', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260960, 'Olinda', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (260980, 'Oroc�', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261010, 'Palmeirina', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261030, 'Paranatama', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261050, 'Passira', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261070, 'Paulista', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261080, 'Pedra', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261110, 'Petrolina', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261130, 'Pombos', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261150, 'Quipap�', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261170, 'Riacho Das Almas', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261190, 'Rio Formoso', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261210, 'Salgadinho', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261240, 'Sanhar�', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261247, 'Santa Cruz Da Baixa Verde', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261255, 'Santa Filomena', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261280, 'Santa Terezinha', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261300, 'S�o Bento Do Una', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261330, 'S�o Joaquim Do Monte', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261350, 'S�o Jos� Do Belmonte', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261370, 'S�o Louren�o Da Mata', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261400, 'Serrita', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261420, 'Sirinha�m', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261460, 'Tabira', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261480, 'Tacaratu', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261500, 'Taquaritinga Do Norte', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261530, 'Timba�ba', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261550, 'Tracunha�m', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261570, 'Triunfo', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261600, 'Venturosa', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261618, 'Vertente Do L�rio', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (261630, 'Vic�ncia', '2017-09-10', 26, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220005, 'Acau�', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220020, '�gua Branca', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220027, 'Alegrete Do Piau�', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220045, 'Alvorada Do Gurgu�ia', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220060, 'Angical Do Piau�', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220080, 'Ant�nio Almeida', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220100, 'Arraial', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220115, 'Baixa Grande Do Ribeiro', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220120, 'Barras', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220140, 'Barro Duro', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220155, 'Bela Vista Do Piau�', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220170, 'Bertol�nia', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220180, 'Bocaina', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220191, 'Bom Princ�pio Do Piau�', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220194, 'Boqueir�o Do Piau�', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220200, 'Buriti Dos Lopes', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220205, 'Cabeceiras Do Piau�', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220209, 'Caldeir�o Grande Do Piau�', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220213, 'Campo Grande Do Piau�', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220225, 'Canavieira', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220230, 'Canto Do Buriti', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220250, 'Caracol', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220255, 'Caridade Do Piau�', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220270, 'Cocal', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220272, 'Cocal Dos Alves', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220275, 'Col�nia Do Gurgu�ia', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220277, 'Col�nia Do Piau�', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220280, 'Concei��o Do Canind�', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220300, 'Cristal�ndia Do Piau�', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220320, 'Curimat�', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220327, 'Curral Novo Do Piau�', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220335, 'Dirceu Arcoverde', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220345, 'Dom Inoc�ncio', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220350, 'Elesb�o Veloso', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220375, 'Fartura Do Piau�', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220385, 'Floresta Do Piau�', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220400, 'Francin�polis', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220420, 'Francisco Santos', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220435, 'Geminiano', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220455, 'Guaribas', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220465, 'Ilha Grande', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220480, 'Ipiranga Do Piau�', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220500, 'Itain�polis', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220520, 'Jaic�s', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220527, 'Jatob� Do Piau�', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220540, 'Joaquim Pires', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220550, 'Jos� De Freitas', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220552, 'J�lio Borges', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220557, 'Lagoa De S�o Francisco', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220558, 'Lagoa Do Piau�', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220560, 'Landri Sales', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220580, 'Luzil�ndia', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220590, 'Manoel Em�dio', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220605, 'Massap� Do Piau�', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220620, 'Miguel Alves', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220635, 'Milton Brand�o', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220660, 'Monte Alegre Do Piau�', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220667, 'Morro Do Chap�u Do Piau�', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220672, 'Naz�ria', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220680, 'Nossa Senhora Dos Rem�dios', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220695, 'Novo Santo Ant�nio', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220710, 'Olho D`�gua Do Piau�', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220735, 'Paje� Do Piau�', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220755, 'Paquet�', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220770, 'Parna�ba', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220777, 'Patos Do Piau�', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220780, 'Paulistana', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220793, 'Pedro Laurentino', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220810, 'Pimenteiras', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220830, 'Piracuruca', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220855, 'Porto Alegre Do Piau�', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220865, 'Queimada Nova', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220880, 'Regenera��o', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220890, 'Ribeiro Gon�alves', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220910, 'Santa Cruz Do Piau�', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220930, 'Santa Luz', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220935, 'Santana Do Piau�', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220945, 'Santo Ant�nio Dos Milagres', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220950, 'Santo In�cio Do Piau�', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220960, 'S�o F�lix Do Piau�', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220970, 'S�o Francisco Do Piau�', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220980, 'S�o Gon�alo Do Piau�', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220990, 'S�o Jo�o Da Serra', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (220997, 'S�o Jo�o Do Arraial', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (221010, 'S�o Jos� Do Peixe', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (221035, 'S�o Louren�o Do Piau�', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (221038, 'S�o Miguel Da Baixa Grande', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (221050, 'S�o Pedro Do Piau�', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (221062, 'Sebasti�o Barros', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (221070, 'Sim�es', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (221090, 'Socorro Do Piau�', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (221095, 'Tamboril Do Piau�', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (221110, 'Uni�o', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (221130, 'Valen�a Do Piau�', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (221140, 'V�rzea Grande', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (221170, 'Wall Ferraz', '2017-09-10', 22, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410020, 'Adrian�polis', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410040, 'Almirante Tamandar�', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410060, 'Alto Paran�', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410080, 'Alvorada Do Sul', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410100, 'Amp�re', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410110, 'Andir�', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410130, 'Ant�nio Olinto', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410150, 'Arapongas', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410165, 'Arapu�', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410185, 'Ariranha Do Iva�', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410200, 'Assis Chateaubriand', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410220, 'Atalaia', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410250, 'Barbosa Ferraz', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410260, 'Barrac�o', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410280, 'Bela Vista Do Para�so', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410302, 'Boa Esperan�a Do Igua�u', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410305, 'Boa Vista Da Aparecida', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410320, 'Bom Sucesso', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410330, 'Borraz�polis', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410340, 'Cafeara', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410347, 'Cafezal Do Sul', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410360, 'Cambar�', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410390, 'Campina Da Lagoa', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410400, 'Campina Grande Do Sul', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410410, 'Campo Do Tenente', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410430, 'Campo Mour�o', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410442, 'Cand�i', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410460, 'Capit�o Le�nidas Marques', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410470, 'Carl�polis', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410500, 'Catanduvas', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410520, 'Cerro Azul', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410540, 'Chopinzinho', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410560, 'Cidade Ga�cha', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410600, 'Congonhinhas', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410610, 'Conselheiro Mairinck', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410630, 'Corb�lia', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410645, 'Coronel Domingos Soares', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410680, 'Cruz Machado', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410660, 'Cruzeiro Do Oeste', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410690, 'Curitiba', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410715, 'Diamante D`Oeste', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410712, 'Diamante Do Sul', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410730, 'Doutor Camargo', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410740, 'En�as Marques', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410752, 'Esperan�a Nova', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410755, 'Farol', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410765, 'Fazenda Rio Grande', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410775, 'Figueira', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410780, 'Flora�', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410800, 'Florest�polis', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410820, 'Formosa Do Oeste', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410832, 'Francisco Alves', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410850, 'General Carneiro', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410865, 'Goioxim', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410880, 'Gua�ra', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410895, 'Guamiranga', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410920, 'Guaraci', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410940, 'Guarapuava', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410960, 'Guaratuba', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410970, 'Ibaiti', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (410990, 'Icara�ma', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411005, 'Iguatu', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411010, 'Imbituva', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411030, 'Inaj�', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411060, 'Ipor�', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411070, 'Irati', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411090, 'Itaguaj�', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411100, 'Itambarac�', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411120, 'Itapejara D`Oeste', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411140, 'Iva�', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411155, 'Ivat�', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411180, 'Jacarezinho', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411200, 'Jaguaria�va', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411220, 'Jani�polis', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411240, 'Japur�', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411260, 'Jardim Olinda', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411280, 'Joaquim T�vora', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411295, 'Juranda', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411320, 'Lapa', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411330, 'Laranjeiras Do Sul', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411342, 'Lidian�polis', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411360, 'Lobato', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411373, 'Luiziana', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411380, 'Lupion�polis', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411410, 'Mandagua�u', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411430, 'Mandirituba', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411440, 'Mangueirinha', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411460, 'Marechal C�ndido Rondon', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411490, 'Maril�ndia Do Sul', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411510, 'Mariluz', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411520, 'Maring�', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411535, 'Marip�', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411545, 'Marquinho', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411570, 'Matinhos', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411575, 'Mau� Da Serra', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411585, 'Mercedes', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411605, 'Missal', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411620, 'Morretes', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411640, 'Nossa Senhora Das Gra�as', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411660, 'Nova Am�rica Da Colina', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411690, 'Nova Esperan�a', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411700, 'Nova F�tima', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411710, 'Nova Londrina', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411721, 'Nova Santa B�rbara', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411729, 'Novo Itacolomi', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411740, 'Ourizona', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411750, 'Pai�andu', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411780, 'Palmital', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411800, 'Para�so Do Norte', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411820, 'Paranagu�', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411845, 'Pato Bragado', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411860, 'Paula Freitas', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411880, 'Peabiru', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411900, 'P�rola D`Oeste', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411915, 'Pinhais', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411920, 'Pinhal�o', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411950, 'Piraquara', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411965, 'Pitangueiras', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (411980, 'Planalto', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412000, 'Porecatu', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412015, 'Porto Barreiro', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412030, 'Porto Vit�ria', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412040, 'Presidente Castelo Branco', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412060, 'Prudent�polis', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412070, 'Quatigu�', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412085, 'Quatro Pontes', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412110, 'Quinta Do Sol', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412125, 'Ramil�ndia', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412135, 'Rancho Alegre D`Oeste', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412160, 'Renascen�a', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412175, 'Reserva Do Igua�u', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412190, 'Ribeir�o Do Pinhal', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412215, 'Rio Bonito Do Igua�u', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412230, 'Rio Negro', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412250, 'Roncador', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412265, 'Ros�rio Do Iva�', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412290, 'Salto Do Itarar�', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412310, 'Santa Am�lia', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412330, 'Santa Cruz De Monte Castelo', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412360, 'Santa In�s', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412380, 'Santa Izabel Do Oeste', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412390, 'Santa Mariana', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412402, 'Santa Tereza Do Oeste', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412400, 'Santana Do Itarar�', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412410, 'Santo Ant�nio Da Platina', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412440, 'Santo Ant�nio Do Sudoeste', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412460, 'S�o Carlos Do Iva�', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412490, 'S�o Jo�o Do Caiu�', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412520, 'S�o Jorge D`Oeste', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412535, 'S�o Jorge Do Patroc�nio', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412550, 'S�o Jos� Dos Pinhais', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412570, 'S�o Miguel Do Igua�u', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412580, 'S�o Pedro Do Iva�', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412600, 'S�o Sebasti�o Da Amoreira', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412625, 'Sarandi', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412635, 'Serran�polis Do Igua�u', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412650, 'Sertan�polis', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412667, 'Tamarana', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412680, 'Tapejara', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412700, 'Teixeira Soares', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412730, 'Terra Rica', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412750, 'Tibagi', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412770, 'Toledo', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412785, 'Tr�s Barras Do Paran�', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412795, 'Tup�ssi', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412800, 'Ubirat�', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412820, 'Uni�o Da Vit�ria', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412853, 'Ventania', '2017-09-10', 41, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (412860, 'Ver�', '2017-09-10', 41, true);\r\n" + 
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
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330320, 'Nil�polis', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330340, 'Nova Friburgo', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330370, 'Para�ba Do Sul', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330385, 'Paty Do Alferes', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330395, 'Pinheiral', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330411, 'Porto Real', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330412, 'Quatis', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330414, 'Queimados', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330420, 'Resende', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330440, 'Rio Claro', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330452, 'Rio Das Ostras', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330470, 'Santo Ant�nio De P�dua', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330475, 'S�o Francisco De Itabapoana', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330510, 'S�o Jo�o De Meriti', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330520, 'S�o Pedro Da Aldeia', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330550, 'Saquarema', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330560, 'Silva Jardim', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330580, 'Teres�polis', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330600, 'Tr�s Rios', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330620, 'Vassouras', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (330630, 'Volta Redonda', '2017-09-10', 33, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240030, 'Afonso Bezerra', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240060, 'Almino Afonso', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240080, 'Angicos', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240100, 'Apodi', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240120, 'Ar�s', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240140, 'Ba�a Formosa', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240160, 'Bento Fernandes', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240170, 'Bom Jesus', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240185, 'Cai�ara Do Norte', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240210, 'Campo Redondo', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240230, 'Cara�bas', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240250, 'Carnaubais', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240280, 'Coronel Ezequiel', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240300, 'Cruzeta', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240320, 'Doutor Severiano', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240350, 'Esp�rito Santo', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240370, 'Felipe Guerra', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240380, 'Flor�nia', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240400, 'Frutuoso Gomes', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240430, 'Governador Dix Sept Rosado', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240460, 'Ielmo Marinho', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240480, 'Ipueira', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240490, 'Ita�', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240520, 'Jandu�s', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240540, 'Japi', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240560, 'Jardim De Piranhas', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240580, 'Jo�o C�mara', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240610, 'Jucurutu', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240620, 'Lagoa D`Anta', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240650, 'Lagoa Nova', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240670, 'Lajes', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240690, 'Lucr�cia', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240710, 'Maca�ba', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240730, 'Marcelino Vieira', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240750, 'Maxaranguape', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240770, 'Montanhas', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240790, 'Monte Das Gameleiras', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240820, 'N�sia Floresta', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240840, 'Olho D`�gua Do Borges', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240870, 'Para�', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240880, 'Parazinho', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240325, 'Parnamirim', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240920, 'Passagem', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240940, 'Pau Dos Ferros', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (240970, 'Pedro Avelino', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241000, 'Pil�es', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241010, 'Po�o Branco', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241030, 'Presidente Juscelino', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241060, 'Rafael Godeiro', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241080, 'Riacho De Santana', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241100, 'Rodolfo Fernandes', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241120, 'Santa Cruz', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241140, 'Santana Do Matos', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241150, 'Santo Ant�nio', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241180, 'S�o Fernando', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241200, 'S�o Gon�alo Do Amarante', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241230, 'S�o Jos� Do Campestre', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241250, 'S�o Miguel', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241260, 'S�o Paulo Do Potengi', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241290, 'S�o Tom�', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241310, 'Senador El�i De Souza', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241335, 'Serra Do Mel', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241350, 'Serrinha', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241360, 'Severiano Melo', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241390, 'Taipu', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241410, 'Tenente Ananias', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241105, 'Tibau', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241430, 'Timba�ba Dos Batistas', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241450, 'Umarizal', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241470, 'V�rzea', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (241490, 'Vi�osa', '2017-09-10', 24, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110001, 'Alta Floresta D`Oeste', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110040, 'Alto Para�so', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110045, 'Buritis', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110060, 'Cacaul�ndia', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110070, 'Campo Novo De Rond�nia', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110005, 'Cerejeiras', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110006, 'Colorado Do Oeste', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110094, 'Cujubim', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110100, 'Governador Jorge Teixeira', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110011, 'Jaru', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110013, 'Machadinho D`Oeste', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110130, 'Mirante Da Serra', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110033, 'Nova Mamor�', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110050, 'Novo Horizonte Do Oeste', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110018, 'Pimenta Bueno', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110020, 'Porto Velho', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110147, 'Primavera De Rond�nia', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110029, 'Santa Luzia D`Oeste', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110149, 'S�o Francisco Do Guapor�', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110155, 'Teixeir�polis', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110175, 'Vale Do Anari', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (110180, 'Vale Do Para�so', '2017-09-10', 11, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (140002, 'Amajari', '2017-09-10', 14, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (140015, 'Bonfim', '2017-09-10', 14, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (140020, 'Caracara�', '2017-09-10', 14, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (140028, 'Iracema', '2017-09-10', 14, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (140045, 'Pacaraima', '2017-09-10', 14, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (140050, 'S�o Jo�o Da Baliza', '2017-09-10', 14, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430003, 'Acegu�', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430010, 'Agudo', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430030, 'Alecrim', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430045, 'Alegria', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430050, 'Alpestre', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430057, 'Alto Feliz', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430957, 'Herveiras', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430064, 'Ametista Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430070, 'Anta Gorda', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430085, 'Arambar�', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430100, 'Arroio Do Meio', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430105, 'Arroio Do Sal', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430130, 'Arroio Grande', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430150, 'Augusto Pestana', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430163, 'Balne�rio Pinhal', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430170, 'Bar�o De Cotegipe', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430185, 'Barra Do Guarita', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430192, 'Barra Do Rio Azul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430200, 'Barros Cassal', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430210, 'Bento Gon�alves', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430220, 'Boa Vista Do Buric�', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430225, 'Boa Vista Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430235, 'Bom Princ�pio', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430245, 'Boqueir�o Do Le�o', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430258, 'Bozano', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430270, 'Buti�', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430290, 'Cacequi', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430310, 'Cachoeirinha', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430340, 'Cai�ara', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430355, 'Camargo', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430367, 'Campestre Da Serra', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430380, 'Campinas Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430410, 'Campos Borges', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430430, 'C�ndido God�i', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430450, 'Cangu�u', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430461, 'Canudos Do Vale', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430463, 'Cap�o Da Canoa', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430468, 'Capela De Santana', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430467, 'Capivari Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430480, 'Carlos Barbosa', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430490, 'Casca', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430510, 'Caxias Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430512, 'Cerrito', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430515, 'Cerro Grande', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430520, 'Cerro Largo', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430537, 'Charrua', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430543, 'Chu�', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430545, 'Cidreira', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430550, 'Cir�aco', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430560, 'Colorado', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430580, 'Constantina', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430585, 'Coqueiros Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430590, 'Coronel Bicaco', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430597, 'Coxilha', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430605, 'Cristal', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430610, 'Cruz Alta', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430620, 'Cruzeiro Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430635, 'Dezesseis De Novembro', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430640, 'Dois Irm�os', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430650, 'Dom Feliciano', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430655, 'Dom Pedro De Alc�ntara', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430675, 'Doutor Ricardo', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430690, 'Encruzilhada Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430695, 'Entre Rios Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430697, 'Erebango', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430720, 'Erval Grande', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430740, 'Esmeralda', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430750, 'Espumoso', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430760, 'Est�ncia Velha', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430781, 'Estrela Velha', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430786, 'Fagundes Varela', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430805, 'Faxinalzinho', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430810, 'Feliz', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430825, 'Floriano Peixoto', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430843, 'Forquetinha', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430850, 'Frederico Westphalen', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430870, 'Gaurama', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430885, 'Gentil', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430900, 'Giru�', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430912, 'Gramado Dos Loureiros', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430920, 'Gravata�', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430930, 'Gua�ba', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430950, 'Guarani Das Miss�es', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430970, 'Humait�', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430980, 'Ibia��', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (430995, 'Ibirapuit�', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431010, 'Igrejinha', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431033, 'Imb�', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431040, 'Independ�ncia', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431046, 'Ipiranga Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431053, 'Itaara', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431057, 'Itapuca', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431070, 'Itatiba Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431080, 'Ivoti', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431087, 'Jacuizinho', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431110, 'Jaguari', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431113, 'Jari', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431120, 'J�lio De Castilhos', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431127, 'Lagoa Dos Tr�s Cantos', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431140, 'Lajeado', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431150, 'Lavras Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431164, 'Linha Nova', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431171, 'Ma�ambara', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431173, 'Mampituba', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431177, 'Maquin�', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431190, 'Marcelino Ramos', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431200, 'Mariano Moro', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431213, 'Mato Castelhano', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431217, 'Mato Queimado', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431230, 'Miragua�', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431237, 'Monte Alegre Dos Campos', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431242, 'Morma�o', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431245, 'Morro Redondo', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431250, 'Mostardas', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431261, 'Muitos Cap�es', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431267, 'Nicolau Vergueiro', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431275, 'Nova Alvorada', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431295, 'Nova Boa Vista', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431301, 'Nova Candel�ria', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431308, 'Nova P�dua', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431320, 'Nova Petr�polis', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431333, 'Nova Ramada', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431337, 'Nova Santa Rita', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431340, 'Novo Hamburgo', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431344, 'Novo Tiradentes', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431360, 'Paim Filho', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431370, 'Palmeira Das Miss�es', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431395, 'Pantano Grande', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431402, 'Para�so Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431406, 'Passa Sete', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431407, 'Passo Do Sobrado', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431415, 'Paverama', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431420, 'Pedro Os�rio', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431442, 'Picada Caf�', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431446, 'Pinhal Da Serra', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431450, 'Pinheiro Machado', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431460, 'Piratini', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431475, 'Po�o Das Antas', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431480, 'Port�o', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431500, 'Porto Lucena', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431507, 'Porto Vera Cruz', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431514, 'Presidente Lucena', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431517, 'Prot�sio Alves', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431531, 'Quatro Irm�os', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431535, 'Quinze De Novembro', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431550, 'Restinga Seca', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431560, 'Rio Grande', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431575, 'Riozinho', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431595, 'Rolador', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431610, 'Ronda Alta', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431630, 'Roque Gonzales', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431643, 'Saldanha Marinho', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431647, 'Salvador Das Miss�es', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431670, 'Santa B�rbara Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431675, 'Santa Clara Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431680, 'Santa Cruz Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431697, 'Santa Margarida Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431695, 'Santa Maria Do Herval', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431730, 'Santa Vit�ria Do Palmar', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431710, 'Santana Do Livramento', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431760, 'Santo Ant�nio Da Patrulha', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431755, 'Santo Ant�nio Do Palma', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431780, 'Santo Augusto', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431800, 'S�o Borja', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431810, 'S�o Francisco De Assis', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431840, 'S�o Jer�nimo', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431843, 'S�o Jo�o Do Pol�sine', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431846, 'S�o Jos� Do Herval', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431849, 'S�o Jos� Do Inhacor�', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431861, 'S�o Jos� Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431880, 'S�o Louren�o Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431910, 'S�o Martinho', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431915, 'S�o Miguel Das Miss�es', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420750, 'Indaial', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431930, 'S�o Paulo Das Miss�es', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431937, 'S�o Pedro Do Buti�', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431960, 'S�o Sep�', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431971, 'S�o Valentim Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (431980, 'S�o Vicente Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432000, 'Sapucaia Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432023, 'Sede Nova', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432030, 'Selbach', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432035, 'Sentinela Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432050, 'Sert�o', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432057, 'Sete De Setembro', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432065, 'Silveira Martins', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432080, 'Soledade', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432090, 'Tapejara', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432120, 'Taquara', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432132, 'Taquaru�u Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432140, 'Tenente Portela', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432146, 'Tio Hugo', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432149, 'Toropi', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432160, 'Tramanda�', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432163, 'Tr�s Arroios', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432180, 'Tr�s De Maio', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432185, 'Tr�s Palmeiras', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432200, 'Triunfo', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432215, 'Tunas', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432220, 'Tupanciret�', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432232, 'Turu�u', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432235, 'Uni�o Da Serra', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432240, 'Uruguaiana', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432254, 'Vale Real', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432255, 'Vanini', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432270, 'Vera Cruz', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432285, 'Vespasiano Correa', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432310, 'Vicente Dutra', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432320, 'Victor Graeff', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432335, 'Vila L�ngaro', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432345, 'Vila Nova Do Sul', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432370, 'Vista Ga�cha', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (432380, 'Xangri L�', '2017-09-10', 43, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420010, 'Abelardo Luz', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420030, 'Agron�mica', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420050, '�guas De Chapec�', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420070, 'Alfredo Wagner', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420080, 'Anchieta', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420100, 'Anita Garibaldi', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420125, 'Api�na', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420130, 'Araquari', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420160, 'Arroio Trinta', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420170, 'Ascurra', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420190, 'Aurora', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420205, 'Balne�rio Barra Do Sul', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421280, 'Balne�reo Pi�arras', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420210, 'Barra Velha', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420215, 'Belmonte', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420230, 'Bigua�u', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420243, 'Bocaina Do Sul', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420257, 'Bom Jesus Do Oeste', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420270, 'Botuver�', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420285, 'Bra�o Do Trombudo', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420290, 'Brusque', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420315, 'Calmon', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420330, 'Campo Alegre', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420350, 'Campo Er�', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420380, 'Canoinhas', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420390, 'Capinzal', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420400, 'Catanduvas', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420415, 'Celso Ramos', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420419, 'Chapad�o Do Lageado', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420430, 'Conc�rdia', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420440, 'Coronel Freitas', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420455, 'Correia Pinto', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420470, 'Cunha Por�', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420480, 'Curitibanos', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420500, 'Dion�sio Cerqueira', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420517, 'Entre Rios', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420530, 'Faxinal Dos Guedes', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420540, 'Florian�polis', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420545, 'Forquilhinha', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420560, 'Galv�o', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420580, 'Garuva', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420600, 'Governador Celso Ramos', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420630, 'Guabiruba', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420650, 'Guaramirim', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420665, 'Guatamb�', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420680, 'Ibicar�', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420700, 'I�ara', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420720, 'Imaru�', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420760, 'Ipira', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420765, 'Ipor� Do Oeste', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420775, 'Iraceminha', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420785, 'Irati', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420810, 'Itai�polis', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420830, 'Itapema', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420845, 'Itapo�', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420870, 'Jacinto Machado', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420890, 'Jaragu� Do Sul', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420900, 'Joa�aba', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420917, 'Jupi�', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420930, 'Lages', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420945, 'Lajeado Grande', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420970, 'Lebon R�gis', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (420985, 'Lind�ia Do Sul', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421003, 'Luzerna', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421010, 'Mafra', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421030, 'Major Vieira', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421055, 'Marema', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421070, 'Matos Costa', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421085, 'Mirim Doce', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421100, 'Monda�', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421110, 'Monte Castelo', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421130, 'Navegantes', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421145, 'Nova Itaberaba', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421165, 'Novo Horizonte', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421175, 'Otac�lio Costa', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421187, 'Paial', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421190, 'Palho�a', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421205, 'Palmeira', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421223, 'Para�so', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421227, 'Passos Maia', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421240, 'Pedras Grandes', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421270, 'Petrol�ndia', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421300, 'Pinheiro Preto', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421315, 'Planalto Alegre', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421335, 'Ponte Alta Do Norte', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421350, 'Porto Belo', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421370, 'Pouso Redondo', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421400, 'Presidente Get�lio', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421415, 'Princesa', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421430, 'Rancho Queimado', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421460, 'Rio Do Oeste', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421470, 'Rio Dos Cedros', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421505, 'Rio Rufino', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421510, 'Rodeio', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421535, 'Saltinho', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421545, 'Sang�o', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421555, 'Santa Helena', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421565, 'Santa Rosa Do Sul', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421569, 'Santiago Do Sul', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350395, 'Asp�sia', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421580, 'S�o Bento Do Sul', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421600, 'S�o Carlos', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421610, 'S�o Domingos', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421630, 'S�o Jo�o Batista', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421635, 'S�o Jo�o Do Itaperi�', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421640, 'S�o Jo�o Do Sul', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421670, 'S�o Jos� Do Cedro', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421690, 'S�o Louren�o Do Oeste', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421710, 'S�o Martinho', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421725, 'S�o Pedro De Alc�ntara', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421750, 'Seara', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421760, 'Sider�polis', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421775, 'Sul Brasil', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421795, 'Tigrinhos', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421810, 'Timb� Do Sul', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421825, 'Timb� Grande', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421840, 'Treze De Maio', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421860, 'Trombudo Central', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421880, 'Turvo', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421890, 'Urubici', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421900, 'Urussanga', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421917, 'Vargem Bonita', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421930, 'Videira', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421940, 'Witmarsum', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (421960, 'Xavantina', '2017-09-10', 42, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280010, 'Amparo De S�o Francisco', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280030, 'Aracaju', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280050, 'Areia Branca', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280070, 'Brejo Grande', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280110, 'Canhoba', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280140, 'Carira', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280160, 'Cedro De S�o Jo�o', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280190, 'Cumbe', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280210, 'Est�ncia', '2017-09-10', 28, true);\r\n" + 
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
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280540, 'Po�o Redondo', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280560, 'Porto Da Folha', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280580, 'Riach�o Do Dantas', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280610, 'Ros�rio Do Catete', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280630, 'Santa Luzia Do Itanhy', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280660, 'Santo Amaro Das Brotas', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280680, 'S�o Domingos', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280710, 'Sim�o Dias', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280730, 'Telha', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (280750, 'Tomar Do Geru', '2017-09-10', 28, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350010, 'Adamantina', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350020, 'Adolfo', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350040, '�guas Da Prata', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350055, '�guas De Santa B�rbara', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350075, 'Alambari', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350090, 'Altair', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350115, 'Alum�nio', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350120, '�lvares Florence', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350150, 'Alvinl�ndia', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350170, 'Am�rico Brasiliense', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350200, 'Anal�ndia', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350220, 'Angatuba', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350250, 'Aparecida', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350270, 'Apia�', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350280, 'Ara�atuba', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350300, 'Aramina', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350320, 'Araraquara', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350335, 'Arco �ris', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350350, 'Areias', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350370, 'Ariranha', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350410, 'Atibaia', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350430, 'Ava�', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350460, 'Bady Bassitt', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350480, 'B�lsamo', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350500, 'Bar�o De Antonina', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350530, 'Barra Bonita', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350540, 'Barra Do Turvo', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350570, 'Barueri', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350590, 'Batatais', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350610, 'Bebedouro', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350630, 'Bernardino De Campos', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350650, 'Birigui', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350670, 'Boa Esperan�a Do Sul', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350700, 'Boituva', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350715, 'Bom Sucesso De Itarar�', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350740, 'Borborema', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350750, 'Botucatu', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350770, 'Bra�na', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350790, 'Brotas', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350810, 'Buritama', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350830, 'Cabr�lia Paulista', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350860, 'Cachoeira Paulista', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350880, 'Cafel�ndia', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350900, 'Caieiras', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350925, 'Cajati', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350940, 'Cajuru', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350950, 'Campinas', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350970, 'Campos Do Jord�o', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (350995, 'Canas', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351010, 'C�ndido Rodrigues', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351020, 'Cap�o Bonito', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351050, 'Caraguatatuba', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351070, 'Cardoso', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351090, 'C�ssia Dos Coqueiros', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351120, 'Catigu�', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351140, 'Cerqueira C�sar', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351150, 'Cerquilho', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351170, 'Charqueada', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351200, 'Colina', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351220, 'Conchal', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351240, 'Cordeir�polis', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351260, 'Coronel Macedo', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351290, 'Cosmorama', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351320, 'Cristais Paulista', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351340, 'Cruzeiro', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351360, 'Cunha', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351385, 'Dirce Reis', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351400, 'Dobrada', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351420, 'Dolcin�polis', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351440, 'Dracena', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351470, 'Echapor�', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351490, 'Elias Fausto', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351495, 'Emba�ba', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351512, 'Emilian�polis', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351518, 'Esp�rito Santo Do Pinhal', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355730, 'Estiva Gerbi', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351535, 'Euclides Da Cunha Paulista', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351560, 'Fernando Prestes', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351570, 'Ferraz De Vasconcelos', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351610, 'Flor�nia', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351620, 'Franca', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351640, 'Franco Da Rocha', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351670, 'Gar�a', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351685, 'Gavi�o Peixoto', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351700, 'Getulina', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351730, 'Guaimb�', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351750, 'Guapia�u', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351770, 'Guar�', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351790, 'Guaraci', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351820, 'Guararapes', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351840, 'Guaratinguet�', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351860, 'Guariba', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351885, 'Guatapar�', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351900, 'Hercul�ndia', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351907, 'Hortol�ndia', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351925, 'Iaras', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351940, 'Ibir�', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351960, 'Ibitinga', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (351990, 'Iep�', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352010, 'Igarapava', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352030, 'Iguape', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352044, 'Ilha Solteira', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352060, 'Indiana', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352080, 'In�bia Paulista', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352110, 'Ipe�na', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352120, 'Iporanga', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352140, 'Iracem�polis', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352170, 'Itaber�', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352190, 'Itajobi', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352210, 'Itanha�m', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352220, 'Itapecerica Da Serra', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352250, 'Itapevi', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352260, 'Itapira', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352280, 'Itaporanga', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352300, 'Itapura', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352320, 'Itarar�', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352340, 'Itatiba', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352360, 'Itirapina', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352390, 'Itu', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352410, 'Ituverava', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352430, 'Jaboticabal', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352450, 'Jaci', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352480, 'Jales', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352500, 'Jandira', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352520, 'Jarinu', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352550, 'Joan�polis', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352570, 'Jos� Bonif�cio', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352585, 'Jumirim', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352600, 'Junqueir�polis', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352630, 'Lagoinha', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352650, 'Lav�nia', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352680, 'Len��is Paulista', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352700, 'Lind�ia', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352725, 'Lourdes', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352740, 'Luc�lia', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352760, 'Lu�s Ant�nio', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352790, 'Lut�cia', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352810, 'Macaubal', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352830, 'Magda', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352850, 'Mairipor�', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352870, 'Marab� Paulista', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352890, 'Mari�polis', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352910, 'Marin�polis', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352940, 'Mau�', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352960, 'Meridiano', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352970, 'Miguel�polis', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (352990, 'Miracatu', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353020, 'Mirante Do Paranapanema', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353050, 'Mococa', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353070, 'Mogi Gua�u', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353090, 'Mombuca', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353120, 'Monte Alegre Do Sul', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353140, 'Monte Apraz�vel', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353160, 'Monte Castelo', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353190, 'Morro Agudo', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353205, 'Motuca', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353220, 'Narandiba', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353240, 'Nazar� Paulista', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353270, 'Nipo�', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353282, 'Nova Campina', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353286, 'Nova Castilho', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353310, 'Nova Guataporanga', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353330, 'Nova Luzit�nia', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353350, 'Novo Horizonte', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353370, 'Ocau�u', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353400, 'Onda Verde', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353420, 'Orindi�va', '2017-09-10', 35, true);\r\n" + 
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
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353640, 'Paulic�ia', '2017-09-10', 35, true);\r\n" + 
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
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353890, 'Piraju�', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353910, 'Pirapora Do Bom Jesus', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353940, 'Piratininga', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353960, 'Planalto', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (353980, 'Po�', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354010, 'Ponga�', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354025, 'Pontalinda', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354040, 'Populina', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354060, 'Porto Feliz', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354075, 'Potim', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354090, 'Prad�polis', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354105, 'Prat�nia', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354120, 'Presidente Bernardes', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354150, 'Presidente Venceslau', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354170, 'Quat�', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354190, 'Queluz', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354210, 'Rafard', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354230, 'Reden��o Da Serra', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354260, 'Registro', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354280, 'Ribeira', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354300, 'Ribeir�o Branco', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354320, 'Ribeir�o Do Sul', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354330, 'Ribeir�o Pires', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354360, 'Rifaina', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354380, 'Rin�polis', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354410, 'Rio Grande Da Serra', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354350, 'Riversul', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354430, 'Roseira', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354460, 'Sabino', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354480, 'Sales', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354500, 'Sales�polis', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354520, 'Salto', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354540, 'Salto Grande', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354560, 'Santa Ad�lia', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354600, 'Santa Branca', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354610, 'Santa Clara D`Oeste', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354620, 'Santa Cruz Da Concei��o', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354630, 'Santa Cruz Das Palmeiras', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354660, 'Santa F� Do Sul', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354680, 'Santa Isabel', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354710, 'Santa Mercedes', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354750, 'Santa Rita Do Passa Quatro', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354720, 'Santana Da Ponte Pensa', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354780, 'Santo Andr�', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354800, 'Santo Ant�nio De Posse', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354810, 'Santo Ant�nio Do Jardim', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354840, 'Sant�polis Do Aguape�', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354870, 'S�o Bernardo Do Campo', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354900, 'S�o Francisco', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354920, 'S�o Jo�o Das Duas Pontes', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354930, 'S�o Jo�o Do Pau D`Alho', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354960, 'S�o Jos� Do Barreiro', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (354990, 'S�o Jos� Dos Campos', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355000, 'S�o Lu�s Do Paraitinga', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355030, 'S�o Paulo', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355050, 'S�o Pedro Do Turvo', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355080, 'S�o Sebasti�o Da Grama', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355110, 'Sarapu�', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355130, 'Sebastian�polis Do Sul', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355150, 'Serrana', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355180, 'Sete Barras', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355200, 'Silveiras', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355230, 'Sud Mennucci', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355255, 'Suzan�polis', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355270, 'Tabatinga', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355290, 'Taciba', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355310, 'Taia�u', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355330, 'Tamba�', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355360, 'Tapiratiba', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355370, 'Taquaritinga', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355385, 'Taquariva�', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355400, 'Tatu�', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355420, 'Tejup�', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355440, 'Terra Roxa', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355460, 'Timburi', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355475, 'Trabiju', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355490, 'Tr�s Fronteiras', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355500, 'Tup�', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355530, 'Turmalina', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355540, 'Ubatuba', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355560, 'Uchoa', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355580, 'Ur�nia', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (355610, 'Valentim Gentil', '2017-09-10', 35, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170070, 'Alvorada', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170105, 'Angico', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170130, 'Aragominas', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170210, 'Aragua�na', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170220, 'Araguatins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170240, 'Arraias', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170270, 'Aurora Do Tocantins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170305, 'Bandeirantes Do Tocantins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170310, 'Barrol�ndia', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170360, 'Brasil�ndia Do Tocantins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170382, 'Cachoeirinha', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170386, 'Cariri Do Tocantins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170389, 'Carrasco Bonito', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170510, 'Chapada Da Natividade', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170550, 'Colinas Do Tocantins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170560, 'Concei��o Do Tocantins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170625, 'Crix�s Do Tocantins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170710, 'Divin�polis Do Tocantins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170730, 'Duer�', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170765, 'Figueir�polis', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170820, 'Formoso Do Araguaia', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170830, 'Goianorte', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (170950, 'Gurupi', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171050, 'Itacaj�', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171090, 'Itapiratins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171180, 'Juarina', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171195, 'Lagoa Do Tocantins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171215, 'Lavandeira', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171250, 'Marian�polis Do Tocantins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171280, 'Mauril�ndia Do Tocantins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171360, 'Monte Do Carmo', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171395, 'Muricil�ndia', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171488, 'Nova Olinda', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171510, 'Novo Acordo', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171525, 'Novo Jardim', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171570, 'Palmeirante', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171575, 'Palmeir�polis', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171630, 'Pau D`Arco', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171660, 'Peixe', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171700, 'Pindorama Do Tocantins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171780, 'Ponte Alta Do Bom Jesus', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171800, 'Porto Alegre Do Tocantins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171840, 'Presidente Kennedy', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171850, 'Recursol�ndia', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171870, 'Rio Dos Bois', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171880, 'Sampaio', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171886, 'Santa F� Do Araguaia', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171890, 'Santa Rosa Do Tocantins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (171900, 'Santa Tereza Do Tocantins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (172010, 'S�o Bento Do Tocantins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (172025, 'S�o Salvador Do Tocantins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (172049, 'S�o Val�rio', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (172093, 'Taipas Do Tocantins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (172120, 'Tocantin�polis', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (172130, 'Tupiratins', '2017-09-10', 17, true);\r\n" + 
				"INSERT INTO tb_cidade (id, nome, dtcadastro, estado_id, ativo) VALUES (172210, 'Xambio�', '2017-09-10', 17, true);";
	}
	

}
