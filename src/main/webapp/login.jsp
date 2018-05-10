<%--
  Created by IntelliJ IDEA.
  User: 陈进强
  Date: 2018/4/8
  Time: 10:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>登录界面</title>
    <link rel="stylesheet" href="static/css/reset.css" />
    <link rel="stylesheet" href="static/css/common.css" />
    <link rel="stylesheet" href="static/css/font-awesome.min.css" />

</head>
<body>
<div class="wrap login_wrap">
    <div class="content">
        <div class="logo"></div>
        <div class="login_box">

            <div class="login_form">
                <div class="login_title">
                    登录
                </div>
                <form id="formlogin" action="login/menu" method="post" >
                    <div class="form_text_ipt" >
                        <input name="username" id="username" type="text" placeholder="账号">
                    </div>
                    <div class="ececk_warning"><span>账号不能为空</span></div>
                    <div class="form_text_ipt">
                        <input name="password" id="password" type="password" placeholder="密码" onkeypress="if(event.keyCode==13){btnValidate.click();return false;}">
                    </div>
                    <div class="ececk_warning"><span>密码不能为空</span></div>

                    <div class="form_check_ipt">
                        <div class="left check_left">
                            <label><input name="rememberMe" id="rememberMe" type="checkbox">记住密码</label>
                        </div>
                        <div class="right check_right">
                            <a href="login/backpwd">忘记密码？</a>
                        </div>
                    </div>
                    <div class="form_btn">
                        <button id="btnValidate" type="button" onclick="mylogin()">登录</button>
                    </div>
                    <div class="form_reg_btn">
                        <span>还没有帐号？</span><a href="register.jsp">马上注册</a>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>
<script type="text/javascript" src="static/js/jquery.min.js" ></script>
<script type="text/javascript" src="static/js/common.js" ></script>
<script type="text/javascript" src="static/js/jquery.cookie.js"></script>
<script>
    $(document).ready(function () {
        if ($.cookie("rmbUser") == "true") {
            $("#rememberMe").attr("checked", true);
            $("#username").val($.cookie("username"));
            $("#password").val($.cookie("password"));
        }
    });
</script>
</body>

<script type="text/javascript"  >
    function mylogin() {
        var userId = $("#username").val();
        var password = $("#password").val();
        if ("" == userId || undefined == userId) {
            alert("账号不能为空");
            return;
        }
        if ("" == password || undefined == password) {
            alert("密码不能为空");
            return;
        }
        if ($("#rememberMe").prop("checked")) {
            $.cookie("rmbUser", "true", { expires: 7 }); //存储一个带7天期限的cookie
            $.cookie("username", userId, { expires: 7 });
            $.cookie("password", password, { expires: 7 });
        }
        else {
            $.cookie("rmbUser", "false", { expire: -1 });
            $.cookie("username", "", { expires: -1 });
            $.cookie("password", "", { expires: -1 });
        }
        var data = {};
        data.loginAccount = userId;
        data.loginPwd = password;
        $.ajax({
            type : 'post',
            url:'login/loginCheck',
            data : data,
            cache : false,
            sync : true,
            success : function(result) {
                //alert(result);
                //console.log(result)
                if(result.status==200){
                    if(result.data=="1"){
                        $("#formlogin").submit();
                    }else if(result.data=="0"){
                        alert("用户名或者密码不正确");
                        return ;
                    }else if(result.data=="2"){
                        window.location.href="login/superAdmin";
                    return;}
                    else if(result.data=="3"){
                        window.location.href="login/admin";
                    return;}
                }
            },
            error : function() {
                alert("请求失败!");
            }
        });
    }

</script>
</html>
