public class Cliente extends Persona{//Encabezado de la clase Cliente
    //Atributos
    private int noCliente;
    //Constructor
    public Cliente(String nombre, String apellido, int edad, char sexo, int noCliente) {
        super(nombre, apellido, edad, sexo);
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