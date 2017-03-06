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

    <style>
        .error {
            color: #ff0000;
        }

        .errorblock {
            color: #000;
            background-color: #ffeeee;
            border: 3px solid #ff0000;
            padding: 8px;
            margin: 16px;
        }

    </style>
</head>
<body>

<form:form commandName="goal">


    <%--asterisk means, any error will be displayed in here--%>
    <form:errors path="*" cssClass="errorblock" element="div">


    </form:errors>

    <table>
        <tr>
            <td>Enter Minutes:</td>
            <td><form:input path="minutes" cssErrorClass="error"/></td>
            <td><form:errors path="minutes" cssClass="error"/></td>
        </tr>
        <tr>
            <td colspan="3">
                <input type="submit" value="Enter Goal Minutes"/>
            </td>
        </tr>
    </table>

</form:form>

</body>
</html>
