<%--
  Created by IntelliJ IDEA.
  User: rbxmos523
  Date: 11/5/2015
  Time: 5:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!-- Latest compiled and minified CSS -->

<html>
<head>
    <title>Spittr</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
</head>
<body>
<h1>Register</h1>

<form method="POST">
    First Name: <input type="text" name="firstName"/><br/>
    Last Name: <input type="text" name="lastName"/><br/>
    Username: <input type="text" name="username"/><br/>
    Password: <input type="password" name="password"/><br/>
    <input type="submit" value="Register" class="btn btn-primary"/>
</form>
</body>
</html>