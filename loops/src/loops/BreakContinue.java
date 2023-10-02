package loops;

public class BreakContinue {

	public static void main(String[] args) {
		/*
		 * Sentencias utilizadas en loop
		 * Break: para salir de un bucle en un punto específico
		 * Continue: interrumpe la iteración de un bucle si se produce una condición específica y continúa con la siguiente
		 * */
		
		//Super ozzito va a realizar una rifa en la cual el cliente numero 5 se ganará una coca cola de bolsita
		
		//con break finalizando el bucle antes de llegar a la condición final
		for (int cliente = 1; cliente <=20; cliente++) {
			if (cliente ==5) {
				System.out.println("Cliente número " + cliente + " !ganaste!");
				break;
			} System.out.println("Eres el cliente número " + cliente);
		} 
		
		
		//con continue, ejecutando la sentencia condicional pero cumpliendo la condicion del bucle 
		for (int cliente = 1; cliente <=20; cliente++) {
			if (cliente ==5) {
				System.out.println("Cliente número " + cliente + " !ganaste!");
				continue;
			} System.out.println("Eres el cliente número " + cliente);
		} 
		

	}//cierre de main

}//cierre de class
