<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Lista płatności</title>
</head>
<body>
<h1>Lista płatności</h1>

<table>
    <tr>
        <th>Payment ID</th>
        <th>Payment Insert ID</th>
        <th>Items Total Price</th>
        <th>Status</th>
        <th>Description</th>
    </tr>
    <c:forEach items="${payments}" var="payment">
        <tr>
            <td>${payment.paymentId}</td>
            <td>${payment.paymentInsertId}</td>
            <td>${payment.itemsTotalPrice}</td>
            <td>${payment.status}</td>
            <td>${payment.description}</td>
        </tr>
    </c:forEach>
</table>

<!-- Formularz do dodawania nowej płatności -->
<h2>Dodaj nową płatność</h2>
<form action="/payments" method="post">
    <label for="payment_insert_id">Payment Insert ID:</label>
    <input type="number" id="payment_insert_id" name="payment_insert_id" required><br>
    <label for="items_total_price">Items Total Price:</label>
    <input type="number" id="items_total_price" name="items_total_price" step="0.01" required><br>
    <label for="status">Status:</label>
    <input type="text" id="status" name="status" required><br>
    <label for="description">Description:</label>
    <textarea id="description" name="description" required></textarea><br>
    <button type="submit">Dodaj płatność</button>
</form>
</body>
</html>
