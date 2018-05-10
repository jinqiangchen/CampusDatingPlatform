<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 陈进强
  Date: 2018/4/10
  Time: 13:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>我的视频</title>
</head>

<body>
<header><jsp:include page="header.jsp"></jsp:include></header>
<form action="../upload/uploadVideo" method="post" enctype="multipart/form-data">
<div align="center">
    <textarea id="text" name="note"cols="33" rows="5" placeholder="视频相关的记录"></textarea>
    <input type="file" name="video1" accept=".mp4,.mkv,.avi,.flv,.wmv">
    <input type="submit" value="上传视频"></div>
</form>
<div style="text-align: center">
    <table align="center">
        <c:forEach var="video" items="${videoList}">
            <tr>
                <td>
                    视频描述：${video.videoNote}
                </td>
                <td>
                    <video width="300px" height="300px" src=${video.videoUrl} controls="controls" />
                </td>
            </tr>
            <br>
        </c:forEach></table>
</div>
</body>

</html>

