public class Profesor {
    private String nombre;
    private String numeroIdentificacion;
    private double salarioMensual;
    private int horasSemanales;
    private boolean esTiempoCompleto;

    // Constructor completo
    public Profesor(String nombre, String numeroIdentificacion, double salarioMensual, int horasSemanales, boolean esTiempoCompleto) {
        this.nombre = nombre;
        this.numeroIdentificacion = numeroIdentificacion;
        setSalarioMensual(salarioMensual);
        setHorasSemanales(horasSemanales);
        this.esTiempoCompleto = esTiempoCompleto;
    }

    // Constructor con nombre, id y salario (horas=20, tiempoCompleto=false)
    public Profesor(String nombre, String numeroIdentificacion, double salarioMensual) {
        this(nombre, numeroIdentificacion, salarioMensual, 20, false);
    }

    // Constructor por defecto
    public Profesor() {
        this("Sin nombre", "Sin identificación", 0.0, 0, false);
    }

    // Constructor con nombre y id (salario=0.0, horas=10, tiempoCompleto=false)
    public Profesor(String nombre, String numeroIdentificacion) {
        this(nombre, numeroIdentificacion, 0.0, 10, false);
    }

    // Mostrar información
    public void mostrarInformacion() {
        System.out.println("-------------------------------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Identificación: " + numeroIdentificacion);
        System.out.println("Salario mensual: " + salarioMensual);
        System.out.println("Horas semanales: " + horasSemanales);
        System.out.println("Tiempo completo: " + (esTiempoCompleto ? "Sí" : "No"));
        System.out.println("-------------------------------");
    }

    // calcularSalarioAnual(): sin parámetros
    public double calcularSalarioAnual() {
        return salarioMensual * 12;
    }

    // calcularSalarioAnual con bono anual
    public double calcularSalarioAnual(double bonoAnual) {
        return calcularSalarioAnual() + bonoAnual;
    }

    // calcularSalarioAnual con meses
    public double calcularSalarioAnual(int meses) {
        return salarioMensual * meses;
    }

    // asignarHorasSemanales con validación (no exceder 40)
    public void asignarHorasSemanales(int horas) {
        if (horas < 0) {
            System.out.println("No se pueden asignar horas negativas. Se mantiene el valor anterior: " + this.horasSemanales);
            return;
        }
        if (horas > 40) {
            System.out.println("Advertencia: Las horas solicitadas exceden 40. Se asignarán 40 horas como máximo.");
            this.horasSemanales = 40;
        } else {
            this.horasSemanales = horas;
        }
    }

    // evaluarCargaHoraria sin parámetros
    public String evaluarCargaHoraria() {
        return (horasSemanales <= 20) ? "Carga normal" : "Carga alta";
    }

    // evaluarCargaHoraria con límite personalizado
    public String evaluarCargaHoraria(int limiteHoras) {
        if (horasSemanales <= limiteHoras) {
            return "Carga dentro del límite (<= " + limiteHoras + ")";
        } else {
            return "Carga por encima del límite (> " + limiteHoras + ")";
        }
    }

    // asignarCurso: pasa this al curso
    public void asignarCurso(Curso curso) {
        if (curso == null) {
            System.out.println("Curso nulo. No se puede asignar.");
            return;
        }
        curso.asignarProfesor(this);
    }

    // calcularHorasAnuales (asumiendo 40 semanas laborales)
    public int calcularHorasAnuales() {
        return horasSemanales * 40;
    }

    // Getters y Setters con encapsulación y validaciones
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        if (salarioMensual < 0) {
            System.out.println("Salario no puede ser negativo. Se mantiene el valor anterior: " + this.salarioMensual);
            return;
        }
        this.salarioMensual = salarioMensual;
    }

    public int getHorasSemanales() {
        return horasSemanales;
    }

    public void setHorasSemanales(int horasSemanales) {
        if (horasSemanales < 0) {
            System.out.println("Horas semanales no puede ser negativo. Se mantiene el valor anterior: " + this.horasSemanales);
            return;
        }
        if (horasSemanales > 40) {
            System.out.println("Horas semanales no puede exceder 40. Se asignarán 40 horas.");
            this.horasSemanales = 40;
        } else {
            this.horasSemanales = horasSemanales;
        }
    }

    public boolean isEsTiempoCompleto() {
        return esTiempoCompleto;
    }

    public void setEsTiempoCompleto(boolean esTiempoCompleto) {
        this.esTiempoCompleto = esTiempoCompleto;
    }
}
