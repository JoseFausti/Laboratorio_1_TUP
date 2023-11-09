import Agenda_Telefonos.*;
import javax.swing.*;
import java.util.HashMap;

public class Main_Agenda {

    public static void main(String[] args) {
        String nombre;
        int telefono;

        Agenda_clase persona = new Agenda_clase();
        HashMap<String, Integer> persona_agenda = new HashMap<String, Integer>();

        String salir = "";
        int option;

        JOptionPane.showMessageDialog(null, "Cree la Agenda con los nombres de personas y numeros de telefono..");

        while (true) {
            nombre = JOptionPane.showInputDialog("Ingrese un nombre:");
            telefono = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su nº de telefono: "));

            persona.setNombre(nombre);
            persona.setTelefono(telefono);

            persona_agenda.put(nombre, telefono);
            persona.setAgenda(persona_agenda);

            salir = JOptionPane.showInputDialog("Ingrese 'Salir' para salir; Ingrese cualquier tecla para continuar asignando personas: ");
            if (salir.equalsIgnoreCase("Salir")) {
                break;
            }
        }

        while (true) {
            JOptionPane.showMessageDialog(null, "Ingrese 1 para Buscar contacto: ");
            JOptionPane.showMessageDialog(null, "Ingrese 2 para Agregar contacto: ");
            JOptionPane.showMessageDialog(null, "Ingrese 3 para Mostrar la agenda: ");

            option = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opcion: "));

            switch (option) {
                case 1:
                    nombre = JOptionPane.showInputDialog("Ingrese un nombre a buscar:");
                    int telefonoEncontrado = persona.BuscarNombre(nombre);
                    JOptionPane.showMessageDialog(null, "Número de teléfono encontrado: " + telefonoEncontrado);
                    break;
                case 2:
                    nombre = JOptionPane.showInputDialog("Ingrese un nombre:");
                    telefono = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su nº de telefono: "));
                    persona.AgregarContacto(nombre, telefono);
                    break;
                case 3:
                    persona.MostrarAgenda();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción incorrecta.");
            }

            salir = JOptionPane.showInputDialog("Ingrese 'Salir' para salir; Ingrese cualquier tecla para continuar: ");
            if (salir.equalsIgnoreCase("Salir")) {
                break;
            }
        }
    }
}
