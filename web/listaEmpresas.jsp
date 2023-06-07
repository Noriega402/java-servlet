<%@page import="java.util.List, com.alura.gerenciador.Empresa" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="ISO-8859-1">
        <title>Java Standard Taglib</title>
    </head>
    <body>
        <p>Listado de las empresas registradas:</p>
        <c:if test="${not empty empresa}"> <br/>      
            <h1>Empresa ${empresa} registrada!</h1>
        </c:if>
        <ul>
            <c:forEach items="${empresas}" var="empresa">
                <li>${ empresa.nombre } - <fmt:formatDate value="${empresa.fechaApertura}" pattern="dd/MM/yyyy"/></li>
            </c:forEach>
        </ul>
</ul>
</body>
</html>
