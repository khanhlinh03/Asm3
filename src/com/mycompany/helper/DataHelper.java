/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author MMC
 */
public class DataHelper {
    public static Connection opConnection() throws ClassNotFoundException, SQLException{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://localhost:1433;databaseName=AsmJava3;trustServerCertificate=true";
        String user = "sa";
        String pass = "123";
        Connection conn = DriverManager.getConnection(url,user,pass);
        return conn;
    }
}
