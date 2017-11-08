<%@ page language="java" contentType="text/html; charset=utf-8"
pageEncoding="utf-8"%>
<script>
    $(document).on( "click" , "#comprar" , function(){
    	var grupo      = this.parentNode.parentNode.parentNode.parentNode;
    	var idLivro    = grupo.querySelector( "#livro_id" ).value;
    	var quantidade = grupo.querySelector( "#livro_" + idLivro + "_quantidade" ).value;
		$.ajax( {
        	type: "POST",
        	url: "<%=request.getContextPath()%>/Carrinho/AddLivro",
        	data: { livro_id: idLivro , livro_quantidade: quantidade },
        	dataType: "text",
        	success:  function(data,status){
        		var json = eval( '(' + data + ')' );
        		$( "#carrinho_qtde_livros" )[0].text = "Carrinho( " + json.quantidade + " )" 
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
    });
</script>