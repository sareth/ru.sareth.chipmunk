
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
