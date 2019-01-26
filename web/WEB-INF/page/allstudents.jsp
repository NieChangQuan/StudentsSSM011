<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/1/19/019
  Time: 1:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

</head>
<body>
    <table border="2px" cellspacing="0px">
        <tr>
            <td>ID</td>
            <td>Name</td>
            <td>Password</td>
            <td>Age</td>
            <td>CreateTime</td>
            <td>Lesson</td>
            <td>Delete</td>
            <td>Edit</td>
        </tr>
        <c:forEach items="${requestScope.stus}" var="stu">
            <tr>
                <td>${stu.id}</td>
                <td>${stu.name}</td>
                <td>${stu.password}</td>
                <td>${stu.age}</td>
                <td><fmt:formatDate value="${stu.createTime}" pattern="yyyy-MM-dd"></fmt:formatDate> </td>
                <td>${stu.course.name}</td>
                <td><a class="delete" href="${pageContext.request.contextPath}/student/deleteStudent?id=${stu.id}">delete</a></td>
                <td><a href="${pageContext.request.contextPath}/student/input?id=${stu.id}">edit</a></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
