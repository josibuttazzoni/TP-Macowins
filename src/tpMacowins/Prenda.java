package tpMacowins;
public class Prenda {
	double precioBase;
	Estado estado;
	Tipo tipo;
		
	public double precio () {
		return estado.getPrecio(precioBase);
	}
}

enum Tipo {
	Camisa,
	Pantalon,
	Saco
}



