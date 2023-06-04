<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:if test="${not empty empresa}">            
            <h1>Empresa ${empresa} registrada!</h1>
        </c:if>

        <c:if test="${empty empresa}">
            <h1>No se ha registrado ninguna empresa</h1>
        </c:if>
    </body>
</html>
