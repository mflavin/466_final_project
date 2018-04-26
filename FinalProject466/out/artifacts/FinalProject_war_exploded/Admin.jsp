<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>AdminPage</title>
    <style>
        body {
            background: url("car4.jpg") no-repeat center center fixed;
            background-size: 70% 70%;
        }
        .grid-container {
            display: grid;
            grid-template-columns: auto auto auto;
            padding: 10px;
        }
        .grid-item {
            border: 1px solid;
            padding: 10px;
            margin-bottom: 120px;
            text-align: center;
        }
    </style>
</head>
<body>
<h2 align="center">Welcome Admin User!</h2>
<div class="grid-container">
    <form name="Addcar" action="AddCar" method="post">
        <table class="grid-item" align="center">
            <h3 align="center">Add a car to the list here!</h3>
            <tr>
                <td>Car ID</td>
                <td><input type="text" name="carid" value=""></td>
            </tr>
            <tr>
                <td>Car Name</td>
                <td><input type="text" name="carname" value=""></td>
            </tr>
            <tr>
                <td>Car type</td>
                <td><input type="text" name="cartype" value=""></td>
            </tr>
            <tr>
                <td>Buy Price</td>
                <td><input type="text" name="buyprice" value=""></td>
            </tr>
            <tr>
                <td>Rent Price</td>
                <td><input type="text" name="rentprice" value=""></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="Add"></td>
            </tr>
        </table>
    </form>

    <form name="Addcarpart" action="AddCarPart" method="post">
        <table class="grid-item" align="center">
            <h3 align="center">Add a car part to the list here!</h3>
            <tr>
                <td>Part ID</td>
                <td><input type="text" name="partid" value=""></td>
            </tr>
            <tr>
                <td>Part Name</td>
                <td><input type="text" name="partname" value=""></td>
            </tr>
            <tr>
                <td>Part Type</td>
                <td><input type="text" name="parttype" value=""></td>
            </tr>
            <tr>
                <td>Part Price</td>
                <td><input type="text" name="partbuyprice" value=""></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="Add"></td>
            </tr>
        </table>
    </form>

    <form name="Deletecar" action="DeleteCar" method="post">
        <table class="grid-item" align="center">
            <h3 align="center">Delete a car by entering its ID here!</h3>
            <tr>
                <td>Delete Car By Id</td>
                <td><input type="text" name="deletecar" value=""></td>
                <td colspan="2" align="center"><input type="submit" value="Delete"></td>
            </tr>
        </table>
    </form>

    <form name="Deletepart" action="DeleteCarPart" method="post">
        <table class="grid-item" align="center">
            <h3 align="center">Delete a car part by entering its ID here!</h3>
            <tr>
                <td>Delete Car Part By Id</td>
                <td><input type="text" name="deletepart" value=""></td>
                <td colspan="2" align="center"><input type="submit" value="Delete"></td>
            </tr>
        </table>
    </form>

    <form name="Deleteuser" action="DeleteCustomerServlet" method="post">
        <table class="grid-item" align="center">
            <h3 align="center">Delete a user by entering their ID here!</h3>
            <tr>
                <td>Delete User By Id</td>
                <td><input type="text" name="deleteuser" value=""></td>
                <td colspan="2" align="center"><input type="submit" value="Delete"></td>
            </tr>
        </table>
    </form>

    <div class="grid-item">
        <h3 align="center">Show all signed up users here!</h3>
        <p align="center">
            <button id="all"><a href="AllUsers.jsp">ShowAllUsers</a></button>
        </p>
    </div>
</div>

<p align="center" style="font-size: 22px;"><a href="UserLogin.jsp">Logout!</a></p>

</body>
</html>

