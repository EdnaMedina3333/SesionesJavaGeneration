package loops;

import java.util.Scanner;
public class DoWhileLoop {

	public static void main(String[] args) {
		/*
		 * Do-While, Evalúan su expresión en la parte inferior del ciclo, por lo tanto las declaraciones dentro del bloque "do" siempre se ejecutan al menos una vez.
		 * */
		
		//Cuenta del 1 al 10
		int cuenta = 1;
		
		do {
			System.out.println(cuenta);
			cuenta++;
		} while (cuenta<0); //Output 1, ya que se ejecutó al menos 1 vez
		
		
		/*
		 * Crear un programa para un cajero bancario
		 * --El programa me mostrará 3 opciones
		 * 1. Consultar saldo
		 * 2. Ingresar dinero
		 * 3. Retirar dinero
		 * 4. Salir
		 * 
		 * --Mostrar mensaje de bienvenida al usuario, darle contexto y solicitar que elija una opción (número)
		 * 
		 * --Motrar al usuario la opcion que eligió y permitir que elija otra opcion
		 * 
		 * --El usuario puede salir del programa escribiendo 4
		 * */
		
		System.out.println("Bienvenido al Banco Generation, elige cualquiera de las opciones, para ello escribe el número que corresponda:");
		System.out.println("1. Consultar saldo");
		System.out.println("2. Ingresar dinero");
		System.out.println("3. Retirar dinero");
		System.out.println("4. Salir");
		
		Scanner scanner = new Scanner (System.in);
		int opcionSeleccionada;
		
		do {
			opcionSeleccionada = scanner.nextInt();	
			
		switch (opcionSeleccionada) {
		case 1:
			System.out.println("Consultar saldo");
			break;
		case 2:
			System.out.println("Ingresar dinero");
			break;
		case 3:
			System.out.println("Retirar dinero");
			break;
		case 4:
			System.out.println("Salir");
			break;
		default:
			System.out.println("Elige una opción válida");
			break;
		 }
		} while (opcionSeleccionada!=4);
		
		
		scanner.close(); //se cierra el scanner
		

	}//cierre main

} //cierre class
