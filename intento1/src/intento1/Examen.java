package intento1;

public class Examen {

	
	Fecha fecha;
	Hora hora;
	String asignatura;
	String aula;

	
	public Examen(Fecha fecha, Hora hora, String asignatura, String aula) {
		this.fecha=fecha;
		this.hora=hora;
		this.asignatura=asignatura;
		this.aula=aula;
	}


	@Override
	public String toString() {
		return "Examen [fecha=" + fecha + ", hora=" + hora + ", asignatura=" + asignatura + ", aula=" + aula + "]";
	}
	

	
	
}
