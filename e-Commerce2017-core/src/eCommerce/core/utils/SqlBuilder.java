package eCommerce.core.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ernane
 *	Classe de aux�lio na gera��o de querys de inser��o, exclus�o, altera��o e sele��o;
 */
public class SqlBuilder {
	private String strWhere = "";
	private String strJoin  = "";
	private String table;
	// Lista para Primary keys
	private List<String> pks;
	// Lista para colunas
	private List<String> columns;
	/**
	 * Construtor SqlBuilder para tabelas com chave composta ou diferentes de "id"
	 * @param table 
	 * 	Tabela para gera��o das querys
	 * @param columns
	 * 	Lista de colunas 
	 * @param pks
	 *  Lista com a chave composta ou chave diferente de ID
	 */
	public SqlBuilder( String table, List<String> columns, List<String> pks ) {
		this.table = table;
		this.columns = columns;
		this.pks = pks;
	}
	/**
	 * Construtor para tabelas com formato padr�o ( Chave primaria = "id" )
	 * @param table 
	 * 	Tabela para gera��o das querys
	 * @param columns
	 * 	Lista de colunas 
	 */
	public SqlBuilder( String table, List<String> columns ) {
		this.table = table;
		this.columns = columns;
		this.pks = new ArrayList<>();
		this.pks.add("id");
	}
	/**
	 * Adiciona cl�usulas para forma��o de um JOIN em uma query
	 * @param pStrJoin
	 * Nova cl�usula para a gera��o da consulta
	 * @author Ernane 
	 */
	public void addJoin(String pStrJoin) {
		if( this.strJoin.length() > 0 ) {
			this.strJoin += " ";
		}
		this.strJoin += pStrJoin;
	}
	/**
	 * Adiciona cl�usulas para forma��o de um "WHERE" em uma query
	 * @param pStrwhere
	 * Nova cl�usula para a gera��o da consulta
	 * @author Ernane
	 */
	public void addWhere(String pStrwhere) {
		if( this.strWhere.length() > 0 ) {
			this.strWhere += " AND ";
		}
		this.strWhere += pStrwhere;
	}
	/**
	 * @return Retorna a express�o where formada atr�ves da inser��o pelo m�todo addWhere
	 */
	public String getWhere() {
		String strReturn = "";
		
		if( strWhere.length() > 0 ) {
			strReturn = " WHERE " + strWhere;
		}
		
		return strReturn;
	}
	/**
	 * @return Retorna a express�o where formada atrav�s da inser��o pelo m�todo addWhere
	 */
	public String getJoin() {
		String strReturn = "";

		if( strJoin != null && strJoin.length() > 0 ) {
			strReturn = strJoin;
		}
		
		return strReturn;
	}
	/**
	 * @return Retorna a express�o where pela chave primaria da tabela
	 */
	private String getPkWhere() {
		String strReturn = "";
		
		for( String pk : pks) {
			if( strReturn.length() > 0 )
				strReturn += " AND ";
			strReturn += pk + "=?";
		}
		
    	strReturn = " WHERE " + strReturn;
		
		return strReturn;
	}
	/**
	 * @return Retorna a estrutura de update para atualiza��o dos atributos da tabela
	 */
	private String getUpdateSet() {
		String strReturn = "";
		
		for( String coluna : columns) {
			if( strReturn.length() > 0 )
				strReturn += ",";
			strReturn += coluna + "=?";
		}
		
		if( strReturn.length() > 0)
			strReturn = " SET " + strReturn;

		return strReturn;
	}	
	/**
	 * @return Retorna uma express�o Update para a tabela configurada
	 */
	public String getSqlUpdate() {
		StringBuilder strSql = new StringBuilder();
		strSql.append("UPDATE ");
		strSql.append(this.table);
		strSql.append(getUpdateSet());
		strSql.append(getPkWhere());
		strSql.append(";");
		//System.out.println(strSql.toString());
		return strSql.toString();
	}
	/**
	 * @return Retorna parte de uma express�o Insert para a tabela configurada ( Nome dos campos da tabela )
	 */
	private String getInsertSet() {
		String strReturn = "";
		
		for( String coluna : columns) {
			if( strReturn.length() > 0 )
				strReturn += ",";
			strReturn += coluna;
		}
		
		if( strReturn.length() > 0)
			strReturn = " ( " + strReturn + " ) ";

		return strReturn;
	}
	/**
	 * @return Retorna parte de uma express�o Insert para a tabela configurada ( um "?" para cada atributo )
	 */
	private String getInsertValues() {
		String strReturn = "";
		for (int i = 0; i < columns.size(); i++) {
			if( strReturn.length() > 0 )
				strReturn += ",";
			strReturn += "?" ;
		}
		if( strReturn.length() > 0)
			strReturn = " VALUES( " + strReturn + " )";
		
		return strReturn;
	}
	/**
	 * @return Retorna a express�o de Inser��o para a tabela configurada
	 */
	public String getSqlInsert() {
		StringBuilder strSql = new StringBuilder();
		strSql.append("INSERT INTO ");
		strSql.append(this.table);
		strSql.append(getInsertSet());
		strSql.append(getInsertValues());
		strSql.append(";");
		//System.out.println(strSql.toString());
		return strSql.toString();
	}
	/**
	 * @param colunas Lista de colunas a serem retornadas na instru��o Sql ( query )
	 * @return String formada para consulta no banco de dados
	 */
	public String getQuery( List<String> colunas ){
		StringBuilder strSql = new StringBuilder();
		strSql.append("SELECT ");
		if( colunas == null ) {
			strSql.append(" * ");
		}else {
			for (int i = 0; i < colunas.size(); i++) {
				if( i == 0 ) {
					strSql.append(colunas.get(i));
				}else {
					strSql.append("," + colunas.get(i));
				}
			}	
		}
		strSql.append( " FROM"     ).append( " " );
		strSql.append( this.table  ).append( " " );
		strSql.append( getJoin()   ).append( " " );
		strSql.append( getWhere()  ).append( ";" );
		//System.out.println(strSql.toString());
		return strSql.toString();
	}
	/**
	 * @return Retorna express�o para exclus�o de dados da tabela configurada
	 */
	public String getSqlDelete() {
		StringBuilder strSql = new StringBuilder();
		strSql.append("DELETE FROM ");
		strSql.append(this.table);
		strSql.append(getPkWhere());
		strSql.append(";");
		//System.out.println(strSql.toString());
		return strSql.toString();
	}
}
