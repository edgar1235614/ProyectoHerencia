/*?Cuantos miembros tiene la clase Fruta?
 * 3 miembros: nombre,pesoGramos,caloriasPorGramo
 * ?Qu? clase de miembros son?,de instancia o de clase?
 * Ambos
 * ?Cuantos m?todos existen?
 * Siete metodos
Edgar Alan Garc?a Rosales 6/03/2022
Escribe un programa que 
use la clase Fruta para 
crear varios objetos y 
posteriormente use los 
m?todos para imprimir 
los datos de los objetos y 
el total de calor?as.
 */
package Tarea7;
public class Fruta {
	private String nombre;
	private int pesoGramos;
	private int caloriasPorGramo;
	Fruta(String n){//constructor 
		nombre=n;
	}
	public void setPeso(int g) {
		pesoGramos=g;
	}
	public int getPeso() {
		return pesoGramos;
	}
	public void setCalorias(int c) {
		caloriasPorGramo=c;
	}
	public int getCalorias() {
		return caloriasPorGramo;
	}
	public int totalCalorias() {
		return pesoGramos*caloriasPorGramo;
	}
	public String toString() {
		return nombre +" peso: "+pesoGramos+" gramos "+", Calorias por gramo: "+caloriasPorGramo;
	}
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
