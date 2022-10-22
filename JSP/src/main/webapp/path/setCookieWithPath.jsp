<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import = "java.net.URLEncoder" %>
<%
    Cookie cookie1 = new Cookie("path1", URLEncoder.encode("경로:/webapp/path", "utf-8"));
    cookie1.setPath("/webapp/path");
    response.addCookie(cookie1);

    Cookie cookie2 = new Cookie("path2", URLEncoder.encode("경로:", "utf-8"));
    response.addCookie(cookie2);

    Cookie cookie3 = new Cookie("path3", URLEncoder.encode("경로:/", "utf-8"));
    cookie3.setPath("/");
    response.addCookie(cookie3);
%>
<html>
<head>
    <meta charset=UTF-8">
    <title>쿠키 경로 지정</title>
</head>

<body>
다음과 같이 쿠키를 생성했습니다. <br>
<%= cookie1.getName() %> = <%= cookie1.getValue() %>
[<%= cookie1.getPath() %>
<br>
<%= cookie2.getName() %> = <%= cookie2.getValue() %>
<%= cookie2.getPath() %>
<br>
<%= cookie3.getName() %> = <%= cookie3.getValue() %>
<%= cookie3.getPath() %>
</body>
</html>