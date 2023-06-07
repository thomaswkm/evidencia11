import java.util.ArrayList;

public class Departamento {
	private ArrayList<Profesor> profesores = new ArrayList<Profesor>();
	private ArrayList<Administrativo> administrativos = new ArrayList<Administrativo>();
	private ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();

	public Departamento(ArrayList<Profesor> profesores, ArrayList<Administrativo> administrativos, ArrayList<Estudiante> estudiantes) {
		this.profesores = profesores;
		this.administrativos = administrativos;
		this.estudiantes = estudiantes;
	}

	public Estudiante buscarEstudiante(Estudiante estudianteBuscado) throws Exception {
		if(this.estudiantes.contains(estudianteBuscado)){
			return estudianteBuscado;
		}else{
			throw new Exception("No se encontró el estudiante");
		}
	}

	public Estudiante buscarEstudiantePorRut(String rut) throws Exception {
		for (Estudiante estudiante: this.estudiantes) {
			if(rut.equals(estudiante.getRut())){
				return estudiante;
			}
		}
		throw new Exception("No se encontró el estudiante");
	}

	public Estudiante buscarEstudiantePorNombre(String nombre) throws Exception {
		for (Estudiante estudiante: this.estudiantes) {
			if(nombre.equals(estudiante.getNombre())){
				return estudiante;
			}
		}
		throw new Exception("No se encontró el estudiante");
	}

	public Profesor buscarProfesor(Profesor profesor) throws Exception {
		if(this.profesores.contains(profesor)){
			return profesor;
		}else{
			throw new Exception("No se encontró al profesor");
		}
	}

	public Profesor buscarProfesorPorRut(String rut) throws Exception {
		for (Profesor profesor: this.profesores) {
			if(rut.equals(profesor.getRut())){
				return profesor;
			}
		}
		throw new Exception("No se encontró el estudiante");
	}

	public Profesor buscarProfesorPorNombre(String nombre) throws Exception {
		for (Profesor profesor: this.profesores) {
			if(nombre.equals(profesor.getNombre())){
				return profesor;
			}
		}
		throw new Exception("No se encontró el estudiante");
	}

	public void mostrarPersonalDepartamento(){
		System.out.println("Profesores: ");
		for (Profesor profesor : this.profesores) {
			System.out.println(profesor);
		}
		System.out.println("Administrativos: ");
		for (Administrativo administrativo : this.administrativos) {
			System.out.println(administrativo);
		}
		System.out.println("Estudiantes: ");
		for (Estudiante estudiante : this.estudiantes) {
			System.out.println(estudiante);
		}
	}


}