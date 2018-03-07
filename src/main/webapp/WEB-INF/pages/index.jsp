<%--
  Created by IntelliJ IDEA.
  User: open
  Date: 2018-03-01
  Time: 오후 3:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-qeuiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-qeuiv="X-UA-Compatible" content="IE=edge,chrome=1" />

    <link rel="stylesheet" type="text/css" href="/resources/css/alopex-ui-dark.css" />

    <script type="text/javascript" src="/resources/script/jquery-3.3.1.js"></script>
    <script type="text/javascript" src="/resources/script/alopex-ui.min.js"></script>

    <script type="text/javascript" src="/resources/script/pages/index.js"></script>

    <!-- FileUpload, MultiSelect, Splitter 컴포넌트 사용 시 -->
    <!--
    <link rel="stylesheet" type="text/css" href="/resources/css/src/alopex-ext.css" />

    <script type="text/javascript" src="/resources/script/src/alopex-ext.min.js" />
    <script type="text/javascript" src="/resources/script/src/alopex-ext-setup.js" />
    -->

    <!-- WebEditor 컴포넌트 사용 시 -->
    <!--
    <link rel="stylesheet" type="text/css" href="/resources/script/src/webeditor/alopex-webeditor.css"/>

    <script type="text/javascript" src="/resources/script/src/webeditor/alopex-webeditor.min.js" />
    <script type="text/javascript" src="/resources/script/src/webeditor/alopex-webeditor-setup.js" />
    -->
    <title>AlopexUI_Beginner</title>
</head>
<body>
    <from>
        <label>
            <input id="name" class="Textinput" data-validation-rule="{required: true}" data-validation-message="{required: '이름을 입력해주세요.'}">
            <input id="next" class="Button" value="조회">
        </label>
    </from>
</body>
<script>
    $a.page(function () {
        this.init = function () {
            return "init";
        };
        console.log(this.init());

        var button = function (self) {
            if (self !== null && self !== undefined) {
                console.log($(self)[0].innerHTML);
            }
        };

        $("#button1").click(function () {
            button(this);
        });

        $("#button2").click(function () {
            button(this);
        });

        $("#button3").click(function () {
            button(this);
        });
    })
</script>
</html>
