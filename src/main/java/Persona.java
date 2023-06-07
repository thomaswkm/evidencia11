public class Persona {
	protected String nombre;
	protected String rut;
	protected String estadoCivil;

	public Persona(String nombre, String rut, String estadoCivil) {
		this.nombre = nombre;
		this.rut = rut;
		this.estadoCivil = estadoCivil;
	}

	public String getNombre() {
		return nombre;
	}

	public String getRut() {
		return rut;
	}
}