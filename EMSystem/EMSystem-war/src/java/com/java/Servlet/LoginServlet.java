/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.Servlet;

import com.java.Bean.UserBeanLocal;
import com.java.Entity.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
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
@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

    
    private static final long serialVersionUID = 1L;
    private static final String LOGIN_BEAN_SESION_KEY
	= "login";
    
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
        UserBeanLocal UserBean
	    = (UserBeanLocal) request.getSession()
	    .getAttribute(LOGIN_BEAN_SESION_KEY);

        if (UserBean == null) {
            // EJB is not present in the HTTP session
            // so let's fetch a new one from the container
            try {
                InitialContext ic = new InitialContext();
                UserBean = (UserBeanLocal) ic.lookup("java:comp/env/ejb/UserBean");
                

                // put EJB in HTTP session for future servlet calls
                request.getSession().setAttribute(LOGIN_BEAN_SESION_KEY, UserBean);

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
		
            String userName = request.getParameter("username");
            String password = request.getParameter("password");

            if(userName != null && password != null)
            {
                User user = new User(userName, password);
                
                Boolean isAuthenticate = UserBean.login(user);

                if(isAuthenticate){
                                     
                    request.setAttribute("userName", userName);
                    request.setAttribute("password", password);
                    HttpSession session=request.getSession();
                    session.setAttribute("userName",userName);
                    
                    
                    request.getRequestDispatcher("home.jsp").include(request, response);
//		
                    
//                    if(user.getIsAdmin()){
//                        
//                        session.setAttribute("admin","true");
//
//                        request.getRequestDispatcher("navStudent.html").include(request, response);
//		
//                        
//                        
//                    }else{
//                        request.getRequestDispatcher("navadmin.html").include(request, response);
//			
//                        
//                    }
                    
                    
                    
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
            Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
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
