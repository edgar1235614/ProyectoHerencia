package Tarea5;
/*Problema: pedir al usuario que diga cual es su nivel de ajedrez y
 *  registrar su respuesta, utilizando un arreglo de tipo enum*/
public class Ajedrez {
	public static void main(String[]args) {
		Nivel[] niveles = Nivel.values();
		for (int i = 0; i < niveles.length; i++) {
			System.out.println((i+1)+". "+niveles[i]);
		}
		System.out.println("¿Cuál crees que es tu nivel en ajedrez? ");
		int resp=Keyboard.readInt();
		System.out.println("Su nivel es: "+niveles[resp-1]);
		
		
	}
}
