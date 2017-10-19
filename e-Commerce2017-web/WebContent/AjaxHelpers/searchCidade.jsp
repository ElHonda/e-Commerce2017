<%@ page language="java" contentType="text/html; charset=utf-8"
pageEncoding="utf-8"%>
<script>
	$(document).ready(function(){
	    $("#cliente_estado").change(function(){
            var estadoId = $(this).val();
            if( estadoId == null || estadoId == "" ){
            	$("#cliente_cidade").empty().append($('<option>', {
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
		        		$('#cliente_cidade').empty();
			            for( var j in json.cidades ){
			            	$("#cliente_cidade").append($('<option>', {
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