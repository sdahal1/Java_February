<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
    <div class="container">
        <h1>Details about ${ideaToShow.name}</h1>
        <p>Funding Requested: $ ${ideaToShow.fundingAmount}</p>
        <p>Category ${ideaToShow.category}</p>
        <p>Description:  ${ideaToShow.description}</p>
        <p>Creator of the Idea: ${ideaToShow.uploader.userName} </p>

        <c:if test='${idOfLoggedInUser == ideaToShow.uploader.id}'>
            <a href="/ideas/${ideaToShow.id}/edit">Edit</a> ||
            <a href="/ideas/${ideaToShow.id}/delete">Delete</a>
        </c:if>


    </div>
</body>
</html>