package classes;

import java.sql.*;

public class Database {
    public String getQuery(String query, String dato)
    {
    try{
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con=DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/mydb","root","66xkzHUb3.");
    Statement stmt=con.createStatement();
    ResultSet rs=stmt.executeQuery(query);
    String result =  rs.getString(dato);
    con.close();
    System.out.println(result);
    return result;
    }catch(Exception e){
        System.out.println(e);
        return "Error";
    }
    };
}
