public class Estudiante extends Persona {
	private Asignatura asignatura;

	public Estudiante(String nombre, String rut, String estadoCivil, Asignatura asignatura) {
		super(nombre, rut, estadoCivil);
		this.asignatura = asignatura;
	}

}