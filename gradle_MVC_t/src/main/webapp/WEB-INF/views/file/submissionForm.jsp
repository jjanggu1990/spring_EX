<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page isELIgnored="false"%>
<html>
<head>
<title>파일 업로드</title>
</head>
<body>
	<h3>fileUpload</h3>
	<form action="submit.do" method="post" enctype="multipart/form-data">
		 파일: <input type="file" name="report" /> <br /> 
		 <input type="submit" />
	</form>

	

</body>
</html>