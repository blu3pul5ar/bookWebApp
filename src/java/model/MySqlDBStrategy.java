/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Nicholas
 */
public class MySqlDBStrategy implements DBStrategy{
    private Connection conn;

    public void openConnection(String driverClass,String url,String username,String password) throws ClassNotFoundException, SQLException {
        Class.forName(driverClass);
        conn = DriverManager.getConnection(url,username,password);
    }
    public void closeConnection() throws SQLException{
        conn.close();
    }
}