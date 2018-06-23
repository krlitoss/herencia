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
public class Obrero extends Empleado {

    int horaextra;
    int pagohora;

    public Obrero(String Nombre, String Apellido1, String Apellido2, int edad, int salario) {
        super(Nombre,Apellido1,Apellido2, edad, salario);
    }
    
    public String obtenerDatos (){
    return super.obtenerDatos ()+ "Nombre; "+Nombre+ "Primer Apellido: "+Apellido1+"Segundo Apellido:  "+Apellido2+ "Edad: " +edad+ "salario" +salario;
    }
    

}
    
    
  


