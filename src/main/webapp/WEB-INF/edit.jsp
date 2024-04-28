<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>      
<%@ page isErrorPage="true" %>  
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

 
<h1>Edit Burger</h1>
<form:form action="/burger/${burger.id}" method="post" modelAttribute="burger">
    <input type="hidden" name="_method" value="put">
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
    <input type="submit" value="Update"/>
</form:form>  

<form action="/burger/${burger.id}" method="post">
    <input type="hidden" name="_method" value="delete">
    <input type="submit" value="Delete">
</form>

</body>
</html>