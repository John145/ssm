<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>编辑Item页面</h3>
	<form action="${pageContext.request.contextPath }/item/updateByPrimaryKey.action" method="post">
		<input type="hidden" name="id" value="${item.id }" />
		商品名称：<input name="name" type="text" value="${item.name }" /><br />
		商品价格：<input name="price" type="text" value="${item.price }" /><br />
		商品数量：<input name="count" type="text" value="${item.count }" /><br />
		<input type="submit" value="修改" />
	</form>
</body>
</html>