<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="js/jquery-1.8.2.min.js"></script>
<link href="css/css.css" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>
<form action="list" method="post">
价格范围：<input type="text" name="pricestart">-<input type="text" name="priceend">
已售百分比：<input type="text" name="salesstart">-<input type="text" name="salesend">%
排序：
<input type="submit" value="查询">
</form>
<table>
<tr>
<td>选择</td>
<td>ID</td>
<td>商品名称</td>
<td>秒杀价格</td>
<td>已售百分比</td>
<td>操作</td>
</tr>
<c:forEach items="${list }" var="g">
<tr>
<td><input type="checkbox" value="${g.gid }"></td>
<td>${g.gid }</td>
<td>${g.gname }</td>
<td>${g.price }</td>
<td>${g.sales }</td>
<td>操作</td>
</tr>
</c:forEach>
</table>
<a href="?pageNum=1">首页</a>
<a href="?pageNum=${page.pageNum-1 }">上一页</a>
<a href="?pageNum=${page.pageNum+1 }">下一页</a>
<a href="?pageNum=${page.pages }">末页</a>
共${page.pages }页
</body>
</html>