
package ec.edu.intsuperior.modelo;

public class Cliente extends Persona{
    
    public String telefonoContacto;

    public Cliente() {
    }

    public Cliente(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

    public Cliente(String telefonoContacto, String nombre, String nombre2, String apellido, String apellido2, String ci, String correo, String telefonoCelular, String edad, String direccion) {
        super(nombre, nombre2, apellido, apellido2, ci, correo, telefonoCelular, edad, direccion);
        this.telefonoContacto = telefonoContacto;
    }

    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

   
   
   
    
    @Override
    public String toString() {
        return   "los datos del cliente son: "
                +"Cedula: "+getCi()+"\n"
                + "Apellidos y Nombres: "+getApellido()+" "+getApellido2()+
                " "+getNombre()+" "+getNombre2()+"\n"
                + "Direccion: "+getDireccion()+"\n"
                + "Celular: " +getTelefonoCelular()+"\n"
                + "Correo: "+getCorreo()+"\n"
                + "Edad: "+getEdad()+"\n"
                + "el telefono de contacto del cliente es : " +getTelefonoContacto();
                
        
    }
    
}
