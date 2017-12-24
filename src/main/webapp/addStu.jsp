<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/11/1
  Time: 10:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>index</title>
</head>
<body>
    <h2>添加学生</h2>
    <div style="font-size: 18px">
        <c:if test="${param.rtype==1}">
            <p style="color:green;">添加学生成功!</p>
        </c:if>
        <c:if test="${param.rtype==-1}">
            <p style="color:red;">添加学生失败!</p>
        </c:if>
        <c:if test="${param.rtype==-2}">
            <p style="color:red;">请填写完整学生信息!</p>
        </c:if>
    </div>
    <form action="${pageContext.request.contextPath}/stuAction/addStu" method="post">
        学生姓名:<input name="sname"><br/>
        学生年龄:<input name="sage"><br/>
        学生性别:<input type="radio" name="ssex" value="男" checked>男
                 <input type="radio" name="ssex" value="女">女<br/>
        学生爱好:<input name="shobby" type="checkbox" value="体育">体育
                 <input name="shobby" type="checkbox" value="阅读">阅读
                 <input name="shobby" type="checkbox" value="睡觉">睡觉<br/>
                 <input type="submit" value="添加学生">
    </form>
    <a href="${pageContext.request.contextPath}/Main.jsp">查看学生列表</a>
</body>
</html>
