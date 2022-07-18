<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>
	<title>Student Registration Form</title>
</head>

<body>

	<form:form action="processForm" modelAttribute="student">
	
		First name: <form:input path="firstname" />
		
		<br><br>
	
		Last name: <form:input path="lastname" />
		
		<br><br>
		Country:
	    <form:select path="country">
	    	<form:options items="${student.countryopt}"/>
	    </form:select>
		<br><br>
		FAVorite Lang:
		java<form:radiobutton path="favlang" value="java"/>
		PHP<form:radiobutton path="favlang" value="PHP"/>
		RUBY<form:radiobutton path="favlang" value="RUBY"/>
		C#<form:radiobutton path="favlang" value="C#"/>
		<br><br>
		Favorite OS:
		Linux<form:checkbox path="OS" value="Linux"/>
		MacOS<form:checkbox path="OS" value="MacOS"/>
	    Windows<form:checkbox path="OS" value="Windows"/>
		<br><br>
		<input type="submit" value="Submit" />
	
	</form:form>


</body>

</html>












