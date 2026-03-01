package personas;

/**
 * Clase que se encarga de atender el ingreso de un paciente.
 * Según la EPSdel paciente, se le asigna un pabellón.
 */
public class Atencion {
    /**
     * Registra el ingreso de un paciente y le asigna un pabellón.
     *
     * @param paciente Paciente que va a ser atendido.
     */
    public void pocesarIngreso(Paciente paciente) {
        System.out.println("Registrando ingreso de: " + paciente.getNombre());

        String pabellon;

        if (paciente.getEPS() == "sura") {
            pabellon = "Pabellon A";
        } else if (paciente.getEPS() == "sanitas") {
            pabellon = "Pabellon B";
        } else {
            pabellon = "Pabellon General";
        }

        System.out.println("El paciente ha sido asignado al: " + pabellon);
    }
}
