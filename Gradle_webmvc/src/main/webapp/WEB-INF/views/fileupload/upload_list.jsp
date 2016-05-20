<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>자료실</title>
</head>
<body>

업로드한 파일 : ${file1 }   <br>
<img src='/Gradle_webmvc/img/${real_name}' alt='${file1}' >

<c:forEach var="item" items="${list }">
<div style="border:solid;1px;">
	<p>${item.name} </p>
	<p>${item.path} </p>
	<p>${item.upload_date} </p>
	<p>${item.filesize} </p>
</div>
</c:forEach>

</body>
</html>