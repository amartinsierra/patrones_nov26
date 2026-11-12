package com.patrones.estructurales.streaming.cliente;

import com.patrones.estructurales.streaming.composite.ComponenteReproducible;
import com.patrones.estructurales.streaming.fachada.StreamingFachada;

public class Demo {
	public static void main(String[] args) {
        StreamingFachada facade = new StreamingFachada();

        // Crear películas con recursos compartidos (Flyweight)
        ComponenteReproducible matrix = facade.crearPelicula("Matrix", "Español", "Inglés", true);
        ComponenteReproducible lotr = facade.crearPelicula("El Señor de los Anillos", "Español", "Inglés", false);
        ComponenteReproducible serie = facade.crearSerie("Perdidos", 2,"Español", "Inglés");

        // Crear lista de reproducción (Composite)
        ComponenteReproducible lista = facade.crearLista("Favoritas", matrix, lotr,serie);

        // Reproducir lista completa
        lista.reproducir();
    }


}
