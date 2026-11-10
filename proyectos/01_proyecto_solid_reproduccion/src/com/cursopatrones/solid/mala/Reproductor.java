package com.cursopatrones.solid.mala;

public class Reproductor {
	public void reproducirMusica(String archivo) {
        System.out.println("Reproduciendo música: " + archivo);
    }

    public void reproducirVideo(String archivo) {
        System.out.println("Reproduciendo video: " + archivo);
    }

    // Métodos de descarga metidos aquí (mala práctica)
    public void descargarArchivo(String archivo) {
        System.out.println("Descargando archivo: " + archivo);
    }

    // Lógica de pago
    public void procesarPago(String usuario, double cantidad) {
        System.out.println("Procesando pago de " + cantidad + "€ para " + usuario);
    }

    public static void main(String[] args) {
        Reproductor r = new Reproductor();
        r.reproducirMusica("cancion.mp3");
        r.reproducirVideo("pelicula.mp4");
        r.descargarArchivo("cancion.mp3");
        r.procesarPago("Ana", 9.99);
    }

}
