package proyecto.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

import proyecto.lambda.interfaces.Persona;

public class AppPersonas {

	public static void main(String[] args) {
		List<Persona> listaPersonas = new ArrayList<Persona>();
		
		listaPersonas.add(new Persona(30,2));
		listaPersonas.add(new Persona(20,1));
		listaPersonas.add(new Persona(40,3));
		
		Integer sumaHijo  = listaPersonas.stream().mapToInt(UnaPersona -> UnaPersona.getCanttHijos()).sum();
		                                //mapar edad queda:[30,20,40]
		
		OptionalDouble promedioEdad  = listaPersonas.stream().mapToInt(UnaPersona -> UnaPersona.getEdad()).average();

		Integer unAcumulador = 0;
		for(Persona unaPersona : listaPersonas)
			unAcumulador =+ unaPersona.getEdad();
	}

}
