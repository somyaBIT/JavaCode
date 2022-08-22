<%@ page isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>Reservation Form</title>
</head>
<h3>Railway Reservation Form</h3>
<body>
	<form:form action="submitForm" modelAttribute="reservation">  
        First name: <form:input path="firstName" />
		<br>
		<br>  
        Last name: <form:input path="lastName" />
		<br>
		<br> 
        Gender :
        Male<form:radiobutton path="gender" value="Male"></form:radiobutton> 
        Female<form:radiobutton path="gender" value="Female"></form:radiobutton>
        Meals:
        BreakFast<form:checkbox path="food" value="BreakFast" />
        Lunch<form:checkbox path="food" value="Lunch" />
        Dinner<form:checkbox path="food" value="Dinner" />
		<br>
		<br>
        Leaving from:<form:select path="cityFrom">
			<form:option value="Ghazibad" label="Ghazibad" />
			<form:option value="Modinagar" label="Modinagar" />
			<form:option value="Meerut" label="Meerut" />
		</form:select>
		<br>
		<br>
         Going To:<form:select path="cityTo">
			<form:option value="Ghazibad" label="Ghazibad" />
			<form:option value="Modinagar" label="Modinagar" />
			<form:option value="Meerut" label="Meerut" />
		</form:select>
		<br>
		<br>
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>