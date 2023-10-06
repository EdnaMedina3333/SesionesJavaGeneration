package Persona;

public class Dentista extends Persona {
	
	
	/*
	 * ya no creo valores como nombre, edad, apellido, etc., porque estos valores los voy a heredar de la clase Persona
	 */
	
	//1 Atributos
	String especialidad;
	String cedula;
	String consultorioAsignado;
	String experiencia;
	String turno;
	int salario = 500;

	
	//2 Constructor
	public Dentista(String nombre, String apellido, byte edad, String telefono, String email, String especialidad,String cedula, String consultorioAsignado, String experiencia, String turno, int salario) {
		super(nombre, apellido, edad, telefono, email); //informacion de la clase Persona
		//informacion de la clase Dentista
		this.especialidad = especialidad;
		this.cedula = cedula;
		this.consultorioAsignado = consultorioAsignado;
		this.experiencia = experiencia;
		this.turno = turno;
		this.salario = salario;
	}//constructor Dentista con informacion heredada
	
	
	//3 Métodos: método para calcular salario basado en la experiencia
	//Experiencia = basico, intermedio, avanzado
	//Si el dentista está en el rango básico, gana 30,000 , si es intermedio gana 40,000 y si es avanzado gana 50,000
	
	void calcularSalario () {
		//Lógica de programación
		if (experiencia.equals("basico")) {
			salario = 30000;
		} else if (experiencia.equals("intermedio")) {
			salario = 40000;
		} else if (experiencia.equals("avanzado")) {
			salario = 50000;
		}
	}//cierre calcularSalario
	
	
	void imprimirInfoDentista () {
		System.out.println("La especialidad: " + especialidad);
		System.out.println("El salario es: " + salario);
	}//cierre imprimirInforDentista
	
	
	
	//4. Instancia
	
	
	
	
}//cierre de class Dentista
