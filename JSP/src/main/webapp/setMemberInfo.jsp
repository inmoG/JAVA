<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    session.setAttribute("inmo", "1234");
    session.setAttribute("yeeun", "4567");
    String name = (String)session.getAttribute("inmo");
    String name2 = (String)session.getAttribute("yeeun");
%>
<html>
<head>
    <meta charset=UTF-8">
    <title>세션에 정보 저장</title>
</head>

<body>
세션에 정보를 저장하였습니다.
회원명: <%= name %>, <%= name2 %>
</body>
</html>