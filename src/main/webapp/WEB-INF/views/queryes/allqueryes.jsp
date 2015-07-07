
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
