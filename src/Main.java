// Clase Main.java
import java.util.Scanner;

/**
 * <h1>Main</h1>
 * La clase <b>Main</b> contiene el método principal del programa.
 * Pide al usuario su edad, crea una Persona con esa edad y calcula los años hasta la jubilación.
 * @autor Alfredo Ledesma
 * @version 1.0
 * @since 20224-26-02
 */
public class Main {
    /**
     * <p>El método principal del programa.</p>
     * <p>Pide al usuario su edad, crea una <b>Persona</b> con esa edad y calcula los años hasta la jubilación.</p>
     * @param args los argumentos de línea de comando
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, introduce tu edad:");
        int edad = scanner.nextInt();
        Persona persona = new Persona(edad);
        persona.calcularAnosHastaJubilacion();
    }
}