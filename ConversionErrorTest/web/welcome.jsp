<%--
  Created by IntelliJ IDEA.
  User: Jaelyn
  Date: 13/10/2016
  Time: 18:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>welcome</title>
</head>
<body>
<h1>这里显示结果页面:</h1>
<h2><s:property value="tip"></s:property> </h2>
<table>
    <tr>
        <td>x轴坐标</td>
        <td><s:property value="point.x"></s:property> </td>
    </tr>
    <tr>
        <td>y轴坐标</td>
        <td><s:property value="point.y"></s:property> </td>
    </tr>
</table>
</body>
</html>
