<%--
  Created by IntelliJ IDEA.
  com.jaelyn.bean.User: Jaelyn
  Date: 11/10/2016
  Time: 15:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Loginformtest</title>
</head>
<body>
<s:form action="user1">
    <s:textfield name="user" label="输入用户名+,+密码识别"></s:textfield>
    <s:submit value="提交"></s:submit>
</s:form>
</body>
</html>
