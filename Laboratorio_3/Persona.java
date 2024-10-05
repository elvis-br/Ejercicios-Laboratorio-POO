public class Persona {
    // Atributos encapsulados (privados)
    private String nombre;              // Nombre de la persona
    private int edad;                   // Edad de la persona
    private String correoElectronico;   // Correo electrónico de la persona

    // Constructor para inicializar los atributos de Persona
    public Persona(String nombre, int edad, String correoElectronico) {
        this.nombre = nombre;
        this.edad = edad;
        this.correoElectronico = correoElectronico;
    }

    // Método getter para obtener el nombre
    public String getNombre() {
        return nombre;
    }

    // Método setter para modificar el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método getter para obtener la edad
    public int getEdad() {
        return edad;
    }

    // Método setter para modificar la edad
    public void setEdad(int edad) {
            this.edad = edad;
    }

    // Método getter para obtener el correo electrónico
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    // Método setter para modificar el correo electrónico
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
        
    }

    // Método para mostrar la información de la persona
    public void mostrarInfoPersona() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Correo Electrónico: " + correoElectronico);
    }

    // Método main para probar la clase Persona
    public static void main(String[] args) {
        // Crear un objeto de la clase Persona
        Persona persona = new Persona("Juan Pérez", 30, "juan.perez@example.com");

        // Mostrar la información de la persona
        persona.mostrarInfoPersona();

        // Cambiar el nombre y la edad usando los setters
        persona.setNombre("Ana López");
        persona.setEdad(25);

        // edad negativa
        persona.setEdad(-5);

        // Cambiar el correo electrónico usando el setter
        persona.setCorreoElectronico("ana.lopez@example.com");

        // Mostrar la información actualizada de la persona
        persona.mostrarInfoPersona();
    }
}
