package personas;

public class Paciente extends Persona {
    private int numHistorial;
    private String EPS;
    private double saldo;
    private String sintomas;


    public Paciente(int DNI, int edad, String genero, String nombre, int numHistorial, String EPS, double saldo, String sintomas) {
        super(DNI, edad, genero, nombre);
        this.numHistorial = numHistorial;
        this.EPS = EPS;
        this.saldo = saldo;
        this.sintomas = sintomas;

    }

    public String getEPS() {
        return EPS;
    }

    public void setEPS(String EPS) {
        this.EPS = EPS;
    }

    public int getNumHistorial() {
        return numHistorial;
    }

    public void setNumHistorial(int numHistorial) {
        this.numHistorial = numHistorial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public boolean verificarPresupuesto(double costoConsulta) {
        if (this.saldo >= costoConsulta) {
            this.saldo -= costoConsulta;
            return true;
        } else {
            return false;
        }
    }

    public void mostrarSintomas() {
        System.out.println("Sintomas de " + getNombre() + ": " + sintomas);
    }

    public void mostrarSaldo() {
        System.out.println("Saldo de " + getNombre() + ": " + saldo);
    }

    @Override
    public void presentacion() {
        System.out.println("Paciente " + getNombre());
        System.out.println("EPS: " + getEPS());
    }
}
