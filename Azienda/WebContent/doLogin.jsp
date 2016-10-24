<%@page import="it.alfa.rossella.UtenteBean"%>
<%@page import="it.alfa.rossella.servizi.Servizi"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<jsp:useBean id="utente" class="it.alfa.rossella.AdminBean"
	scope="session"></jsp:useBean>
<jsp:useBean id="message" class="utility.MessageBean" scope="request"></jsp:useBean>
<jsp:setProperty property="*" name="utente" />

<%
 	Servizi s = new Servizi();
	String usern= request.getParameter("username");
 	UtenteBean u = s.getUtente(usern);
 	
	 if(utente.isValid()){
		//l'utente è valido
			String passDaCodificare = utente.getPassword();
			String passCodificata= s.convertiPass(passDaCodificare);
			utente.setPassword(passCodificata);
	
			if(u!=null && u.getPassword().equals(passCodificata)) {

		    	char ruolo= u.getRuolo();
		    	utente.setNome(u.getNome());
		    	utente.setCognome(u.getCognome());
		    	utente.setRuolo(ruolo);

		    		

		    		switch(ruolo) {

		    		case 'a' :   
		    			%>

<jsp:forward page="HomePageAdmin.jsp" />

<%

					break;

		    		case 'c' :

		    	    	%>

<jsp:forward page="HomePageCliente.jsp" />

<%

		    		break;
	    		case 'd' :

		    	    	%>

<jsp:forward page="HomePageDipendente.jsp" />

<%

		    		break;

		    		}

		    }
	 }
		    else{

		    	message.setMessage("Username o password non corretti");

		    			%>

<jsp:forward page="login.jsp" />

<%
			
			}%>










