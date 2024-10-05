package Laboratorio_5.ejercicio5;

// Clase base CuentaBancaria
public class CuentaBancaria {
    protected double saldo; // Atributo para el saldo de la cuenta

    // Constructor para inicializar el saldo
    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Método para retirar dinero
    public void retirar(double cantidad) throws SaldoInsuficienteException {
        if (cantidad > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente. No se puede retirar " + cantidad);
        }
        saldo -= cantidad; // Actualiza el saldo
    }

    // Método para consultar el saldo
    public double consultarSaldo() {
        return saldo; // Retorna el saldo actual
    }
}

