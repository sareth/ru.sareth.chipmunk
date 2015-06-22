<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Sites</title>

	<style>
		tr:first-child{
			font-weight: bold;
			background-color: #C6C9C4;
		}
	</style>

</head>


<body>
	<h2>List of Sites</h2>	
	<table>
		<tr>
			<td>id</td><td>URL</td><td>Name</td>
		</tr>
		<c:forEach items="${sites}" var="site">
			<tr>
			<td>${site.id}</td>
			<td>${site.name}</td>
			<td>${site.url}</td>
			<td><a href="<c:url value='/sites/deletesite-${site.id}' />">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
	<br/>
	<a href="<c:url value='/sites/new' />">Add New Site</a>
</body>
</html>