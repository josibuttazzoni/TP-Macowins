package tpMacowins;
public class Prenda {
	double precioBase;
	Estado estado;
		
	public double precio () {
		return estado.getPrecio(precioBase);
	}
}




