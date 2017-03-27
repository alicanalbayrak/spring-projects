<%--
  Created by IntelliJ IDEA.
  User: alicana
  Date: 27/03/2017
  Time: 16:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Fitness Tracker Custom Login Page</title>
    <style type="text/css">
        .errorblock {
            color: #ff0000;
            background-color: #ffEEEE;
            border: 3px solid #ff0000;
            padding: 8px;
            margin: 16px;
        }
    </style>
</head>

<body>

<h3>Fitness Tracker Custom Login Page</h3>
<c:if test="${param.error != null}">
    <div class="errorblock">
    Your login was unsuccesful. <br>
    Caused: ${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
    </div>
</c:if>
<c:url var="loginUrl" value="/login"/>

<form action="${loginUrl}" method="post">
    <p><label for="username">User:</label></p>
    <input type="text" id="username" name="username"/>

    <p><label for="password">Password:</label></p>
    <input type="password" id="password" name="password">

    <div>
        <input name="submit" type="submit"/>
    </div>
</form>

</body>
</html>
