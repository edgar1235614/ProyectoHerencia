package Tarea6;

public class Punto {
	private int x=0;
	private int y=0;
	public static int totalPuntos=0;
	Punto(int _x,int _y){
		x= _x;
		y= _y;
		totalPuntos++;
		}
	public void setX(int _x) {
		x=_x;
		}
	public String toString() {
		return "("+x+","+y+")";
		}
	public int movimientoAbsoluto(Punto p1){
		return 0;
	}
	public int movimientoRelativo(int x, int y) {
		return 0;
	}

}
//Fin clase
