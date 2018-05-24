package com.mvn.testmvn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainDBTest {

	public static void main(String[] argv) {

        System.out.println("-------- Oracle JDBC Connection Testing ------");

        try {

            Class.forName("oracle.jdbc.OracleDriver");

        } catch (ClassNotFoundException e) {

            System.out.println("Where is your Oracle JDBC Driver?");
            e.printStackTrace();
            return;

        }

        System.out.println("Oracle JDBC Driver Registered!");

        Connection conn = null;
        Statement  stmt =null;
        ResultSet  rs=null;

        try {

        	 conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "test", "root");
            
            String template = new String();
            template = "SELECT * FROM dual"; 

            stmt = conn.createStatement();                                     // registeredUser is the table you created in the databasefor registered users.
            rs   = stmt.executeQuery("SELECT SYSDATE FROM dual");
            while (rs.next()) {
              System.out.println("normalConnectionOCI(): SYSDATE=" + rs.getString("SYSDATE"));
            }
            rs.close();
            stmt.close();
           

        } catch (SQLException e) {

            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
            return;

        }

        if (conn != null) {
            System.out.println("You made it, take control your database now!");
        } else {
            System.out.println("Failed to make connection!");
        }
    }

}
