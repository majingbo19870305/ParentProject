<%--
  Created by IntelliJ IDEA.
  User: IOTEK
  Date: 2019/1/16
  Time: 10:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="/web/js/jquery-3.2.1.min.js"></script>
    <script type="text/javascript">
        $(function () {
            $("#btn").click(function () {
                $.ajax({
                    url:"http://127.0.0.1:8081/controller/test.action",
                    type:"post",
                    success:function (res) {
                        alert("success");
                    },
                    error:function (res) {
                        alert("error");
                    }
                });
            });

            $("#register").click(function () {
                var name = $("#username").val();
                var password = $("#password").val();
                var age = $("#age").val();
                var sex = $("#sex").val();

                $.ajax({
                    url:"http://127.0.0.1:8081/controller/register.action",
                    type:"post",
                    data:{"username":name,"password":password,"age":age,"sex":sex},
                    success:function (res) {
                        alert(res);
                    },
                    error:function (res) {
                        alert("error");
                    }
                });

            });

        });
    </script>
</head>
<body>
    <button id="btn">Controller连接测试</button><br/>
    用户名：<input type="text" name="username" id="username"/><br/>
    密码：<input type="text" name="password" id="password"/><br/>
    年龄：<input type="text" name="age" id="age"/><br/>
    性别：<input type="text" name="sex" id="sex"/><br/>
    <input type="button" value="注册" id="register"/>
</body>
</html>
