public class Empleado extends Persona{
	String id;
	double sueldo;
	String tipo;
	static int noEmpleado;
	
	//Constructores
	Empleado(){
		
	}
	
	Empleado(double s, String t){
		this.sueldo = s;
		this.tipo = t;
	}
	
	// métodos
	public void setSueldo(double s){
		this.sueldo = s;
	}
	
	public double getSueldo(){
		return sueldo;
	}
	
	public String getId(){
		return this.id;
	}
	
	public void setId(){
		if(noEmpleado < 10){
			this.id = "0000" +noEmpleado;
		}
		else if(this.noEmpleado < 100 && noEmpleado > 9){
			this.id = "000" +noEmpleado;
		}
		else{
			this.id = "00" +noEmpleado;
		}
	}

	public String getTipo(){
		return this.tipo;
	}
	
	public void setTipo(String t){
		this.tipo = t;
	}
	
	public String toString(){
		return super.toString() +"\t Empleado: \t" +id +"\t Sueldo: \t" +sueldo +"\t tipo: \t" +tipo;
	}
	
	public void setPersona(Persona personas, Empleado empleados){
		empleados.setNombre(personas.getNombre());
		empleados.setApellido(personas.getApellido());
		empleados.setSexo(personas.getSexo());
		empleados.setEdad(personas.getEdad());
	}
}
