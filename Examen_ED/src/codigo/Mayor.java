package codigo;

/*
 * Clase que nos devuelve el número mayor entre dos números
 * */
public class Mayor {
	//Inicialización
	private int a;
	private int b;

	//Constructor
	public Mayor() {
		a=0;
		b=0;
	}
	
	public void setA(int a){
		this.b=b;
	}

	public void setB(int b){
		this.b=b;
	}
	
	//Método que permite decolver el número mayor
	public int mayor(){
		if(a>b) return a;
		else return b;
	}
}
