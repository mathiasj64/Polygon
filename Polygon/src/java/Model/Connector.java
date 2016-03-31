/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Mathias
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Mathias
 */
public class Connector
{
  private final String HOST = "localhost";
  private int PORT = 3306;
  private final String DATABASE = "football";
  private final String USERNAME = "root";
  private final String PASSWORD = "1234";
  private final String url = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DATABASE;
  public Statement stmt;
  
  public Connector()
  {
    try
    {
      Class.forName("com.mysql.jdbc.Driver");
      Connection con = DriverManager.getConnection(url, USERNAME, PASSWORD);
      stmt = con.createStatement();
      System.out.println("Logged in to connector");
    } catch (SQLException | ClassNotFoundException ex)
    {
      System.out.println(ex);
    }
  }
}