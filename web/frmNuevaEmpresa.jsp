<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="nuevaEmpresa" var="linkServletNuevaEmpresa"/>
<!DOCTYPE html>
<!--
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Html.html to edit this template
-->
<html>
    <head>
        <title>Metodo GET</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <form action="${linkServletNuevaEmpresa}" method="POST">
            Nuevo nombre de la empresa: <input type="text" name="nombre"/>
            
            <input type="submit" value="Enviar">
        </form>
    </body>
</html>
