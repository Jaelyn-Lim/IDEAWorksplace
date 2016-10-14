<%--
  Created by IntelliJ IDEA.
  com.jaelyn.bean.User: Jaelyn
  Date: 06/10/2016
  Time: 20:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>TagTest01</title>
</head>
<body>

<s:form>
    <s:textfield label="姓名" name="name"></s:textfield>

</s:form>
<table border="1" width="300">
<s:iterator value="{'java','c++','c#','c','go','php','python','javascript'}" var="book">

<tr <s:if test="#java">style="background-color: brown" </s:if>>
<td><s:property></s:property></td>
</tr>

</s:iterator>
</table>
</body>
</html>
