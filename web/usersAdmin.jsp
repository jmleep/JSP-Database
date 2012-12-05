<%@page import="business.User"%>
<%@page import="java.util.ArrayList"%>
<!doctype html public "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
<head>
    <title>CIS Mentors</title>
</head>
<body>
 
<h1>Users List</h1>
<p><a href="user.jsp" method="post">Add New User</a>
<table cellpadding="5" border=1>

  <tr valign="bottom">
    <th>Image</th>
    <th>First Name</th>
    <th>Last Name</th>
    <th>Expertise</th>
    <th>Email Address</th>
    <th>Schedule</th>
  </tr>
 
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  <c:forEach var="user" items="${userList}">
  <tr valign="top">
    <td><p><img src="${user.imagePath}"></td>
    <td><p>${user.firstName}</td>
    <td><p>${user.lastName}</td>
    <td><p>${user.expertise}</td>
    <td><p>${user.emailAddress}</td>
    <td><p>${user.schedule}</td>
    <td><a href="update.jsp?emailAddress=${user.emailAddress}">Update</a></td>
    <td><a href="deleteUser?emailAddress=${user.emailAddress}">Delete</a></td>
  </tr>
  </c:forEach>
  
  
</table>
    
</body>
</html>