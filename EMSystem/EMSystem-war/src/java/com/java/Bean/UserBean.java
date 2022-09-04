/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.Bean;

import com.java.Entity.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.ejb.Stateless;

/**
 *
 * @author sammy
 */
@Stateless
public class UserBean implements UserBeanLocal {

    String url = "jdbc:mysql://employeemanangementdemo.mysql.database.azure.com:3306/mysql?serverTimezone=UTC&useSSL=false";
    String dbusername = "samridhi@employeemanangementdemo";
    String dbpassword = "Sammy@2020";
    
    /**
     *
     * @param user
     * @return
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public boolean login(User user) throws ClassNotFoundException, SQLException {
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, dbusername, dbpassword);

            Statement st = conn.createStatement();
            ResultSet rs =  st.executeQuery("SELECT * FROM ems.Login");

            if (!rs.next()) {
                    return false;
                } else {
                    do {

                        String email = rs.getString(1);
                        String password = rs.getString(2);

                        if(user.getEmail().equals(email) && user.getPassword().equals(password))
                        {
                            return true;
                        }

                    } while (rs.next());
                }
        } catch (SQLException ex) {
        }
        
        return false;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
