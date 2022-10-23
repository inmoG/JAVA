<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
<head>
    <meta charset=UTF-8">
    <title>HTML 문서 제목</title>
</head>

<body>
<%--
주석
<%
    String bookTitle="JSP프로그래밍";
    String author="양인모";
%>
--%>
<%
    String bookTitle = "JSP프로그래밍";
%>
<!
    소스코드가 보이는 주석
    String book="Spring";
!>

<%= bookTitle %>
</body>
</html>