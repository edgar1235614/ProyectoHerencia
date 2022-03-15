/* Declaración de la clase Contactos.java contiene atributos nombre, sexo, alias, telefono, tipoTelefono. Metodos: get/set para atributos y toString
Edgar Alan García Rosales 17/02/22  */
package Tarea3;
public class Contactos{
  //atributos
    private String nombre;
    private char sexo;
    private String alias;
    private String telefono;
    private char tipoTelefono;
  //contructor con los 3 parametros para los atributos
    public Contactos(String nombre,char sexo, String alias,String telefono,char tipoTelefono){
    this.nombre =nombre;
    this.sexo =sexo;  
    this.alias= alias;
    this.telefono=telefono;
    this.tipoTelefono=tipoTelefono;
    }  
    @Override
    public String toString() {
      return nombre+"\t"+sexo+"\t"+alias+"\t"+tipoTelefono+"\t"+telefono;
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
    //Obtiene el alias de la persona
    public String getAlias(){
      return this.alias;
    }
    //Cambia el alias de la persona
    public void setAlias(String alias){
      this.alias=alias;
    }
    //Obtiene el telefono
    public String getTelefono() {
    	return telefono;
    }
    //cambia el telefono
    public void setTelefono(String telefono) {
    	this.telefono=telefono;
    
    }
    //obtiene el tipo de telefono
    public char getTipoTelefono() {
    	return tipoTelefono;
    }
    //cambia el tipo de telefono
    public void SetTipoTelefono(char tipoTelefono) {
    	this.tipoTelefono=tipoTelefono;
    }
}//fin de la clase