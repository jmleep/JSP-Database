<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">

<html>
<head>
    <title>Murach's Java Servlets and JSP</title>
</head>

<script language="JavaScript">

</script>

<body>

<h1>Update User</h1>

<form action="addUserServlet" method="post">
<table cellspacing="5" border="0">
    <tr>
        <td align="right">Image Path:</td>
        <td><input type="text" name="imagePath" 
                value="${user.imagePath}">
        </td>
    </tr>
    <tr>
        <td align="right">First name:</td>
        <td><input type="text" name="firstName" 
                value="${user.firstName}">
        </td>
    </tr>
    <tr>
        <td align="right">Last name:</td>
        <td><input type="text" name="lastName" 
                value="${user.lastName}">
        </td>
    </tr>
    <tr>
        <td align="right">Email address:</td>
        <td><input type="text" name="emailAddress" value="${user.emailAddress}"></td>
    </tr>
    <tr>
        <td align="right">Expertise:</td>
        <td><input type="text" name="expertise" value="${user.expertise}"></td>
    </tr>
    <tr>
        <td align="right">Schedule:</td>
        <td><input type="text" name="schedule" value="${user.schedule}"></td>
    </tr>
    <tr>
        <td></td>
        <td><input type="submit" value="Submit"></td>
    </tr>
</table>
</form>

</body>
</html>