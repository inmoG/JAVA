<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
<head>
    <meta charset=UTF-8">
    <title>로그인 페이지</title>
</head>

<body>
<form action="<%= request.getContextPath() %>/jsp/login.jsp">
아이디 : <input type="text" name="memberId">
암호 : <input type="password" name="password">
<input type="submit" value="로그인">
</form>
</body>
</html>