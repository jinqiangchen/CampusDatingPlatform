<%--
  Created by IntelliJ IDEA.
  User: 陈进强
  Date: 2018/4/18
  Time: 15:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>Header</title>
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="../static/css/common.css" />
</head>
<body>
<div class="login_wrap1">
    <ul class="nav nav-tabs" style="text-align: center;">
        <li>
            <a href="menu"><i class="glyphicon glyphicon-home"></i> 主页</a>
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
            <a class="dropdown-toggle" data-toggle="dropdown">
                <i class="glyphicon glyphicon-cog"></i>设置
                <span class="caret"></span>
            </a>
            <ul class="dropdown-menu">
                <li><a href="setQuestion" onclick="check();return false">设置密保问题</a> </li>
                <li><a href="updatePwd" onclick="myconfirm();return false">修改密码</a> </li>
            </ul>
        </li>
        <li style="float: right;font-family: '微软雅黑';font-size:large;">欢迎来到${account} 的空间!
            <img src="../static/images/logo_bg1.jpg" width="40px" height="40px" class="img-circle">
        </li>
        <li style="float: right;">
            <input type="text" class="form-control" placeholder="通过账号查找好友">
        </li>
    </ul>
</div>
</body>
<script type="text/javascript">
    function check() {
        var account=${account};
        var data={};
        data.account=account;
        $.ajax({
            type : 'post',
            data : data,
            url: '<%=request.getContextPath()%>/set/confirmQuestion',
            cache: false,
            sync: true,
            success: function (result) {
                if (result.status == 200) {
                    //表示未设密保问题
                    if (result.data == 0) {
                        window.location.href="setQuestion";
                        return true;
                    }
                    if(result.data==1){
                        var r=confirm("已设密保问题，是否确认修改？")
                        if(r==true){
                            window.location.href="setQuestion";
                            return true;}
                        else{
                            return false;
                        }
                    }

                }
            }
        });
    }
    function myconfirm() {
        if( r=confirm("确认修改密码？")){
            window.
        }
    }
</script>
</html>
