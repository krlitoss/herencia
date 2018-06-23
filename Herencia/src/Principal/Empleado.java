/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

/**
 *
 * @author Alumno
 */
public class Empleado {
    
     String Nombre;
     String Apellido1;
     String Apellido2;
     int edad;
     int salario;
    
 
     public Empleado() {
        Nombre = "";
        Apellido1 = "";
        Apellido2 = "";
        edad = 0;
        salario = 0;
    }
     
     public Empleado(String Nombre, String Apellido1, String Apellido2, int edad,int salario  ) {
        this.Nombre = Nombre;
        this.Apellido1 = Apellido1;
        this.Apellido2 = Apellido2;
        this.edad = edad;
        this.salario = salario;
    }
    
    
     public String obtenerDatos() {
         return "Nombre: "+Nombre+" Primer Apellido: "+Apellido1+ " Segundo Apellido: "+Apellido2+" edad: "+edad+" salario: "+salario;
     };
    
    
}
