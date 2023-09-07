<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Lista produktów</title>
</head>
<body>
<h1>Lista produktów</h1>

<table>
    <tr>
        <th>ID</th>
        <th>Nazwa</th>
        <th>Cena</th>
        <th>Opis</th>
        <th>Ilość</th>
        <th>Dostępność</th>
    </tr>
    <c:forEach items="${products}" var="product">
        <tr>
            <td>${product.id}</td>
            <td>${product.name}</td>
            <td>${product.price}</td>
            <td>${product.description}</td>
            <td>${product.quantity}</td>
            <td>${product.active}</td>
            <td>
                <form action="/editProduct" method="get">
                    <input type="hidden" name="id" value="${product.id}">
                    <button type="submit">Edytuj</button>
                </form>
                <form action="/deleteProduct" method="post">
                    <input type="hidden" name="id" value="${product.id}">
                    <button type="submit">Usuń</button>
                </form>
            </td>
        </tr>
    </c:forEach>
</table>

<!-- Formularz do dodawania nowego produktu -->
<h2>Dodaj nowy produkt</h2>
<form action="/addProduct" method="post">
    <label for="name">Nazwa:</label>
    <input type="text" id="name" name="name" required><br>
    <label for="price">Cena:</label>
    <input type="number" id="price" name="price" step="0.01" required><br>
    <label for="description">Opis:</label>
    <textarea id="description" name="description" required></textarea><br>
    <button type="submit">Dodaj</button>
</form>
</body>
</html>