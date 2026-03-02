package personas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Clase Hospital.
 * <p>
 * Representa la interfaz gráfica principal del sistema hospitalario.
 * Permite registrar pacientes, almacenarlos en una lista interna
 * y mostrar los pacientes registrados.
 *
 * @author Juan Miguel Osorio, Juan Daniel Pineda, Juan Jose Ospina
 * @version 1.0
 */
public class Hospital {

    /**
     * Panel principal que contiene los componentes gráficos.
     */
    private JPanel panelPrincipal;

    /**
     * Campo de texto para ingresar el nombre del paciente.
     */
    private JTextField casillaNombre;

    /**
     * Campo de texto para ingresar los síntomas del paciente.
     */
    private JTextField casillaSintomas;

    /**
     * ComboBox para seleccionar la EPS del paciente.
     */
    private JComboBox<String> seleccionEps;

    /**
     * Botón para mostrar los pacientes registrados.
     */
    private JButton botonMostrar;

    /**
     * Botón para guardar un nuevo paciente.
     */
    private JButton botonGuardar;

    /**
     * Lista que almacena los pacientes registrados.
     */
    private java.util.ArrayList<Paciente> listaPacientes = new java.util.ArrayList<>();

    /**
     * Constructor de la clase Hospital.
     * Inicializa los eventos de los botones.
     */
    public Hospital() {

        botonMostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (listaPacientes.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No hay pacientes registrados");
                    return;
                }

                StringBuilder texto = new StringBuilder();

                for (Paciente p : listaPacientes) {
                    texto.append("Nombre: ").append(p.getNombre())
                            .append(" | EPS: ").append(p.getEPS())
                            .append(" | Sintomas: ").append(p.getSintomas())
                            .append("\n");
                }

                JOptionPane.showMessageDialog(null, texto.toString());
            }
        });

        botonGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String nombre = casillaNombre.getText();
                String sintomas = casillaSintomas.getText();
                String eps = seleccionEps.getSelectedItem().toString();

                if (nombre.isEmpty() || sintomas.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Complete todos los campos");
                    return;
                }

                Paciente paciente = new Paciente(nombre, eps, sintomas);
                listaPacientes.add(paciente);

                JOptionPane.showMessageDialog(null, "Paciente guardado correctamente");

                casillaNombre.setText("");
                casillaSintomas.setText("");
                seleccionEps.setSelectedIndex(0);
            }
        });
    }

    /**
     * Método principal que inicia la aplicación.
     *
     * @param args argumentos de línea de comandos.
     */
    public static void main(String[] args) {

        JFrame frame = new JFrame("Hospital");
        frame.setContentPane(new Hospital().panelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}