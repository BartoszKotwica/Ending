package pl.coderslab.entity;

import java.sql.*;
public class UserRegistration {
    public static void main(String[] args) throws SQLException {
        // Łączenie z bazą danych
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sklep", "root", "20Kotwica01");
        // Rejestracja użytkownika
        String registerUserQuery = "INSERT INTO user_details (first_name, last_name, user_name, password, email) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement registerUserStatement = connection.prepareStatement(registerUserQuery);
        registerUserStatement.setString(1, "first_name");
        registerUserStatement.setString(2, "last_name");
        registerUserStatement.setString(3, "username");
        registerUserStatement.setString(4, "password");
        registerUserStatement.setString(5, "email");
        registerUserStatement.executeUpdate();
        // Zamykanie połączenia z bazą danych
        connection.close();
    }
}
