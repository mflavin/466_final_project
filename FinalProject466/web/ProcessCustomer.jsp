<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="Model.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
   <style type="text/css">
      body{
         background: url("car4.jpg") no-repeat center center fixed;
         background-size: 70% 70%;
      }
      #space {
         padding-top: 60px;
      }
      td {
         font-size: 20px;
         font-weight: bold;
      }
      table, td {
         border: 2px solid;
         background-color:rgba(192,192,192,0.3);
      }
   </style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ProcessCustomer</title>
</head>
<body>
<jsp:useBean id="regUser" class="Model.User" scope="session"/>
<h1 align="center">Login successful!</h1>
<table id ="table1" align="center" width="400" cellpadding="10" cellspacing="0" border="1">
<tr>
   <td>UserId</td>
   <td><jsp:getProperty property="id" name="regUser"/></td>
</tr>
<tr>
   <td>First Name</td>
   <td><jsp:getProperty property="fname" name="regUser"/></td>
</tr>
<tr>
   <td>Last Name</td>
   <td><jsp:getProperty property="lname" name="regUser"/></td>
</tr>
<tr>
   <td>Email</td>
   <td><jsp:getProperty property="email" name="regUser"/></td>
</tr>
<tr>
   <td>StreetAddress</td>
   <td><jsp:getProperty property="streetaddress" name="regUser"/></td>
</tr>
<tr>
   <td>City</td>
   <td><jsp:getProperty property="city" name="regUser"/></td>
</tr>
<tr>
   <td>State</td>
   <td><jsp:getProperty property="state" name="regUser"/></td>
</tr>
</table>
<br/>
<p id="space" align="center">
<a href="BuyCar.jsp">Buy, or Rent, a Car Here!</a>
</p>
<p align="center">
   <a href="BuyPart.jsp">Buy, or Rent, a Car <b>Part</b> Here!</a>
</p>
<p align="center">
   <a href="UserLogin.jsp">Logout!</a>
</p>
</body>
</html>