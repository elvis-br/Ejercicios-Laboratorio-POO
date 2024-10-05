package Laboratorio_5.Ejercicio4;

// Clase derivada Coche que extiende a Vehiculo
public class Coche extends Vehiculo {
    private int numeroPuertas; // Atributo para almacenar el número de puertas

    // Constructor de la clase Coche que inicializa la marca y el número de puertas
    public Coche(String marca, int numeroPuertas) {
        super(marca); // Llama al constructor de la clase base Vehiculo
        this.numeroPuertas = numeroPuertas; // Inicializa el número de puertas
    }

    // Método para obtener el número de puertas
    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    // Método para mostrar la información del coche
    public void mostrarInfo() {
        System.out.println("Marca: " + getMarca() + ", Número de puertas: " + numeroPuertas);
    }
}

