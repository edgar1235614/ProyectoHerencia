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
	
	public enum	ceroA29{
	cero,uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve,diez,once,doce,trece,catorce,quince,dieciséis,diecisiete,dieciocho,diecinueve,
	veinte,veintiuno,veintidós,veintitrés,veinticuatro,veinticinco,veintiséis,veintisiete,veintiocho,veintinueve;		
	}
	public enum treintaACien{
		treinta,cuarenta,cincuenta,sesenta,setenta,ochenta,noventa,cien;
	}
	public static String numero_a_letra (int numero) {
		ceroA29[] cambiar = ceroA29.values();
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
	public static ceroA29[] numerosLetras() {
		ceroA29[] cambiar = ceroA29.values();
		return cambiar;
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
	public static int mujeresGrupo (Alumno12 grupo[]) {
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
	public static double promedioCal (Alumno12 grupo[]) {
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
	public static int reprobados (Alumno12 grupo[]) {
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
	public static int  enOrigen(Punto12[] p1){ 
		int sumador=0;
		for (int i = 0; i < p1.length; i++) {
			if(p1[i].getX()==0 && p1[i].getY()==0 ) {	
			sumador++;		
			}
		}
		return sumador;		
	}
	/*Fin metodo 13
	 * Inicio metodo 14
	 * Escribe un método que reciba como parámetro un entero entre 0 y 99 y obtenga
	 *  el número de decenas que contiene.*/
	public static int decenas0al99(int decena) {
		if(decena>=0 && decena<100){ 
			int regreso;
			regreso= decena/10;
			return regreso;
		}
		else return 00000000;
	}
	/*Fin metodo 14
	 * Inicio metodo 15
	 * Escribe un método que reciba como parámetro una cantidad en pesos y regrese como
	 *  resultado la cantidad en dólares, el tipo de cambio es 20.17 pesos por dólar*/
	public static double pesoADolar(int peso) {
		double dolar;
		dolar=peso/20.17;
		
		return dolar;
	}
	/*Fin metodo 15
	 * Inicio metodo 16
	 * Escribe un método que reciba como parámetro una cantidad en dólares y regrese como 
	 * resultado la cantidad en pesos, el tipo de cambio es 20.17 pesos por dólar*/
	public static double dolarAPeso(double dolar) {
		double peso;
		peso=dolar*20.17;
		return peso;
	}
	/*Fin metodo 16
	 * Inicio metodo 17
	 * Escribe un método que reciba un entero como parámetro y regrese un 
	 * booleano indicando si el parámetro esta en el rango de 0 a 100*/
	public static boolean rango0a100(int rango) {
		if(rango>=0 && rango<=100) {
			return true;
		}
		else 
			return false;
	}
	/*Fin metodo 17
	 * Inicio metodo 18
	 * 	Escribe un método que reciba como parámetro un String y regrese un valor bolean 
indicando si el String es un palíndromo*/
	public static boolean palindromo(String pali) {
		
		String pali_invertida="";
		for(int i=pali.length();i>0 ; i--) {
			pali_invertida += pali.charAt(i-1);
			}

			if(pali_invertida.equals(pali)){
			return true;
			}
			else {
			return false;
			}
	
	}
	/*fin metodo 18
	 * Inicio metodo 19 
	 * Escribe un método que reciba como parámetro un String y obtenga como resultado 
el número de palabras que contiene (las palabras están separadas por espacio).*/
	public static int numeroDePalabras(String oracion) {
		int sumador=0;
		char espacio=' ';
		int tamaño=oracion.length();
		for (int i = 0; i<tamaño; i++) {
			if(oracion.charAt(i)==espacio) {
				sumador++;
			}
		}
		return sumador+1;
	}
	/*Fin metodo 19
	 * Inicio metodo 20
	 *  Escribe un método que regrese como resultado un valor aleatorio entre 1 y 6*/
	public static int numeroRandom() {
		 int aleatorio =10;
		 while (aleatorio>6 || aleatorio<1) {
			 aleatorio= (int)(Math.random()*10);		 
		 }
		 return aleatorio;
	}
	/*Fin metodo 20
	 * Inicio metodo 21
	 * Escribe un método que reciba un número entero como parámetro y regrese como resultado
	 *  un arreglo de números enteros con todos sus divisores.*/
	public static int [] divisores(int numero) {
		int [] divisor= new int[100];
		int j=0;
		for (int i=1; i<=numero;i++) {
				if (numero%i==0) {
				divisor[j]=i;
				j++;
			}
		}
		
		return divisor;
	}
	/*Fin metodo 21
	 * Inicio metodo 22
	 * Escribe un método que reciba como parámetro dos arreglos de datos enteros y 
	 * obtenga como resultado un arreglo con la suma de los dos parámetros. */
	public static int[] sumaArreglos(int[]x,int[]y) {
		int [] sumandoArreglos=new int[100];
		int tamaño=5;
		if(x.length>y.length) {
			 tamaño= x.length;
		}
		if(y.length>=x.length) {
			 tamaño= y.length;				
		}
		for (int i = 0; i < tamaño; i++) {
			sumandoArreglos[i]= x[i]+y[i];
		}
		
		return sumandoArreglos;
	}
	/*Fin metodo 22
	 * Inicio metodo 24
	 * Escribe un método que reciba como parámetro un arreglo de objetos tipo Libro y 
	 * obtenga el número de libros de cada clasificación*/
	public static int[] librosPorClasificacion(Libro12 [] libros) {
		String categoria="";
		String categoria2="";
		int [] contador2=new int[3];
		int contador=0;
		for (int i = 0; i < libros.length; i++) {
			for (int j = 1; j < libros.length; j++) {
				categoria=libros[i].getClasificacion();
				categoria2=libros[j].getClasificacion();
				if(categoria.equals(categoria2) && (!(i==(j-1)))) {
				    contador++;
				}
				
			}
			contador2[i]=contador;
			System.out.println(categoria);
			
		}
			return contador2;
	}

	
	
			//main
	public static void main(String[]args) {
		//Declaracion de variables
		Alumno12 grupo1[] = new Alumno12[5];	
		grupo1[0] = new Alumno12("Pedro", "Sanchez", 'H', 68);
		grupo1[1] = new Alumno12("Marifer", "Lopez", 'M', 86);
		grupo1[2] = new Alumno12("Carl", "Jackson", 'H', 98);
		grupo1[3] = new Alumno12("Maria", "Hernandez", 'M', 72);
		grupo1[4] = new Alumno12("Elizabeth", "Medina", 'M', 65);
		Punto12 puntos[]= new Punto12[5];
		puntos[0]= new Punto12(2,4);
		puntos[1]= new Punto12 (0,5);
		puntos[2] = new Punto12(0,0);
		puntos[3] = new Punto12(1,1);
		puntos[4] = new Punto12(0,0);		
		Punto12 punto1 = new Punto12(2,2);
		Punto12 punto2 = new Punto12(4,7);
		int [] divisores=divisores(22);
		int arreglo1[]= {2,5,1,8,4,0,3};
		int arreglo2[]= {4,8,6,0,7,2,3};
		int []sumaArreglos=sumaArreglos(arreglo1,arreglo2);
		int tamaño=5;
		Libro12[] libros = new Libro12[3];
		libros[0] = new Libro12("narnia", "robinson", "magnus", 2012, "novela");
		libros[1] = new Libro12("Harry Potter 1", "Jk", "venus", 2005, "novela");
		libros[2] = new Libro12("pepito", "carlos muños", "letrasHispanas", 2017, "cuento");
		// Uso de los metodos:
		System.out.println("Metodo 1 String tecnologico, caracter c, resultado: "+contarLetras("tecnologico",'c') );
		System.out.println("Metodo 2 String T13rr4, resultado: "+digitosFrase("T13rr4"));
		System.out.println("Metodo 3 Int 5, resultado: "+ par(5));
		System.out.println("Metodo 4 int 31, resultado: "+primo(31));	
		System.out.println(numero_a_letra(5));
		System.out.println("Metodo 7 Numero de mujeres: "+ mujeresGrupo(grupo1));
		System.out.println("Metodo 8 Promedio de calificacion: "+promedioCal(grupo1));
		System.out.println("Metodo 9 Reprobados: "+reprobados(grupo1));
		System.out.print("Metodo 10 Mover punto: p"+punto1+" a ");
		punto1.setPunto(2,6);
		System.out.println("p"+punto1);
		System.out.println("Metodo 11 pendiente de la recta que pasa" +"\n"+ "por los puntos p1"+punto1+" y "
				+ "p2"+punto2+" pendiente: "+punto1.pendiente(punto1, punto2));
		System.out.println("Metodo 13 Los puntos en el origen del arrgelo de puntos son: "+ enOrigen(puntos));
		System.out.println("Metodo 14 Numero de decenas del numero 60 , respuesta: "+ decenas0al99(60));
		System.out.println("Metodo 15 Cambiar 125 pesos a dolar, respuesta: "+ pesoADolar(125)+" dolares");
		System.out.println("Metodo 16 Cambiar 280 dolares a pesos, respuesta: "+ dolarAPeso(280)+" pesos");
		System.out.println("Metodo 17 regresar true o false si 0<=87<=100, respuesta: "+ rango0a100(87));
		System.out.println("Metodo 18 La palabra oso es un palindromo, respuesta: "+ palindromo("oso"));
		System.out.println("Metodo 19 la palabras que tiene la oracion: El módulo o operador de módulo devuelve. Respuesta:"
				+ " "+ numeroDePalabras("El módulo o operador de módulo devuelve."));
		System.out.println("Metodo 20 Un numero aleatorio entre 1 y 6, respuesta: "+numeroRandom() );
		System.out.println("Metodo 21 Divisores del numero 22, respuesta: ");
		for (int i = 0; i < 4; i++) {
			System.out.print("["+divisores[i]+ "]");
		}	
		System.out.println("\n");
		System.out.println("Metodo 22 suma de arreglos: ");
		for (int i = 0; i < arreglo1.length; i++) {
			System.out.print("["+arreglo1[i]+"] ");
		}
		System.out.println("\n");
		for (int i = 0; i < arreglo2.length; i++) {
			System.out.print("["+arreglo2[i]+"] ");
		}
		System.out.println("\n");
		
		if(arreglo1.length>arreglo2.length) {
			 tamaño= arreglo1.length;
		}
		if(arreglo2.length>=arreglo1.length) {
			 tamaño= arreglo2.length;				
		}
		for (int i = 0; i < tamaño; i++) {
			System.out.print("["+sumaArreglos[i]+"] ");
		}
		System.out.println("\n");
		System.out.println("Metodo 22 Libros que pertenecen a la misma categoria: " );
		librosPorClasificacion(libros);
	
		
	}
}