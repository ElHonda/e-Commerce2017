<%@ page language="java" contentType="text/html; charset=utf-8"
pageEncoding="utf-8"%>
<script>
    $(document).on( "click" , "#nova_categoria" , function(){
    	var elemento = $("select[id^='livro_categoria']").last()[0];
		var i = parseInt( elemento.name.substring( elemento.name.lastIndexOf( "_" ) + 1 , elemento.name.length ) ) + 1;
        var resposta = elemento.parentNode.parentNode.cloneNode(true);
        var label    = resposta.getElementsByTagName("label" )[0];
		var combo    = resposta.getElementsByTagName("select")[0];
		var hidden   = resposta.querySelector( "#livro_categoria_id_" + (i-1) );
        resposta.setAttribute( "id"   , "div_livro_categoria_" + i );
        combo.setAttribute   ( "id"   , "livro_categoria_"     + i );
        combo.setAttribute   ( "name" , "livro_categoria_"     + i );
        hidden.setAttribute  ( "id"   , "livro_categoria_id_"  + i );
        hidden.setAttribute  ( "name" , "livro_categoria_id_"  + i );
        label.innerText = "Categoria " + ( i + 1 );
        $("#row_categoria" ).append( resposta );
		elemento.parentNode.querySelector( "#spn_nova_categoria" ).remove();
    });

    $(document).on( "click" , "#remover_categoria" , function(){
    	if( $("div[id^='div_livro_categoria']").length > 1 ){
    		var novo = $("#spn_nova_categoria")[0].cloneNode(true);
    		this.parentNode.parentNode.parentNode.remove();
    		$("#spn_nova_categoria").remove();
    		var subs = $("div[id^='div_livro_categoria']");
    		var elemento, hidden, combo, label;
    		for( i = 0 ; i < subs.length ; i++ ){
    			elemento = subs[i];
    			elemento.setAttribute( "id" , "div_livro_categoria_" + i );
    			label  = elemento.querySelector( "label" );
    			label.innerText = "Categoria " + ( i + 1 );
    			combo  = elemento.querySelector("select");
    			hidden = elemento.querySelector( "input[id^='livro_categoria_id_']" );
    	        hidden.setAttribute( "id"   , "livro_categoria_id_"  + i );
    	        hidden.setAttribute( "name" , "livro_categoria_id_"  + i );
    	        combo.setAttribute ( "id"   , "livro_categoria_"     + i );
    	        combo.setAttribute ( "name" , "livro_categoria_"     + i );
    	        
    	        if( i+1 == subs.length ){
    	        	combo.after(novo);
    	        }
    		}
    	}else{
    		alert( "Não é possível remover a última Categoria !");
    	}
    });
</script>