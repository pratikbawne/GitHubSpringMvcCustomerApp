<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri = "http://www.springframework.org/tags/form" prefix="form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Customer</title>
</head>
<body>

<div align="center">
    <h2>New Customer</h2>  
    <form:form action="save" method="POST" modelAttribute="customer" >
        <table border="1" cellpadding="5" >
        
        <tr>
           <td>Name:</td>
           <td><form:input path="name"/> </td>
        </tr>
        
        <tr>   
           <td>E-mail:</td>
           <td><form:input path="email"/> </td>
        </tr>
        
         <tr>  
           <td>Address:</td>
           <td><form:input path="address"/> </td>
        </tr>
        
        <tr>
           <td colspan="2"> <input type="submit" value="Save"/> </td>
        </tr>
          
        </table>
    </form:form> 
</div>

</body>
</html>