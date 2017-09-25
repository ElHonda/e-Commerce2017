package eCommerce.core;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import eCommerce.dominio.EntidadeDominio;


public interface IDAO {

	public void initColumns();
	public void salvar_pre( EntidadeDominio entidade ) throws SQLException;
	public void salvar(EntidadeDominio entidade) throws SQLException;
	public void salvar_pos( EntidadeDominio entidade ) throws SQLException;
	public void alterar(EntidadeDominio entidade)throws SQLException;
	public void excluir(EntidadeDominio entidade)throws SQLException;
	public List<EntidadeDominio> consultar(EntidadeDominio entidade)throws SQLException;
	public EntidadeDominio consulta_id(EntidadeDominio entidade) throws SQLException;
	public Integer setPreparedStatement( EntidadeDominio entidade, PreparedStatement pst, Integer nPst );
	public Integer setPreparedStatementOnlyInsert( EntidadeDominio entidade, PreparedStatement pst , Integer nPst );
	public Integer setPreparedStatementOnlyUpdate( EntidadeDominio entidade, PreparedStatement pst , Integer nPst );
}
