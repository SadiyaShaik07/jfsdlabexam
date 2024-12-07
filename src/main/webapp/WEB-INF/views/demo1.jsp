<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/demo1" method="post">
    <label>Age: <input type="number" name="age" required></label><br>
    <label>Country: <input type="text" name="country" required></label><br>
    <button type="submit">Submit</button>
</form>
<p>Age: ${age}</p>
<p>Country: ${country}</p>
</body>
</html>