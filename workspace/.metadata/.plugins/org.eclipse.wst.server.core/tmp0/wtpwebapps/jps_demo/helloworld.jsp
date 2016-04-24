<html>

	<body>
		<h3>Hello World of Java!</h3>

		the time on the server is <%= new java.util.Date() %>
	
		<br/><br/>
	
		Request user agent: <%= request.getHeader("User-Agent") %>
		
		<br/><br/>
		
		Request language: <%= request.getLocale() %>
		
	</body>
</html>