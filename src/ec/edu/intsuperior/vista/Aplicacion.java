package ec.edu.intsuperior.vista;
import ec.edu.intsuperior.modelo.Cliente;
import ec.edu.intsuperior.modelo.Directivo;
import ec.edu.intsuperior.modelo.Empleado;
import ec.edu.intsuperior.modelo.Empresa;
import ec.edu.intsuperior.modelo.Persona;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Aplicacion {
    public static void main(String[] args) {
        Cliente cli = new Cliente();
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();
        Cliente c3 = new Cliente();
        Cliente c4 = new Cliente();
        Cliente c5 = new Cliente();
         Scanner leer= new Scanner(System.in);
        Persona p1=new Persona();
        Empleado e1=new Empleado ();
        Empleado e2=new Empleado ();
        Empleado e3=new Empleado ();
        Empleado e4=new Empleado ();
        Empleado e5=new Empleado ();
        Directivo d1=new Directivo();
        Empresa em1= new Empresa();
      
                
      
               
        System.out.println("Ingrese los datos de la empresa: ");     
        em1.setNombreEmpresa(JOptionPane.showInputDialog("ingrese el nombre de la empresa de la empresa: "));
        em1.setDireccionEmpresa(JOptionPane.showInputDialog("ingrese la direccion de la empresa: "));
        
        System.out.println("ingrese los datos del empleado del Empleado: ");
        e1.setNombreEmpleado(JOptionPane.showInputDialog("Ingresa los nombres del empleado1: "));
        e1.setCi(JOptionPane.showInputDialog("Ingresa el numero de cedula del empleado1: "));
        e1.setSueldo(JOptionPane.showInputDialog("Ingrese suledo bruto del empleado1: "));
        e2.setNombreEmpleado(JOptionPane.showInputDialog("Ingresa los nombres del empleado2: "));
        e2.setCi(JOptionPane.showInputDialog("Ingresa el numero de cedula del empleado2: "));
        e2.setSueldo(JOptionPane.showInputDialog("Ingrese suledo bruto del empleado2: "));
        e3.setNombreEmpleado(JOptionPane.showInputDialog("Ingresa los nombres del empleado3: "));
        e3.setCi(JOptionPane.showInputDialog("Ingresa el numero de cedula del empleado3: "));
        e3.setSueldo(JOptionPane.showInputDialog("Ingrese suledo bruto del empleado3: "));
        e4.setNombreEmpleado(JOptionPane.showInputDialog("Ingresa los nombres del empleado4: "));
        e4.setCi(JOptionPane.showInputDialog("Ingresa el numero de cedula del empleado4: "));
        e4.setSueldo(JOptionPane.showInputDialog("Ingrese suledo bruto del empleado4: "));
        e5.setNombreEmpleado(JOptionPane.showInputDialog("Ingresa los nombres del empleado5: "));
        e5.setCi(JOptionPane.showInputDialog("Ingresa el numero de cedula del empleado5: "));
        e5.setSueldo(JOptionPane.showInputDialog("Ingrese suledo bruto del empleado5: "));
                
          
        System.out.println("ingrese los datos del Directivo: ");
        d1.setDepartamentoBodegero(JOptionPane.showInputDialog("ingrese nombre del encargado del departamento de bodega: "));
        d1.setDepartamentoSecretaria(JOptionPane.showInputDialog("ingrese nombre del encargado del departamento de secretaria: "));
        d1.setDepartamentoTalentohumano(JOptionPane.showInputDialog("ingrese nombre del encargado del departamento de talento humano: "));
        d1.setDepartamentocontabilidad(JOptionPane.showInputDialog("ingrese nombre del encargado del departamento de contabilidad: "));
        d1.setDepartamentoventas(JOptionPane.showInputDialog("ingrese nombre del encargado del departamento de ventas: "));
        d1.setDepartamentolimpieza(JOptionPane.showInputDialog("ingrese nombre del encargado del departamento de limpieza: "));
        
        System.out.println("Ingrese los datos de los clientes: ");
        
       
        c1.setCi(JOptionPane.showInputDialog("Ingrese la cedula del cliente 1: "));
        c1.setNombre(JOptionPane.showInputDialog("ingrese el primer nombre del cliente 1: "));
        c1.setNombre2(JOptionPane.showInputDialog("ingrese el segundo nombre del cliente1: "));
        c1.setApellido(JOptionPane.showInputDialog("ingrese el primer apellido del cliente1: "));
        c1.setApellido(JOptionPane.showInputDialog("ingrese el segundo apellido del cliente1: "));
        c1.setCorreo(JOptionPane.showInputDialog("ingrese un correo del cliente1: "));
        c1.setDireccion(JOptionPane.showInputDialog("ingrese una direccion del cliente1: "));
        c1.setEdad(JOptionPane.showInputDialog("ingrese la edad del cliente1: "));
        c1.setTelefonoContacto(JOptionPane.showInputDialog("Ingrese el telefono de contacto del cliente1: "));
   
        c2.setCi(JOptionPane.showInputDialog("Ingrese la cedula del cliente 2: "));
        c2.setNombre(JOptionPane.showInputDialog("ingrese el primer nombre del cliente : "));
        c2.setNombre2(JOptionPane.showInputDialog("ingrese el segundo nombre del cliente2: "));
        c2.setApellido(JOptionPane.showInputDialog("ingrese el primer apellido del cliente2: "));
        c2.setApellido(JOptionPane.showInputDialog("ingrese el segundo apellido del cliente2: "));
        c2.setCorreo(JOptionPane.showInputDialog("ingrese un correo del cliente2: "));
        c2.setDireccion(JOptionPane.showInputDialog("ingrese una direccion del cliente2: "));
        c2.setEdad(JOptionPane.showInputDialog("ingrese la edad del cliente2: "));
        c2.setTelefonoContacto(JOptionPane.showInputDialog("Ingrese el telefono de contacto del cliente2: "));
   
        c3.setCi(JOptionPane.showInputDialog("Ingrese la cedula del cliente 3: "));
        c3.setNombre(JOptionPane.showInputDialog("ingrese el primer nombre del cliente 3: "));
        c3.setNombre2(JOptionPane.showInputDialog("ingrese el segundo nombre del cliente3: "));
        c3.setApellido(JOptionPane.showInputDialog("ingrese el primer apellido del cliente3: "));
        c3.setApellido(JOptionPane.showInputDialog("ingrese el segundo apellido del cliente3: "));
        c3.setCorreo(JOptionPane.showInputDialog("ingrese un correo del cliente3: "));
        c3.setDireccion(JOptionPane.showInputDialog("ingrese una direccion del cliente3: "));
        c3.setEdad(JOptionPane.showInputDialog("ingrese la edad del cliente3: "));
        c3.setTelefonoContacto(JOptionPane.showInputDialog("Ingrese el telefono de contacto del cliente3: "));
   
        c4.setCi(JOptionPane.showInputDialog("Ingrese la cedula del cliente 4: "));
        c4.setNombre(JOptionPane.showInputDialog("ingrese el primer nombre del cliente 4: "));
        c4.setNombre2(JOptionPane.showInputDialog("ingrese el segundo nombre del cliente4: "));
        c4.setApellido(JOptionPane.showInputDialog("ingrese el primer apellido del cliente4: "));
        c4.setApellido(JOptionPane.showInputDialog("ingrese el segundo apellido del cliente4: "));
        c4.setCorreo(JOptionPane.showInputDialog("ingrese un correo del cliente4: "));
        c4.setDireccion(JOptionPane.showInputDialog("ingrese una direccion del cliente4: "));
        c4.setEdad(JOptionPane.showInputDialog("ingrese la edad del cliente4: "));
        c4.setTelefonoContacto(JOptionPane.showInputDialog("Ingrese el telefono de contacto del cliente4: "));
  
        c5.setCi(JOptionPane.showInputDialog("Ingrese la cedula del cliente 5: "));
        c5.setNombre(JOptionPane.showInputDialog("ingrese el primer nombre del cliente 5: "));
        c5.setNombre2(JOptionPane.showInputDialog("ingrese el segundo nombre del cliente5: "));
        c5.setApellido(JOptionPane.showInputDialog("ingrese el primer apellido del cliente5: "));
        c5.setApellido(JOptionPane.showInputDialog("ingrese el segundo apellido del cliente5: "));
        c5.setCorreo(JOptionPane.showInputDialog("ingrese un correo del cliente5: "));
        c5.setDireccion(JOptionPane.showInputDialog("ingrese una direccion del cliente5: "));
        c5.setEdad(JOptionPane.showInputDialog("ingrese la edad del cliente5: "));
        c5.setTelefonoContacto(JOptionPane.showInputDialog("Ingrese el telefono de contacto del cliente5: "));
   
        JOptionPane.showMessageDialog(null, em1.toString  ());
        
        JOptionPane.showMessageDialog(null, e1.toString ());
        JOptionPane.showMessageDialog(null, e2.toString ());
        JOptionPane.showMessageDialog(null, e3.toString ());
        JOptionPane.showMessageDialog(null, e4.toString ());
        JOptionPane.showMessageDialog(null, e5.toString ());
        
        JOptionPane.showMessageDialog(null, d1.toString ());
        
        
        //clientes
 
        JOptionPane.showMessageDialog(null, c1.toString ());
        JOptionPane.showMessageDialog(null, c2.toString ());
        JOptionPane.showMessageDialog(null, c3.toString ());
        JOptionPane.showMessageDialog(null, c4.toString ());
        JOptionPane.showMessageDialog(null, c5.toString ());
        
    
   
    }

    
    }

