<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.Enumeration" %>
<%@ page import="java.util.Map" %>
<%
    request.setCharacterEncoding("UTF-8");
%>
<html>
<head>
    <meta charset=UTF-8">
    <title>요청 파라미터 출력</title>
</head>

<body>
    <b> request.getParameter() 메서드 사용 </b> <br>
    name 파라미터 = <b><%= request.getParameter("name") %></b><br>
    address 파라미터 = <b><%= request.getParameter("address") %></b><br>
    pet 파라미터 = <b><%= request.getParameter("pet") %></b><br>
    <p>
    <b> request.getParameterValues() 메서드 사용 </b><br>
    <%
        String[] values = request.getParameterValues("pet"); // array
        if(values != null){
            for(int i =0; i< values.length; i++){
    %>
            <%= values[i]%>
    <%
            }
        }
    %>
    <p>
    <b> request.getParameterNames() 메서드 사용 </b><br>
    <%
        Enumeration paramEnum = request.getParameterNames();
        while(paramEnum.hasMoreElements())
        {
            String name = (String)paramEnum.nextElement();
    %>
        <%= name %>
    <%
        }
    %>
    <p>
    <b>request.getParameterMap() 메서드 사용 </b> <br>
    <%
        Map parameterMap = request.getParameterMap();
        String[] nameParam = (String[])parameterMap.get("name");
        if(nameParam != null){
    %>
    name = <%= nameParam[0] %>
    <%
    }
    %> 
</body>
</html>