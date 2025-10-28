public class Curso {
    private String nombreCurso;
    private Profesor profesorAsignado;

    public Curso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public Profesor getProfesorAsignado() {
        return profesorAsignado;
    }

    // asignarProfesor: asigna y confirma
    public void asignarProfesor(Profesor profesor) {
        this.profesorAsignado = profesor;
        if (profesor != null) {
            System.out.println("Profesor " + profesor.getNombre() + " asignado al curso '" + nombreCurso + "'.");
        } else {
            System.out.println("Se ha removido el profesor asignado del curso '" + nombreCurso + "'.");
        }
    }

    // Mostrar información del curso y del profesor asignado
    public void mostrarInformacionCurso() {
        System.out.println("=== Información del Curso ===");
        System.out.println("Curso: " + nombreCurso);
        if (profesorAsignado != null) {
            System.out.println("Profesor asignado: " + profesorAsignado.getNombre());
        } else {
            System.out.println("Profesor asignado: (ninguno)");
        }
        System.out.println("=============================");
    }
}
