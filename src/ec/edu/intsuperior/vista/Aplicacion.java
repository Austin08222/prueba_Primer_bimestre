
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
        Cliente c1 = new Cliente();
         Scanner leer= new Scanner(System.in);
        Persona p1=new Persona();
        Empleado e1=new Empleado ();
        Directivo d1=new Directivo();
        Empresa em1= new Empresa();
      
                
      
               
        System.out.println("Ingrese los datos de la empresa: ");     
        em1.setNombreEmpresa(JOptionPane.showInputDialog("ingrese el nombre de la empresa de la empresa: "));
        em1.setDireccionEmpresa(JOptionPane.showInputDialog("ingrese la direccion de la empresa: "));
        
        System.out.println("ingrese los datos del empleado del Empleado: ");
        e1.setNombreEmpleado(JOptionPane.showInputDialog("Ingresa los nombres del empleado: "));
        e1.setCi(JOptionPane.showInputDialog("Ingresa el numero de cedula del empleado: "));
        e1.setSueldo(JOptionPane.showInputDialog("Ingrese suledo bruto del empleado: "));
        
        System.out.println("ingrese los datos del Directivo: ");
        d1.setDepartamentoBodegero(JOptionPane.showInputDialog("ingrese nombre del encargado del departamento de bodega: "));
        d1.setDepartamentoSecretaria(JOptionPane.showInputDialog("ingrese nombre del encargado del departamento de secretaria: "));
        d1.setDepartamentoTalentohumano(JOptionPane.showInputDialog("ingrese nombre del encargado del departamento de talento humano: "));
        d1.setDepartamentocontabilidad(JOptionPane.showInputDialog("ingrese nombre del encargado del departamento de contabilidad: "));
        d1.setDepartamentoventas(JOptionPane.showInputDialog("ingrese nombre del encargado del departamento de ventas: "));
        d1.setDepartamentolimpieza(JOptionPane.showInputDialog("ingrese nombre del encargado del departamento de limpieza: "));
        
        System.out.println("Ingrese los datos de los clientes: ");
        c1.setCi(JOptionPane.showInputDialog("Ingrese la cedula del cliente: "));
        c1.setNombre(JOptionPane.showInputDialog("ingrese el primer nombre del cliente: "));
        c1.setNombre2(JOptionPane.showInputDialog("ingrese el segundo nombre del cliente: "));
        c1.setApellido(JOptionPane.showInputDialog("ingrese el primer apellido del cliente: "));
        c1.setApellido(JOptionPane.showInputDialog("ingrese el segundo apellido del cliente: "));
        c1.setCorreo(JOptionPane.showInputDialog("ingrese un correo del cliente: "));
        c1.setDireccion(JOptionPane.showInputDialog("ingrese una direccion del cliente: "));
        c1.setEdad(JOptionPane.showInputDialog("ingrese la edad del cliente: "));
        c1.setTelefonoContacto(JOptionPane.showInputDialog("Ingrese el telefono de contacto del cliente: "));
   
        JOptionPane.showMessageDialog(null, em1.toString  ());
        JOptionPane.showMessageDialog(null, e1.toString ());
        JOptionPane.showMessageDialog(null, d1.toString ());
        JOptionPane.showMessageDialog(null, c1.toString ());
        ;
    
   
    }

    
    }

