package com.cursopatrones.solid.buena.cliente;

import com.cursopatrones.solid.buena.streaming.Reproductor;

public class GestorReproductor {
	Reproductor reproductor;
	
	public GestorReproductor(Reproductor reproductor) {
		this.reproductor = reproductor;
	}

	void reproducir() {
		reproductor.reproducir();
		
	}
}
