package personas;

import java.util.ArrayList;

public class MedicoCirujano extends Medico implements ICirujano {
    private int numQuirofano;

    public MedicoCirujano(int DNI, int edad, String genero, String nombre, String Especialidad, int numRegistro, ArrayList<Paciente> pacienteAsignados, int numQuirofano) {
        super(DNI, edad, genero, nombre, Especialidad, numRegistro, pacienteAsignados);
        this.numQuirofano = numQuirofano;
    }

    public int getNumQuirofano() {
        return numQuirofano;
    }

    public void setNumQuirofano(int numQuirofano) {
        this.numQuirofano = numQuirofano;
    }

    @Override
    public boolean validarQuirofano(boolean estado) {
        System.out.println("Validando quirofano");
        if (estado) {
            System.out.println("Si se puede usar el quirofano");
            return true;
        } else {
            System.out.println("No se puede usar el quirofano");
            return false;
        }
    }

    @Override
    public void prepararQuirofano() {
        System.out.println("Preparando quirofano" + numQuirofano);
    }

    @Override
    public void presentacion() {
    }
}
