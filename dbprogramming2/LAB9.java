/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dbprogramming2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Student
 */
public class LAB9 {
    public static void main(String[] args) {
         String url = "jdbc:mysql://localhost:3306/student";
    String username = "root";
    String password = "mysql@sit";
    try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection connection = DriverManager.getConnection(url, username, password);
    Statement statement = connection.createStatement();
    String sql = "insert into student(studentID,firstName,lastName,email,deptID) "+
            "values('65','Phuri','Chainikhom','poori547@gmail.com','IT')";
    
    statement.executeUpdate(sql);

  

} 
    catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    } catch (ClassNotFoundException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    
    }
    
}
