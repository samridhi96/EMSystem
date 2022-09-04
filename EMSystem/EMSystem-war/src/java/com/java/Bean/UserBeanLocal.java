/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.Bean;

import com.java.Entity.User;
import java.sql.SQLException;
import javax.ejb.Local;

/**
 *
 * @author sammy
 */
@Local
public interface UserBeanLocal {
    public boolean login(User user) throws ClassNotFoundException, SQLException ;
}
