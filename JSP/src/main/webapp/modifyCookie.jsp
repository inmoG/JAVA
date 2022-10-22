<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import = "java.net.URLEncoder" %>
<%
    Cookie[] cookies = request.getCookies(); // 쿠키 가져오기
    if(cookies != null && cookies.length > 0){
        for(int i = 0; i< cookies.length; i++){
            if(cookies[i].getName().equals("name")){
                Cookie cookie = new Cookie("name", URLEncoder.encode("JSP프로그래밍", "UTF-8"));
                response.addCookie(cookie);
            }
        }
    }
%>
<html>
<head>
    <meta charset=UTF-8">
    <title>값 변경</title>
</head>

<body>
name 쿠키 값을 변경한다.
</body>
</html>