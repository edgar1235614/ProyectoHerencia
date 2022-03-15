// Declaracion de la clase Telefono.java contiene atributos tipo, clave, numero.
/* Metodos: get/set para los atributos y toString*/
package Proyecto;
public class Telefono {
	//atributos private
	private int clave;
	private char tipo;
	private String numero;
	
	// constructor con los 3 parametros para los atributos 
	public Telefono(char tipo, int clave, String numero) {
		this.tipo = tipo;
		this.clave = clave;
		this.numero = numero;
	}
	
	@Override
	public String toString(){
		return "\t" +tipo+"\t" +clave +"\t" +numero;
	}
	//Obten el tipo de telefono(fijo "f" o móvil "m".
	public char getTipo() {
		return this.tipo;
	}
	
	public void setTipo(char tipo) {
		this.tipo= tipo;
	}
	
	//obten la clave del país +xx
	public int getClave() {
		return this.clave;
	}
	
	public void setClave(int clave){
		this.clave = clave;
	}
	
	//Obten el numero telefonico
	public String getNumero(){
		return this.numero;
	}
	
	public void setNumero(String numero){
		this.numero = numero;
	}
} //fin de la clase
