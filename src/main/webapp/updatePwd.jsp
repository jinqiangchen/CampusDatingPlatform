<%--
  Created by IntelliJ IDEA.
  User: 陈进强
  Date: 2018/4/17
  Time: 14:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>修改密码</title>
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
                    修改密码
                </div>
                <form id="pwdUpdate" action="update/toLogin" method="post" >
                    <div class="form_text_ipt">
                        <input name="loginPwd" id="loginPwd" type="password" placeholder="密码">
                    </div>
                    <div class="ececk_warning"><span>密码不能为空</span></div>
                    <div class="form_text_ipt">
                        <input name="password" id="repassword" type="password" placeholder="重复密码">
                    </div>
                    <div class="ececk_warning"><span>密码不能为空</span></div>

                    <div class="form_btn">
                        <button type="button" onclick="myUpdate()">修改</button>
                    </div>
                    <div class="form_reg_btn">
                        <span>请牢记密码！</span>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>
<script type="text/javascript" src="static/js/jquery.min.js" ></script>
<script type="text/javascript" src="static/js/common.js" ></script>
</body>
<script type="text/javascript">
    function myUpdate() {
        var pwd1=$("#loginPwd").val();
        var pwd2=$("#repassword").val();
        if ("" == pwd1 || undefined == pwd1) {
            alert("密码不能为空");
            return;
        }
        if ("" == pwd2 || undefined == pwd2) {
            alert("密码不能为空");
            return;
        }
             if(pwd1!==pwd2){
                 alert("密码不一致，请重新填写！")
                 return;
             }
    var text=confirm("确认修改密码？")
        if(text==true){
            $("#pwdUpdate").submit();
        }
        else{
        return;
        }
    }
</script>
</html>
