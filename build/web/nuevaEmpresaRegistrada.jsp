<%
    String empresa = (String) request.getAttribute("nombreEmpresa");
    String nombre = "Daniel Noriega";
    System.out.println(empresa);
    System.out.println(nombre);
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Empresa <%= empresa %> registrada!</h1>
        <h3><%= nombre %></h3>
    </body>
</html>
