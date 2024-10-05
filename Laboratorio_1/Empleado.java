public class Empleado {
    // Atributos de la clase
    private String nombre;        // Nombre del empleado
    private double salario;       // Salario del empleado (privado)
    private String departamento;  // Departamento del empleado

    // Constructor que inicializa los atributos
    public Empleado(String nombre, double salario, String departamento) {
        this.nombre = nombre;
        this.salario = salario;
        this.departamento = departamento;
    }

    // Método para mostrar la información del empleado (incluye salario)
    public void mostrarInfoEmpleado() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Departamento: " + departamento);
        System.out.println("Salario: " + salario);
    }

    // Método para aumentar el salario (manipulación interna del salario)
    public void aumentarSalario(double incremento) {
        if (incremento > 0) {
            salario += incremento;
            System.out.println("El salario ha sido incrementado en: " + incremento);
        } else {
            System.out.println("El incremento debe ser positivo.");
        }
    }

    // Método main para probar la clase Empleado
    public static void main(String[] args) {
        // Crear un nuevo empleado
        Empleado empleado = new Empleado("Carlos Martínez", 50000, "Recursos Humanos");

        // Mostrar la información del empleado
        empleado.mostrarInfoEmpleado();

        // Intentar aumentar el salario
        empleado.aumentarSalario(5000);

        // Mostrar la información del empleado después del aumento
        empleado.mostrarInfoEmpleado();
    }
}
