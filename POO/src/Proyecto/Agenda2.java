/*
Programación Orientada a Objetos 24/02/2022
Este programa usa a clase Persona y la clase Telefono para usarla como
una agenda de contactos donde se puede agregar contactos, borrarlos,
ver una lista de todos ellos o buscar un contacto por alias o nombre.
*/
package Proyecto;
import java.util.ArrayList;
public class Agenda2{
	public static void main(String[] args){
		//inicio de variales
		int buscar, noContactos = 5;
		String buscaNombre;
		Persona datosP [] = new Persona[10000];
		Telefono datosT [] = new Telefono[10000];
		
		//datos por defecto de la clase personas
		datosP[0] = new Persona("Pedro", "Sanchez", "pepe", 'H');
		datosP[1] = new Persona("Marifer", "Lopez", "Fer", 'M');
		datosP[2] = new Persona("Carl", "Jackson", "Cj", 'H');
		datosP[3] = new Persona("Maria", "Hernandez", "Mari", 'M');
		datosP[4] = new Persona("Elizabeth", "Medina", "Eliza", 'M');
		
		//datos por defecto de la clase telefono
		datosT[0] = new Telefono('M', 52, "309389185");
		datosT[1] =	new Telefono('M', 93, "615732222");
		datosT[2] =	new Telefono('F', 49, "308159562"); 
		datosT[3] =	new Telefono('F', 52, "580258109");
		datosT[4] =	new Telefono('M', 32, "696202398"); 
		
		ArrayList<Contacto> lista = new ArrayList<Contacto>();
		
		for(int i = 0; i<noContactos; i++){
			Contacto contactos = new Contacto(datosP[i], datosT[i]);
			lista.add(contactos);
			System.out.println(lista.get(i).toString());
		}
		
		do{
			//seleccion de la accion a realizar a continuacion
			System.out.println ("¿que accion desea realizar? (1-agregar contacto, 2-buscar contacto, 3-Mostrar directorio, 4- Borrar contacto, 5-Salir)");
			buscar=Keyboard.readInt();

			//introducir nuevo contacto
			switch (buscar){
				case 1:
					noContactos = agregarContacto(lista, noContactos);
				break;
			
				case 2:
					//Buscar persona
					int comprobar = 0;	
					System.out.println ("Introduzca el nombre o alias de la persona que desee buscar");
					buscaNombre = Keyboard.readString();
					
					//comprueba si hay personas con el mismo nombre o alias
					for(int i = 0; i<noContactos ;i++){
						if(buscaNombre.equals(lista.get(i).getInfo().getNombre()) || (buscaNombre.equals(lista.get(i).getInfo().getAlias()))){
							System.out.println(lista.get(i).toString());
							comprobar = 2;
						}
						else if((i == (noContactos-1)) && (comprobar == 0)){
							System.out.println("Ningun nombre coincide");
						}
					}
				break;
			
				//mostrar lista de directorio completo
				case 3:
					for(int i = 0; i<noContactos; i++){
						System.out.println(lista.get(i).toString());
					}
				break;
			
				case 4:
					//eliminar un contacto del directorio
					int borrar;
					for(int i = 0; i<noContactos; i++){
						System.out.println((i+1) +".- " +lista.get(i).toString());
					}
					System.out.println("Introduzca el numero del contacto que desea eliminar");
					borrar = Keyboard.readInt();
					
					lista.remove(borrar-1);
					noContactos = noContactos-1;
				break; 
			}
		}while(buscar != 5);
	}
	
	public static int agregarContacto(ArrayList lista, int noContactos){
		String nombre, apellido, alias, numero;
		char sexo, tipoT;
		int clave;
		//recoleccion de datos para realizar la lista 
		System.out.println ("introduzca el nombre de la persona ");
		nombre=Keyboard.readString();
		
		System.out.println ("introduzca el apellido de la persona ");
		apellido=Keyboard.readString();
		
		System.out.println ("introduzca el alias de la persona ");
		alias=Keyboard.readString();
		
		do{
			System.out.println ("introduzca el sexo de la persona (H, M)");
			sexo=Keyboard.readChar();
			if((sexo != 'H') && (sexo != 'M')){
				System.out.println ("SOlO SE PERMITE H O M");
			}
		}while((sexo != 'H') && (sexo != 'M'));
		
		//uso de la clase persona
		Persona datosAP = new Persona(nombre, apellido, alias, sexo);
		
		Telefono datosAT[] = new Telefono[10000];
		int noTelefono;
		System.out.println ("tiene 1 o 2 telefonos");
		noTelefono=Keyboard.readInt();
		if(noTelefono == 1){	
			System.out.println ("introduzca el tipo de telefono de la persona(M-movil ,F-fijo)");
			tipoT=Keyboard.readChar();
			
			System.out.println ("introduzca la clave de telefono de la persona");
			clave=Keyboard.readInt();
			
			System.out.println ("introduzca el numero de telefono de la persona");
			numero=Keyboard.readString();
			
			//se guarda en una variable de la clase Telefono
			datosAT[0] = new Telefono(tipoT, clave, numero);
			
			Contacto contactos = new Contacto(datosAP, datosAT[0]);
			lista.add(contactos);
			noContactos++;
		}
		else{
			for(int i = 0; i<noTelefono; i++){
				System.out.println ("introduzca el tipo de telefono de la persona(M-movil ,F-fijo)");
				tipoT=Keyboard.readChar();
				
				System.out.println ("introduzca la clave de telefono de la persona");
				clave=Keyboard.readInt();
				
				System.out.println ("introduzca el numero de telefono de la persona");
				numero=Keyboard.readString();
				
				//se guarda en una variable de la clase Telefono
				datosAT[i] = new Telefono(tipoT, clave, numero);
			}
			Contacto contactos = new Contacto(datosAP, datosAT[0], datosAT[1]);
			lista.add(contactos);
			noContactos++;	
		}
		return noContactos;
	}
} 