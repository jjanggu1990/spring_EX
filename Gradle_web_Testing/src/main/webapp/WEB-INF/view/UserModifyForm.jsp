<%@ page  contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function withdrawal(){
		location.href="Withdrawal.do";
	}
</script>
</head>
<body>
<form action="UserModifyPro.do" method="post" name="userinfo">
	이메일<input type="text" name="email" value="${memInfo.email }" readonly="readonly" ><br>
	비밀번호<input type="password" name="password"><br>
	나이<input type="text" name="age" value="${memInfo.age }"><br>
	핸드폰번호<input type="text" name="phonenumber" value="${memInfo.phonenumber }"><br>
	<input type="submit" value="수정"><input type="button" value="회원탈퇴" onclick=withdrawal()>
	<input onclick="location.href ='index.do'" type="button" value="취소"><br>
</form>
</body>
</html>