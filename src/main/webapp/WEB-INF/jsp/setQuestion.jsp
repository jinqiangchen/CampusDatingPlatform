<%--
  Created by IntelliJ IDEA.
  User: 陈进强
  Date: 2018/4/17
  Time: 13:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>设置密保问题</title>
    <link rel="stylesheet" href="../static/css/reset.css" />
    <link rel="stylesheet" href="../static/css/common.css" />
    <link rel="stylesheet" href="../static/css/font-awesome.min.css" />
</head>
<body>
<div class="wrap login_wrap">
    <div class="content">
        <div class="logo"></div>
        <div class="login_box">
            <div class="login_form">
                <div class="login_title">
                    设置密保问题
                </div>
                <form id="form_setquestion" action="set/setQuestion" method="post">

                    <div style="text-align: center">
                        <select name="question1"id="question1"  class="form_text_ipt" >
                            <option value="你父亲的生日？" selected="selected">你父亲的生日？</option>
                            <option value="你母亲的生日？" >你母亲的生日？</option>
                            <option value="你父亲的名字？">你父亲的名字？</option>
                            <option value="你童年最好的朋友是？">你童年最好的朋友是？</option>
                            <option value="你母亲的名字？">你母亲的名字？</option>
                        </select>
                    </div>
                    <div class="form_text_ipt">
                        <input name="answer1" id="answer1" type="date" placeholder="答案一">
                    </div><div class="ececk_warning"><span>答案不能为空</span></div>
                    <div style="text-align: center">
                        <select name="question2" id="question2" class="form_text_ipt" >
                            <option value="你父亲的生日？" selected="selected">你父亲的生日？</option>
                            <option value="你母亲的生日？" >你母亲的生日？</option>
                            <option value="你父亲的名字？">你父亲的名字？</option>
                            <option value="你童年最好的朋友是？">你童年最好的朋友是？</option>
                            <option value="你母亲的名字？">你母亲的名字？</option>
                        </select>
                    </div>
                    <div class="form_text_ipt">
                        <input name="answer2" id="answer" type="text" placeholder="答案二">
                    </div><div class="ececk_warning"><span>答案不能为空</span></div>
                    <div style="text-align: center">
                        <select name="question3" id="question3" class="form_text_ipt" >
                            <option value="你父亲的生日？" selected="selected">你父亲的生日？</option>
                            <option value="你母亲的生日？" >你母亲的生日？</option>
                            <option value="你父亲的名字？">你父亲的名字？</option>
                            <option value="你童年最好的朋友是？">你童年最好的朋友是？</option>
                            <option value="你母亲的名字？">你母亲的名字？</option>
                        </select>
                    </div>
                    <div class="form_text_ipt">
                        <input name="answer3" id="answer3" type="text" placeholder="答案三">
                    </div><div class="ececk_warning"><span>答案不能为空</span></div>
                    <div class="form_btn">
                        <button type="button" onclick="mysub()">提交</button>
                    </div>

                </form>

            </div>
        </div>
    </div>
</div>
<script type="text/javascript" src="../static/js/jquery.min.js" ></script>
<script type="text/javascript" src="../static/js/common.js" ></script>
</body>
<script type="text/javascript">
    function mysub() {
       $("#form_setquestion").submit();
    }
</script>

</html>
