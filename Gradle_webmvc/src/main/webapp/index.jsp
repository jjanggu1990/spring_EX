<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page isELIgnored="false" %>
<html>
<head>
<title>index.jsp</title>
</head>
<body>
	<%-- <% response.sendRedirect("hello.do"); %> --%>
	<a href="hello.do">/hello.do</a><br>
	<a href="article/newArticle.do">/newArticle.do</a><br>
	<a href="order/order.do">/order.do</a><br>
	<a href="search/main.do">/search/main.do</a><br>
	<a href="search/internal.do?query=abc&p=10">/search/internal.do</a><br>
	<a href="search/external.do">/search/external.do</a><br>
	<a href="cookie/make.do">/cookie/make.do</a><br>
	<a href="cookie/view.do">/cookie/view.do</a><br>
	<a href="header/check.do">/header/check.do</a><br>
	<a href="game/users/jj/characters/11">/game/users/jj/characters/11</a><br>
	<a href="account/create.do">/account/create.do</a>
</body>
</html>