package Persona;

public class TestAsistente {

	public static void main(String[] args) {
		//Instancia de nuestro asistente
		
				AsistenteDental Francisca = new AsistenteDental("05/10/2023", 875.40d);
				
				//Impresion de la informacion de nuestro asistente
				Francisca.mostrarDatosAsistente();
				
				
				
				//El sueldo de Francisca no es de 875.4, es de 87.54
				//Cambio de sueldo
				//Francisca.salario=87.54d;
				
				
				
				//Mostrar solo el sueldo (antes del getter)
				//System.out.println(Francisca.salario);
				
				//Mostrar el sueldo (después del getter)
				System.out.println(Francisca.getsalario());
				
				//Modificar salario con setter
				Francisca.setSalario(30.00); //sí cumple la condición
				
				//Imprimir el nuevo salario
				System.out.println(Francisca.getsalario());

				
				
	}//cierre de main

}//cierre TestAsistente
