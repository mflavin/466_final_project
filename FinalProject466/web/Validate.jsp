<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.regex.*" %>
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
<title>Validate</title>
</head>
<body>
<h1>User info</h1>
<jsp:useBean id="regUser" class="Model.User" scope="session"/>
<% 
    String reg1 = "[a-zA-Z_0-9]+@[a-zA-Z_0-9]+\\.[a-zA-Z_0-9]{2,3}";
    String reg2 = "[a-zA-Z]{2}";
    Pattern p1 = Pattern.compile(reg1);
    Matcher m1 = p1.matcher(regUser.getEmail());
    Pattern p2 = Pattern.compile(reg2);
    Matcher m2 = p2.matcher(regUser.getState());

    if(regUser.getId().length()>=4&&regUser.getId().length()<=50&&regUser.getPassword().length()>=5&&regUser.getFname().length()>=2&&regUser.getLname().length()>=2&&m1.matches()&&regUser.getEmail().length()>=7
            &&regUser.getStreetaddress().length()>=4&&regUser.getStreetaddress().length()<=50&&regUser.getCity().length()>=3&&
            regUser.getCity().length()<=50&&m2.matches()){
        request.getRequestDispatcher("UserLogin.jsp").forward(request, response);
    }else{
        response.sendRedirect("RegistrationFailure.jsp");
    }
%>
</body>
</html>