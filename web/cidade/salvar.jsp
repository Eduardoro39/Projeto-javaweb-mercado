<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Mercado Online</title>
    </head>
    <body>
        <h1>Cadastro de Cidade</h1>
        
        <form name="cadastrocidade" action="${pageContext.request.contextPath}/SalvarCidade" method="POST">
            <label>ID: </label><input type="number" name="idcidade" id="idcidade" value="${cidade.idCidade}" readonly /><br />
            <label>Nome: </label><input type="text" name="nomecidade" id="nomecidade" value="${cidade.nomeCidade}" required /><br />
            <label>UF: </label><input type="text" name="ufcidade" id="ufcidade" value="${cidade.ufCidade}" required /><br />
            <p><input type="submit" name="salvar" value="Salvar" /></p>
            <br />
            <h3>${retorno}</h3>
        </form>
         <p><a href="${pageContext.request.contextPath}/index.jsp">Home</a></p>
    </body>
</html>
