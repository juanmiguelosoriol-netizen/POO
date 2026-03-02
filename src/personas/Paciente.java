package personas;

/**
 * La clase Paciente representa a una persona que recibe
 * atención médica dentro del sistema hospitalario.
 * <p>
 * Hereda de la clase Persona e incluye información
 * adicional como número de historial clínico, EPS,
 * saldo disponible y síntomas.
 */
public class Paciente extends Persona {

    private int numHistorial;
    private String EPS;
    private double saldo;
    private String sintomas;

    /**
     * Constructor simplificado que inicializa únicamente
     * el nombre, la EPS y los síntomas del paciente.
     *
     * @param nombre   nombre del paciente.
     * @param EPS      entidad promotora de salud.
     * @param sintomas síntomas que presenta el paciente.
     */
    public Paciente(String nombre, String EPS, String sintomas) {
        super(nombre);
        this.EPS = EPS;
        this.sintomas = sintomas;
    }

    /**
     * Constructor completo que inicializa todos los datos
     * personales y clínicos del paciente.
     *
     * @param DNI          documento de identidad.
     * @param edad         edad del paciente.
     * @param genero       género del paciente.
     * @param nombre       nombre del paciente.
     * @param numHistorial número de historial clínico.
     * @param EPS          entidad promotora de salud.
     * @param saldo        saldo disponible para consultas.
     * @param sintomas     síntomas que presenta el paciente.
     */
    public Paciente(int DNI, int edad, String genero, String nombre,
                    int numHistorial, String EPS, double saldo, String sintomas) {

        super(DNI, edad, genero, nombre);
        this.numHistorial = numHistorial;
        this.EPS = EPS;
        this.saldo = saldo;
        this.sintomas = sintomas;
    }

    /**
     * Obtiene la EPS del paciente.
     *
     * @return EPS del paciente.
     */
    public String getEPS() {
        return EPS;
    }

    /**
     * Modifica la EPS del paciente.
     *
     * @param EPS nueva EPS.
     */
    public void setEPS(String EPS) {
        this.EPS = EPS;
    }

    /**
     * Obtiene el número de historial clínico.
     *
     * @return número de historial.
     */
    public int getNumHistorial() {
        return numHistorial;
    }

    /**
     * Modifica el número de historial clínico.
     *
     * @param numHistorial nuevo número de historial.
     */
    public void setNumHistorial(int numHistorial) {
        this.numHistorial = numHistorial;
    }

    /**
     * Obtiene el saldo disponible del paciente.
     *
     * @return saldo actual.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Modifica el saldo del paciente.
     *
     * @param saldo nuevo saldo.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Obtiene los síntomas del paciente.
     *
     * @return síntomas actuales.
     */
    public String getSintomas() {
        return sintomas;
    }

    /**
     * Modifica los síntomas del paciente.
     *
     * @param sintomas nuevos síntomas.
     */
    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    /**
     * Verifica si el paciente tiene saldo suficiente
     * para cubrir el costo de una consulta.
     * <p>
     * Si el saldo es suficiente, se descuenta el valor
     * correspondiente y retorna true.
     *
     * @param costoConsulta valor de la consulta médica.
     * @return true si puede pagar, false en caso contrario.
     */
    public boolean verificarPresupuesto(double costoConsulta) {
        if (this.saldo >= costoConsulta) {
            this.saldo -= costoConsulta;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Muestra en consola los síntomas del paciente.
     */
    public void mostrarSintomas() {
        System.out.println("Sintomas de " + getNombre() + ": " + sintomas);
    }

    /**
     * Muestra en consola el saldo actual del paciente.
     */
    public void mostrarSaldo() {
        System.out.println("Saldo de " + getNombre() + ": " + saldo);
    }

    /**
     * Presenta la información básica del paciente.
     */
    @Override
    public void presentacion() {
        System.out.println("Paciente " + getNombre());
        System.out.println("EPS: " + getEPS());
    }
}
