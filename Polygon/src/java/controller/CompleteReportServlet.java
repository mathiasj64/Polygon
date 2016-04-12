/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

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
 * @author Mathias
 */
public class CompleteReportServlet extends HttpServlet
{

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
      int conditionLevel = Integer.parseInt(request.getParameter("conditionLevel"));
      int buildingID = Integer.parseInt(request.getParameter("buildingID"));
      String buildingName = request.getParameter("buildingName");
      int zipcode = Integer.parseInt(request.getParameter("zipcode"));
      int yearBuilt = Integer.parseInt(request.getParameter("year"));
      String address = request.getParameter("address");
      int sizeOfBuilding = Integer.parseInt(request.getParameter("size"));
      String purposeOfBuilding = request.getParameter("buildingUse");
      String date = request.getParameter("date");
      String technicianName = request.getParameter("technicianName");
      String customerName = request.getParameter("buildingOwner");
      String roofDesc = request.getParameter("roof");
      String outerWallsDesc = request.getParameter("outerWalls");
      
      
      Facade.getInstance().rm.addCompleteReport(conditionLevel, buildingID, buildingName, zipcode, address, yearBuilt, sizeOfBuilding, purposeOfBuilding, date, technicianName, customerName, roofDesc, outerWallsDesc);
      
      ServletContext sc = getServletContext();
      RequestDispatcher rd = sc.getRequestDispatcher("/reportspage.jsp");
      rd.forward(request, response);
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
