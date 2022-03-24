package Tarea1Persona;
import java.util.ArrayList;
public class ListaPersonas {
	  public static void main(String[]args){
		    Persona1 p1= new Persona1("Juan",'H',5);
		    Persona1 p2= new Persona1("Maria",'M',50);
		    Persona1 p3= new Persona1("Carlos",'H',18);
		  //imprime los objetos
		    System.out.println(p1.toString());
		    System.out.println(p2.toString());
		    System.out.println(p3);
		    // crea la lista de Personas (vacia)
		      ArrayList<Persona1>lista= new ArrayList<Persona1>();
		    //agrega elementos a la lista
		      lista.add(p1);
		      lista.add(p2);
		      lista.add(p3);
		    //imprime la lista con todos los elementos
		      System.out.println(lista.toString());

		  }  //fin de main

}
