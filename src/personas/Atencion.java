package personas;


public class Atencion {
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
