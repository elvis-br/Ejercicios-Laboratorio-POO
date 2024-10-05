public class Calculadora {

    // Método para sumar dos números
    public double sumar(double a, double b) {
        return a + b;
    }

    // Método para restar dos números
    public double restar(double a, double b) {
        return a - b;
    }

    // Método para multiplicar dos números
    public double multiplicar(double a, double b) {
        return a * b;
    }

    // Método para dividir dos números, manejando el caso de división por cero
    public double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Error: No se puede dividir entre cero.");
            return Double.NaN; // Retorna un valor "Not a Number" para indicar el error
        }
        return a / b;
    }

    // Método main para probar la clase Calculadora
    public static void main(String[] args) {
        // Crear un objeto de la clase Calculadora
        Calculadora calc = new Calculadora();

        // Realizar operaciones de ejemplo
        double suma = calc.sumar(10, 5);
        double resta = calc.restar(10, 5);
        double multiplicacion = calc.multiplicar(10, 5);
        double divisionValida = calc.dividir(10, 5);
        double divisionPorCero = calc.dividir(10, 0);

        // Mostrar los resultados de las operaciones
        System.out.println("Suma: 10 + 5 = " + suma);//15.0
        System.out.println("Resta: 10 - 5 = " + resta);//5.0
        System.out.println("Multiplicación: 10 * 5 = " + multiplicacion);//50.0
        System.out.println("División válida: 10 / 5 = " + divisionValida);//2.0
        System.out.println("División por cero: 10 / 0 = " + divisionPorCero); // Mostrará un error NaN
    }
}
