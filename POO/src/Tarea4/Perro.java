package Tarea4;

public class Perro {
	 //atributos
    private String nombre;
    private char sexo;
    private String raza;
    private int edad;
    private String color;
    private int peso;
  //contructor con los 3 parametros para los atributos
    public Perro(String nombre,char sexo, String raza){
    this.nombre =nombre;
    this.sexo =sexo;  
    this.raza=raza;
    }  

    @Override
    public String toString() {
      return nombre+"\t"+sexo+"\t"+raza+"\t"+edad+"\t"+color+"\t"+peso;
    }
    //Obtiene el nombre del perro
    public String getNombre(){
      return this.nombre;
    }
    //Obtiene el sexo del perro
    public char getSexo(){
      return this.sexo;
    }
    //Obtiene la edad del perro
    public int getEdad(){
      return this.edad;
    }
    //Cambia la edad del perro
    public void setEdad(int edad){
      this.edad=edad;
    }
    //Obtiene el color del perro
    public String getColor(){
      return this.color;
    }
    //Cambia el color del perro
    public void setColor(String color){
      this.color=color;
    }
    //Obtiene el peso del perro
    public int getPeso(){
      return this.peso;
    }
    //Cambia el peso del perro
    public void setPeso(int peso){
      this.peso=peso;
    }
}//fin de la clase