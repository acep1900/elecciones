/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Espitia
 */
public class ClsJdbc {
    
    
    String driver = "com.mysql.cj.jdbc.Driver";
    String usuario = "root";
    String contrasenia = "";
    String bd = "bd_elecciones";
    String url = "jdbc:mysql://localhost:3306/" + this.bd;
    
    
    public Connection conexion;// Se crea objeto conexion de la clase Connection
    
    public void CrearConexion(){
    
        try {
            
            Class.forName(driver);
            this.conexion = DriverManager.getConnection(url, usuario, contrasenia);
            
            if(this.conexion != null){
                System.out.println("CONEXION EXITOSA JDBC CLASE");
            }
            
        } catch (Exception error) {
            
            System.out.println("ERROR DE CONEXION: "+ error.getMessage());
        }
        
        
    }
    
    
    
    
    
}
