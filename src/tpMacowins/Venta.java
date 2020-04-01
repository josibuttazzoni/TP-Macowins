package tpMacowins;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Venta {

	List<Prenda> prendas = new ArrayList <Prenda>();
	Date fecha;
	FormaDePago formaDePago;
	
	public void venderPrenda (Prenda prenda) {
		prendas.add(prenda);
	}
	
	public double totalVenta () {
		double total = 0;
		total = prendas.stream().mapToDouble(prenda -> prenda.precio()).sum();
		total += formaDePago.getExtra(total, formaDePago.getCuotas());
		return total;
	}
	
}