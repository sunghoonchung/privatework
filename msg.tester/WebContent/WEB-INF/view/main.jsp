<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/view/commons/common_taglib.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="Content-Style-Type" content="text/css" />

<title>Message Tester (main)</title>
<link rel="shortcut icon" href="resources/images/favicon/favicon.ico">
<link rel="icon" href="resources/images/favicon/favicon.ico">
</head>
<body>
	<header id="header">
		<section>
			<input type="text" name="userId" value="${sessionInfo.userId}">
		</section>
		<form action="writeList.do" method="post">
			<input type="text" name="sim[0].simId" placeholder="시뮬명"
				required="required" size="50"><br> <input type="text"
				name="sim[0].simTp" placeholder="시뮬타입" required="required" size="50"><br>
			<hr>
			<input type="text" name="sim[1].simId" placeholder="시뮬명"
				required="required" size="50"><br> <input type="text"
				name="sim[1].simTp" placeholder="시뮬타입" required="required" size="50"><br>
			<hr>
			<input type="submit" value="작성"><input type="reset"
				value="취소">
		</form>
	</header>
</body>