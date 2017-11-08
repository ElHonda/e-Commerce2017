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
			newVal = 0;
		
		if (btn.attr('data-dir') == 'up') {
			newVal = parseInt(oldValue) + 1;
		} else {
			if (oldValue > 1) {
				newVal = parseInt(oldValue) - 1;
			} else {
				newVal = 1;
			}
		}
		btn.closest('.number-spinner').find('input').val(newVal);
	});
</script>
<jsp:include page="../AjaxHelpers/searchEstado.jsp"/>
<jsp:include page="../AjaxHelpers/searchCidade.jsp"/>
<jsp:include page="../AjaxHelpers/addLivro.jsp"/>