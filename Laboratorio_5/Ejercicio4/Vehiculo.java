package Laboratorio_5.Ejercicio4;

// Clase base Vehiculo
public class Vehiculo {
    private String marca; // Atributo para almacenar la marca del vehículo

    // Constructor de la clase Vehiculo
    public Vehiculo(String marca) {
        this.marca = marca; // Inicializa la marca del vehículo
    }

    // Método para obtener la marca del vehículo
    public String getMarca() {
        return marca;
    }
}
