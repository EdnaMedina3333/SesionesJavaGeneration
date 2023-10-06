package Persona;

public class AsistenteDental {

	//1. Atributos privados
	private String fechaIngreso;
	private double salario;
	
	
	//2. Constructor publico (dejo el constructor público para poder acceder a él de forma sencilla)
	public AsistenteDental (String fechaIngreso, double salario) {
		this.fechaIngreso = fechaIngreso;
		this.salario = salario;
	}
	
	//3. Métodos
	public void mostrarDatosAsistente() {
		System.out.println("La fecha de ingreso del asistente es: " + fechaIngreso);
		System.out.println("El salario del asistente es: " + salario);
	}
	
	
	//Getters y setters para poder acceder a mis datos privados y poder realizar operaciones con ellos
	//Sin getter, la información me aparece en null
	//Sin setters no puedo cambiar la información
	
	//Este getter permite retornar el datode la fecha de ingreso en formato String
	public String getfechaIngreso() {
		return fechaIngreso;
	}
	
	//Getter para salario
	public double getsalario() {
		return salario;
	}
	
	//Setter para salario (modificar los datos)
		public void setSalario(double nuevoSalario) {
			if (nuevoSalario >0 && nuevoSalario <100) {
				salario = nuevoSalario;
			}//cierre if
		}//cierre setter
	
	
}//cierre AsistenteDental
