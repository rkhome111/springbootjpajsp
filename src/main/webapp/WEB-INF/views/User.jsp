<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>   
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script type="text/javascript">
	function call()
	{
		$.ajax({
			  url: "/save",
			  type : "POST",
			  dataType: 'json',
			  data: {name:'rohan',job:'abcd','salary':15000},
			  success: function(data) {console.log(data);}
			});
	}
</script>


</head>
<body>
<h1>User Work</h1>
	<form:form action="/save" method="post">
		<form:label path="name">Name</form:label>
		<form:input path="name"/><br>
		<form:label path="job">Job</form:label>
		<form:input path="job"/><br>
		<form:label path="salary">Salary</form:label>
		<form:input path="salary"/><br>
		
		<input type="submit" value="submit"/>
		<input type="button" value="Call ajax" onclick="call()"/>
	</form:form>
	
	<c:forEach items="${users}" var="user" varStatus="vs">
		<h3>${user.name}</h3><h5>  ${user.job }</h5></p>
	
	</c:forEach>
	

	
</body>
</html>