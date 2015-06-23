<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Search Systems</title>

	<style>
		tr:first-child{
			font-weight: bold;
			background-color: #C6C9C4;
		}
	</style>

</head>


<body>
	<h2>List of SearchSystems</h2>	
	<table>
		<tr>
			<td>id</td><td>Name</td><td>Value</td>
		</tr>
		<c:forEach items="${searchsystems}" var="searchsystem">
			<tr>
			<td>${searchsystem.id}</td>
			<td>${searchsystem.name}</td>
			<td>${searchsystem.value}</td>
			<td><a href="<c:url value='/searchsystems/deletess-${searchsystem.id}' />">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
	<br/>
	<a href="<c:url value='/searchsystems/new' />">Add New SearchSystem</a>
</body>
</html>