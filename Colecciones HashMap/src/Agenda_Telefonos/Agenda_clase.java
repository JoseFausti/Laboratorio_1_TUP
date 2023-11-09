package Agenda_Telefonos;

import java.util.HashMap;

public class Agenda_clase {
    // Definicion de Variables
    private  String  nombre;
    private int telefono;
    private HashMap<String,Integer> Agenda;

    public Agenda_clase(){}

    // Constructor
    public Agenda_clase(String nombre, int numero) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.Agenda = new HashMap<String,Integer>();
    }
    // Setters
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public void setAgenda(HashMap<String, Integer> agenda) {this.Agenda = agenda;}

    // Getters
    public String getNombre() {
        return nombre;
    }
    public int getTelefono() {return telefono;}
    public HashMap<String, Integer> getAgenda() {
        return Agenda;
    }

    //Métodos
    public void AgregarContacto(String nombre, Integer telefono){
            if(Agenda.containsKey(nombre) == false){
                Agenda.put(nombre,telefono);
            }
    }
    public Integer BuscarNombre(String nombreEnLaAgenda){
            if(nombreEnLaAgenda != null){
                return Agenda.get(nombreEnLaAgenda);
            } // retorna el valor
        return 0;
    }
    public void MostrarAgenda(){
        System.out.println(Agenda.entrySet());;
    }
}

