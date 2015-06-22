<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Countryes</title>

	<style>
		tr:first-child{
			font-weight: bold;
			background-color: #C6C9C4;
		}
	</style>

</head>


<body>
	<h2>List of Countryes</h2>	
	<table>
		<tr>
			<td>id</td><td>Name</td><td>Value</td>
		</tr>
		<c:forEach items="${countryes}" var="country">
			<tr>
			<td>${country.id}</td>
			<td>${country.name}</td>
			<td>${country.value}</td>
			<td><a href="<c:url value='/countryes/deletecountry-${country.id}' />">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
	<br/>
	<a href="<c:url value='/countryes/new' />">Add New Country</a>
</body>
</html>