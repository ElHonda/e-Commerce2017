<script>
	$("form").submit(function (e) {
		var choice = confirm($(this).attr('data-confirm'));
		return choice;
	});
</script>