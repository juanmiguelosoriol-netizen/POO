package personas;

public abstract class Persona {
    private String nombre;
    private int DNI;
    private int edad;
    private String genero;


    public Persona(int DNI, int edad, String genero, String nombre) {
        this.DNI = DNI;
        this.edad = edad;
        this.genero = genero;
        this.nombre = nombre;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract void presentacion();

    public void revisarPacientes() {

    }
}
