package Laboratorio_5.ejercicio3;

// Clase derivada Estudiante que extiende a Persona
public class Estudiante extends Persona {
    private String nombre; // Atributo para almacenar el nombre del estudiante

    // Constructor para inicializar el nombre del estudiante
    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    // Sobrescribir el método saludar() para incluir el nombre del estudiante
    @Override
    public void saludar() {
        System.out.println("Hola, soy el estudiante " + nombre + ".");
    }

    // Sobrecarga del método saludar() que acepta el nombre de otra persona
    public void saludar(String otroNombre) {
        System.out.println("Hola, soy " + nombre + ". ¡Hola, " + otroNombre + "!");
    }
}
