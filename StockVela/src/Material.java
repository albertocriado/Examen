
public class Material {
	int catidadEnAlmacen=0;
	String marca="";
	String modelo="";
	String dimensiones="";
	
	public Material() {
		catidadEnAlmacen=0;
		marca="";
		modelo="";
		dimensiones="";
	}
	
	public void addMaterial(){
		catidadEnAlmacen++;
	}
	
	public void addMaterial(int num){
		catidadEnAlmacen=catidadEnAlmacen+num;
	}
	
	public void subsMaterial(){
		catidadEnAlmacen--;
	}
	
	public void subsMaterial(int num){
		catidadEnAlmacen=catidadEnAlmacen-num;
	}

}
