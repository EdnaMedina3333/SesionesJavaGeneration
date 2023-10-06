package collections2;

public class collections2 {
public static void main(String[] args) {
	
	/*
	 * Colecciones
	 * - Arrays (arreglos): es una estructura de datos lineal que contiene elementos del mismo tipo. Los elementos están almacenados de forma contigua (uno al lado del otro), y se puede acceder a ellos a través de un índice. Las principales características son:
	 *   --Es una estructura de datos fija, generalmente almacena datos del mismo tipo
	 *   -- La longitud de un array se establece al momento de crearlo, y no cambia
	 *   -- Podemos acceder a elementos por medio de un indice
	 *   -- Los arrays pueden contener datos primitivos y objetos
	 *   -- No proporciona métodos adicionalespara agregar o eliminar elementos
	 *   
	 *  Un ejemplo es una lista de compras del super
	 * */
	
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
	
	
	

	}//metodo main
}//cierre class collections2
