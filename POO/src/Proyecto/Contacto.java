package Proyecto;
public class Contacto{
	int noContactos = 0,noT = 0;
	private Persona info;
	private Telefono telefono1;
	private Telefono telefono2;
	
	public Contacto(Persona info, Telefono telefono1){
		this.info = info;
		this.telefono1 = telefono1;
		noContactos++;
		noT = 1;
	}	
	
	public Contacto(Persona info, Telefono telefono1, Telefono telefono2){
		this.info = info;
		this.telefono1 = telefono1;
		this.telefono2 = telefono2;
		noContactos++;
		noT = 2;
	}	
	
	@Override
	public String toString(){
		if(noT == 1){
			return info +"\t" +telefono1 +"\t";
		}
		else{
			return info +"\t" +telefono1 +"\n \t \t \t \t" +telefono2;
		}
	}
	
	public Persona getInfo(){
		return this.info;
	}
	
	public Telefono getTelefono1(){
		return this.telefono1;
	}
}