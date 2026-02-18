package personas;


import java.util.ArrayList;
import java.util.List;


public class Medico extends Persona {


    private String especialidad;

    private int numRegistro;

    private ArrayList<Paciente> pacienteAsignados;


    public Medico(int DNI, int edad, String genero, String nombre, String Especialidad, int numRegistro, List<Paciente> pacienteAsignados) {

        super(DNI, edad, genero, nombre);

        this.numRegistro = numRegistro;

        this.pacienteAsignados = new ArrayList<>(pacienteAsignados);

        this.especialidad = Especialidad;


    }


    public String getEspecialidad() {

        return especialidad;

    }


    public void setEspecialidad(String especialidad) {

        this.especialidad = especialidad;

    }


    public int getNumRegistro() {

        return numRegistro;

    }


    public void setNumRegistro(int numRegistro) {

        this.numRegistro = numRegistro;

    }


    public ArrayList<Paciente> getPacienteAsignados() {

        return pacienteAsignados;

    }


    public void setPacienteAsignados(ArrayList<Paciente> pacienteAsignados) {

        this.pacienteAsignados = pacienteAsignados;

    }


//metodos

    public void revisarPacientes() {

        for (Persona paciente : this.pacienteAsignados) {

            System.out.println("Nombre: " + paciente.getNombre());

        }

    }


    public void asignarPrioridad(Paciente paciente) {

        int prioridad;
        String jobo = paciente.getSintomas();

        switch (paciente.getSintomas()) {

            case "infarto":

                prioridad = 1;

                break;

            case "fiebre":

                prioridad = 2;

                break;


            case "dolor":

                prioridad = 3;

                break;


            default:

                prioridad = 4;

                break;


        }
        System.out.println("El Dr. " + this.getNombre() + " evaluo el sintoma: " + jobo + " y asigno prioridad: " + prioridad);

    }

    @Override
    public void presentacion() {
        System.out.println("Dr. " + getNombre());
        System.out.println("Especialidad: " + this.especialidad);
    }
}
