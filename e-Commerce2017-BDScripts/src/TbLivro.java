
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
				+ "ativo boolean not null default true,\r\n"
				+ "qtde_estoque integer NOT NULL DEFAULT 0,\r\n"
				+ "preco_compra numeric(14,2) NOT NULL DEFAULT 0,\r\n"
				+ "preco_venda numeric(14,2) NOT NULL DEFAULT 0\r\n"
				+ ");"
				+ "INSERT INTO tb_livro ( ano, titulo, edicao, isbn, sinopse, numeropaginas, autor_id, editora_id , grupopreco_id, dtcadastro , ativo ) "
				+ " VALUES ( 2010, 'Arquitetura e Organiza��o de Computadores', '8�', '9788576055648', 'Inform�tica - Arquitetura De Computadores', 640, 2, 1, 1, '2017-10-24', true);\r\n"
				+ "INSERT INTO tb_livro ( ano, titulo, edicao, isbn, sinopse, numeropaginas, autor_id, editora_id , grupopreco_id, dtcadastro , ativo ) "
				+ " VALUES ( 2008, 'Use a Cabe�a! Servlets & JSP', '2', '9788576082941', 'A prepara��o e estudo para o novo exame do J2EE 1.5, para a certifica��o Web Component Developer (SCWCD). Use a Cabe�a Servlets & JSP n�o fornece apenas uma lista de assunto para memoriza��o, ele guiar� sua mente ao entendimento de fato do assunto a ser estutado. Voc� ira aprender diretamente o que � servlets e JSPs para que sejam entendidos de forma f�cil e r�pida. Usando este livro voc� ter� id�ia do novo esquema do exame mock, criado especialmente para similar a intelig�ncia do teste.  Seu tempo � muito valioso para ser desperdi�ado. Tendo como base a �ltima pesquisa em neurobiologia, ci�ncia cognitiva e teoria do aprendizado, Use a Cabe�a Servlets & JSP tem um visual rico, projetado na forma como seu c�rebro funciona, n�o se trata de uma abordagem pesada que faz com que voc� caia em sono profundo.', 912, 4, 1, 1, '2017-10-11', true);\r\n"
				+ "INSERT INTO tb_livro ( ano, titulo, edicao, isbn, sinopse, numeropaginas, autor_id, editora_id , grupopreco_id, dtcadastro , ativo ) "
				+ " VALUES ( 2011, 'Star Wars - 	A Pop Up Guide To The Galaxy', '1�', '9780439882828', 'Celebrate the 30th anniversary of the greatest science fiction saga in history. Star Wars: A Pop-Up Guide to the Galaxy is a pop-up extravaganza that takes readers on a 3-D, movable journey into the fantastic Star Wars universe. Each spread contains a variety of novelty features - pop-ups, side flaps and working lightsabers!', 12, 3, 1, 1, '2017-10-30', true);\r\n"
				+ "INSERT INTO tb_livro  ( ano, titulo, edicao, isbn, sinopse, numeropaginas, autor_id, editora_id , grupopreco_id, dtcadastro , ativo ) "
				+ " VALUES ( 2012, 'Javascript - O Guia Definitivo', '6', '9788565837194', 'JavaScript � a linguagem de programa��o da Web. A maioria dos sites modernos usa JavaScript, e todos os navegadores - em computadores de mesa, consoles de jogos, tablets e smartphones - incluem interpretadores JavaScript. Isso a torna uma das linguagens de programa��o mais importantes atualmente e uma das tecnologias que todo desenvolvedor Web deve conhecer. ', 1080, 6, 1, 1, '2017-10-24', true);\r\n"
				+ "INSERT INTO tb_livro  ( ano, titulo, edicao, isbn, sinopse, numeropaginas, autor_id, editora_id , grupopreco_id, dtcadastro , ativo ) "
				+ " VALUES ( 2012, 'Algoritmos - Teoria e Pr�tica', '3�', '9788535236996', 'Este livro apresenta um texto abrangente sobre o moderno estudo de algoritmos para computadores. � uma obra cl�ssica, cuja primeira edi��o tornou-se amplamente adotada nas melhores universidades em todo o mundo, bem como padr�o de refer�ncia para profissionais da �rea.', 944, 5, 1, 1, '2017-11-07', true);\r\n";
		System.out.println(str);
		return str;
	}

}
