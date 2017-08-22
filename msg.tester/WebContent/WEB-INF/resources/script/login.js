$(function() {

    var loginFormTpl = Handlebars.compile($('#login-form').html()),
        browserLocale = navigator.language || navigator.browserLanguage,
        locale = $.cookie('bxt-locale');

    if(!locale || locale === 'null') {
        locale = browserLocale;

        if(locale.indexOf('ko') !== -1 ){
            locale = 'ko';
        }else if(locale.indexOf('en') !== -1 ) {
            locale = 'en';
        }
    }

    Handlebars.registerHelper('bxMsg', function(keyword) {
        return bxMsg(keyword) || keyword;
    });

    bxMsg.init({
        locale: locale,
        messageRoot: 'resources/scripts/messages',
        messageList: [
            'login'
        ]
    });

    $('.login-layer-body').html(loginFormTpl());

    if($.cookie('userId') !== undefined){
        $('#login-form').find('input[name=userId]').val($.cookie('userId'));
    }

    $('#login-form').find('select[name=systemId]').on('change', function(e){
        var systemNm = $(e.currentTarget).find('option:selected').attr('data-name');

        $('#login-form').find('input[name=systemNm]').val(systemNm);
    });

    $.ajax({
        url: 'get-system-name',
        type: 'GET',
        complete : function(response) {
            var $systemSelect = $('#login-form').find('select[name=systemId]'),
                optionTagList = [],
                $optionTagList = $(JSON.parse(response.responseText));

            $optionTagList.each(function(idx, option){
                optionTagList.push(
                    '<option value="'+ option.cdNm +'"data-name="' + option.cdDesc+'">'
                    + option.cdDesc
                    + '</option>'
                );
            });

            $systemSelect.html(optionTagList);
            $systemSelect.trigger('change');
        }
    });

    notifyError();

    $('#login-btn').on('click', function(e) {
        var $loginForm = $('#login-form'),
            $idCheck = $loginForm.find('input[id=remember-id-check]'),
            locale = $loginForm.find('select[name=langCd]').val(),
            id = $loginForm.find('input[name=userId]').val().trim(),
            pwd = $loginForm.find('input[name=userPwd]').val().trim(),

            offset = location.href.indexOf(location.host) + location.host.length,
            contextPathIdx = location.href.lastIndexOf('/'),
            contextPath = location.href.substring(offset, contextPathIdx + 1),
            locationUrl;

        $.cookie('bxt-locale', locale);

        if($idCheck.is(':checked')) {
            $.cookie('userId', id);
        }

        e.preventDefault();

        if (id === '') {
            alert(bxMsg('login.type-id-msg'));
            return false;
        } else if (pwd === '') {
            alert(bxMsg('login.type-pwd-msg'));
            return false;
        }

        locationUrl = location.protocol + '//' + location.host;
        (contextPathIdx !== -1) && (locationUrl += contextPath);
        locationUrl += 'main';

        $loginForm.attr('action', locationUrl);
        $loginForm.submit();
    });

    function notifyError() {
    	if(!location.search || location.search === '?') {
    		return;
    	}
    	
    	location.search.replace('?', '').split('&').forEach(function(queryUnit) {
    		var splitedQueryUnit = queryUnit.split('=');

    		alert(bxMsg('login.'+splitedQueryUnit[1]));
    		location.search = '';
    	});
    }
});
