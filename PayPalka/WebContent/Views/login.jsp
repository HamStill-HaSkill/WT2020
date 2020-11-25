<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="rus">
<head>
    <title>PayPalka Вход</title>
    <meta charset="utf-8">
    <link rel="shortcut icon" href="/img/logo2.png" type="image/png">
    <link rel="stylesheet" href="css/stylesheet.css">
</head>
<body>
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
                                <a href="shop.html" class="menu-href" id="shop">
                                    <span>Вход</span>
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
                                <a href="Login	" class="menu-href" id="mail">
                                    <span>ВХОД</span>
                                </a>
                            </div>
                        </div>
                    </div>
                </div>
            </header>
</div>
</body>

<div class="pay-main">
        <aside class="pay-bar">
            <form name="test" action="Login" method="post">
                <p class="log-font">Логин:${data}<br>
                <input name="login" autocomplete="off" type="text" required pattern="[a-zA-Z0-9]+" minlength=4 maxlength=255 class="log-edit"></p>
                <p class="log-font">Пароль:<Br>
                <input name="password" autocomplete="off" type="password" required pattern="[a-zA-Z0-9]+" minlength=6 maxlength=255 class="log-edit"></p>
                <button type="submit" name="submit" class="pay-btn">Войти</button>
                <button onclick="document.location='Register'" class="cancel-btn">Регистрация</button>
            </form>
        </aside>
</div>
<div id="base-footer">
        <footer>
                <p class="main-text" align="center" id="shop-footer">У нас нет прав 2000-2020. Платформы: PC, PS5, Xbox 365</p>
        </footer>
</div>
</body>
</html>