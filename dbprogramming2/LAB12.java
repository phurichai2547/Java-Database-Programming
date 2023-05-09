package dbprogramming2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;


public class LAB12 {
    public static void main(String[] args) {
    String url = "jdbc:mysql://localhost:3306/student";
    String username = "root";
    String password = "mysql@sit";
    try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection connection = DriverManager.getConnection(url, username, password);
    String sql = "insert into student(studentID,firstName,lastName,email,deptID) "+
            "values(?,?,?,?,?)";
    
          PreparedStatement prepareStatement =  connection.prepareStatement(sql);
          prepareStatement.setString(1, "65");
          prepareStatement.setString(2, "Phuri");        
          prepareStatement.setString(3, "Chainikhom");
          prepareStatement.setString(4, "poori547@gmail.com");
          prepareStatement.setString(5, "it");
    prepareStatement.executeUpdate();

  

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
