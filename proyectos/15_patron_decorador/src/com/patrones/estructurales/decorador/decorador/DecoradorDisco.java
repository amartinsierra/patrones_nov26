package com.patrones.estructurales.decorador.decorador;

public class DecoradorDisco extends DecoradorBase {
    
    public DecoradorDisco(Ordenador componente) {
        super(componente);
        
    }
    @Override
    public String getDescripcion() {
        return getComponente().getDescripcion()+" más disco SSD";
    }
    @Override
    public double getPrecio() {
        return getComponente().getPrecio()+200;
    }
}
