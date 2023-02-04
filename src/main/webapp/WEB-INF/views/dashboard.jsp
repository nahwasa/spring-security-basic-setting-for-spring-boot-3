<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>로그인</title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
    <link href="https://getbootstrap.com/docs/4.0/examples/signin/signin.css" rel="stylesheet" crossorigin="anonymous">
</head>

<body>
<div class="container">
    <form class="form-signin" method="post" action="/login">
        <h3 class="form-signin-heading text-center mb-5">nahwasa.com</h3>
        <h3 class="overview-normalize">접속 아이디</h3>
        <p>
            ${loginId}
        </p>
        <hr/>
        <h3 class="overview-normalize">역할</h3>
        <p>
            ${loginRoles}
        </p>
        <form method="post" action="/logout">
            <button class="btn btn-sm btn-danger btn-block" type="submit">로그아웃</button>
        </form>
    </form>
</div>
</body>
</html>