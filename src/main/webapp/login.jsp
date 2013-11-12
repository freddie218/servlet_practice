<%@ page contentType="text/html;charset=UTF-8"%>
<%@ page pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
   <meta charset="utf-8">
   <title>Simple login jsp</title>
</head>
<body>
    <h1>Login example</h1>
    <!-- <form action="LoginServlet" method="post"> -->
    <form action="LoginJSP" method="post">
        <div>
            <label>Username</label>
            <div>
                <input type='text' id="username" name='username' placeholder="Username" />
            </div>
        </div>
        <div>
            <label>Password</label>
            <div>
                <input type='password' id="password" name='password' placeholder="Password" />
            </div>
        </div>
        <div>
            <div>
                <button type="submit">Login</button>
            </div>
        </div>
	</form>
</body>
</html>