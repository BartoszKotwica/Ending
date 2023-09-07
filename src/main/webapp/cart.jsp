<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Twój koszyk</title>
</head>
<body>
<h1>Twój koszyk</h1>

<table>
    <tr>
        <th>Nazwa produktu</th>
        <th>Cena</th>
        <th>Ilość</th>
    </tr>
    <c:forEach items="${cart.items}" var="item">
        <tr>
            <td>${item.productName}</td>
            <td>${item.price}</td>
            <td>${item.quantity}</td>
        </tr>
    </c:forEach>
</table>

<p>Łączna cena: ${cart.totalPrice}</p>

<!-- Formularz do dodawania/usuwania przedmiotów z koszyka -->
<form action="/cart" method="post">
    <input type="hidden" name="userId" value="${userId}">
    <input type="hidden" name="productId" value="${item.productId}">
    <input type="hidden" name="action" value="add">
    <button type="submit">Dodaj do koszyka</button>
</form>

<form action="/cart" method="post">
    <input type="hidden" name="userId" value="${userId}">
    <input type="hidden" name="productId" value="${item.productId}">
    <input type="hidden" name="action" value="remove">
    <button type="submit">Usuń z koszyka</button>
</form>
</body>
</html>