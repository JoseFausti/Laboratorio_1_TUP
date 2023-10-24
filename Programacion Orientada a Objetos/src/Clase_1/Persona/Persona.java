package Clase_1.Persona;
public class Persona {
    private String nombre;

    // El que esta vacio sirve por si no se ingresa ningun dato pero quiero crear la clase igual
    public Persona (){}

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void caminar(){
        System.out.println("Estoy caminando!");
    }
}