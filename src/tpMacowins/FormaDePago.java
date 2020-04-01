package tpMacowins;

public class FormaDePago {
	
	public int cuotas;
	
	public int getCuotas () {
		return cuotas;
	}
	
	public double getExtra (double unTotal, int cuotas) {
		return 0;
	}

}

class Efectivo extends FormaDePago {
	
}

class Tarjeta extends FormaDePago {
	
	int coefFijo;
	
	@Override public double getExtra (double unTotal, int cuotas) {
		return coefFijo * cuotas + 0.1 * unTotal;
	}
}