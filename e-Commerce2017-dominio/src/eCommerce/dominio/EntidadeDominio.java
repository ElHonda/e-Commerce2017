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
		SimpleDateFormat formatter = new SimpleDateFormat( format );
	    return formatter.format( this.dtCadastro );
	}
	public boolean equals(Object obj) {
		if( obj instanceof EntidadeDominio )
			return ((EntidadeDominio) obj).getId() == this.getId();
		return false;
	}

}
