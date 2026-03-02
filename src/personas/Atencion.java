package personas;

/**
 * Clase que gestiona el proceso de ingreso de un paciente al hospital.
 * Se encarga de registrar su llegada y asignarle un pabellón
 * dependiendo de la EPS a la que pertenece.
 */
public class Atencion {

    /**
     * Procesa el ingreso de un paciente y determina el pabellón
     * correspondiente según su EPS.
     *
     * @param paciente objeto Paciente que será atendido.
     */
    public void procesarIngreso(Paciente paciente) {

        System.out.println("Registrando ingreso de: " + paciente.getNombre());

        String pabellon;

        if (paciente.getEPS().equalsIgnoreCase("sura")) {
            pabellon = "Pabellon A";
        } else if (paciente.getEPS().equalsIgnoreCase("sanitas")) {
            pabellon = "Pabellon B";
        } else {
            pabellon = "Pabellon General";
        }

        System.out.println("El paciente ha sido asignado al: " + pabellon);
    }
}