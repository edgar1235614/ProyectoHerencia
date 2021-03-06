package Tarea1Triangulo;
public class Triangulo {
		  //atributos
		    private String tipo;
		    private char ladosIguales;
		    private int area;
		  //contructor con los 3 parametros para los atributos
		    public Triangulo(String nombre,char ladosIguales, int area){
		    this.tipo =nombre;
		    this.ladosIguales =ladosIguales;
		    this.area= area;
		
		    }  

		    @Override
		    public String toString() {
		      return tipo+"\t"+ladosIguales+"\t"+area;
		    }
		    //Obtiene el nombre del triangulo
		    public String getNombre(){
		      return this.tipo;
		    }
		    //cambia el nombre del triangulo
		    public void setNombre(String nombre){
		      this.tipo=nombre;
		    }
		    //Obtiene cuantos lados iguales tiene el triangulo
		    public char getLadosIguales(){
		      return this.ladosIguales;
		    }
		    //Cambia el numero de lados iguales del triangulo 
		    public void setLadosIguales(char ladosIguales){
		      this.ladosIguales=ladosIguales;
		    }
		    //Obtiene el area del triangulo
		    public int getArea(){
		      return this.area;
		    }
		    //Cambia el area del triangulo
		    public void setArea(int area){
		      this.area=area;
		    }
		}//fin de la clase

