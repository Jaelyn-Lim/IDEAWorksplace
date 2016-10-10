<%--
  Created by IntelliJ IDEA.
  User: Jaelyn
  Date: 09/10/2016
  Time: 18:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>欢迎页面</title>
</head>
<body>
<s:property value="tip"></s:property>
用户名：<s:property value="user.name"></s:property>
密码：<s:property value="user.pass"></s:property>
年龄：<s:property value="user.age"></s:property>
生日：<s:property value="user.birth"></s:property>
</body>
</html>
