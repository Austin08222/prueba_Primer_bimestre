
package ec.edu.intsuperior.modelo;

public class Empleado extends Persona{
public String nombreEmpleado;
public String sueldo;
    

    public Empleado() {
    }

    public Empleado(String nombreEmpleado, String sueldo, String nombre, String nombre2, String apellido, String apellido2, String ci, String correo, String telefonoCelular, String edad, String direccion) {
        super(nombre, nombre2, apellido, apellido2, ci, correo, telefonoCelular, edad, direccion);
        this.nombreEmpleado = nombreEmpleado;
        this.sueldo = sueldo;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getSueldo() {
        return sueldo;
    }

    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }

   



    @Override
    public String toString() {
        return  "el nombre del empleado es :" +getNombreEmpleado()
        + "el numero de cedula del empleado es :" +getCi()+"\n"
        +"el suledo del empleado es: "+getSueldo()+"\n";
        
      
        
    }
    
    }
      
     
  

