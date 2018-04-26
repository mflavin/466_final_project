<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>AllUsers</title>
    <style>
        body {
            background: url("car4.jpg") no-repeat center center fixed;
            background-size: 70% 70%;
        }
    </style>
</head>
<body>
<h1 align="center">All Users Currently Registered: </h1>
<jsp:useBean id="regUser" class="Model.User" scope="session" />
<table id="table1" align="center" width="400" cellpadding="10" cellspacing="0" border="1">
    <tr>
        <td>UserId</td>
        <td>
            <jsp:getProperty property="id" name="regUser" />
        </td>
    </tr>
    <tr>
        <td>Full Name</td>
        <td>
            <jsp:getProperty property="fname" name="regUser" />
            <jsp:getProperty property="lname" name="regUser" />
        </td>
    </tr>
</table>
<p align="center" style="font-size: 22px;"><a href="Admin.jsp">Back to Admin Page!</a></p>
<p align="center" style="font-size: 22px;"><a href="UserLogin.jsp">Logout!</a></p>
</body>
</html>