<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import = "java.util.Enumeration" %>
<html>
<head>
    <meta charset=UTF-8">
    <title>헤더 목록 출력</title>
</head>

<body>
<%
    Enumeration headerEnum = request.getHeaderNames();
    while(headerEnum.hasMoreElements()){
        String headerName = (String)headerEnum.nextElement();
        String headerValue = request.getHeader(headerName);
%>
<%= headerName %> = <%= headerValue %><br>
<%
}

response.sendRedirect("/form.jsp");
%>


</body>
</html>