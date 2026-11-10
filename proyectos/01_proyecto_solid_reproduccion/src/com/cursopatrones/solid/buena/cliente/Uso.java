package com.cursopatrones.solid.buena.cliente;

import com.cursopatrones.solid.buena.streaming.Musica;
import com.cursopatrones.solid.buena.streaming.Podcast;
import com.cursopatrones.solid.buena.utilities.GestorDescargas;

public class Uso {

	public static void main(String[] args) {
		Musica musica=new Musica("micancion.mp3");
		Podcast podcast=new Podcast("npodcast");
		
		new GestorReproductor(musica).reproducir();
		new GestorReproductor(podcast).reproducir();
		var gestionDescargas=new GestorDescargas();
		gestionDescargas.descargar("Descargando música: "+musica.getArchivo());
		
	}
	
	

}
