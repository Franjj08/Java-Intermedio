package proyecto.lambda;

import proyecto.lambda.interfaces.Descuento;

public class AppDescuento {

	public static void main(String[] args) {
		
		Descuento descuentoDijo = monto -> {
			if(monto > 500)
				return monto -500;
			else
				return 0.0;
		};
		
		//(CONDICION) ? (EL CAMINO DEL TRUE) : (EL CAMINO DEL ELSE)
		Descuento descuentoFijo1 = monto -> (monto > 500) ? monto- 500: 0.0;
		
		Descuento descuentoPorcentaje = monto -> (monto - monto * 0.3);
		
		System.out.println(descuentoFijo1.aplicar(1000.0));
		System.out.println(descuentoPorcentaje.aplicar(1000.0));

	}

}
