package Controladores;

import Clases.ClsPersona;
import Modelos.MdlVotante;
import java.util.LinkedList;

/**
 *
 * @author Espitia
 */
public class CtlVotante {
  MdlVotante Obj_modelo;
    
    
    public CtlVotante() {
        this.Obj_modelo = new MdlVotante();
    }
    
    
    public boolean agregarVotante(ClsPersona votante){
        boolean respuestaVotante = this.Obj_modelo.agregarVotante(votante);
        return true;
    
    
    }
    
    public LinkedList<ClsPersona>ObtenerVotante(){      //metodo
        
     return this.Obj_modelo.ObtenerVotante();//llama el metodo de la clase modelo atraves del obj modelo
     
    };
    
    
    
    
}
