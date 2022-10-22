<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="Cookies" %>
<%
    String id = request.getParameter("id");
    String password = request.getParameter("password");

    if(id.equals(password)){
        response.addCookie(Cookies.createCookie("AUTH", id, "/", -1));
%>
<html>
<head>
    <meta charset=UTF-8">
    <title>로그인 성공</title>
</head>

<body>
로그인에 성공했습니다.
</body>
</html>
<%
    }else{
%>
<script>
alert("로그인에 실패했습니다.");
history.go(-1);
</script>
<%
}
%>