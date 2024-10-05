package Laboratorio_5.ejercicio5;

public class Main {
    public static void main(String[] args) {
        try {
            // Crear una cuenta bancaria con un saldo inicial
            CuentaBancaria cuenta = new CuentaBancaria(1000);
            System.out.println("Saldo inicial: " + cuenta.consultarSaldo());

            // Intentar retirar una cantidad mayor al saldo
            cuenta.retirar(1200); // Esto lanzará una excepción
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage()); // Manejar la excepción de saldo insuficiente
        }

        try {
            // Crear una cuenta corriente con un saldo inicial y un límite de sobregiro
            CuentaCorriente cuentaCorriente = new CuentaCorriente(500, 200);
            System.out.println("Saldo inicial en cuenta corriente: " + cuentaCorriente.consultarSaldo());

            // Retirar una cantidad dentro del límite permitido
            cuentaCorriente.retirar(600); // Esto debería funcionar
            System.out.println("Nuevo saldo: " + cuentaCorriente.consultarSaldo());

            // Intentar retirar una cantidad que excede el límite de sobregiro
            cuentaCorriente.retirar(200); // Esto lanzará una excepción
        } catch (SaldoInsuficienteException | LimiteSobregiroExcedidoException e) {
            System.out.println(e.getMessage()); // Manejar las excepciones
        }
    }
}
