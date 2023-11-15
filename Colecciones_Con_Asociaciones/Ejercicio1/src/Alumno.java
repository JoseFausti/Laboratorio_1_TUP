import java.util.ArrayList;

public class Alumno {
    //Clase: Alumno
    //Atributos: nombreCompleto(string), legajo (long), ArrayList de objetos Not
    private String nombreCompleto;
    private int legajo;
    private ArrayList<Nota> arrayNotas;

    public Alumno(String nombreCompleto, int legajo, ArrayList<Nota> arrayNotas) {
        this.nombreCompleto = nombreCompleto;
        this.legajo = legajo;
        this.arrayNotas = arrayNotas;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public ArrayList<Nota> getArrayNotas() {
        return arrayNotas;
    }

    public void setArrayNotas(ArrayList<Nota> arrayNotas) {
        this.arrayNotas = arrayNotas;
    }
}
