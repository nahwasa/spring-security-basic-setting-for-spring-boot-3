<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>회원가입</title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
    <link href="https://getbootstrap.com/docs/4.0/examples/signin/signin.css" rel="stylesheet" crossorigin="anonymous">
</head>

<body>
<div class="container">
    <form class="form-signin" id='join_form'>
        <h2 class="form-signin-heading text-center mb-5">회원가입!</h2>

        <p>
            <label for="username" class="sr-only">아이디</label>
            <input type="text" id="username" name="userid" class="form-control" placeholder="아이디" required="" autofocus="">
        </p>
        <p>
            <label for="password" class="sr-only">비밀번호</label>
            <input type="password" id="password" name="pw" class="form-control" placeholder="비밀번호" required="">
        </p>
        <button class="btn btn-lg btn-primary btn-block" type="submit">회원가입</button>
    </form>

    <script>
        const form = document.getElementById('join_form');

        form.addEventListener('submit', e => {
            e.preventDefault();

            const data = new FormData(form);
            const param = JSON.stringify(Object.fromEntries(data));

            fetch('/auth/join', {
                method: 'POST',
                body: param,
                headers: {
                    'Content-Type': 'application/json'
                }
            })
            .then(response => {
                debugger;
                if (response.status == 200) {
                    window.location.href = '/view/login';
                    alert("회원가입 성공")
                } else {
                    alert("회원가입 실패")
                }
            })
            .catch(error => console.log(error))
        });
    </script>
</div>
</body>
</html>