<%@ page import="com.cse135.jsp.*" %>
<html>

<head><title>Signup Confirmation Title</title></head>

<body>

	Successful sign up! Welcome ${param.username}!
	<br/>
	Age: ${param.age}
	<br/>
	Role: ${param.role }
	<br/>
	State: ${param.state }
	<br/>
	here we go:
	<%
	for(int i=0; i < FunUtils.boxTest(5); i++)
		out.println("<br/>NEW BOX HERE");
	%>

</body>
</html>