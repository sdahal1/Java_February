 <!-- c:out ; c:forEach ; c:if -->
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
 <!-- Formatting (like dates) -->
 <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
  <!-- form:form -->
  <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
    <!-- for rendering errors on PUT routes -->
  <%@ page isErrorPage="true" %> 
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
         <h1>Edit idea</h1>
         <form:form action="/ideas/${idea.id}/update" method="post" modelAttribute="idea">
             <input type="hidden" name="_method" value="put"> 
             <form:input type="hidden" path="uploader" value="${idOfLoggedInUser}" />
             <div> 
                 <form:label path="name">Idea Name:</form:label>
                 <form:errors path="name" class = "text-danger"/>
                 <form:input path="name" type="text" class= "form-control"/>
             </div>
             <div>
                 <form:label path="fundingAmount">Funding Amount:</form:label>
                 <form:errors path="fundingAmount" class = "text-danger"/>
                 <form:input path="fundingAmount" type="number" step="0.1" class= "form-control"/>
             </div>
             <div>
                 <form:label path="category">Category:</form:label>
                 <form:errors path="category" class = "text-danger"/>
                 <form:input path="category" type="text" class= "form-control"/>
             </div>
             <div>
                 <form:label path="description">Idea description:</form:label>
                 <form:errors path="description" class = "text-danger"/>
                 <form:textarea path="description" type="text" class= "form-control"/>
             </div>
             <input type="submit" value="Submit" class= "btn btn-success mt-3"/>
         </form:form>   

         <hr>
         <c:if test='${idOfLoggedInUser == idea.getUploader().getId()}'>
            <h3>You are the creator of this idea!</h3>
            <a href="/idea/${idea.id}/delete">Delete Idea</a>
         </c:if>
     </div>
 </body>
 </html>