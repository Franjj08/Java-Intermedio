package proyecto.lambda;

import proyecto.lambda.interfaces.Suma;

public class AppSuma {

	public static void main(String[] args) {
		//Las expresiones lambda ser asignadas a variables
		//Suma lambdaSuma = (int unNumero, int otroNumero) -> unNumero + otroNumero; 
	
		//se puede no poner el tipo, por eso la funcion es unica
		Suma lambdaSuma = (unNumero,otroNumero) -> unNumero + otroNumero;
		
		int resultadoSuma = lambdaSuma.sumar(5, 8);
		
		System.out.print(resultadoSuma);
	}

}
