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
import eCommerce.dominio.GrupoPrecificacao;

public class GrupoPrecificacaoDAO extends AbstractJdbcDAO {

	
	public GrupoPrecificacaoDAO(){
		super("tb_grupopreco");
	}

	public GrupoPrecificacaoDAO(Connection conexao ){
		super(conexao, "tb_grupopreco");
	}
	
	@Override
	public void initColumns() {
		addColunas( "descricao"   );
		addColunas( "margemlucro" );
	}

	@Override
	public void salvar_pre(EntidadeDominio entidade) throws SQLException {
	}

	@Override
	public void salvar_pos(EntidadeDominio entidade) throws SQLException {
	}

	@Override
	public List<EntidadeDominio> consultar(EntidadeDominio entidade) throws SQLException {
		PreparedStatement pst = null;
		
		GrupoPrecificacao grupo = (GrupoPrecificacao)entidade;
		SqlBuilder sb = new SqlBuilder(this.table, colunas);
	    Map<Integer,Object> hsWhere = new HashMap<Integer,Object>();
		Integer lni = 1;

		try {
			openConnection();
			
		    if ( grupo != null ){
		    	if ( grupo.getId() != null && grupo.getId() > 0 ) {
		    		sb.addWhere("id = ?" );
		    		hsWhere.put(lni, grupo.getId());
		    		lni++;
		    	}
		    	
		    	if ( grupo.getDescricao() != null && grupo.getDescricao().length() > 0 ) {
		    		sb.addWhere("descricao = ?");
		    		hsWhere.put(lni, "%" + grupo.getDescricao() + "%");
		    		lni++;
		    	}
			}
	    
			pst = connection.prepareStatement(sb.getQuery(null));
		
		    for (Map.Entry<Integer, Object> entry : hsWhere.entrySet())
		    {
		    	pst.setObject(entry.getKey(), entry.getValue());
		    }
			
			ResultSet rs = pst.executeQuery();
			List<EntidadeDominio> grupos = new ArrayList<EntidadeDominio>();
			while (rs.next()) {
				GrupoPrecificacao g = new GrupoPrecificacao();
				g.setId(rs.getInt("id"));
				g.setDescricao(rs.getString("descricao"));
				g.setMargemLucro(rs.getDouble("margemlucro"));
				
				java.sql.Date dtCadastroEmLong = rs.getDate("dtcadastro");
				if( dtCadastroEmLong != null ) {
					Date dtCadastro = new Date(dtCadastroEmLong.getTime());				
					g.setDtCadastro(dtCadastro);
				}
				grupos.add(g);
			}
			return grupos;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Integer setPreparedStatement(EntidadeDominio entidade, PreparedStatement pst, Integer nPst) {
		GrupoPrecificacao g = (GrupoPrecificacao)entidade;
		try {
			pst.setString(nPst, g.getDescricao());
			nPst++;
			pst.setDouble(nPst, g.getMargemLucro() );
			nPst++;
		} catch (SQLException x) {
			x.printStackTrace();
		}
		return nPst;
	}

	@Override
	public Integer setPreparedStatementOnlyUpdate(EntidadeDominio entidade, PreparedStatement pst, Integer nPst) {
		return null;
	}
	

}
