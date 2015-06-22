<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Queryes</title>

	<style>
		tr:first-child{
			font-weight: bold;
			background-color: #C6C9C4;
		}
	</style>

</head>


<body>
	<h2>List of Queryes</h2>	
	<table>
		<tr>
			<td>id</td><td>Text</td>
		</tr>
		<c:forEach items="${queryes}" var="query">
			<tr>
			<td>${query.id}</td>
			<td>${query.text}</td>
			<td><a href="<c:url value='/queryes/deletequery-${query.id}' />">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
	<br/>
	<a href="<c:url value='/queryes/new' />">Add New Query</a>
</body>
</html>