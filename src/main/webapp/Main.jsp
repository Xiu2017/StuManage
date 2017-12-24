<%--
  Created by IntelliJ IDEA.
  User: Sukiy
  Date: 2017/12/22
  Time: 19:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
</head>
<body>
<h2>学生列表</h2>
    <table border="1" width="500" id="tab">
        <tr>
            <td>学生编号</td>
            <td>学生年龄</td>
            <td>学生爱好</td>
            <td>学生姓名</td>
            <td>学生性别</td>
            <td>操作</td>
        </tr>
    </table>
</body>
</html>
<script>
    //查询课程
    function loadData(){
        $("#tab tr:not(:first)").remove();
        $.get("stuAction/findStuList","",function (data) {
            $.each(data,function (i,v) {
                var tr="<tr>";
                tr+="<td>"+(i+1)+"</td>";
                tr+="<td>"+(v.sname)+"</td>";
                tr+="<td>"+(v.sage)+"</td>";
                tr+="<td>"+(v.ssex)+"</td>";
                tr+="<td>"+(v.shobby)+"</td>";
                tr+="<td><a href='${pageContext.request.contextPath}/stuAction/getStuById?sno="+(v.sno)+"'>修改学生</a></td>";
                tr+="</tr>";
                $("#tab").append(tr);
            });
        });
    }
    window.onload=loadData;
</script>
