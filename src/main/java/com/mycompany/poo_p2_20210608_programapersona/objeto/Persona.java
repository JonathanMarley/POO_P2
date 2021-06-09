/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poo_p2_20210608_programapersona.objeto;

import java.util.Date;

/**
 *
 * @author Pablo Daniel
 */
public class Persona {
     private String identidad;
    private String nombre;
    private int fechaNacmiento;
    private double peso;
    //metodos constructores

  //es el constructor por defecto o predeterminado
    public Persona() {
    }
     //este es un constructor absoluto
    public Persona(String identidad, String nombre, int fechaNacmiento, double peso) {
    System.out.println("Inicia la creacion de un objeto con constructor");
    //inicializando el objeto, asignadole valores a sus atributos
        this.identidad = identidad;
        this.nombre = nombre;
        this.fechaNacmiento = fechaNacmiento;
        this.peso = peso;
       System.out.println("Finaliza la creacion de un onjeto con constructor");
    }
    
  /*
  =========================================================
  3. Get y Set: son metodos para acceder a un valor de un atributos y asignar un valor al mismo
  =========================================================
  */

  //4.1 Get y Set de identidad
    public String getIdentidad() {
        return this.identidad;
    } 
     //Nota los get no reciben parametros a menos que sea parte de un requerimiento
    public void setIdentidad(String identidad) {
        this.identidad = identidad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFechaNacmiento() {
        return this.fechaNacmiento;
    }

    public void setFechaNacmiento(int fechaNacmiento) {
        this.fechaNacmiento = fechaNacmiento;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
   
    

    @Override
   public String toString() {
        return "Persona{"
        + this.identidad+","
        +this.nombre+","
        +this.fechaNacmiento+","
        +this.peso
          +"}";
    }
    @Override
    public boolean equals(Object object){
        if (this==object) {
            return true;
        }
        if (object==null) {
            return false;
        }
        if (this.getClass()!=object.getClass()) {
            return false;
        }
        Persona objectPersona=(Persona) object;
       
        if (this.identidad==objectPersona.getIdentidad()) {
            return true;
        }else{
            return false;
        }
    }
    
    private int getEdad(){
        return this.getAnioActual()-this.getAnioNacimiento();
    }
    
    private int getAnioActual(){
        Date fechaActual=new Date();
        int anioActual=fechaActual.getYear()+1900;
        return anioActual;
    }
    private int getAnioNacimiento(){
    String fechaConvertir=String.valueOf(this.fechaNacmiento);
    return Integer.valueOf(fechaConvertir.substring(0,4));
}
}
