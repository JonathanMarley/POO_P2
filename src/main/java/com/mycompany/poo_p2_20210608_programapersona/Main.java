/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.poo_p2_20210608_programapersona;

/**
 *
 * @author Pablo Daniel
 */
import com.mycompany.poo_p2_20210608_programapersona.objeto.Persona;
import java.util.List;
import java.util.Scanner;
public class Main {
    private static Scanner capturador;
    
    //ES LA DECLARACION DE UNA CONSTANTE GRACIAS AL USO DE FINAL    
    private static final int OPCION_PREDETERMINADO=-1;
    private static final int OPCION_INGRESAR_PERSONA=1;
    private static final int OPCION_MODIFICAR_PERSONA=2;
    private static final int OPCION_ELIMINAR_PERSONA=3;
    private static final int OPCION_SALIR=0;
    
    //DECLARACION DE UNA VARIABLE GLOBAL(TODO EL PROGRAMA PUEDE VERLA)
    private static List<Persona> lista;
    public static String leerTexto(String campo){
        System.out.println("Ingrese "+campo+":");
        String texto = capturador.next();
        return texto;
    }
    
     public static int leerInt(String campo){
        System.out.println("Ingrese "+campo+":");
        int numero = capturador.nextInt();
        return numero;
    }
     
      public static double leerDouble(String campo){
        System.out.println("Ingrese "+campo+":");
        double numero = capturador.nextDouble();
        return numero;
    }
      
      public static void imprimirMenu(){
          System.out.println("==========================");
          System.out.println("1.- Ingrese persona");
          System.out.println("2.- Editar persona");
          System.out.println("3.- Consultar persona");
          System.out.println("4.- Salir");
          System.out.println("==========================");
      }
      
      public static void ingresarPersona(){
          System.out.println(" ________________________ ");
          System.out.println("*   INGRESAR PERSONA *");
          System.out.println(" ________________________ ");
          String identidad = leerTexto("Identidad");
          String nombre = leerTexto("Nombre");
          int fechaNacimiento=leerInt("Fecha Nacimiento (yyyMMdd)");
          double peso=leerDouble("peso");
          
          lista.add(new Persona(identidad,nombre,fechaNacimiento,peso));
          System.out.println();
          System.out.println("!Persona Ingresada Correctamente");
      }
      
      public static void imprimirLiat(){
          System.out.println("******************************");
          System.out.println("* LISTADO DE PERSONAS *");
          System.out.println("******************************");
          System.out.println("+----------------------------------------------+");
          System.out.println("| IDENTIDAD | NOMBRE | FECHA NACIMIENTO | PESO |");
          System.out.println("+----------------------------------------------+");
          for (Persona persona : lista) {
              System.out.println("| "+persona.getIdentidad()+"  |  "
                                     +persona.getNombre()+"  |  "
                                     +persona.getFechaNacmiento()+"  |  "
                                     +persona.getPeso()+ " |  ");
          }
           System.out.println("+----------------------------------------------+");
      }
      
      
    
    public static void main(String[] args) {
        System.out.println("** PO **");
        Scanner capturador = new Scanner(System.in);
        int opcionSelecionada=OPCION_PREDETERMINADO;
        
        
        while (opcionSelecionada!=0) {
            
            imprimirMenu();
            opcionSelecionada=leerInt("una seleccion:");
            
            switch (opcionSelecionada) {
                case OPCION_INGRESAR_PERSONA:
                    ingresarPersona();
                    break;
                 case OPCION_MODIFICAR_PERSONA:
                     System.out.println("modicando una persona");
                    break;
                 case OPCION_ELIMINAR_PERSONA:
                     System.out.println("elimando una persona");
                    break;
                 case OPCION_SALIR:
                     System.out.println("Programa Finalizado...");
                     System.out.println("****ADIOS****");
                    break;    
                default:
                    System.out.println("opcion desconocida.");;
            }
        }
    
    }
}
