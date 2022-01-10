<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>showlocation</title>
</head>
<body>
	<style>
form {
	background-color: gold;
	width: 50%;
}
</style>
</head>


<body><body>

        <br>
        <br>
        <pre>
            <form action="saveLoc" method="post">
            <h1>Location details</h1>
                
                <label>id: </label>
                <input type="text" name="id" size="15" /> <br> <br>
                <label> code: </label>
                <input type="text" name="code" size="15" /> <br> <br>
                <label> name: </label>
                <input type="text" name="name" size="15" />
                <label>
                    type:
                </label>
                urban:<input type="radio" name="type" value="urban" />   rural:<input
				type="radio" name="type" value="rural" />  
               
                         <input type="submit" value="sava">
                        
                       
            
	</pre>

        </form>
${msg}
    </body>
<%@ include file="menu.jsp" %>
</body>


</body>
</html>