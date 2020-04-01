package tpMacowins;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Local {
	
	List<Venta> ventas = new ArrayList <Venta>() ;
	
	public void agregarVenta (Venta unaVenta) {
		ventas.add(unaVenta);
	}
	
	public double gananciaDia(Date unDia) {
		return ventas.stream().mapToDouble(venta -> venta.totalVenta()).sum();
	}

}
