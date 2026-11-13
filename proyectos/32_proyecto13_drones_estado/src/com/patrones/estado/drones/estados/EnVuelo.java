package com.patrones.estado.drones.estados;

import com.patrones.estado.drones.controller.Controlador;

public class EnVuelo implements Estado {

	@Override
	public void despegar(Controlador controlador) {
		System.out.println("No puede despegar estando en vuelo");

	}

	@Override
	public void aterrizar(Controlador controlador) {
		System.out.println("No puede aterrizar estando en vuelo");

	}

	@Override
	public void reconocimiento(Controlador controlador) {
		System.out.println("Realizando reconocimiento!"); //no cambia de estado

	}

	@Override
	public void regresar(Controlador controlador) {
		System.out.println("Regresando!");
		controlador.setEstado(new Retornando());
	}
	/*public void handleCommand(String command, Controlador controlador) {
	switch (command.toLowerCase()) {
		case "regresar":
			System.out.println("Regresando!");
			controlador.setEstado(new Retornando());
			break;
		case "reconocimiento":
			System.out.println("Reconociendo!");
			break;
		
		default:
			System.out.println("Comando no reconocido en estado EnVuelo");
		}
	}*/
}
