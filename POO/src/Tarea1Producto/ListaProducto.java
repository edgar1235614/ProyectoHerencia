package Tarea1Producto;

import java.util.ArrayList;

public class ListaProducto {
	 public static void main(String[]args){
	        Producto r1= new Producto("Auto",'E',200000);
	        Producto r2= new Producto("Casa",'L',1200785);
	        Producto r3= new Producto("Mesa",'L',1200);
	      //imprime los objetos
	        System.out.println(r1.toString());
	        System.out.println(r2.toString());
	        System.out.println(r3);
	        // crea la lista de productos (vacia)
	          ArrayList<Producto>lista= new ArrayList<Producto>();
	        //agrega elementos a la lista
	          lista.add(r1);
	          lista.add(r2);
	          lista.add(r3);
	        //imprime la lista con todos los elementos
	          System.out.println(lista.toString());

	      }  //fin de main

}
