<%@ page  contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="UserInsertPro.do" method="post" name="userinfo">
	
	이메일<input type="text" name="email"><br>
	비밀번호<input type="password" name="password"><br>
	나이<input type="text" name="age"><br>
	핸드폰번호<input type="text" name="phonenumber"><br>
	<input type="submit" value="회원가입"><input onclick= "location.href ='index.do'" type="button" value="취소"><br>
</form>
</body>
</html>