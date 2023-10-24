package Clase_1;

import Clase_1.Videojuego.Videojuego;

public class Videojuego_Main {
    public static void main(String[] args) {

        Videojuego empresa_1 = new Videojuego();
        empresa_1.setEmpresa("EA Sports");
        Videojuego empresa_2 = new Videojuego();
        empresa_2.setEmpresa("Riot Games");

        Videojuego titulo_1 = new Videojuego();
        titulo_1.setTitulo("Fifa 23");
        Videojuego titulo_2 = new Videojuego();
        titulo_2.setTitulo("League Of Legends");

        Videojuego genero_1 = new Videojuego();
        genero_1.setGenero("Deportes");
        Videojuego genero_2 = new Videojuego();
        genero_2.setGenero("MOBA");

        System.out.println("La primer empresa es: " + empresa_1.getEmpresa());
        System.out.println("El titulo del juego es: " + titulo_1.getTitulo());
        System.out.println("El genero del juego es: " + genero_1.getGenero());

        System.out.println("------------------------------");

        System.out.println("La segunda empresa es: " + empresa_2.getEmpresa());
        System.out.println("El titulo del juego es: " + titulo_2.getTitulo());
        System.out.println("El genero del juego es: " + genero_2.getGenero());
    }
}
