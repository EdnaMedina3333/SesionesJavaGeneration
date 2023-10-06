package Persona;

public class Test {
	
    //Método principal para instanciar mis clases
	public static void main(String[] args) {
		
		//Instancia de Persona
		Persona Felipe = new Persona ("Felipe", "Maqueda", (byte)31, "5512345678", "felipe@main.com");
		
		System.out.println(Felipe); //imprime el espacio en memoria
		Felipe.imprimirInfo(); //imprime la información
		Felipe.saludar();

		
	//Instancia de Dentista
		Dentista Simi = new Dentista("Dr Simi", "Lares", (byte)50, "12345678", "simi@lares.com", "Odontología", "55113344", "Consultorio 500", "avanzado", "matutino", 500);
		
		
		Simi.calcularSalario();
		Simi.imprimirInfoDentista();
	
	
		//Instancia de Paciente con todos los datos
				Paciente Chencho = new Paciente("CHNCH1234", "RH Positivo", true, true, "05/Oct/2023", "Doc. Simi Lares", false);
				System.out.println("********************");
				System.out.println(Chencho);
				
				
				
				//Instancia de Paciente con datos obligatorios
				Paciente Masiosare = new Paciente("MAS12345", false, false);
				System.out.println("********************");
				System.out.println(Masiosare);
		
		        //cambiar el false al true
				//Masiosare.seguroGastosMedicos = true;
				System.out.println("********************");
				System.out.println(Masiosare);
		
		
		
		
	}//cierre de main

}//cierre de class
