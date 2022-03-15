package Tarea7;
/*¿Cuantos miembros tiene la clase Fruta?
 * 3 miembros: nombre,pesoGramos,caloriasPorGramo
 * ¿Qué clase de miembros son?,de instancia o de clase?
 * Ambos
 * ¿Cuantos métodos existen?
 * Siete metodos
Edgar Alan García Rosales 6/03/2022
Escribe un programa que 
use la clase Fruta para 
crear varios objetos y 
posteriormente use los 
métodos para imprimir 
los datos de los objetos y 
el total de calorías.
 */

public class MainFruta {

	public static void main(String[] args) {
		Fruta manzana = new Fruta("Manzana");
		Fruta pera = new Fruta("Pera");
		Fruta sandia = new Fruta("Sandia");	
		manzana.setCalorias(45);
		pera.setCalorias(62);
		sandia.setCalorias(150);
		manzana.setPeso(220);
		pera.setPeso(100);
		sandia.setPeso(350);
		System.out.println(manzana.toString()+", total calorias:"+manzana.totalCalorias());
		System.out.println(pera.toString()+", total calorias:"+pera.totalCalorias());
		System.out.println(sandia.toString()+", total calorias:"+sandia.totalCalorias());
	}

}
