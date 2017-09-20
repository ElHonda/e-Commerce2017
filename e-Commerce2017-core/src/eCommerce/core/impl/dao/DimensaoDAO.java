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
import eCommerce.dominio.Dimensao;
import eCommerce.dominio.EntidadeDominio;

public class DimensaoDAO extends AbstractJdbcDAO{

	
	public DimensaoDAO(){
		super("tb_dimensao");
	}

	public DimensaoDAO(Connection conexao ){
		super(conexao, "tb_dimensao");
	}
	
	
	@Override
	public void initColumns() {
		// TODO Auto-generated method stub
		addColunas("altura"				 );
		addColunas("largura"			 );
		addColunas("peso"				 );
		addColunas("profundidade"		 );
		addColunas("dimensionavel_id"	 );
		addColunas("dimensionavel_class" );
	}

	@Override
	public void salvar_pre(EntidadeDominio entidade) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void salvar_pos(EntidadeDominio entidade) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<EntidadeDominio> consultar(EntidadeDominio entidade) throws SQLException {
		PreparedStatement pst = null;
		Dimensao dimensao = (Dimensao)entidade;
		SqlBuilder sb = new SqlBuilder(this.table, colunas);
	    Map<Integer,Object> hsWhere = new HashMap<Integer,Object>();
		Integer lni = 1;

		try {
			openConnection();
			
		    if ( dimensao != null ){
		    	if ( dimensao.getId() != null && dimensao.getId() > 0 ) {
		    		sb.addWhere("id = ?" );
		    		hsWhere.put(lni, dimensao.getId());
		    		lni++;
		    	}
		    	
		    	if ( dimensao.getDimensionavel() != null && dimensao.getDimensionavel().getId() != null && dimensao.getDimensionavel().getId() > 0 ) {
		    		sb.addWhere("dimensionavel_id = ?");
		    		hsWhere.put(lni, dimensao.getDimensionavel().getId() );
		    		lni++;
		    		sb.addWhere("dimensaionavel_class = ?");
		    		hsWhere.put( lni , dimensao.getDimensionavel().getClass().getName() );
		    		lni++;
		    	}
			}
	    
			pst = connection.prepareStatement(sb.getQuery(null));
		
		    for (Map.Entry<Integer, Object> entry : hsWhere.entrySet())
		    {
		    	pst.setObject(entry.getKey(), entry.getValue());
		    }
			
			ResultSet rs = pst.executeQuery();
			List<EntidadeDominio> dimensoes = new ArrayList<EntidadeDominio>();
			while (rs.next()) {
				Dimensao d = new Dimensao();
				d.setId(rs.getInt("id"));
				d.setAltura(rs.getDouble("altura"));
				d.setLargura(rs.getDouble("largura"));
				d.setPeso(rs.getDouble("peso"));
				d.setProfundidade(rs.getDouble("profundidade"));

			    EntidadeDominio entity = (EntidadeDominio)Class.forName(rs.getString("dimensionavel_class")).newInstance();
			    entity.setId(rs.getInt("dimensionavel_id"));
			    
			    d.setDimensionavel(entity);
				java.sql.Date dtCadastroEmLong = rs.getDate("dtcadastro");
				if( dtCadastroEmLong != null ) {
					Date dtCadastro = new Date(dtCadastroEmLong.getTime());				
					d.setDtCadastro(dtCadastro);
				}

				dimensoes.add(d);
			}
			return dimensoes;
		} catch (SQLException | InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Integer setPreparedStatement(EntidadeDominio entidade, PreparedStatement pst, Integer nPst) {
		Dimensao dimensao = (Dimensao)entidade;
		try {
			pst.setDouble(nPst, dimensao.getAltura() );
			nPst++;
			pst.setDouble(nPst, dimensao.getLargura());
			nPst++;
			pst.setDouble(nPst, dimensao.getPeso());
			nPst++;
			pst.setDouble(nPst, dimensao.getProfundidade());
			nPst++;
			pst.setInt(nPst, dimensao.getDimensionavel().getId());
			nPst++;
			pst.setString(nPst, dimensao.getDimensionavel().getClass().getName() );
			nPst++;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		return nPst;
	}

	@Override
	public Integer setPreparedStatementOnlyUpdate(EntidadeDominio entidade, PreparedStatement pst, Integer nPst) {
		// TODO Auto-generated method stub
		return nPst;
	}

}
