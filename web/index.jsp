<%--
  Created by IntelliJ IDEA.
  User: 22641
  Date: 2024/3/7
  Time: 16:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" errorPage="WEB-INF/error/error.jsp" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    爱好：  看书
    <input type="checkbox" name="userHobby" id="checkbox" value="Read"/>
    <label for="checkbox"></label>
    打球
    <input type="checkbox" name="userHobby" id="checkbox2" value="Playball" />
    <label for="checkbox2"></label>
    唱歌
    <input type="checkbox" name="userHobby" id="checkbox3" value="Sing"/>
    <label for="checkbox3"></label>
    <br />
    <button onclick="test()"></button>
  </body>
</html>
