(function(global) {
	var messagePool = function(messagePath) {
		var message, varMarker, messageKeys;

		if (typeof messagePath !== 'string') {
			throw 'invalid message path.';
		}

		messageKeys = messagePath.split('.');
		message = messagePool.messageMap[messagePool.locale];

		for ( var key in messageKeys) {
			message = message[messageKeys[key]];
		}

		for (var i = 1; i < arguments.length; i++) {
			varMarker = '{{' + (i - 1) + '}}';

			if (message.indexOf(varMarker) !== -1) {
				message = message.replace(varMarker, arguments[i]);
			}
		}

		return message;
	}
})