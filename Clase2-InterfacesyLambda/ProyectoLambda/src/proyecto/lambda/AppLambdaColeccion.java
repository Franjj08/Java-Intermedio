package proyecto.lambda;

import java.util.ArrayList;

public class AppLambdaColeccion {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		numeros.add(5);
		numeros.add(1);
		
		//Uso expresion lambda para imprimir en pantalla
//		numeros.forEach(
//				//expresion lambda
//				//(PARAMETROS)->(COMPORTAMIENTO)
//				(Integer unNumero) ->{
//					System.out.println(unNumero);
//				});
		
		numeros.forEach(unNumero -> System.out.println(unNumero));
		
//		Ejemplo de analogia  con un metod en JAVA
//		void imprimirEnPantalla(Integer unNumero) {
//			System.out.println(unNumero);
//		}
		System.out.println("Imprimir solo numero pares");
		numeros.forEach(unNumero-> {
			if(unNumero % 2 == 0)
				System.out.println(unNumero);
		});
		//Ejemplo incompleto con lista
//		List<Persona> listaDePersona = new ArrayList<Persona>();
//		
//		listaDePersona.forEach(unPersona-> unaPersona.getEdad());
	}

}
