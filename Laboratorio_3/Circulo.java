public class Circulo {
    private final double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    public double getRadio() {
        return radio;
    }

    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(5);
        Circulo circulo2 = new Circulo(7.5);

        System.out.println("Círculo 1:");
        System.out.println("Radio: " + circulo1.getRadio());
        System.out.println("Área: " + circulo1.calcularArea());

        System.out.println("\nCírculo 2:");
        System.out.println("Radio: " + circulo2.getRadio());
        System.out.println("Área: " + circulo2.calcularArea());
    }
}