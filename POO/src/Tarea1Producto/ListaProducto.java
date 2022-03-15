package Tarea1Producto;
/* Programa para usar la clase Producto.java
creando una lista de objetos de tipo Prodcuto usa ArrayList para almacenar los objetos
*/
import java.util.ArrayList;
public class ListaProducto{
  public static void main(String[]args){
    Triangulo r1= new Triangulo("Auto",'E',200000);
    Triangulo r2= new Triangulo("Casa",'L',1200785);
    Triangulo r3= new Triangulo("Mesa",'L',1200);
  //imprime los objetos
    System.out.println(r1.toString());
    System.out.println(r2.toString());
    System.out.println(r3);
    // crea la lista de productos (vacia)
      ArrayList<Triangulo>lista= new ArrayList<Triangulo>();
    //agrega elementos a la lista
      lista.add(r1);
      lista.add(r2);
      lista.add(r3);
    //imprime la lista con todos los elementos
      System.out.println(lista.toString());

  }  //fin de main
} //fin de la clase