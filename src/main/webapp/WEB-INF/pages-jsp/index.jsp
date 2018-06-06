<%--
  Created by IntelliJ IDEA.
  User: open
  Date: 2018-06-06
  Time: 오후 5:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.logging.Logger" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>[JSTL Debug] System.out.println</title>
</head>
<body>

<c:set var="title" value="catsSoft" />
<h1>debug: <c:out value="${title}"/></h1>
<%
     System.out.println(pageContext.findAttribute("title"));
%>

</body>
</html>
