package com.company;

import javax.crypto.spec.PSource;

public class Vehiculo {

    private String matricula;
    private marcaDeVehiculo marca;


    public Vehiculo(){
        this.marca = marcaDeVehiculo.NO_EXISTE;
    }


    public marcaDeVehiculo comprobarMarca(String marca){

        marcaDeVehiculo xd;
        try{
            xd = marcaDeVehiculo.valueOf(marca);
        }
        catch (IllegalArgumentException er){
            xd = marcaDeVehiculo.NO_EXISTE;
        }
        return xd;
    }

    public String getMatricula(){
        return matricula;
    }

    public marcaDeVehiculo getMarca() {
        return marca;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setMarca(String marca) {
        this.marca = comprobarMarca(marca);
    }
}




 enum marcaDeVehiculo{BMW, MERCEDES, AVENSIS, TOYOTA, SEAT, NISSAN,AUDI,NO_EXISTE}
