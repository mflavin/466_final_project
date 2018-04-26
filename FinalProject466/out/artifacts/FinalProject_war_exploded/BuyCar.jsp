<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
   <style type="text/css">
      body{
         background: url("car4.jpg") no-repeat center center fixed;
         background-size: 70% 70%;
      }
      .grid-container {
         display: grid;
         padding: 10px;
      }
      .grid-item {
         border: 1px solid;
         padding: 10px;
         margin-bottom: 120px;
         text-align: center;
      }
   </style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Buy Car</title>
</head>
<body>
<jsp:useBean id="car" class="Model.Car" scope="session"/>
<h2 align="center">Buy, or Rent, a Car!</h2>
<h3 align="center">Search by Car Name or Car Type!</h3>
   <form name="Addcar" action="BuyCarServlet" method="post">
      <table align="center">
         <tr>
            <td>Car Name</td>
            <td><input type="text" name="carname" value=""></td>
         </tr>
         <tr>
            <td>Car type</td>
            <td><input type="text" name="cartype" value=""></td>
         </tr>
            <td colspan="2" align="center"><input type="submit" value="Search Cars"></td>
         </tr>
      </table>
   </form>

<h3 align="center">Cars</h3>

<div class="grid-container">
   <table class="grid-item" align="center">
      <tr>
         <td>Car Name</td>
         <td><jsp:getProperty property="name" name="car"/></td>
      </tr>
      <tr>
         <td>Car Type</td>
         <td><jsp:getProperty property="type" name="car"/></td>
      </tr>
      <tr>
         <td>Car Rent Price</td>
         <td><jsp:getProperty property="rentPrice" name="car"/></td>
      </tr>
      <tr>
         <td>Car Buy Price</td>
         <td><jsp:getProperty property="buyPrice" name="car"/></td>
      </tr>
   </table>
</div>
<p align="center">
   <a href="ProcessCustomer.jsp">Back to Home Page!</a>
</p>
</body>
</html>