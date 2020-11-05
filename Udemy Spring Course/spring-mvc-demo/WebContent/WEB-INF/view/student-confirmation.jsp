<!DOCTYPE html>
<html>
<head>
	 <title> Confirmation page </title>
</head>
<body>
	The student is confirmed: ${student.firstName} ${student.lastName} from ${student.country}
	Fav. language: ${student.language}
	Oper. systems: 
<ul>
	<c:forEach var ="temp" items = "${student.operOptions}">
		<li>${temp}</li>
	</c:forEach>
</ul>
</body>
</html>