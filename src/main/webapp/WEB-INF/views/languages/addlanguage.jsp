	<h2>Registration Form</h2>
 
	<form:form method="POST" modelAttribute="language" accept-charset="UTF-8">
		<table>
			<tr>
				<td><label for="name">Name: </label> </td>
				<td><form:input path="name" id="name"/></td>
				<td><form:errors path="name" cssClass="error"/></td>
		    </tr>
			<tr>
				<td><label for="value">Value: </label> </td>
				<td><form:input path="value" id="value"/></td>
				<td><form:errors path="value" cssClass="error"/></td>
		    </tr>
			<tr>
				<td colspan="3"><input type="submit" value="Add Language"/></td>
			</tr>
		</table>
	</form:form>
	<br/>
	<br/>
	Go back to <a href="<c:url value='/languages/list' />">List of All Languages</a>