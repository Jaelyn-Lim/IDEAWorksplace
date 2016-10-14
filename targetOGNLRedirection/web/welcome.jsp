<%--
  Created by IntelliJ IDEA.
  com.jaelyn.bean.User: Jaelyn
  Date: 10/10/2016
  Time: 15:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>welcome</title>
</head>
<body>
用户名：<s:property value="user.name"></s:property>
密码：<s:property value="user.pass"></s:property>
<s:property value="tip"></s:property>
这是welcome的页面
</body>
</html>
