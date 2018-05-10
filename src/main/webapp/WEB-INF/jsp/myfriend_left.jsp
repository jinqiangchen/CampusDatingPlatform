<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 陈进强
  Date: 2018/5/8
  Time: 12:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
    <div style="text-align: center">
        <h3>我的好友</h3></div>
    <div style="text-align: center">
        <table align="center" style="width:50%;border-collapse:separate; border-spacing:0px 10px;">
            <c:forEach var="friend" items="${friendList}">
                <tr>
                    <td>
                        <img src="../static/images/logo_bg1.jpg" width="40px" height="40px" class="img-circle">
                    </td>
                    <td><a href="">${friend.friendId}</a>&nbsp;&nbsp;&nbsp;</td>

                    <td><button  id="${friend.friendId}" type="button" onclick="chat(this)" >聊天</button></td>
                </tr>
            </c:forEach>
        </table>
    </div>

</body>
<script type="text/javascript">
    function chat(obj) {
        $("#talkTo").append("<li id='tb_id' class='normaltab' >"+obj.id+"</li>");
        $("#chat").show();
    }
</script>
</html>
