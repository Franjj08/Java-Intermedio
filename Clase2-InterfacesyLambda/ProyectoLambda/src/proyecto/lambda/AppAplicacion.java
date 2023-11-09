package proyecto.lambda;

import proyecto.lambda.interfaces.Operacion;

public class AppAplicacion {

	public static void main(String[] args) {

		int unNumero = 10;
		int otroNumero = 5;
		
//		Operacion suma = (x,y) -> x +y;
//		Operacion multiplicacion = (x, y) -> x * y;
		
		//Ais se ahorra la memoria
		//int suma = calcular(unNumero, otroNumero ,(x,y)->x+y);
		
		int suma = calcular(unNumero, otroNumero, (a, b) -> a + b);
		System.out.println( "La suma de " + unNumero + " y " + otroNumero + " es: " + suma);
		int resta = calcular(unNumero, otroNumero, (a, b) -> a - b);
		System.out.println( "La resta de " + unNumero + " y " + otroNumero + " es: " + resta);
		int producto = calcular(unNumero, otroNumero, (a, b) -> a * b);
		System.out.println( "El producto de " + unNumero + " y " + otroNumero + " es: " + producto);
		int cociente = calcular(unNumero, otroNumero, (a, b) -> a / b);
		System.out.println( "El cociente de " + unNumero + " y " + otroNumero + " es: " + cociente);
	}
	
	public static int calcular (int unNumero, int otroNumero, Operacion operacion) {
		return operacion.aplicar(unNumero, otroNumero);
	}
}
