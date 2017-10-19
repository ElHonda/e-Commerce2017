<%@ page language="java" contentType="text/html; charset=utf-8"
pageEncoding="utf-8"%>
<script>
	$(document).ready(function(){
	    $("#cliente_pais").change(function(){
            var paisId = $(this).val();
            if( paisId == null || paisId == "" ){
            	$("#cliente_estado").empty().append($('<option>', {
            	    value: "",
            	    text: "Selecione o País"
            	}));
            	$("#cliente_estado").trigger("change");
            }else{
		        $.ajax( {
		        	type: "POST",
		        	url: "<%=request.getContextPath()%>/Estado/ConsultaEstado",
		        	data: "estado_pais_id=" + paisId,
		        	dataType: "text",
		        	success:  function(data,status){
		        		var json = eval( '(' + data + ')' );
		        		$('#cliente_estado').empty();
			            for( var j in json.estados ){
			            	$("#cliente_estado").append($('<option>', {
			            	    value: json.estados[j].id,
			            	    text: json.estados[j].nome
			            	}));
			            }
			        	$("#cliente_estado").trigger("change");
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