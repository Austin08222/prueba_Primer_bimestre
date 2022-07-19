
package ec.edu.intsuperior.modelo;

public class Cliente extends Persona{
    public String cliente1;
    public String cliente2;
    public String cliente3;
    public String cliente4;
    public String cliente5;

    public String telefonoContacto;

    public Cliente() {
    }

    public Cliente(String cliente1, String cliente2, String cliente3, String cliente4, String cliente5, String telefonoContacto, String nombre, String nombre2, String apellido, String apellido2, String ci, String correo, String telefonoCelular, String edad, String direccion) {
        super(nombre, nombre2, apellido, apellido2, ci, correo, telefonoCelular, edad, direccion);
        this.cliente1 = cliente1;
        this.cliente2 = cliente2;
        this.cliente3 = cliente3;
        this.cliente4 = cliente4;
        this.cliente5 = cliente5;
        this.telefonoContacto = telefonoContacto;
    }

    public String getCliente1() {
        return cliente1;
    }

    public void setCliente1(String cliente1) {
        this.cliente1 = cliente1;
    }

    public String getCliente2() {
        return cliente2;
    }

    public void setCliente2(String cliente2) {
        this.cliente2 = cliente2;
    }

    public String getCliente3() {
        return cliente3;
    }

    public void setCliente3(String cliente3) {
        this.cliente3 = cliente3;
    }

    public String getCliente4() {
        return cliente4;
    }

    public void setCliente4(String cliente4) {
        this.cliente4 = cliente4;
    }

    public String getCliente5() {
        return cliente5;
    }

    public void setCliente5(String cliente5) {
        this.cliente5 = cliente5;
    }

    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }
    
    

   
   
   
    
    @Override
    public String toString() {
        return   "los datos de los clientes son: "+"\n"
        + "los datos del cliente 1 son:" +getCliente1() +" "+getCi()+" " +getCorreo()+" "+getDireccion()+" "+getEdad()+" "+getTelefonoContacto()
        + "los datos del cliente 2 son:" +getCliente2() +" "+getCi()+" " +getCorreo()+" "+getDireccion()+" "+getEdad()+" "+getTelefonoContacto()
        + "los datos del cliente 3 son:" +getCliente3() +" "+getCi()+" " +getCorreo()+" "+getDireccion()+" "+getEdad()+" "+getTelefonoContacto()
        + "los datos del cliente 4 son:" +getCliente4() +" "+getCi()+" " +getCorreo()+" "+getDireccion()+" "+getEdad()+" "+getTelefonoContacto()
        + "los datos del cliente 5 son:" +getCliente5() +" "+getCi()+" " +getCorreo()+" "+getDireccion()+" "+getEdad()+" "+getTelefonoContacto()
                ;
                
              /*  +"Cedula: "+getCi()+"\n"
                + "Apellidos y Nombres: "+getApellido()+" "+getApellido2()+
                " "+getNombre()+" "+getNombre2()+"\n"
                + "Direccion: "+getDireccion()+"\n"
                + "Celular: " +getTelefonoCelular()+"\n"
                + "Correo: "+getCorreo()+"\n"
                + "Edad: "+getEdad()+"\n"
                + "el telefono de contacto del cliente es : " +getTelefonoContacto();*/
                
        
    }
    
}
