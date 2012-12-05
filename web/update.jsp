<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">

<html>
<head>
    <title>Update User</title>
</head>

<script language="JavaScript">

</script>

<body>

<h1>Update User</h1>
<% String emailAddress = request.getParameter("emailAddress"); %>

<form action="updateUser" method="post">
  <select name="selected">
    <option value="imagePath">Image Path</option>
    <option value="firstName">First Name</option>
    <option value="lastName">Last Name</option>
    <option value="emailAddress">Email Address</option>
    <option value="expertise">Expertise</option>
    <option value="schedule">Schedule</option>
  </select>
<table cellspacing="5" border="0">
    <tr>
        <td align="right">Update:</td>
        <td><input type="text" name="update" 
                value="">
        </td>
    </tr>
    <tr>
        <td></td>
         <% request.setAttribute("emailAddress", emailAddress); %>
        <td><input type="submit" value="Submit"></td>
    </tr>
</table>
</form>

</body>
</html>