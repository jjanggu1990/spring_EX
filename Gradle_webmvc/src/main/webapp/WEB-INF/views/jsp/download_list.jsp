<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:forEach var ="name" items="${list}">
		<a href="<c:url value='/download/file?filename=${name.realname}'/> ">${name.name}</a><br><br>
	</c:forEach>
</body>
</html>