package Laboratorio_5.ejercicio2;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto de la clase Coche y uno de la clase Avion
        Movible coche = new Coche();
        Movible avion = new Avion();

        // Llamar al método moverse de cada uno
        coche.moverse(); // Imprime: El coche se mueve por la carretera a través de sus ruedas.
        avion.moverse(); // Imprime: El avión se mueve por el aire utilizando sus alas y motores.
    }
}
