public class CuentaBancaria {
    // Atributos de la clase
    private String titular;      // Nombre del titular de la cuenta
    private String numeroCuenta; // Número de cuenta bancaria
    private double saldo;        // Saldo disponible en la cuenta

    // Constructor: inicializa una nueva CuentaBancaria con un titular, número de cuenta y saldo inicial
    public CuentaBancaria(String titular, String numeroCuenta, double saldoInicial) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
    }

    // Método para depositar dinero en la cuenta
    public void depositar(double cantidad) {
        // Verificamos que la cantidad a depositar sea positiva
        if (cantidad > 0) {
            saldo += cantidad;  // Aumenta el saldo
            System.out.println("Depósito realizado: " + cantidad);
        } else {
            System.out.println("La cantidad a depositar debe ser mayor que 0.");
        }
    }

    // Método para retirar dinero de la cuenta
    public void retirar(double cantidad) {
        // Verificamos que la cantidad a retirar sea positiva y que haya suficiente saldo
        if (cantidad > 0) {
            if (cantidad <= saldo) {
                saldo -= cantidad;  // Disminuye el saldo
                System.out.println("Retiro realizado: " + cantidad);
            } else {
                System.out.println("Saldo insuficiente. No se puede retirar " + cantidad);
            }
        } else {
            System.out.println("La cantidad a retirar debe ser mayor que 0.");
        }
    }

    // Método para consultar el saldo actual de la cuenta
    public double consultarSaldo() {
        return saldo;  // Retorna el saldo actual
    }

    // Método para mostrar la información de la cuenta
    public void mostrarInfoCuenta() {
        System.out.println("Titular: " + titular);
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Saldo actual: " + saldo);
    }

    // Método main para realizar una prueba de la clase CuentaBancaria
    public static void main(String[] args) {
        // Crear una nueva cuenta bancaria con un saldo inicial de 500
        CuentaBancaria cuenta = new CuentaBancaria("Juan Pérez", "123456789", 500);

        // Mostrar la información de la cuenta
        cuenta.mostrarInfoCuenta();

        // Realizar un depósito de 200
        cuenta.depositar(200);

        // Intentar retirar 800 (esto debería fallar porque excede el saldo)
        cuenta.retirar(800);

        // Retirar 100 (esto debería funcionar)
        cuenta.retirar(100);

        // Consultar el saldo actual
        System.out.println("Saldo actual: " + cuenta.consultarSaldo());
    }
}
