<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>

.error{color:red}

</style>
</head>
<body>
<h3 class="error">${key}</h3>
<form:form action="registerEmp" modelAttribute="employee" method="post">
id:<form:input path="id"/><br>
name:<form:input path="name"/><form:errors path="name" cssClass="error"></form:errors><br>
salary:<form:input path="salary"/><form:errors path="salary" cssClass="error"></form:errors><br>
<input type="submit" value="register">
</form:form>
</body>
</html>