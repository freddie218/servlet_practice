<%@ page contentType="text/html;charset=UTF-8"%>
<%@ page pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
   <meta charset="utf-8">
   <title>Simple login success jsp</title>
</head>
<body>
    <h1>Hello you are in inside now but it is a JSP!!!</h1>
    <p> Hi *** <%= request.getParameter("username") %> *** <p>
    <p> I know your password is *** <%= request.getParameter("password") %> ***. <p>
    <p> I am JSP ha ha ha <p>
</body>
</html>