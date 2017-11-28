package eCommerce.dominio;


import java.text.SimpleDateFormat;
import java.util.Date;

public class EntidadeDominio implements IEntidade{
	
	private Integer id;
	private Date dtCadastro;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getDtCadastro() {
		return dtCadastro;
	}
	public void setDtCadastro(Date dtCadastro) {
		this.dtCadastro = dtCadastro;
	}
	public String getDtCadastroFormatada(String format) {
		String retorno = "";
		SimpleDateFormat formatter = new SimpleDateFormat( format );
		
		if( this.dtCadastro != null ) {
			retorno = formatter.format( this.dtCadastro );
		}

	    return retorno;
	}
	public boolean equals(Object obj) {
		if( obj instanceof EntidadeDominio ) {
			Integer id1 = Integer.valueOf( ((EntidadeDominio) obj).getId() );
			Integer id2 = Integer.valueOf( this.getId() );
			return id1.equals(id2);
		}
		return false;
	}

}
