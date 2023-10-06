package Persona;

public class TestUsuario {

	public static void main(String[] args) {
		//Instancia de usuario
		Usuario Felipe = new Usuario ("Doctor", "Doctor Felipe", "paracetamol");
		
		//Cambiar la contraseña
		//Felipe.setPassword (una donde la contraseña este vacia)
		Felipe.setPassword(""); //error
		
		//Felipe.setPassword (una donde la contrasenia no este vacia pero sea igual a la anterior)
		Felipe.setPassword("paracetamol"); //error

		//Felipe.setPassword (se cumplan las dos condiciones)
		Felipe.setPassword("nuevaPassword");
		
		
		
		
		
	}//cierre del main

}//cierre de TestUsuario
