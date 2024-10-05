package Laboratorio_5.ejercicio5;

// Clase derivada CuentaCorriente que permite sobregiros
public class CuentaCorriente extends CuentaBancaria {
    private double limiteSobregiro; // Límite para el sobregiro permitido

    // Constructor para inicializar el saldo y el límite de sobregiro
    public CuentaCorriente(double saldoInicial, double limiteSobregiro) {
        super(saldoInicial);
        this.limiteSobregiro = limiteSobregiro; // Inicializa el límite de sobregiro
    }

    // Sobrescribir el método retirar para permitir sobregiros
    @Override
    public void retirar(double cantidad) throws SaldoInsuficienteException, LimiteSobregiroExcedidoException {
        if (cantidad > saldo + limiteSobregiro) {
            throw new LimiteSobregiroExcedidoException("Límite de sobregiro excedido. No se puede retirar " + cantidad);
        }
        // Llama al método de la clase base para realizar el retiro
        super.retirar(cantidad);
    }
}

