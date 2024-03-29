<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="modificarEmpresa" var="linkServletNuevaEmpresa"/>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<!--
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Html.html to edit this template
-->
<html>
    <head>
        <title>Actualizar Empresa</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <form action="${linkServletNuevaEmpresa}" method="POST">
            Nuevo nombre de la empresa: <input type="text" name="nombre"value="${ empresa.nombre }"/>
            Fecha de apertura de la empresa: <input type="text" name="fecha" value="<fmt:formatDate value="${empresa.fechaApertura}" pattern="dd/MM/yyyy"/>"/>
            <input type="hidden" name="id" value="${ empresa.id }"/>
            <input type="submit" value="Enviar">
        </form>
    </body>
</html>
