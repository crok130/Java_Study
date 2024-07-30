<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!-- sms.jsp -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div>
	<button id="balance">get-balance</button>
	<button id="sendOne">send-one</button>
	<input type="text" id="phone" />
</div>
<script>
	document.querySelector("#balance").onclick = function(){
		location.href = "getBalance.jsp";
	};
	
	document.querySelector("#sendOne").onclick = function(){
		let u_phone = document.querySelector("#phone").value;
		
		fetch("sendOne.jsp",{
			method : "POST",
			body : new URLSearchParams({u_phone : u_phone})
		}).then(res => res.json())
		.then(data => console.log(data))
		.catch(error => console.log(error));
		
	};
	
	
</script>
</body>
</html>




