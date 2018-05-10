<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 陈进强
  Date: 2018/5/3
  Time: 17:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<header><jsp:include page="header.jsp"></jsp:include></header>
<div style="text-align: center">
<h3>搜索结果</h3></div>
<div style="margin: 20px">
<table align="center" style="width: 50%;border-collapse:separate; border-spacing:0px 10px;">

<c:forEach var="us" items="${userList}">
        <tr>
            <td>账号:<a href="">${us.userAccount}</a>&nbsp;&nbsp;&nbsp;</td>
            <td>昵称:${us.userNickname}&nbsp;&nbsp;&nbsp;</td>
            <td>年龄:${us.userAge}&nbsp;&nbsp;&nbsp;&nbsp;</td>
            <td>性别:${us.userSex}&nbsp;&nbsp;&nbsp;&nbsp;</td>
            <td><button  id="${us.userAccount}" type="button" onclick="myadd(this)" >添加好友</button></td>
        </tr>
</c:forEach>
</table></div>
</body>
<script type="text/javascript">
    function myadd(obj) {
        var account=obj.id;
        var data={};
        data.userAccount=account;
        $.ajax({
            type : 'post',
            url:'../friends/addFriends',
            data : data,
            cache : false,
            sync : true,
            success : function(result) {

                if(result.status==200){
                    if(result.data=="0"){
                        window.location.href="myfriends";
                        return;
                    }else if(result.data=="1"){
                        alert("已是好友，不要重复添加！");
                        window.location.href="myfriends";
                        return ;
                    }
                    else if(result.data=="2"){
                    alert("不可自己添加自己");
                    window.location.href="myfriends";
                    return ;
                }}
            },
            error : function() {
                alert("请求失败!");
            }
        });

    }

</script>
</html>
