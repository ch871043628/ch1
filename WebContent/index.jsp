<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<form action="findAll" method="post">
	<table>
		<tr>
			<td>
				账号：
			</td>
			<td>
				<input type="text" name="userinfo.uname">
			</td>
		</tr>
		<tr>
			<td>
				密码：
			</td>
			<td>
				<input type="password" name="userinfo.upwd">
			</td>
		</tr>
		<tr>
			<td>
				<input type="submit" value="登陆">
			</td>
			<td>
				<a href="zc.jsp">注册</a>
			</td>
		</tr>
	</table>
</form>
</body>
</html>