package Clases;

import java.util.LinkedList;

/**
 *
 * @author Espitia
 */
public class ClsCandidato extends ClsPersona {
    
    private String partidoPolitico;
    private String descripcion;
    private String mensajeCampania;
    private String ciudadOrigen;
    //private LinkedList<ClsPropuesta> propuestas;
    private String propuestas;
   
    public ClsCandidato(String partidoPolitico, String descripcion, String numeroDocumento, String nombre, String telefono, String ciudadOrigen, String mensajeCampania, String propuestas, String correo ) {
        super(numeroDocumento, nombre, telefono, correo);
        this.partidoPolitico = partidoPolitico;
        this.descripcion = descripcion;
        //this.propuestas = new LinkedList<>();//constructor
        this.propuestas = propuestas;//constructor
        this.ciudadOrigen = ciudadOrigen;
        this.mensajeCampania = mensajeCampania;
    }

       
    
    
  
    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMensajeCampania() {
        return mensajeCampania;
    }

    public void setMensajeCampania(String mensajeCampania) {
        this.mensajeCampania = mensajeCampania;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }
   
    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }
    
/*
    public LinkedList<ClsPropuesta> getPropuestas() {
        return propuestas;
    }

    public void setPropuestas(LinkedList<ClsPropuesta> propuestas) {
       this.propuestas = propuestas;
    }
*/

    public void setPropuestas(String propuestas) {
        this.propuestas = propuestas;
    }

    public String getPropuestas() {
        return propuestas;
    }

 
    
     
    
    
    
}
