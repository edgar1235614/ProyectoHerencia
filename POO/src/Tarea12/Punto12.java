package Tarea12;

public class Punto12 {
private int x=0;
private int y=0;
public static int totalPuntos=0;
Punto12(int _x,int _y){
	x= _x;
	y= _y;
	totalPuntos++;
}
public void setX(int _x) {
	x=_x;
}
public int getX() {
	return this.x;
}
public int getY() {
	return this.y;
}
public void setPunto(int x, int y) {
	this.x=x;
	this.y=y;
}
public double pendiente(Punto12 p1,Punto12 p2) {
	double pendiente=0;
	double a=0;
	double b=0;
int x1=p1.getX();
int y1=p1.getY();
int x2=p2.getX();
int y2=p2.getY();
a=(y2-y1);
b=(x2-x1);
pendiente= a/b;
	return pendiente;
}
public String toString() {
	return "("+x+","+y+")";
}

}
//Fin clase
