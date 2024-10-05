package Laboratorio_4;
/ Clase derivada VehiculoMotorizado
public abstract class VehiculoMotorizado extends Vehiculo {
    protected String tipoCombustible;
    protected int potencia;

    public VehiculoMotorizado(String marca, String modelo, int año, String tipoCombustible, int potencia) {
        super(marca, modelo, año);
        this.tipoCombustible = tipoCombustible;
        this.potencia = potencia;
    }

    public abstract void arrancar();

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo de combustible: " + tipoCombustible);
        System.out.println("Potencia: " + potencia + " HP");
    }

    // Getters y setters adicionales
    public String getTipoCombustible() { return tipoCombustible; }
    public void setTipoCombustible(String tipoCombustible) { this.tipoCombustible = tipoCombustible; }
    public int getPotencia() { return potencia; }
    public void setPotencia(int potencia) { this.potencia = potencia; }
}
