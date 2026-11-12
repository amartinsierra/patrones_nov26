package com.patrones.estructurales.streaming.fachada;


import com.patrones.estructurales.streaming.composite.ComponenteReproducible;
import com.patrones.estructurales.streaming.composite.ListaReproduccion;
import com.patrones.estructurales.streaming.composite.Pelicula;
import com.patrones.estructurales.streaming.composite.Serie;
import com.patrones.estructurales.streaming.flyweight.Factory;
import com.patrones.estructurales.streaming.flyweight.Recurso;
import com.patrones.estructurales.streaming.proxy.ProxyPelicula;

public class StreamingFachada {
    public ComponenteReproducible crearPelicula(String titulo, String subt, String aud, boolean premium) {
        Recurso subtitulos = Factory.getRecurso(subt);
        Recurso audio = Factory.getRecurso(aud);
        Pelicula pelicula = new Pelicula(titulo, subtitulos, audio);
        
        //return pelicula;
        //***opción por si queremos utilizar proxy
       return new ProxyPelicula(pelicula, premium);
    }
    public ComponenteReproducible crearSerie(String titulo, int temporada, String subt, String aud) {
        Recurso subtitulos = Factory.getRecurso(subt);
        Recurso audio = Factory.getRecurso(aud);
        if(temporada<1) {
        	throw new RuntimeException("temporada no válida");
        }
        return new Serie(titulo, subtitulos, audio,temporada);
    }

    public ComponenteReproducible crearLista(String nombre, ComponenteReproducible... elementos) {
        ListaReproduccion lista = new ListaReproduccion(nombre);
        for (ComponenteReproducible e : elementos) {
            lista.agregar(e);
        }
        return lista;
    }
}
