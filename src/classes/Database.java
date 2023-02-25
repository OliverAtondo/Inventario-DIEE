package classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    public Database(){
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:/data/inventario.db");
            if (conn != null) {
                System.out.println("\u001B[33m"+"INVENTARIO ITT"+"\u001B[0m"+"  En ejecución  ");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}