<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import = "java.sql.DriverManager" %>
<%@ page import = "java.sql.Connection" %>
<%@ page import = "java.sql.PreparedStatement" %>
<%@ page import = "java.sql.SQLException" %>
<%
    String idValue = request.getParameter("id");

    Connection conn = null;
    PreparedStatement pstmtItem = null;
    PreparedStatement pstmtDetail = null;

    // Class.forName("com.mysql.jdbc.Driver");
    String jdbcDriver = "jdbc:mysql://localhost:3305/JSP?" + "useUnicode=true&characterEncoding=utf8";
    String dbUser = "jspexam";
    String dbPass = "jsppw";

    Throwable accuredException = null;

    try{
        int id = Integer.parseInt(idValue);

        conn = DriverManager.getConnection(jdbcDriver, dbUser, dbPass);
        conn.setAutoCommit(false);

        pstmtItem = conn.prepareStatement("insert into ITEM values (?, ?)");
        pstmtItem.setInt(1, id);
        pstmtItem.setString(2, "상품 이름 " + id);
        pstmtItem.executeUpdate();

        if(request.getParameter("error") != null){
            throw new Exception("의도적 인셉션 발생");
        }

        pstmtDetail = conn.prepareStatement("insert into ITEM_DETAIL values (?, ?)");
        pstmtDetail.setInt(1, id);
        pstmtDetail.setString(2, "상세 설명 " + id);
        pstmtDetail.executeUpdate();

        conn.commit();
    } catch(Throwable e){
        if(conn != null){
            try{
                conn.rollback();
                } catch(SQLException ex) {}
        }
        accuredException = e;
    }
    finally {
        if(pstmtItem != null)
            try{    pstmtItem.close();  } catch(SQLException ex) {}
        if(pstmtDetail != null)
            try{    pstmtDetail.close(); } catch(SQLException ex) {}
        if(conn != null) try { conn.close(); } catch(SQLException ex) {}
    }
%>

<html>
<head>
    <meta charset=UTF-8">
    <title>Item 값 입력</title>
</head>

<body>
<% if(accuredException != null){ %>
에러가 발생: <%= accuredException.getMessage() %>
<%  } else { %>
데이터가 성공적으로 들어감
<% } %>
</body>
</html>