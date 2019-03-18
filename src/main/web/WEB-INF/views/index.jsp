<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/";
%>
<html>
  <head>
    <title>启动页</title>
  </head>
  <body>
    启动成功, <a href="<%=basePath%>hello">点击进入</a>
  </body>
</html>
