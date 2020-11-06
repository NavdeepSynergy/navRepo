<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"  %>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="deduction" method="POST">
		Enter Your Name: <input type='text' name='empName'/><br><br>
		Enter Dependent Name (Comma Separated): <br>
		<input type='text' name='dependents' id='dependents' /><br><br>
		<input type='submit' name="Submit" value='Preview Deductions' />
	</form>
	<br>
	<br>
	<table>
		<%-- <c:forEach items="${employees}" var="e"> --%>
			<tr><td>Your Deduction Per Paycheck: ${employee.deduction}</td></tr>
			<tr><td>Your Discount Per Paycheck: ${employee.discount}</td></tr>
			<tr><td>Your Paycheck After Deduction And Discount: ${employee.paycheckAfterDiscountDeduction}</td></tr>
		<%-- </c:forEach> --%>
	</table>
</body>
</html>