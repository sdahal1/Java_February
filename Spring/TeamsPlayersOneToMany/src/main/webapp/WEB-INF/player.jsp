<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
    <div class="container">
        <h1>Add a player below</h1>
        <h1>${allteams}</h1>
        <form:form action="/players/create" method="post" modelAttribute="player">
            <div>
                <form:label path="firstName">First Name</form:label>
                <form:errors path="firstName" class= "text-danger"/>
                <form:input path="firstName" type="text" class= "form-control"/>
            </div>
            <div>
                <form:label path="lastName">Last Name</form:label>
                <form:errors path="lastName" class= "text-danger"/>
                <form:input path="lastName" type="text" class= "form-control"/>
            </div>
            <div>
                <form:label path="pointsPerGame">Points per game</form:label>
                <form:errors path="pointsPerGame" class= "text-danger"/>
                <form:input path="pointsPerGame" type="number" step="0.1" class= "form-control"/>
            </div>
            <div>
                <form:label path="team">Which team does the player play for?</form:label>
                <form:errors path="team" class= "text-danger"/>
                <form:select path="team" name="" id="" class="form-select">
                    <c:forEach items='${ allteams }' var='teamObj'>
                        <option value="${teamObj.id}">${teamObj.name}</option>
                    </c:forEach>
                </form:select>

            </div>

            
          
            <input type="submit" value="Submit"/>
        </form:form>
    </div>
</body>
</html>