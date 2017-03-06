<%--
  Created by IntelliJ IDEA.
  User: alicana
  Date: 06/03/2017
  Time: 14:40
  To change this template use File | Settings | File Templates.
--%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Goal</title>
</head>
<body>

<form:form commandName="goal">

    <table>
        <tr>
            <td>Enter Minutes:</td>
            <td><form:input path="minutes"/></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Enter Goal Minutes"/>
            </td>
        </tr>
    </table>

</form:form>

</body>
</html>
