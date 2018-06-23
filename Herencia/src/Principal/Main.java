/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.util.ArrayList;

/**
 *
 * @author Alumno
 */
public class Main {
    
    public static void main(String[] args) {
        
        ArrayList<Empleado> listas = new ArrayList<Empleado>();
        
        Empleado empleado1 = new Empleado ();
        listas.add(empleado1);
        
        Empleado empleado2 = new Empleado ("Chicharito", "Hernandez", "Hernandez", 60, 1000000);
        listas.add(empleado2);
        
        
        for (int i=0; i<listas.size(); i++){
            System.out.println(listas.get(i).obtenerDatos());
        
        }
        
    }
    
    
}
