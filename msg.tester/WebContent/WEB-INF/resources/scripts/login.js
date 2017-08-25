$(function() {

	var loginFormTpl = Handlebars.compile($('#login-form').html());
	$('#login-layer-body').html(loginFormTpl());

	$('#login-btn').on('click', function(e) {

		var $loginForm = $('#login-form')
			, $idCheck = $loginForm.find('input[id=remember-id-check]')
			, userId = $loginForm.find('input[name=userId]').val().trim()
			, userPw = $loginForm.find('input[name=userPw]').val().trim()
			, offset = location.href.indexOf(location.host) + location.host.length
			, contextPathIdx = location.href.lastIndexOf('/')
			, contextPath = location.href.substring(offset, contextPathIdx + 1);

		console.log("userId:", userId, ", userPw:", userPw);
		
		var locationUrl = location.protocol + '//' + location.host;
		(contextPathIdx !== -1) && (locationUrl += contextPath);
		locationUrl += 'main';
		
		console.log("locationUrl:", locationUrl);

		$loginForm.attr('action', locationUrl);
		$loginForm.submit();
	});
});
