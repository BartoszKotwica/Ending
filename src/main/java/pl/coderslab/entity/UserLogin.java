package pl.coderslab.entity;

import java.sql.*;
public class UserLogin {
    public static void main(String[] args) throws SQLException {
        // Łączenie z bazą danych
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sklep", "root", "20Kotwica01");
        // Logowanie użytkownika
        String loginUserQuery = "SELECT * FROM user_details WHERE user_name = ? AND password = ?";
        PreparedStatement loginUserStatement = connection.prepareStatement(loginUserQuery);
        loginUserStatement.setString(1, "username");
        loginUserStatement.setString(2, "password");
        ResultSet resultSet = loginUserStatement.executeQuery();
        // Sprawdzenie, czy użytkownik istnieje
        if (resultSet.next()) {
            // Użytkownik istnieje
            System.out.println("Użytkownik istnieje");
        } else {
            // Użytkownik nie istnieje
            System.out.println("Użytkownik nie istnieje");
        }
        // Zamykanie połączenia z bazą danych

    }
}
