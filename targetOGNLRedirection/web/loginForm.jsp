<%--
  Created by IntelliJ IDEA.
  com.jaelyn.bean.User: Jaelyn
  Date: 10/10/2016
  Time: 15:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>LoginForm</title>
</head>
<body>
这里是表单提交页面：<br>
<s:form action="myaction">
    <s:textfield name="target" label="跳转的页面" id="target"></s:textfield>
    <s:submit value="提交"></s:submit>
</s:form>
</body>
</html>
