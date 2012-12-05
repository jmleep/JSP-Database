<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">

<html>
<head>
    <title>Murach's Java Servlets and JSP</title>
</head>

<script language="JavaScript">
function validate(form) {
    if (form.userName.value=="") {
        alert("Please fill in your username");
        form.userName.focus();
    }
    else if (form.password.value=="") {
        alert("Please fill in your password");
        form.password.focus();
    }
    else {
        form.submit();
    }
}
</script>

<body>

<h1>Update User</h1>

<form action="adminLogin" method="post">
<table cellspacing="5" border="0">
    <tr>
        <td align="right">Username:</td>
        <td><input type="text" name="userName" 
                value="${admin.userName}">
        </td>
    </tr>
    <tr>
        <td align="right">Password:</td>
        <td><input type="text" name="password" 
                value="${admin.password}">
        </td>
    </tr>
    <tr>
        <td></td>
        <td><input type="button" value="Submit" 
                   onClick="validate(this.form)"></td>
    </tr>
</table>
</form>

</body>
</html>