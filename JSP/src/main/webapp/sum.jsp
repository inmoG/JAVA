<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
<head>
    <meta charset=UTF-8">
    <title>합 구하기</title>
</head>

<body>
<%
    int sum = 0;
    for(int i=0; i<10; i++)
    {
        sum = sum+=i;
    }
%>
1부터 10까지 합은 <%= sum %> 입니다.
<br>
<%
    int sum2= 0;
    for(int i=0; i<15; i++)
    {
        sum2 += i;
    }
%>
11부터 20까지 합은 <%= sum2 %>입니다.
<br>
1부터 10까지 합은 <%= 1+2+3+4+5+6+7+8+9+10 %>입니다.

</body>
</html>