/*
Integrantes del equipo:
-Carrasco Medina Carlos Iván
-Escalante Guadarrama Jorge Eduardo
-García Rosales Edgar Alan
Programación Orientada a Objetos 13/03/2022
Este programa usa a clase Persona y la clase Telefono para usarla como
un contacto el metodo toString de este y el get de la variable de clase Telefono
y la variable de clase Persona.
*/

public class Contacto{
	//atributos
	private static int noContactos;
	int noT = 0;
	private Persona info;
	private Telefono telefono;
	private Telefono telefono2[];
	
	//Constructores
	public Contacto(Persona info, Telefono telefono){
		this.info = info;
		this.telefono = telefono;
		noContactos++;
		this.noT = 1;
	}	
	//constructor para dos telefonos
	public Contacto(Persona info, Telefono[] telefono2){
		this.info = info;
		this.telefono2 = telefono2;
		noContactos++;
		this.noT = 2;
	}
	
	//metodo toString de Contacto
	@Override
	public String toString(){
		String devolver = "";
		if(noT == 1){
			devolver = info +"" +telefono;
		}
		else{
			devolver = info +"" +telefono2[0];
			for(int i = 1; i<telefono2.length; i++){
				devolver = devolver +"\n \t \t \t \t \t " +telefono2[i];
			}
		}
		return devolver;
	}
	
	//metodos get para info(imformacion de la persona) y para llamar el telefono1
	public Persona getInfo(){
		return this.info;
	}
	
	public Telefono getTelefono(){
		return this.telefono;
	}
	
	public Telefono getTelefono(int i){
		return this.telefono2[i];
	}
	
	public int getTamanoT(){
		return this.telefono2.length;
	}
	
	//metodos get y set para el numero de contacto(noContactos)
	public static int getNoContactos(){
		return noContactos;
	}
	
	public static void setNoContactos(int numero){
		noContactos = numero;
	}
	
	//metodo get para noT (numero de telefonos)
	public int getNoT(){
		return noT;
	}

}