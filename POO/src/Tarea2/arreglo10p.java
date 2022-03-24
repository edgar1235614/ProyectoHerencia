package Tarea2;
/*Escribe un programa que lea de teclado 
los datos de 10 personas, crea objetos de 
tipo Persona y almacénalos en una lista 
(ArrayList).
• Procesa los datos para obtener:
– Total de mujeres
– Total de adultos (mayor o igual a 18 años)
– Promedio de edad de todas las personas
– Nombre de la persona mas joven
– Total de adultos mayores (de 60 o mas años*/
import java.util.ArrayList;
public class arreglo10p {
	public static void main(String[]args) {
	ArrayList<Persona02>lista=new ArrayList<>(10);
	String nombre="";
	char sexo='x';
	int edad=0;
	//pedir datos y llenar lista
	for(int i=0;i<10;i++) {
		System.out.println("Nombre de la persona: "+(i+1));
		nombre=Keyboard.readString();
		System.out.println("Sexo de la persona H o M : ");
		sexo=Keyboard.readChar();
		System.out.println("Edad de la persona: ");
		edad=Keyboard.readInt();
		Persona02 persona = new Persona02(nombre,sexo,edad);
		lista.add(persona);
	}
	//Calcular total de mujeres
	int mujeres=0;
	for(int i=0; i<lista.size();i++) {
		if(lista.get(i).getSexo()=='M') {
			mujeres++;
		}
	}
		System.out.println("Total de mujeres: "+ mujeres);
		//Calcular edades
		int adultos=0;
		int sumaEdad=0;
		for(int i=0;i<lista.size();i++) {
			if(lista.get(i).getEdad()>=18) {
				adultos++;
			}
			sumaEdad+=lista.get(i).getEdad();
		}
		System.out.println("Total de adultos: "+ adultos);
		int promEdad=sumaEdad/10;
		System.out.println("Promedio de edades: "+promEdad);
		//nombre de la persona mas joven 
		int masJoven=500;
		int posMasJoven=0;
		for(int i=0;i<lista.size();i++) {
			if(lista.get(i).getEdad()<masJoven) {
				masJoven=lista.get(i).getEdad();
				posMasJoven=i;
			}
		}
		System.out.println("La persona mas joven es: "+ lista.get(posMasJoven).getNombre());
		//total de adultos mayores
		int AduMayores=0;
		for(int i=0;i<lista.size();i++) {
			if(lista.get(i).getEdad()>=60) {
				AduMayores++;
			}
		}
		System.out.println("Total de adultos mayores: "+ AduMayores);
	
	}
}
