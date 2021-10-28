<%--
  Created by IntelliJ IDEA.
  User: suki
  Date: 2021/10/28
  Time: 14:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <script src="${pageContext.request.contextPath}/static/js/jquery-2.1.1.min.js"></script>

    <script>
        $(function () {
            $("#btn").click(function () {
                 $.post("${pageContext.request.contextPath}/a2",function (data) {
                    console.log(data);
                 })
            })
        });
    </script>
</head>
<body>
    <input type="button" value="加载数据" id="btn">
    <table>
        <tr>
            <td>姓名</td>
            <td>年龄</td>
            <td>性别</td>
        </tr>
        <tbody>
            <%--数据后台--%>
        </tbody>
    </table>
</body>
</html>
