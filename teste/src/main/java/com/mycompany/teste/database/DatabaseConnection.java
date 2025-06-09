/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teste.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author TALITANAIBERTDACOSTA
 */
public class DatabaseConnection {
    
    private static final String JDBC_URL="jdbc:mysql://localhost:3306/banco";
    private static final String USER = "root";
    private static final String PASSWORD = "root";
    
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(JDBC_URL,USER,PASSWORD);
        
    }
    
    
    
    
}
