public class EmpleadoComision extends Empleado{
	double sueldoComision;
	
	//Constructores
	EmpleadoComision(){
		
	}
	
	EmpleadoComision(double v, int p){
		super.sueldo = (v*p)/100;
		super.setTipo("Comision");
		super.noEmpleado++;
		super.setId(); 
	}
	
	
	// métodos		
	public void setSueldoComision(double v, int p){
		super.sueldo = (v*p)/100;
	}
	
	public String toString(){
		return super.toString();
	}
}