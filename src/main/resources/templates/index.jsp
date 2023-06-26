<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<link rel="stylesheet" href="style_main.css">
<!--<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org/">---------------Пока пусть так будет-->
  
 <head>
   <title>DOKBANK</title>
   <meta charset="utf-8">
     <div class="header">
<a href="main.html"><img src="logo.png" width="300" height="75" style="border-radius:3%;">
  <div class="header-right">
    <a class="menu" href="#home"><h3>Главная</h3></a>
    <a class="menu"href="#contact"><h3>Запасная вкладка</h3></a>
    <a class="menu" href="#about"><h3>Запасная вкладки 2</h3></a>
  </div>
</div>
</head> 
<body>
		<center>
			<div style="otstup">
				<form action="ввод в дб.php" method="post"><!--Вот туда должны данные отправляться.... -->
						<div class="container" >
							<h1>Авторизация</h1>
							<p>* Внимания логин и пароль можно получить у системного администратора!</p>
							<hr>
							<label for="login"><b>Логин</b></label>
							<input type="text" placeholder="* Введите Логин" name="login" required>

							<label for="psw"><b>Пароль</b></label>
							<input type="password" placeholder="* Введите Пароль" name="psw" required>

							<label for="psw-repeat"><b>Повторите Пароль</b></label>
							<input type="password" placeholder="Повторите Пароль" name="psw-repeat" required>
							<hr>
							<button type="submit" class="registerbtn">Вход</button>
							
							<p style="text-align: center;">У вас нет аккаунт? <a href="#">Отправить запрос на создание администранору</a>.</p>
					  </div>
				</form>
			</div>
		</center>
</body>