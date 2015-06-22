<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Regions</title>

	<style>
		tr:first-child{
			font-weight: bold;
			background-color: #C6C9C4;
		}
	</style>

</head>


<body>
	<h2>List of Regions</h2>	
	<table>
		<tr>
			<td>id</td><td>Name</td><td>Value</td>
		</tr>
		<c:forEach items="${regions}" var="region">
			<tr>
			<td>${region.id}</td>
			<td>${region.name}</td>
			<td>${region.value}</td>
			<td><a href="<c:url value='/regions/deleteregion-${region.id}' />">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
	<br/>
	<a href="<c:url value='/regions/new' />">Add New Region</a>
</body>
</html>