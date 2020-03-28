public class Estado {
	public double precio(double unPrecio) {
		return unPrecio;
	}
}

class Nueva extends Estado{
	
	@Override public double precio(double unPrecio) {
		return unPrecio;
	}
}

class Liquidacion extends Estado {
	
	@Override public double precio(double unPrecio) {
		return unPrecio / 2;
	}
}

class Promocion extends Estado {
	
	public double valorFijo;
	
	@Override public double precio(double unPrecio) {
		return unPrecio - valorFijo;
	}

}