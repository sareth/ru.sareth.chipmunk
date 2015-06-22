<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Parsers</title>

	<style>
		tr:first-child{
			font-weight: bold;
			background-color: #C6C9C4;
		}
	</style>

</head>


<body>
	<h2>List of Parsers</h2>	
	<table>
		<tr>
			<td>id</td><td>Url</td>
		</tr>
		<c:forEach items="${parsers}" var="parser">
			<tr>
			<td>${parser.id}</td>
			<td>${parser.url}</td>
			<td><a href="<c:url value='/parsers/deleteparser-${parser.id}' />">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
	<br/>
	<a href="<c:url value='/parsers/new' />">Add New Parser</a>
</body>
</html>