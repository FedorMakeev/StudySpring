<%--
  Created by IntelliJ IDEA.
  User: rbxmos523
  Date: 11/5/2015
  Time: 3:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spittle single</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
</head>
<body>

<div class="spittleView">
    <div class="spittleMessage"><c:out value="${spittle.message}"/></div>
    <div>
        <span class="spittleTime"><c:out value="${spittle.time}"/></span>
    </div>
</div>
</body>
</html>
