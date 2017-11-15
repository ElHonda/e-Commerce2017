<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>
<script>
	$("form").submit(function (e) {
		var choice = true;
		if( $(this).attr('data-confirm') != null ){
			choice = confirm($(this).attr('data-confirm'));
		}
		return choice;
	});
	
	$(document).on('click', '.number-spinner button', function () {    
		var btn = $(this),
			oldValue = btn.closest('.number-spinner').find('input').val().trim(),
			newVal = 0,
			continua = true;
		
		if (btn.attr('data-dir') == 'up') {
			newVal = parseInt(oldValue) + 1;
		} else {
			if (oldValue > 1) {
				newVal = parseInt(oldValue) - 1;
			} else {
				newVal = 1;
			}
		}

		
		if( btn.attr('data-op') == 'update' ){

			if( continua ){
				var principal = btn.parent().parent()[0];
				var livro_id = principal.parentNode.parentNode.parentNode.parentNode.querySelector( "#livro_id" );
				
				$.ajax( {
		        	type: "POST",
		        	url: "<%=request.getContextPath()%>/Carrinho/AlterarLivro",
		        	data: { livro_id: livro_id.value , livro_quantidade: newVal , operacao: "ULIVRO" },
		        	dataType: "text",
		        	success:  function(data,status){
		        		continua = true;
			        },
		               
		            //If there was no resonse from the server
		            error: function(jqXHR, textStatus, errorThrown){
		                 console.log("Problema na requisição ajax: " + textStatus);
		                 continua = false;
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
		}
		if( continua ){
			btn.closest('.number-spinner').find('input').val(newVal);
		}
		
	});
</script>
<jsp:include page="../AjaxHelpers/searchEstado.jsp"/>
<jsp:include page="../AjaxHelpers/searchCidade.jsp"/>
<jsp:include page="../AjaxHelpers/ajaxLivro.jsp"/>