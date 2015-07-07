
<h2>Add country</h2>
<form:form method="POST" modelAttribute="country" accept-charset="UTF-8">
	<div class="form-group">
		<label for="name">Name: </label>
		<form:input path="name" id="name" class="form-control" />
		<form:errors path="name" cssClass="error" class="form-control" />
	</div>
	<div class="form-group">
		<label for="name">Name: </label>
		<form:input path="value" id="value" class="form-control" />
		<form:errors path="value" cssClass="value" class="form-control" />
	</div>
	<button type="submit" class="btn btn-default" value="Add Country">Submit</button>
</form:form>
Go back to <a href="<c:url value='/countryes/list' />">List of All Countryes</a>
