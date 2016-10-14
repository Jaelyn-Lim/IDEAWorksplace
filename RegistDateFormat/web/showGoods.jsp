<%--
  Created by IntelliJ IDEA.
  com.jaelyn.bean.User: Jaelyn
  Date: 09/10/2016
  Time: 19:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>展示商品页面</title>
</head>
<body>
<h3><s:property value="msg"></s:property> </h3>
名称：<s:property value="goods.name"></s:property>
数量：<s:property value="goods.num"></s:property>
价格：<s:property value="goods.price"></s:property>
时间：<s:property value="goods.date"></s:property>
</body>
</html>
