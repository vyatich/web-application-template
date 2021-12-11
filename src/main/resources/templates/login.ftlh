<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Пользователи</title>
</head>
<body style="background: aqua;">
    <form method="post" role="form">
        <div class="form-group" style="text-align: center">
            <label for="login" style="font-family: Mistral;font-size: 50px;color: white">Логин</label>
            <input type="text" name="login" class="form-control" id="login" placeholder="Login" required>
        </div>
        <div class="form-group" style="text-align: center">
            <label for="password" style="font-family: Mistral;font-size: 50px;color: white">Пароль</label>
            <input type="password" name="password" class="form-control" id="password" placeholder="Password" required>
        </div>
        <div class="form-group" style="text-align: center; margin-top: 100px">
            <button type="submit" class="btn btn-default" style="width: 70%">Войти</button>
        </div>
    </form>
</body>
</html>