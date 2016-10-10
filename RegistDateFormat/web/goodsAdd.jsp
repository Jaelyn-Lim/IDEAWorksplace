<%--
  Created by IntelliJ IDEA.
  User: Jaelyn
  Date: 09/10/2016
  Time: 19:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>添加商品页面测试</title>
</head>
<body>
<s:form action="addGoods">
    <s:textfield name="goods.name" label="名称"></s:textfield>
    <s:textfield name="goods.num" label="数量"></s:textfield>
    <s:textfield name="goods.price" label="价格"></s:textfield>
    <s:submit value="提交"></s:submit>
</s:form>
</body>
</html>
