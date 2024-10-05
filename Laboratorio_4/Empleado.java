package Laboratorio_4;


// Clase base Empleado
public class Empleado {
    protected String nombre;
    protected double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public double calcularBono() {
        return salario * 0.10; // 10% del salario
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    // Clase principal para demostración
public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan Pérez", 30000);
        Gerente gerente = new Gerente("María Gómez", 50000);

        System.out.println("Empleado: " + empleado.getNombre());
        System.out.println("Salario: $" + empleado.getSalario());
        System.out.println("Bono: $" + empleado.calcularBono());

        System.out.println("\nGerente: " + gerente.getNombre());
        System.out.println("Salario: $" + gerente.getSalario());
        System.out.println("Bono: $" + gerente.calcularBono());
    }
}
}
