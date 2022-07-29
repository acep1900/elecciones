package Modelos;

import Clases.ClsJdbc;
import Clases.ClsPersona;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 *
 * @author Espitia
 */
public class MdlVotante {

    ClsJdbc obj_jdbc;

    public MdlVotante() {
        this.obj_jdbc = new ClsJdbc();//iniciar el objeta de la conexion
        this.obj_jdbc.CrearConexion();

    }

    public boolean agregarVotante(ClsPersona votante) { // metodo para agregar votante 
        try { // para manejo erroes por conexion a la base de datos

            String sql_query = "INSERT INTO tbl_votantes VALUES("
                    + votante.getNumeroDocumento() + ","
                    + "'" + votante.getNombre() + "',"
                    + "'" + votante.getTelefono() + "',"
                    + "'" + votante.getCorreo() + "'"
                    + " )"; // se declara la consulta en lenguaje SQL

            PreparedStatement sentencia = this.obj_jdbc.conexion.prepareStatement(sql_query); // preparar la consulta y la convierte en algo entendible para el motor de la base de datos
            int resultado = sentencia.executeUpdate();

            return true;
        } catch (Exception e) {

            return false;
        }

    }
    
    public LinkedList<ClsPersona> ObtenerVotante(){ 
        try{
            System.out.println("CONEXION EXITOSA!!!!!!");
            LinkedList <ClsPersona> listaVotante;
            listaVotante = new LinkedList<>();   
            
            String sql_query = "SELECT * FROM tbl_votantes"; // se declara la consulta en lenguaje SQL
            PreparedStatement sentencia = this.obj_jdbc.conexion.prepareStatement(sql_query); // preparar la consulta y la convierte en algo entendible para el motor de la base de datos
            ResultSet conjunto_resultados = sentencia.executeQuery();
            
            
            while(conjunto_resultados.next()){ //se almacena los datos registro por registro campo por campo
                String NumeroDocumento = conjunto_resultados.getString("id_votante"); 
                String nombre = conjunto_resultados.getString("nombre_votante");
                String telefono  = conjunto_resultados.getString("telefono_votante");
                String correo = conjunto_resultados.getString("correo_votante");
                                
                ClsPersona votante_n; //se crea un objeto de la clase ClsCandidato
                votante_n = new ClsPersona(NumeroDocumento, nombre, telefono, correo );
                
                listaVotante.add(votante_n);
            };
            
            return listaVotante;
            
        }
        
        
        
        catch (SQLException e) {
        
            System.out.println("No se logro la conexion desde Mdl" + e.getMessage());
            return null;
        }
        
        
    };

}
