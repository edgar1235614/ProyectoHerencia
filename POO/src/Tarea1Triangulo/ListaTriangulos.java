package Tarea1Triangulo;
import java.util.ArrayList;
public class ListaTriangulos {
	public static void main(String[] args) {
	    Triangulo t1= new Triangulo("Escaleno",'0',83);
	    Triangulo t2= new Triangulo("Isoseles",'2',45);
	    Triangulo t3= new Triangulo("Equilatero",'3',60);
	  //imprime los objetos
	    System.out.println(t1.toString());
	    System.out.println(t2.toString());
	    System.out.println(t3);
	    // crea la lista de productos (vacia)
	      ArrayList<Triangulo>lista= new ArrayList<Triangulo>();
	    //agrega elementos a la lista
	      lista.add(t1);
	      lista.add(t2);
	      lista.add(t3);
	    //imprime la lista con todos los elementos
	      System.out.println(lista.toString());
	}  //fin de main
	
} //fin de la clase