package Laboratorio_4;

// Clase base Vehiculo
public abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int año;

    public Vehiculo(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public abstract void mover();

    public void mostrarInfo() {
        System.out.println("Vehículo: " + marca + " " + modelo + " (" + año + ")");
    }

    // Getters y setters
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public int getAño() { return año; }
    public void setAño(int año) { this.año = año; }
    // Clase principal para demostración
public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche("Toyota", "Corolla", 2022, "Gasolina", 150, 4);
        Motocicleta moto = new Motocicleta("Honda", "CBR", 2023, "Gasolina", 100, "Deportivo");

        System.out.println("Información del coche:");
        coche.mostrarInfo();
        coche.arrancar();
        coche.mover();
        coche.abrirMaletero();

        System.out.println("\nInformación de la motocicleta:");
        moto.mostrarInfo();
        moto.arrancar();
        moto.mover();
        moto.hacerCaballito();
    }
}
}
