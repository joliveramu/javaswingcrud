/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swingcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author dinoalix
 */
public class DatabaseUtils {
    
    public Connection connection;
    public ResultSet resultSet;
    public String query = null;
    public PreparedStatement statement;
    public final String url = "jdbc:mysql://localhost:3306/db_testing";
    public final String userName = "root";
    public final String passWord = "";
    
}

 