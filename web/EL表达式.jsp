<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <jsp:useBean id="emp" class = "com.yx.pojo.Students" scope = "session"></jsp:useBean>
  学号：${sessionScope.emp.s_id}
  姓名：${sessionScope.emp.s_name}
  </body>
</html>