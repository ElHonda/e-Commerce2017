
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
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (4, 'Afeganistão', 'AFG', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (710, 'África do Sul', 'ZAF', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (8, 'Albânia', 'ALB', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (276, 'Alemanha', 'DEU', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (20, 'Andorra', 'AND', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (24, 'Angola', 'AGO', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (660, 'Anguilla', 'AIA', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (28, 'Antígua e Barbuda', 'ATG', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (682, 'Arábia Saudita', 'SAU', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (12, 'Argélia', 'DZA', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (32, 'Argentina', 'ARG', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (51, 'Armênia', 'ARM', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (533, 'Aruba', 'ABW', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (36, 'Austrália', 'AUS', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (40, 'Áustria', 'AUT', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (31, 'Azerbaijão', 'AZE', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (44, 'Bahamas', 'BHS', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (50, 'Bangladesh', 'BGD', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (52, 'Barbados', 'BRB', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (48, 'Barein', 'BHR', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (56, 'Bélgica', 'BEL', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (84, 'Belize', 'BLZ', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (204, 'Benin', 'BEN', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (60, 'Bermuda', 'BMU', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (112, 'Bielorússia', 'BLR', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (68, 'Bolívia', 'BOL', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (535, 'Bonaire, Santo Eustáquio e Saba', 'BES', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (70, 'Bósnia-Herzegovina', 'BIH', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (72, 'Botsuana', 'BWA', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro, ativo ) VALUES (76, 'Brasil', 'BRA', '2017-09-10' , true );\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (96, 'Brunei', 'BRN', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (100, 'Bulgária', 'BGR', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (854, 'Burkina Faso', 'BFA', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (108, 'Burundi', 'BDI', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (64, 'Butão', 'BTN', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (132, 'Cabo Verde', 'CPV', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (120, 'Camarões', 'CMR', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (116, 'Camboja', 'KHM', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (124, 'Canadá', 'CAN', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (398, 'Casaquistão', 'KAZ', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (634, 'Catar', 'QAT', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (148, 'Chade', 'TCD', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (152, 'Chile', 'CHL', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (156, 'China', 'CHN', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (344, 'China, Hong Kong', 'HKG', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (446, 'China, Macao', 'MAC', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (196, 'Chipre', 'CYP', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (702, 'Cingapura', 'SGP', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (170, 'Colômbia', 'COL', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (174, 'Comores', 'COM', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (178, 'Congo', 'COG', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (408, 'Coréia do Norte', 'PRK', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (410, 'Coréia do Sul', 'KOR', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (384, 'Costa do Marfim', 'CIV', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (188, 'Costa Rica', 'CRI', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (191, 'Croácia', 'HRV', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (192, 'Cuba', 'CUB', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (531, 'Curaçao', 'CUW', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (208, 'Dinamarca', 'DNK', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (262, 'Djibouti', 'DJI', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (212, 'Dominica', 'DMA', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (818, 'Egito', 'EGY', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (222, 'El Salvador', 'SLV', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (784, 'Emirados Árabes Unidos', 'ARE', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (218, 'Equador', 'ECU', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (232, 'Eritréia', 'ERI', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (703, 'Eslováquia', 'SVK', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (705, 'Eslovênia', 'SVN', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (724, 'Espanha', 'ESP', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (840, 'Estados Unidos da América', 'USA', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (233, 'Estônia', 'EST', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (231, 'Etiópia', 'ETH', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (242, 'Fiji', 'FJI', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (608, 'Filipinas', 'PHL', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (246, 'Finlândia', 'FIN', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (250, 'França', 'FRA', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (266, 'Gabão', 'GAB', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (270, 'Gâmbia', 'GMB', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (288, 'Gana', 'GHA', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (268, 'Geórgia', 'GEO', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (292, 'Gibraltar', 'GIB', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (308, 'Granada', 'GRD', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (300, 'Grécia', 'GRC', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (304, 'Groenlândia', 'GRL', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (316, 'Guam', 'GUM', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (320, 'Guatemala', 'GTM', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (831, 'Guernsey', 'GGY', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (328, 'Guiana', 'GUY', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (254, 'Guiana Francesa', 'GUF', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (324, 'Guiné', 'GIN', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (226, 'Guiné Equatorial', 'GNQ', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (624, 'Guiné-Bissau', 'GNB', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (332, 'Haiti', 'HTI', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (528, 'Holanda', 'NLD', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (340, 'Honduras', 'HND', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (348, 'Hungria', 'HUN', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (887, 'Iêmen', 'YEM', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (833, 'Ilha de Man', 'IMN', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (312, 'Ilha Guadalupe', 'GLP', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (574, 'Ilha Norfolk', 'NFK', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (638, 'Ilha Reunião', 'REU', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (248, 'Ilhas Alanda', 'ALA', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (136, 'Ilhas Cayman', 'CYM', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (184, 'Ilhas Cook', 'COK', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (234, 'Ilhas Faeroe', 'FRO', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (238, 'Ilhas Falkland', 'FLK', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (580, 'Ilhas Marianas', 'MNP', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (584, 'Ilhas Marshall', 'MHL', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (90, 'Ilhas Salomão', 'SLB', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (796, 'Ilhas Turks e Caicos', 'TCA', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (850, 'Ilhas Virgens', 'VIR', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (92, 'Ilhas Virgens Britânicas', 'VGB', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (876, 'Ilhas Wallis e Futuna', 'WLF', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (356, 'Índia', 'IND', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (360, 'Indonésia', 'IDN', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (364, 'Irã', 'IRN', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (368, 'Iraque', 'IRQ', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (372, 'Irlanda', 'IRL', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (352, 'Islândia', 'ISL', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (376, 'Israel', 'ISR', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (380, 'Itália', 'ITA', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (388, 'Jamaica', 'JAM', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (392, 'Japão', 'JPN', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (832, 'Jersey', 'JEY', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (400, 'Jordânia', 'JOR', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (296, 'Kiribati', 'KIR', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (414, 'Kuwait', 'KWT', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (418, 'Laos', 'LAO', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (426, 'Lesoto', 'LSO', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (428, 'Letônia', 'LVA', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (422, 'Líbano', 'LBN', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (430, 'Libéria', 'LBR', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (434, 'Líbia', 'LBY', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (438, 'Liechtenstein', 'LIE', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (440, 'Lituânia', 'LTU', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (442, 'Luxemburgo', 'LUX', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (807, 'Macedônia', 'MKD', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (450, 'Madagáscar', 'MDG', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (458, 'Malásia', 'MYS', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (454, 'Malauí', 'MWI', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (462, 'Maldivas', 'MDV', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (466, 'Mali', 'MLI', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (470, 'Malta', 'MLT', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (504, 'Marrocos', 'MAR', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (474, 'Martinica', 'MTQ', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (480, 'Maurício', 'MUS', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (478, 'Mauritânia', 'MRT', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (175, 'Mayotte', 'MYT', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (484, 'México', 'MEX', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (104, 'Mianma', 'MMR', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (583, 'Micronésia', 'FSM', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (508, 'Moçambique', 'MOZ', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (498, 'Moldávia', 'MDA', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (492, 'Mônaco', 'MCO', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (496, 'Mongólia', 'MNG', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (499, 'Montenegro', 'MNE', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (500, 'Montserrat', 'MSR', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (516, 'Namíbia', 'NAM', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (520, 'Nauru', 'NRU', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (524, 'Nepal', 'NPL', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (558, 'Nicarágua', 'NIC', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (562, 'Níger', 'NER', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (566, 'Nigéria', 'NGA', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (570, 'Niue', 'NIU', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (578, 'Noruega', 'NOR', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (540, 'Nova Caledônia', 'NCL', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (554, 'Nova Zelândia', 'NZL', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (512, 'Omã', 'OMN', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (585, 'Palau', 'PLW', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (275, 'Palestina', 'PSE', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (591, 'Panamá', 'PAN', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (598, 'Papua Nova Guiné', 'PNG', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (586, 'Paquistão', 'PAK', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (600, 'Paraguai', 'PRY', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (604, 'Peru', 'PER', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (612, 'Pitcairn', 'PCN', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (258, 'Polinésia Francesa', 'PYF', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (616, 'Polônia', 'POL', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (630, 'Porto Rico', 'PRI', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (620, 'Portugal', 'PRT', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (404, 'Quênia', 'KEN', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (417, 'Quirguistão', 'KGZ', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (826, 'Reino Unido', 'GBR', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (140, 'República Centro Africana', 'CAF', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (180, 'República Democrática do Congo', 'COD', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (214, 'República Dominicana', 'DOM', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (203, 'República Tcheca', 'CZE', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (642, 'Romênia', 'ROU', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (646, 'Ruanda', 'RWA', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (643, 'Rússia (Federação Russa)', 'RUS', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (732, 'Saara Ocidental', 'ESH', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (663, 'Saint Martin (parte francesa)', 'MAF', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (534, 'Saint Martin (parte holandesa)', 'SXM', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (666, 'Saint Pierre e Miquelon', 'SPM', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (882, 'Samoa', 'WSM', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (16, 'Samoa Americana', 'ASM', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (674, 'San Marino', 'SMR', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (654, 'Santa Helena', 'SHN', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (662, 'Santa Lúcia', 'LCA', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (652, 'São Bartolomeu', 'BLM', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (659, 'São Cristóvão e Nevis', 'KNA', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (678, 'São Tome e Príncipe', 'STP', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (670, 'São Vicente e Granadinas', 'VCT', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (690, 'Seichelles', 'SYC', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (686, 'Senegal', 'SEN', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (694, 'Serra Leoa', 'SLE', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (688, 'Sérvia', 'SRB', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (760, 'Síria', 'SYR', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (706, 'Somália', 'SOM', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (144, 'Sri Lanka', 'LKA', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (748, 'Suazilândia', 'SWZ', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (728, 'Sudão do Sul', 'SSD', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (729, 'Sudão', 'SDN', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (752, 'Suécia', 'SWE', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (756, 'Suíça', 'CHE', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (740, 'Suriname', 'SUR', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (744, 'Svalbard e Jan Mayen Islands', 'SJM', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (762, 'Tadjiquistão', 'TJK', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (764, 'Tailândia', 'THA', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (834, 'Tanzânia', 'TZA', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (626, 'Timor Leste', 'TLS', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (768, 'Togo', 'TGO', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (772, 'Tokelau', 'TKL', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (776, 'Tonga', 'TON', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (780, 'Trinidad e Tobago', 'TTO', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (788, 'Tunísia', 'TUN', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (795, 'Turcomenistão', 'TKM', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (792, 'Turquia', 'TUR', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (798, 'Tuvalu', 'TUV', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (804, 'Ucrânia', 'UKR', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (800, 'Uganda', 'UGA', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (858, 'Uruguai', 'URY', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (860, 'Uzbequistão', 'UZB', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (548, 'Vanuatu', 'VUT', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (336, 'Vaticano', 'VAT', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (862, 'Venezuela', 'VEN', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (704, 'Vietnã', 'VNM', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (894, 'Zâmbia', 'ZMB', '2017-09-10');\r\n" + 
				"INSERT INTO tb_pais (id, nome, alphacode, dtcadastro) VALUES (716, 'Zimbábue', 'ZWE', '2017-09-10');";
	}

}
