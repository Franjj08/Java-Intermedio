package proyecto.lambda;

public class AppCompleto {
	
	interface OperacionMatematica {
		int aplicar(int a, int b);
	}
	
	interface ImprimirMensaje{
		void imprimir(String mensaje);
	}
	
	interface ImprimirMensajeDefault{
		void imprimirDefault();
	}

	public static void main(String[] args) {

		OperacionMatematica suma = (x, y) -> x + y;
		OperacionMatematica multiplicacion = (x, y) -> x * y;
		
		System.out.println("la suma es: "+suma.aplicar(10, 0));
		System.out.println("la multiplicaion es: "+multiplicacion.aplicar(10, 0));

		ImprimirMensaje imprimirMensaje = mensaje -> System.out.println("El mensaje es: "+mensaje);
		imprimirMensaje.imprimir("Prueba");
		
		ImprimirMensajeDefault imprimirDefault = () ->System.out.println("El mensaje default");
		imprimirDefault.imprimirDefault();
	}

}
