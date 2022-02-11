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
	<h1><c:out value = "${ movie}"></c:out></h1>
	<p>Released on: <c:out value="${rd}"/></p>
	<img height = "400px" src = "<c:out value="${imageurl}"/>"/>
			
			
	<h3><c:out value="${actors}"/></h3>
	
<!-- 	{% for actorObj in actors %}
			<p>{{actorObj.firstName}}</p>
	
		{% endfor %} -->
	
	<table class="table table-dark">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">First</th>
      <th scope="col">Last</th>
      <th scope="col">Age</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach var="actorObj" items="${actors}">
	    <tr>
	      <th scope="row">1</th>
	      <td>${actorObj.firstName}</td>
	      <td>${actorObj.lastName }</td>
	      <td>${actorObj.age }</td>
	    </tr>
    </c:forEach>
  </tbody>
</table>
	
	
</body>
</html>