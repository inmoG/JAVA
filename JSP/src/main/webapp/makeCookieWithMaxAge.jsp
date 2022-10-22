<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    Cookie cookie = new Cookie("abc", "1time");
    cookie.setMaxAge(60 * 60);
    response.addCookie(cookie);
%>
<html>
<head>
    <meta charset=UTF-8">
    <title>쿠키 유효시간 설정</title>
</head>

<body>
유효시간 1시간인 abc 쿠키 생성
</body>
</html>