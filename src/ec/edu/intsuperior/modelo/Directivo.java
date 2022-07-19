/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;
/**
 *
 * @author jonat
 */
public class Directivo  {
  
    public String categoria;
    public String departamentolimpieza;
    public String departamentoSecretaria;
    public String departamentocontabilidad;
    public String departamentoventas;
    public String departamentoTalentohumano;
    public String departamentoBodegero;

    public Directivo() {
    }

    public Directivo(String categoria, String departamentolimpieza, String departamentoSecretaria, String departamentocontabilidad, String departamentoventas, String departamentoTalentohumano, String departamentoBodegero) {
        this.categoria = categoria;
        this.departamentolimpieza = departamentolimpieza;
        this.departamentoSecretaria = departamentoSecretaria;
        this.departamentocontabilidad = departamentocontabilidad;
        this.departamentoventas = departamentoventas;
        this.departamentoTalentohumano = departamentoTalentohumano;
        this.departamentoBodegero = departamentoBodegero;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDepartamentolimpieza() {
        return departamentolimpieza;
    }

    public void setDepartamentolimpieza(String departamentolimpieza) {
        this.departamentolimpieza = departamentolimpieza;
    }

    public String getDepartamentoSecretaria() {
        return departamentoSecretaria;
    }

    public void setDepartamentoSecretaria(String departamentoSecretaria) {
        this.departamentoSecretaria = departamentoSecretaria;
    }

    public String getDepartamentocontabilidad() {
        return departamentocontabilidad;
    }

    public void setDepartamentocontabilidad(String departamentocontabilidad) {
        this.departamentocontabilidad = departamentocontabilidad;
    }

    public String getDepartamentoventas() {
        return departamentoventas;
    }

    public void setDepartamentoventas(String departamentoventas) {
        this.departamentoventas = departamentoventas;
    }

    public String getDepartamentoTalentohumano() {
        return departamentoTalentohumano;
    }

    public void setDepartamentoTalentohumano(String departamentoTalentohumano) {
        this.departamentoTalentohumano = departamentoTalentohumano;
    }

    public String getDepartamentoBodegero() {
        return departamentoBodegero;
    }

    public void setDepartamentoBodegero(String departamentoBodegero) {
        this.departamentoBodegero = departamentoBodegero;
    }

    

    @Override
    public String toString() {
        return  "EL DIRECITVO DE LA EMPRESA ES:                         "
               +"el encargado de bodega es :"  +getDepartamentoBodegero()+"\n"
                + "el encargado de secretaria es :"  +getDepartamentoSecretaria()+"\n"
        + "el encargado de talentohumano es :"  +getDepartamentoTalentohumano()+"\n"
        + "el encargado de contabilidad es :"  +getDepartamentocontabilidad()+"\n"
        + "el encargado de limpieza  es:"  +getDepartamentolimpieza()+"\n"
        + "el encargado de ventas es  :"  +getDepartamentoventas()+"\n";

       
        
    }

    
    }
    

