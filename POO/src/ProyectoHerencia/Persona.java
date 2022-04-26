
public class Persona{//Encabezado de la clase Persona
	//Atributos
	private String nombre, apellido;
	private char sexo;
	private int edad;
	//Constructor con los 3 parametros para los atributos  
	public Persona(String nombre, String apellido, int edad, char sexo){
		this.nombre = nombre;
		this.apellido  = apellido;
		this.edad = edad;
		this.sexo  = sexo;
	}
	//Metodo toString
	@Override
	public String toString(){
		return nombre+" \t \t" +apellido+" \t" +edad +" \t" +sexo;
	}
	//Metodos get y set
	//Obtiene el nombre de la persona
	public String getNombre(){
		return this.nombre;
	}
	//Cambia el nombre de la persona
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	//Obtiene el apellido de la persona
	public String getApellido(){
		return this.apellido;
	}
	//Cambia el apellido de la persona
	public void setApellido(String apellido){
		this.apellido = apellido;
	}
	//Obtiene el alias de la persona
	public int getEdad(){
		return this.edad;
	}
	//Cambia el nombre de la persona
	public void setEdad(int edad){
		this.edad = edad;
	}
	//Obtiene el sexo de la persona 
	public char getSexo(){
		return this.sexo;
	}
	//Cambia el sexo de la persona
	public void setSexo(char sexo){
		this.sexo = sexo;
	}
}	