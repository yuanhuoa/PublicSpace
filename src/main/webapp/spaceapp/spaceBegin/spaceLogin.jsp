<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html ng-app="personal.space.login">
<head>
<title>登录--个人空间</title>
	<script type="text/javascript" src="libs/jquery-3.2.1/jquery-3.2.1.min.js"></script>
	<script type="text/javascript" src="libs/bootstrap-3.3.5/js/bootstrap.js"></script>
	<script type="text/javascript" src="libs/angular/angular1.6.5.min.js"></script>
	<link src="libs/bootstrap-3.3.5/css/bootstrap.css">
</head>
<body>
	<div ng-controller="loginController" class="container">
		<div>
			<space-login data-login="login"></space-login>
		</div>
	</div>
</body>
</html>
	<script type="text/javascript" src="controller/spaceLoginController.js"></script>
	<script type="text/javascript" src="directive/spaceLoginDirective.js"></script>