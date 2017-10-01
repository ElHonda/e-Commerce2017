package eCommerce.core.impl.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import eCommerce.core.utils.SqlBuilder;
import eCommerce.dominio.EntidadeDominio;
import eCommerce.dominio.Livro;
import eCommerce.dominio.LivroSubCategoria;
import eCommerce.dominio.SubCategoria;

public class LivroSubCategoriaDAO extends AbstractJdbcDAO{

	public LivroSubCategoriaDAO(){
		super("tb_livro_subcategoria");
	}

	public LivroSubCategoriaDAO(Connection conexao ){
		super(conexao, "tb_livro_subcategoria");
	}
	
	@Override
	public void initColumns() {
		addColunas( "livro_id"     );
		addColunas( "subcategoria_id" );
	}
	@Override
	public List<EntidadeDominio> consultar(EntidadeDominio entidade) throws SQLException {
		PreparedStatement pst = null;
		
		LivroSubCategoria livroCat = (LivroSubCategoria)entidade;
		SqlBuilder sb = new SqlBuilder(this.table, colunas);
	    Map<Integer,Object> hsWhere = new HashMap<Integer,Object>();
		Integer lni = 1;

		try {
			openConnection();
			// Por nenhum motivo, deve ser feita uma consulta a tabela de livros
			// categorias sem o envio de um objeto deste tipo
	    	if ( livroCat.getLivro() != null && livroCat.getLivro().getId() > 0 ) {
	    		sb.addWhere("livro_id = ?" );
	    		hsWhere.put(lni, livroCat.getLivro().getId());
	    		lni++;
	    	}
	    	
	    	if ( livroCat.getSubcategoria() != null && livroCat.getSubcategoria().getId() > 0 ) {
	    		sb.addWhere("categoria_id = ?");
	    		hsWhere.put(lni, livroCat.getSubcategoria().getId() );
	    		lni++;
	    	}
	    
			pst = connection.prepareStatement(sb.getQuery(null));
		
		    for (Map.Entry<Integer, Object> entry : hsWhere.entrySet())
		    {
		    	pst.setObject(entry.getKey(), entry.getValue());
		    }
			
			ResultSet rs = pst.executeQuery();
			List<EntidadeDominio> livroscategorias = new ArrayList<EntidadeDominio>();
			while (rs.next()) {
				LivroSubCategoria lc = new LivroSubCategoria();
				lc.setId(rs.getInt("id"));

				if( livroCat.getLivro() == null ) {
					// Faz a Busca do Livro
					Livro livro = new Livro();
					LivroDAO aDAO = new LivroDAO(this.connection);
					livro.setId(rs.getInt("livro_id"));
					lc.setLivro((Livro)aDAO.consultar_id(livro));
				}else
					lc.setLivro(livroCat.getLivro());

				if( livroCat.getSubcategoria() == null) {
					// Faz a busca da Categoria
					SubCategoria subcategoria = new SubCategoria();
					SubCategoriaDAO eDAO = new SubCategoriaDAO(this.connection);
					subcategoria.setId(rs.getInt("subcategoria_id"));
					lc.setSubcategoria((SubCategoria)eDAO.consultar_id(subcategoria));
				}else {
					lc.setSubcategoria(livroCat.getSubcategoria());
				}

				java.sql.Date dtCadastroEmLong = rs.getDate("dtcadastro");
				if( dtCadastroEmLong != null ) {
					Date dtCadastro = new Date(dtCadastroEmLong.getTime());				
					lc.setDtCadastro(dtCadastro);
				}
				livroscategorias.add(lc);
			}
			return livroscategorias;
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return null;
	}

	@Override
	public EntidadeDominio consultar_id(EntidadeDominio entidade) throws SQLException {
		PreparedStatement pst = null;
		
		LivroSubCategoria lc = (LivroSubCategoria)entidade;
		SqlBuilder sb = new SqlBuilder(this.table, colunas);
	    Map<Integer,Object> hsWhere = new HashMap<Integer,Object>();
		Integer lni = 1;

		try {
			openConnection();
			
    		sb.addWhere("id = ?" );
    		hsWhere.put(lni, lc.getId());
    		lni++;
	    
			pst = connection.prepareStatement(sb.getQuery(null));
		
		    for (Map.Entry<Integer, Object> entry : hsWhere.entrySet())
		    {
		    	pst.setObject(entry.getKey(), entry.getValue());
		    }
			
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				lc.setId(rs.getInt("id"));

				// Faz a Busca do Livro
				Livro livro = new Livro();
				LivroDAO aDAO = new LivroDAO(this.connection);
				livro.setId(rs.getInt("livro_id"));
				lc.setLivro((Livro)aDAO.consultar_id(livro));


				// Faz a busca da Categoria
				SubCategoria subcategoria = new SubCategoria();
				SubCategoriaDAO eDAO = new SubCategoriaDAO(this.connection);
				subcategoria.setId(rs.getInt("subcategoria_id"));
				lc.setSubcategoria((SubCategoria)eDAO.consultar_id(subcategoria));
		
				
				java.sql.Date dtCadastroEmLong = rs.getDate("dtcadastro");
				if( dtCadastroEmLong != null ) {
					Date dtCadastro = new Date(dtCadastroEmLong.getTime());				
					lc.setDtCadastro(dtCadastro);
				}
				return lc;
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return null;
	}

	@Override
	public Integer setPreparedStatement(EntidadeDominio entidade, PreparedStatement pst, Integer nPst) {
		LivroSubCategoria lc = (LivroSubCategoria)entidade;
		try {
			pst.setInt(nPst, lc.getLivro().getId() );
			nPst++;
			pst.setInt(nPst, lc.getSubcategoria().getId());
			nPst++;
		}catch( SQLException x ) {
			x.printStackTrace();
		}
		
		return nPst;
	}
}
