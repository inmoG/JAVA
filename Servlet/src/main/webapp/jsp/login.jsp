<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    String memberId = request.getParameter("memberId");
    session.setAttribute("MEMBER", memberId);
%>
<html>
<head>
    <meta charset=UTF-8">
    <title>로그인</title>
</head>

<body>
로그인 차리
</body>
</html>