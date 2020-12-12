<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>


<html lang="rus">
<head>
    <title>PayPalka Добавление карты</title>
    <meta charset="utf-8">
    <link rel="import" href="template.php">
    <link rel="shortcut icon" href="/img/logo2.png" type="image/png">
    <link rel="stylesheet" href="css/stylesheet.css">
</head>
<body>
<script>
            var link = document.querySelector('link[rel=import]');
            var content = link.import.querySelector('#base-head');
            document.body.appendChild(content.cloneNode(true));
</script>
<div class="pay-main">
        <aside class="pay-bar">
            <form name="test" method="post">
                <p class="pay-font"><b>Выберите способ оплаты:</b><Br>
                    <input type="radio" name="money" value="visa"> Visa<Br>
                    <input type="radio" name="money" value="ms"> Master Card<Br>
                    <input type="radio" name="money" value="coin"> Чеканной монетой<Br>
                </p>
                <p class="pay-font"><b>Номер карты:</b><br>
                    <input type="text" size="40" id="field">
                </p>
                <p class="pay-font">Адрес<Br>
                    <textarea name="adr" cols="40" rows="3" class="text-area"></textarea></p>
                <p class="rule">
                <input type="checkbox">&nbsp;&nbsp;Я ознакомился и принимаю условия следующих документов:
                Лицензионное соглашение с конечным пользователем (Blizzard) и Условия продажи, а также соглашаетесь
                на немедленное выполнение вашего заказа. Как только выполнение заказа начинается, вы теряете право отменить его.
            </p>
            </form>
            <div class="btn">
                <button onclick="document.location='index.html'" class="pay-btn">Оплатить</button>
                <button onclick="document.location='index.html'" class="cancel-btn">Отмена</button>
            </div>
        </aside>

    <div class="gif">
        <img src="img/pay.gif"  width="533" height="400" alt="ХЗ">
    </div>
</div>
<script>
        var content = link.import.querySelector('#base-footer');
        document.body.appendChild(content.cloneNode(true));
</script>
</body>
</html>