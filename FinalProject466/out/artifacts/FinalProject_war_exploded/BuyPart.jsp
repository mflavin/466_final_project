<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Buy/Rent Car Part</title>
</head>
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
<jsp:useBean id="part" class="Model.CarPart" scope="session"/>
<h2 align="center">Buy a Car Part!</h2>
<h3 align="center">Search by Part Name or Part Type!</h3>
<form name="Addcar" action="BuyCarPartServlet" method="post">
    <table align="center">
        <tr>
            <td>Part Name</td>
            <td><input type="text" name="partname" value=""></td>
        </tr>
        <tr>
            <td>Part Type</td>
            <td><input type="text" name="parttype" value=""></td>
        </tr>
            <td colspan="2" align="center"><input type="submit" value="Search Parts"></td>
        </tr>
    </table>
</form>

<div class="grid-container">
    <table class="grid-item" align="center">
        <tr>
            <td>Part Name</td>
            <td><jsp:getProperty property="name" name="part"/></td>
        </tr>
        <tr>
            <td>Part Type</td>
            <td><jsp:getProperty property="type" name="part"/></td>
        </tr>
        <tr>
            <td>Part Price</td>
            <td><jsp:getProperty property="buyPrice" name="part"/></td>
        </tr>
    </table>
</div>

<p align="center">
    <a href="ProcessCustomer.jsp">Back to Home Page!</a>
</p>
</body>
</body>
</html>
