<%@ page import="com.yx.pojo.User" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>

    <style type="text/css" rel="stylesheet">
      table, th, tr, td{
        border: bisque 2px solid;
      }
    </style>

  </head>
  <body>
  <table>
    <tr>
      <td>id</td>
      <td>account</td>
      <td>password</td>
      <td>phone</td>
      <td>email</td>
      <td>sex</td>
    </tr>
    <% for (:
            ) {
  
}
    
    <tr>
      <td>${requestScope.user_list.user_id}</td>
      <td>${requestScope.user_list.user_account}</td>
      <td>${requestScope.user_list.user_password}</td>
      <td>${requestScope.user_list.user_phone}</td>
      <td>${requestScope.user_list.user_email}</td>
      <td>${requestScope.user_list.user_sex}</td>
    </tr>
  </table>
  </body>



</html>
