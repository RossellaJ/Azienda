<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    

    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="Stylesheet" type="text/css" href="css/stat.css">
 <jsp:useBean id="utente" class="it.alfa.rossella.UtenteBean" scope="session"></jsp:useBean>
 <jsp:useBean id="message" class="utility.MessageBean" scope="request"></jsp:useBean>    

<title>Insert title here</title>
</head>
<body>

	<div id="Container">

		<div id="header">
			<h1>Admin HomePage</h1>
			
			<h2>
			<c:out value="${utente.nome}"/>
			<c:out value="${utente.cognome}"/>
			</h2>
		</div>


		<div class="menu">
			<jsp:include page="MenuLateraleAdmin.jsp"></jsp:include>
		</div>
		
		
		<div id="content">
			<h1>Welcome to Home Page</h1>
		</div>
		
		<div id="footer">
			<h1>Footer</h1>

		</div>


	</div>
	<!--  end of container -->
</body>
</html>