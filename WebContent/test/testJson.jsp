<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="https://code.jquery.com/jquery.js"></script>
<title>Insert title here</title>
<script type="text/javascript">
	$(document).ready(function(){
		$('#div1').click(function(){
			$.ajax({
				type:"post",
				url:"${pageContext.request.contextPath}/requestJson.action",
				contentType:"application/json;charset=utf-8",
				data:'{"username":"qjq","password":"123456","address":"南昌"}',
				success:function(data){
					console.log(data);
				}
			});
		});
		$('#div2').click(function(){
			$.ajax({
				type:"post",
				url:"${pageContext.request.contextPath}/responseJson.action",
				data:{username:"qjq",password:"123456",address:"南昌"},
				success:function(data){
					console.log(data);
				}
			});
		});
	});
</script>
</head>
<body>
	<h3>JSON交互测试</h3>
	<div id="div1">请求key/value，响应JSON</div>
	
	<div id="div2">请求JSON，响应JSON</div>
</body>
</html>