<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Mercado Online</title>
    </head>
    <body>
        <h1>Lista de Cidades</h1>

        <table border="1">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Nome</th>
                    <th>UF</th>
                    <th colspan="2">Editar</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="cidade" items="${cidades}">
                    <tr>
                        <td>${cidade.idCidade}</td>
                        <td>${cidade.nomeCidade}</td>
                        <td>${cidade.ufCidade}</td>
                        <td><a href="${pageContext.request.contextPath}/ExcluirCidade?idcidade=${cidade.idCidade}">Excluir</a></td> 
                        <td><a href="${pageContext.request.contextPath}/CarregarCidade?idcidade=${cidade.idCidade}">Alterar</a></td> 
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        
        <p><a href="${pageContext.request.contextPath}/index.jsp">Home</a></p>
    </body>
</html>