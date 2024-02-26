/**
 * <h1>Persona</h1>
 * La clase <b>Persona</b> representa a una persona con una edad determinada.
 * Proporciona un método para calcular los años hasta la jubilación.
 */
public class Persona {
    /**
     * La edad de la persona en años.
     */
    int edad;

    /**
     * Crea una nueva <b>Persona</b> con la edad especificada.
     * @param edad la edad de la persona en años
     */
    public Persona(int edad) {
        this.edad = edad;
    }

    /**
     * <p>Calcula los años hasta la jubilación y muestra un mensaje en la consola.</p>
     * <ul>
     * <li>Si los años hasta la jubilación son menos de 10, muestra un mensaje de aliento.</li>
     * <li>Si los años hasta la jubilación son más de 20, muestra un mensaje de ánimo para seguir trabajando.</li>
     * <li>Si los años hasta la jubilación están entre 10 y 20, simplemente muestra cuántos años quedan hasta la jubilación.</li>
     * </ul>
     */
    public void calcularAnosHastaJubilacion() {
        int anosHastaJubilacion = 67 - this.edad;
        if (anosHastaJubilacion < 10) {
            System.out.println("Sólo te quedan " + anosHastaJubilacion + " años. ¡Vamos que ya queda poco!");
        } else if (anosHastaJubilacion > 20) {
            System.out.println("Te quedan " + anosHastaJubilacion + " años. ¡A seguir trabajando gandul!");
        } else {
            System.out.println("Te quedan " + anosHastaJubilacion + " años hasta la jubilación.");
        }
    }
}
