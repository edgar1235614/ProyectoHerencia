package Tarea12;
/*Escribe una clase Alumno que contenga atributos para nombre, apellido, 
 * sexo, calificación y métodos get y set para sus atributos.
 * Edgar Alan García Rosales 06/03/2022*/

public class Alumno12 {
	  //atributos
	    private String nombre;
	    private String apellido;
	    private char sexo;
	    private int calificacion;
	  //contructor con los 4 parametros para los atributos
	    public Alumno12(String nombre,String apellido,char sexo, int calificacion){
	    this.nombre =nombre;
	    this.apellido=apellido;
	    this.calificacion =calificacion;
	    this.sexo =sexo;  
	    
	    }  

	    @Override
	    public String toString() {
	      return nombre+"\t"+apellido+"\t"+sexo+"\t"+calificacion;
	    }
	    //Obtiene el nombre del alumno
	    public String getNombre(){
	      return this.nombre;
	    }
	    //cambia el nombre del alumno
	    public void setNombre(String nombre){
	      this.nombre=nombre;
	    }
	    //Obtiene el apellido del alumno
	    public String getApellido() {
	    	return this.apellido;	    	
	    }
	    //Cambia el apellido del alumno
	    public void setApellido(String apellido) {
	    	this.apellido=apellido;
	    }
	    
	    //Obtiene el sexo del alumno
	    public char getSexo(){
	      return this.sexo;
	    }
	    //Cambia el sexo del alumno
	    public void setSexo(char sexo){
	      this.sexo=sexo;
	    }
	    //Obtiene la calificacion del alumno
	    public int getCalifiacion(){
	      return this.calificacion;
	    }
	    //Cambia la calificacion del alumno
	    public void setCalifiacacion(int califiacion){
	      this.calificacion=califiacion;
	    }
	
}
