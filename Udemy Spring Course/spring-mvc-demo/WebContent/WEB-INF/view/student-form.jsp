<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	 <title> Registration page </title>
</head>
<body>
	<form:form action = "processForm" modelAttribute = "student">
	First name: <form:input path ="firstName" />
	<br></br>
	Last name: <form:input path = "lastName" />
	<br></br>
	Country: 
	<form:select path = "country">
		<form:options items = "${student.countryOptions}" />
	</form:select>
	<br></br>
	<form:radiobuttons path="language" items = "${student.languageOptions}"/>
	<br></br>
	<input type = "submit" value = "Submit" />
	<br></br>
	<form:checkboxes items="${student.operOptions}" path="opers"/>
	</form:form>
</body>
</html>