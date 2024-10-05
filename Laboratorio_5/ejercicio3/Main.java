package Laboratorio_5.ejercicio3;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto de la clase Persona
        Persona persona = new Persona();
        persona.saludar(); // Saludo genérico

        // Crear un objeto de la clase Estudiante
        Estudiante estudiante = new Estudiante("Juan");
        estudiante.saludar(); // Saludo con el nombre del estudiante

        // Llamar al método saludar() sobrecargado
        estudiante.saludar("María"); // Saludo personalizado a otra persona
    }
}

