<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <title>Index JSP</title>
    <meta charset="utf-8" />
    <meta http-equiv="Content-Script-Type" content="text/javascript" />
    <meta http-equiv="Content-Style-Type" content="text/css" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <meta name="apple-mobile-web-app-capable" content="yes" />
</head>
<body>
	<form action="login.do" method="post">
		<input type="text" name="userId" placeholder="사용자ID"
			required="required" size="50"><br>
		<input type="text"
			name="passwd" placeholder="비밀번호" required="required" size="50"><br>
		<hr>
		<input type="submit" value="로그인"><input type="reset" value="취소">
	</form>
</body>