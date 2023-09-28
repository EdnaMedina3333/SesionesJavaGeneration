package logicOperators;

public class Exercise {

	public static void main(String[] args) {
		//Enrique, Paola y Mariana compran un iphone 15. Si el total de la compra supera los 25mil pesos, por lo tanto obtienen un 10% de descuento. La tienda en estos momentos cuenta con una promoción de 12 meses sin intereses, por lo tanto, deciden pagar con la TDC de Mariana. ¿ Cuál sería el costo total de los equipos?¿Aplica descuento? ¿Cuál sería el costo total con descuento? ¿Cuánto pagarían mensualmente?

		
		//Precio del iphone15
		int iphone15 = 19499;
		//Enrique, Paola y Mariana van a comprar un iphone por lo que en total se comprarán 3 iphone15
		int cantidad = 3;
		//$19499 * 3 = $58497
		double costoPorCantidad = (iphone15 * cantidad);
		//Se saca el 10% de $58497 lo cual da $5849.7
		double descuento = (costoPorCantidad * 0.10);
		//Se calcula el descuento haciendo la resta $58497 - $5849.7 = $52,647.3
		double costoConDescuento = (costoPorCantidad - descuento);
		//Aplica la promoción de 12 meses sin intereses
		boolean promocion = true;
		
		//Se utiliza una condicional para comprobar si se debe aplicar el descuento, en este caso como el costoPorCantidad supera los $25000, sí aplica
		if (costoPorCantidad > 25000.000) {
			System.out.println("Aplica el 10% de descuento, su total es de: $ " + costoConDescuento);
		} else {
			System.out.println("Su total es de: $ " + costoPorCantidad);
		}
		//Se utiliza una condicional para comprobar si se debe aplicar la promoción, en este caso sí aplica
		if (promocion = true) {
			System.out.println("Aplica promoción 12 meses sin intereses, debe pagar: $ " + (costoConDescuento/12) + " al mes");
		} else {
			System.out.println("No aplica promoción");
		}
		
		
	}//cierre de main
}//cierre de class
