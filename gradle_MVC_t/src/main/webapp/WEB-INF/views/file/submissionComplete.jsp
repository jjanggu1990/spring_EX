<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page isELIgnored = "false" %>
<html>
<head>
<title>업로드 완료</title>
</head>
<body>

${dto.path} <br> 
${dto.name} <br>
${dto.filesize} 

</body>
</html>