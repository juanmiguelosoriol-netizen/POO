package personas;

/**
 * Clase abstracta Persona.
 * <p>
 * Representa la clase base para las personas dentro del sistema hospitalario.
 * Contiene los atributos comunes como:
 * - Nombre
 * - DNI
 * - Edad
 * - Género
 * <p>
 * Esta clase debe ser heredada por otras clases como Paciente o Medico.
 */
public abstract class Persona {

    /**
     * Nombre completo de la persona
     */
    private String nombre;

    /**
     * Documento Nacional de Identidad de la persona
     */
    private int DNI;

    /**
     * Edad de la persona
     */
    private int edad;

    /**
     * Género de la persona
     */
    private String genero;

    /**
     * Constructor que inicializa una persona solo con nombre.
     *
     * @param nombre Nombre de la persona
     */
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Constructor completo que inicializa todos los atributos de la persona.
     *
     * @param DNI    Documento de identidad
     * @param edad   Edad de la persona
     * @param genero Género de la persona
     * @param nombre Nombre de la persona
     */
    public Persona(int DNI, int edad, String genero, String nombre) {
        this.DNI = DNI;
        this.edad = edad;
        this.genero = genero;
        this.nombre = nombre;
    }

    /**
     * Obtiene el DNI de la persona.
     *
     * @return DNI
     */
    public int getDNI() {
        return DNI;
    }

    /**
     * Establece el DNI de la persona.
     *
     * @param DNI nuevo DNI
     */
    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    /**
     * Obtiene la edad de la persona.
     *
     * @return edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establece la edad de la persona.
     *
     * @param edad nueva edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Obtiene el género de la persona.
     *
     * @return género
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Establece el género de la persona.
     *
     * @param genero nuevo género
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * Obtiene el nombre de la persona.
     *
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la persona.
     *
     * @param nombre nuevo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método abstracto que debe ser implementado por las clases hijas.
     * Define cómo se presenta la persona en el sistema.
     */
    public abstract void presentacion();

    /**
     * Método que puede ser sobrescrito por clases hijas
     * si necesitan implementar lógica para revisar pacientes.
     * <p>
     * Actualmente no contiene implementación.
     */
    public void revisarPacientes() {

    }
}