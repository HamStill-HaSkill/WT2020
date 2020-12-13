<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="rus">
<head>
    <title>PayPalka</title>
    <meta charset="utf-8">
    <link rel="shortcut icon" href="img/logo.jpg" type="image/x-icon">
    <link rel="stylesheet" href="css/stylesheet.css">
</head>
<div id="base-head">
        <header>
                <div class="header-bg">
                    <div class="semi-layer">
                        <div class="menu">
                            <div class="box2">
                                <a href="Welcome" class="menu-href">
                                    <img src="img/logo4.png" class="logo" alt="Главная страница">
                                </a>
                            </div>

                            <div class="box">
                                <a href="Register" class="menu-href" id="info">
                                    <span>РЕГИСТРАЦИЯ</span>
                                </a>
                            </div>
                            <div class="box">
                                <a href="Login	" class="menu-href" id="mail">
                                    <span>ВХОД</span>
                                </a>
                            </div>
                        </div>
                    </div>
                </div>
            </header>
</div>
<body>

<div class="main">
    <div class="video">
        <iframe width="700" height="400" src="https://www.youtube.com/embed/7vaAHN9wF7g" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
    </div>
    <div class="main-text">
        <article>
            <h1>PayPalka - Удобный онлайн сервис для управления кредитными картами</h1>
            <br>
            Предлагаем воспользоваться всеми выгодными преимуществами, которые предоставляют современные кредитные карточки. 
            Это больше чем удобный инструмент для совершения покупок в розничных торговых точках и оплаты услуг. 
            В современной реальности кредитная карточка позволяет быстро получить кредит даже при 
            недостаточности денежных средств на банковском счете (услуга овердрафт).
        </article>
        <div class="main-btn">
            <div class="btn">
                <button onclick="document.location='Register'">Регистация</button>
            </div>
        </div>
    </div>

</div>
<div id="base-footer">
        <footer>
                <p class="main-text" align="center" id="shop-footer">У нас нет прав 2000-2020. Платформы: PC, PS5, Xbox 365</p>
        </footer>
</div>

</body>
</html>