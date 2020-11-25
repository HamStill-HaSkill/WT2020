<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="rus">
<head>
    <title>World of Warcraft</title>
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
                                <a href="index.html" class="menu-href">
                                    <img src="img/logo4.png" class="logo" alt="Главная страница">
                                </a>
                            </div>

                            <div class="box">
                                <a href="shop.html" class="menu-href" id="shop">
                                    <span>МАГАЗИН</span>
                                </a>
                            </div>
            
                            <div class="box">
                                <a href="news.php" class="menu-href" id="news">
                                    <span>НОВОСТИ</span>
                                </a>
                            </div>
                            <div class="box">
                                <a href="info.php" class="menu-href" id="info">
                                    <span>ИНФО</span>
                                </a>
                            </div>
                            <div class="box">
                                <a href="mailing.php" class="menu-href" id="mail">
                                    <span>ПОЧТА</span>
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
        <iframe width="700" height="400" src="https://www.youtube.com/embed/s4gBChg6AII" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
    </div>
    <div class="main-text">
        <article>
            <h1>World Of Warcraft</h1>
            Игра которую вы заслужили!<br>
            Cразитесь с древним богом Н'Зотом и его приспешниками в новом рейде с 12 боссами — Ни’алоте, Пробуждающемся Городе.
            Встретьтесь с противниками лицом к лицу на аренах и полях боя и испытайте свое мастерство в сложных подземельях,
            открытых с помощью эпохальных ключей, чтобы получить восхитительные награды!
        </article>
        <div class="main-btn">
            <div class="btn">
                <button onclick="document.location='pay.html'">Купить</button>
            </div>
            <div class="btn">
                <button onclick="document.location='detail.html'">Подробнее</button>
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