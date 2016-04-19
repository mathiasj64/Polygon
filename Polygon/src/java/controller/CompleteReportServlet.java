/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
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
      int conditionLevel = Integer.parseInt(request.getParameter("CL"));
      int buildingID = Integer.parseInt(request.getParameter("BI"));
      String buildingName = request.getParameter("BN");
      int zipcode = Integer.parseInt(request.getParameter("Z"));
      int yearBuilt = Integer.parseInt(request.getParameter("Y"));
      String address = request.getParameter("A");
      int sizeOfBuilding = Integer.parseInt(request.getParameter("S"));
      String purposeOfBuilding = request.getParameter("BU");
      String date = request.getParameter("D");
      String technicianName = request.getParameter("TN");
      String customerName = request.getParameter("BO");
      String roofDesc = request.getParameter("R");
      String outerWallsDesc = request.getParameter("OW");

      int highestReportID = Facade.getInstance().rm.getHighestReportID();

      Facade.getInstance().rm.addCompleteReport(conditionLevel, buildingID, buildingName, zipcode, address, yearBuilt, sizeOfBuilding, purposeOfBuilding, date, technicianName, customerName, roofDesc, outerWallsDesc);

      int roomAmount = request.getParameter("addRoom") == null ? 1 : Integer.parseInt(request.getParameter("addRoom"));

      for (int i = 1; i <= roomAmount; i++)
      {
      int reportID = highestReportID + 1;
      String whens = request.getParameter("dmgWhen" + i);
      String wheres = request.getParameter("dmgWhere" + i);
      String what = request.getParameter("dmgWhatHappened" + i);
      String repairs = request.getParameter("dmgWhatRepaired" + i);
      String walls = request.getParameter("commentsWalls" + i);
      String ceiling = request.getParameter("commentsCeiling" + i);
      String floor = request.getParameter("commentsFloor" + i);
      String windows = request.getParameter("commentsWindowDoor" + i);
      int scanningMade = 1;
      String MoistureScanning = request.getParameter("moistScanning" + i);
      String MeasuringPoint = request.getParameter("measurePoint" + i);
      int moist = 1;
      int rot = 1;
      int mold = 1;
      int fire = 1;
      int other = 1;
      String OtherDescription = request.getParameter("OtherDescription" + i);
      String Recommendation = request.getParameter("Recommendation" + i);

      Facade.getInstance().rom.addRooms(reportID, whens, wheres, what, repairs, walls, ceiling, floor, windows, scanningMade, MoistureScanning, MeasuringPoint, moist, rot, mold, fire, other, OtherDescription, Recommendation);
      }

      ServletContext sc = getServletContext();
      RequestDispatcher rd = sc.getRequestDispatcher("/reportspage.jsp");
      rd.forward(request, response);
    } catch (Exception ex)
    {
      ServletContext sc = getServletContext();
      RequestDispatcher rd = sc.getRequestDispatcher("/newReportAdd.jsp");
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
