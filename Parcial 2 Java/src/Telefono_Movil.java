import Clase.Clase_Telefono_Movil;
import javax.swing.*;

// Programa Principal
public class Telefono_Movil {
    public static void main(String[] args) {
        // Definimos las Variables
        String marca,modelo,salir;
        int numero_serie ,opcion;
        // Creamos el Objeto
        Clase_Telefono_Movil AgendaTelefonos = new Clase_Telefono_Movil();
        // Menú de Opciones
        while (true){
        JOptionPane.showMessageDialog(null,"Ingrese 1 para" +
                " agregar un nuevo elemento a la lista.");
        JOptionPane.showMessageDialog(null,"Ingrese 2 para" +
                " eliminar un elemento de la lista.");
        JOptionPane.showMessageDialog(null,"Ingrese 3 para" +
                " buscar un elemento por número o nombre.");
        JOptionPane.showMessageDialog(null,"Ingrese 4 para" +
                " listar todos los elemento en la lista.");
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opción: "));
        switch (opcion){
            case 1:
                marca = JOptionPane.showInputDialog("Ingrese la marca: ");
                modelo = JOptionPane.showInputDialog("Ingrese el modelo: ");
                numero_serie = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de serie: "));
                AgendaTelefonos.AgregarTelefono(marca,modelo,numero_serie);
                break;
            case 2:
                numero_serie = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de serie del modelo" +
                        "para eliminarlo: "));
                AgendaTelefonos.EliminarTelefono(numero_serie);
                break;
            case 3:
                marca = JOptionPane.showInputDialog("Ingrese la marca: ");
                modelo = JOptionPane.showInputDialog("Ingrese el modelo: ");
                numero_serie = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de serie: "));
                AgendaTelefonos.BuscarTelefono(marca,modelo,numero_serie);
                break;
            case 4:
                AgendaTelefonos.MostrarTelefonos();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción incorrecta.");
            }
        // Mensaje de salida
        salir = JOptionPane.showInputDialog("Ingrese 'Salir' para salir; Ingrese cualquier " +
                "tecla para continuar asignando personas: ");
        if (salir.equalsIgnoreCase("Salir")) {
            JOptionPane.showMessageDialog(null, "¡Gracias por usar la aplicación de gestión de teléfonos móviles! Hasta luego.");
            break;
            }
        }
    }
}
