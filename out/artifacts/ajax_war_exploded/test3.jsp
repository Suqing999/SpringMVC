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
        function a(){
            $.ajax({
                url:"${pageContext.request.contextPath}/a3",
                data:{
                    "name":$("#name").val()
                },
                success:function (data) {
                    if(data.toString()==="ok"){
                        $("#userInfo").css("color","blue");
                    }else{
                        $("#userInfo").css("color","red");
                    }

                    $("#userInfo").html(data);
                }
            })
        }
    </script>
</head>
<body>
    <input type="text" id="name" onblur="a()"> <span id="userInfo"></span>
</body>
</html>
