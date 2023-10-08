package collections2;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
public class collections2 {
public static void main(String[] args) {
	
	/*
	 * Colecciones
	 * - Arrays (arreglos): es una estructura de datos lineal que contiene elementos del mismo tipo.
Los elementos están almacenados de forma contigua (uno al lado del otro), y se puede acceder a ellos a través de un índice. Las principales características son:
	 *   --Es una estructura de datos fija, generalmente almacena datos del mismo tipo
	 *   -- La longitud de un array se establece al momento de crearlo, y no cambia
	 *   -- Podemos acceder a elementos por medio de un indice
	 *   -- Los arrays pueden contener datos primitivos y objetos
	 *   -- No proporciona métodos adicionalespara agregar o eliminar elementos
	 *   
	 *  Un ejemplo es una lista de compras del super
	 *  
	 *  
	 * - ArrayList
	 *   Es una implementaciónd e una lista (List), es decir, que está en un nivel debajo de las listas. Utilizando un array dinámico que permite almacenar datos.
	 *   Sus principales características son:
	 *    -- Tamaño dinámico, a diferencia de los arrays tradicionales, el tamaño de un array list sí se puede modificar
	 *    -- Acceso rapido, podemos acceder a un elemento del arrayList por su posicion o indice
	 *    -- Coste elevado al momento de insertar o eliminar elementos. Si agrego un elemento, tengo que recorrer todos los demas elementos. 
	 * 
	 *    
	 * - Set (conjunto)
	 *   Estructura de datos que almacena datos únicos y que no tienen un ordes.
	 *   Sus principales características son:
	 *    -- No hay elementos duplicados, ya que los conjuntos no los pueden contener. Si se intenta agregar un elemento ya existente, la operación se ignora.
	 *    -- No hay orden específico, los elementos se almacenan sin orden específico.
	 *    -- La búsqueda es más sencilla, ya que al no tener elementos duplicados se usa una función hash para encontrar el elemento deseado.
	 *    
	 *    
	 *        
	 * - Map
	 *   Es una estructura de datos que almacena pares de key-value,sus principales características son:
	 *   -- Almacenamiento con pares K-V    
	 *   -- Sin un orden específico (similar a un Set)
	 *   -- Búsqueda rápida, la búsqueda se hace por medio de un valor (Key), y usa una función interna hash para buscar elementos.
	 *   Ejemplo:
	 *  Agenda telefonica (agregar, modificar, eliminar)    
	 * */
	
	
	
	/*
	//Array
	//Tipo de dato del array, nombre, instancia del objeto arreglo, los datos
	String listaDeCompras [] = new String [] {"Leche", "Pan", "Huevos"};
	//Esta impresion solo muestra el espacio en memoria
	System.out.println(listaDeCompras);
	
	//Imprimir info de lista de compras con un forEach
	//para el dato de tipo String que llamaremos productoAImprimir de la lista de compras, lo vamos a tomar y los vamos a imprimir
	for (String productoAImprimir : listaDeCompras) {
		System.out.println(productoAImprimir);
	}//forEach
	*/
	
	
	
	//Implementación de un arrayList
	//Clase general (interfaz), tipo de dato que usaré, nombre de mi estructura de datos, instancia de dicha clase general
	List<String> listaDeContactos = new ArrayList <>();
	
	//Agrego elementos del tipo String a mi arrayList llamado listaDeContactos
	listaDeContactos.add("Felipe");
	listaDeContactos.add("Roberto");
	listaDeContactos.add("Alicia");
	listaDeContactos.add("Fatima");
	
	//obtener un elemento de la lista - asignarlo a una variable
	String datoFelipe = listaDeContactos.get(0);
	System.out.println(datoFelipe);
	
	//borrar un elemento de la lista
	listaDeContactos.remove(1);
	System.out.println(listaDeContactos);
	
	
	//Implementación de un Set (conjunto)
	//Sintaxis
	//Interface de donde implemento + tipo de dato que usaré + nombre que le doy al conjunto + instancia de la clase específica
	Set<String> cartasDeJuego = new HashSet<>();
	
	//Agregar elemento
	cartasDeJuego.add("As de corazones");
	cartasDeJuego.add("2 de picas");
	cartasDeJuego.add("Reina de treboles");
	
	//no puedo saber posiciones, solo saber si lo contiene (método contains)
	if(cartasDeJuego.contains("Reina de treboles")) {
		System.out.println("La Reina de treboles sí está en el conjunto");
	} else {
		System.out.println("No encuentro el elemento solicitado");
	}
	
	
	
	//Implementación de un Map (HashMap)
	Map<String, String> libretaDirecciones = new HashMap <>();
	
	//agregar elementos a mi libreta de direcciones, donde mi K=nombre y V=dirección
	libretaDirecciones.put("Felipe", "Tlalnepantla");
	libretaDirecciones.put("Dr Simi", "CDMX");
	libretaDirecciones.put("Konoha", "Naruto");
	
	//método para sacar información de la libreta de direcciones, creando una nueva variable
	String direccionFelipe = libretaDirecciones.get("Felipe");
	System.out.println(direccionFelipe);//Tlalnepantla
	
	String direccionDrSimi = libretaDirecciones.get("Dr Simi");
	System.out.println(direccionDrSimi);//CDMX
	
	String direccionNaruto = libretaDirecciones.get("Naruto");
	System.out.println(direccionNaruto);//null
	
	
	}//metodo main
}//cierre class collections2
