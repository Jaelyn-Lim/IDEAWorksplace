<%--
  Created by IntelliJ IDEA.
  com.jaelyn.bean.User: Jaelyn
  Date: 08/10/2016
  Time: 00:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>addGoods</title>
</head>
<body>

<table>
    <s:form id="GoodsForm" action="addGoods">
        <s:textfield name="goods.product" label="商品名称"></s:textfield>
        <s:textfield name="goods.bid" label="价格"></s:textfield>
        <s:textfield name="goods.mount" label="数量"></s:textfield>
        <s:textfield name="goods.date" label="日期"></s:textfield>
        <s:submit value="提交"></s:submit>
    </s:form>
</table>

</body>
</html>
