<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/1/19/019
  Time: 1:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>添加页面</h1><br>
-------------------------------------<br>
    <form style="color: lightgray">
        姓&nbsp;&nbsp;名：<input type="text" name="name"><br><br>
        密&nbsp;&nbsp;码：<input type="text" name="password"><br><br>
        加入课程：
        <c:choose>
            <option>java</option>
            <option>javaee</option>
            <option>c</option>
        </c:choose><br>
        <h3>一个学员只能报一个课程</h3>

    </form>
</body>
</html>
