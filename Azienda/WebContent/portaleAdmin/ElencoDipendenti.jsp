<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.List"%>
<%@page import="it.alfa.rossella.DipendenteBean"%>
<%@page import="it.alfa.rossella.UtenteBean"%>
<%@page import="it.alfa.rossella.servizi.Servizi"%>


 <jsp:useBean id="utente" class="it.alfa.rossella.UtenteBean" scope="session"></jsp:useBean>
     
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Elenco Dipendenti</h2>

			<table border="1">
				<thead>

					<tr>
						<th>n.</th>
						<th>nome</th>
						<th>cognome</th>
						<th>username</th>
						<th>posizione</th>
						<th>stipendio</th>
					</tr>

				</thead>

				<%
					Servizi s = new Servizi();
					String usnm = utente.getUsername();
					List <DipendenteBean> lista = s.getDipendenti();
					session.setAttribute("lista", lista);
				%>
				<c:set var="i" value="1" scope="page" />

				<c:forEach items="${lista}" var="u">

					<tr>
						<td><c:out value="${i}" /></td>
						<td><c:out value="${u.nome}" /></td>
						<td><c:out value="${u.cognome}" /></td>
						<td><c:out value="${u.username}" /></td>
						<td><c:out value="${u.posizione}" /></td>
						<td><c:out value="${u.stipendio}" /></td>
					</tr>
					<c:set var="i" value="${i + 1}" scope="page" />
				</c:forEach>


</table>
		
		
			
		</div>
		
		<div id="footer">
			<h1>Footer</h1>

		</div>


	</div>
	<!--  end of container -->
</body>
</html>