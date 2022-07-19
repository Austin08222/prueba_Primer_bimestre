
package ec.edu.intsuperior.modelo;

public class Empleado extends Persona{
public String nombreEmpleado;
public String sueldo;
public String empleado1;
public String empleado2;
public String empleado3;
public String empleado4;
public String empleado5;

    public Empleado() {
    }

    public Empleado(String nombreEmpleado, String sueldo, String empleado1, String empleado2, String empleado3, String empleado4, String empleado5) {
        this.nombreEmpleado = nombreEmpleado;
        this.sueldo = sueldo;
        this.empleado1 = empleado1;
        this.empleado2 = empleado2;
        this.empleado3 = empleado3;
        this.empleado4 = empleado4;
        this.empleado5 = empleado5;
    }

    public Empleado(String nombre, String nombre2, String apellido, String apellido2, String ci, String correo, String telefonoCelular, String edad, String direccion) {
        super(nombre, nombre2, apellido, apellido2, ci, correo, telefonoCelular, edad, direccion);
    }

    public Empleado(String nombreEmpleado, String sueldo, String empleado1, String empleado2, String empleado3, String empleado4, String empleado5, String nombre, String nombre2, String apellido, String apellido2, String ci, String correo, String telefonoCelular, String edad, String direccion) {
        super(nombre, nombre2, apellido, apellido2, ci, correo, telefonoCelular, edad, direccion);
        this.nombreEmpleado = nombreEmpleado;
        this.sueldo = sueldo;
        this.empleado1 = empleado1;
        this.empleado2 = empleado2;
        this.empleado3 = empleado3;
        this.empleado4 = empleado4;
        this.empleado5 = empleado5;
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

    public String getEmpleado1() {
        return empleado1;
    }

    public void setEmpleado1(String empleado1) {
        this.empleado1 = empleado1;
    }

    public String getEmpleado2() {
        return empleado2;
    }

    public void setEmpleado2(String empleado2) {
        this.empleado2 = empleado2;
    }

    public String getEmpleado3() {
        return empleado3;
    }

    public void setEmpleado3(String empleado3) {
        this.empleado3 = empleado3;
    }

    public String getEmpleado4() {
        return empleado4;
    }

    public void setEmpleado4(String empleado4) {
        this.empleado4 = empleado4;
    }

    public String getEmpleado5() {
        return empleado5;
    }

    public void setEmpleado5(String empleado5) {
        this.empleado5 = empleado5;
    }




   



    @Override
    public String toString() {
        return "el nombre del empleado es :" +getNombreEmpleado()
        + "el numero de cedula del empleado es :" +getCi()+"\n"
        +"el suledo del empleado es: "+getSueldo()+"\n";
        
        
      
        
    }

   
    
    }
      
     
  

