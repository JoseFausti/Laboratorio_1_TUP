package Clase_1.Auto;

public class Auto {

    private String empresa,modelo,anio;

    public Auto(){
    }

    public Auto(String empresa, String modelo, String anio) {
        this.empresa = empresa;
        this.modelo = modelo;
        this.anio = anio;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }
}
