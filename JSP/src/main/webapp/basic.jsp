<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
<head>
    <meta charset=UTF-8">
    <title>HTML 문서 제목</title>
</head>

<body>
<%
    String bookTitle="JSP프로그래밍";
    String author="양인모";
%>
<b><%= bookTitle %></b>(<%= author %>)입니다.
</body>
</html>