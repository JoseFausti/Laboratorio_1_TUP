package Clase;
import javax.swing.*;
import java.util.ArrayList;

// Clase
public class Clase_Telefono_Movil {
    // Definimos las Variables
    private String marca, modelo;
    private int numero_serie;
    // Creamos el ArrayList
    private ArrayList<Clase_Telefono_Movil> telefono_movil;

    // Constructor
    public Clase_Telefono_Movil() {}
    public Clase_Telefono_Movil(String marca, String modelo, int numero_serie) {
        this.marca = marca;
        this.modelo = modelo;
        this.numero_serie = numero_serie;
        this.telefono_movil = new ArrayList<>();
    }

    // Getter
    public String getMarca() {return marca;}
    public String getModelo() {return modelo;}
    public int getNumero_serie() {return numero_serie;}
    public ArrayList<Clase_Telefono_Movil> getTelefono_movil() {return telefono_movil;}

    // Setter
    public void setMarca(String marca) {this.marca = marca;}
    public void setModelo(String modelo) {this.modelo = modelo;}
    public void setNumero_serie(int numero_serie) {this.numero_serie = numero_serie;}
    public void setTelefono_movil(ArrayList<Clase_Telefono_Movil> telefono_movil) {this.telefono_movil = telefono_movil;}

    // Método
    public void AgregarTelefono(String marca, String modelo, Integer numero_serie) {
        if (!telefono_movil.contains(numero_serie)) {
            telefono_movil.add(new Clase_Telefono_Movil(marca, modelo, numero_serie));
        }
    }
    public void EliminarTelefono(int numeroSerie) {
        for (Clase_Telefono_Movil telefono : telefono_movil) {
            if (telefono.getNumero_serie() == numeroSerie) {
                telefono_movil.remove(telefono);
                break;  // Se detiene después de eliminar el primer teléfono con el número de serie dado
            }
        }
    }
    public void BuscarTelefono(String marca, String modelo, Integer numero_serie) {
        for (Clase_Telefono_Movil telefono : telefono_movil) {
            if ((telefono_movil.equals(marca) && telefono_movil.equals(modelo)) || telefono_movil.equals(numero_serie)) {
                JOptionPane.showMessageDialog(null, "Búsqueda exitosa \n" +
                        "Telefono móvil: " + telefono);
            }
        }
    }
    public void MostrarTelefonos() {
        JOptionPane.showMessageDialog(null,"Telefonos: ");
        for (Clase_Telefono_Movil telefonos : telefono_movil){
            JOptionPane.showMessageDialog(null,telefonos);
        }
    }
}