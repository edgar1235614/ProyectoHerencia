/* Declaración de la clase Persona.java contiene atributos nombre, sexo y edad. Metodos: get/set para atributos y toString
Edgar Alan García Rosales 17/02/22  */
package Tarea1Persona;
public class Persona{
  //atributos
    private String nombre;
    private char sexo;
    private int edad;
  //contructor con los 3 parametros para los atributos
    public Persona(String nombre,char sexo, int edad){
    this.nombre =nombre;
    this.edad =edad;
    this.sexo =sexo;  
    }  

    @Override
    public String toString() {
      return nombre+"\t"+sexo+"\t"+edad;
    }
    //Obtiene el nombre de la Persona
    public String getNombre(){
      return this.nombre;
    }
    //cambia el nombre de la persona
    public void setNombre(String nombre){
      this.nombre=nombre;
    }
    //Obtiene el sexo de la persona
    public char getSexo(){
      return this.sexo;
    }
    //Cambia el sexo de la persona 
    public void setSexo(char sexo){
      this.sexo=sexo;
    }
    //Obtiene la edad de la persona
    public int getEdad(){
      return this.edad;
    }
    //Cambia la edad de la persona
    public void setEdad(int edad){
      this.edad=edad;
    }
}//fin de la clase