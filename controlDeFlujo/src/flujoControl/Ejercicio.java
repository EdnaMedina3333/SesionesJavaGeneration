package flujoControl;
import java.util.Scanner;
public class Ejercicio {

	public static void main(String[] args) {
		//Condicion para determinar si el paciente es mayor de edad o no
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Escribe tu edad");
		byte edad = scanner.nextByte();
		scanner.close();
		
		String mayorOMenor = null;
		mayorOMenor = (edad >=18) ? "" : "";
		
		if (edad >=18) {
			System.out.println("Felicidades, ya no necesitas que tu mamá te acompañe a hacer el trámite");
		} else {
			System.out.println("Dile a tu mamá que venga");
		}

		
		//Operador ternario
		// resultado = (condicion)? valor1 : valor2;
		boolean pago = false;
		String resultado = (pago) ? "ya pagó" : "no pagó";
		System.out.println("El paciente " + resultado);
		
	}//cierre main

}//cierre class
