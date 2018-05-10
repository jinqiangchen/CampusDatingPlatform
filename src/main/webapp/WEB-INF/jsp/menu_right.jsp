<%--
  Created by IntelliJ IDEA.
  User: 陈进强
  Date: 2018/5/8
  Time: 15:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="../static/css/fileupload.css">
</head>
<body>
<div class="message_main_div">
    <form action="../upload/uploadDynamic" method="post" enctype="multipart/form-data">
        <table><div>
            <tr><textarea  id="text" cols="70" rows="10" name="message"></textarea></tr>
            <hr class="hr14">
            <tr><td href="javascript:;" class="file">添加图片
                <input type="file" name="file1" id="" accept=".jpg,.png,.tif,.rgb,.dib,.eps,.jpe,.pcx,.bmp,.gif">
                </a> </td>
                <td><input type="submit" class="btn-style-03" value="发表" /></td></tr>
            </hr class="hr14">
        </div>
        </table>
        <c:forEach var="dy" items="${dynamicList}">
            <table>
                <tr><td>发布日期：<fmt:formatDate value="${dy.createTime}" pattern="yyyy-MM-dd"/></td>
                    &nbsp;<td>发布人：${dy.publisherId}</td></tr>
                <tr>动态内容：${dy.text}</tr>
            </table>
        </c:forEach>

    </form>
</div>
</body>
</html>
