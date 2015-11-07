<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
    <head>
        <title>Spittr</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
    </head>
    <body>
        <h1>Welcome to Spittr</h1>
        <a href="<c:url value="/spittles" />">Spittles</a> |
        <a href="<c:url value="/spitter/register" />">Register</a>
    </body>
</html>