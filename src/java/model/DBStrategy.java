/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Nicholas
 */

    import java.sql.SQLException;

/**
 * The general contract for all JDBC database access strategy implementations.
 * Use of this interface is mandatory.
 * 
 * @author jlombardo
 */
public interface DBStrategy {
    
    public abstract void openConnection(String driverClass, String url, 
            String userName, String password) 
            throws ClassNotFoundException, SQLException;
    
    public abstract void closeConnection() throws SQLException;
}
