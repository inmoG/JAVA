<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%!
    public int add(int a, int b){
        int c = a+b;
        return c;
    }

    public int subtract(int a, int b){
        int c = a - b;
        return c;
    }
%>
<html>
<head>
    <meta charset=UTF-8">
    <title>Insert title here</title>
</head>

<body>
<%
    int value = 3;
    int value2 = 9;

    int addResult = add(value, value2);
    int subtractResult = subtract(value, value2);
%>

<%= value %> + <%= value2 %> = <%= addResult %>
<br>
<%= value %> + <%= value2 %> = <%= subtractResult %>
</body>
</html>