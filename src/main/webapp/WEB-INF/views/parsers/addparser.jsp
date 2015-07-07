	<h2>Registration Form</h2>
 
	<form:form method="POST" modelAttribute="parser" accept-charset="UTF-8">
		<table>
			<tr>
				<td><label for="url">Url: </label> </td>
				<td><form:input path="url" id="url"/></td>
				<td><form:errors path="url" cssClass="error"/></td>
		    </tr>
			
			<tr>
				<td colspan="3"><input type="submit" value="Add Parser"/></td>
			</tr>
		</table>
	</form:form>
	<br/>
	<br/>
	Go back to <a href="<c:url value='/parsers/list' />">List of All Parsers</a>
