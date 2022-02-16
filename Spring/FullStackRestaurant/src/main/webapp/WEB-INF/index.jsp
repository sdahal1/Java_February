<!-- c:out ; c:forEach ; c:if -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <!-- form:form -->
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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

    <h1>All the menu items. Choose from our fantastic selection.</h1>
  
    <table class="table table-dark">
      <thead>
        <tr>
          <th scope="col">#ID</th>
          <th scope="col">Name</th>
          <th scope="col">Type of Dish:</th>
          <th scope="col">Price</th>
          <th>Actions: </th>
        </tr>
      </thead>
      <tbody>
        <c:forEach items='${ allMenuItems }' var='menuObj'>
          <tr>
            <th scope="row">${menuObj.id}</th>
            <td><a href="/menuitems/${menuObj.id}">${menuObj.name}</a></td>
            <td>${menuObj.dishType}</td>
            <td>${menuObj.price}</td>
            <td>
              <a href="/menuitems/edit/${menuObj.id}">Edit</a> ||
              <a href="/menuitems/delete/${menuObj.id}">Delete</a>
            </td>
          </tr>
        </c:forEach>
      </tbody>
    </table>
    <hr>

    <form:form action="/menuitem/create" method="post" modelAttribute="menuitem"> <!--The model attribute represents which model to bind to-->
      <!-- The path="" must match the member variables from the Table Model class -->
    <p>
      <form:label path="name">Name: </form:label>
      <form:errors path="name" class = "text-danger" />
      <form:input type="text" path="name" class= "form-control"/>
    </p>
    <p>
        <form:label path="dishType">Dish Type:</form:label>
        <form:errors path="dishType" class = "text-danger"/>
        <form:input type="text" path="dishType" class= "form-control"/>
    </p>
    <p>
        <form:label path="price">Price: </form:label>
        <form:errors path="price" class = "text-danger"/>
        <form:input type = "number" path="price" step="0.01" class= "form-control"/>
    </p>
    <p>
        <form:label path="description">Description: </form:label>
        <form:errors path="description" class = "text-danger"/>     
        <form:textarea path="description" class= "form-control"/>
    </p>    
    <input type="submit" value="Submit"/>
    </form:form>   
  </div>
</body>
</html>