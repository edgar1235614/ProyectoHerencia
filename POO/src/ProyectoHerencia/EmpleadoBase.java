public class EmpleadoBase extends Empleado{
	double sueldoBase;
	
	//Constructores
	public EmpleadoBase(){
		super.noEmpleado++;
	}
	
	public EmpleadoBase(double s){
		super.sueldo = s;
		super.setTipo("Base");
		super.noEmpleado++;
		super.setId(); 
	}
	
	// métodos		
	public void setSueldoBase(double s){
		sueldoBase = s;
	}
	
	public double getSueldoBase(){
		return sueldoBase;
	}
	
	public String getTipo(){
		return "Horas";
	}
	
	public String toString(){
		return super.toString();
	}
}