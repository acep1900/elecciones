/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Clases.ClsCandidato;
import Modelos.MdlCandidato;
import java.util.LinkedList;

/**
 *
 * @author Espitia
 */
public class CtlCandidato {
    
    MdlCandidato Obj_modelo; // se crea el objeto de la clase modelo 

    public CtlCandidato() { // se crea el constructor del objeto creado en odelo
        this.Obj_modelo = new MdlCandidato();
    }
    
    
    
    public boolean agregarCandidato(ClsCandidato candidato){
        boolean respuesta = this.Obj_modelo.agregarCandidato(candidato);
        return true;
    
    
    }
    
    
    public LinkedList<ClsCandidato> ObtenerCandidatos(){      //metodo
        
     return this.Obj_modelo.ObtenerCandidatos();//llama el metodo de la clase modelo atraves del obj modelo
     
    };
    
}
