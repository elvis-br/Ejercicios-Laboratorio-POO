package Laboratorio_5;

public abstract class Forma {
    protected String nombre;

    public Forma(String nombre) {
        this.nombre = nombre;
    }

    // Método abstracto para calcular el área
    public abstract double calcularArea();

    // Método para mostrar información de la forma
    public void mostrarInformacion() {
        System.out.println("Forma: " + nombre);
        System.out.println("Área: " + calcularArea());
    }

    // Getter y setter para el nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    // Clase principal para demostración
public class Main {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo("Triángulo Rectángulo", 4, 3);
        Cuadrado cuadrado = new Cuadrado("Cuadrado", 5);

        System.out.println("Información del triángulo:");
        triangulo.mostrarInformacion();

        System.out.println("\nInformación del cuadrado:");
        cuadrado.mostrarInformacion();
    }
}
}
