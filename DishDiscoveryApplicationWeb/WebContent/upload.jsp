<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Strict//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Form Page</title>
</head>
<body>
<h1>Upload a File</h1>

	<form action="image/dish" method="post" enctype="multipart/form-data">

	   <p>
		Select a file : <input type="file" name="file" size="50" />
	   </p>

	   <input type="submit" value="Upload It" />
	   
	   <input type="hidden" name="dishId" value="1">
	</form>

</body>
</html>