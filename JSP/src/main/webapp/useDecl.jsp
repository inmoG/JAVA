<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%!
    public int multiply(int a, int b){
        int c = a * b;
        return c;
    }
%>
<html>
<head>
    <meta charset=UTF-8">
    <title>선언부 사용</title>
</head>

<body>
10 * 25 = <%= multiply(10, 25) %>
</body>
</html>