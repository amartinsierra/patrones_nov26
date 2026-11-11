package com.patrones.estructurales.decorador.clasesdecorables;

import com.patrones.estructurales.decorador.decorador.Ordenador;

public class OrdenadorBase implements Ordenador {

    @Override
    public String getDescripcion() {    
        return "Ordenador con configuración estandar";
    }
    @Override
    public double getPrecio() {
        return 500;
    }


}
