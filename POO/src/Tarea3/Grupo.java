package Tarea3;
import java.util.ArrayList;
public class Grupo {
	public static void main(String[] args) {
		String[]nombre= {"Oscar","Laura","Edgar","Amparo","Jose"};
		char [] sexo= {'H','M','H','M','H'};
		String[]alias= {"flaco","Lau","gordo","Rosa","Pepe"};
		char[]tipoTelefono = {'m','c','m','c','m'};
		String [] telefono= {"24513451","45859873","4236458","7789487","1234534"};
		ArrayList<Contactos>directorio = new ArrayList<Contactos>();
		for(int i=0;i<nombre.length;i++) {
			Contactos p = new Contactos (nombre[i],sexo[i],alias[i],telefono[i],tipoTelefono[i]);
			directorio.add(p);
		}
		for(Contactos p:directorio)
			System.out.println(p);
		System.out.println("\n"+directorio.toString());
		
		System.out.println("\tLista de mujeres");
		for(int i=0;i<directorio.size();i++) {
			if(directorio.get(i).getSexo()=='M') {
				System.out.println(directorio.get(i).toString());
			}
		}
		System.out.println("\tSe elimino a Edgar");
		directorio.remove(2);
		for(Contactos p:directorio)
			System.out.println(p);
		System.out.println("\tSolo el telefono de la primera persona");
		String t=directorio.get(0).getTelefono();
		System.out.println(t);
		
		System.out.println("\tmuestra la segunda persona de la lista");
		System.out.println(directorio.get(1).toString());
		
		System.out.println("\tcambia el alias de la primer persona");
		directorio.get(0).setAlias("feo");
		for(Contactos p: directorio)
			System.out.println(p);
		System.out.println("\t lista de los nombre de las personas");
		for(int i=0;i<directorio.size();i++)
			System.out.println(directorio.get(i).getNombre().toString());
			System.out.println("\t cambia el mismo tipo de telefono a todos");
			for(int i=0; i<directorio.size();i++) {
				directorio.get(i).SetTipoTelefono('m');
			}
			for(Contactos p:directorio)
				System.out.println(p);
	}

}

