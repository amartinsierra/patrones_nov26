package com.patrones.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Documento {
    private final List<Palabra> palabras = new ArrayList<>();

    public void agregarPalabra(String texto) {
        Palabra palabra = PalabraFactory.getPalabra(texto);
        palabra.mostrar();
        palabras.add(palabra);
    }

    public int contarPalabras() {
        return palabras.size();
    }

}
