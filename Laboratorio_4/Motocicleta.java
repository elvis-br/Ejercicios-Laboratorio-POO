package Laboratorio_4;

// Clase final Motocicleta
public final class Motocicleta extends VehiculoMotorizado {
    private String tipoManillar;

    public Motocicleta(String marca, String modelo, int año, String tipoCombustible, int potencia, String tipoManillar) {
        super(marca, modelo, año, tipoCombustible, potencia);
        this.tipoManillar = tipoManillar;
    }

    @Override
    public void mover() {
        System.out.println("La motocicleta está circulando por la carretera.");
    }

    @Override
    public void arrancar() {
        System.out.println("La motocicleta arranca con el botón de encendido.");
    }

    public void hacerCaballito() {
        System.out.println("La motocicleta está haciendo un caballito.");
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo de manillar: " + tipoManillar);
    }

    // Getter y setter adicional
    public String getTipoManillar() { return tipoManillar; }
    public void setTipoManillar(String tipoManillar) { this.tipoManillar = tipoManillar; }
}

