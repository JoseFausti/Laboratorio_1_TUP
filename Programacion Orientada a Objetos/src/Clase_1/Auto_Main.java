package Clase_1;

import Clase_1.Auto.Auto;

public class Auto_Main {
    public static void main(String[] args) {
        Auto empresa_1 = new Auto();
        Auto empresa_2 = new Auto();

        Auto modelo_1 = new Auto();
        Auto modelo_2 = new Auto();

        Auto anio_1 = new Auto();
        Auto anio_2 = new Auto();

        empresa_1.setEmpresa("Ford");
        empresa_2.setEmpresa("Chevrolet");

        modelo_1.setModelo("Mustang");
        modelo_2.setModelo("Camaro SS");

        anio_1.setAnio("2004");
        anio_2.setAnio("1989");

        System.out.println("La primer empresa es " + empresa_1.getEmpresa());
        System.out.println("El primer modelo es " + modelo_1.getModelo());
        System.out.println("El año del primer modelo es " + anio_1.getAnio());

        System.out.println("-----------------------------");

        System.out.println("La segunda empresa es " + empresa_2.getEmpresa());
        System.out.println("El segundo modelo es " + modelo_2.getModelo());
        System.out.println("El año del segundo modelo es " + anio_2.getAnio());
    }
}
