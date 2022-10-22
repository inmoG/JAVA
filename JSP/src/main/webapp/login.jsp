<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    String id = request.getParameter("memberId");
    if(id != null && id.equals("inmo"))
    {
        response.sendRedirect("index.jsp");
    }
    else{
%>
<html>
<head>
    <meta charset=UTF-8">
    <title>Insert title here</title>
</head>

<body>
로그인 실패
<%
}
%>
</body>
</html>