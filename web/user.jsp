
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <forEach var = "user" items = "#{userlist}" varStatus = "status">
      <table>
        <tr>
          <td>${user.user_id}</td>
          <td>${user.user_name}</td>
          <td>${user.password}</td>
          <td>${user.user_phone}</td>
          <td>${user.user_email}</td>
          <td>${user.user_sex}</td>
        </tr>
      </table>
  </forEach>
  </body>



</html>
