<%@ page language="java" contentType="text/html; charset=utf-8"
pageEncoding="utf-8"%>
<script>
    $(document).on( "click" , "#nova_subcategoria" , function(){
    	var elemento = $("select[id^='livro_subcategoria']").last()[0];
		var i = parseInt( elemento.name.substring( elemento.name.lastIndexOf( "_" ) + 1 , elemento.name.length ) ) + 1;
        var resposta = elemento.parentNode.parentNode.cloneNode(true);
        var label    = resposta.getElementsByTagName("label" )[0];
		var combo    = resposta.getElementsByTagName("select")[0];
		var hidden   = resposta.querySelector( "#livro_subcategoria_id_" + (i-1) );
        resposta.setAttribute( "id"    , "div_livro_subcategoria_" + i );
        combo.setAttribute   ( "id"    , "livro_subcategoria_"     + i );
        combo.setAttribute   ( "name"  , "livro_subcategoria_"     + i );
        hidden.setAttribute  ( "id"    , "livro_subcategoria_id_"  + i );
        hidden.setAttribute  ( "name"  , "livro_subcategoria_id_"  + i );
        hidden.setAttribute  ( "value" , ""                            );
        label.innerText = "Sub-categoria " + ( i + 1 );
        $("#row_subcategoria" ).append( resposta );
		elemento.parentNode.querySelector( "#spn_nova_subcategoria" ).remove();
    });

    $(document).on( "click" , "#remover_subcategoria" , function(){
    	if( $("div[id^='div_livro_subcategoria']").length > 1 ){
    		var novo = $("#spn_nova_subcategoria")[0].cloneNode(true);
    		this.parentNode.parentNode.parentNode.remove();
    		$("#spn_nova_subcategoria").remove();
    		var subs = $("div[id^='div_livro_subcategoria']");
    		var elemento, hidden, combo, label;
    		for( i = 0 ; i < subs.length ; i++ ){
    			elemento = subs[i];
    			elemento.setAttribute( "id" , "div_livro_subcategoria_" + i );
    			label  = elemento.querySelector( "label" );
    			label.innerText = "Sub-categoria " + ( i + 1 );
    			combo  = elemento.querySelector("select");
    			hidden = elemento.querySelector( "input[id^='livro_subcategoria_id_']" );
    	        hidden.setAttribute( "id"   , "livro_subcategoria_id_"  + i );
    	        hidden.setAttribute( "name" , "livro_subcategoria_id_"  + i );
    	        combo.setAttribute ( "id"   , "livro_subcategoria_"     + i );
    	        combo.setAttribute ( "name" , "livro_subcategoria_"     + i );
    	        
    	        if( i+1 == subs.length ){
    	        	combo.after(novo);
    	        }
    		}
    	}else{
    		alert( "Não é possível remover a última Sub-categoria !");
    	}
    });
</script>