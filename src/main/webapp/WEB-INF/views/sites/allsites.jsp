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
