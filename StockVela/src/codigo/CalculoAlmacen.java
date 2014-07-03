package codigo;


public class CalculoAlmacen {
	Material[] materialAlmacen1=new Material[10];
	Material[] materialAlmacen2=new Material[5];
	
	public CalculoAlmacen() {
		for(int i=0;i<materialAlmacen1.length;i++)
		{
			materialAlmacen1[i]=new Material();
		}
		for(int i=0;i<materialAlmacen2.length;i++)
		{
			materialAlmacen2[i]=new Material();
		}
	}
	
	public int calcularTotalAlmacen1(){
		int total=0;
		for(int i=0;i<materialAlmacen1.length;i++)
		{
			total=materialAlmacen2[i].catidadEnAlmacen+total;
		}
		return total;
	}
	
	public int calcularTotalAlmacen2(){
		int total=0;
		for(int i=0;i<materialAlmacen2.length;i++)
		{
			total=materialAlmacen2[i].catidadEnAlmacen+total;
		}
		return total;
	}
	
	public void anyadirLlantaAlmacen1(int posicion){
		materialAlmacen1[posicion].addMaterial();
	}
	
	public void anyadirLlantaAlmacen2(int posicion){
		materialAlmacen2[posicion].addMaterial();
	}
	
}
