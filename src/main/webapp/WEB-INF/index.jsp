<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %> 

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Burgers Rating</title>
</head>
<body>
<h1>All Burgers</h1>
<table>
	<thead>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Restaurant</th>
			<th>Rating</th>
			<th>Action</th>
		</tr>
	</thead>
	<tbody>
	    <c:forEach var="burger" items="${burgers}">
	        <tr>
	            <td>${burger.id}</td>
	            <td>${burger.name}</td>
	            <td>${burger.restaurant}</td>
	            <td>${burger.rating}</td>
	            <td><a href="/burger/edit/${burger.id}">Edit</a> </td>
	        </tr>
	    </c:forEach>		
	</tbody>
</table>

   
<h1>New Burger</h1>
<form:form action="/burger" method="post" modelAttribute="burger">
    <p>
        <form:label path="name">Burger Name:</form:label>
        <form:errors path="name"/>
        <form:input path="name"/>
    </p>
    <p>
        <form:label path="restaurant">Restaurant Name:</form:label>
        <form:errors path="restaurant"/>
        <form:input path="restaurant"/>
    </p>
    <p>
        <form:label path="rating">Rating:</form:label>
        <form:errors path="rating"/>     
        <form:input type="number" path="rating"/>
    </p>    
    <p>
        <form:label path="note">Note:</form:label>
        <form:errors path="note"/>
        <form:textarea path="note"/>
    </p>
    <input type="submit" value="Submit"/>
</form:form>  
</body>
</html>