package Persona;

public class Usuario {

	//Atributo
	private String tipoUsuario;
	private String username;
	private String password;
	
	//Crear un nuevo usuario (constructor)
	public Usuario (String tipoUsuario, String username, String password) {
	    this.tipoUsuario = tipoUsuario;
		this.username = username;
		this.password = password;
	}
	
	//Recuperar contraseña (getter)
	public String getPassword (String usernameVerificar) {
		//Si el usuario registrado coincide con el usuario que paso como parámetro, entonces obtengo la contraseña
		if (usernameVerificar.equals(username)) {
			return password;
		} else {
			System.out.println("Información incorrecta");
			return null; //pide retornar un valor debido a que el método getPassword es de tipo String por lo que pide un return de un valor String, si fuera void como setPassword no pediría un return
		}
		
	}
	
	//Cambiar contrasenia (setter)
		public void setPassword(String nuevoPassword) {
			//si la nueva contraseña es diferente a una cadena vacia y es diferente a la contraseña anterior...
			if (nuevoPassword != "" && nuevoPassword != password) {
				//... entonces reemplazo la contraseña anterior
				password = nuevoPassword;
				System.out.println("Contraseña cambiada correctamente");
			}else {
				System.out.println("Lo siento, no puedo cambiar la contraseña");
			}
		}
		
		
		//Cambiar la contrasenia de un objeto del tipo usuario
		
		//Felipe.setPassword (una donde la contrasenia este vacia)
		//Felipe.setPassword (una donde la contrasenia no este vacia pero sea igual a la anterior)
		//Felipe.setPassword (se cumplan las dos condiciones)
	
	
}//cierre class Usuario
