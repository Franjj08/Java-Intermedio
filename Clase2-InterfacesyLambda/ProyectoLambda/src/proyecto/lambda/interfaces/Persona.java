package proyecto.lambda.interfaces;

//@Getter @Setter //Generar Getter and Setter automaticamente
public class Persona {
	
	Integer edad ;
	Integer canttHijos;
	
	public Persona(Integer edad, Integer cantHijos) {
			this.setCanttHijos(cantHijos);
			this.setEdad(edad);
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Integer getCanttHijos() {
		return canttHijos;
	}

	public void setCanttHijos(Integer canttHijos) {
		this.canttHijos = canttHijos;
	}
	
}
