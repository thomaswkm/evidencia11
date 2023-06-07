import java.util.ArrayList;

public class Profesor extends PersonalContratado {
	private ArrayList<Asignatura> asignaturas = new ArrayList<Asignatura>();

	public Profesor(String nombre, String rut, String estadoCivil, int añoIncorporacion, ArrayList<Asignatura> asignaturas) {
		super(nombre, rut, estadoCivil, añoIncorporacion);
		this.asignaturas = asignaturas;
	}
}