package Tarea7;

public class Fruta {
	private String nombre;
	private int pesoGramos;
	private int caloriasPorGramo;
	Fruta(String n){//constructor 
		nombre=n;
	}
	public void setPeso(int g) {
		pesoGramos=g;
	}
	public int getPeso() {
		return pesoGramos;
	}
	public void setCalorias(int c) {
		caloriasPorGramo=c;
	}
	public int getCalorias() {
		return caloriasPorGramo;
	}
	public int totalCalorias() {
		return pesoGramos*caloriasPorGramo;
	}
	public String toString() {
		return nombre +" peso: "+pesoGramos+" gramos "+", Calorias por gramo: "+caloriasPorGramo;
	}

}
