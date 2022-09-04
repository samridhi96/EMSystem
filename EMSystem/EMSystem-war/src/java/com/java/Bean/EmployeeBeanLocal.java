/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.Bean;

import com.java.Entity.Employee;
import java.sql.SQLException;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author sammy
 */
@Local
public interface EmployeeBeanLocal {
    public boolean createEmployee(Employee employee) throws ClassNotFoundException, SQLException;
    public List<String> getEmployeeDetails(Employee employee) throws ClassNotFoundException, SQLException;
    public boolean updateEmployee(Employee employee) throws ClassNotFoundException, SQLException;
    public boolean deleteEmployee(Employee employee) throws ClassNotFoundException, SQLException;
    
}
