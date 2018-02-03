<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="POST" action="uploadMultipleFiles" enctype="multipart/form-data">
        File1 to upload: <input type="file" name="file"> </br> </br> 
        Name: <input type="text" name="name"></br> </br> </br>
        File2 to upload: <input type="file" name="file"></br> </br> 
        Name: <input type="text" name="name"></br> </br>  </br> 
        <input type="submit" value="Upload">
    </form>
</body>
</html>