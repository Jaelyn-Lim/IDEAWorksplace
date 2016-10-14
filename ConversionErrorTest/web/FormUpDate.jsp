<%--
  Created by IntelliJ IDEA.
  User: Jaelyn
  Date: 13/10/2016
  Time: 18:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Form</title>
</head>
<body>
<form action="pointaction" method="post">
    请输入坐标，用"，"隔开：<input type="text" name="point">
    <s:fielderror fieldName="point" theme="simple"></s:fielderror><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
