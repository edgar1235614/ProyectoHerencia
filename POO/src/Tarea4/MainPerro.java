package Tarea4;
import java.util.ArrayList;
public class MainPerro {
	public static void main(String[]args){
		//crea objetos de tipo Perro
		String[]nombre= {"Firulais","Tobby","Bethoven"};
		char [] sexo= {'M','M','M'};
		String []raza= {"Beagle","Chihuahua","Gran Dannes"};
		int []edad= {7,8,9};
		String []color= {"cafe","blanco","negro"};
		int [] peso= {25,10,55};
		ArrayList<Perro>lista= new ArrayList<Perro>();
		 for(int i=0;i<nombre.length;i++) {
			
			Perro p= new Perro(nombre[i],sexo[i],raza[i]);
			p.setEdad(edad[i]);
			p.setColor(color[i]);
			p.setPeso(peso[i]);
			//crea lista de perros (vacia)
			
			//agregar elemntos a la lista
		    lista.add(p);
		 }
			for(Perro p:lista)
			System.out.println(p);
		
		
		
	
	}

}
