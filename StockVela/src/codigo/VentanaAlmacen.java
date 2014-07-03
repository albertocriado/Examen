package codigo;


public class VentanaAlmacen {

	public static void main(String[] args) {
		CalculoAlmacen almacenCalc=new CalculoAlmacen();
		
		//Anyadimos varias llantas
		almacenCalc.anyadirLlantaAlmacen1(0);
		almacenCalc.anyadirLlantaAlmacen2(0);
		almacenCalc.anyadirLlantaAlmacen1(1);
		almacenCalc.anyadirLlantaAlmacen2(2);
		
		for(int i=0;i<10;i++)
			almacenCalc.anyadirLlantaAlmacen2(0);
		
		//Sacar por pantalla totales
		System.out.println(almacenCalc.calcularTotalAlmacen1());
		System.out.println(almacenCalc.calcularTotalAlmacen2());
	}

}
