package com.patrones.estructurales.streaming.proxy;

import com.patrones.estructurales.streaming.composite.ComponenteReproducible;

public class ProxyPelicula implements ComponenteReproducible {
    private ComponenteReproducible componente;
    private boolean premium;

    public ProxyPelicula(ComponenteReproducible componente, boolean premium) {
        this.componente = componente;
        this.premium = premium;
    }

    @Override
    public void reproducir() {
        if (!premium) {
            System.out.println("Acceso denegado: necesitas cuenta premium.");
        } else {
        	componente.reproducir();
        }
    }
}

