/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Objects.Administrator;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author madsr
 */
public class AdminLoginServlet extends HttpServlet
{
    RequestDispatcher rd;
    ServletContext sc;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter())
        {
            String givenUsername = request.getParameter("username");
            String givenPassword = request.getParameter("password");
            
            Administrator admin = Facade.getInstance().GetAdmin(givenUsername);
            
            if (admin != null && admin.getPassword().equalsIgnoreCase(givenPassword))
            {
                int accessLevel = admin.getAccessLevel();
                request.getSession().setAttribute("accessLevel", accessLevel);
                sc = getServletContext();
                rd = sc.getRequestDispatcher("/frontpage.jsp");
                rd.forward(request, response);
            } else
            {
                sc = getServletContext();
                rd = sc.getRequestDispatcher("/LoginScreen.jsp");
                out.println("<center><div class=\"w3-container w3-red\">\n"
                        + "  <h3>Login fejlede</h3>\n"
                        + "  <p>Enten er brugernavnet eller koden forkert.</p>\n"
                        + "</div> </center>");
                rd.include(request, response);
            }
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
            throws ServletException, IOException
    {
        processRequest(request, response);
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
            throws ServletException, IOException
    {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo()
    {
        return "Short description";
    }// </editor-fold>

}