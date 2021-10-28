<%--
  Created by IntelliJ IDEA.
  User: suki
  Date: 2021/10/28
  Time: 13:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <script src="${pageContext.request.contextPath}/static/js/jquery-2.1.1.min.js"></script>

    <script>
      function a(){
        $.ajax({
          url:"${pageContext.request.contextPath}/a1",
          data:{
            "name":$("#username").val()
          },
          success:function (data) {
              alert(data);
          }
        })
      }
    </script>

  </head>
  <body>

    用户名  <input type="text" id="username" onblur="a()">

  </body>
</html>
