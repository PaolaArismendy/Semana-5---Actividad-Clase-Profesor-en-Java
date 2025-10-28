public class Main {
    public static void main(String[] args) {
        // Crear cuatro instancias usando los cuatro constructores
        Profesor p1 = new Profesor("Ana Pérez", "12345678", 1200.0, 30, true);
        Profesor p2 = new Profesor("Luis Gomez", "87654321", 900.0);
        Profesor p3 = new Profesor();
        Profesor p4 = new Profesor("María Ruiz", "11223344");

        // Mostrar información de cada profesor
        System.out.println("Mostrando información de los profesores:");
        p1.mostrarInformacion();
        p2.mostrarInformacion();
        p3.mostrarInformacion();
        p4.mostrarInformacion();

        // Probar los tres métodos calcularSalarioAnual() para p1
        System.out.println("Salario anual (p1) sin bono: " + p1.calcularSalarioAnual());
        System.out.println("Salario anual (p1) con bono 1500.0: " + p1.calcularSalarioAnual(1500.0));
        System.out.println("Salario por 6 meses (p1): " + p1.calcularSalarioAnual(6));

        // Probar ambos métodos evaluarCargaHoraria() para p1
        System.out.println("Evaluación carga horaria (p1) default: " + p1.evaluarCargaHoraria());
        System.out.println("Evaluación carga horaria (p1) con límite 25: " + p1.evaluarCargaHoraria(25));

        // Calcular horas anuales de p1
        System.out.println("Horas anuales (p1): " + p1.calcularHorasAnuales());

        // Asignar un profesor a un curso
        Curso curso = new Curso("Matemáticas");
        p1.asignarCurso(curso); // usa this internamente
        curso.mostrarInformacionCurso();

        // Modificar las horas semanales de un profesor con asignarHorasSemanales()
        System.out.println("\nModificando horas semanales de p2 a 45 (debe limitar a 40):");
        p2.asignarHorasSemanales(45);
        p2.mostrarInformacion();

        // Prueba adicional: asignar horas válidas
        System.out.println("Asignando 25 horas a p4:");
        p4.asignarHorasSemanales(25);
        p4.mostrarInformacion();
    }
}
