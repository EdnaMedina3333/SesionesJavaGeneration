package flujoControl;

public class EstructurasDeControl { //Debe coincidir la clase con el nombre de nuestro documento

	public static void main(String[] args) { //Todo dentro del método main
		//Recordar que para que algo se ejecute siempre debe ir dentro del método principal
		
		//Primero: definir una variable del tipo String donde almaceno un dato
		String citaProgramada = null; //dejamos en null y después lo cambiamos a una fecha "28-09-2023"
		//La variable declarada, se inicia en null a propósito para tener un espacio de memoria ya asignado y solo reemplazarlo con un nuevo dato
		
		if (citaProgramada !=null) {
			System.out.println("Ya hay una cita programada"); //porque la variable ya está ocupada
		} else {
			System.out.println("Puedes registrar una cita");//registrar otra cita o una cita
		}
		
		////////////////////////////////////////////////////////////////////////////////////////////////
		//Seleccionando una opción y almacenando la variable opcion
		int opcion = 1;
		
		//Creamos un menú
		System.out.println("Menú del Diente Feliz Consultorio Dental");
		System.out.println("1. ¿Desea programar una cita?");
		System.out.println("2. Verificar cita programada");
		System.out.println("3. Cancelar cita");
		System.out.println("4. Salir del Menú");
		System.out.print("Seleccione una opción del Menú (1-4): ");
		
		switch (opcion) {
		case 1:
			System.out.println("Usted ha seleccionado la opción 'Programar Cita'"); //Aquí se agrega la lógica para programar una cita
			break;
			
		case 2:
			System.out.println("Usted ha seleccionado 'Verificar cita'");
			break;
			
		case 3:
			System.out.println("Usted ha seleccionado la opción 'Cancelar Cita'");
			break;
			
		case 4:
			System.out.println("Usted ha salido del Menú");
			break;
			
			default:
				System.out.println("La opción que usted seleccionó no es válida, por favor seleccione una opción de nuestro Menú (1-4)");	
				break;
		} //cierre de switch
////////////////////////////////////////////////////////////////////////////////////////////////

		

	}//cierre de main

}//cierre de class
