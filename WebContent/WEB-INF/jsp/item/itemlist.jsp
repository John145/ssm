<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" cellpadding="20" cellspacing="0">
		<tr>
			<td>id</td>
			<td>name</td>
			<td>price</td>
			<td>count</td>
			<td>update</td>
		</tr>
		<c:forEach items="${items }" var="item">
			<tr>
				<td>${item.id }</td>
				<td>${item.name }</td>
				<td>${item.price }</td>
				<td>${item.count }</td>
				<td>
					<a href="${pageContext.request.contextPath }/item/findByPrimaryKey.action?id=${item.id}">修改</a>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>