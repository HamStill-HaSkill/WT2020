<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="Models.CardModel"%>
<!DOCTYPE html>

<html lang="rus">
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
<head>
    <title>PayPalka Карты</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="shortcut icon" href="/img/logo2.png" type="image/png">
    <link rel="stylesheet" href="css/stylesheet.css">
</head>
<body>
    <div class="news-line">
        <% 
        	ArrayList<CardModel> cardList = (ArrayList<CardModel>)request.getAttribute("cards");
	        for(int i = 0; i < cardList.size(); i++)
	        {
	        %><div class="cards-block">
	        	<aside class="cards-bar">
		        	<div class="cards">
			            <img src="img/cards.png" alt="HS" height="200" width="220">
			            <p class="cards-text"><%= cardList.get(i).CardNum %><br><%= cardList.get(i).CardDate %> <%= cardList.get(i).CardUser %> <%= cardList.get(i).money %>$</p><br>
		            </div>
		            <button onclick="document.location='MinusMoney'" class="pay-btn">Перевод</button>
	                <button onclick="document.location='AddMoney'" class="topUP-btn">Пополнить</button>
	                <button onclick="document.location='Remove'" class="remove-btn">Удалить</button>
	            </aside>
	        </div>
	        <%} %>

        
    </div>

    <footer>
        <p class="main-text" align="center">У нас нет прав 2000-2020. Платформы: PC, PS5, Xbox 365</p>
    </footer>

</body>
</html>