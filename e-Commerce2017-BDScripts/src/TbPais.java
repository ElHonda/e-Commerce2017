
public class TbPais implements IScript{

	@Override
	public String getScript() {
		// TODO Auto-generated method stub
		return "CREATE TABLE tb_pais (\r\n" + 
				"    id integer NOT NULL PRIMARY KEY,\r\n" + 
				"    nome character varying(40) NOT NULL,\r\n" + 
				"    alphacode character varying(3) NOT NULL,\r\n" + 
				"    ativo boolean NOT NULL default false,\r\n" + 
				"    dtcadastro date NOT NULL\r\n" + 
				");\r\n" + 
				"\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (4, 'Afeganist�o', 'AFG', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (710, '�frica do Sul', 'ZAF', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (8, 'Alb�nia', 'ALB', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (276, 'Alemanha', 'DEU', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (20, 'Andorra', 'AND', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (24, 'Angola', 'AGO', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (660, 'Anguilla', 'AIA', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (28, 'Ant�gua e Barbuda', 'ATG', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (682, 'Ar�bia Saudita', 'SAU', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (12, 'Arg�lia', 'DZA', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (32, 'Argentina', 'ARG', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (51, 'Arm�nia', 'ARM', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (533, 'Aruba', 'ABW', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (36, 'Austr�lia', 'AUS', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (40, '�ustria', 'AUT', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (31, 'Azerbaij�o', 'AZE', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (44, 'Bahamas', 'BHS', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (50, 'Bangladesh', 'BGD', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (52, 'Barbados', 'BRB', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (48, 'Barein', 'BHR', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (56, 'B�lgica', 'BEL', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (84, 'Belize', 'BLZ', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (204, 'Benin', 'BEN', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (60, 'Bermuda', 'BMU', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (112, 'Bielor�ssia', 'BLR', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (68, 'Bol�via', 'BOL', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (535, 'Bonaire, Santo Eust�quio e Saba', 'BES', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (70, 'B�snia-Herzegovina', 'BIH', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (72, 'Botsuana', 'BWA', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro, ativo ) VALUES (76, 'Brasil', 'BRA', '2017-09-10' , true );\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (96, 'Brunei', 'BRN', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (100, 'Bulg�ria', 'BGR', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (854, 'Burkina Faso', 'BFA', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (108, 'Burundi', 'BDI', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (64, 'But�o', 'BTN', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (132, 'Cabo Verde', 'CPV', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (120, 'Camar�es', 'CMR', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (116, 'Camboja', 'KHM', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (124, 'Canad�', 'CAN', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (398, 'Casaquist�o', 'KAZ', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (634, 'Catar', 'QAT', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (148, 'Chade', 'TCD', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (152, 'Chile', 'CHL', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (156, 'China', 'CHN', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (344, 'China, Hong Kong', 'HKG', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (446, 'China, Macao', 'MAC', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (196, 'Chipre', 'CYP', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (702, 'Cingapura', 'SGP', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (170, 'Col�mbia', 'COL', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (174, 'Comores', 'COM', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (178, 'Congo', 'COG', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (408, 'Cor�ia do Norte', 'PRK', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (410, 'Cor�ia do Sul', 'KOR', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (384, 'Costa do Marfim', 'CIV', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (188, 'Costa Rica', 'CRI', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (191, 'Cro�cia', 'HRV', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (192, 'Cuba', 'CUB', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (531, 'Cura�ao', 'CUW', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (208, 'Dinamarca', 'DNK', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (262, 'Djibouti', 'DJI', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (212, 'Dominica', 'DMA', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (818, 'Egito', 'EGY', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (222, 'El Salvador', 'SLV', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (784, 'Emirados �rabes Unidos', 'ARE', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (218, 'Equador', 'ECU', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (232, 'Eritr�ia', 'ERI', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (703, 'Eslov�quia', 'SVK', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (705, 'Eslov�nia', 'SVN', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (724, 'Espanha', 'ESP', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (840, 'Estados Unidos da Am�rica', 'USA', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (233, 'Est�nia', 'EST', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (231, 'Eti�pia', 'ETH', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (242, 'Fiji', 'FJI', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (608, 'Filipinas', 'PHL', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (246, 'Finl�ndia', 'FIN', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (250, 'Fran�a', 'FRA', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (266, 'Gab�o', 'GAB', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (270, 'G�mbia', 'GMB', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (288, 'Gana', 'GHA', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (268, 'Ge�rgia', 'GEO', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (292, 'Gibraltar', 'GIB', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (308, 'Granada', 'GRD', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (300, 'Gr�cia', 'GRC', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (304, 'Groenl�ndia', 'GRL', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (316, 'Guam', 'GUM', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (320, 'Guatemala', 'GTM', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (831, 'Guernsey', 'GGY', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (328, 'Guiana', 'GUY', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (254, 'Guiana Francesa', 'GUF', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (324, 'Guin�', 'GIN', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (226, 'Guin� Equatorial', 'GNQ', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (624, 'Guin�-Bissau', 'GNB', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (332, 'Haiti', 'HTI', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (528, 'Holanda', 'NLD', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (340, 'Honduras', 'HND', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (348, 'Hungria', 'HUN', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (887, 'I�men', 'YEM', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (833, 'Ilha de Man', 'IMN', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (312, 'Ilha Guadalupe', 'GLP', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (574, 'Ilha Norfolk', 'NFK', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (638, 'Ilha Reuni�o', 'REU', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (248, 'Ilhas Alanda', 'ALA', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (136, 'Ilhas Cayman', 'CYM', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (184, 'Ilhas Cook', 'COK', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (234, 'Ilhas Faeroe', 'FRO', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (238, 'Ilhas Falkland', 'FLK', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (580, 'Ilhas Marianas', 'MNP', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (584, 'Ilhas Marshall', 'MHL', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (90, 'Ilhas Salom�o', 'SLB', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (796, 'Ilhas Turks e Caicos', 'TCA', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (850, 'Ilhas Virgens', 'VIR', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (92, 'Ilhas Virgens Brit�nicas', 'VGB', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (876, 'Ilhas Wallis e Futuna', 'WLF', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (356, '�ndia', 'IND', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (360, 'Indon�sia', 'IDN', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (364, 'Ir�', 'IRN', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (368, 'Iraque', 'IRQ', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (372, 'Irlanda', 'IRL', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (352, 'Isl�ndia', 'ISL', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (376, 'Israel', 'ISR', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (380, 'It�lia', 'ITA', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (388, 'Jamaica', 'JAM', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (392, 'Jap�o', 'JPN', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (832, 'Jersey', 'JEY', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (400, 'Jord�nia', 'JOR', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (296, 'Kiribati', 'KIR', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (414, 'Kuwait', 'KWT', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (418, 'Laos', 'LAO', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (426, 'Lesoto', 'LSO', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (428, 'Let�nia', 'LVA', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (422, 'L�bano', 'LBN', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (430, 'Lib�ria', 'LBR', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (434, 'L�bia', 'LBY', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (438, 'Liechtenstein', 'LIE', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (440, 'Litu�nia', 'LTU', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (442, 'Luxemburgo', 'LUX', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (807, 'Maced�nia', 'MKD', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (450, 'Madag�scar', 'MDG', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (458, 'Mal�sia', 'MYS', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (454, 'Malau�', 'MWI', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (462, 'Maldivas', 'MDV', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (466, 'Mali', 'MLI', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (470, 'Malta', 'MLT', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (504, 'Marrocos', 'MAR', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (474, 'Martinica', 'MTQ', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (480, 'Maur�cio', 'MUS', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (478, 'Maurit�nia', 'MRT', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (175, 'Mayotte', 'MYT', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (484, 'M�xico', 'MEX', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (104, 'Mianma', 'MMR', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (583, 'Micron�sia', 'FSM', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (508, 'Mo�ambique', 'MOZ', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (498, 'Mold�via', 'MDA', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (492, 'M�naco', 'MCO', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (496, 'Mong�lia', 'MNG', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (499, 'Montenegro', 'MNE', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (500, 'Montserrat', 'MSR', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (516, 'Nam�bia', 'NAM', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (520, 'Nauru', 'NRU', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (524, 'Nepal', 'NPL', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (558, 'Nicar�gua', 'NIC', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (562, 'N�ger', 'NER', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (566, 'Nig�ria', 'NGA', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (570, 'Niue', 'NIU', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (578, 'Noruega', 'NOR', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (540, 'Nova Caled�nia', 'NCL', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (554, 'Nova Zel�ndia', 'NZL', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (512, 'Om�', 'OMN', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (585, 'Palau', 'PLW', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (275, 'Palestina', 'PSE', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (591, 'Panam�', 'PAN', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (598, 'Papua Nova Guin�', 'PNG', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (586, 'Paquist�o', 'PAK', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (600, 'Paraguai', 'PRY', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (604, 'Peru', 'PER', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (612, 'Pitcairn', 'PCN', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (258, 'Polin�sia Francesa', 'PYF', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (616, 'Pol�nia', 'POL', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (630, 'Porto Rico', 'PRI', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (620, 'Portugal', 'PRT', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (404, 'Qu�nia', 'KEN', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (417, 'Quirguist�o', 'KGZ', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (826, 'Reino Unido', 'GBR', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (140, 'Rep�blica Centro Africana', 'CAF', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (180, 'Rep�blica Democr�tica do Congo', 'COD', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (214, 'Rep�blica Dominicana', 'DOM', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (203, 'Rep�blica Tcheca', 'CZE', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (642, 'Rom�nia', 'ROU', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (646, 'Ruanda', 'RWA', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (643, 'R�ssia (Federa��o Russa)', 'RUS', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (732, 'Saara Ocidental', 'ESH', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (663, 'Saint Martin (parte francesa)', 'MAF', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (534, 'Saint Martin (parte holandesa)', 'SXM', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (666, 'Saint Pierre e Miquelon', 'SPM', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (882, 'Samoa', 'WSM', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (16, 'Samoa Americana', 'ASM', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (674, 'San Marino', 'SMR', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (654, 'Santa Helena', 'SHN', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (662, 'Santa L�cia', 'LCA', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (652, 'S�o Bartolomeu', 'BLM', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (659, 'S�o Crist�v�o e Nevis', 'KNA', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (678, 'S�o Tome e Pr�ncipe', 'STP', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (670, 'S�o Vicente e Granadinas', 'VCT', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (690, 'Seichelles', 'SYC', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (686, 'Senegal', 'SEN', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (694, 'Serra Leoa', 'SLE', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (688, 'S�rvia', 'SRB', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (760, 'S�ria', 'SYR', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (706, 'Som�lia', 'SOM', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (144, 'Sri Lanka', 'LKA', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (748, 'Suazil�ndia', 'SWZ', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (728, 'Sud�o do Sul', 'SSD', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (729, 'Sud�o', 'SDN', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (752, 'Su�cia', 'SWE', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (756, 'Su��a', 'CHE', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (740, 'Suriname', 'SUR', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (744, 'Svalbard e Jan Mayen Islands', 'SJM', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (762, 'Tadjiquist�o', 'TJK', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (764, 'Tail�ndia', 'THA', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (834, 'Tanz�nia', 'TZA', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (626, 'Timor Leste', 'TLS', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (768, 'Togo', 'TGO', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (772, 'Tokelau', 'TKL', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (776, 'Tonga', 'TON', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (780, 'Trinidad e Tobago', 'TTO', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (788, 'Tun�sia', 'TUN', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (795, 'Turcomenist�o', 'TKM', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (792, 'Turquia', 'TUR', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (798, 'Tuvalu', 'TUV', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (804, 'Ucr�nia', 'UKR', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (800, 'Uganda', 'UGA', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (858, 'Uruguai', 'URY', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (860, 'Uzbequist�o', 'UZB', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (548, 'Vanuatu', 'VUT', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (336, 'Vaticano', 'VAT', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (862, 'Venezuela', 'VEN', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (704, 'Vietn�', 'VNM', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (894, 'Z�mbia', 'ZMB', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (716, 'Zimb�bue', 'ZWE', '2017-09-10');";
	}

}
