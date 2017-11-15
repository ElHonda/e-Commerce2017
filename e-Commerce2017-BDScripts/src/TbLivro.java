
public class TbLivro implements IScript{

	@Override
	public String getScript() {
		String str = "CREATE TABLE tb_livro\n"
				+ "(\n"
				+ "id serial not null primary key,\n"
				+ "ano integer,\n"
				+ "titulo varchar(100),\n"
				+ "edicao varchar(10),\n"
				+ "isbn varchar(20),\n"
				+ "sinopse text,\n"
				+ "numeropaginas integer,\n"
				+ "autor_id integer references tb_autor ON UPDATE CASCADE ON DELETE RESTRICT,\n"
				+ "editora_id integer references tb_editora ON UPDATE CASCADE ON DELETE RESTRICT,\n"
				+ "grupopreco_id integer references tb_grupopreco ON UPDATE CASCADE ON DELETE RESTRICT,\n"
				+ "dtcadastro date,\n"
				+ "ativo boolean not null default true"
				+ ");"
				+ "INSERT INTO tb_livro VALUES (2, 2010, 'Arquitetura e Organização de Computadores', '8ª', '9788576055648', 'Informática - Arquitetura De Computadores', 640, 2, 1, 1, '2017-10-24', true);\r\n"
				+ "INSERT INTO tb_livro VALUES (1, 2008, 'Use a Cabeça! Servlets & JSP', '2', '9788576082941', 'A preparação e estudo para o novo exame do J2EE 1.5, para a certificação Web Component Developer (SCWCD). Use a Cabeça Servlets & JSP não fornece apenas uma lista de assunto para memorização, ele guiará sua mente ao entendimento de fato do assunto a ser estutado. Você ira aprender diretamente o que é servlets e JSPs para que sejam entendidos de forma fãcil e rápida. Usando este livro você terá idéia do novo esquema do exame mock, criado especialmente para similar a inteligência do teste.  Seu tempo é muito valioso para ser desperdiçado. Tendo como base a última pesquisa em neurobiologia, ciência cognitiva e teoria do aprendizado, Use a Cabeça Servlets & JSP tem um visual rico, projetado na forma como seu cérebro funciona, não se trata de uma abordagem pesada que faz com que você caia em sono profundo.', 912, 4, 1, 1, '2017-10-11', true);\r\n"
				+ "INSERT INTO tb_livro VALUES (4, 2011, 'Star Wars - 	A Pop Up Guide To The Galaxy', '1ª', '9780439882828', 'Celebrate the 30th anniversary of the greatest science fiction saga in history. Star Wars: A Pop-Up Guide to the Galaxy is a pop-up extravaganza that takes readers on a 3-D, movable journey into the fantastic Star Wars universe. Each spread contains a variety of novelty features - pop-ups, side flaps and working lightsabers!', 12, 3, 1, 1, '2017-10-30', true);\r\n"
				+ "INSERT INTO tb_livro VALUES (3, 2012, 'Javascript - O Guia Definitivo', '6', '9788565837194', 'JavaScript é a linguagem de programação da Web. A maioria dos sites modernos usa JavaScript, e todos os navegadores - em computadores de mesa, consoles de jogos, tablets e smartphones - incluem interpretadores JavaScript. Isso a torna uma das linguagens de programação mais importantes atualmente e uma das tecnologias que todo desenvolvedor Web deve conhecer. ', 1080, 6, 1, 1, '2017-10-24', true);\r\n"
				+ "INSERT INTO tb_livro VALUES (5, 2012, 'Algoritmos - Teoria e Prática', '3ª', '9788535236996', 'Este livro apresenta um texto abrangente sobre o moderno estudo de algoritmos para computadores. É uma obra clássica, cuja primeira edição tornou-se amplamente adotada nas melhores universidades em todo o mundo, bem como padrão de referência para profissionais da área.', 944, 5, 1, 1, '2017-11-07', true);\r\n";
		System.out.println(str);
		return str;
	}

}
