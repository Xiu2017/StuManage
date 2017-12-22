<%--
  Created by IntelliJ IDEA.
  User: LARK
  Date: 2017/12/22
  Time: 8:07
  To change this template use File | Settings | File Templates.

  该页面修改学生信息
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update Stu</title>
</head>
<body>
<h1>修改学生信息</h1>
<form action="${pageContext.request.contextPath}/stuAction/updateStu" method="post">
    <input type="hidden" name="sno" value="${stu.sno}" />
    学生姓名：<input type="text" name="sname" value="${stu.sname}" /><br />
    学生年龄：<input type="text" name="sage" value="${stu.sage}" /><br />
    学生性别：<input type="radio" name="ssex" value="男" checked />男
             <input type="radio" name="ssex" value="女" />女<br />
    学生爱好：<input type="checkbox" name="shobby" value="体育" />体育
             <input type="checkbox" name="shobby" value="睡觉" />睡觉
             <input type="checkbox" name="shobby" value="游戏" />游戏<br />
    <<input type="submit" value="确认修改" />
</form>
<script>
    var sex = document.getElementsByName("ssex");
    var hobby = document.getElementsByName("shobby");
    var stuSex = "${stu.ssex}";
    var stuHobby = "${stu.shobby}".replace(/\s/g,"").split(",");

    stuSex === "男" ? sex[0].checked = true : sex[1].checked = true;

    for(var i = 0; i < hobby.length; i ++){
        if(hobby[i].value == stuHobby[i].value){
            hobby[i].checked = true;
        }
    }
</script>
</body>
</html>
