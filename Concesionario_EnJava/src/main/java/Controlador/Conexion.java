package Controlador;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
 
public class Conexion {

    public static Connection obtenerConexion(){
        String url="jdbc:sqlserver://localhost:1433;"
                +"database=Concesionario;"
                +"user=usersql;"
                +"password=n.b1001330212;"
                +"loginTimeout=30;";
         
        try {
            Connection con = DriverManager.getConnection(url);
            return con;
        } catch (SQLException ex) {
            
            System.out.println(ex.toString());
            return null;
        }
        
    }
    
}
