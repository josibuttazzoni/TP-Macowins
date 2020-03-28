public class Prenda {
	double precioBase;
	Estado estado;
		
	public double precio () {
		return estado.precio(precioBase);
	}
}

class Camisa extends Prenda {
	
}

class Saco extends Prenda {
	
}

class Pantalon extends Prenda {
	
}