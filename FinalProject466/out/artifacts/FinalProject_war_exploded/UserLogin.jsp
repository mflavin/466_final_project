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
    </style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Login</title>
</head>
<body>
<h2 align="center">User Login</h2>
<form action="LoginServlet" method="post">
     <table align="center">
     <tr>
        <td>Email:</td>
        <td><input type="text" name="email2"/></td>
     </tr>
     <tr>
        <td>Password:</td>
        <td><input type="password" name="password2"/></td>
     </tr>
     <tr>
      <td colspan="2" align="center"><input type="submit" value="Submit"></td>
     </tr>
     </table>
</form>

<div align="center" style="padding-top: 30px;">
    <p>New to the site?</p>
    <p>Sign Up Here!</p>
    <a href="Registration.jsp">Sign Up!</a>
</div>
</body>
</html>