public class Utilidades {
    
    /**
     * Convierte una temperatura de grados Celsius a Fahrenheit.
     * 
     *La temperatura en grados Celsius
     * La temperatura equivalente en grados Fahrenheit
     */
    public static double convertirCelsiusAFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        double temperaturaCelsius = 25;
        double temperaturaFahrenheit = convertirCelsiusAFahrenheit(temperaturaCelsius);
        
        System.out.println(temperaturaCelsius + " grados Celsius son equivalentes a " + temperaturaFahrenheit + " grados Fahrenheit.");
    }
}