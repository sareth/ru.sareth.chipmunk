	<h2>Registration Form</h2>
 
	<form:form method="POST" modelAttribute="site" accept-charset="UTF-8">
		<table>
			<tr>
				<td><label for="name">Name: </label> </td>
				<td><form:input path="name" id="name"/></td>
				<td><form:errors path="name" cssClass="error"/></td>
		    </tr>
	    
			<tr>
				<td><label for="url">URL: </label> </td>
				<td><form:input path="url" id="url"/></td>
				<td><form:errors path="url" cssClass="error"/></td>
		    </tr>
		
			<tr>
				<td colspan="3"><input type="submit" value="Register"/></td>
			</tr>
		</table>
	</form:form>
	<br/>
	<br/>
	Go back to <a href="<c:url value='/sites/list' />">List of All Sites</a>
