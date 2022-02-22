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
        <h1>Welcome to the dashboard, ${loggedInUser.userName} </h1>
        <a href="/logout">Logout</a>
        <table class="table table-dark">
            <thead>
              <tr>
                <th scope="col">ID#</th>
                <th scope="col">Idea Name</th>
                <th scope="col">Amount Requested</th>
                <th scope="col">Category</th>
                <th scope="col">Idea Creator (Uploader)</th>

              </tr>
            </thead>
            <tbody>
                <c:forEach items='${ allIdeas }' var='ideaObj'>

                    <tr>
                        <th scope="row">${ideaObj.id}</th>
                        <td>${ideaObj.name}</td>
                        <td>${ideaObj.fundingAmount}</td>
                        <td>${ideaObj.category}</td>
                        <td>${ideaObj.uploader.userName}</td>

                    </tr>
                </c:forEach>
              
            </tbody>
          </table>
    </div>
   
</body>
</html>