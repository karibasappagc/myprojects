<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<style type="text/css">
.btn {
width:70%;
color: blue;
font-style: italic;
font-size: 20px;
font-family:courier new;
font-weight: bold;

}

.submit_class {
width:8%;
color: none;
font-style: normal;
font-family:courier new;
font-size: 15px;
color: red;
font-weight: bold;
font-stretch: ultra-expanded;

}

.file_class {
width:25%;
color: none;
font-style: normal;
font-family:courier new;
font-size: 15px;

}
</style>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello</title>
</head>
<body>
 <form method="POST" action="uploadSingleFile" enctype="multipart/form-data">
 <div>
  <label for="files" class="btn">Please Upload a  file for downloading new formatted file</label>
  </br>
  <input id="files" style="visibility:hidden;" type="file">
</div>
       <input type="file" name="file" class="file_class"></br> </br>  
        <input type="submit" value="Download" class="submit_class">
 </form>
</body>
</html>