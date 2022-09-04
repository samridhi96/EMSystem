/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.Servlet;

import com.java.Bean.EmployeeBeanLocal;
import com.java.Entity.Employee;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author sammy
 */
@WebServlet(name = "CreateServlet", urlPatterns = {"/CreateServlet"})
public class CreateServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private static final String CREATE_EMPLOYEE_DETAIL_BEAN_SESION_KEY
	= "create";
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        
        // Obtain the EJB from the HTTP session
        EmployeeBeanLocal EmployeeBean
	    = (EmployeeBeanLocal) request.getSession()
	    .getAttribute(CREATE_EMPLOYEE_DETAIL_BEAN_SESION_KEY);

        if (EmployeeBean == null) {
            // EJB is not present in the HTTP session
            // so let's fetch a new one from the container
            try {
                InitialContext ic = new InitialContext();
                EmployeeBean = (EmployeeBeanLocal) ic.lookup("java:comp/env/ejb/EmployeeBean");
                

                // put EJB in HTTP session for future servlet calls
                request.getSession().setAttribute(CREATE_EMPLOYEE_DETAIL_BEAN_SESION_KEY, EmployeeBean);

            } catch (NamingException e) {
                throw new ServletException(e);
            }
        }
        
        
        
    response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            out.print("<!DOCTYPE html>");
            out.print("<html>");
            out.println("<head>");
            out.println("<title>Employee Management</title>");
            out.println("<link rel='stylesheet' href='bootstrap.min.css'/>");
            out.println("</head>");
            out.println("<body>");
	
    
            String eid = request.getParameter("eid");
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String dob = request.getParameter("dob");
            String gender = request.getParameter("gender");
            String homeAddress = request.getParameter("homeAddress");
            String phoneNo = request.getParameter("phoneNo");
            String department = request.getParameter("department");
            String salary = request.getParameter("salary");
            String designation = request.getParameter("designation");
            String status = request.getParameter("status");
            
            if(eid != null)
            {
                Employee employee = new Employee(eid,name,email,dob,gender,homeAddress,phoneNo,department,salary,designation,status);
                
                
                boolean isCreated = EmployeeBean.createEmployee(employee);
               
                if(isCreated){
                                     
                    request.setAttribute("employeeId", eid);
//                    
                    HttpSession session=request.getSession();
                    session.setAttribute("createEmployee", employee);
                   
                    request.getRequestDispatcher("createResult.jsp").include(request, response);  
                }
               
            }
            

        out.close();
            
        }
    
    }

       // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SearchServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SearchServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SearchServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SearchServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
