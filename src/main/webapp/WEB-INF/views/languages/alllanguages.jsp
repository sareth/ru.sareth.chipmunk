<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Languages</title>

	<style>
		tr:first-child{
			font-weight: bold;
			background-color: #C6C9C4;
		}
	</style>

</head>


<body>
	<h2>List of Languages</h2>	
	<table>
		<tr>
			<td>id</td><td>Name</td><td>Value</td>
		</tr>
		<c:forEach items="${languages}" var="language">
			<tr>
			<td>${language.id}</td>
			<td>${language.name}</td>
			<td>${language.value}</td>
			<td><a href="<c:url value='/languages/deletelanguage-${language.id}' />">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
	<br/>
	<a href="<c:url value='/languages/new' />">Add New Language</a>
</body>
</html>