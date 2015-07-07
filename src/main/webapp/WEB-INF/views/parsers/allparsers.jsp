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
