import java.util.ArrayList;

public class Cliente extends Persona{//Encabezado de la clase Cliente
    //Atributos
    private int noCliente;
    public static int totalClientes=0;
    ArrayList <Producto> productos = new ArrayList<Producto>();
    public void agregarProducto() {
    	
    }

    //Constructor
    public Cliente(String nombre, String apellido, int edad, char sexo) {
        super(nombre, apellido, edad, sexo);
        totalClientes++;
        noCliente=totalClientes;
    }
    //Metodos get y set
    public void setNoCliente(int num){
        noCliente = num;
    }
    public int getNoCliente(){
        return noCliente;
    }
    //Metodo
    public String toString(){
        return super.toString()+"\t"+noCliente;
    }
}
