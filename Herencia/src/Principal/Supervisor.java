
package Principal;

/**
 *
 * @author Alumno
 */
public class Supervisor extends Empleado {

    String empleadossupervisados;
    String areas;

    public Supervisor(String Nombre, String Apellido1, String Apellido2, int edad, int salario, String empleadossupervisados, String areas) {
        super(Nombre, Apellido1, Apellido2, edad, salario);
    }

    public String obtenerDatos() {
        return super.obtenerDatos() + "Nombre; " + Nombre + "Primer Apellido: " + Apellido1 + "Segundo Apellido:  " + Apellido2 + "Edad: " + edad + "salario" + salario;
    }

}
