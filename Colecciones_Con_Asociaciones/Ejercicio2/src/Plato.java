import java.util.ArrayList;

public class Plato {
    //Clase: Plato
    //Atributos: nombreCompleto(string), precio (double), esBebida (boolean),ArrayList de objetos Ingrediente

    private String nombreCompleto;
    private double precio;
    private boolean esBebida;
    private ArrayList<Ingrediente> arrayIngredientes;

    public Plato(String nombreCompleto, double precio, boolean esBebida, ArrayList<Ingrediente> arrayIngredientes) {
        this.nombreCompleto = nombreCompleto;
        this.precio = precio;
        this.esBebida = esBebida;
        this.arrayIngredientes = arrayIngredientes;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean getEsBebida() {
        return esBebida;
    }

    public void setEsBebida(boolean esBebida) {
        this.esBebida = esBebida;
    }

    public ArrayList<Ingrediente> getArrayIngredientes() {
        return arrayIngredientes;
    }

    public void setArrayIngredientes(ArrayList<Ingrediente> arrayIngredientes) {
        this.arrayIngredientes = arrayIngredientes;
    }
}
