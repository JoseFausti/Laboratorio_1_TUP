
package Clase_1.Videojuego;

public class Videojuego {

    private String titulo,genero,empresa;

    public Videojuego() {
    }

    public Videojuego(String titulo, String genero, String empresa) {
        this.titulo = titulo;
        this.genero = genero;
        this.empresa = empresa;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
}
