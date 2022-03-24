/* Declaración de la clase Producto.java contiene atributos nombre, origen 
 * y precio. Metodos: get/set para atributos y toString
Edgar Alan García Rosales 17/02/22  */
package Tarea1Producto;
public class Producto{
  //atributos
    private String nombre;
    private char origen;
    private int precio;
  //contructor con los 3 parametros para los atributos
    public Producto(String nombre,char origen, int precio){
    this.nombre =nombre;
    this.origen =origen;
    this.precio =precio;  
    }  

    @Override
    public String toString() {
      return nombre+"\t"+origen+"\t"+precio;
    }
    //Obtiene el nombre del producto
    public String getNombre(){
      return this.nombre;
    }
    //cambia el nombre del producto
    public void setNombre(String nombre){
      this.nombre=nombre;
    }
    //Obtiene el origen del producto (extranjero o local).
    public char getOrigen(){
      return this.origen;
    }
    //Cambia el origen del producto 
    public void setOrigen(char origen){
      this.origen=origen;
    }
    //Obtiene el precio del producto
    public int getPrecio(){
      return this.precio;
    }
    //Cambia el precio del producto 
    public void setPrecio(int precio){
      this.precio=precio;
    }
   
}//fin de la clase