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
        <h1>Info about team: ${teamToshow.name} </h1>
        
        <table class="table table-dark">
            <thead>
              <tr>
                <th scope="col">Player ID</th>
                <th scope="col">First</th>
                <th scope="col">Last</th>
                <th scope="col">Points per game</th>
                <th scope="col">Current team</th>

              </tr>
            </thead>
            <tbody>
                <c:forEach items='${ teamToshow.players }' var='playerObj'>
                    <tr>
                        <th scope="row">${playerObj.id}</th>
                        <td>${playerObj.firstName}</td>
                        <td>${playerObj.lastName}</td>
                        <td>${playerObj.pointsPerGame}</td>
                        <td>${playerObj.team.name}</td>
                    </tr>
                </c:forEach>
            </tbody>
          </table>
    </div>
</body>
</html>