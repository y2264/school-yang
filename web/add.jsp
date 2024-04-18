<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>注册新用户</title>
</head>
<body>
<hr>
<h4>新用户信息</h4>
<hr>
<form action="add" method="post">
    <table>
        <tr>
            <td>用户姓名：</td>
            <td>
                <input type="text" name="userName" required="required" autofocus="autofocus">
            </td>
        </tr>
        <tr>
            <td>用户密码：</td>
            <td>
                <input type="password" name="userPassword" required="required">
            </td>
        </tr>
        <tr>
            <td>用户手机：</td>
            <td>
                <input type="text" name="userPhone" required="required" maxlength="11">
            </td>
        </tr>
        <tr>
            <td>用户邮箱：</td>
            <td>
                <input type="email" name="userEmail" required="required">
            </td>
        </tr>
        <tr>
            <td>用户性别：</td>
            <td>
                <input type="radio" name="userSex" value="x" checked="checked">男
                <input type="radio" name="userSex" value="y">女
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <button type="submit">注册</button>
                <button type="reset">重置</button>
            </td>
        </tr>
    </table>
</form>
<hr>
查看Session常用的方法

</body>
</html>