package personas;


import java.util.ArrayList;
import java.util.List;


public class gestionHospital {


    public static void main(String[] args) {


        System.out.println("################################### el numero de dairo moreno: 314 7403384 #################################");
        System.out.println("################################### el numero de dairo moreno: 314 7403384 #################################");
        System.out.println("################################### el numero de dairo moreno: 314 7403384 #################################");
        System.out.println("################################### el numero de dairo moreno: 314 7403384 #################################");
        System.out.println("################################### el numero de dairo moreno: 314 7403384 #################################");
        System.out.println("################################### el numero de dairo moreno: 314 7403384 #################################");
        System.out.println("################################### el numero de dairo moreno: 314 7403384 #################################");
        System.out.println("################################### el numero de dairo moreno: 314 7403384 #################################");

//PACIENTES

        Paciente paciente1 = new Paciente(7, 578, "M", "juan", 7879, "sanitas", 54, "dolor");

        Paciente paciente2 = new Paciente(8, 43, "F", "Maria Alejandra", 3112, "Nueva EPS", 10, "infarto");


        ArrayList<Paciente> listaPacientes = new ArrayList<Paciente>();

        listaPacientes.add(paciente1);

        listaPacientes.add(paciente2);


//MEDICOS

        Medico medico1 = new Medico(12, 23, "M", "Jose Miguel Narvaez", "vaginologo", 576, listaPacientes);

        Medico medico2 = new Medico(17, 30, "F", "Jobita Varonita Guevitas (Alias Toca Vaginitas28)", "PATOlogia", 32, listaPacientes);

        Medico medico3 = new Medico(19, 45, "M", "Franklin Mondragon Gomez Poveda", "topologo", 310, listaPacientes);

        Medico medico4 = new Medico(10, 64, "M", "Papa Jobito XXXIII", "down", 314, listaPacientes);


//MEDICOS CIRUJANOS

        MedicoCirujano cirujano1 = new MedicoCirujano(14, 43, "F", "Ximena Gaviria Rodriguez", "Cardiologia", 252525, listaPacientes, 1);

        MedicoCirujano cirujano2 = new MedicoCirujano(11, 31, "M", "Pablo Pomodoro", "Dermatologia", 7, listaPacientes, 2);


        List<Medico> personalHospital = new ArrayList<>();

        personalHospital.add(medico1);

        personalHospital.add(medico2);

        personalHospital.add(medico3);

        personalHospital.add(medico4);


        System.out.println("Presentacion medicos");

        for (Persona persona : personalHospital) {

            persona.presentacion();

        }


//sintoma de pacientes

        System.out.println("\n------Pacientes---------\n");

        for (Medico medi : personalHospital) {
            medi.revisarPacientes();
            for (Paciente paci : medi.getPacienteAsignados()) {
                medi.asignarPrioridad(paci);
            }

        }

        //paciente pagara consulta

        System.out.println("\n------Accion del paciente (pagar consulta)-------\n");
        int consultaCosto = 50;

        for (Paciente pa : listaPacientes) {

            pa.mostrarSaldo();
            boolean tienesaldo = pa.verificarPresupuesto(consultaCosto);
            if (tienesaldo) {
                System.out.println("Paciente " + pa.getNombre() + " tiene saldo suficiente");
                System.out.println("Saldo final de " + pa.getNombre() + ": " + pa.getSaldo());
            } else {
                System.out.println("saldo insuficiente para pagar consulta");
            }


        }

        System.out.println("\n------Cirujanos-------\n");
        List<MedicoCirujano> cirujanos = new ArrayList<>();
        cirujanos.add(cirujano1);
        cirujanos.add(cirujano2);
        for (MedicoCirujano ciru : cirujanos) {
            ciru.presentacion();
        }
        if (cirujano1.validarQuirofano(true)) {
            cirujano1.prepararQuirofano();
            System.out.println("El cirujano " + cirujano1.getNombre() + " está operando en el quirófano " + cirujano1.getNumQuirofano());

        }

        System.out.println("--------ATENCION----------");
        Atencion gestion = new Atencion();
        gestion.pocesarIngreso(paciente1);// PUTA BARCA
        gestion.pocesarIngreso(paciente2);


    }
}