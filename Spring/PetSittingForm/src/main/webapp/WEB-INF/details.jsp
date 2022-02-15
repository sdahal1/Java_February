<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/css/style.css">

</head>
<body>
    <h1>Here are the details of your appointment for: <%= session.getAttribute("pname") %></h1>
    <!-- <h1>Here are the details of your appointment for: <c:out value='${ pname }'/></h1> -->
    <p>You, the owner, named: <%= session.getAttribute("owner_name")  %> certify that we, Dojo Pets (name of company) are allowed to take care of your pet named: <%= session.getAttribute("pname")  %> at the age of <%= session.getAttribute("age")  %>. We will make sure the pet gets plenty of time to <%= session.getAttribute("fav_activity") %> and we will keep this pet away from <%= session.getAttribute("other_animals")  %> </p>


</body>
</html>