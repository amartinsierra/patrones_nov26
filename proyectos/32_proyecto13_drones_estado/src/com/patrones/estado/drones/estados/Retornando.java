package com.patrones.estado.drones.estados;

import com.patrones.estado.drones.controller.Controlador;

public class Retornando implements Estado {

	@Override
	public void despegar(Controlador controlador) {
		System.out.println("No puede despegar cuando está retornando");

	}

	@Override
	public void aterrizar(Controlador controlador) {
		System.out.println("Aterrizando!");
		controlador.setEstado(new EnTierra());
	}

	@Override
	public void reconocimiento(Controlador controlador) {
		System.out.println("Vuelve a realizar reconocimiento");
		controlador.setEstado(new EnVuelo());
	}

	@Override
	public void regresar(Controlador controlador) {
		System.out.println("Ya está regresando");

	}
	/*public void handleCommand(String command, Controlador controlador) {
	switch (command.toLowerCase()) {
		case "aterrizar":
			System.out.println("Aterrizando!");
			controlador.setEstado(new EnTierra());
			break;
		case "reconocimiento":
			System.out.println("Reconociendo!");
			controlador.setEstado(new EnVuelo());
			break;
		
		default:
			System.out.println("Comando no reconocido en estado Retornando");
		}
	}*/

}
