package Persona;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
public class Test {
	
    //Método principal para instanciar mis clases
	public static void main(String[] args) {
		
		/*
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
		*/
		
				
				
				
				
				
				//Colecciones
				//A)Implementación de un ArrayList de Dentista
				List<Dentista> listaDentistaArrayList = new ArrayList<>();
				
				Dentista DrChapatin = new Dentista ("Dr Chapatin", "Chespirito", (byte)45, "11223344", "chapatin@mail.com", "General", "666123455", "Consultorio 200", "anazado", "matutino", 450);
				//luego la agrego a la lista
				listaDentistaArrayList.add(DrChapatin);
				
				//si agrego la instancia a una variable, puedo imprimir su información usando un toString, o un método mostrarInfo();
				
				
				//Hago una instancia y la agrego directamente a la lista
				listaDentistaArrayList.add(new Dentista("Dr Simi", "Lares", (byte)50, "12345678", "simi@lares.com", "Odontología", "55113344", "Consultorio 500", "avanzado", "matutino", 500));
				
				//si genero la instancia y la agrego directamente al arrayList, para sacar al dato tendré que utilizar un forEach o algún ciclo para imprimir el dato
				
				
				
				//B)Implementación de lista de Dentistas con un HashSet
				Set<Dentista> conjuntoDentistas = new HashSet<>();
				
				//agregando Dentista a mi conjunto
				conjuntoDentistas.add(new Dentista("Dr Simi", "Lares", (byte)50, "12345678", "simi@lares.com", "Odontología", "55113344", "Consultorio 500", "avanzado", "matutino", 500));
				
				
				
				
				//C) Implementación de lista de Dentistas con un HashMap
				Map<String, Dentista> mapaDentistas = new HashMap<>();
				
				//agregar un dentista a mi mapa
				mapaDentistas.put("Dr House", new Dentista("Gregory", "House", (byte)55, "12345678", "house.com", "Cirujano", "55113344", "Consultorio 600", "avanzado", "vespertino", 1400));
				
				//imprimir el objeto Dr House
				Dentista DoctorBuscado = mapaDentistas.get("Dr House");
				
				System.out.println(DoctorBuscado);
		
		
	}//cierre de main

}//cierre de class
