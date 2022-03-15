/*Declaracion de la clase Persona.java contiene atributos nombre, 
sexo y edadMetodos: get/set para los atributos y toString*/
package Proyecto;
public class Persona{

	// atributos private 
	String nombre, apellido, alias;
	private char sexo;
	
	// constructor con los 3 parametros para los atributos   
	public Persona(String nombre, String apellido, String alias, char sexo){
		this.nombre = nombre;
		this.apellido  = apellido;
		this.alias = alias;
		this.sexo  = sexo;	
	}
	
	@Override
	public String toString(){
		return nombre+" \t" +apellido+" \t" +alias +" \t" +sexo;
	}
	// Obtiene el nombre de la persona
	public String getNombre(){
		return this.nombre;
	}
	
	// Cambia el nombre de la persona
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	// Obtiene el apellido de la persona
	public String getApellido(){
		return this.apellido;
	}
	
	// Cambia el apellido de la persona
	public void setApellido(String apellido){
		this.apellido = apellido;
	}
	
	// Obtiene el alias de la persona
	public String getAlias(){
		return this.alias;
	}
	
	// Cambia el nombre de la persona
	public void setAlias(String alias){
		this.alias = alias;
	}
	
	// Obtiene el sexo de la persona 
	public char getSexo(){
		return this.sexo;
	}
	
	// Cambia el sexo de la persona
	public void setSexo(char sexo){
		this.sexo = sexo;
	}
}// fin de la clase
		
		
		