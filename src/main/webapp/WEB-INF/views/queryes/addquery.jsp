	<h2>Registration Form</h2>
 
	<form:form method="POST" modelAttribute="query" accept-charset="UTF-8">
		<table>
			<tr>
				<td><label for="text">Text: </label> </td>
				<td><form:input path="text" id="text"/></td>
				<td><form:errors path="text" cssClass="error"/></td>
		    </tr>
		
			<tr>
				<td colspan="3"><input type="submit" value="Add query"/></td>
			</tr>
		</table>
	</form:form>
	<br/>
	<br/>
	Go back to <a href="<c:url value='/queryes/list' />">List of All Queryes</a>
