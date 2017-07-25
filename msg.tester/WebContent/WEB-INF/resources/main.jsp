<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<title>Main JSP</title>
<meta charset="utf-8" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<meta name="apple-mobile-web-app-capable" content="yes" />
</head>
<body>
	<form action="writeList.do" method="post">
		<input type="text" name="sim[0].simId" placeholder="시뮬명"
			required="required" size="50"><br> <input type="text"
			name="sim[0].simTp" placeholder="시뮬타입" required="required" size="50"><br>
		<hr>
		<input type="text" name="sim[1].simId" placeholder="시뮬명"
			required="required" size="50"><br> <input type="text"
			name="sim[1].simTp" placeholder="시뮬타입" required="required" size="50"><br>
		<hr>
		<input type="submit" value="작성"><input type="reset" value="취소">
	</form>
</body>