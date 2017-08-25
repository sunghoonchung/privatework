<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/view/commons/common_taglib.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="Content-Style-Type" content="text/css" />

<title>Message Tester (login)</title>
<link rel="shortcut icon" href="resources/images/favicon/favicon.ico">
<link rel="icon" href="resources/images/favicon/favicon.ico">
<link rel="stylesheet" href="resources/styles/main.css">
</head>
<body>
	<section id="login-wrap">
		<section id="login-layer">
			<section id="login-layer-header" class="login-title"></section>
			<section id="login-layer-body"></section>
			<section id="cpyright">2017 ⓒ BankwareGlobal</section>
		</section>
	</section>
	<script type="text/x-handlebars-template" id="login-form">
	<form id="login-form" method="post">
		<table>
			<tr>
				<td>
					<label>User ID</label>
					<input type="text" name="userId" placeholder="ID" required="required">
				</td>
				<td>
					<label>Password</label>
					<input type="password" name="userPw"  placeholder="PASSWORD" required="required">
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<button type="submit" id="login-btn">Log in</button>
				</td>
			</tr>
		</table>
	</form>
</script>
	<script src="resources/libs/jquery/jquery-1.10.2.js"></script>
	<script src="resources/libs/jquery/jquery.cookie.js"></script>
	<script src="resources/libs/handlebars/handlebars-1.1.2.js"></script>
	<script src="resources/scripts/login.js"></script>
</body>
</html>