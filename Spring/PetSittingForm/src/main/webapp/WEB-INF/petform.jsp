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
        <h1>Make a pet sitting arrangement!!!</h1>
        <form action="/process_appointment" method="post">
            <div class="form-group">
                <label for="">Pet Name:</label>
                <input type="text" name="pet_name" id="" class="form-control">
            </div>
            <div class="form-group">
                <label for="">Age:</label>
                <input type="number" name="age" id="" class="form-control" style = "width: 20%;">
            </div>
            <div class="form-group">
                <label for="">Owner Name:</label>
                <input type="text" name="owner_name" id="" class="form-control">
            </div>
            <div class="form-group">
                <label for="">Pet Favorite Activity:</label>
                <input type="text" name="fav_activity" id="" class="form-control">
            </div>
            <div class="form-group">
                <label for="">Animals to keep pet away from:</label>
                <input type="text" name="other_animals" id="" class="form-control">
            </div>
            <div class="form-group">
                <label for="">Something nice about the pet</label>
                <textarea name="fun_fact" id="" cols="30" rows="10" class="form-control"></textarea>
            </div>
            <input type="submit" value="Submit!" class="btn btn-success">
        </form>
    </div>
</body>
</html>