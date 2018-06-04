<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>Spring Boot Sample</title>
</head>

<body>
Time: ${time}
<br>
Message: ${message}


<img alt="读取默认配置中的图片" src="${pageContext.request.contextPath }/a.jpg">
<br/>
<img alt="读取自定义配置myres中的图片" src="${pageContext.request.contextPath }/myres/qq/bb.jpg">


</body>

<script type="text/javascript" src="${pageContext.request.contextPath }/webjarslocator/jquery/jquery.js"></script>
<%--<script type="text/javascript" src="${pageContext.request.contextPath }/js/common.js?v=1.0.1"></script>--%>
<script type="text/javascript" src="${pageContext.request.contextPath }${urls.getForLookupPath('/js/common.js') }"></script>

</html>