<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>


<html lang="rus">
<head>
    <title>PayPalka Пополнение карты</title>
    <meta charset="utf-8">
    <link rel="shortcut icon" href="/img/logo2.png" type="image/png">
    <link rel="stylesheet" href="css/stylesheet.css">
    <header>
    <meta charset="utf-8">
    <div class="header-bg">
        <div class="semi-layer">
            <div class="menu">
                <div class="box2">
                    <a href="Welcome" class="menu-href">
                        <img src="img/logo4.png" class="logo" alt="Главная страница">
                    </a>
                </div>
                <div class="box">
                    <a href="CardAdd" class="menu-href" id="shop">
                        <span>ДОБАВИТЬ КАРТУ</span>
                    </a>
                </div>

                <div class="box">
                    <a href="Exit" class="menu-href" id="news">
                        <span>ВЫХОД</span>
                    </a>
                </div>
            </div>
        </div>
    </div>
</header>
</head>
<body>
<div class="pay-main">
        <aside class="pay-bar">
            <form name="test" action="AddMoney" method="post">
                 <p class="pay-font"><b>Номер карты:</b><br>
                  	<input type="text" name="card_num" size="40" id="field" autocomplete="off" type="text" minlength=1 maxlength=255 value=>
                  	<p class="pay-font"><b>Сумма пополнения:</b><br>
                    <input type="text" name="add_money" size="40" id="field" autocomplete="off" type="text" minlength=1 maxlength=255>
                </p>
            ${data}<br>
            <button type="submit" name="submit" class="pay-btn">Пополнить</button>
            <button onclick="document.location='Welcome'" class="cancel-btn">Отмена</button>
            </form>
            <div class="btn">
                
            </div>
        </aside>

    <div class="gif">
        <img src="img/pay.gif"  width="533" height="400" alt="ХЗ">
    </div>
</div>
    <footer>
        <p class="main-text" align="center">У нас нет прав 2000-2020. Платформы: PC, PS5, Xbox 365</p>
    </footer>
</body>
</html>