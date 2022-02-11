<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1><c:out value = "${ movie}"></c:out></h1>
	<p>Released on: <c:out value="${rd}"/></p>
	<img height = "400px" src = "<c:out value="${imageurl}"/>"/>
			
	
	
</body>
</html>