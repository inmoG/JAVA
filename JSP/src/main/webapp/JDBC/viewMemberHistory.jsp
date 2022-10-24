<%@ page contentType = "text/html; charset=utf-8" %>

<%@ page import = "java.sql.DriverManager" %>
<%@ page import = "java.sql.Connection" %>
<%@ page import = "java.sql.Statement" %>
<%@ page import = "java.sql.ResultSet" %>
<%@ page import = "java.sql.SQLException" %>
<%@ page import = "java.io.Reader" %>
<%@ page import = "java.io.IOException" %>

<%
	String memberID = request.getParameter("memberID");
%>
<html>
<head><title>회원 정보</title></head>
<body>

<%
	Class.forName("com.mysql.jdbc.Driver");

	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;

	try {
		String jdbcDriver = "jdbc:mysql://localhost:3305/JSP?" +
							"useUnicode=true&characterEncoding=utf8";
		String dbUser = "jspexam";
		String dbPass = "jsppw";
		String query =  "select * from MEMBER_HISTORY "+
						"where MEMBERID = '"+memberID+"'";

		conn = DriverManager.getConnection(jdbcDriver, dbUser, dbPass);
		stmt = conn.createStatement();

		rs = stmt.executeQuery(query);
		if(rs.next()) {
%>
<table border="1">
<tr>
	<td>아이디</td><td><%= memberID %></td>
</tr>
<tr>
	<td>히스토리</td>
	<td>
<%
			String history = null;
			Reader reader = null;
			try {
			    // 1. ResultSet의 getCharacterStream()으로 Reader 구함
				reader = rs.getCharacterStream("HISTORY"); // 스트림 읽어옴

				if (reader != null) {
				    // 2. 스트림에서 읽어온 데이터를 저장할 버퍼를 생성한다.
					StringBuffer buff = new StringBuffer();
					char[] ch = new char[512];
					int len = -1;
                    // 3. 스트림에서 데이터를 읽어와 버퍼에 저장한다.
					while( (len = reader.read(ch)) != -1) {
						buff.append(ch, 0, len);
					}
                    // 4. 버퍼에 저장한 내용을 String으로 변환한다.
					history = buff.toString();
				}
			} catch(IOException ex) {
			    // 5. IO 관련 처리 도중 문제가 있으면 IOException 발생
				out.println("익셉션 발생:"+ex.getMessage());
			} finally {
			    // 6. Reader 종료
				if (reader != null) try { reader.close(); } catch(IOException ex) {}
			}
%>
	<%= history %>
	</td>
</tr>
</table>
<%
		} else {
%>
<%= memberID %> 회원의 히스토리가 없습니다.
<%
		}
	} catch(SQLException ex) {
%>
에러 발생: <%= ex.getMessage() %>
<%
	} finally {
		if (rs != null) try { rs.close(); } catch(SQLException ex) {}
		if (stmt != null) try { stmt.close(); } catch(SQLException ex) {}
		if (conn != null) try { conn.close(); } catch(SQLException ex) {}
	}
%>

</body>
</html>