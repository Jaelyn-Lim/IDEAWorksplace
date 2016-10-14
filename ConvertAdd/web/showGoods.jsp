<%--
  Created by IntelliJ IDEA.
  com.jaelyn.bean.User: Jaelyn
  Date: 08/10/2016
  Time: 00:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>showGoods</title>
</head>
<body>
<h2>商品信息</h2>
商品名称：<s:property value="goods.product"></s:property>
价格：<s:property value="goods.bid"></s:property>
购买数量：<s:property value="goods.mount"></s:property>
购买日期：<s:property value="goods.date"></s:property>
</body>
</html>
