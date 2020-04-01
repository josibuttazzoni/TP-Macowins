package tpMacowins;
public interface Estado {
	public double getPrecio(double unPrecio);
}

class Nueva implements Estado {
	
	public double getPrecio(double unPrecio){
		return unPrecio;
	}
	
	
}

class Liquidacion implements Estado {

	public double getPrecio(double unPrecio) {
		return unPrecio / 2;
	}
}

class Promocion implements Estado {
	
	public double valorFijo;
	
	public double getPrecio(double unPrecio) {
		return unPrecio - valorFijo;
	}

}