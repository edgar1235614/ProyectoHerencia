package Tarea12;

/* Inicio metodo 1
 * 1. Escribe un metodo que obtenga el numero de letras x 
 * que contiene un String(x es parametro de tipo char)*/
public class Tarea12 {
	public static int contarLetras(String frase,char x) {
		int cuenta=0;
		for(int i=0;i<frase.length();i++) {
			if(frase.charAt(i)==x) cuenta++;
		}
		return cuenta;
	}
	//Fin metodo 1
	//Inicio metodo 2
    /*2.Escribe un método que reciba como parámetro un String y obtenga el
     *  total de caracteres que son dígitos.*/
	public static int digitosFrase(String frase) {
		int cuenta=0;
		for(int i=0;i<frase.length();i++) {
			if(Character.isDigit(frase.charAt(i))) {
				cuenta++;
			}
		}
		return cuenta++;
	}
	//fin metodo 2
	/*inicio metodo 3
	Escribe un método que reciba como parámetro un número entero y obtenga como resultado un 
	valor boolean, verdadero si el número es par y falso si es impar.
	*/
	public static boolean par(int numero) {
		if (numero%2==0) {
			return true; }
		else return false;
	}
	//fin metodo 3
	
	/*inicio metodo 4
	Escribe un método que reciba como parámetro un entero y determine si 
	este es o no un número primo.*/
	public static String primo (int numero) {
		int cuenta=0;
		for(int i=1;i<=numero;i++) {
			if(numero % i==0) {
				cuenta++;
			}
		}
		if(cuenta!=2) {
			return numero + " no es número primo";
		}else {
			return numero + " es un número primo";
		}
		}
	//fin metodo 4
	//inicio metodo 5
	/*Escribe un método que reciba un número del 0 a 100 y regrese
	 *  como resultado el número en letras.*/	
	
	public enum	cero_a_29{
	cero,uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve,diez,once,doce,trece,catorce,quince,dieciséis,diecisiete,dieciocho,diecinueve,
	veinte,veintiuno,veintidós,veintitrés,veinticuatro,veinticinco,veintiséis,veintisiete,veintiocho,veintinueve;		
	}
	public enum treintaACien{
		treinta,cuarenta,cincuenta,sesenta,setenta,ochenta,noventa,cien;
	}
	public static String numero_a_letra (int numero) {
		cero_a_29[] cambiar = cero_a_29.values();
		treintaACien[] cambiar2 = treintaACien.values();
		if(numero<=29) {
			System.out.println("Metodo 5 int "+numero+", resultado: "+cambiar[numero]);
			
		}
		else {
			if(numero ==30 || numero==40  || numero==50 || numero==60 || numero==70 || numero==80 || numero==90 || numero==100 ) {
				System.out.println("Metodo 5 int "+numero+", resultado: "+cambiar2[(numero/10)-3]);
				
			}
			else {
			System.out.println("Metodo 5 int "+numero+", resultado: "+cambiar2[(numero/10)-3]+" y "+cambiar[(numero%10)]);
			}

		}
		
		return "";
	}
	//fin método 5
	
	//inicio método 6 
	/*Escribe una clase Alumno que contenga atributos para nombre, apellido, 
	 * sexo, calificación y métodos get y set para sus atributos.
	 * Listo!!, la clase fue creada.*/
	//fin método 6
	//inicio método 7
	/*Escribe un método que reciba como parámetro un arreglo de objetos tipo Alumno y 
	 * regrese como resultado el numero de mujeres que hay en el grupo.*/
	public static int mujeresGrupo (Alumno grupo[]) {
		int cuenta = 0;
		for(int i=0; i<5;i++) {
			if(grupo[i].getSexo()=='M') {
				cuenta++;
			}
		}
		return cuenta;
	}
	/*fin metodo 7
	Inicio metodo 8 
	Escribe un método que reciba como parámetro un arreglo de Alumno y regrese
	 el promedio de la calificación de todo el grupo*/
	public static double promedioCal (Alumno grupo[]) {
		double prom=0;
		double calificacion=0;
		double guardar=0;
		for (int i = 0; i < grupo.length; i++) {
		calificacion=grupo[i].getCalifiacion();
		guardar+=calificacion;
		}
		prom=guardar/grupo.length;
		return prom;
	}
	/*fin metodo 8
	 * Inicio metodo 9
	 * Escribe un método que reciba como parámetro un arreglo de Alumno y regrese
	 *  como resultado el total de alumnos reprobados con calificación menor que 70*/
	public static int reprobados (Alumno grupo[]) {
		int calificacion=0;
		int reprobados=0;
		for (int i = 0; i < grupo.length; i++) {
			calificacion=grupo[i].getCalifiacion();
			if (calificacion<70) {
				reprobados++;
			}
		}
		return reprobados;
	}
	/* Fin metodo 9
	 * Inicio metodo 10
	 * Escribe un método para la clase Punto que mueva las coordenadas a otro punto
	 * Fin metodo10*/
	/* Inicio metodo11
	 * Escribe un método que reciba como parámetro dos objetos tipo Punto y regrese como 
	 * resultado su pendiente.
	 * Fin metodo11*/
	/*Inicio metodo 13
	 * Escribe un método que reciba como parámetro un arreglo de Puntos y obtenga 
cuantos están en el origen (0,0)*/
	
			//main
	public static void main(String[]args) {
		Alumno grupo1[] = new Alumno[5];	
		grupo1[0] = new Alumno("Pedro", "Sanchez", 'H', 68);
		grupo1[1] = new Alumno("Marifer", "Lopez", 'M', 86);
		grupo1[2] = new Alumno("Carl", "Jackson", 'H', 98);
		grupo1[3] = new Alumno("Maria", "Hernandez", 'M', 72);
		grupo1[4] = new Alumno("Elizabeth", "Medina", 'M', 65);
		Punto puntos[]= new Punto[10];
		Punto punto1 = new Punto(2,2);
		Punto punto2 = new Punto(4,7);
		Punto punto3 = new Punto(0,0);
		Punto punto4 = new Punto(1,1);
		Punto punto5 = new Punto(0,0);
		System.out.println("Metodo 1 String tecnologico, caracter c, resultado: "+contarLetras("tecnologico",'c') );
		System.out.println("Metodo 2 String T13rr4, resultado: "+digitosFrase("T13rr4"));
		System.out.println("Metodo 3 Int 5, resultado: "+ par(5));
		System.out.println("Metodo 4 int 31, resultado: "+primo(31));
		System.out.print(numero_a_letra(60));
		System.out.println("Metodo 7 Numero de mujeres: "+ mujeresGrupo(grupo1));
		System.out.println("Metodo 8 Promedio de calificacion: "+promedioCal(grupo1));
		System.out.println("Metodo 9 Reprobados: "+reprobados(grupo1));
		System.out.print("Metodo 10 Mover punto: p"+punto1+" a ");
		punto1.setPunto(2,6);
		System.out.println("p"+punto1);
		System.out.println("Metodo 11 pendiente de la recta que pasa" +"\n"+ "por los puntos p1"+punto1+" y "
				+ "p2"+punto2+" pendiente: "+punto1.pendiente(punto1, punto2));
		
		
		
		
		
	}
}