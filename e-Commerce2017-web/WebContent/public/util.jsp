<script>
	$("form").submit(function (e) {
		var choice = true;
		if( $(this).attr('data-confirm') != null ){
			choice = confirm($(this).attr('data-confirm'));
		}
		return choice;
	});
</script>