/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import Clases.ClsCandidato;
import Clases.ClsJdbc;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 *
 * @author Espitia
 */
public class MdlCandidato {
   
    ClsJdbc obj_jdbc; 

    public MdlCandidato() {
       this.obj_jdbc = new ClsJdbc(); 
       this.obj_jdbc.CrearConexion();
       
    } // constructor de la clase MdlCandidato
    
    
    
    public boolean agregarCandidato(ClsCandidato candidato){ //metodo agregar candidatos a la base de datos
        try{ // para manejo erroes por conexion a la base de datos
        
            String sql_query = "INSERT INTO tbl_candidatos VALUES("
                    + candidato.getNumeroDocumento() + ","
                    + "'" + candidato.getNombre() + "',"
                    + "'" + candidato.getTelefono() + "',"
                    + "'" + candidato.getPartidoPolitico() + "',"
                    + "'" + candidato.getDescripcion() + "',"
                    + "'" + candidato.getMensajeCampania() + "',"
                    + "'" + candidato.getCiudadOrigen() + "',"
                    + "'" + candidato.getPropuestas() + "'"
                    + " )"; // se declara la consulta en lenguaje SQL
            
            PreparedStatement sentencia = this.obj_jdbc.conexion.prepareStatement(sql_query); // preparar la consulta y la convierte en algo entendible para el motor de la base de datos
            int resultado = sentencia.executeUpdate();
            
            
            return true;
        }
        catch(Exception e){
        
            return false;
        }
        
        
        
    
    
    }
    
    
    
    @SuppressWarnings("empty-statement")
    public LinkedList<ClsCandidato> ObtenerCandidatos(){ 
        try{
            System.out.println("CONEXION EXITOSA!!!!!!");
            LinkedList <ClsCandidato> listaCandidatos;
            listaCandidatos = new LinkedList<>();   
            
            String sql_query = "SELECT * FROM tbl_candidatos"; // se declara la consulta en lenguaje SQL
            PreparedStatement sentencia = this.obj_jdbc.conexion.prepareStatement(sql_query); // preparar la consulta y la convierte en algo entendible para el motor de la base de datos
            ResultSet conjunto_resultados = sentencia.executeQuery();
            
            
            while(conjunto_resultados.next()){ //se almacena los datos registro por registro campo por campo
                String partidoPolitico = conjunto_resultados.getString("partidoPolitico_candidato"); 
                String descripcion = conjunto_resultados.getString("descripcion_candidato");
                String numeroDocumento  = conjunto_resultados.getString("id_candidato");
                String nombre = conjunto_resultados.getString("nombre_candidato");
                String telefono = conjunto_resultados.getString("telefono_candidato");
                String ciudadOrigen = conjunto_resultados.getString("ciudadOrigen_candidato");
                String mensaje_campania = conjunto_resultados.getString("mensajeCampania_candidato");
                String propuestas = conjunto_resultados.getString("propuestas_candidato");
                String correo = "";
                
                ClsCandidato candidato_n; //se crea un objeto de la clase ClsCandidato
                candidato_n = new ClsCandidato(partidoPolitico, descripcion, numeroDocumento, nombre, telefono, ciudadOrigen, mensaje_campania,propuestas,correo);
                
                System.out.println(candidato_n);
                
                listaCandidatos.add(candidato_n);
            };
            
            return listaCandidatos;
            
        }
        
        
        
        catch (SQLException e) {
        
            System.out.println("No se logro la conexion desde Mdl" + e.getMessage());
            return null;
        }
        
        
    };
}
