package proyecto.lambda.interfaces;

//Una interfaz funcional es aquella que declara un unico metodo
@FunctionalInterface //para valida si tiene un unico metodo o no
public interface Suma {
	
	int sumar(int unNumeros, int otroNumero);
}
