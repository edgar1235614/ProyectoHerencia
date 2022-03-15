package Tarea6;
import java.util.Arrays;
/* Escribe las clases Punto y UsaPunto
• Compila ambas clases y corrige los errores
• Ejecuta la clase UsaPunto
• Escribe un reporte con:
– Los errores de compilación que recibiste
– Los resultados de la ejecución de UsaPunto
– Modifica el programa para 
• Declarar un arreglo de tipo Punto
• Almacena 10 puntos solicitando los datos (x, y) por teclado
• Imprime todos los puntos almacenados en el arreglo
• Cambia a private el atributo de clase totalPuntos
• Agrega un método estático getTotalPuntos para obtener el total  de puntos
• Cambia el encabezado del método toString (agrega un parámetro)
*/
public class UsaPunto {
	public static void main(String[]args) {
		Punto punto1 = new Punto(2,1);
		Punto punto2 = new Punto(5,5);
		Punto punto3 = punto1;
		int []equis= new int[10];
		int []ygriega= new int[10];
		System.out.println("Punto 1 = "+punto1);
		System.out.println("Punto 2 = "+punto2.toString());
		System.out.println("Punto 3 = "+ punto3);
		for(int i=0; i<10;i++) {	
			System.out.println("Punto "+(i+1));
			System.out.println("Coordenada X: ");
			equis[i]=Keyboard.readInt();
			System.out.println("Coordenada Y: ");
			ygriega[i]=Keyboard.readInt();
		}
		
		puntos10(equis,ygriega);
		Punto[] puntos = {punto1,punto2};
		System.out.println(Arrays.toString(puntos));
		System.out.println("Puntos creados: "+Punto.totalPuntos);
	}
	public static void puntos10 (int x[],int y[]) {
		for (int i = 0; i < x.length; i++) {
			System.out.print("Punto "+(i+1)+" ("+x[i]+",");
			System.out.print(y[i]+")");
			System.out.println(" ");				
		}
	
	}
}
