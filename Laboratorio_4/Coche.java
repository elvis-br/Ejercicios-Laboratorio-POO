package Laboratorio_4;

// Clase final Coche
public final class Coche extends VehiculoMotorizado {
    private int numeroPuertas;

    public Coche(String marca, String modelo, int año, String tipoCombustible, int potencia, int numeroPuertas) {
        super(marca, modelo, año, tipoCombustible, potencia);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void mover() {
        System.out.println("El coche está circulando por la carretera.");
    }

    @Override
    public void arrancar() {
        System.out.println("El coche arranca con la llave.");
    }

    public void abrirMaletero() {
        System.out.println("Abriendo el maletero del coche.");
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Número de puertas: " + numeroPuertas);
    }

    // Getter y setter adicional
    public int getNumeroPuertas() { return numeroPuertas; }
    public void setNumeroPuertas(int numeroPuertas) { this.numeroPuertas = numeroPuertas; }
}

