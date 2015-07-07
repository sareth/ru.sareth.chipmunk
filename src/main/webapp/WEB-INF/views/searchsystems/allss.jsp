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
