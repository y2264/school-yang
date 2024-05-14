<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>用户查询</title>
    <!-- 导入自定义的CSS文件 -->
    <link href="CSS/main.css" rel="stylesheet">
</head>
<body>
<!-- 查询条件的开始 -->
<hr>
<form action="" method="post">
    用户姓名：<input type="search" name="userName"/>
    用户性别：
    <select name="userSex">
        <option value="n">不限</option>
        <option value="x">男</option>
        <option value="y">女</option>
    </select>
    <button type="submit">查询</button>
</form>
<hr>
<!-- 查询条件的结束 -->
<!-- 查询结果的开始 -->
<table>
    <thead>
    <tr>
        <th>序号</th>
        <th>用户编号</th>
        <th>用户姓名</th>
        <th>用户手机</th>
        <th>用户邮箱</th>
        <th>用户性别</th>
        <th>操作</th>
    </tr>
    </thead>
</table>
<!-- 查询结果的结束 -->
</body>
</html>