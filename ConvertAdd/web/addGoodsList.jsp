<%--
  Created by IntelliJ IDEA.
  com.jaelyn.bean.User: Jaelyn
  Date: 08/10/2016
  Time: 00:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>addGoodsList</title>
</head>
<body>
<table>
    <s:form id="goodsForm" action="addGoodsList" theme="simple">
        <table>
            <tr>
                <td>商品名称</td>
                <td>价格</td>
                <td>数量</td>
                <td>日期</td>
            </tr>
            <s:iterator value="new int[4]" status="m">
                <tr>
                    <td><s:textfield name="%{'goodsList['+#m.index +'].product'}"></s:textfield> </td>
                    <td><s:textfield name="%{'goodsList['+#m.index +'].bid'}"></s:textfield> </td>
                    <td><s:textfield name="%{'goodsList['+#m.index +'].mount'}"></s:textfield> </td>
                    <td><s:textfield name="%{'goodsList['+#m.index +'].date'}"></s:textfield> </td>
                </tr>
            </s:iterator>
            <tr>
                <td colspan="4"><s:submit value="提交"></s:submit> </td>
            </tr>
        </table>
    </s:form>
</table>
</body>
</html>
