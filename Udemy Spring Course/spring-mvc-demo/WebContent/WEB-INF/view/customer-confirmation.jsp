<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	<title> Confirmation </title>
</head>
<body>
	The customer is confirmed: ${customer.lastName} ${customer.firstName}
	<br></br>
	Number of free passes is: ${customer.freePasses}
	<br></br>
	Phone is: ${customer.phone}
	<br></br>
	Course code: ${customer.courseCode}
</body>
</html>