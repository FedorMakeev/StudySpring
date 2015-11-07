<%--
  Created by IntelliJ IDEA.
  User: rbxmos523
  Date: 11/5/2015
  Time: 2:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Spittles</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
    </head>
    <body>
        <c:forEach items="${spittleList}" var="spittle">
            <li id="spittle_<c:out value="spittle.id"/>">
                <div class="spittleMessage">
                    <c:out value="${spittle.message}"/>
                </div>
                <div>
                    <span class="spittleTime"><c:out value="${spittle.time}"/></span>
                    <span class="spittleLocation">
                    (<c:out value="${spittle.latitude}"/>,
                    <c:out value="${spittle.longitude}"/>)
                    </span>
                </div>
            </li>
        </c:forEach>
    </body>
</html>
