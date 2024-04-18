<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>用户登录</title>
</head>
<body>
<form action="session" method="post">
    <table border="1">
        <tr>
            <td>用户编号</td>
            <td>
                <input type="text" name="userId" autofocus="autofocus" />
            </td>
        </tr>
        <tr>
            <td>用户密码</td>
            <td>
                <input type="password" name="userPassword" />
            </td>
        </tr>
        <tr>

            <td colspan="2">
                <button type="submit">登录</button>
                <button typr="reset">重置</button>
            </td>
        </tr>
    </table>

</form>
</body>
</html>