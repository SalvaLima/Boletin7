package com.company;

public class Main {

    public static void main(String[] args) {
        Ejercicio1();
    }
    /**- Se solicita crear una clase, la vamos a llamar Vehículo que va a tener un enumerado)
     MarcaDeVehiculo) para las distintas marcas. Los valores de las marcas van a ser BMW, MERCEDES,
     AVENSIS, TOYOTA, SEAT, NISSAN y AUDI.

     La clase va a tener como atributos la matrícula (tipo String) y la marca (tipo MarcaDeVehiculo) y los métodos getters y setters de los atributos.
     Escribe un pequeño programa de prueba donde se solicite por consola la matrícula y la marca y verifiques que los métodos funcionan correctamente.
     El método Setter valorará antes de hacer el Set que la marca introducida es válida y se corresponde con un valor del enumerado
     * /
     */

    public static void Ejercicio1(){
        Vehiculo golf = new Vehiculo();
        golf.setMatricula("AODFKSAFJLS");
        golf.setMarca("SEAT");


        System.out.println(golf.getMatricula());
        System.out.println(golf.getMarca());
    }
}
