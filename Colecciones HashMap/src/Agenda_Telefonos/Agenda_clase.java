package Agenda_Telefonos;

import java.util.HashMap;

public class Agenda_clase {
    public class Agenda{
        // Definicion de Variables
        private  String nombre;
        private int numero;
        private HashMap<String,Integer> Agenda;
        // Constructor
        public Agenda(String nombre, int numero) {
            this.nombre = nombre;
            this.numero = numero;
            this.Agenda = new HashMap<String,Integer>();
        }
        // Setters
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setNumero(int numero) {
            this.numero = numero;
        }

        public void setAgenda(HashMap<String, Integer> agenda) {
            Agenda = agenda;
        }

        // Getters
        public String getNombre() {
            return nombre;
        }

        public int getNumero() {
            return numero;
        }
        public HashMap<String, Integer> getAgenda() {
            return Agenda;
        }
    public void AgregarContacto(String nombre, Integer telefono){
            if(Agenda.containsKey(nombre) == false){
                Agenda.put(nombre,telefono);
            }
    }
    public Integer BuscarNombre(String nombreEnLaAgenda){
            if (nombreEnLaAgenda != null){
                return Agenda.get(nombreEnLaAgenda);
            } // retorna el valor
        return 0;
    }

    public void MostrarAgenda(){
        System.out.println(Agenda.entrySet());;
        }
    }
}
