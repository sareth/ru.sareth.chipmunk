
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
