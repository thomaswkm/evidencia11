public class PersonalContratado extends Persona {
	protected int añoIncorporacion;

	public PersonalContratado(String nombre, String rut, String estadoCivil, int añoIncorporacion) {
		super(nombre, rut, estadoCivil);
		this.añoIncorporacion = añoIncorporacion;
	}
}