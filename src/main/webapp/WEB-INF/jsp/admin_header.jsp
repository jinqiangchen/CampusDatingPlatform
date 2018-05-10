<%--
  Created by IntelliJ IDEA.
  User: 陈进强
  Date: 2018/5/8
  Time: 12:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="../static/css/common.css" />
</head>
<body>
<div class="login_wrap1" style="width: 100%; height: 40px; position: fixed; top: 0;opacity:0.75;">
    <ul class="nav nav-tabs" style="text-align: center;">
        <li>
            <a href="admin_menu"><i class="glyphicon glyphicon-home"></i> 管理员主页</a>
        </li>
        <li>
            <a href="aboutme"><i class="glyphicon glyphicon-user"></i>关于我</a>
        </li>
        <li>
            <a href="myphoto"><i class="glyphicon glyphicon-camera"></i>我的相册 </a>
        </li>
        <li>
            <a href="myvideo"><i class="glyphicon glyphicon-facetime-video"></i>我的视频 </a>
        </li>
        <li>
            <a href="myfriends"><i class="glyphicon glyphicon-comment"></i>我的好友</a>
        </li>
        <li style="float: right;">
            <a href="logout">
                <i class="glyphicon glyphicon-off"></i>退出</a>

        </li>
        <li style="float: right;">
            <a class="dropdown-toggle" data-toggle="dropdown" >
                <i class="glyphicon glyphicon-cog"></i>设置
                <span class="caret"></span>
            </a>
            <ul class="dropdown-menu" >
                <li ><a href="setQuestion" onclick="check();return false">设置密保问题</a> </li>
                <li><a href="updatePwd" onclick="myconfirm();return false">修改密码</a> </li>
            </ul>
        </li>
        <li style="float: right;font-family: '微软雅黑';font-size:large;">欢迎来到${account} 的空间!
            <img src="../static/images/logo_bg1.jpg" width="40px" height="40px" class="img-circle">
        </li>
        <li style="float: right;">
            <div class="box">
                <label for="q" id="q_label" >查找好友</label>
                <input id="q"  type="text" onkeypress="if(event.keyCode==13){btn.click();return false;}" >
                <input id="btn" type="button" onclick="mySearch()" hidden="hidden">
                <i class="glyphicon glyphicon-search" id="q_i"></i>
            </div>
        </li>
    </ul>
</div>
</body>
</html>
