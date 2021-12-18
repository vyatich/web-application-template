<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Пользователи</title>
</head>
<body>
<div>
    <nav>
        <a href="/">Главная</a>
        <a href="/user/">Люди</a>
        <a href="/animal/">Животные</a>
    </nav>
</div>
<table>
    <#list userShortInfo as userInfo>
        <thead>
        <th>ID</th>
        <th>NAME</th>
        </thead>
        <tr>
            <td>${userInfo.id}</td>
            <td>${userInfo.name}</td>
        </tr>
    </#list>
</table>
<img src="/images/1.png">
</body>
</html>