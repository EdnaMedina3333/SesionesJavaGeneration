package Persona;

public class Persona {
		//La función principal del main public static void main(String[] args) {} es poder ejecutar todo lo que tenga en su interior
		
	//1. Atributos
	String nombre;
	String apellido;
	byte edad; //byte para tener una correcta asignación de memoria
	String telefono;
	String email;
	
	
	//2. Constructor
	Persona (String nombre, String apellido, byte edad, String telefono, String email) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.telefono = telefono;
		this.email = email;
	}
	
	
	//3. Métodos (lo que podrá hacer mi objeto)
	void imprimirInfo() {
		System.out.println("El nombre es: " + nombre);
		System.out.println("El apellido es: " + apellido);
		System.out.println("La edad es: " + edad);
		System.out.println("El telefono es: " + telefono);
		System.out.println("El email es: " + email);
		}
	
	void saludar () {
		System.out.println("Hola, te mando saludos");
	}

	
	
	
	//toString
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", telefono=" + telefono
				+ ", email=" + email + "]";
	}
	
	
	
	
	
	
	
	//4. Instancia

	

}//cierre de class POO
