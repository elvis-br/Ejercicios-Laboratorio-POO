public class CuentaBancaria {
    // Atributos de la clase
    public String numeroCuenta; // Número de cuenta (público)
    private double saldo;// Saldo de la cuenta (privado)
    protected String titular;// Titular de la cuenta (protegido)

    // Constructor para inicializar los atributos
    public CuentaBancaria(String numeroCuenta, double saldoInicial, String titular) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
        this.titular = titular;
    }

    // Método para depositar dinero en la cuenta
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Se han depositado $" + cantidad + " en la cuenta. Saldo actual: $" + saldo);
        } else {
            System.out.println("La cantidad a depositar debe ser positiva.");
        }
    }

    // Método para retirar dinero de la cuenta, asegurando que no se quede en saldo negativo
    public void retirar(double cantidad) {
        if (cantidad > 0) {
            if (saldo >= cantidad) {
                saldo -= cantidad;
                System.out.println("Se han retirado $" + cantidad + " de la cuenta. Saldo actual: $" + saldo);
            } else {
                System.out.println("Fondos insuficientes. No se puede retirar más de lo que hay en la cuenta.");
            }
        } else {
            System.out.println("La cantidad a retirar debe ser positiva.");
        }
    }

    // Método para consultar el saldo ( es privado, uso de getter)
    public double consultarSaldo() {
        return saldo;
    }

    // Método para mostrar la información de la cuenta bancaria
    public void mostrarInfoCuenta() {
        System.out.println("Número de Cuenta: " + numeroCuenta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo Actual: $" + saldo);
    }

    // Método main para probar la clase CuentaBancaria
    public static void main(String[] args) {
        // Crear una cuenta bancaria con saldo inicial
        CuentaBancaria cuenta = new CuentaBancaria("123456789", 1000, "Juan Pérez");

        // Mostrar la información inicial de la cuenta
        cuenta.mostrarInfoCuenta();

        // Depositar dinero en la cuenta
        cuenta.depositar(500);

        // Intentar retirar una cantidad mayor al saldo --> No se puede retirar 800.0
        cuenta.retirar(2000);

        // Retirar una cantidad válida
        cuenta.retirar(300);

        // Consultar el saldo actual
        System.out.println("Saldo disponible: $" + cuenta.consultarSaldo());
    }
}
