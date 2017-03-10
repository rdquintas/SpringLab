<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Spring MVC Form Handling</title>
</head>
<body>

	<h1>This form adds stuff</h1>
	<form:form method="POST" action="/zrqMVCexample04/addStudent">
		<table>
			<tr>
				<td><form:label path="name">Name</form:label></td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td><form:label path="age">Age</form:label></td>
				<td><form:input path="age" /></td>
			</tr>
			<tr>
				<td><form:label path="id">id</form:label></td>
				<td><form:input path="id" /></td>
			</tr>
			<tr>
				<td><form:label path="password">Password</form:label></td>
				<td><form:password path="password" /></td>
			</tr>
			<tr>
				<td><form:label path="address">Address</form:label></td>
				<td><form:textarea path="address" rows="5" cols="30" /></td>
			</tr>
			<tr>
				<td><form:label path="receivePaper">Subscribe Newsletter</form:label></td>
				<td><form:checkbox path="receivePaper" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>

	<hr>
	<h1>This Form Redirects</h1>
	<form:form method="GET" action="/zrqMVCexample04/redirect">
		<input type="submit" value="Redirect" />
	</form:form>

</body>
</html>