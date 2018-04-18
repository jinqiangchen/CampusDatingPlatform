<%--
  Created by IntelliJ IDEA.
  User: 陈进强
  Date: 2018/4/8
  Time: 11:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>注册界面</title>
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
                    注册
                </div>
                <form id="form1"action="register/registerIn" method="post">

                    <div class="form_text_ipt">
                        <input name="username" id="username" type="text" placeholder="账号">
                    </div>
                    <div class="ececk_warning"><span>账号名称不能为空</span></div>
                    <div class="form_text_ipt">
                        <input name="password" id="password" type="password" placeholder="密码">
                    </div>
                    <div class="ececk_warning"><span>密码不能为空</span></div>
                    <div class="form_text_ipt">
                        <input name="repassword" id="repassword"type="password" placeholder="重复密码">
                    </div>
                    <div class="ececk_warning"><span>密码不能为空</span></div>
                    <div class="form_text_ipt">
                        <input name="nickname" type="text" placeholder="昵称">
                    </div>
                    <div class="ececk_warning"><span>昵称不能为空</span></div>
                    <div class="form_text_ipt">
                        <input name="realname" type="text" placeholder="真实姓名">
                    </div>
                    <div class="ececk_warning"><span>真实姓名不能为空</span></div>
                    <div class="form_text_ipt">
                        <input name="age" type="text" placeholder="年龄">
                    </div>
                    <div class="ececk_warning"><span>年龄不能为空</span></div>
                    <div style="text-align: center">
                        <select name="sex"  class="form_text_ipt" >
                            <option value="男" selected="selected">男</option>
                            <option value="女" >女</option>
                        </select>
                    </div>
                    <div class="form_text_ipt">
                        <input name="email" type="email" placeholder="邮箱">
                    </div>
                    <div class="ececk_warning"><span>邮箱不能为空</span></div>
                    <div class="form_text_ipt">
                        <input name="birthday" type="date" placeholder="生日">
                    </div>
                    <div class="ececk_warning"><span>生日不能为空</span></div>
                    <div class="form_text_ipt">
                        <input name="hobby" type="text" placeholder="爱好">

                    </div><div class="ececk_warning"><span>爱好不能为空</span></div>
                    <div class="form_text_ipt">
                        <input name="phone" type="tel" placeholder="电话">
                    </div>
                    <div class="ececk_warning"><span>电话不能为空</span></div>

                    <div class="form_btn">
                        <button type="button" onclick="myCheck()"  >注册</button>
                    </div>
                    <div class="form_reg_btn">
                        <span>已有帐号？</span><a href="login.jsp">马上登录</a>
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
function myCheck() {
    if($("input[name='username']").val()==""){
        alert("账号不能为空！")
        return;
    }
    if($("input[name='password']").val()==""){
        alert("密码不能为空！")
        return;
    }
    if($("input[name='repassword']").val()==""){
        alert("重复密码不能为空！")
        return;
    }
    if($("input[name='nickname']").val()==""){
        alert("昵称不能为空！")
        return;
    }
    if($("input[name='realname']").val()==""){
        alert("真实姓名不能为空！")
        return;
    }
    if($("input[name='hobby']").val()==""){
        alert("爱好不能为空！")
        return;
    }

    var returnAge;
    function getAge() {
        var birth=$("input[name='birthday']").val().split("-");
        var birthYear=birth[0];
        var birthMonth=birth[1];
        var birthDay=birth[2];
        d=new Date();
        var ThisYear=d.getFullYear();
        var nowMonth = d.getMonth() + 1;
        var nowDay = d.getDate();
        if(ThisYear == birthYear){
            returnAge = 0;//同年 则为0岁
        }
        else{
            var ageDiff = ThisYear - birthYear ; //年之差
            if(ageDiff > 0){
                if(nowMonth == birthMonth) {
                    var dayDiff = nowDay - birthDay;//日之差
                    if(dayDiff < 0)
                    {
                        returnAge = ageDiff - 1;
                    }
                    else
                    {
                        returnAge = ageDiff ;
                    }
                }
                else
                {
                    var monthDiff = nowMonth - birthMonth;//月之差
                    if(monthDiff < 0)
                    {
                        returnAge = ageDiff - 1;
                    }
                    else
                    {
                        returnAge = ageDiff ;
                    }
                }
            }
            else
            {
                returnAge = -1;//返回-1 表示出生日期输入错误 晚于今天
            }
        }
        return returnAge;//返回周岁年龄
    }
        var age=$("input[name='age']").val();
    if(age==""){
        alert("年龄不能为空！")
    }
        else if(age!=getAge()){
            alert("年龄和生日不匹配！")
            return;
        }
    function checkEmail(obj){
        var reg = new RegExp("^[a-z0-9]+([._\\-]*[a-z0-9])*@([a-z0-9]+[-a-z0-9]*[a-z0-9]+.){1,63}[a-z0-9]+$"); //正则表达式
        if(obj === ""){ //输入不能为空
            alert("邮箱不能为空!");
            return ;
        }else if(!reg.test(obj)){ //正则验证不通过，格式不对
            alert("邮箱验证不通过!");
            return ;
        }else{
            return true;
        }
    }
    var email = $("input[name='email']").val(); //要验证的对象
    checkEmail(email);
    function isPhone(num) {
        var myreg=/^[1][3,4,5,7,8][0-9]{9}$/;
        if (!myreg.test(num)) {
            return ;
        } else {
            return true;
        }
    }
     var phone=$("input[name='phone']").val();
    if(phone==""){
        alert("电话不能为空！")
        return;
    }else{isPhone(phone);}
      $("#form1").submit();
}
</script>
</html>
