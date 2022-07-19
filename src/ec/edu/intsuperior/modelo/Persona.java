
package ec.edu.intsuperior.modelo;

public class Persona {
    private String nombre;
    private String nombre2;
    private String apellido;
    private String apellido2;
    private String ci;
    private String correo;
    private String telefonoCelular;
    private String edad;
    private String direccion;

    public Persona() {
    }

    public Persona(String nombre, String nombre2, String apellido, String apellido2, String ci, String correo, String telefonoCelular, String edad, String direccion) {
        this.nombre = nombre;
        this.nombre2 = nombre2;
        this.apellido = apellido;
        this.apellido2 = apellido2;
        this.ci = ci;
        this.correo = correo;
        this.telefonoCelular = telefonoCelular;
        this.edad = edad;
        this.direccion = direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTelefonoCelular(String telefonoCelular) {
        this.telefonoCelular = telefonoCelular;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNombre2() {
        return nombre2;
    }

    public String getApellido() {
        return apellido;
    }

    public String getApellido2() {
        return apellido2;
    }

    public String getCi() {
        return ci;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefonoCelular() {
        return telefonoCelular;
    }

    public String getEdad() {
        return edad;
    }

    public String getDireccion() {
        return direccion;
    }
    @Override
    public String toString() {
        
        return "los tipos de datos son: \n "
                + "Cedula: "+getCi()+"\n"
                + "Apellidos y Nombres: "+getApellido()+" "+getApellido2()+
                " "+getNombre()+" "+getNombre2()+"\n"
                + "Direccion: "+getDireccion()+"\n"
                + "Celular: " +getTelefonoCelular()+"\n"
                + "Correo: "+getCorreo()+"\n"
                + "Edad: "+getEdad();
}
}