<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!-- deleteExecute.jsp -->
<%@ include file="connection.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보 삭제 요청 처리</title>
</head>
<body>
	<h1>회원정보 삭제</h1>
	
	<%
		// 사용자가 요청한 전송방식을 소문자로 변경하여 저장
		String method = request.getMethod().toLowerCase();
	
		String message = "";
	
		if(method.equals("get")){
			message = "올바른 요청이 아닙니다.";
		}else{
			// POST 방식으로 요청
			String paramNum = request.getParameter("num");
			
			int num = 0;
			
			if(paramNum != null){
				num = Integer.parseInt(paramNum);
			}
			
			PreparedStatement pstmt = conn.prepareStatement(
				"DELETE FROM member WHERE num = ?"
			);
			pstmt.setInt(1, num);
			// DELETE FROM member WHERE num = 5
			int result = pstmt.executeUpdate();
			
			if(result == 1){
				message = num+"번 회원 정보 삭제 완료";
			}else{
				message = "회원정보 삭제 실패";
			}
			
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		} // end POST
	%>
	<h3><%=message%></h3>
	<a href="memberList.jsp">회원 목록</a>
</body>
</html>













