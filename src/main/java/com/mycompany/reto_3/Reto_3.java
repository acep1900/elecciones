/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.reto_3;

import Clases.ClsJdbc;

/**
 *
 * @author Espitia
 */
public class Reto_3 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        ClsJdbc obj_jdbc = new ClsJdbc();
        obj_jdbc.CrearConexion();
        
        
    }
}
