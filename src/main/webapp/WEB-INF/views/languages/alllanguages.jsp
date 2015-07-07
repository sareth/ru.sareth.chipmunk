
	<h2>List of Languages</h2>	
	<table>
		<tr>
			<td>id</td><td>Name</td><td>Value</td>
		</tr>
		<c:forEach items="${languages}" var="language">
			<tr>
			<td>${language.id}</td>
			<td>${language.name}</td>
			<td>${language.value}</td>
			<td><a href="<c:url value='/languages/deletelanguage-${language.id}' />">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
	<br/>
	<a href="<c:url value='/languages/new' />">Add New Language</a>
