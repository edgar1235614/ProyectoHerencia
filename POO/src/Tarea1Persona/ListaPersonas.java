/* Programa para usar la clase Persona.java
creando una lista de objetos de tipo Persona usa ArrayList para almacenar los objetos
*/
package Tarea1Persona;
import java.util.ArrayList;
public class ListaPersonas{
  public static void main(String[]args){
    Persona p1= new Persona("Juan",'H',5);
    Persona p2= new Persona("Maria",'M',50);
    Persona p3= new Persona("Carlos",'H',18);
  //imprime los objetos
    System.out.println(p1.toString());
    System.out.println(p2.toString());
    System.out.println(p3);
    // crea la lista de Personas (vacia)
      ArrayList<Persona>lista= new ArrayList<Persona>();
    //agrega elementos a la lista
      lista.add(p1);
      lista.add(p2);
      lista.add(p3);
    //imprime la lista con todos los elementos
      System.out.println(lista.toString());

  }  //fin de main
} //fin de la clase