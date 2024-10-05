package Laboratorio_4;

// Clase derivada Gerente
public class Gerente extends Empleado {
    public Gerente(String nombre, double salario) {
        super(nombre, salario);
    }

    @Override
    public double calcularBono() {
        return salario * 0.15; // 15% del salario
    }


}

