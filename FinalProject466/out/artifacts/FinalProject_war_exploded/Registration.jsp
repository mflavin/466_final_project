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
<title>User Registration</title>
</head>
<body>
   <h2 align="center">User Registration</h2>
   <form name="Registration" action="UserServlet" method="post">
   <table align="center">
   <tr>
   <td>User ID</td>
   <td><input type="text" name="userid" value=""></td>
   </tr>
   <tr>
   <td>Password</td>
   <td><input type="password" name="password" value=""></td>
   </tr>
   <tr>
   <td>First Name</td>
   <td><input type="text" name="fname" value=""></td>
   </tr>
   <td>Last Name</td>
   <td><input type="text" name="lname" value=""></td>
   </tr>
   <tr>
   <td>Email</td>
   <td><input type="text" name="email" value=""></td>
   </tr>
    <tr>
   <td>Street Address</td>
   <td><input type="text" name="streetaddress" value=""></td>
   </tr>
    <tr>
   <td>City</td>
   <td><input type="text" name="city" value=""></td>
   </tr>
    <tr>
   <td>State</td>
   <td><select type="text" name="state">
      <option value="AL">Alabama</option>
      <option value="AK">Alaska</option>
      <option value="AZ">Arizona</option>
      <option value="AR">Arkansas</option>
      <option value="CA">California</option>
      <option value="CO">Colorado</option>
      <option value="CT">Connecticut</option>
      <option value="DE">Delaware</option>
      <option value="DC">District Of Columbia</option>
      <option value="FL">Florida</option>
      <option value="GA">Georgia</option>
      <option value="HI">Hawaii</option>
      <option value="ID">Idaho</option>
      <option value="IL">Illinois</option>
      <option value="IN">Indiana</option>
      <option value="IA">Iowa</option>
      <option value="KS">Kansas</option>
      <option value="KY">Kentucky</option>
      <option value="LA">Louisiana</option>
      <option value="ME">Maine</option>
      <option value="MD">Maryland</option>
      <option value="MA">Massachusetts</option>
      <option value="MI">Michigan</option>
      <option value="MN">Minnesota</option>
      <option value="MS">Mississippi</option>
      <option value="MO">Missouri</option>
      <option value="MT">Montana</option>
      <option value="NE">Nebraska</option>
      <option value="NV">Nevada</option>
      <option value="NH">New Hampshire</option>
      <option value="NJ">New Jersey</option>
      <option value="NM">New Mexico</option>
      <option value="NY">New York</option>
      <option value="NC">North Carolina</option>
      <option value="ND">North Dakota</option>
      <option value="OH">Ohio</option>
      <option value="OK">Oklahoma</option>
      <option value="OR">Oregon</option>
      <option value="PA">Pennsylvania</option>
      <option value="RI">Rhode Island</option>
      <option value="SC">South Carolina</option>
      <option value="SD">South Dakota</option>
      <option value="TN">Tennessee</option>
      <option value="TX">Texas</option>
      <option value="UT">Utah</option>
      <option value="VT">Vermont</option>
      <option value="VA">Virginia</option>
      <option value="WA">Washington</option>
      <option value="WV">West Virginia</option>
      <option value="WI">Wisconsin</option>
      <option value="WY">Wyoming</option>
   </select></td>
   </tr>
    <tr>
   <td colspan="2" align="center"><input type="submit" value="Registration"></td>
   </tr>
   </table>
   </form>
</body>
</html>