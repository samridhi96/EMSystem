/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.Bean;

import com.java.Entity.Employee;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author sammy
 */
@Stateless
public class EmployeeBean implements EmployeeBeanLocal {
    String url = "jdbc:mysql://employeemanangementdemo.mysql.database.azure.com:3306/mysql?serverTimezone=UTC&useSSL=false";
    String dbusername = "samridhi@employeemanangementdemo";
    String dbpassword = "Sammy@2020";
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    @Override
    public boolean createEmployee(Employee employee) throws ClassNotFoundException, SQLException {
       
        try {
            

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, dbusername, dbpassword);

            Statement st = connection.createStatement();
            
            
            String sql = "insert into ems.EmployeeDetails values('"+employee.getEid()+"','"+employee.getName()+"','"+employee.getEmail()+"','"+employee.getDob()+"','"+employee.getGender()+"','"+employee.getHomeAddress()+"','"+employee.getPhoneNo()+"','"+employee.getDepartment()+"','"+employee.getSalary()+"','"+employee.getDesignation()+"','"+employee.getStatus()+"')";
            
            st.executeUpdate(sql);            
            
        }
        catch (SQLException e) {
			e.printStackTrace();
		}
        catch (Exception ex){
            ex.printStackTrace();
        }
        return true;
    }
    
    
    @Override
    public List<String> getEmployeeDetails(Employee employee) throws ClassNotFoundException {
        List<String> employeeInfo = new ArrayList();
        try {
            

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, dbusername, dbpassword);

            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM ems.EmployeeDetails WHERE Id =" + employee.getEid());
            
            if (!rs.next()) {
                return null;
            } else {
                do {
                    
                    employeeInfo.add(rs.getString(1));
                    employeeInfo.add(rs.getString(2));
                    employeeInfo.add(rs.getString(3));
                    employeeInfo.add(rs.getString(4));
                    employeeInfo.add(rs.getString(5));
                    employeeInfo.add(rs.getString(6));
                    employeeInfo.add(rs.getString(7));
                    employeeInfo.add(rs.getString(8));
                    employeeInfo.add(rs.getString(9));
                    employeeInfo.add(rs.getString(10));
                    employeeInfo.add(rs.getString(11));
                    
                } while (rs.next());
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return employeeInfo;
    }
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    @Override
    public boolean deleteEmployee(Employee employee) throws ClassNotFoundException, SQLException {
       
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, dbusername, dbpassword);

            Statement st = connection.createStatement();
            String sql = "delete from ems.EmployeeDetails where Id='"+employee.getEid()+"'";           
               st.executeUpdate(sql);
            
            
        }
        catch (SQLException e) {
			e.printStackTrace();
		}
        catch (Exception ex){
            ex.printStackTrace();
        }
        return true;
    }
    
    @Override
    public boolean updateEmployee(Employee employee) throws ClassNotFoundException, SQLException {
       
        try {
           
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, dbusername, dbpassword);

            Statement st = connection.createStatement();
            
            
            String sql = "update ems.EmployeeDetails set Name='"+employee.getName()+"',Email='"+employee.getEmail()+"', DOB='"+employee.getDob()+"', Gender='"+employee.getGender()+"', HomeAddress='"+employee.getHomeAddress()+"', PhoneNo='"+employee.getPhoneNo()+"', Department='"+employee.getDepartment()+"', Salary='"+employee.getSalary()+"', Designation='"+employee.getDesignation()+"', Status='"+employee.getStatus()+"' where Id='"+employee.getEid()+"'";
            
            st.executeUpdate(sql);
         
        }
        catch (SQLException e) {
			e.printStackTrace();
		}
        catch (Exception ex){
            ex.printStackTrace();
        }
        return true;
    }
    
}