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
        <a href="/animal/">Студенты</a>
    </nav>
</div>
<table>
    <#list animals as animal>
        <thead>
            <th>ID</th>
            <th>NAME</th>
            <th>GROUP</th>
        </thead>
        <tr>
            <td>${animal.id}</td>
            <td>${animal.name}</td>
            <td>
                <#if animal.group??>
                    ${animal.group.name}
                </#if>
            </td>
        </tr>
    </#list>
</table>
<img src="/images/1.png">
</body>
</html>