package com.example.batch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/batch";
        String username = "root";
        String password = "1234";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
        }
    }
}