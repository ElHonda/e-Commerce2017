<%@ page language="java" contentType="text/html; charset=utf-8"
pageEncoding="utf-8"%>
<script>
	$(document).ready(function(){
	    $("select[id^='cliente_endereco_estado_id_']").change(function(){
	    	var elemento = $(this)[0];
			var i = parseInt( elemento.name.substring( elemento.name.lastIndexOf( "_" ) + 1 , elemento.name.length ) );
            var estadoId = $(this).val();
            if( estadoId == null || estadoId == "" ){
            	$( "#cliente_endereco_cidade_id_" + i ).empty().append($('<option>', {
            	    value: "",
            	    text: "Selecione o Estado"
            	}));
            }else{
		        $.ajax( {
		        	type: "POST",
		        	url: "<%=request.getContextPath()%>/Cidade/ConsultaCidade",
		        	data: "cidade_estado_id=" + estadoId,
		        	dataType: "text",
		        	success:  function(data,status){
		        		var json = eval( '(' + data + ')' );
		        		$( "#cliente_endereco_cidade_id_" + i ).empty();
			            for( var j in json.cidades ){
			            	$( "#cliente_endereco_cidade_id_" + i ).append($('<option>', {
			            	    value: json.cidades[j].id,
			            	    text: json.cidades[j].nome
			            	}));
			            }
			        },
		               
	                //If there was no resonse from the server
	                error: function(jqXHR, textStatus, errorThrown){
	                     console.log("Problema na requisição ajax: " + textStatus);
	                },
	                //capture the request before it was sent to server
	                beforeSend: function(jqXHR, settings){
	                    //adding some Dummy data to the request
	                    $(this).attr("disabled", true);
	                },
	               
	                //this is called after the response or error functions are finsihed
	                //so that we can take some action
	                complete: function(jqXHR, textStatus){
	                    //enable the button 
	                    $(this).attr("disabled", false);
	                }
		        });
            }
	    });
	});
</script>