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
    <form class="form-signin" method="post" action="/login-process">
        <p class="text-center">
            <img src="/images/nahwasa-profile.png" class="img-thumbnail" style="width: 200px;" alt="이 글이 보인다면 시큐리티 설정 잘못한거임!">
        </p>
        <h2 class="form-signin-heading text-center mb-5">nahwasa.com</h2>

        <p>
            <label for="username" class="sr-only">아이디</label>
            <input type="text" id="username" name="userid" class="form-control" placeholder="아이디" required="" autofocus="">
        </p>
        <p>
            <label for="password" class="sr-only">비밀번호</label>
            <input type="password" id="password" name="pw" class="form-control" placeholder="비밀번호" required="">
        </p>
        <button class="btn btn-lg btn-primary btn-block" type="submit" id="login_btn">로그인</button>
    </form>

    <form class="form-signin" method="get" action="/view/join">
        <button class="btn btn-lg btn-warning btn-block" type="submit">회원가입하기</button>
    </form>

    <script>
        const loginBtn = document.getElementById('login_btn');

        loginBtn.addEventListener('click', () => {
            sessionStorage.setItem('userid', document.getElementById('username').value);
        });
    </script>
</div>
</body>
</html>