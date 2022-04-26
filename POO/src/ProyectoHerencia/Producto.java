/* Declaración de la clase Producto.java contiene atributos nombre, 
 * precio y cantidad. Metodos: get/set para atributos y toString
Se reutilizó la clase Producto T1U2   Fecha:  22/04/22  */
package ProyectoHerencia;
public class Producto{
  //atributos
    private String nombre;
    private int precio;
    private int cantidad;
  //contructor con los 3 parametros para los atributos
    public Producto(String nombre, int precio,int cantidad){
    this.nombre =nombre;
    this.precio =precio;
    this.cantidad =cantidad;
    }  

    @Override
    public String toString() {
      return nombre+"\t"+precio+"\t"+cantidad;
    }
    //Obtiene el nombre del producto
    public String getNombre(){
      return this.nombre;
    }
    //cambia el nombre del producto
    public void setNombre(String nombre){
      this.nombre=nombre;
    }
    
    //Obtiene el precio del producto
    public int getPrecio(){
      return this.precio;
    }
    //Cambia el precio del producto 
    public void setPrecio(int precio){
      this.precio=precio;
    }
  //Obtiene la cantidad de productos
    public int getCantidad(){
      return this.cantidad;
    }
    //Cambia el origen del producto 
    public void setCantidad(int cantidad){
      this.cantidad=cantidad;
    }
   
}//fin de la clase